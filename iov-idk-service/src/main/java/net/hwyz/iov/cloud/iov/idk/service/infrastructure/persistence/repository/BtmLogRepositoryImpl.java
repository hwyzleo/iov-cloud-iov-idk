package net.hwyz.iov.cloud.iov.idk.service.infrastructure.persistence.repository;

import lombok.RequiredArgsConstructor;
import net.hwyz.iov.cloud.iov.idk.service.domain.model.entity.BtmLog;
import net.hwyz.iov.cloud.iov.idk.service.domain.repository.BtmLogRepository;
import net.hwyz.iov.cloud.iov.idk.service.infrastructure.persistence.converter.BtmLogConverter;
import net.hwyz.iov.cloud.iov.idk.service.infrastructure.persistence.mapper.BtmLogMapper;
import net.hwyz.iov.cloud.iov.idk.service.infrastructure.persistence.po.BtmLogPo;
import org.springframework.stereotype.Repository;

/**
 * 蓝牙模块日志Repository实现
 *
 * @author hwyz_leo
 */
@Repository
@RequiredArgsConstructor
public class BtmLogRepositoryImpl implements BtmLogRepository {

    private final BtmLogMapper btmLogMapper;
    private final BtmLogConverter btmLogConverter = BtmLogConverter.INSTANCE;

    @Override
    public void save(BtmLog btmLog) {
        BtmLogPo po = btmLogConverter.toPo(btmLog);
        btmLogMapper.insertPo(po);
    }
}