package chapter7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PixelQuantizationTest {

    @Test
    public void valuesInTheArrayAreQuantizedTest(){
        // given
        int[] pixels = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 114, 125, 135, 142, 158, 167, 173, 182, 199};
        // when
        PixelQuantization pixelQuantization = new PixelQuantization();
        pixelQuantization.quantize(pixels);
        // assert
        assertEquals(10, pixels[1]);
    }

}