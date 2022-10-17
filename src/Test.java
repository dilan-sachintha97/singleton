public class Test {
    public static void main(String[] args) {
        Example ex1 = Example.getExample();
        Example ex2 = Example.getExample();

        System.out.println(ex1); //Example@1b6d3586
        System.out.println(ex2); //Example@1b6d3586

        ex1.printName();

    }
}
