package oddevenbag;

public class main {
    public static void main(String[] args) {
        OddEvenBag oeb1;

        int[] inputArray = {1, 2, 3, 4, 5,20};
        OddEvenBag oeb2;

        oeb1 = new OddEvenBag();
        oeb2 = new OddEvenBag(inputArray);

        oeb2.remove(20);

    }



}
