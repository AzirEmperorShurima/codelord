
package background;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author TRAN VAN TRI
 */
public class ControllerImp implements dao{

    @Override
    public List<sourceOFmilktea> readDataFromFile(String fname) {
        List<sourceOFmilktea> sOf = new ArrayList<>();
        File file = new File(fname);
        try {
            Scanner sc = new Scanner(file);
            while(sc.hasNext()){
                String name = sc.next();
                String type = sc.next();
                double costs = Double.parseDouble(sc.next());
                int nums =  Integer.parseInt(sc.next());
                sourceOFmilktea s = new sourceOFmilktea(name, type, costs,nums);
                sOf.add(s);
            }
        } catch (FileNotFoundException ex) {
             ex.printStackTrace();
        }
        return sOf;
    }
    @Override
    public boolean writeDataToFile(List<sourceOFmilktea> sOf, String fname) {

        return false;
    }
    
}
