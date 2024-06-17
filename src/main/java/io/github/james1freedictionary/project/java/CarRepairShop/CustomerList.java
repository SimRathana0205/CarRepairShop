import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class CustomerList {
    public static void main(String[] args) {
        // Create frame with title
        JFrame frame = new JFrame("CustomerList");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 400);

        // Create table data
        String[] columnNames = {"Customer ID", "Customer Name", "Car Name","Car Problem","Repair Date",};
        Object[][] data = {
            {"1111", "Jame","Toyata" ,"Change Tries","03/06/2024"},
            {"1211", "Peak Tra","Ford" ,"Check engine","04/06/2024"},
            {"1311", "Vanton","Takoma" ,"Check headlight","05/06/2024"},
            {"", "","" ,"",""},
            {"", "","" ,"",""},
            {"", "","" ,"",""},
            {"", "","" ,"",""},
            {"", "","" ,"",""},
            {"", "","" ,"",""},
            {"", "","" ,"",""},
            {"", "","" ,"",""}
        };

        // Create table with data
        JTable table = new JTable(data, columnNames);
        
        // Create scroll pane and add table to it
        JScrollPane scrollPane = new JScrollPane(table);
        table.setFillsViewportHeight(true);

        // Add scroll pane to frame
        frame.add(scrollPane, BorderLayout.CENTER);
        // Make frame visible
        frame.setVisible(true);
    }
}