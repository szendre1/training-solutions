package interfacedefaultmethods.print;

public interface Printable {

    String BLACK = "#000000";

    int getLength();

    String getPage(int pageNr);

    default String getColor(int pageNr) {
        return BLACK;
    }
//

}
