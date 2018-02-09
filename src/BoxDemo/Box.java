/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BoxDemo;

/**
 *
 * @author tusshar
 */
public class Box {
    double width;
    double height;
    double depth;
    
}


class BoxDemo
{
 public static void main(String []args)
 {
     Box obj = new Box();
     Box obj1 = new Box();
             
     double vol;
     
     obj.width=10;
     obj.height=20;
     obj.depth=30;
     
     obj1.depth=2;
     obj1.height=2;
     obj1.width=2;
     
     
     vol=obj.height*obj.width*obj.depth;
     System.out.println("Volume of Box is "+vol);
     vol=obj1.depth*obj1.height*obj1.width;
     System.out.println("Vloume of Box 2 is "+vol);
     
 }
}