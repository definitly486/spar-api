package yv;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.components.loyalty_program.api.models.LoyaltyCategory;
import uv.LoyaltyCategoryDto;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zoijcleaow {
    public static final LoyaltyCategory iobyxmoadg(LoyaltyCategoryDto loyaltyCategoryDto) {
        zdlpuopuiu.btonecajqb(loyaltyCategoryDto, "<this>");
        return new LoyaltyCategory(loyaltyCategoryDto.getId(), loyaltyCategoryDto.getName(), loyaltyCategoryDto.getPic(), loyaltyCategoryDto.getDescription());
    }
}
