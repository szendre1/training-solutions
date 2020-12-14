package week08d01;

public class Robot {
    private int coordX;
    private int coordY;

    public Robot(int coordX, int coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
    }

    public Robot Move(String moveStr) {
        for (int x = 0; x < moveStr.length(); x++) {
            char moveChar = moveStr.charAt(x);
            switch (moveChar) {
                case 'F' -> {
                    coordY++;
                }
                case 'L' -> {
                    coordY--;
                }
                case 'B' -> {
                    coordX--;
                }
                case 'J' -> {
                    coordX++;
                }
                default -> {
                    throw new IllegalArgumentException("Érvénytelen irány");
                }
            }
        }
        return new Robot(coordX,coordY);
    }

    public int getCoordX() {
        return coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    public static void main(String[] args) {
        Robot robot = new Robot(0, 0);
        Robot newCord = robot.Move("FFLLLLLBBBBJJJJJJJ");
        System.out.println("X: "+newCord.getCoordX()+" Y:"+ newCord.getCoordY());
    }
}
