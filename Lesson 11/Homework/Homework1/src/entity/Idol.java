package entity;

import java.util.ArrayList;

public class Idol {
    private int id;
    private String name;
    private String email;
    private ArrayList<Follower> followers;
    private String group;

    public Idol(int id, String name, String email, ArrayList<Follower> followerArrayList, String group) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.followers = followerArrayList;
        this.group = group;
    }

    public Idol() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Follower> getFollowers() {
        return followers;
    }

    public void setFollowers(ArrayList<Follower> followers) {
        this.followers = followers;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "entity.Idol{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", followers=" + followers +
                ", group='" + group + '\'' +
                '}';
    }
}


//      Tạo 1 lớp entity.Idol: name, id, email, followers(Những người theo dõi),(String) group