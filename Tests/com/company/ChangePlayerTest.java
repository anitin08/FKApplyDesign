package com.company;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChangePlayerTest {

    @Test
    void whichPlayer() {
    }

    @Test
    void getTurn() {
    ChangePlayer cp = new ChangePlayer();
       Assert.assertTrue(('O'==cp.getTurn())||('X'==cp.getTurn()));
    }
}