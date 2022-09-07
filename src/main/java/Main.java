public class Main {

    //анализатор чисел
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, -1};
        // numbers предоставили массив
        ArrayAnalyser analyser = new ArrayAnalyser(numbers);
        // выведем все числа на экран, вызываем метод который печатает все исла на экран
        analyser.printNumbers();
        // выведем макс число из массива
        System.out.println("MAX: " + analyser.getMaxNumbers());
        System.out.println("MIN: " + analyser.getMinNumbers());
    }
}
