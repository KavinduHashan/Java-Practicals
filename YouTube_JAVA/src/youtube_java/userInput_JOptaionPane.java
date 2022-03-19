/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package youtube_java;

/**
 *
 * @author Kavindu Hashan
 */

import javax.swing.JOptionPane;


public class userInput_JOptaionPane 
{
    public static void main(String[] args) 
    {
        String name = JOptionPane.showInputDialog("Enter Your Name ");
        String age = JOptionPane.showInputDialog("Enter Your Age ");       
        JOptionPane.showMessageDialog(null , "Your name is " + name);
        JOptionPane.showMessageDialog(null , "Your name is " + age);
        
        
    }
}
