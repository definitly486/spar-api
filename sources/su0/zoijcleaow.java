package su0;

import kotlin.jvm.internal.zdlpuopuiu;
import ou0.LoyaltyCategoryDto;
import ru.myspar.proloyalty.components.loyalty_program.api.models.LoyaltyCategory;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zoijcleaow {
    public static final LoyaltyCategory iobyxmoadg(LoyaltyCategoryDto loyaltyCategoryDto) {
        zdlpuopuiu.btonecajqb(loyaltyCategoryDto, "<this>");
        return new LoyaltyCategory(loyaltyCategoryDto.getId(), loyaltyCategoryDto.getName(), loyaltyCategoryDto.getPic(), loyaltyCategoryDto.getDescription());
    }
}
