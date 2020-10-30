/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NhutNguyen
 * @param <Integer>
 */
public class findMaxMin<Integer extends Comparable<Integer>> implements MinMax<Integer> {
    private Integer[] values;
    
    findMaxMin(Integer[] values){
        this.values = values;
    }
    
    @Override
    public Integer findMax() {
        Integer max = values[0];
        for (int i = 0; i < values.length; i++) {
            if (values[i]-max > 0) {
                max = values[i];
            }
        }
        return max;
    }

    @Override
    public Integer findMin() {
        Integer min = values[0];
        for (int i = 0; i < values.length; i++) {
            if (values[i]-min < 0) {
                min = values[i];
            }
        }
        return min;
    }
    
}
