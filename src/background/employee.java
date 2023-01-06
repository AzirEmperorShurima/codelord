
package background;

import java.io.File;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author TRAN VAN TRI
 */
public class employee implements Serializable{
    private String name;
    private String pass;
    private String status;
    
    public String getname(){
        return name;
    }
    public String getpass(){
        return pass;
    }
    public String getstatus(){
        return status;
    }
    public void setname(String name){
        this.name = name;
    }
    public void setpass(String pass){
        this.pass = pass;
    }
    public void setstatus(String status){
        this.status = status;
    }
  /*  public void saveinformation(ArrayList<employee> list ){
        try (PrintWriter p = new PrintWriter(new File("source_employee.txt"))){
            for (employee s : list) {
                p.println(s.getname());
                p.println(s.getpass());
                p.println(s.getstatus());
            }
        } catch (Exception e) {
            System.out.println(" error");
        }
    }
    public ArrayList<employee> readinf(){
        ArrayList<employee> list = new ArrayList<>();
        try (Scanner sc = new Scanner(new File("source_employee.txt")) ){
            while(sc.hasNext()){
                employee e = new employee();
                e.setname(sc.nextLine());
                e.setpass(sc.nextLine());
                e.setstatus(sc.nextLine());
                list.add(e);
            }
        } catch (Exception e) {
            
        }
        return list;
    }*/
   
    
}
