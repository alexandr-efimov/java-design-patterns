package adapter;

public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(AudioType audioType) {
        if (audioType.isMP4()) {
            this.advancedMediaPlayer = new Mp4Player();
        } else {
            this.advancedMediaPlayer = new VlcPlayer();
        }
    }

    @Override
    public void play(AudioType audioType, String fileName) {
        if (audioType.isVLC()) {
            advancedMediaPlayer.playVlc(fileName);
        } else {
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
