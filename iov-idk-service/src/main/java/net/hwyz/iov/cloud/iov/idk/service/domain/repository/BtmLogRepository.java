package net.hwyz.iov.cloud.iov.idk.service.domain.repository;

import net.hwyz.iov.cloud.iov.idk.service.domain.model.entity.BtmLog;

/**
 * 蓝牙模块日志Repository接口
 *
 * @author hwyz_leo
 */
public interface BtmLogRepository {

    void save(BtmLog btmLog);
}