package interfacedefaultmethods.print;

import java.util.ArrayList;
import java.util.List;

public class NewsPaper implements Printable {
    List<String> pageTitles=new ArrayList<>();

    public void addPage(String page){
        pageTitles.add(page);
    }

    @Override
    public int getLength() {
        return pageTitles.size();
    }

    @Override
    public String getPage(int pageNr) {
        return pageTitles.get(pageNr);
    }
//
}
