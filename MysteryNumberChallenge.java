import java.util.Random;
import java.util.Scanner;

class game {
    private int Number;
    private int userInput;

    public game() {
        Random rnum = new Random();
        Number = rnum.nextInt(100);
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        this.Number = number;
    }

    public int takeUserInput() {

        Scanner sc = new Scanner(System.in);
        userInput = sc.nextInt();
        sc.close();
        return userInput;
    }
}

public class GuessingGameUsingClass {
    public static void main(String[] args) {
        System.out.print("Start Guessing The Number: ");
        int cnt = 0;
        int flag = 0;
        game guess = new game();
        int gnrt = guess.getNumber();
        for (int i = 0; i < 10; i++) {
            int n = guess.takeUserInput();
            cnt++;
            if (n == gnrt) {
                System.out.printf("You Guessed it in %d attempts.", cnt);
                flag = 1;
                break;
            } else if (n > gnrt) {
                System.out.print("Smaller Number Please: ");
            } else {
                System.out.print("Higher Number Please: ");
            }
        }
        if (flag == 0) System.out.print("You dumb, you can't guess in 10 attempts");
    }
}