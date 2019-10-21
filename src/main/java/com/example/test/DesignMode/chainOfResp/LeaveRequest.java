package com.example.test.DesignMode.chainOfResp;

import lombok.Data;

@Data
public class LeaveRequest {

    private String empName;

    private int leaveDays;

    private String reason;

    public LeaveRequest(String empName, int leaveDays, String reason) {
        super();
        this.empName = empName;
        this.leaveDays = leaveDays;
        this.reason = reason;
    }
}
