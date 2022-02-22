package io.github.daniil547.card;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonView;
import io.github.daniil547.board.label.LabelDto;
import io.github.daniil547.card.elements.CheckListDto;
import io.github.daniil547.card.elements.ReminderDto;
import io.github.daniil547.common.dto.PageDto;
import io.github.daniil547.common.util.JsonDtoView;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Data

@ApiModel(value = "Card", parent = PageDto.class)
public class CardDto extends PageDto {
    @JsonView({JsonDtoView.Basic.class,
               JsonDtoView.Creation.class})
    private Boolean active = true;
    @JsonView({JsonDtoView.Basic.class,
               JsonDtoView.Creation.class})
    private UUID cardListId;
    @JsonView({JsonDtoView.Basic.class,
               JsonDtoView.Creation.class})
    private Integer position;

    @JsonView({JsonDtoView.Basic.class,
               JsonDtoView.Creation.class})
    @JsonProperty("attachedLabels")
    private List<LabelDto> attachedLabelDtos = new ArrayList<>();

    @JsonView({JsonDtoView.Basic.class,
               JsonDtoView.Creation.class})
    private List<UUID> assignedMembers = new ArrayList<>();

    @JsonView({JsonDtoView.Basic.class,
               JsonDtoView.Creation.class})
    @JsonProperty("checkLists")
    private List<CheckListDto> checkListDtos = new ArrayList<>();

    @JsonView({JsonDtoView.Basic.class,
               JsonDtoView.Creation.class})
    @JsonProperty("reminder")
    private ReminderDto reminderDto;
}
