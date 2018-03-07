/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpb;

/**
 *
 * @author Apsalboy
 */
public class sekutuTerbesar {
public void FPB(int a, int b)
{
    int hasil=0;
    int r = a%b;
    if (r==0)hasil=b;
    else
    {
        while(r!=0)
        {
            a=b;
            b=r;
            r=a%b;
            hasil=b;
        }
    }
    System.out.println("faktor persekutuan terbesarnya = "+hasil);
}
}
