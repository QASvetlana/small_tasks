public class FizzBuzz {

    // Если число делится на 3, напечатать FIZZ
    // Если число делится на 5, напечатать BUZZ
    // Если число делится на 3 и на 5, напечатать FIZZBUZZ
    // Если число не делится ни на 3 и ни на 5, напечатать само число

    public static void main(String[] args) {
        printFizzBuzzIncorrect(15);

    }

    public static void printFizzBuzzIncorrect(int limit) {
      for (int number = 1; number <= limit; number++){
        // знак % возвращает остаток от операции деления
        // если число без остатка делится на 3
        // сначало проверяем наше самое большое условие
          if (number % 3 == 0 && number % 5 == 0) {
              System.out.println("FIZZBUZZ");
          } else if (number % 3 == 0) {
              System.out.println("FIZZ");
          } else if (number % 5 == 0) {
              System.out.println("BUZZ");
          } else {
              System.out.println(number);
          }
      }
    }

    public static void printFizzBuzz(int limit) { }

    public static void printFizzBuzzShortened(int limit) {
        for (int number = 1; number <= limit; number++) {
            // сюда собираем наш ответ
            String answer = "";
            // проверяем делится ли на 3, если да, то кладем физ в ответ
            if (number % 3 == 0) {
                answer += "FIZZ";
            }
            // если делится и на 5 то прибавляем к ответу баз
            if (number % 5 == 0) {
                answer += "BUZZ";
            }
            // проверяем, что что-то положили в ответ и если проверки не прошли выводим число
            if (answer.equals("")) {
                answer += number;
            }
            // выводим на экран ответ
            System.out.println(answer);


            }
        }
    }

