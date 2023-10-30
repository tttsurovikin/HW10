public class HW_10 {
    public static void main(String[] args) {
        int[] shuttleNumbers = new int[100];
        int shuttleNumber = 1;
        for (int i = 0; i < shuttleNumbers.length; i++) {
            if (shuttleNumber == 4 || shuttleNumber == 9) {
                shuttleNumber++;
            }
            shuttleNumbers[i] = shuttleNumber;
            shuttleNumber++;
        }
        for (int i = 0; i < shuttleNumbers.length; i++) {
            System.out.print(shuttleNumbers[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
}