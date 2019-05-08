import java.util.Arrays;

public class New {
    public static void main(String[] args) {
        int[] arr = {5, 1, 12, -5, 16, 2, 12, 14};

        for (int i = 0; i < arr.length - 1; i++) {
            int min_idx = i;
            for (int j = i+1; j < arr.length; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            int smallerNumber = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = smallerNumber;
        }
    System.out.println(Arrays.toString(arr));
    }

}