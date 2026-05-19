package net.hwyz.iov.cloud.iov.idk.service.application.dto.cmd;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 蓝牙模块数据传输对象
 *
 * @author hwyz_leo
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BtmDto {

    private String sn;
    private String no;
    private String configWord;
    private String hardwareVer;
    private String softwareVer;
    private String hardwareNo;
    private String softwareNo;
    private String hsm;
    private String mac;
}