package uvsq.m1.gl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void testPersonnel() {
    	
    	Personnel p1 = new Personnel.Builder("Marc", "Gomez", "Doctor").build();
    	
    	assertEquals("Marc", p1.getNom());
    	
    }
}

