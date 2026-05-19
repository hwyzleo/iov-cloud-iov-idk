package net.hwyz.iov.cloud.iov.idk.service.infrastructure.persistence.converter;

import net.hwyz.iov.cloud.iov.idk.service.domain.model.entity.Btm;
import net.hwyz.iov.cloud.iov.idk.service.infrastructure.persistence.po.BtmPo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.factory.Mappers;

/**
 * 蓝牙模块Domain→PO转换器
 *
 * @author hwyz_leo
 */
@Mapper
public interface BtmConverter {

    BtmConverter INSTANCE = Mappers.getMapper(BtmConverter.class);

    BtmPo toPo(Btm btm);

    Btm toDomain(BtmPo po);
}