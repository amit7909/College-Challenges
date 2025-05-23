import java.util.*;
public class SwapVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c;

        System.out.println("Before Swapping A =" + a);
        System.out.println("Before Swapping B =" +b);

        c= a;
        a=b;
        b=c;

        System.out.println("After Swapping A =" + a);
        System.out.println("After Swapping B =" + b);

        

    }

}
