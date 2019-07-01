package com.iqiaoxu.train.user.util;

import org.springframework.util.DigestUtils;

import java.util.Objects;

/**
 * @author 游由
 * @version 0.0.1
 * @since 0.0.1
 * create time 2019/7/1 16:28
 */
public class MD5Util {
    public static String hash(String s) {
        return DigestUtils.md5DigestAsHex(s.getBytes());
    }

    public static boolean verify(String hash, String str) {
        return Objects.equals(hash, hash(str));
    }
}
