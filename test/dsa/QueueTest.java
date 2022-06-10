package dsa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {

    @Test
    public void aQueueExists(){
        MakingAQueue baltimore = new MakingAQueue();
        assertNotNull(baltimore);
    }

    @Test
    public void theQueueIsEmpty(){
        MakingAQueue baltimore = new MakingAQueue();
        assertTrue(baltimore.isEmpty());
    }

    @Test
    public void addSomethingToQueue(){
        MakingAQueue baltimore = new MakingAQueue();
        baltimore.enqueue("Lamar Jackson");
        assertEquals(1, baltimore);
    }
}
