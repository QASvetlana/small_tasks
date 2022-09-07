public class ArrayAnalyser {
    // переменные на уровне класса называют полями этого класса
    private int[] numbers;

    // конструктор
    // numbers - сюда пришел массив
    public ArrayAnalyser(int[] numbers) {
        this.numbers = numbers;

    }

    // метод возвращает макс значение из массива
    public int getMaxNumbers() {
        // завели переменную
        int max = numbers[0];
        // сделали цикл до длинны массива
        for (int i = 0; i < numbers.length; i++) {
            // перебираем все числа, сравнивая с предыдущим числом - ищем большее
            if (numbers[i] > max) {
                max = numbers[i];


            }
        }
        // в конце возвращаем самый большой макс
        return max;
    }

    public int getMinNumbers() {
        // завели переменную
        int min = numbers[0];
        // сделали цикл до длинны массива
        for (int i = 0; i < numbers.length; i++) {
            // перебираем все числа, сравнивая с предыдущим числом - ищем большее
            if (numbers[i] < min) {
                // если текущий элемент меньше того, который мы знаем, то обновим минимальное значение
                min = numbers[i];


            }
        }
        // в конце возвращаем самый большой макс
        return min;
    }

    // конкатинируем строки (соединяем их вместе)
    //проходимся по всем числам и каждое значение выводим на экран
    public void printNumbers() {
        System.out.print("[");
        for (int index = 0; index < numbers.length; index++) {
            System.out.print(numbers[index]);
            // условие, чтобы не печатать запятую после последнего элемента массива
            if (index != numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.println();
    }
}


// логику инкапсулировали (изолировали) в класс