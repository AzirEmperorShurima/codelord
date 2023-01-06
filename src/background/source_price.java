/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package background;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TRAN VAN TRI
 */
public class source_price {
     private static final List<String> sprice = new ArrayList<>();
     public static List<String> getsprice(){
         sprice.add("milktea");
         sprice.add("coffee");
         sprice.add("cake");
         return sprice;
     }
}
