import java.util.*;
public class binarydigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            int dig = s.charAt(i) - '0';
            String bin = Integer.toBinaryString(dig);
            while (bin.length() < 4) {
                bin = "0" + bin;
            }
            System.out.println(bin);
        }
        sc.close();
    }
    
}