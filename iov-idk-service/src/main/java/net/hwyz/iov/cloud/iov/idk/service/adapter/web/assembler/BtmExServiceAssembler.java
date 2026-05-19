package net.hwyz.iov.cloud.iov.idk.service.adapter.web.assembler;

import net.hwyz.iov.cloud.iov.idk.api.vo.BtmVo;
import net.hwyz.iov.cloud.iov.idk.service.infrastructure.persistence.po.BtmPo;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
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

    /**
     * 数据传输对象转数据对象
     *
     * @param btmExService 数据传输对象
     * @return 数据对象
     */
    @Mappings({})
    BtmPo toPo(BtmVo btmExService);

    /**
     * 数据对象列表转数据传输对象列表
     *
     * @param btmExServiceList 数据传输对象列表
     * @return 数据对象列表
     */
    List<BtmPo> toPoList(List<BtmVo> btmExServiceList);

}
