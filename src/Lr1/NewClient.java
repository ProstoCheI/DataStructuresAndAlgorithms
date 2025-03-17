package Lr1;
import java.util.Random;

public class NewClient {
    public static void main(String[] args) {
        Random random = new Random();

        long start;
        long end;

        int size = 200000;
        ShellSort shellSortArray = new ShellSort(size);
        ShellSort_Knuth shellSortKnuthArray = new ShellSort_Knuth(size);
        ShellSort_Sedgewick shellSortSedgewickArray = new ShellSort_Sedgewick(size);

        for (int i = 0; i < size; i++) {
            shellSortArray.insert(random.nextLong(200000));
            shellSortKnuthArray.insert(random.nextLong(200000));
            shellSortSedgewickArray.insert(random.nextLong(200000));
        }

        System.out.println("\nShell");
        //shellSortArray.display();
        start = System.currentTimeMillis();
        shellSortArray.shellSort();
        end = System.currentTimeMillis();
        //shellSortArray.display();
        System.out.printf("Время выполнения: %d мс \n", end - start);
        System.out.printf("Кол-во перестановок: %d \n", shellSortArray.getSwapCount());

        System.out.println("\nShell by Knuth");
        //shellSortKnuthArray.display();
        start = System.currentTimeMillis();
        shellSortKnuthArray.shellSort_Knuth();
        end = System.currentTimeMillis();
        //shellSortKnuthArray.display();
        System.out.printf("Время выполнения: %d мс \n", end - start);
        System.out.printf("Кол-во перестановок: %d \n", shellSortKnuthArray.getSwapCount());

        System.out.println("\nShell by Sedgewick");
        //shellSortSedgewickArray.display();
        start = System.currentTimeMillis();
        shellSortSedgewickArray.shellSort_Sedgewick();
        end = System.currentTimeMillis();
        //shellSortSedgewickArray.display();
        System.out.printf("Время выполнения: %d мс \n", end - start);
        System.out.printf("Кол-во перестановок: %d \n", shellSortSedgewickArray.getSwapCount());
    }
}
