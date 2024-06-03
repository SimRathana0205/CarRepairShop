package io.github.james1freedictionary.project.java.CarRepairShop;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author HK Hong
 */
import javax.swing.*;
import javax.swing.border.*;
//import javax.swing.plaf.BorderUIResource;

import java.awt.event.*;
import java.awt.*;

public class Repair_Form extends JFrame implements ActionListener , KeyListener , ItemListener, MouseListener {
    Border text_border,customer_info_Border,Vechile_info_border , custom_Border;
    JPanel title = new JPanel();
    JPanel panel_A = new JPanel();
    JPanel inner_panel_A = new JPanel();                                                                         
    JLabel l_customer = new JLabel("Customer's Name:");JTextField customer_name = new JTextField();
    JLabel l_gender = new JLabel("Gender:");JCheckBox[] cus_gender = new JCheckBox[2];
    JLabel l_cus_ID = new JLabel("ID:"); JTextField customer_ID = new JTextField();
    JLabel l_driver_license_ID = new JLabel("License ID:"); JTextField license_ID = new JTextField();
    JLabel l_contract = new JLabel("Contract Number:"); JTextField contract_number = new JTextField(); 
    JLabel l_email = new JLabel("Email:"); JTextField email = new JTextField();
    //JLabel l_customer_complaints = new JLabel("Complaint:"); JTextPane customer_comp = new JTextPane();
    JLabel customer_complaint = new JLabel("Customer complaint"); JTextArea cus_comp = new JTextArea("Customer Complaint");
    JLabel l_address = new JLabel("Address:"); JTextArea address = new JTextArea();
    JCheckBox[] payment_method =  new JCheckBox[2];
    JLabel l_insurance = new JLabel("Insurance coverage:");JCheckBox[] insurance  = new JCheckBox[2];
    Button b1 = new Button("ADD");
    Button b2 = new Button("Clear form");
    Button b3 = new Button("Exit");  
    //==================panel B components ===================
    JPanel panel_B = new JPanel();
    JLabel l_vechicle_name = new JLabel(" Brand name:"); Choice  country_made = new Choice();
    JLabel l_vechicle_type = new JLabel("Car Type:");    Choice vechicle = new Choice();
    JLabel l_model = new JLabel("Model:");              JTextField car_model = new JTextField();
    JLabel l_color = new JLabel("Color:");              Choice car_color = new Choice();
    JLabel l_production_year = new JLabel("Year:");     Choice car_year = new Choice();
    JLabel l_engine_size = new JLabel("Engine Size:");  JTextField engine_size = new JTextField();
    JLabel l_service_type = new JLabel("Service type");  JCheckBox[] service_type = new JCheckBox[3];  
    JLabel l_check_in_date = new JLabel("Check in Date"); JTextField showDate = new JTextField();
  
                      
    Repair_Form(){//--------------------------------------------------------------------------
     EventListeners();
     MouseListeners();
    // Frame and panels configurations 
    // panel_A.setBackground(Color.blue);
    //panel_B.setBackground(Color.lightGray);
    panel_A.setBounds(0,0, 1300, 350);
    
    panel_B.setBounds(0,360,panel_A.getWidth(),panel_A.getHeight());
    Font set = new Font(Font.DIALOG,Font.PLAIN,14);
    
    GridLayout frame_grid = new GridLayout();
    frame_grid.setColumns(1);
     frame_grid.setRows(2);
         custom_Border = BorderFactory.createEtchedBorder(BevelBorder.LOWERED);
         Vechile_info_border = BorderFactory.createTitledBorder(custom_Border,"Vechile's Information");
         text_border = BorderFactory.createBevelBorder(BevelBorder.LOWERED);
         customer_info_Border = BorderFactory.createTitledBorder(custom_Border,"Customer's information");
                                                 
         panel_A.setBorder(customer_info_Border);
          panel_B.setBorder(Vechile_info_border);
         //  panel_A.setBounds(0,0,1200,500);
         panel_A.setLayout(null);
         panel_B.setLayout(null);
     int y=20;
    //------------------------panel A components and settings------------------------------  
                                               //20 
    l_customer.setBounds         (40,30,140,20);l_customer.setFont(set);
    l_cus_ID.setBounds           (130,70,70,20);l_cus_ID.setFont(set);
    l_gender.setBounds           (102,110,70,20);l_gender.setFont(set);
    l_driver_license_ID.setBounds(85,150,140,20);l_driver_license_ID.setFont(set);
    l_contract.setBounds         (48,190,170,20);l_contract.setFont(set);
    l_email.setBounds            (114,230,100,20);l_email.setFont(set);
    customer_complaint.setBounds (560,190,150,20);  customer_complaint.setFont(set);
      customer_complaint.setCursor(getCursor());     
      cus_gender[0] = new JCheckBox("Male");
      cus_gender[1] = new JCheckBox("Female");
      cus_gender[0].setFont(set);
      cus_gender[1].setFont(set);
      insurance[0] = new JCheckBox("Yes");
      insurance[1] = new JCheckBox("No");  
   
     l_address.setBounds         (93,270,60,20);l_address.setFont(set);
     l_insurance.setBounds        (20,310,140,20);l_insurance.setFont(set);
     // text fields  && checkboxes
     customer_name.setBounds(170,30,250,25);
     customer_ID.setBounds(170,70,250,25);
     cus_gender[0].setBounds(167,110,70,20);
     cus_gender[1].setBounds(237,110,80,20);
     license_ID.setBounds(170,150,250,25);
     contract_number.setBounds(170,190,250,25);
     email.setBounds(170,230,250,25);  
     address.setBounds(170,270,250,25); 
     insurance[0].setBounds(170,310,50,20);insurance[0].setFont(set);   
     insurance[1].setBounds(230,310,50,20);insurance[1].setFont(set);                                    
     cus_comp.setBounds(450,230,300,90);
     cus_comp.setFont(set);
     
     
       
  
     
                                               
     // borders
     customer_name.setBorder(text_border);
     customer_ID.setBorder(text_border);
     cus_gender[0].setBorder(text_border);
     cus_gender[1].setBorder(text_border);
     license_ID.setBorder(text_border);
     email.setBorder(text_border);
     contract_number.setBorder(text_border);
    address.setBorder(text_border);  
     Border  line_Border;
     line_Border = BorderFactory.createBevelBorder(BevelBorder.LOWERED);
        
       cus_comp.setBackground(Color.white);
       cus_comp.setBorder(line_Border);       
     
     ButtonGroup checkboxs = new ButtonGroup();
     checkboxs.add(cus_gender[0]);
     checkboxs.add(cus_gender[1]);
      checkboxs.add(insurance[0]);
      checkboxs.add(insurance[1]);
       
    panel_A.add(l_customer);panel_A.add(customer_name);  
    panel_A.add(l_gender);panel_A.add(cus_gender[0]);panel_A.add(cus_gender[1]);
    panel_A.add(l_cus_ID);panel_A.add(customer_ID);
    panel_A.add(l_driver_license_ID);panel_A.add(license_ID);
    panel_A.add(l_contract);panel_A.add(contract_number);
    panel_A.add(l_email);panel_A.add(email);
    panel_A.add(l_insurance);panel_A.add(insurance[0]);panel_A.add(insurance[1]); 
    panel_A.add(l_address);panel_A.add(address);                                                                     
    panel_A.add(cus_comp);          
    
    //=======================panel_B=================================================
     
        
             
    l_vechicle_name.setBounds(60, 40, 100, 20);l_vechicle_name.setFont(set);
    String country[] ={"Japan","US","Italy","UK","German",}; 
    country_made.add("US");
     
          
    l_vechicle_type.setBounds(80,80,100,20);l_vechicle_type.setFont(set);
    l_model.setBounds(100,120,50,20);l_model.setFont(set);
    l_color.setBounds(100,160,50,20);l_color.setFont(set);
    l_engine_size.setBounds(60,200,80,20);l_engine_size.setFont(set);
    l_production_year.setBounds(100,240,80,20);l_production_year.setFont(set);
    l_service_type.setBounds(55,280,80,20); l_service_type.setFont(set);
    
    
    panel_B.add(l_vechicle_name);
     panel_B.add(l_vechicle_type);
     panel_B.add(l_model);
     panel_B.add(l_model);
     panel_B.add(l_color);
     panel_B.add(l_production_year);
     panel_B.add(l_engine_size);
     panel_B.add(l_service_type);
     
     add(panel_A);
     add(panel_B);
     setTitle("Customer & Vechicle information");
     setDefaultCloseOperation(EXIT_ON_CLOSE); 
     setLayout(null);
     setResizable(false);
     setSize(1920,1080);
     setLocationRelativeTo(null);
     setVisible(true);    
    }
    void MouseListeners(){
    cus_comp.addMouseListener(this);
     

    }
    void EventListeners(){
    customer_name.addKeyListener(this);
    customer_ID.addKeyListener(this);
//    cus_gender[0].addItemListener(this);
    //cus_gender[1].addItemListener(this);
    license_ID.addKeyListener(this);
    contract_number.addKeyListener(this);
    email.addKeyListener(this);
    cus_comp.addKeyListener(this);
    address.addKeyListener(null);
    // panel B components
     car_model.addKeyListener(this);
     engine_size.addKeyListener(this);

    }
      public static void main (String[] args){
         Repair_Form st = new Repair_Form();   
                                               
      }
   

