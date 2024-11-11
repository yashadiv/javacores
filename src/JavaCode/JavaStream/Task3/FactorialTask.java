package JavaCode.JavaStream.Task3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveTask;

public class FactorialTask extends RecursiveTask<Long> {
    private final int n;

    public FactorialTask(int n) {
        this.n = n;
    }

    @Override
    protected Long compute() {
        if (n >= 1) {
            FactorialTask factorialTask = new FactorialTask(n-1);
            factorialTask.fork();
            long factTask = factorialTask.join();
            return n*factTask;

        } else {
            return 1L;
        }
    }
}
