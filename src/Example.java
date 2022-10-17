import java.util.Scanner;

public class Example {  // singleton design pattern applied for this class
    private static Example example;

    private Example(){
    }

    public static Example getExample() {
        if(example==null){
            example = new Example();
        }
        return example;
    }

    public void printName(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Name : ");
        String name = input.nextLine();
        System.out.println("Your name is " + name);
    }
}

