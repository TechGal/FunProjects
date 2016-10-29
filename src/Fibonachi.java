public class Fibonachi {

    public static void main (String[] args) {

        double NumOne = 0;
        double NumTwo = 1;
        int Count = 0;

        while (Count < 10) {
            System.out.println(NumOne);
            NumOne = NumOne + NumTwo;

            System.out.println(NumTwo);
            NumTwo = NumOne + NumTwo;

            Count = Count + 1;
        }
    }

}