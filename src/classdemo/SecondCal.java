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
public class SecondCal {

    public static void main(String []args)
    {
        Calculator obj1 = new Calculator();
        obj1.sum();
        obj1.sub();
        System.out.println("Your name is "+obj1.name);
        System.out.println("Your Hobby is "+obj1.hobby);
    }
}
