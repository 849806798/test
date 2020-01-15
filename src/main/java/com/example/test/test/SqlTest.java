package com.example.test.test;

import com.example.test.Util.SqlUtils;
import com.example.test.dto.FinStockMonthDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author: fgw
 * @Created: 2019/12/30 13:13
 */
public class SqlTest {

    public static void main(String[] args) {

    }

    public List<FinStockMonthDTO> selectZeroOrNegativeStock(){

        List<FinStockMonthDTO> finStockDTOS=new ArrayList<>();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Connection connection = null;
        PreparedStatement statement = null;

        try{
            connection = SqlUtils.getConnection();
            StringBuffer sql=new StringBuffer("  SELECT TOP  * FROM(  SELECT ROW_NUMBER() OVER (ORDER BY dat desc) AS RowNumber,f.netid as netid,\n" +
                    "        f.pluid as pluid,f.comid as comid,m.pluname as pluname,m.slprc,\n" +
                    "        bcd.bcd as bcd,c.name as netName,c1.name as comName,f.vld_qty as vldQty,\n" +
                    "        f.dat as dat FROM FIN_STOCK f\n" +
                    "        inner JOIN bas_plu_main m ON f.pluid = m.pluid\n" +
                    "        inner JOIN bas_company c ON c.comid = f.netid\n" +
                    "        inner JOIN bas_company c1 ON c1.comid = f.comid\n" +
                    "        inner JOIN bas_plu_bcd bcd ON bcd.pluid=f.pluid\n" +
                    "        where 1=1 ");


            statement =connection.prepareStatement(sql.toString());



            ResultSet rs = statement.executeQuery();

            while(rs.next()){

            }

        }catch (Exception e){

        }finally {
            try {
                SqlUtils.closeConnection(connection);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return finStockDTOS;
    }
}
