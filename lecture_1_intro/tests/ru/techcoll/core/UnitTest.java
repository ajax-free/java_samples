package ru.techcoll.core;

import org.junit.Test;

import static org.junit.Assert.*;

public class UnitTest {

    @Test
    public void testAttack() throws Exception {

        Unit unit = new Unit();

        assertEquals("Initial attack is 0", 0, unit.getAttack());

        unit.setAttack(10);

        assertEquals("Updated attack is 10", 10, unit.getAttack());

    }

    @Test
    public void testHealth() throws Exception {

        Unit unit = new Unit();

        assertEquals("Initial health is 0", 0, unit.getHealth());

        unit.setHealth(20);

        assertEquals("Updated health is 20", 20, unit.getHealth());

    }

}