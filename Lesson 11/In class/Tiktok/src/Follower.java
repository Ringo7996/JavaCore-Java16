public class Follower {
    private int id;
    private String name;
    private String email;
    private int numberOfLike;

    public Follower(int id, String name, String email, int numberOfLike) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.numberOfLike = numberOfLike;
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

    public int getNumberOfLike() {
        return numberOfLike;
    }

    public void setNumberOfLike(int numberOfLike) {
        this.numberOfLike = numberOfLike;
    }

    public Follower( String name, String email, int numberOfLike) {
        id++;

    }

    @Override
    public String toString() {
        return "Follower{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", numberOfLike=" + numberOfLike +
                '}';
    }
}


///  Follower: name, id, email,(int) numberOfLike