package net.hwyz.iov.cloud.iov.idk.service.infrastructure.persistence.mapper;

import net.hwyz.iov.cloud.iov.idk.service.infrastructure.persistence.po.BtmPo;
import net.hwyz.iov.cloud.framework.mysql.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 蓝牙模块信息表 DAO
 * </p>
 *
 * @author hwyz_leo
 * @since 2025-05-14
 */
@Mapper
public interface BtmMapper extends BaseDao<BtmPo, Long> {

    /**
     * 根据序列号查询蓝牙模块信息
     *
     * @param sn 序列号
     * @return 蓝牙模块信息
     */
    BtmPo selectBySn(String sn);

}
