package com.example.administrator.mp3play;

import java.io.Serializable;
import java.util.List;

public class Song implements Serializable {

    /**
     * result : SUCCESS
     * code : 200
     * data : {"songListId":"3778678","songListName":"云音乐热歌榜","songListPic":"https://p2.music.126.net/GhhuF6Ep5Tq9IEvLsyCN7w==/18708190348409091.jpg","songListCount":200,"songListPlayCount":2716866048,"songListDescription":"云音乐热歌榜：云音乐用户一周内收听所有线上歌曲 官方TOP排行榜，每周四更新。","songListUserId":1,"songs":[{"id":"553755659","name":"可不可以","singer":"张紫豪","pic":"https://api.bzqll.com/music/netease/pic?id=553755659&key=579621905","lrc":"https://api.bzqll.com/music/netease/lrc?id=553755659&key=579621905","url":"https://api.bzqll.com/music/netease/url?id=553755659&key=579621905"},{"id":"486814412","name":"沙漠骆驼","singer":"展展与罗罗","pic":"https://api.bzqll.com/music/netease/pic?id=486814412&key=579621905","lrc":"https://api.bzqll.com/music/netease/lrc?id=486814412&key=579621905","url":"https://api.bzqll.com/music/netease/url?id=486814412&key=579621905"},{"id":"574566207","name":"盗将行","singer":"花粥/马雨阳","pic":"https://api.bzqll.com/music/netease/pic?id=574566207&key=579621905","lrc":"https://api.bzqll.com/music/netease/lrc?id=574566207&key=579621905","url":"https://api.bzqll.com/music/netease/url?id=574566207&key=579621905"},{"id":"1293886117","name":"年少有为","singer":"李荣浩","pic":"https://api.bzqll.com/music/netease/pic?id=1293886117&key=579621905","lrc":"https://api.bzqll.com/music/netease/lrc?id=1293886117&key=579621905","url":"https://api.bzqll.com/music/netease/url?id=1293886117&key=579621905"},{"id":"1311319058","name":"东西","singer":"林俊呈","pic":"https://api.bzqll.com/music/netease/pic?id=1311319058&key=579621905","lrc":"https://api.bzqll.com/music/netease/lrc?id=1311319058&key=579621905","url":"https://api.bzqll.com/music/netease/url?id=1311319058&key=579621905"},{"id":"449818741","name":"光年之外","singer":"G.E.M.邓紫棋","pic":"https://api.bzqll.com/music/netease/pic?id=449818741&key=579621905","lrc":"https://api.bzqll.com/music/netease/lrc?id=449818741&key=579621905","url":"https://api.bzqll.com/music/netease/url?id=449818741&key=579621905"},{"id":"863046037","name":"Way Back Home","singer":"SHAUN","pic":"https://api.bzqll.com/music/netease/pic?id=863046037&key=579621905","lrc":"https://api.bzqll.com/music/netease/lrc?id=863046037&key=579621905","url":"https://api.bzqll.com/music/netease/url?id=863046037&key=579621905"},{"id":"1313107065","name":"RISE","singer":"The Glitch Mob/Mako/The Word Alive","pic":"https://api.bzqll.com/music/netease/pic?id=1313107065&key=579621905","lrc":"https://api.bzqll.com/music/netease/lrc?id=1313107065&key=579621905","url":"https://api.bzqll.com/music/netease/url?id=1313107065&key=579621905"},{"id":"571338279","name":"往后余生","singer":"王贰浪","pic":"https://api.bzqll.com/music/netease/pic?id=571338279&key=579621905","lrc":"https://api.bzqll.com/music/netease/lrc?id=571338279&key=579621905","url":"https://api.bzqll.com/music/netease/url?id=571338279&key=579621905"},{"id":"536099160","name":"不染","singer":"毛不易","pic":"https://api.bzqll.com/music/netease/pic?id=536099160&key=579621905","lrc":"https://api.bzqll.com/music/netease/lrc?id=536099160&key=579621905","url":"https://api.bzqll.com/music/netease/url?id=536099160&key=579621905"}]}
     */

