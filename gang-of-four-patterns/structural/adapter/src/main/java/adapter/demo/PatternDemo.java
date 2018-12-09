package adapter.demo;

import adapter.AudioPlayer;
import adapter.AudioType;
import lombok.extern.java.Log;

@Log
public class PatternDemo {

    public static void main(String[] args) {

        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play(AudioType.MP4, "we are the champions.mp4");
        audioPlayer.play(AudioType.VLC, "far far away.vlc");
    }
}
