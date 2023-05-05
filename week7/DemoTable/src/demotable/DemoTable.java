package demotable;

public class DemoTable {

    public static void main(String[] args) {

        System.out.println("\t\t\t\tMultiplication Table\n");
        for (int i = 1; i < 10; i++) {
            System.out.print("\t" + i);
        }

        System.out.println();

        for (int i = 1; i < 10; i++) {
            System.out.print("\t" + "-");
        }

        System.out.println();

        for (int i = 1; i < 10; i++) {
            System.out.print(i + "|");
            for (int j = 1; j < 10; j++) {
                System.out.print("\t" + (i * j));
            }
            System.out.println();
        }

    }

}
