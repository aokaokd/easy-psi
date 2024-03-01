package org.secretflow.secretpad.service.model.data;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

/**
 * @author chixian
 * @date 2023/11/13
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DataVersionVO {

    @Schema(description = "secretpad tag")
    private String secretpadTag;

    @Schema(description = "kuscia tag")
    private String kusciaTag;

    @Schema(description = "secretflow tag")
    private String secretflowTag;

}
