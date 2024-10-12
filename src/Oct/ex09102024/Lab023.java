package Oct.ex09102024;

public class Lab023 {
    int instance_variable = 10; //instance variable
    static int static_variable = 10; //static variable
    // we will learn these two in oops concept *
    public static void main(String[] args) {
        int age = 10; //local variable


        {
            int sachin = 10; //local variable ->within the curly bracket
            //if i write the sout commqand within curly bracket same then programe will
            System.out.println(sachin);
        }
       // System.out.println(sachin); ->  ,not possible as it is not in same bracket of int sachin = 10
    }
}
