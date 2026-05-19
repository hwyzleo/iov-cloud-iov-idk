package net.hwyz.iov.cloud.iov.idk.service.domain.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 蓝牙模块领域实体
 *
 * @author hwyz_leo
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Btm {

    private String sn;
    private String no;
    private String configWord;
    private String supplierCode;
    private String hardwareVer;
    private String softwareVer;
    private String hardwareNo;
    private String softwareNo;
    private String hsm;
    private String mac;

    public boolean isNew() {
        return sn != null && !sn.isEmpty();
    }
}