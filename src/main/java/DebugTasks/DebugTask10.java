package DebugTasks;

import java.util.*;
public class DebugTask10 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));
        names.removeIf(string -> string.toLowerCase().startsWith("a"));
        System.out.println(names);
    }
}
