package com.ktyiqiao.etl;
import java.io.File;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * IntelliJ IDEA.
 * com.ktyiqiao.etl.
 * Created by guanyu on 2018/7/27下午1:56.
 * Copyright (c) 2018年 guanyu. All rights reserved.
 */
public class Test {
    public static void Test()throws Exception {
        File file = new File("/kettle_demo/his_main_job/his/ceshi_his/etl-test.txt");
        FileWriter fw = new FileWriter(file);
        Date d = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        fw.write(df.format(d));
        fw.close();
    }

    public static void main(String[] args) throws Exception {

        //Test ts = new Test();
        Test();
    }
}
