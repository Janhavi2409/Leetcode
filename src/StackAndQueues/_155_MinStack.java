package StackAndQueues;

import java.util.ArrayList;
import java.util.Collections;

public class _155_MinStack {
    ArrayList<Integer> array = new ArrayList<>();

    public _155_MinStack() {

    }

    public void push(int val) {
        array.add(val);
    }

    public void pop() {
        array.remove(array.size() - 1);
    }

    public int top() {
        return array.get(array.size() - 1);
    }

    public int getMin() {
        return Collections.min(array);
    }
}
