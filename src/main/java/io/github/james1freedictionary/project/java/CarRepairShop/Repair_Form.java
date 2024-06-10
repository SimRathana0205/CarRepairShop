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
import javax.swing.colorchooser.*; 
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.ColorChooserUI;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.time.Year;
import java.awt.*;

public class Repair_Form extends JFrame implements ActionListener , KeyListener , ItemListener, MouseListener {
  String japan  []={"Honda","Toyota","Daihatsu","Suzuki","Mitstubishi","Subaru","Acura","Nissan","Mazda","Isuzu","infinity"};
  String UK     []={"Cooper Works","Aston Martin","Jaguar","Land Rover","Bently","Roll Royce","Lotus","MG","Lotus","Vauxhall"};
  String US     []={"Chevrolet","Ford","Chrysler","Dodge","General Motors ","Tesla","Lincoln","Hummer","Pontiac","Other"};
  String Germany[]={"BMW","Audi","Mercedes Benz","Porsche","Volkswagen","Alpina"};
  String italy  []={"Lambogini","Maserati","Alfa Romeo","Fiat","Ferrari","Abarth","Lancia","Pagani","Other"}; 
  String France []={"Renault","Citroen","Peugeot","Other"};
  String China  []={"BYD","Xiaomi","SAIC","Geely","Lifan Group","Chery","Hongqi","GAC","JAC","Foton"};
  String Korea  []={"Hyundai","KIA","DAEWOO","Ssang Yong","Proto"};                             
     
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
    Button color_button = new Button();

