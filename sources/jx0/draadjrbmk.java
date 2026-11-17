package jx0;

import dx0.ReferenceEntity;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.reference.Reference;
import zx0.ReferenceDto;
import zx0.ReferenceRequestDto;

/* JADX INFO: loaded from: classes5.dex */
public abstract class draadjrbmk {
    public static final Reference iobyxmoadg(ReferenceEntity referenceEntity) {
        zdlpuopuiu.btonecajqb(referenceEntity, "<this>");
        return new Reference(referenceEntity.getName(), referenceEntity.getCode(), e01.iobyxmoadg.f30129yggfygwlhe.iobyxmoadg(referenceEntity.getType()), referenceEntity.getPlaceholder(), referenceEntity.getChecked(), referenceEntity.getText(), referenceEntity.getInputLimit());
    }

    public static final ReferenceRequestDto ppxfxbqfkf(Reference reference) {
        zdlpuopuiu.btonecajqb(reference, "<this>");
        return new ReferenceRequestDto(reference.getCode(), reference.getText());
    }

    public static final ReferenceEntity wkgbmnqykc(Reference reference) {
        zdlpuopuiu.btonecajqb(reference, "<this>");
        return new ReferenceEntity(reference.getName(), reference.getCode(), reference.getType().wkgbmnqykc(), reference.getPlaceholder(), reference.getChecked(), reference.getText(), reference.getInputLimit());
    }

    public static final Reference zoijcleaow(ReferenceDto referenceDto) {
        zdlpuopuiu.btonecajqb(referenceDto, "<this>");
        String name = referenceDto.getName();
        String code = referenceDto.getCode();
        e01.iobyxmoadg.C0627iobyxmoadg c0627iobyxmoadg = e01.iobyxmoadg.f30129yggfygwlhe;
        String type = referenceDto.getType();
        if (type == null) {
            type = "";
        }
        e01.iobyxmoadg iobyxmoadgVarIobyxmoadg = c0627iobyxmoadg.iobyxmoadg(type);
        String placeholder = referenceDto.getPlaceholder();
        String str = placeholder == null ? "" : placeholder;
        Boolean checked = referenceDto.getChecked();
        boolean zBooleanValue = checked != null ? checked.booleanValue() : false;
        String text = referenceDto.getText();
        return new Reference(name, code, iobyxmoadgVarIobyxmoadg, str, zBooleanValue, text == null ? "" : text, referenceDto.getInputLimit());
    }
}
