package com.initkay.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;

/**
 * Created with IntelliJ IDEA.
 * author: initKay
 * Date: 2018/1/3
 * Time: 11:52
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class MathPrecision {
    private static BigDecimal bigDecial_01;
    private static BigDecimal bigDecial_02;
    //处理精度的加法
    public static double add(String a,String b){
        if (a==null||a.equals("")){
            a="0";
        }else {
            a = a.replaceAll(",", "");
        }
        if (b==null||b.equals("")){
            b="0";
        }else {
            b = b.replaceAll(",", "");
        }
        bigDecial_01=new BigDecimal(a);
        bigDecial_02=new BigDecimal(b);
        return bigDecial_01.add(bigDecial_02).doubleValue(); }

    //处理精度的减法
    public static double subtract(String a,String b){
        if (a==null||a.equals("")){
            a="0";
        }else {
            a = a.replaceAll(",", "");
        }
        if (b==null||b.equals("")){
            b="0";
        }else {
            b = b.replaceAll(",", "");
        }
        bigDecial_01=new BigDecimal(a);
        bigDecial_02=new BigDecimal(b);
        return bigDecial_01.subtract(bigDecial_02).doubleValue();
    }
    public double getDouble(String number) {
        double dounumber = 0.00;
        if (!number.equals("")) {
            try {
                dounumber = new DecimalFormat().parse(number).doubleValue();
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return dounumber;
    }
}