    @Override
    public void actionPerformed(ActionEvent e) {
     if(e.getSource()==b3){
       dispose();
     } 
            
    }

    @Override
    public void keyTyped(KeyEvent e) {
                                        
   }

    @Override
    public void keyPressed(KeyEvent e) {
      if(e.getSource()==customer_name){
       if(e.getKeyCode()==KeyEvent.VK_ENTER)
         customer_ID.requestFocus();
      }
     else if(e.getSource()==customer_ID){
       if(e.getKeyCode()==KeyEvent.VK_ENTER){
         //System.out.println("pressed");
          cus_gender[0].requestFocus();
             //  if(cus_gender[0].==true||cus_gender[1].isSelected()==true) 
              license_ID.requestFocus();
        } 
      }      
    else if(e.getSource()==license_ID){
         if(e.getKeyCode()==KeyEvent.VK_ENTER)
            contract_number.requestFocus();
    }
    else if(e.getSource()==contract_number){
        if(e.getKeyCode()==KeyEvent.VK_ENTER)
           email.requestFocus();
    }
     else if(e.getSource()==email){
        if(e.getKeyCode()==KeyEvent.VK_ENTER)
         cus_comp.requestFocus();   
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
   //  if(e.getSource()==cus_gender[0])
        
   }
    @Override
    public void mouseClicked(MouseEvent e) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'mouseClicked'");
    }
    @Override
    public void mousePressed(MouseEvent e) {
      // TODO Auto-generated method stub
      if(e.getSource()==cus_comp){     
       cus_comp.setText("");
      
       }
    }
    @Override
    public void mouseReleased(MouseEvent e) {
      // TODO Auto-generated method stub
    }
    @Override
    public void mouseEntered(MouseEvent e) {
      // TODO Auto-generated method stub
    }
    @Override
    public void mouseExited(MouseEvent e) {
      // TODO Auto-generated method stub
    }
    
}

