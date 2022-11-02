package chapter7;

public class PixelQuantization {

    public void quantize(int[] pixels) {
        for (int i = 0; i < pixels.length; i++){
            if (pixels[i] >= 0 && pixels[i] <= 20) pixels[i] = 10;
            if (pixels[i] >= 21 && pixels[i] <= 40) pixels[i] = 30;
            if (pixels[i] >= 41 && pixels[i] <= 60) pixels[i] = 50;
            if (pixels[i] >= 61 && pixels[i] <= 80) pixels[i] = 70;
            if (pixels[i] >= 81 && pixels[i] <= 100) pixels[i] = 90;
            if (pixels[i] >= 101 && pixels[i] <= 120) pixels[i] = 110;
            if (pixels[i] >= 121 && pixels[i] <= 140) pixels[i] = 130;
            if (pixels[i] >= 141 && pixels[i] <= 160) pixels[i] = 150;
            if (pixels[i] >= 161 && pixels[i] <= 180) pixels[i] = 170;
            if (pixels[i] >= 181) pixels[i] = 190;
        }
    }
}
