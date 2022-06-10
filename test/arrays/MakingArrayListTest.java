package arrays;

import arraylists.MakingAnArrayList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MakingArrayListTest {

    @Test
    public void arraylistExists(){
        MakingAnArrayList languages = new MakingAnArrayList();
        assertNotNull(languages);
    }

    @Test
    public void addTest(){
        MakingAnArrayList languages = new MakingAnArrayList();
        languages.add("Spanish");
        languages.add("Danish");
        languages.add("Swedish");
        assertEquals(3, languages.size());
    }

    @Test
    public void getTest(){
        MakingAnArrayList languages = new MakingAnArrayList();
        languages.add("Spanish");
        languages.add("Quechua");
        languages.add("Nahuatl");
        languages.add("Tagalog");

//        languages.get();
    }

    @Test
    public void removeTest(){
        MakingAnArrayList languages = new MakingAnArrayList();
        languages.remove("German");
        assertEquals(0, languages.size());
    }
}
