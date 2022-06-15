import java.util.Scanner;

public class ToanTu {
    public static void main(String[] args) {
        System.out.println("hello");
        Scanner scanner = new Scanner(System.in);
        System.out.println("vui long nhap ten cua ban: ");
        String fullName = scanner.nextLine();
        System.out.printf("ten cua ban là; %s", fullName);;

    }
}
