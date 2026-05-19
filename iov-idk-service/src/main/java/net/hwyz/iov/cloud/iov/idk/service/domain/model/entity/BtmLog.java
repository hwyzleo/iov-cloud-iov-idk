package net.hwyz.iov.cloud.iov.idk.service.domain.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 蓝牙模块日志领域实体
 *
 * @author hwyz_leo
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BtmLog {

    private String sn;
    private String configWord;
    private String hardwareVer;
    private String softwareVer;
    private String hardwareNo;
    private String softwareNo;
    private String hsm;
    private String mac;
    private String description;
}