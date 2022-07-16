package com.OOP;

//import java.util.Scanner;

public class Room {
//     Scanner in = new Scanner(System.in);
     int roomno;
     String  roomtype;
     float roomarea;

    public static void main(String[] args) {
        Room room = new Room();
        room.setdata();
        room.displaydata();

    }

   void displaydata() {
        System.out.println("Room number is : " + roomno );
       System.out.println("Room type is : " + roomtype);
       System.out.println("Room area is : " + roomarea);
    }

   void setdata() {
        roomno = 227;
        roomtype = "Delux";
        roomarea = 130.55f;
    }
}
