package immutable;

import java.util.ArrayList;
import java.util.List;

public class SpaceAgency {
    private List<Satellite> satellites = new ArrayList();

    public void registerSatellite(Satellite satellite){
        if (satellite==null){
            throw new NullPointerException("Parameter must not be null!");
        }
        satellites.add(satellite);
    }


    public Satellite findSatelliteByRegisterIdent(String registerIdent){
        for (Satellite x:satellites){
            if (x.registerIdent.equals(registerIdent)){
                return x;
            }
        }
        throw new IllegalArgumentException("Satellite with the given registration cannot be found!"+registerIdent);
    }

    public String toString(){
        StringBuilder sb= new StringBuilder("");
        sb.append("[");
        for (Satellite x:satellites) {
            sb.append(x.toString()+", ");
        }
        sb.replace(sb.length()-2,sb.length()-0,"]");
        return sb.toString();
    }

    public String toString(Satellite satellite){
        return  ""+satellite.toString();
    }

}
