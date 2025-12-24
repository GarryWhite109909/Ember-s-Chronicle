package com.yaoyan.game.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

/**
 * 陶器模型生成请求DTO
 */
@Data
@Schema(description = "3D陶器模型生成请求参数")
public class ShapeRequest {

    @NotBlank(message = "职业不能为空")
    @Size(max = 50, message = "职业长度不能超过50个字符")
    @Schema(description = "职业类型", example = "陶工", requiredMode = Schema.RequiredMode.REQUIRED)
    private String profession;

    @NotBlank(message = "陶土类型不能为空")
    @Size(max = 50, message = "陶土类型长度不能超过50个字符")
    @Schema(description = "陶土类型", example = "红陶", requiredMode = Schema.RequiredMode.REQUIRED)
    private String clayType;

    @NotBlank(message = "纹饰不能为空")
    @Size(max = 200, message = "纹饰描述长度不能超过200个字符")
    @Schema(description = "纹饰描述", example = "商代青铜器饕餮纹", requiredMode = Schema.RequiredMode.REQUIRED)
    private String pattern;
}