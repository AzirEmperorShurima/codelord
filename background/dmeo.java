/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package background;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author TRAN VAN TRI
 */
public class dmeo {

    public static void main(String[] args) throws IOException {
        int h = 0;
//        String line;
//List<String> list = new ArrayList();
//BufferedReader bufferedReader = new BufferedReader(new FileReader("milktea.txt"));
//
//while((line = bufferedReader.readLine()) != null) {
//  String arr[] = line.split(" ");
//  for (int i = 0; i < arr.length; i++) {
//      if(arr[i].contains("\\"))
//      list.add(arr[i].substring(arr[i].indexOf("\\") + 1));
//      System.out.println(""+arr[i]);
//  }

        //}}
        String[] ST = new String[100];
        int[] st = new int[100];
        String f;
        
            Scanner sc = new Scanner(new FileReader("milktea.txt"));
            while (sc.hasNext()) {
                f = sc.nextLine();
               String []s = f.split(" ");
              //  System.out.println(" " + f);
                for( int i =0;i<6;i++){
                   
                System.out.println(" "+s[i]);
            }
            }
        }

    }

