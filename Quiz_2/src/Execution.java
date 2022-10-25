import demo8.ItemListenerExample;
import demo8.MouseListenerExample;

import javax.swing.JFrame;
import java.awt.*; 
import javax.swing.*;
import java.awt.event.*;

public class Execution {

      public static void main(String[] args) 
      { 
    	  // Execution de l'exercice 1 
    	  
         MouseListenerExample frame = new MouseListenerExample();
         frame.setTitle(" Mouse Listener Java Swing Example"); 
         frame.setBounds(100,200,500,300); 
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
         frame.setVisible(true); 
    	  
         
      // Execution de l'exercice 2 
         
    	  ItemListenerExample frame_item = new ItemListenerExample();
    	  frame_item.setTitle("ItemListener Java Example"); 
    	  frame_item.setBounds(200,150,180,150); 
    	  frame_item.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    	  frame_item.setResizable(false); 
    	  frame_item.setVisible(true); 
      } 

}









//frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); 
