import java.io.*;

/**
 * Created by student on 11/27/17.
 */
public class Main {

    public int length(Object[] obj){
        int length = 0;
        for (Object i: obj) {
            length++;
        }
        return length;
    }

    public Object clone(Object obj){
        File file = new File("/scripts/Elements.txt");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return obj;
    }

}
