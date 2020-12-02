package immutable;

public class Satellite {

    CelestialCoordinates destinationCoordinates;
    CelestialCoordinates diff = new CelestialCoordinates(0,0,0);
    String registerIdent;

    public Satellite(CelestialCoordinates destinationCoordinates, String registerIdent) {
        if (registerIdent==null || registerIdent.trim().equals("")){
            throw new IllegalArgumentException("Register ident must not be empty!");
        }
        this.destinationCoordinates = destinationCoordinates;
        this.registerIdent = registerIdent;
    }

    public void modifyDestination(CelestialCoordinates diff){
        this.diff = diff;
    }

    public String toString(){
        return ""+this.registerIdent+": CelestialCoordinates: "+
                "x="+(this.destinationCoordinates.getX()+this.diff.getX())+", "+
                "y="+(this.destinationCoordinates.getY()+this.diff.getY())+", "+
                "z="+(this.destinationCoordinates.getZ()+this.diff.getZ());
    }


}
