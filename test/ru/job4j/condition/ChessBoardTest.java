package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ChessBoardTest {

    @Test
    public void wayBishopIs5() {
        int way = ChessBoard.wayBishop(6, 7, 1, 2);
        assertThat(way, is(5));
    }

    @Test
    public void wayBishopIs7() {
        int way = ChessBoard.wayBishop(7, 0, 0, 7);
        assertThat(way, is(7));
    }

    @Test
    public void wayBishopIs0() {
        int way = ChessBoard.wayBishop(2, 6, 4, 1);
        assertThat(way, is(0));
    }
}