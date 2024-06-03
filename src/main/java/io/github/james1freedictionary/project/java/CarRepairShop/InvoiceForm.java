/*
This InvoiceForm is written by James1freedictionary (brorojame2030@gmail.com)
copyright (c) 2024, james1freedictionary
 */

package io.github.james1freedictionary.project.java.CarRepairShop;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class InvoiceForm extends JFrame {
    private JLabel CarRepairShopInvoice = new JLabel("Car Repair Shop's Invoice");
   private JLabel InvoiceNo = new JLabel("Invoice No.:");
   private  JLabel InvoiceDate = new JLabel("Invoice Date:");
   private JLabel dueDate = new JLabel("Due Date:");
    private JLabel BillFrom = new JLabel("Bill From");
    private JLabel bfName = new JLabel("Name:");
    private JLabel bfCompanyName = new JLabel("Company's Name:");
    private JLabel bfaddress = new JLabel("Address:");
    private JLabel bfphone = new JLabel("Phone:");
    private JLabel ShipTo = new JLabel("Ship to");
    private JLabel stName = new JLabel("Name:");
    private JLabel stCompanyName = new JLabel("Company's Name:");
    private JLabel staddress = new JLabel("Address:");
    private JLabel stphone = new JLabel("Phone:");
    private JLabel subTotal  = new JLabel("Subtotal:");
    private JLabel salesTax = new JLabel("Sales Tax:");
    private JLabel other = new JLabel("other:");
    private JLabel total = new JLabel("Total:");
    private JLabel termsandcondition  = new JLabel("Terms and Conditions");
    private JLabel tactxt = new JLabel("Thank you \nfor your Business. Please send Payment within .. days of receiving this invoice." );
    private  JLabel tactxt1 = new JLabel(
            "There will a .. %  per .. on late invoices. Please, pay as fast as possible before the due date.");

    void draw() {

        ImageIcon icon = fimgicon();
        JLabel pic =new JLabel(icon);
        pic.setBounds(0,0,90,90);

        CarRepairShopInvoice.setBounds(400, 10, 300,20);
        InvoiceNo.setBounds(400, 30, 200, 20);
        InvoiceDate.setBounds(400,50, 200,20);
        dueDate.setBounds(400,70, 200,20);
        BillFrom.setBounds(0, 90, 200, 20);
        bfName.setBounds(0,110, 200,20);
        bfCompanyName.setBounds(0,130,200,20);
        bfaddress.setBounds(0,150,200,20);
        bfphone.setBounds(0,170,200,20);

        ShipTo.setBounds(300, 90, 200,20);
        stName.setBounds(300,110, 200,20);
        stCompanyName.setBounds(300,130,200,20);
        staddress.setBounds(300,150,200,20);
        stphone.setBounds(300,170,200,20);
        JScrollPane sp = new JScrollPane(fJtable());

            sp.setBounds(0,200,590,410);

        subTotal.setBounds(30,610, 100,20);
        salesTax.setBounds(200, 610, 100,20);
        other.setBounds(350,610, 100,20);
        total.setBounds(450, 610,100,20);

            termsandcondition.setBounds(200,630,200,20);
            tactxt.setBounds(20,650,800,20);
            tactxt1.setBounds(20, 670,800,20);
            add(pic);
        add(CarRepairShopInvoice);
        add(InvoiceNo);
        add(InvoiceDate);
        add(dueDate);
        add(BillFrom);
        add(bfName);
        add(bfCompanyName);
        add(bfaddress);
        add(bfphone);

        add(ShipTo);
        add(stName);
        add(stCompanyName);
        add(staddress);
        add(stphone);

        add(sp);

        add(subTotal);
        add(salesTax);
        add(other);
        add(total);
        add(termsandcondition);
        add(tactxt);
        add(tactxt1);

    }
    ImageIcon fimgicon(){
        ImageIcon icon = new  ImageIcon(new File("").getAbsolutePath() + "/src/main/java/io/github/james1freedictionary/project/java/CarRepairShop/img/car.png");
        Image img = icon.getImage().getScaledInstance(90,90,Image.SCALE_DEFAULT);
        icon = new ImageIcon(img);
        return icon;

    }
    JTable fJtable(){
        String col[] = {"Description", "Quantity/Hours","Price($)", "Total($)"};
        String data[][] = {{"fix brake", "2", "$100", "$200"},
                {"Change engine", "1", "$7000", "$7000"},
                {"upgrade wheel", "4", "$200", "$800"},
                {"repair stick shift", "1", "$900", "$900"}
        };
        return        new JTable(data, col);
    }
    public InvoiceForm() {
        draw();
        setSize(600, 730);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        setTitle("Car Repair Shop's Invoice");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
//        System.out.println(new File("").getAbsolutePath());

    }
}
