package io.github.daniil547.workspace;

import com.fasterxml.jackson.annotation.JsonView;
import io.github.daniil547.common.dto.PageDto;
import io.github.daniil547.common.util.JsonDtoView;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Data

@ApiModel(value = "Workspace", parent = PageDto.class)
public class WorkspaceDto extends PageDto {
    @JsonView({JsonDtoView.Basic.class,
               JsonDtoView.Creation.class})
    private WorkspaceVisibility visibility;

    @JsonView({JsonDtoView.Basic.class,
               JsonDtoView.Creation.class})
    private String companyWebsiteUrl;
}
