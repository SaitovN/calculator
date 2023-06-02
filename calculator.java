package academy.devonline.java.basic.section01_setup.section04_setup;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("Видите первое чесло");
        var a = new Scanner(System.in).nextInt();
        System.out.println("Ведите второе чесло");
        var b = new Scanner(System.in).nextInt();
        System.out.println("Ведите:+,-,*,/");
        var s = new Scanner(System.in).nextLine().charAt(0);
        String result;
        if (s=='+'){
            result = ""+(a+b) ;
        } else if (s=='-') {
            result = ""+(a-b) ;
        } else if (s=='*') {
            result = ""+(a*b) ;
        } else if (s=='/') {
            result = ""+(a/b) ;
        }else {
            result = "Unsupported operator:"+s;
        }
        System.out.println(result);



    }
}
