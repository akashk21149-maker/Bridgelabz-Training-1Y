import java.util.*;
public class BoxingAndAutoboxing {
    public static void main(String[] args) {
        int x = 10;
        //1st Method
        Integer obj = new Integer(x);//boxing
        //2nd Method
        Integer obj2 = Integer.valueOf(x);//boxing

        Integer obj3 = x;//auto-boxing
        System.out.println(obj3);

        int m = obj.intValue();  // unboxing
        int n = obj; // auto-unboxing
        System.out.println(m);

        Integer a = 200;
        Integer b = 200;
        // -128 - 127
        System.out.println(a==b);
        System.out.println(a.equals(b));

        String str = "100";
        int c = 50;
        int ans = Integer.parseInt(str)*c; // for converting string into integer
        System.out.println(ans);

        int w = 15;
        String s = Integer.toBinaryString(w);
        System.out.println(s);
    }
}