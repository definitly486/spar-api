package rg0;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class btonecajqb implements draadjrbmk {
    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public j10.zoijcleaow invoke(tg0.zoijcleaow popupDto) {
        zdlpuopuiu.btonecajqb(popupDto, "popupDto");
        if (!(popupDto instanceof tg0.zoijcleaow.PurchaseRatingDto)) {
            throw new NoWhenBranchMatchedException();
        }
        tg0.zoijcleaow.PurchaseRatingDto purchaseRatingDto = (tg0.zoijcleaow.PurchaseRatingDto) popupDto;
        return new j10.zoijcleaow.iobyxmoadg(purchaseRatingDto.getImage(), purchaseRatingDto.getTitle(), purchaseRatingDto.getDescription(), purchaseRatingDto.getButtonText(), f40.zoijcleaow.f32832yggfygwlhe.iobyxmoadg(purchaseRatingDto.getNavLink()), purchaseRatingDto.getReference());
    }
}
