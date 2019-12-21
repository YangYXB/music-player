package com.yxb.yxb_player;

public class Music {
    private String nameM;
    private String singer;
    private String path;


    public Music(String nameM, String path) {
        this.nameM = nameM;
        //this.singer = singer;
        this.path = path;
    }

    public void setNameM(String nameM) {
        this.nameM = nameM;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getNameM() {
        return nameM;
    }

    public String getPath() {
        return path;
    }

    public String getSinger() {
        return singer;
    }
}