package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    // Constant class fields:
    private static final int TOTAL_BEGINNING_NUMBER = -1;
    private static final int NUMBERS_AMOUNT = 12;

    // Variable class fields:
    private int[] numbers = new int[NUMBERS_AMOUNT];
    private int total = TOTAL_BEGINNING_NUMBER;

    public int getTotal() {
        return total;
    }

    protected void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    protected boolean callCheck() {
        return total == TOTAL_BEGINNING_NUMBER;
    }

    protected boolean isFull() {
        return total == (NUMBERS_AMOUNT - 1);
    }

    protected int peekaboo() {
        if (callCheck())
            return TOTAL_BEGINNING_NUMBER;
        return numbers[total];
    }

    protected int countOut() {
        if (callCheck())
            return TOTAL_BEGINNING_NUMBER;
        return numbers[total--];
    }

}
