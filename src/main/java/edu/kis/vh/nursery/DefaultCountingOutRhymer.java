package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    // Constant class fields:
    private static final int EMPTY_RHYMER = -1;
    private static final int MAX_SIZE = 12;
    private static final int DEFAULT_VALUE = -1;

    // Variable class fields:
    private final int[] numbers = new int[MAX_SIZE];
    private int total = EMPTY_RHYMER;

    public int getTotal() {
        return total;
    }

    protected void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    protected boolean callCheck() {
        return total == EMPTY_RHYMER;
    }

    protected boolean isFull() {
        return total == (MAX_SIZE - 1);
    }

    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total];
    }

    protected int countOut() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total--];
    }

}
