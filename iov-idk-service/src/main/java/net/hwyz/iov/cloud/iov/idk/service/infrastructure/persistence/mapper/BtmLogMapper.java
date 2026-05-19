package net.hwyz.iov.cloud.iov.idk.service.infrastructure.persistence.mapper;

import net.hwyz.iov.cloud.iov.idk.service.infrastructure.persistence.po.BtmLogPo;
import net.hwyz.iov.cloud.framework.mysql.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 蓝牙模块信息变更日志表 DAO
 * </p>
 *
 * @author hwyz_leo
 * @since 2025-05-14
 */
@Mapper
public interface BtmLogMapper extends BaseDao<BtmLogPo, Long> {

}
