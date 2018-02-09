/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classdemo;

/**
 *
 * @author tusshar
 */
public class ClassDemo {

    int x= 10000;
    int y =20000;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        System.out.println("Program Start");
        ClassDemo obj1= new ClassDemo();
        obj1.sum();
       System.out.println("value of X is"+obj1.x);
       System.out.println("value of Y is "+obj1.y);
        System.out.println("Program End");
        
    }
    
    public void  sum()
    {
        int a=99;
        int b=1;
        int c=a+b;
        System.out.println("addition of A and B is "+c);
        
    }
}
