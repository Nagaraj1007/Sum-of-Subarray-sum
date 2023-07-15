
public class Main {
    public static int sumOfAllSubarraySum(int array[]){
        int totalSum = 0;
        for (int iterator1 =0 ;iterator1 < array.length; iterator1++){
            for (int iterator2 = iterator1 ; iterator2 < array.length ; iterator2++){
                for (int iterator3 = iterator1; iterator3 <= iterator2 ; iterator3++){
                    totalSum += array[iterator3];
                }
            }
        }

        return totalSum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfAllSubarraySum(new int[]{1,2,3}));
    }
}