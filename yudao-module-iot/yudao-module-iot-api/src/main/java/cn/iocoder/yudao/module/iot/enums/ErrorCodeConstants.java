package cn.iocoder.yudao.module.iot.enums;

import cn.iocoder.yudao.framework.common.exception.ErrorCode;

/**
 * Mp 错误码枚举类
 *
 * iot 系统，使用 1-010-000-000 段
 */
public interface ErrorCodeConstants {

    ErrorCode DEVICE_NOT_EXISTS = new ErrorCode(1_010_000_000, "设备组不存在");

}
