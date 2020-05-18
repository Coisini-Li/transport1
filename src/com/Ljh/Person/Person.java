package com.Ljh.Person;

import com.Ljh.Transport.*;

/**
 * @description:
 * @author: LiJiaHao
 * @date: Created in 2020/5/17 17:18
 * @version: 1.0
 * @modified By:
 */
public class Person {
    private int p_Age;
    private String p_Sex;
    private String id;
    private String p_Name;

    public void drivingTransprot(Aircraft aircraft){
        System.out.println("driving aircraft    "+aircraft.getId());
    }
    public void drivingTransprot(Airship airship){
        System.out.println("driving airship "+airship.getId());
    }
    public void drivingTransprot(Automobile automobile){
        System.out.println("driving automobile  "+automobile.getId());
    }
    public void drivingTransprot(Bicycle bicycle){
        System.out.println("driving bicycle "+bicycle.getId());
    }
    public void drivingTransprot(HotAirBalloon hotAirBalloon){
        System.out.println("driving hotAirBalloon   "+hotAirBalloon.getId());
    }
    public void drivingTransprot(Hovercraft hovercraft){
        System.out.println("driving hovercraft  "+hovercraft.getId());
    }
    public void drivingTransprot(Motorcycle motorcycle){
        System.out.println("driving motorcycle  "+motorcycle.getId());
    }
    public void drivingTransprot(Ship ship){
        System.out.println("driving ship    "+ship.getId());
    }
    public void drivingTransprot(Submarine submarine){
        System.out.println("driving submarine   "+submarine.getId());
    }


    public Person() {
    }

    public int getP_Age() {
        return p_Age;
    }

    public void setP_Age(int p_Age) {
        this.p_Age = p_Age;
    }

    public String getP_Sex() {
        return p_Sex;
    }

    public void setP_Sex(String p_Sex) {
        this.p_Sex = p_Sex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getP_Name() {
        return p_Name;
    }

    public void setP_Name(String p_Name) {
        this.p_Name = p_Name;
    }

    public Person(String id) {
        this.id = id;
    }
}
