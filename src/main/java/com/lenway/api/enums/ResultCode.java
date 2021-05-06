package com.lenway.api.enums;

import lombok.Getter;

@Getter
public enum ResultCode {

    SUCCESS(0, "操作成功"),
    FAILED(-1, "响应失败"),
    VALIDATE_FAILED(-2, "参数校验失败"),
    UNEXIST_URL(404, "URL不存在"),
    ERROR(5000, "未知错误");

    private int code;
    private String msg;

    ResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}

