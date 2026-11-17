package ru.myspar.legacy.presentation.screen.review;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.analytics.api.model.AnalyticsPage;
import ru.myspar.auth.api.model.NonAuthorizedPayload;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class eablkybsjg extends ws.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final ro.iobyxmoadg f89569btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f89570draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final lo.zoijcleaow f89571gtknphoqwx;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final draadjrbmk f89572wflxmlrfwp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eablkybsjg(b80.nufgyqmvbu store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, hd0.iobyxmoadg stateToUiModelMapper, ro.iobyxmoadg authFeatureApi, lo.zoijcleaow analyticsTracker) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(stateToUiModelMapper, "stateToUiModelMapper");
        zdlpuopuiu.btonecajqb(authFeatureApi, "authFeatureApi");
        zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        this.f89569btonecajqb = authFeatureApi;
        this.f89571gtknphoqwx = analyticsTracker;
        this.f89570draadjrbmk = stateToUiModelMapper;
        this.f89572wflxmlrfwp = new draadjrbmk() { // from class: fd0.agtfadlqog
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.legacy.presentation.screen.review.eablkybsjg.mbcevpiqjq((ru.myspar.legacy.presentation.screen.review.lqeggnwhkg) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b80.eablkybsjg mbcevpiqjq(lqeggnwhkg lqeggnwhkgVar) {
        zdlpuopuiu.btonecajqb(lqeggnwhkgVar, "<this>");
        if (lqeggnwhkgVar instanceof lqeggnwhkg.wkgbmnqykc) {
            return new b80.eablkybsjg.wkgbmnqykc(((lqeggnwhkg.wkgbmnqykc) lqeggnwhkgVar).iobyxmoadg());
        }
        if (lqeggnwhkgVar instanceof lqeggnwhkg.eablkybsjg) {
            return new b80.eablkybsjg.C0262eablkybsjg(((lqeggnwhkg.eablkybsjg) lqeggnwhkgVar).iobyxmoadg());
        }
        if (lqeggnwhkgVar instanceof lqeggnwhkg.gxszxtbevo) {
            return new b80.eablkybsjg.gxszxtbevo(((lqeggnwhkg.gxszxtbevo) lqeggnwhkgVar).iobyxmoadg());
        }
        if (lqeggnwhkgVar instanceof lqeggnwhkg.iobyxmoadg) {
            return new b80.eablkybsjg.iobyxmoadg(((lqeggnwhkg.iobyxmoadg) lqeggnwhkgVar).iobyxmoadg());
        }
        if (zdlpuopuiu.eablkybsjg(lqeggnwhkgVar, lqeggnwhkg.zoijcleaow.f89581iobyxmoadg)) {
            return b80.eablkybsjg.zoijcleaow.f15474iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(lqeggnwhkgVar, lqeggnwhkg.ppxfxbqfkf.f89579iobyxmoadg)) {
            return b80.eablkybsjg.ppxfxbqfkf.f15472iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f89570draadjrbmk;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f89572wflxmlrfwp;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ntlheqmsrt, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(b80.gxszxtbevo gxszxtbevoVar, lg.gxszxtbevo gxszxtbevoVar2) {
        if (gxszxtbevoVar instanceof b80.gxszxtbevo.ppxfxbqfkf) {
            Object objCllcsxoeiz = cllcsxoeiz(new nufgyqmvbu.iobyxmoadg(((b80.gxszxtbevo.ppxfxbqfkf) gxszxtbevoVar).iobyxmoadg()), gxszxtbevoVar2);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (gxszxtbevoVar instanceof b80.gxszxtbevo.wkgbmnqykc) {
            b80.gxszxtbevo.wkgbmnqykc wkgbmnqykcVar = (b80.gxszxtbevo.wkgbmnqykc) gxszxtbevoVar;
            this.f89571gtknphoqwx.ppxfxbqfkf(new no.eablkybsjg(new no.gxszxtbevo(new AnalyticsPage.ProductReviews(wkgbmnqykcVar.zoijcleaow(), wkgbmnqykcVar.iobyxmoadg()), new AnalyticsPage.AddProductReview(wkgbmnqykcVar.zoijcleaow(), wkgbmnqykcVar.iobyxmoadg()), null, null, null, 28, null)));
            Object objCllcsxoeiz2 = cllcsxoeiz(new nufgyqmvbu.zoijcleaow(wkgbmnqykcVar.iobyxmoadg(), wkgbmnqykcVar.zoijcleaow()), gxszxtbevoVar2);
            return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (gxszxtbevoVar instanceof b80.gxszxtbevo.iobyxmoadg) {
            d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
        } else {
            if (!zdlpuopuiu.eablkybsjg(gxszxtbevoVar, b80.gxszxtbevo.zoijcleaow.f15479iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f89569btonecajqb.ppxfxbqfkf(new NonAuthorizedPayload(NonAuthorizedPayload.zoijcleaow.DEFAULT, null, 2, null)));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
