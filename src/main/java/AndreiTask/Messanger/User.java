package AndreiTask.Messanger;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class User {
    private String name;
    Map<User,Message> myMessage = new TreeMap<>();

    public String getName() {
        return name;
    }

    public Map<User, Message> getMyMessage() {
        return myMessage;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(myMessage, user.myMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, myMessage);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", myMessage=" + myMessage +
                '}';
    }
}
