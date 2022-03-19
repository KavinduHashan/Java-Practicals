/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package youtube_java;

/**
 *
 * @author Kavindu Hashan
 */
public class many_method 
{
    public static void main (String args [])
    {
        firstMethod();//static methods nrmal cll krnn puluwn
        
        many_method m = new many_method(); // class ekt obj hda gnnw non-static method cll krnn
        m.secondMethod();
    }
    
    public static void firstMethod() //static method ekk
    {
        System.out.println("This is first method (static)");
    }
    
    public void secondMethod() //non-static method ekk
    {
        System.out.println("This is second method (non-static)");
    }
}
