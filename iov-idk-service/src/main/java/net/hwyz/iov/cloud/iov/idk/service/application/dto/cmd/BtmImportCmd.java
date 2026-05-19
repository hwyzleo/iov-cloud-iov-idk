package net.hwyz.iov.cloud.iov.idk.service.application.dto.cmd;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 批量导入蓝牙模块命令对象
 *
 * @author hwyz_leo
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BtmImportCmd {

    private String batchNum;
    private String supplierCode;
    private List<BtmDto> btmList;
}