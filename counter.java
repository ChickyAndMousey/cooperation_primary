import java.util.*;

public class counter { 
    public static void main(String[] args) {
        System.out.println("请输入数字：");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int sum = 0;
        for (int i = 0;i <= count;i++) {
            sum = sum + i;
        }
        System.out.println("累加和为：" + sum);
    }
}
