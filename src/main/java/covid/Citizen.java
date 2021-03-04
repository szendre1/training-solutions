package covid;

import java.time.LocalDateTime;

public class Citizen {
    private String name;
    private String zip;
    private int age;
    private String email;
    private String taj;
    private int numberOfVaccination = 0;
    private LocalDateTime last_vaccination = LocalDateTime.of(1800,01,01,0,0);

    public Citizen() {
    }



    public Citizen(String name, String zip, int age, String email, String taj) {
        if (checkName(name)) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Érvénytelen név");
        }

        if (checkZip(zip)) {
            this.zip = zip;
        } else {
            throw new IllegalArgumentException("Érvénytelen zip");
        }

        if (checkAge(age)) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Érvénytelen életkor");
        }

        if (checkEmail(email)) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Érvénytelen email");
        }

        if (checkTaj(taj)) {
            this.taj = taj;
        } else {
            throw new IllegalArgumentException("Érvénytelen taj");
        }
    }


    public boolean checkName(String name) {
        return (name != null && name.length() > 0);
    }

    public boolean checkZip(String zip) {
        return (zip != null) && (zip.length() == 4) &&
                zip.replaceAll("[0-9]", "").equals("");
    }

    public boolean checkAge(int age) {
        return (age > 10) && (age < 150);
    }

    public boolean checkEmail(String email) {
        //System.out.println(mail);
        if (email == null) {
            return false;
        }
        if ((email.length() > 5) && (email.contains("@"))){
            return true;
        }
        return false;
    }

    public boolean checkTaj(String taj) {
        if (taj.length() == 9) {
            int cdv = 0;
            for (int t = 0; t < 8; t++) {
                if (t % 2 == 0) {
                    cdv += Character.getNumericValue(taj.charAt(t)) * 3;
                } else {
                    cdv += Character.getNumericValue(taj.charAt(t)) * 7;
                }
            }
            cdv = cdv % 10;
            //System.out.println(cdv);
            return (cdv == Character.getNumericValue(taj.charAt(8)));
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public String getZip() {
        return zip;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getTaj() {
        return taj;
    }

    public int getNumberOfVaccination() {
        return numberOfVaccination;
    }

    public LocalDateTime getLast_vaccination() {
        return last_vaccination;
    }

    public void setName(String name) {
        if (checkName(name)) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Érvénytelen név");
        }
    }

    public void setZip(String zip) {
        if (checkZip(zip)) {
            this.zip = zip;
        } else {
            throw new IllegalArgumentException("Érvénytelen zip");
        }
    }

    public void setAge(int age) {
        if (checkAge(age)) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Érvénytelen életkor");
        }
    }


    public void setEmail(String email) {
        if (checkEmail(email)) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Érvénytelen email");
        }
    }

    public void setTaj(String taj) {
        if (checkTaj(taj)) {
            this.taj = taj;
        } else {
            throw new IllegalArgumentException("Érvénytelen taj");
        }
    }

    public void setNumberOfVaccination(int numberOfVaccination) {
        this.numberOfVaccination = numberOfVaccination;
    }

    public void setLast_vaccination(LocalDateTime last_vaccination) {
        this.last_vaccination = last_vaccination;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "name='" + name + '\'' +
                ", zip='" + zip + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", taj='" + taj + '\'' +
                '}';
    }
}

