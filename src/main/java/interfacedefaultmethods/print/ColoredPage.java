package interfacedefaultmethods.print;

public class ColoredPage {
    private String pageTitle;
    private String pageColor;

    public ColoredPage(String pageTitle, String pageColor) {
        this.pageTitle = pageTitle;
        this.pageColor = pageColor;
    }

    public String getPage() {
        return pageTitle;
    }

    public String getPageColor() {
        return pageColor;
    }
}
