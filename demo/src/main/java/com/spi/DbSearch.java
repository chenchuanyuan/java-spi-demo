package com.spi;

/**
 * @author CCY
 */
public class DbSearch implements Search {
    public String doWork(String key) {
        return "方法运行，使用方式DbSearch :" + key;
    }
}
