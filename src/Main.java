import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random random = new Random();
        int randomChoiceInt = random.nextInt(words.length);
        System.out.println("Игра угадай слово, которое загадал компьютер!");
        System.out.println("Список слов ниже - одно из этих слов загадает компьютер, тебе нужно угадать какое!");
        System.out.println("apple\norange\nlemon\nbanana\napricot\navocado\nbroccoli\ncarrot\ncherry\ngarlic\ngrape\nmelon\nleak\nkiwi\nmango\nmushroom\nnut\nolive\npea\npeanut\npear\npepper\npineapple\npumpkin\npotato");
        String randomChoiceWord = words[randomChoiceInt];
        System.out.println("Компьютер загадал слово - угадывай!");
        Scanner scanner = new Scanner(System.in);

        int numberOfAttempts;
        if (randomChoiceWord.length() <= 3){
            numberOfAttempts = 2;
        }
        else {
            numberOfAttempts = 3;
        }
        int i = 0;
        while (true) {
            String s = scanner.nextLine();
            if (s.equals(randomChoiceWord)) {
                System.out.println("Ты угадал, это было слово - " + randomChoiceWord);
                break;
            }
            else {
                i++;
                numberOfAttempts--;
                if (numberOfAttempts == 0) {
                    System.out.println("Ты проиграл - количество попыток закончилось!");
                    System.out.println("Компьютер загадал слово " + randomChoiceWord);
                    break;
                }
                System.out.println("Ты не угадал слово - осталось " + numberOfAttempts + " попытка(и)");
                System.out.println("Вот тебе подсказка: слово начинается с этих букв " + randomChoiceWord.substring(0, i) + "#####################");
            }
        }
    }
}