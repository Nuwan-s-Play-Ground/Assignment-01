public class Demo3 {
    public static void main(String[] args) {
        int firstPart = 123;
        int secondPart = 456;
        int thirdPart = 7890;

        final String COLOURSET = "\033[31;1m";
        final String RESET = "\033[2;0m";

        System.out.printf("%s(%d)%s%d-%d.\n", COLOURSET, firstPart, RESET, secondPart,
                thirdPart);
    }
}
