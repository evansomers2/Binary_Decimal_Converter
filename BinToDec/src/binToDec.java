/**
    * Program Name: 	binToDec
    * Purpose:			To convert binary to decimal or decimal to binary
    * Author:			Evan Somers
    * Date:				December 4th, 2018
    **/

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class binToDec {


    
    public static void main(String[] args) throws IOException
    {

    	//new jframe object
        final JFrame frame = new JFrame();
        
        //set title of program window
        frame.setTitle("Binary and Decimal Converter");
        
        //set frame size
        frame.setSize(new Dimension(800, 200));
        
        //new button objects
        JButton button1 = new JButton("Extra");
        JButton button2 = new JButton("");
        
        //new grid layout object
        GridLayout grid = new GridLayout(0,2);
        
        //set frame to grid layout
        frame.setLayout(grid);
        
        //new font object
        Font font = new Font("SansSerif", Font.BOLD, 24);
        
        //new labels
        JLabel label = new JLabel("Decimal:",SwingConstants.CENTER);
        JLabel label2 = new JLabel("Binary:",SwingConstants.CENTER);
        JLabel label3 = new JLabel("",SwingConstants.CENTER);
        JLabel label4 = new JLabel("",SwingConstants.CENTER);
        JLabel labelTitle1 = new JLabel("Binary to Decimal",SwingConstants.CENTER);
        JLabel labelTitle2 = new JLabel("Decimal to Binary",SwingConstants.CENTER);
        
        //new text fields
        JTextField textField = new JTextField("",10);
        JTextField textField2 = new JTextField("",10);
        
        
        //makes sure that text entered in text field is centered
        textField.setHorizontalAlignment(JTextField.CENTER);
        textField2.setHorizontalAlignment(JTextField.CENTER);
        
        //new border object 
        Border bGreyLine = BorderFactory.createLineBorder(Color.WHITE, 1, true);
        
        //set borders on text fields
        textField.setBorder(javax.swing.BorderFactory.createTitledBorder(bGreyLine, "Enter Binary", TitledBorder.CENTER, TitledBorder.BOTTOM, new Font("times new roman",Font.PLAIN,15), Color.WHITE));
        textField2.setBorder(javax.swing.BorderFactory.createTitledBorder(bGreyLine, "Enter Decimal", TitledBorder.CENTER, TitledBorder.BOTTOM, new Font("times new roman",Font.PLAIN,15), Color.WHITE));
        
        //setting all text to font object
        textField.setFont(font);
        textField2.setFont(font);
        button1.setFont(font);
        button2.setFont(font);
        label.setFont(font);
        label2.setFont(font);
        labelTitle1.setFont(font);
        labelTitle2.setFont(font);
        label3.setFont(font);
        label4.setFont(font);
        
        //this allows background color to be changed
        label.setOpaque(true);
        label2.setOpaque(true);
        label3.setOpaque(true);
        label4.setOpaque(true);
        labelTitle1.setOpaque(true);
        labelTitle2.setOpaque(true);
        
        //set colors (Foreground is text color and Background is object color)
        labelTitle1.setForeground(Color.WHITE);
        labelTitle2.setForeground(Color.WHITE);
        labelTitle1.setBackground(Color.BLACK);
        labelTitle2.setBackground(Color.BLACK);
        textField.setForeground(Color.WHITE);
        textField2.setForeground(Color.WHITE);
        textField.setBackground(Color.BLACK);
        textField2.setBackground(Color.BLACK);
        label.setForeground(Color.WHITE);
        label2.setForeground(Color.WHITE);
        label.setBackground(Color.BLACK);
        label2.setBackground(Color.BLACK);
        label3.setForeground(Color.WHITE);
        label4.setForeground(Color.WHITE);
        label3.setBackground(Color.BLACK);
        label4.setBackground(Color.BLACK);
        
        
        
        //add all to the frame
        frame.add(labelTitle1);
        frame.add(labelTitle2);
        frame.add(textField);
        frame.add(textField2);
        frame.add(label3);
        frame.add(label4);
        frame.add(label);
        frame.add(label2);
        
        //pack the frame, center the frame, set frame to visible, set default close and set resizable to true
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        
        
        //action listener for first text field
        textField.addActionListener(new AbstractAction()
        {
				private static final long serialVersionUID = 1L;

				@Override
				public void actionPerformed(ActionEvent arg0)
				{
					try
	            	{
						//sets label below text field and clears text field
						//BIN EASTER EGG
	            		String number1 = textField.getText();
	            		label3.setText(number1);
	            		if(number1.equalsIgnoreCase("bin"))
	            		{
	            			try
	            			{
	            				image("s1.png");
	            			}
	            			
	            			catch(IOException e)
	            			{
	            				
	            			}
	            		}
	            		else if(number1.equalsIgnoreCase("hex"))
	            		{
	            			try
	            			{
	            				image("hex.jpg");
	            			}
	            			
	            			catch(IOException e)
	            			{
	            				
	            			}
	            		}
	                	label.setText(String.valueOf(Integer.parseInt(number1,2)));
	                	textField.setText("");
	            	}
	            	catch(NumberFormatException exc)
	            	{
	            		textField.setText("");
	            		label.setText("Error");
	            		
	            	}
				}
        });
        
        //action listener for second text field
        textField2.addActionListener(new AbstractAction()
        {
				private static final long serialVersionUID = 1L;

				@Override
				public void actionPerformed(ActionEvent arg0)
				{
					try
	            	{
	            		int number2 = Integer.parseInt(textField2.getText());
	            		label4.setText(String.valueOf(number2));
	                	label2.setText(String.valueOf(Integer.toBinaryString(number2)));
	                	textField2.setText("");
	                }
	            	
	            	catch(NumberFormatException exc)
	            	{
	            		String number2 = textField2.getText();
	            		if(number2.equalsIgnoreCase("quit"))
	            		{
	            			System.exit(0);
	            		}
	            		else if(number2.equalsIgnoreCase("evan"))
	            		{
	            			try
							{
								evan();
							} catch (IOException e)
							{
								label2.setText("Error");
							}
	            		}
	            		else if(number2.equalsIgnoreCase("calc"))
	            		{
	            			try
							{
								calc();
							} catch (IOException e)
							{

								label2.setText("error");
							}
	            		}
	            		label4.setText(String.valueOf(number2));
	            		textField2.setText("");
	            		label2.setText("Error");
	            	}
				}
        });
    }
    
    /**
    * Method Name: 	image
    * Purpose:		method to show an image in a JFrame using ImageIcon
    * Parameters:	no parameters
    * Return:		void
    **/
    public static void image(String img) throws IOException
    {
    	//start a new frame and show image
    	String arg = img;
    	JFrame image = new JFrame();
		JPanel panel = new JPanel(); 
		panel.setSize(500,640);
		panel.setBackground(Color.CYAN); 
		ImageIcon icon = new ImageIcon(arg); 
		JLabel label = new JLabel(); 
		label.setIcon(icon); 
		panel.add(label);
		image.add(panel);
		image.pack();
        image.setLocationRelativeTo(null);
        image.setVisible(true);
        image.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        image.setResizable(true);
    }
    

    /**
    * Method Name: 	evan
    * Purpose:		This method displays information on the writer of this program
    * 				it is an easter egg
    * Parameters:
    * Return:		void
    **/
    public static void evan() throws IOException
    {
    	//start a new frame and show image
    	
    	JFrame image = new JFrame();
		JPanel panel = new JPanel(); 
		panel.setSize(500,640);
		panel.setBackground(Color.BLACK); 
		 
		JLabel label = new JLabel();
		label.setText("This program was written by Evan Somers, December 4th, 2018"); 
		label.setForeground(Color.WHITE);
		panel.add(label);
		image.add(panel);
		image.pack();
        image.setLocationRelativeTo(null);
        image.setVisible(true);
        image.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        image.setResizable(true);
    }
    
    
    /**
    * Method Name: 	calc
    * Purpose:		This method is somewhat of an easter egg, it launches a calculator console in another JFrame
    * Parameters:	no parameters
    * Return:		void
    **/
    public static void calc() throws IOException
    {
    	//start a new frame and show image
    	
    	JFrame calc = new JFrame();
		JPanel panel = new JPanel();
		
		calc.setTitle("Calculator 1.0");
		panel.setSize(new Dimension(500,800));
		calc.setBackground(Color.BLACK); 
		FlowLayout flow = new FlowLayout(FlowLayout.LEFT);
		calc.setLayout(flow);
		calc.setSize(new Dimension(800, 110));
		
		JLabel label = new JLabel("");
		JLabel label2 = new JLabel("=");
		JTextField textField = new JTextField("", 10);
		
		Font font = new Font("SansSerif", Font.BOLD, 35);
		
		textField.setBackground(Color.BLACK);
        textField.setForeground(Color.WHITE);
        label.setForeground(Color.WHITE);
		label2.setForeground(Color.WHITE);
        label.setFont(font);
        textField.setFont(font);
        label2.setFont(font);
		
		
		panel.add(textField);
		panel.add(label2);
		panel.add(label);
		calc.add(panel);
		
		panel.setBackground(Color.BLACK);
		calc.getContentPane().setBackground(Color.BLACK);
		
        calc.setLocation(735, 650);
        calc.setVisible(true);
        calc.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        calc.setResizable(true);
        
        //adds action listener to calculator textField
        textField.addActionListener(new AbstractAction()
        {

        	//use ScriptEngine to evaluate math as a string MUST be appropriate math statement 
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				String s1 = textField.getText();
					
				 ScriptEngineManager mgr = new ScriptEngineManager();
				 ScriptEngine engine = mgr.getEngineByName("JavaScript");
				 
				 try
				{
					label.setText(String.valueOf(engine.eval(s1)));
				} catch (ScriptException e)
				{
					label.setText("Error");
				}				
			}
        });
     
    }
    
}