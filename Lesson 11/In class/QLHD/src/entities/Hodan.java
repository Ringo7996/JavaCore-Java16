package entities;

import java.util.ArrayList;

public class Hodan {
    private int id;
    private String address;
    private ArrayList<Member> members;

    public Hodan(String address, ArrayList<Member> members) {
        this.address = address;
        this.members = members;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Member> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<Member> members) {
        this.members = members;
    }


    @Override
    public String toString() {
        return "Hodan{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", members=" + members +
                '}';
    }
}



