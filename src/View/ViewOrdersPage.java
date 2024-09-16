/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.OrderController;
import Model.OrderDetails;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class ViewOrdersPage extends JFrame{
    private JTable ordersTable;
    private DefaultTableModel dtm;
    private JLabel lblTitle;
    
    private JButton btnBack;
    private Font lblFonts; 
    
    public ViewOrdersPage(){
        setTitle("View Orders Form");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setLayout(null);
        
        lblFonts = new Font("", Font.PLAIN, 15); 
        
        lblTitle = new JLabel();
        lblTitle.setText("View Orders Form");
        lblTitle.setFont(new Font("",Font.PLAIN,40));
        lblTitle.setForeground(Color.white);
        lblTitle.setBounds(0,0,800,70);
        
        lblTitle.setVerticalAlignment(JLabel.CENTER);
        lblTitle.setHorizontalAlignment(JLabel.CENTER);
        lblTitle.setBackground(new Color(47,79,79));
        lblTitle.setOpaque(true);
        
        String [] columnNames ={"Order Id","Customer Id","Customer Name","Order Status","QTY","Total"};
        dtm= new DefaultTableModel(columnNames,0);
        ordersTable=new JTable(dtm);
        
        JScrollPane tblPane=new JScrollPane(ordersTable);
        tblPane.setBounds(70, 80, 650, 400);
        
        add(tblPane);
        add(lblTitle);
        
        loadTable();
        
        btnBack = new JButton("Back");
        
        btnBack.setFont(lblFonts);
        btnBack.setBounds(40, 490, 100, 40);
        btnBack.setFocusable(false);
        btnBack.addActionListener(new AbstractAction("Back") {
            @Override
            public void actionPerformed(ActionEvent e) {
                HomePage homePage = new HomePage();
                homePage.setVisible(true);
                dispose(); 
               
            }
            
        });
        add(btnBack);
        
    }
    void loadTable(){
        OrderDetails [] orderArray=OrderController.toArray();
        dtm.setRowCount(0);
        for(int i=0;i<orderArray.length;i++){
            OrderDetails obj = orderArray[i];
            Object[] rowdata={
                obj.getOrderId(),
                obj.getCustomerId(),
                obj.getCustomerName(),
                obj.getOrderStatus(),
                obj.getOrderQTY(),
                obj.getOrderValue()
            };
            dtm.addRow(rowdata);
        }
    }
}