/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn;

import java.util.*;


/**
 *
 * @author yinruyi
 */
public class Learn {

    /**
     * @param args the command line arguments
     */
    static int j =9;
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a;
        a = new int[5];
        int i;
        System.out.println(Arrays.toString(a));
        for(i=1 ; i<5 ; i++) {
            a[i] = i;
        }
        System.out.println(Arrays.toString(a));
        System.out.println(zhishu(101));
        
        
        }
    private static int fun(int a , int b){
        int c;
        c = a/b;
        if(a==b*c)
            return 1;
        else
            return 0;      
    }
    
    private static int zhishu(int a) {
        int i;
        for(i=2 ; i<a ; i++){
            if(fun(a , i)==1)
                return 0;
        }
        return 1;
    }
    
    
        
}
    


class TT {}