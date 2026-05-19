package net.hwyz.iov.cloud.iov.idk.service.domain.repository;

import net.hwyz.iov.cloud.iov.idk.service.domain.model.entity.Btm;

/**
 * 蓝牙模块Repository接口
 *
 * @author hwyz_leo
 */
public interface BtmRepository {

    Btm findBySn(String sn);

    void save(Btm btm);
}