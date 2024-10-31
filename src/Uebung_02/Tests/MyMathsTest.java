// SPDX-FileCopyrightText: 2024 Maximilian Karhausen
//
// SPDX-License-Identifier: CC0-1.0

package Uebung_02.Tests;

import Uebung_02.MyMaths;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMathsTest {

    public MyMaths mymaths = new MyMaths();

    @Test
    void gcd() {
        assertEquals(1, mymaths.gcd(2, 5));
        assertEquals(1, mymaths.gcd(5, 2));
    }
}