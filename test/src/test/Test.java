/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import com.human.*;
/**
 *
 * @author yinru
 */
public class Test {

    /**
     * @param args the command line arguments
     */
	static double k = 10;
    public static void main(String[] args) {
        // TODO code application logic here
    	String s = "ss";
    	System.out.println(s);
    	float a = 102.22f;
    	System.out.println(a);
    	double b = 102.22;
    	System.out.println((int)b);
    	int[] aa = {1,2,3};
    	System.out.println(aa[1]);
    	int bb = 1;
    	if( bb == 1){
    		System.out.println("aaaaaaaaa");
    	}
    	String ss = "absc";
    	System.out.println(k);
        //Human aPerson = new Human();
        //System.out.println(aPerson.getHeight());
        //aPerson.growHeight(10);
        //System.out.println(aPerson.getHeight());
    	System.out.println(testSwitch(0));
    	Person tom = new Person(1,10);
    	System.out.println(tom.id);
    	
    }
    public static int OddSum(){
    	int sum = 0;
		for(int i=1 ; i<100 ; i = i + 2 ) {
			sum += i;
		}
    	return sum;
    	
    }
    
    private static int storage(String s){
    	int i = 8;
    	if (i<10){
    		return s.length()*20;
    	}else{
    		return s.length() *2;
    	}
    	
    }
    
    public static int testSwitch(int s){
    	int tt;
    	switch(s){
    	case 0:
    		tt = 1;
    		break;
    	case 1:
    		tt = 2;
    		break;
    	default:
    		tt = 3;
    	}
    	return tt;
    }
    
}

class Person{
	public int id;
	private int age;
	public Person(int _id, int _age){
		id = _id;
		age = _age;
		
	}
}


