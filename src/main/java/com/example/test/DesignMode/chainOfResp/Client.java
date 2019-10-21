package com.example.test.DesignMode.chainOfResp;

public class Client {
    public static void main(String[] args) {
        Leader leaderA=new GeneralManager("张三");
        Leader leaderB=new ViceGeneralManager("王五");
        Leader leaderC=new Director("李四");

        leaderC.setLeader(leaderB);

        leaderB.setLeader(leaderA);


        //开始请假操作
        LeaveRequest req1 = new LeaveRequest("Tom", 10, "回英国老家");
        leaderC.handleRequest(req1);
    }
}
