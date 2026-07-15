import java.util.*;

public class counter { 
    public static void main(String[] args) {
        int count = 10;
        int sum = 0;
        for (int i = 0;i <= count;i++) {
            sum = sum + i;
        }
        System.out.println("累加和为：" + sum);
    }
}
