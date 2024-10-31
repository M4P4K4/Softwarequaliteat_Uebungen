// SPDX-FileCopyrightText: 2024 Maximilian Karhausen
//
// SPDX-License-Identifier: CC0-1.0

package Uebung_02.Tests;

import Uebung_02.Stack;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StackTest {

    @Test
    public void isEmpty() {
        Stack stack_0 = new Stack(0);
        Stack stack_1 = new Stack(1);
        stack_1.push(1);

        Assert.assertTrue(stack_0.isEmpty());
        Assert.assertFalse(stack_1.isEmpty());
    }

    @Test
    public void pop() {
        Stack stack_0 = new Stack(0);
        Stack stack_1 = new Stack(1);
        stack_1.push(45);
        Stack stack_2 = new Stack(1);
        stack_2.push(0);

        Assert.assertEquals(-1, stack_0.pop());
        Assert.assertEquals(45, stack_1.pop());
        Assert.assertEquals(0, stack_2.pop());
    }

    @Test
    public void push() {
        Stack stack = new Stack(2);

        stack.push(0);
        Assert.assertArrayEquals(new int[] {0, 0}, stack.stackArr);

        Assert.assertThrows(IllegalArgumentException.class, () -> { stack.push(-1); });

        stack.push(15);
        Assert.assertArrayEquals(new int[] {0, 15}, stack.stackArr);

        Assert.assertThrows("Stack is full", StackOverflowError.class, () -> stack.push(1));
    }

    @Test
    public void size() {
        Stack stack = new Stack(1);

        Assert.assertEquals(0, stack.size());

        stack.push(7);
        Assert.assertEquals(1, stack.size());
    }

    @Test
    public void top() {
        Stack stack = new Stack(1);

        Assert.assertEquals(-1, stack.top());

        stack.push(4);
        Assert.assertEquals(4, stack.top());
    }
}