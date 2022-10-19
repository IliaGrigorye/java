import java.util.Arrays;

public class Program {
    public static void error(float[]arr1, int[]arr2){
        int[]arr3 = new int[arr1.length];
        float[]arr4 = new float[arr1.length];

        if (arr1 == null | arr2 == null){
            throw new RuntimeException("Ошибка! один или оба масива отсутствуют");
        }
        if (arr1.length != arr2.length){
            throw new RuntimeException("Ошибка! массивы разной длинны");
        }
        if (arr1.length > 10){
            throw new RuntimeException("Ошибка! длинна масива больше 10");
        }
        for (int i = 0; i < arr1.length; i++){
            arr3[i]= (int) (arr1[i]-arr2[i]);
            if (arr1[i] % 1 != 0 | arr2[i] % 1 != 0) {
                throw new RuntimeException("Ошибка! в масиве присутствуют не целые числа");
            }
        }
        for (int i = 0; i < arr1.length; i++){
            arr4[i]= arr1[i] / arr2[i];
            if (arr2[i] == 0){
                throw new RuntimeException("Ошибка! в масиве делители присутствует 0, на ноль делить нельзя");
            }
        }

        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
    }

    public static void main(String[] args) {
        float[]array1 = {2,5,2,1,12,34,12,3,11,5};
        int[]array2 = {2,3,1,0,18,66,82,7,19,5};

        error(array1, array2);
    }
}
