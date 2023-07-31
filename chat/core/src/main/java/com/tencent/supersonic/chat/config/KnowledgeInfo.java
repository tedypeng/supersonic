package com.tencent.supersonic.chat.config;

import com.tencent.supersonic.common.pojo.enums.TypeEnums;

import javax.validation.constraints.NotNull;

import lombok.Data;

/**
 * information about dictionary about the domain
 */

@Data
public class KnowledgeInfo {

    /**
     * metricId、DimensionId、domainId
     */
    private Long itemId;

    private String bizName;
    /**
     * type: IntentionTypeEnum
     * temporarily only supports dimension-related information
     */
    @NotNull
    private TypeEnums type = TypeEnums.DIMENSION;

    private Boolean searchEnable = false;

    /**
     * advanced knowledge config for single item
     */
    private KnowledgeAdvancedConfig knowledgeAdvancedConfig;


}