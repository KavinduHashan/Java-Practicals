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

public class JOptionPane_userInput_sum 
{
    public static void main(String[] args) 
    {
        String no1 = JOptionPane.showInputDialog("Enter first Number ");
        int n1 = Integer.parseInt(no1); // convert to int
        String no2 = JOptionPane.showInputDialog("Enter second Number ");        
        int n2 = Integer.parseInt(no2); // convert to int
        int sum = n1+n2;        
        JOptionPane.showMessageDialog(null, "Sum is " + sum);
    }    
}
