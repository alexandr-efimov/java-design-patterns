package adapter;

import lombok.extern.java.Log;

@Log
public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        log.info("Play VLC! File: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        throw new UnsupportedOperationException("MP4 not supported");
    }
}
