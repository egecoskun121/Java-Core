import java.util.Objects;
import java.util.Scanner;
 interface Generic<T>{
     void addition(T a,T b);

     void subtraction(T a,T b);

     void multiplication(T a,T b);

     void division(T a,T b);

     void performAll(T a,T b);


 }
 class NumericDataType<T> implements Generic{


     @Override
     public void addition(Object a, Object b) {

         int sum=(Integer) a+(Integer) b;
         String sum2=String.format("%.2f", sum);
         System.out.println("Adding 2 generic instances");
         System.out.println("The result is: "+sum2);
     }

     @Override
     public void subtraction(Object a, Object b) {
         int sum=(Integer) a-(Integer) b;
         String sum2=String.format("%.2f", sum);
         System.out.println("Adding 2 generic instances");
         System.out.println("The result is: "+sum2);
     }

     @Override
     public void multiplication(Object a, Object b) {
         int sum=(Integer) a*(Integer) b;
         String sum2=String.format("%.2f", sum);
         System.out.println("Multiplying 2 generic instances");
         System.out.println("The result is: "+sum2);
     }

     @Override
     public void division(Object a, Object b) {
         int sum=(Integer) a/(Integer) b;
         String sum2=String.format("%.2f", sum);
         System.out.println("Dividing 2 generic instances");
         System.out.println("The result is: "+sum2);
     }

     @Override
     public void performAll(Object a, Object b) {
         addition(a,b);
         subtraction(a,b);
         multiplication(a,b);
         division(a,b);
     }
 }

 class StringDataType<T> implements Generic{

     @Override
     public void addition(Object a, Object b) {
         System.out.println("Adding two strings");
         System.out.println("The result is :"+a+b);
     }

     @Override
     public void subtraction(Object a, Object b) {
         System.out.println("Can't perform this operation on strings");
     }

     @Override
     public void multiplication(Object a, Object b) {
         System.out.println("Can't perform this operation on strings");
     }

     @Override
     public void division(Object a, Object b) {
         System.out.println("Can't perform this operation on strings");
     }

     @Override
     public void performAll(Object a, Object b) {
         addition(a,b);
         subtraction(a,b);
         multiplication(a,b);
         division(a,b);
     }

 }
public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String[] s = sc.nextLine().split(" ");
        int i = Integer.parseInt(s[0]), l = Integer.parseInt(s[1]), d = Integer.parseInt(s[2]), q = Integer.parseInt(s[3]);

        NumericDataType<Integer> obj1 = new NumericDataType<Integer>();
        NumericDataType<Long> obj2 = new NumericDataType<Long>();
        NumericDataType<Double> obj3 = new NumericDataType<Double>();
        StringDataType<String> obj4 = new StringDataType<String>();

        for(int t = 0; t < i; t++){
            s = sc.nextLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            obj1.performAll(a,b);
        }
        for(int t = 0; t < l; t++){
            s = sc.nextLine().split(" ");
            long a = Long.parseLong(s[0]);
            long b = Long.parseLong(s[1]);
            obj2.performAll(a,b);
        }
        for(int t = 0; t < d; t++){
            s = sc.nextLine().split(" ");
            double a = Double.parseDouble(s[0]);
            double b = Double.parseDouble(s[1]);
            obj3.performAll(a,b);
        }
        for(int t = 0; t < q; t++){
            s = sc.nextLine().split(" ");
            String a = s[0];
            String b = s[1];
            obj4.performAll(a,b);
        }
    }
}
