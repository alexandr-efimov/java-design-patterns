package proxy;

import lombok.extern.java.Log;

@Log
public class RealImage implements Image {

    private String fileName;

    RealImage(String fileName) {
        this.fileName = fileName;
        loadImage();
    }

    private void loadImage() {
        log.info("Loading heavy image: " + fileName);
    }

    @Override
    public void display() {
        log.info("Display real image: " + fileName);
    }
}
