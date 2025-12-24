package com.yaoyan.game.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 陶器模型生成结果DTO
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "3D陶器模型生成结果")
public class ShapeResult {

    @Schema(description = "状态", example = "success")
    private String status;

    @Schema(description = "消息", example = "模型生成中")
    private String message;
}
