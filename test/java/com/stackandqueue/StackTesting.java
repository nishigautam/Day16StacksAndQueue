package com.stackandqueue;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class StackTesting {
    @Test
    public void add_3Elements_to_stack_should_have_last_node_added() {
        Stack<Integer> stack = new Stack<>();
        Integer a = 70, b = 30, c = 56;
        stack.push(a);
        stack.push(b);
        stack.push(c);
        stack.print();
        Assert.assertEquals(c, stack.peak());
    }
}
