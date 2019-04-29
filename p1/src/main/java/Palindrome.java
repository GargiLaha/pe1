import java.util.*;
public class Palindrome {

    int check(int n) {
        int d, r = 0;
        while (n > 0) {
            d = n % 10;
            r = r * 10 + d;
            n /= 10;
        }

        return r;
    }

    boolean sum(int x) {
        int s = 0, a, cp = x;
        boolean flag;
        while (x > 0) {
            a = x % 10;
            if (a % 2 == 0)
                s += a;
            x /= 10;
        }
        if (s > 25)
        {
            System.out.println(cp + " is palindrome and the sum of even numbers is greater than 25");
        flag = true;
        }
        else
            {
            System.out.println(cp + " is palindrome and the sum of even numbers is less than 25");
            flag=false;
            }
        return flag;
    }


    /* {
        ch=ob.check(num);
        if(ch==1)
            ob.sum(num);
        else
            System.out.println(num+" is not palindrome");
    } */
}
