package com.jarvis.shashankkash.anonytweeter.Model;

/**
 * Created by Shashank Kashyap on 09-01-2018.
 */

public class Tweet {

    public String title;
    public String desc;
    public String image;
    public Long timestamp;
    public String userid;


    public Tweet() {
    }

    public Tweet(String title, String desc, String image, Long timestamp, String userid) {
        this.title = title;
        this.desc = desc;
        this.image = image;
        this.timestamp = timestamp;
        this.userid = userid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
}
