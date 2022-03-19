/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package youtube_java;

/**
 *
 * @author Kavindu Hashan
 */
public class constructors 
{
    public static void main(String[] args) 
    {
        constructors  p = new constructors ("kavi"); //non-static methods call krnn
        
        p.output();
    }
    
    private String name; //private variable declarating    
    public constructors(String n)
    {
       name = n; 
    } 
    /*public void getName(String n)
    {
       name = n; 
    }*/ 
    public String setName()
    {
        return name;
    }
    public void output()
    {
        System.out.println("My name is " + setName());
    }    
}
