package ru.myspar.proloyalty.domain.feature.review.store;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final C2239iobyxmoadg f95636ppxfxbqfkf = new C2239iobyxmoadg(null);

    /* JADX INFO: renamed from: ru.myspar.proloyalty.domain.feature.review.store.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2239iobyxmoadg {
        public /* synthetic */ C2239iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C2239iobyxmoadg() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(dr0.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
    }

    private final boolean ikoacuggdj() {
        return ((State) jlmebxxoox()).getRate() > 3;
    }

    private final boolean jhduphickx(int i13) {
        return i13 > 0;
    }

    private final void jztzpxfvev() {
        crxdokpmqz(new wkgbmnqykc.zoijcleaow(ikoacuggdj()));
    }

    private final void okpsazkaxt() {
        crxdokpmqz(wkgbmnqykc.ppxfxbqfkf.f95643iobyxmoadg);
    }

    private final void ribwqtqdhb() {
        if (((State) jlmebxxoox()).getFlow() == InAppReviewDialogArgs.zoijcleaow.RATE_ORDER) {
            crxdokpmqz(wkgbmnqykc.C2241wkgbmnqykc.f95644iobyxmoadg);
        }
    }

    private final void xrmfcynszj(int i13) {
        ulzqkzuiru(new eablkybsjg.iobyxmoadg(jhduphickx(i13), i13));
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: vipkmwdibw, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(ppxfxbqfkf intent) {
        zdlpuopuiu.btonecajqb(intent, "intent");
        if (intent instanceof ppxfxbqfkf.eablkybsjg) {
            xrmfcynszj(((ppxfxbqfkf.eablkybsjg) intent).iobyxmoadg());
            return;
        }
        if (zdlpuopuiu.eablkybsjg(intent, ppxfxbqfkf.zoijcleaow.f95641iobyxmoadg)) {
            crxdokpmqz(wkgbmnqykc.iobyxmoadg.f95642iobyxmoadg);
            return;
        }
        if (zdlpuopuiu.eablkybsjg(intent, ppxfxbqfkf.wkgbmnqykc.f95640iobyxmoadg)) {
            jztzpxfvev();
        } else if (zdlpuopuiu.eablkybsjg(intent, ppxfxbqfkf.C2240ppxfxbqfkf.f95639iobyxmoadg)) {
            okpsazkaxt();
        } else {
            if (!zdlpuopuiu.eablkybsjg(intent, ppxfxbqfkf.iobyxmoadg.f95638iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            ribwqtqdhb();
        }
    }
}
