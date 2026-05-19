package net.hwyz.iov.cloud.iov.idk.service.application.assembler;

import net.hwyz.iov.cloud.iov.idk.service.application.dto.cmd.BtmDto;
import net.hwyz.iov.cloud.iov.idk.service.domain.model.entity.Btm;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * 蓝牙模块DTO→Domain转换器
 *
 * @author hwyz_leo
 */
@Mapper
public interface BtmAssembler {

    BtmAssembler INSTANCE = Mappers.getMapper(BtmAssembler.class);

    Btm toDomain(BtmDto dto);

    List<Btm> toDomainList(List<BtmDto> dtoList);
}