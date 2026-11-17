package jq;

import ru.myspar.core.domain.models.cart.IntervalInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc implements tg.draadjrbmk {
    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public kq.zoijcleaow invoke(IntervalInfo info) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(info, "info");
        String title = info.getTitle();
        String subtitle = info.getSubtitle();
        if (subtitle == null) {
            subtitle = "";
        }
        return new kq.zoijcleaow(title, subtitle, info.getIsOnlyOne());
    }
}
