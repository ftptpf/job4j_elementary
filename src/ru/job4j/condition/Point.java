package ru.job4j.condition;

public class Point {
    public static double distance (int x1, int x2, int y1, int y2){
        double rls =Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        return rls;
    }
    public static  void main (String [] args){
        double result = Point.distance(5,10,25,25);
        System.out.print("Result for x1=5 x2=10 y1=25 y2=25 is " +result);
    }
}
