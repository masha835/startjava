import java.util.*;

public class GuessNumber {
    public static void main(String args[]) {
        
        System.out.println("Давай поиграем? Я загадала число от 0 до 100, а ты угадай его");
        //int a = 0;//
        int b = 100;
        int random = (int) (Math.random()*b);
        System.out.println("Как ты думаешь, какое число я загадала? Давай, поделись со мной: " );

        Scanner scan = new Scanner(System.in);

       // System.out.println(scanner.nextInt()); Проверка
        while(true) {
            int number =scan.nextInt();
            if (number > random) {
                System.out.println("Я загадал число поменьше");

            } else if (number < random) {
                System.out.println("Я загадал число побольше");

            } else {
                System.out.println("Да,у тебя хорошая интуиция");
                break;

            }
        }
    }
}