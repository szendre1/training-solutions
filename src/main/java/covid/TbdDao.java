package covid;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.*;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TbdDao {


    // Alap adatbázis megadása
    public MariaDbDataSource setDatasource(MariaDbDataSource dataSource) {
        try {
            dataSource.setUrl("jdbc:mariadb://localhost:3306/covid?useUnicode=true");
            dataSource.setUser("covid");
            dataSource.setPassword("covid");
        } catch (SQLException se) {
            throw new IllegalArgumentException("Database opening error", se);
        }
        return dataSource;
    }





    // Település lekérése irányítószámból
    public String readCity(String zip, MariaDbDataSource dataSource) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement("SELECT `city` FROM `cities` WHERE `zip` = "+zip+" LIMIT 1;");
        ) {
            List<Citizen> result = new ArrayList<>();
            //ps.setLong(1, 1L);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {

                    return rs.getString("city");
                }
                return "";
            }
        } catch (SQLException e) {
            throw new IllegalArgumentException("Cannot insert", e);
        }
    }

    // lista adat rögzítése!
    public void insertDataList(List<Citizen> citizens, MariaDbDataSource dataSource) {
        for (Citizen citizen : citizens) {
            insertData(citizen, dataSource);
        }
    }


    // adat rögzítése visszaadott id-vel!
    public long insertData(Citizen citizen, MariaDbDataSource dataSource) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement
                     ("insert into citizens(citizen_name,zip,age,email,taj,number_of_vaccination,last_vaccination) values (?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS)) {
            //System.out.println(citizen.getName());
            stmt.setString(1, citizen.getName());
            stmt.setString(2, citizen.getZip());
            stmt.setLong(3, citizen.getAge());
            stmt.setString(4, citizen.getEmail());
            stmt.setString(5, citizen.getTaj());
            stmt.setLong(6, citizen.getNumberOfVaccination());
            stmt.setTimestamp(7, Timestamp.valueOf(citizen.getLast_vaccination()));
            stmt.executeUpdate();
            try (ResultSet rs = stmt.getGeneratedKeys()) {
                if (rs.next()) {
                    return rs.getLong(1);
                }
                throw new IllegalStateException("Cannot get id");
            } catch (SQLException e) {
                throw new IllegalStateException("Cannot get id", e);
            }
        } catch (SQLException e) {
            throw new IllegalArgumentException("Cannot insert", e);
        }
    }


    // lista kiolvasása
    public List<Citizen> readData(String zip, MariaDbDataSource dataSource) {

        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement("SELECT * FROM `citizens` WHERE ((`zip` = " + zip + ") AND (number_of_vaccination <1)) ORDER BY `age` DESC, citizen_name;");
        ) {
            List<Citizen> result = new ArrayList<>();
            //ps.setLong(1, 1L);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next() && result.size() < 16) {
                    Citizen citizen = new Citizen();
                    citizen.setName(rs.getString("citizen_name"));
                    citizen.setZip(rs.getString("zip"));
                    citizen.setAge(rs.getInt("age"));
                    citizen.setEmail(rs.getString("email"));
                    citizen.setTaj(rs.getString("taj"));
                    citizen.setNumberOfVaccination(rs.getInt("number_of_vaccination"));
                    citizen.setLast_vaccination(rs.getTimestamp("last_vaccination").toLocalDateTime());
                    if (citizen.getNumberOfVaccination() == 0 ||
                            (citizen.getNumberOfVaccination() == 1) && (15 < Duration.between(citizen.getLast_vaccination(), LocalDateTime.now()).toDays())) {
                        result.add(citizen);
                    }
                }
                return result;
            }
        } catch (SQLException e) {
            throw new IllegalArgumentException("Cannot insert", e);
        }
    }
}



