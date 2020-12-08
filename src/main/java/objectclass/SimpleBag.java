package objectclass;

import java.util.ArrayList;
import java.util.List;

public class SimpleBag {

    List<Object> objectList = new ArrayList<>();

    private int cursor=0;

    public SimpleBag() {
        }

/*
    public SimpleBag(List<Object> objectList) {
        this.objectList = objectList;
    }


 */

    public void putItem(Object item){
        objectList.add(item);
    }

    public boolean isEmpty(){
        return objectList.isEmpty();
    }

    public int size(){
        return objectList.size();
    }

    public void beforeFirst(){
        cursor=0;
    }

    public boolean hasNext(){
        if (!isEmpty()) {
            return ((cursor < objectList.size() - 1));
        }
        return false;
    }

    public Object next(){
        if (hasNext()){
            cursor++;
        } else cursor=0;
        return objectList.get(cursor);
    }

    public boolean contains(Object item){
        return  objectList.contains(item);
    }

    public int getCursor(){
        return cursor;
    }
}
