/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package background;

import java.util.List;

/**
 *
 * @author TRAN VAN TRI
 */
public interface dao {

    List<sourceOFmilktea> readDataFromFile(String fileName);

    boolean writeDataToFile(List<sourceOFmilktea> sOf, String fileName);
}
