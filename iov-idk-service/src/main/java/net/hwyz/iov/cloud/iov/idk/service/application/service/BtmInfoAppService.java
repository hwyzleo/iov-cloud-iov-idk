package net.hwyz.iov.cloud.iov.idk.service.application.service;

import cn.hutool.core.util.ObjUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.hwyz.iov.cloud.framework.common.util.StrUtil;
import net.hwyz.iov.cloud.iov.idk.service.application.assembler.BtmAssembler;
import net.hwyz.iov.cloud.iov.idk.service.application.dto.cmd.BtmImportCmd;
import net.hwyz.iov.cloud.iov.idk.service.domain.model.entity.Btm;
import net.hwyz.iov.cloud.iov.idk.service.domain.model.entity.BtmLog;
import net.hwyz.iov.cloud.iov.idk.service.domain.repository.BtmLogRepository;
import net.hwyz.iov.cloud.iov.idk.service.domain.repository.BtmRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 蓝牙模块信息相关应用服务类
 *
 * @author hwyz_leo
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class BtmInfoAppService {

    private final BtmRepository btmRepository;
    private final BtmLogRepository btmLogRepository;
    private final BtmAssembler btmAssembler = BtmAssembler.INSTANCE;

    @Transactional(rollbackFor = Exception.class)
    public void batchImport(BtmImportCmd cmd) {
        String batchNum = cmd.getBatchNum();
        String supplierCode = cmd.getSupplierCode();
        if (StrUtil.isBlank(supplierCode)) {
            log.warn("数据批次[{}]蓝牙模块信息供应商编码为空", batchNum);
        }
        for (Btm btm : btmAssembler.toDomainList(cmd.getBtmList())) {
            if (ObjUtil.isNull(btmRepository.findBySn(btm.getSn()))) {
                btm.setSupplierCode(supplierCode);
                btmRepository.save(btm);
                recordLog(btm, "数据批次[" + batchNum + "]数据导入");
            } else {
                log.warn("数据批次[{}]蓝牙模块信息[{}]已存在", batchNum, btm.getSn());
            }
        }
    }

    private void recordLog(Btm btm, String remark) {
        BtmLog btmLog = BtmLog.builder()
                .sn(btm.getSn())
                .configWord(btm.getConfigWord())
                .hardwareVer(btm.getHardwareVer())
                .softwareVer(btm.getSoftwareVer())
                .hardwareNo(btm.getHardwareNo())
                .softwareNo(btm.getSoftwareNo())
                .hsm(btm.getHsm())
                .mac(btm.getMac())
                .description(remark)
                .build();
        btmLogRepository.save(btmLog);
    }
}