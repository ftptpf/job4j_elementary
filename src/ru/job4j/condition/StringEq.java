package ru.job4j.condition;

public class StringEq {

    public static boolean check(String login) {
        String root = new String("root");
        boolean access = root.equals(login);
        return access;
    }

    public static void main(String[] args) {
        String your = "admin";
        boolean userHasAccess = StringEq.check(your);
        System.out.println(userHasAccess);
    }
}
