package adapter;

public enum AudioType {

    VLC, MP4;

    boolean isMP4() {
        return this == MP4;
    }

    boolean isVLC() {
        return this == VLC;
    }
}
