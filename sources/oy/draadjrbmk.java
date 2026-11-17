package oy;

import gz.ReferenceDto;
import gz.ReferenceRequestDto;
import iy.ReferenceEntity;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.reference.Reference;

/* JADX INFO: loaded from: classes4.dex */
public abstract class draadjrbmk {
    public static final Reference iobyxmoadg(ReferenceDto referenceDto) {
        zdlpuopuiu.btonecajqb(referenceDto, "<this>");
        String name = referenceDto.getName();
        String code = referenceDto.getCode();
        o10.iobyxmoadg.C1547iobyxmoadg c1547iobyxmoadg = o10.iobyxmoadg.f71547yggfygwlhe;
        String type = referenceDto.getType();
        if (type == null) {
            type = "";
        }
        o10.iobyxmoadg iobyxmoadgVarIobyxmoadg = c1547iobyxmoadg.iobyxmoadg(type);
        String placeholder = referenceDto.getPlaceholder();
        String str = placeholder == null ? "" : placeholder;
        Boolean checked = referenceDto.getChecked();
        boolean zBooleanValue = checked != null ? checked.booleanValue() : false;
        String text = referenceDto.getText();
        return new Reference(name, code, iobyxmoadgVarIobyxmoadg, str, zBooleanValue, text == null ? "" : text, referenceDto.getInputLimit());
    }

    public static final ReferenceRequestDto ppxfxbqfkf(Reference reference) {
        zdlpuopuiu.btonecajqb(reference, "<this>");
        return new ReferenceRequestDto(reference.getCode(), reference.getText());
    }

    public static final ReferenceEntity wkgbmnqykc(Reference reference) {
        zdlpuopuiu.btonecajqb(reference, "<this>");
        return new ReferenceEntity(reference.getName(), reference.getCode(), reference.getType().wkgbmnqykc(), reference.getPlaceholder(), reference.getChecked(), reference.getText(), reference.getInputLimit());
    }

    public static final Reference zoijcleaow(ReferenceEntity referenceEntity) {
        zdlpuopuiu.btonecajqb(referenceEntity, "<this>");
        return new Reference(referenceEntity.getName(), referenceEntity.getCode(), o10.iobyxmoadg.f71547yggfygwlhe.iobyxmoadg(referenceEntity.getType()), referenceEntity.getPlaceholder(), referenceEntity.getChecked(), referenceEntity.getText(), referenceEntity.getInputLimit());
    }
}
