package net.hwyz.iov.cloud.iov.idk.api.fallback;

import lombok.extern.slf4j.Slf4j;
import net.hwyz.iov.cloud.iov.idk.api.vo.request.BatchImportBtmRequest;
import net.hwyz.iov.cloud.iov.idk.api.service.IdkBtmInfoService;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * 蓝牙模块信息相关服务降级处理
 *
 * @author hwyz_leo
 */
@Slf4j
@Component
public class IdkBtmInfoServiceFallbackFactory implements FallbackFactory<IdkBtmInfoService> {

    @Override
    public IdkBtmInfoService create(Throwable throwable) {
        return new IdkBtmInfoService() {
            @Override
            public void batchImport(BatchImportBtmRequest request) {
                log.error("蓝牙模块信息相关服务批量导入蓝牙模块数据[{}]调用异常", request.getBatchNum(), throwable);
            }
        };
    }
}
