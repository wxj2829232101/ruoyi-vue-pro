package cn.iocoder.yudao.module.iot.service.device;

import java.util.*;
import javax.validation.*;
import cn.iocoder.yudao.module.iot.controller.admin.device.vo.*;
import cn.iocoder.yudao.module.iot.dal.dataobject.device.DeviceDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;

/**
 * 设备组 Service 接口
 *
 * @author 芋道源码
 */
public interface DeviceService {

    /**
     * 创建设备组
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Long createDevice(@Valid DeviceSaveReqVO createReqVO);

    /**
     * 更新设备组
     *
     * @param updateReqVO 更新信息
     */
    void updateDevice(@Valid DeviceSaveReqVO updateReqVO);

    /**
     * 删除设备组
     *
     * @param id 编号
     */
    void deleteDevice(Long id);

    /**
     * 获得设备组
     *
     * @param id 编号
     * @return 设备组
     */
    DeviceDO getDevice(Long id);

    /**
     * 获得设备组分页
     *
     * @param pageReqVO 分页查询
     * @return 设备组分页
     */
    PageResult<DeviceDO> getDevicePage(DevicePageReqVO pageReqVO);

    void deleteDeviceAll();
}