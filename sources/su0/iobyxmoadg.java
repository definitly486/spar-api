package su0;

import kotlin.jvm.internal.zdlpuopuiu;
import ou0.LoyaltyInfoItemDto;

/* JADX INFO: loaded from: classes5.dex */
public abstract class iobyxmoadg {
    public static final lu0.zoijcleaow iobyxmoadg(LoyaltyInfoItemDto loyaltyInfoItemDto) {
        zdlpuopuiu.btonecajqb(loyaltyInfoItemDto, "<this>");
        String percent = loyaltyInfoItemDto.getPercent();
        String str = percent == null ? "" : percent;
        String text = loyaltyInfoItemDto.getText();
        String navLink = loyaltyInfoItemDto.getNavLink();
        return new lu0.zoijcleaow(str, text, navLink == null ? "" : navLink, loyaltyInfoItemDto.getReference(), loyaltyInfoItemDto.getIsCategoriesSelected());
    }
}
