package com.example.test.DesignMode.chainOfResp;

import lombok.Data;

/**
 * 抽象类
 */
@Data
public abstract class Leader {

    protected String name;

    protected Leader leader;

    public Leader(String name){
        super();
        this.name=name;
    }

    /**
     * 处理请求的核心业务逻辑
     * @param leaveRequest
     */
    public abstract void handleRequest(LeaveRequest leaveRequest);

}
