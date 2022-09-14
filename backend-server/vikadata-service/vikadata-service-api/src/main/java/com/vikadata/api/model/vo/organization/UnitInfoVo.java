package com.vikadata.api.model.vo.organization;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.vikadata.api.support.serializer.ImageSerializer;
import com.vikadata.api.support.serializer.NullStringSerializer;

/**
 * <p>
 * 组织单元信息视图
 * </p>
 *
 * @author Chambers
 * @date 2020/6/5
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@ApiModel("组织单元信息视图")
public class UnitInfoVo {

    @ApiModelProperty(value = "组织单元ID", dataType = "java.lang.String", example = "1", position = 1)
    @JsonSerialize(using = ToStringSerializer.class)
    private Long unitId;

    @ApiModelProperty(value = "分类：1-部门，3-成员", example = "1", position = 2)
    private Integer type;

    @ApiModelProperty(value = "组织单元关联ID（依据类型可能是teamId、memberId）", dataType = "java.lang.String", example = "1", position = 2)
    @JsonSerialize(using = ToStringSerializer.class)
    private Long unitRefId;

    @ApiModelProperty(value = "部门/成员名称", example = "研发部｜张三", position = 3)
    private String name;

    @ApiModelProperty(value = "用户ID(实际返回是uuid)", dataType = "java.lang.String", example = "1", position = 4)
    @JsonSerialize(nullsUsing = NullStringSerializer.class)
    private String userId;

    @Deprecated
    @ApiModelProperty(value = "成员对应的用户UUID", hidden = true)
    @JsonSerialize(nullsUsing = NullStringSerializer.class)
    private String uuid;

    @ApiModelProperty(value = "成员头像", example = "http://www.vikadata.com/image.png", position = 5)
    @JsonSerialize(nullsUsing = NullStringSerializer.class, using = ImageSerializer.class)
    private String avatar;

    @ApiModelProperty(value = "成员是否已激活", example = "true", position = 6)
    private Boolean isActive;

    @ApiModelProperty(value = "组织单元是否被删除", example = "false", position = 7)
    private Boolean isDeleted;

    @ApiModelProperty(value = "用户（user）是否修改过昵称", position = 8)
    private Boolean isNickNameModified;

    @ApiModelProperty(value = "成员（member）是否修改过昵称", position = 9)
    private Boolean isMemberNameModified;

    @ApiModelProperty(value = "成员所属部门", example = "技术组 | 美术组", position = 10)
    @JsonSerialize(nullsUsing = NullStringSerializer.class)
    private String team;

    @ApiModelProperty(value = "user email", example = "**@**.**", position = 11)
    @JsonSerialize(nullsUsing = NullStringSerializer.class)
    private String email;

}