    JTable customer_list_table = new JTable();
    JScrollPane table_container = new JScrollPane(customer_list_table);
    JScrollBar  cus_comp_bar = new JScrollBar();
    //==================panel B components ===================
    JPanel panel_B = new JPanel();
    JLabel l_vechicle_name = new JLabel(" Brand name:"); Choice  country_made = new Choice();Choice brand_name = new Choice();
    JLabel l_country_made = new JLabel("Country made:");
    JLabel l_vechicle_type = new JLabel("Car Type:");    Choice car_type = new Choice();
    JLabel l_model = new JLabel("Model:");              JTextField car_model = new JTextField();
    JLabel l_year = new JLabel("Production Year:");     Choice car_year = new Choice();
    JLabel l_color = new JLabel("Color:");               JTextPane car_color = new JTextPane();
    JLabel l_GearBox= new JLabel("Transmission Type:");     Choice transmission = new Choice();
    JLabel l_engine_size = new JLabel("Engine Size:");  JSpinner engine_size = new JSpinner();
    JLabel l_cylinders = new JLabel("Number of Cylinders:"); JSpinner cylinder_count = new JSpinner();
    JLabel l_service_type = new JLabel("Service type:");  JCheckBox[] service_type = new JCheckBox[3];  
    JLabel l_check_in_date = new JLabel("Check in Date"); JTextField showDate = new JTextField();
    JCheckBox[] service_box = new JCheckBox[3];
    Image[] images = new Image[3];
    ImageIcon[] service_icon = new ImageIcon[3]; 
    JLabel[] service_Detail_label = new JLabel[3]; 
    Button button_choose = new Button("OK");       
    Repair_Form(){//--------------------------------------------------------------------------
      service_box[0] = new JCheckBox("Maintance & Repair");
      service_box[1] = new JCheckBox("Modification");
      service_box[2] = new JCheckBox("Paint Job");
      EventListeners();
     MouseListeners();
    
    // Frame and panels configurations 
    // panel_A.setBackground(Color.blue);
    //panel_B.setBackground(Color.lightGray);
    panel_A.setBounds(0,0, 1350, 350);
    
    panel_B.setBounds(0,360,panel_A.getWidth(),panel_A.getHeight()+20);
    Font set = new Font(Font.DIALOG,Font.PLAIN,14);
    
    //GridLayout frame_grid = new GridLayout();
    //frame_grid.setColumns(1);
     //frame_grid.setRows(2);
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
     l_insurance.setBounds       (20,310,140,20);l_insurance.setFont(set);
     // text fields  && checkboxes
     customer_name.setBounds   (170,30,250,25);
     customer_ID.setBounds     (170,70,250,25);
     cus_gender[0].setBounds   (167,110,70,20);
     cus_gender[1].setBounds   (237,110,80,20);
     license_ID.setBounds      (170,150,250,25);
     contract_number.setBounds (170,190,250,25);
     email.setBounds           (170,230,250,25);  
     address.setBounds         (170,270,250,25); 
     insurance[0].setBounds    (170,310,50,20);insurance[0].setFont(set);   
     insurance[1].setBounds    (230,310,50,20);insurance[1].setFont(set);                                    
     cus_comp.setBounds        (450,230,300,90);
     cus_comp.setFont(set);
     cus_comp.setFocusable(true);
     
                                                 
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
    
     // customer_list_table.addColumn();
     
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
     
        
     // types of class        
   
    // car brands 
   
                                 
    l_vechicle_name.setBounds(130, 40, 100, 20);l_vechicle_name.setFont(set);
    l_country_made.setBounds(360, 40, 100, 20);l_country_made.setFont(set);
    
    String gearBox[]={"Automatic","DCT","CVT","Manual"};
    String country[] ={"Japan","US","UK","Italy","France","Germany","Korea","China"}; 
    String cars[]={"Sedan","Coupe","HatchBack","Sport","Convertible","Roadster","Pick up","SUV","Crossover","Muscle","Luxury","Truck","Super Sport","Exotic",};
                        
    l_vechicle_type.setBounds(150,80,70,20);l_vechicle_type.setFont(set);
    l_model.setBounds(410,80,50,20);l_model.setFont(set);
    car_model.setBounds(470,80,150,25);
    car_model.setBorder(line_Border);car_model.setFont(set);
    l_year.setBounds(110,115,120,20);l_year.setFont(set); 
    car_year.setBounds(240,115,60,25);
    l_color.setBounds(180,160,50,20);l_color.setFont(set);
    car_color.setBounds(240,160,60,20);car_color.setBorder(line_Border);
    color_button.setBounds(310,160,80,25);
    color_button.setLabel("choose");
    l_engine_size.setBounds(140,200,80,20);l_engine_size.setFont(set);
    engine_size.setBounds(240,200,80,20);engine_size.setBorder(line_Border);engine_size.setFont(set);
    l_cylinders.setBounds(380,200,140,25);l_cylinders.setFont(set); 
  
   
    cylinder_count.setBounds(530,200,70,25);
    SpinnerNumberModel limit = new SpinnerNumberModel(0.6, 0.6, 30.0,0.1);
    engine_size.setModel(limit);
    SpinnerNumberModel cylinder_limit = new SpinnerNumberModel(1,1,16,1);
    cylinder_count.setModel(cylinder_limit);
   
    l_GearBox.setBounds     (93,240,130,20);l_GearBox.setFont(set);
    transmission.setBounds  (240,240,100,25);                                                                             
    l_service_type.setBounds(133,280,90,20);l_service_type.setFont(set);
    
    // image icon for choosing 
    
    service_icon[0] = setIcon();
    service_icon[1] = setIcon2();    
    service_icon[2] = setIcon3();
      ButtonGroup panel_ButtonGroup = new ButtonGroup();
          
     // set bounds for service checkbox
       service_box[0].setBounds(235,280,180,25);                                                              
       service_box[1].setBounds(440,280,160,25);
       service_box[2].setBounds(600,280,120,25);
       service_box[0].setFont(set);
       service_box[1].setFont(set);
       service_box[2].setFont(set);
       //add icon into the check boxs
       for(int i=0;i<service_box.length;i++){
       service_box[i].setIcon(service_icon[i]);

       }
        
            country_made.setBounds(480,40,80,20);
           for(String a : country){
            country_made.add(a);
           }
           brand_name.setBounds(240,40,100,20); 
   
           for(String d : japan){
           brand_name.add(d);
           }
           for(String x : cars){
           car_type.add(x);
          }
    for(String z: gearBox){
        transmission.add(z);
    }
    Year yr =Year.now();
   
    for(int year =Integer.parseInt(String.valueOf(yr));year>1940;year-- ){
      car_year.add(String.valueOf(year));
    }
    
  //============================inner panel_B  
    Border inner_panel_B_Border = BorderFactory.createBevelBorder(BevelBorder.LOWERED);
    JLabel service_type_label = new JLabel("Service Type:");
    Font service_title_font = new Font(Font.DIALOG,Font.PLAIN,35);
    
    JPanel service_detail_panel = new JPanel();
  
      //============inner panel_B components 
         
      service_type_label.setFont(service_title_font);
      service_type_label.setBounds(20,20,220,40);
         
        service_detail_panel.setBounds(720,20,610,330);
        service_detail_panel.setLayout(null);
        service_detail_panel.setBorder(inner_panel_B_Border);     
        
        service_Detail_label[0] = new JLabel(service_box[0].getText());
        service_Detail_label[1] = new JLabel(service_box[1].getText());
        service_Detail_label[2] = new JLabel(service_box[2].getText());
        
        service_Detail_label[0].setBounds(240,25,300,35);service_Detail_label[0].setVisible(false);
        service_Detail_label[1].setBounds(240,25,180,35);service_Detail_label[1].setVisible(false);
        service_Detail_label[2].setBounds(240,25,150,35);service_Detail_label[2].setVisible(false);
       // font for service type labels       
       Font service_detail_font =  new Font(service_type_label.getFont().getName(),service_type_label.getFont().getSize(),35);
        for(int s=0;s<service_Detail_label.length;s++){
            service_Detail_label[s].setFont(service_detail_font);
            
        }
        for(int s =0;s<service_Detail_label.length;s++){
            service_detail_panel.add(service_Detail_label[s]);   
            
        }
        service_detail_panel.add(service_type_label);
         
           
    
      car_type.setBounds(240,80,100,20);
      button_choose.setBounds(1200,220,60,25);
     // button_choose.
      panel_B.add(l_vechicle_name);panel_B.add(country_made);panel_B.add(brand_name);
     panel_B.add(l_country_made); 
     panel_B.add(l_vechicle_type);panel_B.add(car_type);
     panel_B.add(l_model);
     panel_B.add(l_model);panel_B.add(car_model);
     panel_B.add(l_year);panel_B.add(car_year);
     panel_B.add(l_color);panel_B.add(car_color);panel_B.add(color_button);
     panel_B.add(l_GearBox);panel_B.add(transmission);
     panel_B.add(l_engine_size);panel_B.add(engine_size);
     panel_B.add(l_cylinders);panel_B.add(cylinder_count);
     panel_B.add(l_service_type);panel_B.add(service_box[0]);
                                 panel_B.add(service_box[1]);
                                 panel_B.add(service_box[2]);
     panel_B.add(service_detail_panel);
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
  
    private ImageIcon setIcon3() {
      ImageIcon i = new ImageIcon("src/main/java/io/github/james1freedictionary/project/java/CarRepairShop/Icons/car-painting.png");
      Image in = i.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
       i = new ImageIcon(in);
      return i;
    }

    private ImageIcon setIcon2() {
           ImageIcon img = new ImageIcon("src/main/java/io/github/james1freedictionary/project/java/CarRepairShop/Icons/reduced.png");
           Image in = img.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
           img = new ImageIcon(in);
           return img; 
         }
    
    private ImageIcon setIcon() {
          ImageIcon ic = new ImageIcon("src/main/java/io/github/james1freedictionary/project/java/CarRepairShop/Icons/low.png");
          Image im = ic.getImage().getScaledInstance(40, 40,Image.SCALE_DEFAULT);
          ic = new ImageIcon(im);
          return ic;
      }

    void MouseListeners(){
    cus_comp.addMouseListener(this);
    service_box[0].addMouseListener(this);
    service_box[1].addMouseListener(this);
    service_box[2].addMouseListener(this);
    
    }
    void EventListeners(){
    customer_name.addKeyListener(this);
    customer_ID.addKeyListener(this);
     //cus_gender[0].addItemListener(this);
    //cus_gender[1].addItemListener(this); 
    license_ID.addKeyListener(this);
    contract_number.addKeyListener(this);
    email.addKeyListener(this);
    cus_comp.addKeyListener(this);
    address.addKeyListener(null);
    // panel B components
     car_model.addKeyListener(this);
     engine_size.addKeyListener(this);
     country_made.addItemListener(this);
     brand_name.addItemListener(this);
     color_button.addActionListener(this);
     button_choose.addActionListener(this);
    
    }
      public static void main (String[] args){
         Repair_Form st = new Repair_Form();   
                                                    
      }
    @Override
    public void actionPerformed(ActionEvent e) {
     if(e.getSource()==b3){
       dispose();
     } 

    else if(e.getSource()==color_button){
       Color car_colors = JColorChooser.showDialog(this,"Vechicle Color",Color.blue);
              // car_colors = JColorChooser.showDialog(rootPane, getTitle(), car_colors, rootPaneCheckingEnabled) 
       car_color.setBackground(car_colors);  
         /*  JDialog d = new JDialog();
        d.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        d.setLayout(null);
         d.setVisible(true);
         d.setTitle("Hello");
         d.setAlwaysOnTop(true);
         d.setBounds(50, 200, 300, 300);
        //  add(d);*/
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
     if(e.getSource()==country_made ){
           if(e.getStateChange()==1){
             String name =  country_made.getSelectedItem(); 
               if(name.matches("Japan")){
                   brand_name.removeAll(); 
                for(String a : japan )
                   brand_name.add(a);
                  
                }
                 else if(name.matches("UK")){ 
                   brand_name.removeAll();
                  for(String a : UK)
                    brand_name.add(a);
                       
                  
                      } 
                 else if(name.matches("US")){
                      brand_name.removeAll();
                      for(String a : US)
                       brand_name.add(a);
                 } 
                 else if(name.matches("Germany")){
                       brand_name.removeAll();
                       for(String a : Germany)
                          brand_name.add(a);
                    
                    }
                   else if(name.matches("italy")){
                       brand_name.removeAll();
                       for(String s : italy)
                         brand_name.add(s);  
                   }      
                   else if(name.matches("France")){
                       brand_name.removeAll();
                       for(String s : France)
                         brand_name.add(s);

                   }
                   else if(name.matches("Korea")){
                           brand_name.removeAll();
                           for(String k : Korea )
                             brand_name.add(k) ;                          
                         }
                   else if(name.matches("China")){
                         brand_name.removeAll();
                         for(String s : China)
                         brand_name.add(s);
                   }
               }
                
            }
   }
    @Override
    public void mouseClicked(MouseEvent e) {
      if(e.getSource()==service_box[0]){
        service_Detail_label[0].setVisible(true);
        service_Detail_label[1].setVisible(false);
        service_Detail_label[2].setVisible(false); 
    }
   else if(e.getSource()== service_box[1]){
     service_Detail_label[1].setVisible(true);
     service_Detail_label[0].setVisible(false);
     service_Detail_label[2].setVisible(false);
     
   }   
   else if (e.getSource()==service_box[2]){
    service_Detail_label[2].setVisible(true);
    service_Detail_label[1].setVisible(false);
    service_Detail_label[0].setVisible(false);

   }
    }
    @Override
    public void mousePressed(MouseEvent e) {
      if(e.getSource()==cus_comp){     
       cus_comp.setText("");
      
       }
      else if (e.getSource()==service_box[0]){

      } 
    }
    @Override
    public void mouseReleased(MouseEvent e) {
    
    }
    @Override
    public void mouseEntered(MouseEvent e) {
    
    }
    @Override
    public void mouseExited(MouseEvent e) {

       
    }

    
      
    
    
}

