/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package youtube_java;

/**
 *
 * @author Kavindu Hashan
 */
public class parameters 
{
    public static void main(String[] args) 
    {
        parameters p = new parameters();//non-static methods call krddi obj hdnn one
        p.firstmethod("Kavindu");
    }
    
    public void firstmethod(String name) //non-static method
    {
        System.out.println("Hello " + name);
    }
    
}
