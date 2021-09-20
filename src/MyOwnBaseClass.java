import java.util.Objects;

public class MyOwnBaseClass {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyOwnBaseClass that = (MyOwnBaseClass) o;
        return Objects.equals(user1, that.user1) && Objects.equals(user2, that.user2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user1, user2);
    }

    String user1 = "Bob";
    String user2 = "Jhon";
}
