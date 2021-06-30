package VladimirSudarikovCalc;




public class UserEnterRead {



    String firstNumber;
    String operation;
    String thoNumber;
    int firstIntNumber;
    int thoIntNumber;



    public void parseUserEnter(String userEnter) {
        String[] userEnterStr = userEnter.split("\\s"); //разбиваем переданную строку на числа и операцию
        this.firstNumber = userEnterStr[0];
        this.operation = userEnterStr[1];
        this.thoNumber = userEnterStr[2];
    }



    String isOperation = "+, -, /, *";//проверяем навалидность введеных данных
    String roman = "X, IX, VIII, VII, VI, V, IV, III, II, I";
    String arabic = "1, 2, 3, 4, 5, 6, 7, 8, 9, 10";
    boolean flag = false;
    public void isRomanOrArabic(String firstNumber, String thoNumber){


        if (roman.contains(firstNumber) && roman.contains(thoNumber) && isOperation.contains(operation)) {

            flag = true;//если ввод был осуществлен римскими цифрами, ставим флаг в falce
        }
        else if (arabic.contains(firstNumber) && arabic.contains(thoNumber) && isOperation.contains(operation)) {
            firstIntNumber = Integer.parseInt(firstNumber);
            thoIntNumber = Integer.parseInt(thoNumber);
        }

        else throw new IllegalArgumentException();




        if (flag) {
            firstIntNumber = RomanToArabic.romanToArabic(firstNumber);// преобразуем римские цифры в арабские
            thoIntNumber = RomanToArabic.romanToArabic(thoNumber);
        }

    }

}