    private String result;
    private int code;
    private DataBean data;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean implements Serializable {
        /**
         * songListId : 3778678
         * songListName : 云音乐热歌榜
         * songListPic : https://p2.music.126.net/GhhuF6Ep5Tq9IEvLsyCN7w==/18708190348409091.jpg
         * songListCount : 200
         * songListPlayCount : 2716866048
         * songListDescription : 云音乐热歌榜：云音乐用户一周内收听所有线上歌曲 官方TOP排行榜，每周四更新。
         * songListUserId : 1
         * songs : [{"id":"553755659","name":"可不可以","singer":"张紫豪","pic":"https://api.bzqll.com/music/netease/pic?id=553755659&key=579621905","lrc":"https://api.bzqll.com/music/netease/lrc?id=553755659&key=579621905","url":"https://api.bzqll.com/music/netease/url?id=553755659&key=579621905"},{"id":"486814412","name":"沙漠骆驼","singer":"展展与罗罗","pic":"https://api.bzqll.com/music/netease/pic?id=486814412&key=579621905","lrc":"https://api.bzqll.com/music/netease/lrc?id=486814412&key=579621905","url":"https://api.bzqll.com/music/netease/url?id=486814412&key=579621905"},{"id":"574566207","name":"盗将行","singer":"花粥/马雨阳","pic":"https://api.bzqll.com/music/netease/pic?id=574566207&key=579621905","lrc":"https://api.bzqll.com/music/netease/lrc?id=574566207&key=579621905","url":"https://api.bzqll.com/music/netease/url?id=574566207&key=579621905"},{"id":"1293886117","name":"年少有为","singer":"李荣浩","pic":"https://api.bzqll.com/music/netease/pic?id=1293886117&key=579621905","lrc":"https://api.bzqll.com/music/netease/lrc?id=1293886117&key=579621905","url":"https://api.bzqll.com/music/netease/url?id=1293886117&key=579621905"},{"id":"1311319058","name":"东西","singer":"林俊呈","pic":"https://api.bzqll.com/music/netease/pic?id=1311319058&key=579621905","lrc":"https://api.bzqll.com/music/netease/lrc?id=1311319058&key=579621905","url":"https://api.bzqll.com/music/netease/url?id=1311319058&key=579621905"},{"id":"449818741","name":"光年之外","singer":"G.E.M.邓紫棋","pic":"https://api.bzqll.com/music/netease/pic?id=449818741&key=579621905","lrc":"https://api.bzqll.com/music/netease/lrc?id=449818741&key=579621905","url":"https://api.bzqll.com/music/netease/url?id=449818741&key=579621905"},{"id":"863046037","name":"Way Back Home","singer":"SHAUN","pic":"https://api.bzqll.com/music/netease/pic?id=863046037&key=579621905","lrc":"https://api.bzqll.com/music/netease/lrc?id=863046037&key=579621905","url":"https://api.bzqll.com/music/netease/url?id=863046037&key=579621905"},{"id":"1313107065","name":"RISE","singer":"The Glitch Mob/Mako/The Word Alive","pic":"https://api.bzqll.com/music/netease/pic?id=1313107065&key=579621905","lrc":"https://api.bzqll.com/music/netease/lrc?id=1313107065&key=579621905","url":"https://api.bzqll.com/music/netease/url?id=1313107065&key=579621905"},{"id":"571338279","name":"往后余生","singer":"王贰浪","pic":"https://api.bzqll.com/music/netease/pic?id=571338279&key=579621905","lrc":"https://api.bzqll.com/music/netease/lrc?id=571338279&key=579621905","url":"https://api.bzqll.com/music/netease/url?id=571338279&key=579621905"},{"id":"536099160","name":"不染","singer":"毛不易","pic":"https://api.bzqll.com/music/netease/pic?id=536099160&key=579621905","lrc":"https://api.bzqll.com/music/netease/lrc?id=536099160&key=579621905","url":"https://api.bzqll.com/music/netease/url?id=536099160&key=579621905"}]
         */

        private String songListId;
        private String songListName;
        private String songListPic;
        private int songListCount;
        private long songListPlayCount;
        private String songListDescription;
        private int songListUserId;
        private List<Songs> songs;

        public String getSongListId() {
            return songListId;
        }

        public void setSongListId(String songListId) {
            this.songListId = songListId;
        }

        public String getSongListName() {
            return songListName;
        }

        public void setSongListName(String songListName) {
            this.songListName = songListName;
        }

        public String getSongListPic() {
            return songListPic;
        }

        public void setSongListPic(String songListPic) {
            this.songListPic = songListPic;
        }

        public int getSongListCount() {
            return songListCount;
        }

        public void setSongListCount(int songListCount) {
            this.songListCount = songListCount;
        }

        public long getSongListPlayCount() {
            return songListPlayCount;
        }

        public void setSongListPlayCount(long songListPlayCount) {
            this.songListPlayCount = songListPlayCount;
        }

        public String getSongListDescription() {
            return songListDescription;
        }

        public void setSongListDescription(String songListDescription) {
            this.songListDescription = songListDescription;
        }

        public int getSongListUserId() {
            return songListUserId;
        }

        public void setSongListUserId(int songListUserId) {
            this.songListUserId = songListUserId;
        }

        public List<Songs> getSongs() {
            return songs;
        }

        public void setSongs(List<Songs> songs) {
            this.songs = songs;
        }


        }
}
