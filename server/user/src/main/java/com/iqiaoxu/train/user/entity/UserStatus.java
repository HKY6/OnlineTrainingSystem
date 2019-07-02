package com.iqiaoxu.train.user.entity;

/**
 * @author 游由
 * @version 0.0.1
 * @since 0.0.1
 * create time 2019/7/2 16:49
 */
public enum UserStatus {
    NORMAL(0),
    INACTIVE(1),
    UNVERIFIED(2);
    private int value;
    UserStatus(int value){
        this.value = value;
    }

    public int value(){
        return this.value;
    }
}
