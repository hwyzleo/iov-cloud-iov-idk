package net.hwyz.iov.cloud.iov.idk.api.service;

import net.hwyz.iov.cloud.framework.common.constant.ServiceNameConstants;
import net.hwyz.iov.cloud.iov.idk.api.vo.request.BatchImportBtmRequest;
import net.hwyz.iov.cloud.iov.idk.api.fallback.IdkBtmInfoServiceFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 蓝牙模块信息相关服务接口
 *
 * @author hwyz_leo
 */
@FeignClient(contextId = "idkBtmInfoService", value = ServiceNameConstants.IOV_IDK, path = "/api/service/btm/v1", fallbackFactory = IdkBtmInfoServiceFallbackFactory.class)
public interface IdkBtmInfoService {

    /**
     * 批量导入蓝牙模块数据
     *
     * @param request 批量导入蓝牙模块请求
     */
    @PostMapping("/batchImport")
    void batchImport(@RequestBody @Validated BatchImportBtmRequest request);

}
