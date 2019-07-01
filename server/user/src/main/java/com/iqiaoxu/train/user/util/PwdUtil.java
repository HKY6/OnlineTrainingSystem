package com.iqiaoxu.train.user.util;

import java.security.SecureRandom;

/**
 * @author 游由
 * @version 0.0.1
 * @since 0.0.1
 * create time 2019/7/1 16:30
 */
public class PwdUtil {
    private final static SecureRandom secureRandom = new SecureRandom();
    private final static int SaltLength = 16;

    /**
     * 获取16位盐
     *
     * @return 返回盐
     */
    public static String getSalt() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < SaltLength; i++)
            sb.append((char) (secureRandom.nextInt(94) + 33));//ASCII可见字符
        return sb.toString();
    }

    /**
     * MD5摘要
     *
     * @param pwd  密码
     * @param salt 盐
     * @return 密码md5加盐摘要
     */
    public static String md5hash(String pwd, String salt) {
        return MD5Util.hash(pwd + salt);
    }

    /**
     * 验证密码
     *
     * @param pwdHash 摘要
     * @param pwd     明文密码
     * @param salt    盐
     * @return 是否验证通过
     */
    public static boolean verify(String pwdHash, String pwd, String salt) {
        return MD5Util.verify(pwdHash, pwd + salt);
    }
}
