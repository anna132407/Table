public class Test {
    public static void main(String[] args) {
        Table table = new Table();
        table.multiplicationTableInColumn();
    }
}

class Table{
    public static void multiplicationTableInColumn() {
        for (int i = 2; i <= 9; i++) {
            for (int j = 2; j <= 5; j++) {
                System.out.print(j + " * " + i + " = " + (i * j) + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 2; i <= 9; i ++) {
            for (int j = 6; j <= 9; j++) {
                System.out.print(j + " * " + i + " = " + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}
