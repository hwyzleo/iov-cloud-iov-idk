package net.hwyz.iov.cloud.iov.idk.service.adapter.web.controller.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.hwyz.iov.cloud.framework.web.controller.BaseController;
import net.hwyz.iov.cloud.iov.idk.api.vo.request.BatchImportBtmRequest;
import net.hwyz.iov.cloud.iov.idk.service.application.dto.cmd.BtmImportCmd;
import net.hwyz.iov.cloud.iov.idk.service.application.service.BtmInfoAppService;
import net.hwyz.iov.cloud.iov.idk.service.adapter.web.assembler.BtmExServiceAssembler;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 蓝牙模块信息相关服务接口实现类
 *
 * @author hwyz_leo
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/service/btm/v1")
public class ServiceBtmInfoController extends BaseController {

    private final BtmInfoAppService btmInfoAppService;
    private final BtmExServiceAssembler btmExServiceAssembler = BtmExServiceAssembler.INSTANCE;

    @PostMapping("/batchImport")
    public void batchImport(@RequestBody @Validated BatchImportBtmRequest request) {
        log.info("批量导入蓝牙模块数据[{}]", request.getBatchNum());
        BtmImportCmd cmd = btmExServiceAssembler.toCmd(request);
        btmInfoAppService.batchImport(cmd);
    }
}