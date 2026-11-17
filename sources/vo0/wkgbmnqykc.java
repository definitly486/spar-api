package vo0;

import ru.myspar.proloyalty.core.domain.models.cart.IntervalInfo;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc implements tg.draadjrbmk {
    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public wo0.zoijcleaow invoke(IntervalInfo info) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(info, "info");
        String title = info.getTitle();
        String subtitle = info.getSubtitle();
        if (subtitle == null) {
            subtitle = "";
        }
        return new wo0.zoijcleaow(title, subtitle, info.getIsOnlyOne());
    }
}
