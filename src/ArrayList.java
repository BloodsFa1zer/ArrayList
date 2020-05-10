
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ArrayList {
    int IndexOfList = 10;
    Integer[] arrayList = new Integer[IndexOfList];

    public void set(int indexOfNum, int number) {
        arrayList[indexOfNum] = number;
        System.out.println(arrayList[indexOfNum]);
    }
    public void remove(int index) {
        arrayList[index] = null;
        System.out.println(arrayList[index]);
    }
    public void get(int index) {
        System.out.println(arrayList[index]);
    }
    public void size() {
        System.out.println(IndexOfList);
    }
    public void add(int n, int index) {
        if (arrayList[index] != null) {
            System.out.println("index is invalid");
            System.exit(0);
        }
        //        if (arrayList[arrayList.length - 1] != null) {
//            Integer[]arrayLists = Arrays.copyOf(arrayList, 100);
//            arrayLists[index] = n;
//            System.out.println(arrayLists[index]);
//        }
        arrayList[index] = n;
        System.out.println(arrayList[index]);
    }


}

