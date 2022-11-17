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
public class Person {
    private String name;
    private static String memberType;
    private double totalSpent;
    private int memberID = 1;
    private static int nextMemberID = 1;
    
    ArrayList<Person> memberList = new ArrayList<Person>();
    
    public Person(String person, int membershipNumber, double amount, int num){
        name = person;
        setMemberType(membershipNumber);
        totalSpent = amount;
        memberID = num;
    }
    
    public int newPerson(String person, int membershipNumber, 
            double amount){
        Person temp = new Person(person, membershipNumber, amount, getNextMemberID());
        memberList.add(temp);
        incrementNextMemberID();
        return temp.getMemberID();

    }
    
    public int getNextMemberID(){
        return nextMemberID;
    }
    
    public static void incrementNextMemberID(){
        nextMemberID++;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String title){
        name = title;
    }
    
    public String getMemberType(){
        return memberType;
    }
    
    public static void setMemberType(int number){
        switch (number) {
            case 1:
                memberType = "Basic";
                break;
            case 2:
                memberType = "Casual";
                break; 
            case 3:
                memberType = "Regular";
                break;
            default:
                System.out.println("Error: Invalid membership type. Must be a "
                    + "number between 1 and 3.");
                break;
        }
    }
    
    public double getTotalSpent(){
        return totalSpent;
    }
    
    public void addTotalSpent(double amount){
        totalSpent += amount;
    }  
    
    public void setTotalSpent(double amount){
        totalSpent = amount;
    }
    
    public int getMemberID(){
        return memberID;
    }
    public void setMemberID(int num){
        memberID = num;
    }
    public void nextMemberID(){
        memberID++;
    }
    
    public void getCustomerInfo(){
        System.out.println("Customer Information" );
        System.out.println(this.getName());
        System.out.println("Membership type: " + this.getMemberType());
        System.out.println("Total amount spent: $" + this.getTotalSpent());
        System.out.println("Member ID: " + this.getMemberID());
    }
}
