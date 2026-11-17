package ly0;

import java.util.List;
import ru.myspar.proloyalty.core.domain.models.product.Section;

/* JADX INFO: loaded from: classes5.dex */
public abstract class iwizpuwonk {
    public static final Section iobyxmoadg(SectionDto sectionDto, List list) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sectionDto, "<this>");
        return new Section(sectionDto.getBanner(), sectionDto.getTitleImage(), jx0.zoijcleaow.zoijcleaow(sectionDto.getColorThemeType(), list));
    }
}
