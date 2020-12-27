package interfacedefaultmethods.print;

import java.util.ArrayList;
import java.util.List;

public class StoryBook implements Printable {

    private List<ColoredPage> pages = new ArrayList<>();

    public void addPage(String page, String color){
        pages.add(new ColoredPage(page,color));
    }


    @Override
    public int getLength() {
        return pages.size();
    }

    @Override
    public String getPage(int pageNr) {
        return pages.get(pageNr).getPage();
    }

    @Override
    public String getColor(int pageNr) {
        return pages.get(pageNr).getPageColor();
    }
}
