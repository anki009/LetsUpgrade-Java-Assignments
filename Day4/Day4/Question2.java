
public class Question2 {
  public static void main(String[] args) {
    int arr[] = new int[5];
    arr[0] = 54;
    arr[1] = 87;
    arr[2] = 82;
    arr[3] = 35;
    arr[4] = 31;
    System.out.print("Odd Values in array are : ");
    for (int i = 0; i < 5; i++) {
      if (arr[i] % 2 != 0) {
        System.out.print(arr[i] + "\n");
      }
    }
  }
}

/*
Odd Values in array are : 87
35
31
*/