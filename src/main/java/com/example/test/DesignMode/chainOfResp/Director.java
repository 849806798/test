package com.example.test.DesignMode.chainOfResp;

/**
 * 主任
 * @author Administrator
 *
 */
public class Director extends Leader {



    public Director(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if(request.getLeaveDays() < 3){
            System.out.println("员工"+request.getEmpName()+"请假 天数"+request.getLeaveDays()+"理由："+request.getReason());
            System.out.println("主任:"+this.name+"审批通过");
        }else{
            if(this.getLeader()!= null){
                this.getLeader().handleRequest(request);
            }
        }
    }
}
