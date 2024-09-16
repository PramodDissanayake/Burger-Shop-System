/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Administrator
 */
public class HomePage extends JFrame{
    private JButton btnPlaceOrder;
    private JButton btnBestCustomer;
    private JButton btnSearch;
    private JButton btnViewOrder;
    private JButton btnUpdateOrder;
    private JButton btnExit;
    
    private JLabel lblHome;
    private JLabel lblImage;
    
    public HomePage(){
        setTitle("Home Page");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,520);
        setLocationRelativeTo(null);

        setLayout(null);
        
        int buttonSpacing = 20;
        
        btnPlaceOrder=new JButton("Place Order");
        btnPlaceOrder.setFont(new Font("",Font.PLAIN,15));
        btnPlaceOrder.setBounds(400, 100 + 40 + buttonSpacing, 300, 40);
        btnPlaceOrder.setFocusable(false);
        btnPlaceOrder.addActionListener(evt ->{
            PlaceOrderPage placeOrderPage = new PlaceOrderPage();
            placeOrderPage.setVisible(true);
        });
        
        btnBestCustomer=new JButton("Best Customer");
        btnBestCustomer.setBounds(400, 100, 300, 40);
        btnBestCustomer.setFocusable(false);
        btnBestCustomer.addActionListener(evt ->{
            SearchBestCustomerPage searchBestCustomerPage = new SearchBestCustomerPage();
            searchBestCustomerPage.setVisible(true);
        });
        
        
        btnSearch=new JButton("Search Order");
        btnSearch.setFont(new Font("",Font.PLAIN,15));
        btnSearch.setBounds(400, 100 + 2 * (40 + buttonSpacing), 300, 40);
        btnSearch.setFocusable(false);
        btnSearch.addActionListener(evt ->{
            SearchOrderPage searchOrderPage = new SearchOrderPage();
            searchOrderPage.setVisible(true);
        });
        
        btnViewOrder=new JButton("View Orders");
        btnViewOrder.setFont(new Font("",Font.PLAIN,15));
        btnViewOrder.setBounds(400, 100 + 3 * (40 + buttonSpacing), 300, 40);
        btnViewOrder.setFocusable(false);
        btnViewOrder.addActionListener(evt ->{
            ViewOrdersPage viewOrdersPage = new ViewOrdersPage();
            viewOrdersPage.setVisible(true);
        });
        
        btnUpdateOrder=new JButton("Update order");
        btnUpdateOrder.setFont(new Font("",Font.PLAIN,15));
        btnUpdateOrder.setBounds(400, 100 + 4 * (40 + buttonSpacing), 300, 40);
        btnUpdateOrder.setFocusable(false);
        btnUpdateOrder.addActionListener(evt ->{
            UpdateOrderDetailsPage updateOrderDetailsPage = new UpdateOrderDetailsPage();
            updateOrderDetailsPage.setVisible(true);
        });
        
        btnExit=new JButton("EXIT");
        btnExit.setFont(new Font("",Font.PLAIN,15));
        btnExit.setBounds(500, 100 + 5 * (40 + buttonSpacing), 100, 40);
        btnExit.setFocusable(false);
        btnExit.addActionListener(evt ->{
            System.exit(0);
        });
        
        lblHome = new JLabel();
        lblHome.setText("iHungry Burger");
        lblHome.setFont(new Font("",Font.PLAIN,40));
        lblHome.setForeground(Color.white);
        lblHome.setBounds(0,0,800,70);
        
        lblHome.setVerticalAlignment(JLabel.CENTER);
        lblHome.setHorizontalAlignment(JLabel.CENTER);
        lblHome.setBackground(new Color(47,79,79));
        lblHome.setOpaque(true);
        
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("../img/Image1.png"));
        lblImage = new JLabel(imageIcon);
        lblImage.setBounds(0, 100, 400,350);
        
        
        add(lblHome);       
        add(btnPlaceOrder);
        add(btnBestCustomer);
        add(btnSearch);
        add(btnViewOrder);
        add(btnUpdateOrder);
        add(btnExit);
        add(lblImage);
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../img/icon/icons8-customer-48.png")));
        
    }
}
