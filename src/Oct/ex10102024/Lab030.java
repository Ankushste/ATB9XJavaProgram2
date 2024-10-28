package Oct.ex10102024;

public class Lab030 {
    int i_age; //instance variable
    static int s_age; //static variable


    public static void main(String[] args) {
        int age;
        age = 100;
        System.out.println(age);
        // will not work as is important to assiign some value to age in local variable case in JVM
        // we have to assign some value to variable age = 100

        //System.out.println(i_age);   -> instance variable can not be use directly from static method(main method)
    }
}
