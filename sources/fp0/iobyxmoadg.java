package fp0;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsPage;
import ru.myspar.proloyalty.catalog.impl.hint.dialog.domain.store.State;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final vm0.zoijcleaow f34501ppxfxbqfkf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(vm0.zoijcleaow analyticsTracker, dr0.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f34501ppxfxbqfkf = analyticsTracker;
    }

    private final void ikoacuggdj() {
        AnalyticsPage.BottomHints bottomHints = AnalyticsPage.BottomHints.f92302iwizpuwonk;
        this.f34501ppxfxbqfkf.wkgbmnqykc(new xm0.eablkybsjg(new xm0.gxszxtbevo(((State) jlmebxxoox()).getArgs().getAnalyticsInfo().getAnalyticPageFrom(), bottomHints, ((State) jlmebxxoox()).getArgs().getAnalyticsInfo().getAnalyticsLocation(), ((State) jlmebxxoox()).getArgs().getAnalyticsInfo().getAnalyticElement(), null, 16, null)));
    }

    private final void jhduphickx() {
        crxdokpmqz(eablkybsjg.iobyxmoadg.f34500iobyxmoadg);
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: ribwqtqdhb, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(ppxfxbqfkf action) {
        zdlpuopuiu.btonecajqb(action, "action");
        if (!zdlpuopuiu.eablkybsjg(action, ppxfxbqfkf.iobyxmoadg.f34504iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        ikoacuggdj();
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: vipkmwdibw, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(wkgbmnqykc intent) {
        zdlpuopuiu.btonecajqb(intent, "intent");
        if (!zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.iobyxmoadg.f34505iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        jhduphickx();
    }
}
