package ru.myspar.proloyalty.legacy.presentation.screen.review;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsPage;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public final class eablkybsjg extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final an0.iobyxmoadg f97248btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f97249draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final vm0.zoijcleaow f97250gtknphoqwx;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final draadjrbmk f97251wflxmlrfwp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eablkybsjg(m61.nufgyqmvbu store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, eb1.iobyxmoadg stateToUiModelMapper, an0.iobyxmoadg authFeatureApi, vm0.zoijcleaow analyticsTracker) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(stateToUiModelMapper, "stateToUiModelMapper");
        zdlpuopuiu.btonecajqb(authFeatureApi, "authFeatureApi");
        zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        this.f97248btonecajqb = authFeatureApi;
        this.f97250gtknphoqwx = analyticsTracker;
        this.f97249draadjrbmk = stateToUiModelMapper;
        this.f97251wflxmlrfwp = new draadjrbmk() { // from class: cb1.agtfadlqog
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.legacy.presentation.screen.review.eablkybsjg.mbcevpiqjq((ru.myspar.proloyalty.legacy.presentation.screen.review.lqeggnwhkg) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m61.eablkybsjg mbcevpiqjq(lqeggnwhkg lqeggnwhkgVar) {
        zdlpuopuiu.btonecajqb(lqeggnwhkgVar, "<this>");
        if (lqeggnwhkgVar instanceof lqeggnwhkg.wkgbmnqykc) {
            return new m61.eablkybsjg.wkgbmnqykc(((lqeggnwhkg.wkgbmnqykc) lqeggnwhkgVar).iobyxmoadg());
        }
        if (lqeggnwhkgVar instanceof lqeggnwhkg.eablkybsjg) {
            return new m61.eablkybsjg.C1363eablkybsjg(((lqeggnwhkg.eablkybsjg) lqeggnwhkgVar).iobyxmoadg());
        }
        if (lqeggnwhkgVar instanceof lqeggnwhkg.gxszxtbevo) {
            return new m61.eablkybsjg.gxszxtbevo(((lqeggnwhkg.gxszxtbevo) lqeggnwhkgVar).iobyxmoadg());
        }
        if (lqeggnwhkgVar instanceof lqeggnwhkg.iobyxmoadg) {
            return new m61.eablkybsjg.iobyxmoadg(((lqeggnwhkg.iobyxmoadg) lqeggnwhkgVar).iobyxmoadg());
        }
        if (zdlpuopuiu.eablkybsjg(lqeggnwhkgVar, lqeggnwhkg.zoijcleaow.f97260iobyxmoadg)) {
            return m61.eablkybsjg.zoijcleaow.f66219iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(lqeggnwhkgVar, lqeggnwhkg.ppxfxbqfkf.f97258iobyxmoadg)) {
            return m61.eablkybsjg.ppxfxbqfkf.f66217iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f97249draadjrbmk;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f97251wflxmlrfwp;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ntlheqmsrt, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(m61.gxszxtbevo gxszxtbevoVar, lg.gxszxtbevo gxszxtbevoVar2) {
        if (gxszxtbevoVar instanceof m61.gxszxtbevo.ppxfxbqfkf) {
            Object objCllcsxoeiz = cllcsxoeiz(new nufgyqmvbu.iobyxmoadg(((m61.gxszxtbevo.ppxfxbqfkf) gxszxtbevoVar).iobyxmoadg()), gxszxtbevoVar2);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (gxszxtbevoVar instanceof m61.gxszxtbevo.wkgbmnqykc) {
            m61.gxszxtbevo.wkgbmnqykc wkgbmnqykcVar = (m61.gxszxtbevo.wkgbmnqykc) gxszxtbevoVar;
            this.f97250gtknphoqwx.wkgbmnqykc(new xm0.eablkybsjg(new xm0.gxszxtbevo(new AnalyticsPage.ProductReviews(wkgbmnqykcVar.zoijcleaow(), wkgbmnqykcVar.iobyxmoadg()), new AnalyticsPage.AddProductReview(wkgbmnqykcVar.zoijcleaow(), wkgbmnqykcVar.iobyxmoadg()), null, null, null, 28, null)));
            Object objCllcsxoeiz2 = cllcsxoeiz(new nufgyqmvbu.zoijcleaow(wkgbmnqykcVar.iobyxmoadg(), wkgbmnqykcVar.zoijcleaow()), gxszxtbevoVar2);
            return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (gxszxtbevoVar instanceof m61.gxszxtbevo.iobyxmoadg) {
            i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
        } else {
            if (!zdlpuopuiu.eablkybsjg(gxszxtbevoVar, m61.gxszxtbevo.zoijcleaow.f66224iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f97248btonecajqb.eablkybsjg());
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
