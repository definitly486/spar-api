package wd1;

import k21.ojitshcjhn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public final class dxjokdxxww implements draadjrbmk {
    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public zz0.zoijcleaow invoke(yd1.zoijcleaow popupDto) {
        zdlpuopuiu.btonecajqb(popupDto, "popupDto");
        if (!(popupDto instanceof yd1.zoijcleaow.PurchaseRatingDto)) {
            throw new NoWhenBranchMatchedException();
        }
        yd1.zoijcleaow.PurchaseRatingDto purchaseRatingDto = (yd1.zoijcleaow.PurchaseRatingDto) popupDto;
        return new zz0.zoijcleaow.iobyxmoadg(purchaseRatingDto.getImage(), purchaseRatingDto.getTitle(), purchaseRatingDto.getDescription(), purchaseRatingDto.getButtonText(), ojitshcjhn.f53516yggfygwlhe.iobyxmoadg(purchaseRatingDto.getNavLink()), purchaseRatingDto.getReference());
    }
}
