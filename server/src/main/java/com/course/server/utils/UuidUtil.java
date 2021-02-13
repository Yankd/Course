package com.course.server.utils;

import java.util.UUID;

/**
 * @auther Yankd
 * @date 2021/2/12 0012 14:06
 */
public class UuidUtil {
    public static String[] chars = new String[]{"a","b","c","d","e","f",
            "g","h","i","j","k","l","m","n","o","p","q","r","s",
            "t","u","v","w","x","y","z","0","1","2","3","4","5",
            "6","7","8","9","A","B","C","D","E","F","G","H","I",
            "j","K","L","M","N","O","P","Q","R","S","T","U","V",
            "W","X","Y","Z"};

    /**
     * 获取短的Uuid
     */

    public static String getShortUuid(){
        StringBuffer shortBuffer = new StringBuffer ();
        String uuid = UuidUtil.getUuid();
        for(int i = 0;i<8;i++){
            String str = uuid.substring (i*4,i*4+4);
            int x = Integer.parseInt (str,16);
            shortBuffer.append (chars[x % 0x3E]);//对62取余
        }
        return shortBuffer.toString ();
    }

    /**
     * 获取32位Uuid
     */
    public static String getUuid(){
        String uuid = UUID.randomUUID ().toString ();
        //去掉"-"符号
        return uuid.replaceAll ("-", "");
    }

    public static void main(String[] args) {
        System.out.println (getShortUuid ());
    }
}
