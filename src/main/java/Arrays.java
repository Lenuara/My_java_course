

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
        //String parseStr;
        System.out.println();
        int[] Arr = {1, 8, 14, 43, 16, 37, 102, 1991};
        int count = 0;
        int max = 0;
        for (int x : Arr) {
            if (x % 2 != 0) {
                count +=1;
                if(x> max){
                    max =x;
                }

            }

        }
        System.out.println(count);
        System.out.println(max);
    }
}