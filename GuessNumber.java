import java.util.*;

public class GuessNumber {
    public static void main(String args[]) {
        
        System.out.println("����� ��������? � �������� ����� �� 0 �� 100, � �� ������ ���");
        //int a = 0;//
        int b = 100;
        int random = (int) (Math.random()*b);
        System.out.println("��� �� �������, ����� ����� � ��������? �����, �������� �� ����: " );

        Scanner scan = new Scanner(System.in);

       // System.out.println(scanner.nextInt()); ��������
        while(true) {
            int number =scan.nextInt();
            if (number > random) {
                System.out.println("� ������� ����� ��������");

            } else if (number < random) {
                System.out.println("� ������� ����� ��������");

            } else {
                System.out.println("��,� ���� ������� ��������");
                break;

            }
        }
    }
}