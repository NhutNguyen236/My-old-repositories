// This program is made to fit in the requirement
import java.util.HashSet;
import java.util.Arrays;
public class SetOPerations {
    public static HashSet<Object> make_set(Object[] x, Object v){
        HashSet <Object> set = new HashSet <Object>();
        set.addAll(Arrays.asList(x));
        set.add(v);
        return set;
    }
    //Union of set
    public static HashSet<Object> union(Object[] x, Object[] y){
        HashSet <Object> set1 = new HashSet <Object>();
        set1.addAll(Arrays.asList(x));
        HashSet <Object> set2 = new HashSet <Object>();
        set2.addAll(Arrays.asList(y));
        HashSet <Object> union = new HashSet <Object>(set1);
        union.addAll(set2);
        return union;
    }
    //Intersection of set
    public static HashSet<Object> intersection(Object[] x, Object[] y){
        HashSet <Object> set1 = new HashSet <Object>();
        set1.addAll(Arrays.asList(x));
        HashSet <Object> set2 = new HashSet <Object>();
        set2.addAll(Arrays.asList(y));
        HashSet <Object> intersec = new HashSet <Object>(set1);
        intersec.retainAll(set2);
        return intersec;
    }
    //Disjoint
    public static HashSet<Object> disjoint(Object[] x, Object[] y){
        HashSet <Object> set1 = new HashSet <Object>();
        set1.addAll(Arrays.asList(x));
        HashSet <Object> set2 = new HashSet <Object>();
        set2.addAll(Arrays.asList(y));
        HashSet <Object> disjoint = new HashSet <Object>(set1);
        disjoint.retainAll(set1);
        disjoint.removeAll(set2);
        return disjoint;
    }
    //Symmetric Difference
    public static HashSet<Object> sym_diff(Object[]x, Object[] y){
        HashSet <Object> set1 = new HashSet <Object>();
        set1.addAll(Arrays.asList(x));
        HashSet <Object> set2 = new HashSet <Object>();
        set2.addAll(Arrays.asList(y));
        HashSet <Object> sym_diff = new HashSet <Object>();
        sym_diff.addAll(set1);
        sym_diff.addAll(set2);
        sym_diff.removeAll(intersection(x,y));
        return sym_diff;
    }
    public static void main(String args[]){
        Object[] x = {"a", "b", "e", "f", "h", "i"};
        Object[] y = {"a", "c", "e", "g"};
        Object[] z = {"d", "g", "i"};
        Object[] u_xy = union(x,y).toArray();
        Object[] in_xy = intersection(x,y).toArray();
        System.out.println("Set number 1 is: " + Arrays.toString(x) + " and set number 2 is: " + Arrays.toString(y) + " and set number 3 is: " + Arrays.toString(z));
        System.out.println("Union of A and B is " + union(x,y));
        System.out.println("Union of A, B and C is: " + union(u_xy,z));
        System.out.println("Intersection of A and B is: " + intersection(x,y));
        System.out.println("Intersection of A, B and C is: " + intersection(in_xy,z));
        System.out.println("A disjoint B is: " + disjoint(x,y));
        System.out.println("Symmetric difference of A and B is: " + sym_diff(x,y));
    }
}
