package FI2;

import java.util.function.Function;

public class CalcImp3 {
    public static void main(String[] args) {
        Function<Integer,Integer> ci = num->num*num;
        System.out.println(ci.apply(10));
    }
}
