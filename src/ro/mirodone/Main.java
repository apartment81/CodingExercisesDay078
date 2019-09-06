package ro.mirodone;

public class Main {

    public static void main(String[] args) {

        DuplicateEncoder duplicateEncoder = new DuplicateEncoder();

        System.out.println(duplicateEncoder.encode("din"));

        DuplicateE duplicateE = new DuplicateE();

        System.out.println(duplicateE.encode("din"));


    }
}
