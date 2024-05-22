package edu.kis.vh.nursery.list;

public class IntLinkedList {
    // Constant class fields:
    private static final int EMPTY_LIST_ERROR_CODE = -1;

    // Variable class fields:
    Node last;
    int i;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return EMPTY_LIST_ERROR_CODE;
        return last.value;
    }

    public int pop() {
        if (isEmpty())
            return EMPTY_LIST_ERROR_CODE;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

}
