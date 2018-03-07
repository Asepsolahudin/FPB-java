/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpb;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author Apsalboy
 */
public class Fpb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        sekutuTerbesar sekutu = new sekutuTerbesar();
        int m,n;
        Scanner input = new Scanner(System.in);
        do
        {
            System.out.print("Bilangan pertama = ");
            m=input.nextInt();
            System.out.print("Bilangan kedua = ");
            n=input.nextInt();
        }
        while(m<n);
        sekutu.FPB(m,n);
    }
    
}
