// Обработайте возможные исключительные ситуации. “Битые” значения в
// исходном массиве считайте нулями. Можно внести в код правки, которые считаете
// необходимыми.

// Исходный код :
// public class Task2 {
//     public static int sum2d(String[][] arr){
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++){
//            for (int j = 0; j < 5; j++){
//                int val = Integer.parseInt(arr[i][j]);
//                sum += val;
//            }
//        }
//        return sum;
//     }
// }

// Решение: 
public class Task2 {
    public static void main (String [] args){
        String[][] arr = {{"1","2"},{"3",null},{"1","6"}};
        System.out.println("Sum of array: " + sum2d(arr));
    }

    public static int sum2d(String[][] arr){
        int sum = 0;
        int val = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                try{
                    val = Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e){
                    val = 0;
                }
                sum += val;
            }
        }
        return sum;
    }
}

/* Второй вариант решения: 
public class Seminar2_2 {

    public static void main(String[] args) {
        String[][] arr = {{"1","2"},{"3",null},{"1","6"}};
        System.out.println(sum2d(arr));
    }
    public static int sum2d(String[][] arr) {
        int sum = 0;
        if (arr != null){
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j] != null) {
                        sum += tryParseInt(arr[i][j]);
                    }
                }
            }
        }
        return sum;
    }

    public static int tryParseInt(String a){
        try {
            return Integer.parseInt(a);
        }
        catch (NumberFormatException e){
            return 0;
        }
    }
} */