package VladimirSudarikovCalc;

public class Calculator {


    public static int calculator(String operation, int firstNumber, int thoNumber){
    int result = 0;
    switch (operation){
        case "+": result = firstNumber + thoNumber;
            break;
        case "-": result = firstNumber - thoNumber;
            break;
        case "/": result = firstNumber / thoNumber;
            break;
        case "*": result = firstNumber * thoNumber;
            break;
    }
    return result;

    }
}
