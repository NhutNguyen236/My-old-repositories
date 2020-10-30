/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NhutNguyen
 */
public class Main {
    public static void main(String[] args) {
        Integer object[] = {1,2,3,10,5,6};
        findMaxMin<Integer> something = new findMaxMin<Integer>(object);
        System.out.println("Maximum value is: " + something.findMax());
        System.out.println("Minimum value is: " + something.findMin());
    }
}
