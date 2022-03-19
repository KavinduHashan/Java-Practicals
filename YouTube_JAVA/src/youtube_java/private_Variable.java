/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package youtube_java;

/**
 *
 * @author Kavindu Hashan
 */
public class private_Variable 
{
    public static void main(String[] args) 
    {
        private_Variable p = new private_Variable(); //non-static methods call krnn
        p.getName("Kavindu");
        p.output();
    }
    
    private String name; //private variable declarating    
    public void getName(String n)
    {
       name = n; 
    }    
    public String setName()
    {
        return name;
    }
    public void output()
    {
        System.out.println("My name is " + setName());
    }
}


