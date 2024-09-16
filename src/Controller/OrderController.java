/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DB.OrderList;
import Model.OrderDetails;

/**
 *
 * @author Administrator
 */
public class OrderController {
    
    public static double burgerPrice =500;
    
    	// orders array
	public static OrderList list  = new OrderList();
	
	// generate order Id
	public static String generateOrderId() {
		if (list.size()==0){
			return "O0001";
		}
		String lastOrderId = list.get(list.size()-1).getOrderId();
		int number = Integer.parseInt(lastOrderId.split("O")[1]); 
		number++;//2
		return String.format("O%04d",number); 
	}
        
        public static String generateCustomerId() {
		if (list.size()==0){
			return "C0001";
		}
		String lastCustomerId = list.get(list.size()-1).getCustomerId();
		int number = Integer.parseInt(lastCustomerId.split("C")[1]); 
		number++;
		return String.format("C%04d",number); 
	}

	// validation Customer ID
	public static boolean validationcustomerId(String customerId) {
        if (customerId.length() == 10) {
            if (customerId.startsWith("0")) {
                try {
                    int i = Integer.parseInt(customerId);
                    return true;
                } catch (NumberFormatException e) {
                    return false;
                }
            }
        }
        return false;
    }
    
    // view orders details
	public static String viewOrderDetails(int i){
		String line = String.format("%1s%-10s%-15s%-15s%-10d%8.2f", " ", list.get(i).getOrderId(), list.get(i).getCustomerId(),
									list.get(i).getCustomerName(), list.get(i).getOrderQTY(), list.get(i).getOrderValue());
		return line;
	}
	
	//searching for customer ID
	public static String isExistCustomer(String customerId){
		String name="";
		for(int i=0 ; i < list.size() ; i++){
			if(customerId.equals(list.get(i).getCustomerId())){
				name=list.get(i).getCustomerName();
				break;
			}
		}
		return name;
	}
	
	//add order
	public static void add(OrderDetails data){
		list.add(data);
	}
	
	public static OrderDetails[] toArray(){
		return list.toArray();
	}
	

	
	public static OrderDetails[] sortArray(OrderDetails[] sortOrderArray){
		for (int i = 1; i < sortOrderArray.length; i++) {
            for (int j = 0; j < i; j++) {
                if (sortOrderArray[j].getOrderValue() < sortOrderArray[i].getOrderValue()) {
					String temp = sortOrderArray[j].getCustomerId();
					sortOrderArray[j].setCustomerId(sortOrderArray[i].getCustomerId());
					sortOrderArray[i].setCustomerId(temp);
                    
					temp = sortOrderArray[j].getCustomerName();
					sortOrderArray[j].setCustomerName(sortOrderArray[i].getCustomerName());
					sortOrderArray[i].setCustomerName(temp);
                    
					double tempd = sortOrderArray[j].getOrderValue();
					sortOrderArray[j].setOrderValue(sortOrderArray[i].getOrderValue());
					sortOrderArray[i].setOrderValue(tempd);
				}
			}
		}
		return sortOrderArray;
	}
	

	
	public static OrderDetails getOrder(int index){
		return list.get(index);
	}
	
	//size of linked list
	public static int size(){
		return list.size();
	}
	
    
}