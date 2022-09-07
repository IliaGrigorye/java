package HW;

public class StepsRoutesHW {
    static int[] solve(int a, int b, int c, int d, int index, int[] arr){
        if (index > b){
            return arr;
        }
        else {
            if (index % d == 0){
                if (index < c){
                    arr[index] = arr[index] + arr[index / d];
                }    
                else{
                    arr[index] = arr[index - c] + arr[index / d];
                }
            }
            else{
                arr[index] = arr[index - c];
            }
            return (solve(a, b, c, d, index+1, arr));
        }
    }

    public static void main(String[] args) {
        int a = 0;
        int b = 10;
        int c = 1;
        int d = 2;
        int index = a + 1;
        int[] arr = new int[b + 1];
        arr[a] = 1;
        var so = solve(a, b, c, d, index, arr);

        for (int i = 0; i < so.length; i++){
            System.out.printf("%d -> %d\n", i, so[i]);
        }

    }
}
