import java.util.Scanner;
import java.util.ArrayList;
public class FizzBuzzRun {
    
private static boolean isFizz(int fizzBuzz){
    if(fizzBuzz % 3 == 0){
        return true;
    } else {
        return false;
    }
}

private static boolean isBuzz(int fizzBuzz){
    if(fizzBuzz % 5 == 0){
        return true;
    } else {
        return false;
    }
}

private static boolean isFizzBuzz(int fizzBuzz){
    if(fizzBuzz % 3 == 0 && fizzBuzz % 5 == 0){
        return true;
    } else {
        return false;
    }
}

public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    ArrayList<String> fizzBuzz = new ArrayList<String>();

    System.out.println("Enter a number:");
    fizzBuzz.add(keyboard.nextLine());

    FizzBuzz fizzbuzz = new FizzBuzz();
    for(int i = 0; i > fizzBuzz.size(); i++){
        if ( fizzBuzz.size() == -1){
            break;
        } else if
            (isFizz(fizzBuzz.get(i)) == true){
            System.out.println(fizzbuzz.getFizz());
        } else if (isBuzz(fizzbuzz.size()) == true){
            System.out.println(isBuzz(fizzBuzz.size()));
        } else if (isFizzBuzz(fizzBuzz.size()) == true){
            System.out.println(isFizzBuzz(fizzbuzz.size()));
        }
    }
    
    keyboard.close();
}

}
