package com.javarush.task.task17.task1714;

/* 
Comparable
*/

public class Beach implements Comparable<Beach> {
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
    public synchronized int compareTo(Beach o) {

//        if(distance + quality > o.distance + o.quality)return quality;
//        else if (distance + quality < o.distance + o.quality) return 0 - quality;
//        return 0;
        return (quality - o.getQuality()) + (int)(o.getDistance()-distance);

    }



    public static void main(String[] args) {

//        Beach x = new Beach("камс",22, 5);
//        Beach y = new Beach("скулянка",22, 5);
//
//        System.out.println("x = " + x.compareTo(y));
//        System.out.println("y = " + y.compareTo(x));
    }


}
