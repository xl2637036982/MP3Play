package com.example.administrator.mp3play;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/12/5.
 */

public class Songs implements Serializable {
    /**
     * id : 553755659
     * name : 可不可以
     * singer : 张紫豪
     * pic : https://api.bzqll.com/music/netease/pic?id=553755659&key=579621905
     * lrc : https://api.bzqll.com/music/netease/lrc?id=553755659&key=579621905
     * url : https://api.bzqll.com/music/netease/url?id=553755659&key=579621905
     */

    private String id;
    private String name;
    private String singer;
    private String pic;
    private String lrc;
    private String url;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getLrc() {
        return lrc;
    }

    public void setLrc(String lrc) {
        this.lrc = lrc;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}