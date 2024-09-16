/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Administrator
 */
public class SearchOrderPage extends JFrame {
    
    private JLabel lblOrderId;
    private JTextField txtOrderId;
    private JButton btnSearch;
    private JButton btnBack; 
    
    private JLabel lblCustomerId;
    private JLabel lblName;
    private JLabel lblQuantity;
    private JLabel lblTotal;
    private JLabel lblOrderStatus;
    
    public SearchOrderPage() {
        setTitle("Search Order");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setLayout(null);
        
        Font lblFonts = new Font("", Font.BOLD, 15);
        
        JLabel lblTitle = new JLabel("Search Order");
        lblTitle.setFont(new Font("", Font.PLAIN, 35));
        lblTitle.setForeground(Color.white);
        lblTitle.setBounds(0, 0, 600, 70);
        lblTitle.setVerticalAlignment(JLabel.CENTER);
        lblTitle.setHorizontalAlignment(JLabel.CENTER);
        lblTitle.setBackground(new Color(47, 79, 79));
        lblTitle.setOpaque(true);
        add(lblTitle);
        
        lblOrderId = new JLabel("Order ID:");
        lblOrderId.setFont(lblFonts);
        lblOrderId.setBounds(50, 100, 100, 20);
        add(lblOrderId);
        
        txtOrderId = new JTextField();
        txtOrderId.setBounds(160, 100, 150, 25);
        add(txtOrderId);
        
        btnSearch = new JButton("Search");
        btnSearch.setBounds(330, 100, 120, 25);
        add(btnSearch);
        
        // Labels to display order details
        lblCustomerId = new JLabel("Customer ID:");
        lblCustomerId.setFont(lblFonts);
        lblCustomerId.setBounds(50, 150, 150, 20);
        add(lblCustomerId);
        
        lblName = new JLabel("Name:");
        lblName.setFont(lblFonts);
        lblName.setBounds(50, 180, 150, 20);
        add(lblName);
        
        lblQuantity = new JLabel("Quantity:");
        lblQuantity.setFont(lblFonts);
        lblQuantity.setBounds(50, 210, 150, 20);
        add(lblQuantity);
        
        lblTotal = new JLabel("Total:");
        lblTotal.setFont(lblFonts);
        lblTotal.setBounds(50, 240, 150, 20);
        add(lblTotal);
        
        lblOrderStatus = new JLabel("Order Status:");
        lblOrderStatus.setFont(lblFonts);
        lblOrderStatus.setBounds(50, 270, 150, 20);
        add(lblOrderStatus);
    
        btnBack = new JButton("Back");
        btnBack.setBounds(50, 300, 100, 40);
        btnBack.addActionListener((ActionEvent e) -> {
            // Handle back button action
            dispose(); // Close the current frame
            // Open the previous page (assuming it's named HomePage)
            HomePage homePage = new HomePage();
            homePage.setVisible(true);
        });
        add(btnBack);
    }
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new SearchOrderPage().setVisible(true);
        });
    }
}