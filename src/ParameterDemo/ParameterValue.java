/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParameterDemo;

/**
 *
 * @author tusshar
 */
public class ParameterValue {
    
    public static void main(String []args)
    {
        ParameterValue obj1= new ParameterValue();
        obj1.sum(99, 1);
        obj1.sub(110.12, 10.14);
    }
            
    public void sum(int a ,int b)
    {
        int c = a+b;
        System.out.println("Addition is " +c);
        
    }
    public void sub(double x, double y)
    {
        double result=x-y;
        System.out.println("Subtraction is "+result);
    }
}
