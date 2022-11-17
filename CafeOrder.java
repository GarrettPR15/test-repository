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
public class CafeOrder {
    private int numMuffin;
    private int numDanish;
    private int numCoffee;
    private int numTea;
    private int orderNum;
    
    public CafeOrder(int muffin, int danish, int coffee, int tea, int num){
        numMuffin = muffin;
        numDanish = danish;
        numCoffee = coffee;
        numTea = tea;
        orderNum = num;
    }
    
    public int getOrderNum(){
        return orderNum;
    }
    
    public void setOrdernum(int number){
        orderNum = number;
    }
    
    public int getNumMuffin(){
        return numMuffin;
    }
    
    public void setNumMuffin(int muffin){
        if(muffin < 0){
            System.out.println("Invalid number of muffins. Must be 0 or more.");
        } else {
            numMuffin = muffin;
        }
    }
    
    public int getNumDanish(){
        return numDanish;
    }
    
    public void setNumDanish(int danish){
        if(danish < 0){
            System.out.println("Invalid number of danishes. Must be 0 or more.");
        } else {
            numDanish = danish;
        }
    }
    
    public int getNumCoffee(){
        return numCoffee;
    }
    
    public void setNumCoffee(int coffee){
        if(coffee < 0){
            System.out.println("Invalid number of coffees. Must be 0 or more.");
        } else {
            numCoffee = coffee;
        }
    }
    
    public int getNumTea(){
        return numTea;
    }
    
    public void setNumTea(int tea){
        if(tea < 0){
            System.out.println("Invalid number of teas. Must be 0 or more.");
        } else {
            numTea = tea;
        }
    }
    
    @Override
    public String toString() {
        return "CafeOrder{" + "numMuffins=" + numMuffin + ", numDanishes=" + 
                numDanish + ", numCoffees=" + numCoffee + 
                ", numTeas=" + numTea + ", orderNum=" + orderNum + '}';
    }
}
