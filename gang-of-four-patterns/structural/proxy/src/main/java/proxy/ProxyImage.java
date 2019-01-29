package proxy;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;

@Log
@RequiredArgsConstructor
public class ProxyImage implements Image {

    private final String fileName;
    private RealImage realImage;

    @Override
    public void display() {
        log.info("Display Proxy image");
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }

        realImage.display();
    }
}
