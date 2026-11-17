package db2;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.analytics.api.model.AnalyticsPage;
import ru.myspar.webview_screen.impl.myspar.domain.State;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final lo.zoijcleaow f27409ppxfxbqfkf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lo.zoijcleaow analyticsTracker, ns.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f27409ppxfxbqfkf = analyticsTracker;
    }

    private final void jhduphickx(AnalyticsPage analyticsPage) {
        this.f27409ppxfxbqfkf.ppxfxbqfkf(new no.eablkybsjg(new no.gxszxtbevo(analyticsPage, AnalyticsPage.External.f84295iwizpuwonk, null, null, null, 28, null)));
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: ribwqtqdhb, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(ppxfxbqfkf action) {
        zdlpuopuiu.btonecajqb(action, "action");
        if (!zdlpuopuiu.eablkybsjg(action, ppxfxbqfkf.iobyxmoadg.f27412iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        AnalyticsPage fromPage = ((State) jlmebxxoox()).getFromPage();
        if (fromPage != null) {
            jhduphickx(fromPage);
        }
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: vipkmwdibw, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(wkgbmnqykc intent) {
        zdlpuopuiu.btonecajqb(intent, "intent");
        if (zdlpuopuiu.eablkybsjg(intent, wkgbmnqykc.iobyxmoadg.f27413iobyxmoadg)) {
            crxdokpmqz(eablkybsjg.iobyxmoadg.f27405iobyxmoadg);
        } else if (intent instanceof wkgbmnqykc.zoijcleaow) {
            crxdokpmqz(new eablkybsjg.zoijcleaow(((wkgbmnqykc.zoijcleaow) intent).iobyxmoadg()));
        } else {
            if (!(intent instanceof wkgbmnqykc.ppxfxbqfkf)) {
                throw new NoWhenBranchMatchedException();
            }
            crxdokpmqz(new eablkybsjg.ppxfxbqfkf(((wkgbmnqykc.ppxfxbqfkf) intent).iobyxmoadg()));
        }
    }
}
