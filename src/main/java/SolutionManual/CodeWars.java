package SolutionManual;

import SolutionManual.Jenerics.User;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;

import java.util.*;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class CodeWars {

    public static List<Integer> sortedPrice(List<User> list){
        return list.stream()
                .map(user -> user.price())
                .sorted()
                .collect(Collectors.toList());
    }


    public static void main(String[] args) {
        List<User> users = new ArrayList<User>();
        users.add(new User(222221));
        users.add(new User(121));
        users.add(new User(131));
        users.add(new User(1));
        System.out.println(sortedPrice(users));
    }
}
