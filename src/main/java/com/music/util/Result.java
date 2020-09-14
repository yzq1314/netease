package com.music.util;

import java.util.HashMap;

/**
 * 统一返回类型
 */
public class Result extends HashMap<String, Object> {

    private static final String CODE = "code";

    private static final String MESSAGE = "message";

    private static final String DATA = "data";

    public Result(){}

    public Result(int code, String message) {
        super.put(CODE, code);
        super.put(MESSAGE, message);
    }

    public Result(int code, String message, Object data) {
        super.put(CODE, code);
        super.put(MESSAGE, message);
        super.put(DATA, data);
    }

    public static Result success() {
        return Result.success("操作成功");
    }

    public static Result success(String message) {
        return Result.success(message, null);
    }

    public static Result success(Object data) {
        return Result.success("操作成功", null);
    }

    public static Result success(String message, Object data) {
        return new Result(HttpStatus.SUCCESS, message, data);
    }

}
