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
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Administrator
 */

public class UpdateOrderDetailsPage extends JFrame {
    
    private JLabel lblOrderId;
    private JTextField txtOrderId;
    private JButton btnFindOrder;
    
    private JLabel lblCustomerID;
    private JLabel lblCustomerName;
    private JLabel lblQuantity;
    private JLabel lblOrderValue;
    private JLabel lblOrderStatus;
    
    private JButton btnUpdateQuantity;
    private JButton btnUpdateStatus;
    private JButton btnBack;
    
    public UpdateOrderDetailsPage() {
        setTitle("Update Order Details");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setLayout(null);
        
        Font lblFonts = new Font("", Font.BOLD, 15);
        
        JLabel lblTitle = new JLabel("Update Order");
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
        
        btnFindOrder = new JButton("Find Order");
        btnFindOrder.setBounds(330, 100, 120, 25);
        add(btnFindOrder);
        
        // Labels to display order details
        lblCustomerID = new JLabel("Customer ID:");
        lblCustomerID.setFont(lblFonts);
        lblCustomerID.setBounds(50, 150, 150, 20);
        add(lblCustomerID);
        
        lblCustomerName = new JLabel("Customer Name:");
        lblCustomerName.setFont(lblFonts);
        lblCustomerName.setBounds(50, 180, 150, 20);
        add(lblCustomerName);
        
        lblQuantity = new JLabel("Quantity:");
        lblQuantity.setFont(lblFonts);
        lblQuantity.setBounds(50, 210, 150, 20);
        add(lblQuantity);
        
        lblOrderValue = new JLabel("Order Value:");
        lblOrderValue.setFont(lblFonts);
        lblOrderValue.setBounds(50, 240, 150, 20);
        add(lblOrderValue);
        
        lblOrderStatus = new JLabel("Order Status:");
        lblOrderStatus.setFont(lblFonts);
        lblOrderStatus.setBounds(50, 270, 150, 20);
        add(lblOrderStatus);
        
        // Buttons to update quantity and status
        btnUpdateQuantity = new JButton("Update Quantity");
        btnUpdateQuantity.setBounds(200, 320, 150, 25);
        add(btnUpdateQuantity);
        
        btnUpdateStatus = new JButton("Update Status");
        btnUpdateStatus.setBounds(370, 320, 150, 25);
        add(btnUpdateStatus);
        
        btnBack = new JButton("Back");
        btnBack.setBounds(50, 320, 100, 25);
        add(btnBack);
        
        // Action listeners for buttons
        btnFindOrder.addActionListener(e -> findOrder());
        btnUpdateQuantity.addActionListener(e -> updateQuantity());
        btnUpdateStatus.addActionListener(e -> updateStatus());
        btnBack.addActionListener(e -> dispose());
    }
    
    private void findOrder() {
        // Code to find the order details based on the order ID
        // Display the order details in corresponding labels
    }
    
    private void updateQuantity() {
        // Code to update the quantity
        // Prompt the user for the new quantity and update the order details
        JOptionPane.showMessageDialog(this, "Quantity updated successfully!");
    }
    
    private void updateStatus() {
        // Code to update the order status
        // Prompt the user for the new status and update the order details
        JOptionPane.showMessageDialog(this, "Status updated successfully!");
    }
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new UpdateOrderDetailsPage().setVisible(true);
        });
    }
}