package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    private StompEmInTheNutsStack stompEmInTheNutsStack;

    @BeforeEach
    public void stephenCantStopSleeping(){
        stompEmInTheNutsStack = new StompEmInTheNutsStack();
    }

    @Test
    public void stackCreationTest(){
        assertNotNull(stompEmInTheNutsStack);
    }

    @Test
    public void emptyStackTest(){
        assertTrue(stompEmInTheNutsStack.isEmpty());
    }

    @Test
    public void pushaOneElementProvidedStackNotEmptyTest(){
        stompEmInTheNutsStack.push(13);
        assertFalse(stompEmInTheNutsStack.isEmpty());
    }

    @Test
    public void pushXPopXStackMustBeEmptyTest(){
        stompEmInTheNutsStack.push(13);
        stompEmInTheNutsStack.pop();
        assertTrue(stompEmInTheNutsStack.isEmpty());
    }

    @Test
    public void pushX_YPopYStackMustNotBeEmptyTest(){
        stompEmInTheNutsStack.push(14);
        stompEmInTheNutsStack.push(3);
        stompEmInTheNutsStack.pop();
        assertFalse(stompEmInTheNutsStack.isEmpty());
    }

    @Test
    public void pushXPopYElementMustBeXTest(){
        stompEmInTheNutsStack.push(34);
        int element = stompEmInTheNutsStack.pop();
        assertEquals(34, element);
    }

    @Test
    public void pushXY_popYXElementMustBeYThenXTest(){
        stompEmInTheNutsStack.push(34);
        stompEmInTheNutsStack.push(67);
        int element = stompEmInTheNutsStack.pop();
        assertEquals(67, element);
        element = stompEmInTheNutsStack.pop();
        assertEquals(34, element);
    }

    @Test
    public void pushXY_peekReturnsYTest(){
        stompEmInTheNutsStack.push(666);
        stompEmInTheNutsStack.push(420);
        int element = stompEmInTheNutsStack.peek();
        assertEquals(420, element);
        element = stompEmInTheNutsStack.pop();
        assertEquals(420, element);
        element = stompEmInTheNutsStack.peek();
        assertEquals(666, element);
    }

}
