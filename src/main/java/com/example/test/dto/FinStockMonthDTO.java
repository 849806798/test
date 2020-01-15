package com.example.test.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: fgw
 * @Description：
 * @Created: 2019/12/20
 */
@Data
public class FinStockMonthDTO {

    private Long id;

    private String netName;

    private BigDecimal sku;

    private BigDecimal LastStock;

    private BigDecimal ThisStock;

    private BigDecimal LastZero;

    private BigDecimal ThisZero;

    private BigDecimal LastBestSell;

    private BigDecimal ThisBestSell;
}
