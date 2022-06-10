package dsa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SetTest {

    @Test
    public void setExists(){
        MakingASet serena = new MakingASet();
        assertNotNull(serena);
    }

    @Test
    public void setIsEmpty(){
        MakingASet germanicLang = new MakingASet();
        assertTrue(germanicLang.isEmpty());
    }

    @Test
    public void setIsNOTEmpty(){
        MakingASet germanicLang = new MakingASet();
        germanicLang.add("Norwegian");
        assertFalse(germanicLang.isEmpty());
    }

    @Test
    public void addToSet(){
        MakingASet germanicLang = new MakingASet();
        germanicLang.add("English");
        germanicLang.add("German");
        germanicLang.add("Dutch");

        assertEquals(3, germanicLang.size());
    }

    @Test
    public void clearTest(){
        MakingASet germanicLang = new MakingASet();
        germanicLang.add("Frisian");
        germanicLang.add("Swiss German");
        germanicLang.add("Afrikaans");

        germanicLang.clear();

        assertEquals(0,germanicLang.size());
    }

    @Test
    public void removeTest(){
        MakingASet germanicLang = new MakingASet();
        germanicLang.add("German");
        germanicLang.add("Yiddish");
        germanicLang.add("Scots");

        germanicLang.remove("Scots");

        assertEquals(2, germanicLang.size());
    }

    @Test
    public void addAllFromCollectionTest(){
        MakingASet germanicLang = new MakingASet();
        MakingASet romanticLang = new MakingASet();

        germanicLang.add("German");
        germanicLang.add("Scots");
        germanicLang.add("AAVE");

        romanticLang.add("Spanish");
        romanticLang.add("Catalan");
        romanticLang.add("French");

        germanicLang.addAll(romanticLang);

        assertEquals(6,germanicLang.size());
    }



}
