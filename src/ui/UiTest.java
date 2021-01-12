package ui;

import bean.Flight;

import java.util.Scanner;

public class UiTest {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        while(ture){
            System.out.println("**航空系统为您服务，请输入对应功能序号：**");
            System.out.println("1.乘客信息录入\n2.乘客信息显示\n3.查询航班信息\n4.机票预定\n5.机票退订\n6.退出系统+");

            int choice = sc.nextInt();
            if (choice == 1){
                String id = UUID.randomUUID().toString();

                System.out.println("请输入航班编号：");
                String fightId = sc.next();

                System.out.println("请输入机型：");
                String planeType = sc.next();

                System.out.println("请输入座位数：");
                int currentSeatsNum = sc.nextInt();

                System.out.println("请输入起飞机场：");
                String departureAirPort = sc.next();

                System.out.println("请输入目的机场：");
                String destinationAirPort = sc.next();

                System.out.println("请输入起飞时间：");
                String departureTime = sc.next():

                Flight flight = new Flight(id,flightId,planeType,currentSeatsNum,
                        departureAirPort,destinationAirPort,departureTime);


            }
        }
    }
}
