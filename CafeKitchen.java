/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project1;
import java.util.ArrayList;

/**
 *
 * @author Garrett
 */
public class CafeKitchen {
    private ArrayList<CafeOrder> orderList = new ArrayList<CafeOrder>();
    private static int nextOrderNum = 1;
    
    public int getNextOrderNum(){
        return nextOrderNum;
    }
    
    public static void incrementNextOrderNum(){
        nextOrderNum++;
    }
    
    public CafeKitchen(){
        CafeOrder order1 = new CafeOrder(2, 1, 3, 1, getNextOrderNum());
        incrementNextOrderNum();
        CafeOrder order2 = new CafeOrder(2, 1, 3, 1, getNextOrderNum());
        incrementNextOrderNum();
        CafeOrder order3 = new CafeOrder(2, 1, 3, 1, getNextOrderNum());
        incrementNextOrderNum();
        
        orderList.add(order1);
        orderList.add(order2);
        orderList.add(order3);
    }
}
