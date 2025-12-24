package com.yaoyan.game.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 响应状态码枚举
 */
@Getter
@AllArgsConstructor
public enum ResultCode {

    /* 成功状态码 */
    SUCCESS(200, "操作成功"),

    /* 客户端错误 4xx */
    BAD_REQUEST(400, "请求参数错误"),
    UNAUTHORIZED(401, "未授权，请先登录"),
    FORBIDDEN(403, "无权限访问"),
    NOT_FOUND(404, "请求资源不存在"),
    METHOD_NOT_ALLOWED(405, "请求方法不支持"),
    CONFLICT(409, "资源冲突"),

    /* 服务器错误 5xx */
    ERROR(500, "服务器内部错误"),
    SERVICE_UNAVAILABLE(503, "服务暂不可用"),

    /* 业务错误码 6xxx */
    USER_NOT_EXIST(6001, "用户不存在"),
    USER_ALREADY_EXIST(6002, "用户已存在"),
    PASSWORD_ERROR(6003, "密码错误"),
    TOKEN_INVALID(6004, "Token无效或已过期"),
    TOKEN_EXPIRED(6005, "Token已过期"),

    /* TripoAI相关错误 7xxx */
    TRIPOAI_API_ERROR(7001, "TripoAI API调用失败"),
    TRIPOAI_TIMEOUT(7002, "TripoAI请求超时"),
    MODEL_GENERATION_FAILED(7003, "3D模型生成失败"),
    MODEL_NOT_FOUND(7004, "模型不存在"),
    TASK_NOT_FOUND(7005, "任务不存在"),
    TASK_PROCESSING(7006, "任务正在处理中"),

    /* 文件相关错误 8xxx */
    FILE_UPLOAD_ERROR(8001, "文件上传失败"),
    FILE_TYPE_ERROR(8002, "文件类型不支持"),
    FILE_SIZE_EXCEEDED(8003, "文件大小超出限制"),
    FILE_NOT_FOUND(8004, "文件不存在"),

    /* 参数校验错误 9xxx */
    PARAM_ERROR(9001, "参数校验失败"),
    PARAM_MISSING(9002, "缺少必要参数");

    /**
     * 状态码
     */
    private final Integer code;

    /**
     * 提示信息
     */
    private final String message;
}
