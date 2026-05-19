package net.hwyz.iov.cloud.iov.idk.service.infrastructure.persistence.repository;

import lombok.RequiredArgsConstructor;
import net.hwyz.iov.cloud.iov.idk.service.domain.model.entity.Btm;
import net.hwyz.iov.cloud.iov.idk.service.domain.repository.BtmRepository;
import net.hwyz.iov.cloud.iov.idk.service.infrastructure.persistence.converter.BtmConverter;
import net.hwyz.iov.cloud.iov.idk.service.infrastructure.persistence.mapper.BtmMapper;
import net.hwyz.iov.cloud.iov.idk.service.infrastructure.persistence.po.BtmPo;
import org.springframework.stereotype.Repository;

/**
 * 蓝牙模块Repository实现
 *
 * @author hwyz_leo
 */
@Repository
@RequiredArgsConstructor
public class BtmRepositoryImpl implements BtmRepository {

    private final BtmMapper btmMapper;
    private final BtmConverter btmConverter = BtmConverter.INSTANCE;

    @Override
    public Btm findBySn(String sn) {
        BtmPo po = btmMapper.selectBySn(sn);
        return po != null ? btmConverter.toDomain(po) : null;
    }

    @Override
    public void save(Btm btm) {
        BtmPo po = btmConverter.toPo(btm);
        btmMapper.insertPo(po);
    }
}