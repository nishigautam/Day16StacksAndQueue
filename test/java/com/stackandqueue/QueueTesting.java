package com.stackandqueue;

import org.junit.Assert;
import org.junit.Test;

public class QueueTesting {

    @Test
    public void given_Elements_added_to_queue_Return_Front_node_added() {
        Queue<Integer> queue = new Queue<Integer>();
        Integer a = 56, b = 30, c = 70;
        queue.enqueue(a);
        queue.enqueue(b);
        queue.enqueue(c);
    }
}
