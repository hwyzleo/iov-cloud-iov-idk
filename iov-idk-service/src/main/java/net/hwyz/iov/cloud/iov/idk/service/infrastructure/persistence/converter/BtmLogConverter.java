package net.hwyz.iov.cloud.iov.idk.service.infrastructure.persistence.converter;

import net.hwyz.iov.cloud.iov.idk.service.domain.model.entity.BtmLog;
import net.hwyz.iov.cloud.iov.idk.service.infrastructure.persistence.po.BtmLogPo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * 蓝牙模块日志Domain→PO转换器
 *
 * @author hwyz_leo
 */
@Mapper
public interface BtmLogConverter {

    BtmLogConverter INSTANCE = Mappers.getMapper(BtmLogConverter.class);

    BtmLogPo toPo(BtmLog btmLog);
}