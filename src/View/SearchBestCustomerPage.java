/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Administrator
 */
public class SearchBestCustomerPage extends JFrame {
    private Object CustomerController;
    
    public SearchBestCustomerPage() {
        setTitle("Search Best Customer Page");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setLayout(null);

        Font lblFonts = new Font("", Font.BOLD, 15);

        JLabel lblHome = new JLabel();
        lblHome.setText("Search Best Customer");
        lblHome.setFont(new Font("", Font.PLAIN, 35));
        lblHome.setForeground(Color.white);
        lblHome.setBounds(0, 0, 800, 70);
        lblHome.setVerticalAlignment(JLabel.CENTER);
        lblHome.setHorizontalAlignment(JLabel.CENTER);
        lblHome.setBackground(new Color(47, 79, 79));
        lblHome.setOpaque(true);
        add(lblHome);

        // Creating table with columns: Customer ID, Name, Total
        String[] columnNames = {"Customer ID", "Name", "Total"};
        Object[][] data = {
            {"", "", ""},
            {"", "", ""}
            // Add more rows here as needed
        };

        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(model);
        table.setBounds(50, 100, 700, 400);

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(50, 100, 700, 400);
        add(scrollPane);
        
        // Create and add the back button
        JButton btnBack = new JButton("Back");
        btnBack.setBounds(50, 505, 100, 40); // Set button bounds
        btnBack.addActionListener(e -> {
            // Handle back button action
            dispose(); // Close the current frame
            // Open the previous page (assuming it's named HomePage)
            HomePage homePage = new HomePage();
            homePage.setVisible(true);
        });
        add(btnBack);
    }

    public static void main(String[] args) {
        SearchBestCustomerPage page = new SearchBestCustomerPage();
        page.setVisible(true);
    }
}
