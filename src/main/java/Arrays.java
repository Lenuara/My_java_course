

public class Arrays {
    public static void main(String[] args) {
        double[] array2 = new double[10];
        Integer[] array = {1, 2, 3, 4, 5};
        String[] arrayOfString = {"Vanya", "Tanya", "V bane"};
        int len = array.length;
        System.out.println(len);
        System.out.println(arrayOfString[1]);
        String greeting = "Hello world";
        String g = greeting.toLowerCase();
        System.out.println(g);
        Object[] array3 = {"vPCkuac", 1, 15.0};

        System.out.println("===============");

        //Найдем количество нечетных элементов массива и максимальное значение нечетного числа
        int[] Arr = {1, 8, 14, 43, 16, 37, 102, 1991, 1};
        // напечатаем весь массив
        int count = 0;
        int max = 0;
        for (int x : Arr) {
            System.out.print(x+ " ");
                if (x % 2 != 0) {
                count +=1;
                if(x> max){
                    max =x;
                }
            }
        }
        System.out.println("");

        //найдем сумму всех элементов массива Arr c использованием длины
        int sum = 0;
        for (int i = 0; i<Arr.length; i++){
            sum +=Arr[i];
        }

        System.out.println("кол-во нечетных эл-тов = " + count);
        System.out.println("max = " + max);
        System.out.println("сумма всех эл-тов = " + sum);
        System.out.println("===============");

        // развернем массив символов наоборот
        String str = "I learning Java!";
        char[] array_chars = str.toCharArray();
        String result = "";
       for (int x = array_chars.length-1; x>=0; x--){
            result = result + array_chars[x];
        }
        System.out.println("Исходная строка = " + str);
        System.out.println("Строка наоборот = " + result);
        System.out.println("===============");

    }
}