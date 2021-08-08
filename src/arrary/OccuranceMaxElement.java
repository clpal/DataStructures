package arrary;

public class OccuranceMaxElement {
  static   int[] arr = {1,1,2,1,5,6,6,6,8,5,9,7,7,1};
    public static void main(String[] args) {
         int count=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]==arr[j+1]){
                    count++;
                }
            }
        }
System.out.println(count);
    }
}
