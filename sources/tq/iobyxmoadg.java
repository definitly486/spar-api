package tq;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.analytics.api.model.AnalyticsPage;
import ru.myspar.catalog.impl.hint.dialog.domain.store.State;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final lo.zoijcleaow f111179ppxfxbqfkf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lo.zoijcleaow analyticsTracker, ns.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f111179ppxfxbqfkf = analyticsTracker;
    }

    private final void ikoacuggdj() {
        AnalyticsPage.BottomHints bottomHints = AnalyticsPage.BottomHints.f84274iwizpuwonk;
        this.f111179ppxfxbqfkf.ppxfxbqfkf(new no.eablkybsjg(new no.gxszxtbevo(((State) jlmebxxoox()).getArgs().getAnalyticsInfo().getAnalyticPageFrom(), bottomHints, ((State) jlmebxxoox()).getArgs().getAnalyticsInfo().getAnalyticsLocation(), ((State) jlmebxxoox()).getArgs().getAnalyticsInfo().getAnalyticElement(), null, 16, null)));
    }

    private final void jhduphickx() {
        crxdokpmqz(eablkybsjg.iobyxmoadg.f111178iobyxmoadg);
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: ribwqtqdhb, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(ppxfxbqfkf action) {
        zdlpuopuiu.btonecajqb(action, "action");
        if (!zdlpuopuiu.eablkybsjg(action, ppxfxbqfkf.iobyxmoadg.f111182iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        ikoacuggdj();
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: vipkmwdibw, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(wkgbmnqykc intent) {
        zdlpuopuiu.btonecajqb(intent, "intent");
        if (!zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.iobyxmoadg.f111183iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        jhduphickx();
    }
}
