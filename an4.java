@Validate(value = {String.class, Integer.class})
public class an4 {
    private String rank;
    private int surname;

    public an4(String rank, int surname) {
        this.rank = rank;
        this.surname = surname;
    }

    public String toString() {
        return "an4{rank='" + rank + "', surname=" + surname + "}";
    }
}
