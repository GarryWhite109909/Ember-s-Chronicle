package com.yaoyan.game.controller;

import com.yaoyan.game.common.Result;
import com.yaoyan.game.dto.ShapeRequest;
import com.yaoyan.game.dto.ShapeResult;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 陶器模型生成控制器
 */
@Tag(name = "陶器模型生成", description = "TripoAI 3D陶器模型生成相关接口")
@RestController
@RequestMapping("/api/taoyao")
public class TaoShapeController {

    @Operation(summary = "生成3D陶器模型", description = "通过TripoAI API生成3D陶器模型")
    @PostMapping("/shape")
    public Result<ShapeResult> createShape(@Valid @RequestBody ShapeRequest request) {
        // TODO: 调用TripoAI Service生成3D模型
        return Result.success(new ShapeResult("success", "模型生成中"));
    }
}