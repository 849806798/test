package com.example.test.DesignMode.chainOfResp;

import lombok.Data;

/**
 * 副总经理
 * @author Administrator
 *
 */
@Data
public class ViceGeneralManager extends Leader {

    //protected String name;

    public ViceGeneralManager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if(request.getLeaveDays() < 20){
            System.out.println("员工"+request.getEmpName()+"请假 天数"+request.getLeaveDays()+"理由："+request.getReason());
            System.out.println("副总经理:"+this.getName()+"审批通过");
        }else{
            this.getLeader().handleRequest(request);
        }
    }
}