package ru.job4j.chess.firuges.black;

import org.junit.Test;
import static org.junit.Assert.*;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class BishopBlackTest {

    @Test
    public void whenCreateFigurePosA1ThenPositionA1() {
        Figure bishopBlack = new BishopBlack(Cell.A1);
        Cell result = bishopBlack.position();
        assertEquals(result, Cell.A1);
    }

    @Test
    public void whenWayA1ToE5() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        Cell[] expect = new Cell[] {Cell.B2, Cell.C3, Cell.D4, Cell.E5};
        Cell[] result = bishopBlack.way(Cell.E5);
        assertArrayEquals(expect, result);
    }

    @Test
    public void whenWayE1ToB4() {
        BishopBlack bishopBlack = new BishopBlack(Cell.E1);
        Cell[] expect = new Cell[] {Cell.D2, Cell.C3, Cell.B4};
        Cell[] result = bishopBlack.way(Cell.B4);
        assertArrayEquals(expect, result);
    }

    @Test
    public void whenWayA8ToD5() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A8);
        Cell[] expect = new Cell[] {Cell.B7, Cell.C6, Cell.D5};
        Cell[] result = bishopBlack.way(Cell.D5);
        assertArrayEquals(expect, result);
    }

    @Test
    public void whenWayE6ToA2() {
        BishopBlack bishopBlack = new BishopBlack(Cell.E6);
        Cell[] expect = new Cell[] {Cell.D5, Cell.C4, Cell.B3, Cell.A2};
        Cell[] result = bishopBlack.way(Cell.A2);
        assertArrayEquals(expect, result);
    }

    @Test
    public void whenA1AndE5IsDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        Cell dest = Cell.E5;
        assertTrue(bishopBlack.isDiagonal(bishopBlack.position(), dest));
    }

    @Test
    public void whenA1AndE4NotIsDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        Cell dest = Cell.E4;
        assertFalse(bishopBlack.isDiagonal(bishopBlack.position(), dest));
    }

    @Test
    public void whenFigurePosA1ThenCopyToPosA2() {
        Figure bishopBlack = new BishopBlack(Cell.A1);
        bishopBlack = bishopBlack.copy(Cell.A2);
        Cell result = bishopBlack.position();
        assertEquals(result, Cell.A2);
    }
}