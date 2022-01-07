package io.github.daniil547.card.elements;

import io.github.daniil547.common.domain.Domain;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
@Getter(AccessLevel.PACKAGE)
@Setter(AccessLevel.PACKAGE)
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Attachment extends Domain /* implements MonoCardElement<String> */ {
    private String name;
    private String filePath;
    private String type;

    /*TODO: implement*/
}
