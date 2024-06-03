/*
This ReceiptForm is written by James1freedictionary (brorojame2030@gmail.com)
copyright (c) 2024, james1freedictionary
 */

package io.github.james1freedictionary.project.java.CarRepairShop;
import javax.swing.*;
import java.awt.*;
import java.io.File;

public class ReceiptForm extends JFrame{
    private ImageIcon icon;
    private JLabel l_icon;
    private JLabel Rec = new JLabel("Car Repair Shop's Receipt");
    private JLabel Date = new JLabel("Date: ");
    private JLabel RecieptNumber = new JLabel("Receipt #: ");
    private JLabel cname = new JLabel("Company Name: ");
    private JLabel add = new JLabel("Address: ");
    private JLabel phone = new JLabel("Phone: ");
    private JLabel Fax = new JLabel("Fax: ");
    private JLabel email = new JLabel("Email: ");
    private  JLabel website = new JLabel("Website: ");
    private JLabel cinf = new JLabel("Customer Information");
    private JLabel ciname = new JLabel("Name: ");
    private JLabel ciaddr = new JLabel("Address: ");
    private JLabel ciphone = new JLabel("Phone: ");
    private JLabel ciemail = new JLabel("Email: ");
    private JLabel ii = new JLabel("Insurance Information");
    private JLabel iicom = new JLabel("Company: ");
    private JLabel iiclaim = new JLabel("Claim #: ");
    private JTable table;
    private JScrollPane sptable;
    private  JLabel pmethod = new JLabel("Payment Method: ");
    private JCheckBox pcbcreditcard = new JCheckBox("Credit Card");

    private JCheckBox pcbcash = new JCheckBox("Cash");
    private JCheckBox pcbcheck = new JCheckBox("Check");
    private JCheckBox pcbother = new JCheckBox("Other");
    private JLabel ap = new JLabel("Amount Paid: ");
    private JLabel ad = new JLabel("Amount Due: ");
    private JLabel subtotal  = new JLabel("Subtotal: ");
    private JLabel taxrate = new JLabel("Tax Rate: ");
    private  JLabel tax = new JLabel("Tax:");
    private  JLabel total = new JLabel("Total: ");
    private JLabel spn = new JLabel("Service Person Name: ");
    private  JLabel as = new JLabel("Authorized Signature: ");

void draw(){
    icon = fimgicon();
    l_icon = new JLabel(icon);
    l_icon.setBounds(0,0,90,90);

    Rec.setBounds(400,10,200,20);
    Date.setBounds(400,30,200,20);
    RecieptNumber.setBounds(400,50,200,20);
    cname.setBounds(0,70,200,20);
    add.setBounds(0,90,200,20);
    phone.setBounds(0,110,200,20);
    Fax.setBounds(0,130,200,20);
    email.setBounds(0,150,200,20);
    website.setBounds(0,170,200,20);
    cinf.setBounds(0,190,200,20);
    ciname.setBounds(0,210,200,20);
    ciaddr.setBounds(0,230,200,20);
    ciphone.setBounds(0,250,200,20);
    ciemail.setBounds(0,270,200,20);
    ii.setBounds(300,190,200,20);
    iicom.setBounds(300, 210,200,20);
    iiclaim.setBounds(300,230,200,20);

    table = fjtable();
    sptable = new JScrollPane(table);
    sptable.setBounds(0,290,590,320);
    pmethod.setBounds(0,610,200,20);
    pcbcreditcard.setBounds(130,610,100,20);
    pcbcash.setBounds(210+50,610,100,20);
    pcbcheck.setBounds(310+50,610,100,20);
    pcbother.setBounds(410+50,610,200,20);

    subtotal.setBounds(0,630,200,20);
    taxrate.setBounds(130,630,200,20);
    tax.setBounds(260,630,200,20);
    total.setBounds(360,630,200,20);

    spn.setBounds(0,650,200,20);
    as.setBounds(0,670,200,20);
    ap.setBounds(380,650,200,20);
    ad.setBounds(380,670,200,20);

    add(l_icon);

    add(Rec);
    add(Date);
    add(RecieptNumber);
    add(cname);
    add(add);
    add(phone);
    add(Fax);
    add(email);
    add(website);
    add(cinf);
    add(ciname);
    add(ciaddr);
    add(ciphone);
    add(ciemail);
    add(ii);
    add(iicom);
    add(iiclaim);

    add(sptable);
    add(pmethod);
    add(pcbcreditcard);
    add(pcbcash);
    add(pcbcheck);
    add(pcbother);

    add(subtotal);
    add(taxrate);
    add(tax);
    add(total);

    add(spn);
    add(as);
    add(ap);
    add(ad);
}
    ImageIcon fimgicon(){
        ImageIcon icon = new  ImageIcon(new File("").getAbsolutePath() + "/src/main/java/io/github/james1freedictionary/project/java/CarRepairShop/img/carreceipt.png");
        Image img = icon.getImage().getScaledInstance(90,90,Image.SCALE_DEFAULT);
        icon = new ImageIcon(img);
        return icon;

    }
    JTable fjtable(){
        String data[][]={ {"repair brake","2", "$600","$1200"},
                {"Change engine", "1", "$7000", "$7000"},
                {"upgrade wheel", "4", "$200", "$800"},
                {"repair stick shift", "1", "$900", "$900"},
                {"Change engine", "1", "$7000", "$7000"},
                {"upgrade wheel", "4", "$200", "$800"},
                {"repair stick shift", "1", "$900", "$900"},
                {"Change engine", "1", "$7000", "$7000"},
                {"upgrade wheel", "4", "$200", "$800"},
                {"repair stick shift", "1", "$900", "$900"},
                {"Change engine", "1", "$7000", "$7000"},
                {"upgrade wheel", "4", "$200", "$800"},
                {"repair stick shift", "1", "$900", "$900"},
                {"Change engine", "1", "$7000", "$7000"},
                {"upgrade wheel", "4", "$200", "$800"},
                {"repair stick shift", "1", "$900", "$900"},
                {"Change engine", "1", "$7000", "$7000"},
                {"upgrade wheel", "4", "$200", "$800"},
                {"repair stick shift", "1", "$900", "$900"},
                {"Change engine", "1", "$7000", "$7000"},
                {"upgrade wheel", "4", "$200", "$800"},
                {"repair stick shift", "1", "$900", "$900"}
        };
        String column[]={"Service Offered","Qty","Price","Toral"};
            return new JTable(data, column);

    }
    ReceiptForm(){
        draw();

        setTitle("Car Repair Shop's Receipt");
        setSize(600,730);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
