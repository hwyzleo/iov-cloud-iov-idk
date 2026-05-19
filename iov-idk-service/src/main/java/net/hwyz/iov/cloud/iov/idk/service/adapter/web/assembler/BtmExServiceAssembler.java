package net.hwyz.iov.cloud.iov.idk.service.adapter.web.assembler;

import net.hwyz.iov.cloud.iov.idk.api.vo.BtmVo;
import net.hwyz.iov.cloud.iov.idk.api.vo.request.BatchImportBtmRequest;
import net.hwyz.iov.cloud.iov.idk.service.application.dto.cmd.BtmDto;
import net.hwyz.iov.cloud.iov.idk.service.application.dto.cmd.BtmImportCmd;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * 对外服务蓝牙模块信息转换类
 *
 * @author hwyz_leo
 */
@Mapper
public interface BtmExServiceAssembler {

    BtmExServiceAssembler INSTANCE = Mappers.getMapper(BtmExServiceAssembler.class);

    BtmDto toDto(BtmVo vo);

    List<BtmDto> toDtoList(List<BtmVo> voList);

    BtmImportCmd toCmd(BatchImportBtmRequest request);
}