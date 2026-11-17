package ru.myspar.proloyalty.payment.impl.web.presentation;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ru.myspar.proloyalty.payment.api.WebViewPaymentResultHelper;
import ru.myspar.proloyalty.payment.impl.web.domain.store.State;
import tg.draadjrbmk;
import xg1.lqeggnwhkg;
import yg1.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final wf1.iobyxmoadg f99223btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f99224draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final WebViewPaymentResultHelper f99225gtknphoqwx;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final draadjrbmk f99226wflxmlrfwp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, wf1.iobyxmoadg ordersFeatureApi, WebViewPaymentResultHelper webViewPaymentResultHelper) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(ordersFeatureApi, "ordersFeatureApi");
        zdlpuopuiu.btonecajqb(webViewPaymentResultHelper, "webViewPaymentResultHelper");
        this.f99223btonecajqb = ordersFeatureApi;
        this.f99225gtknphoqwx = webViewPaymentResultHelper;
        this.f99224draadjrbmk = new draadjrbmk() { // from class: yg1.eablkybsjg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.payment.impl.web.presentation.iobyxmoadg.sopmlzcsov((State) obj);
            }
        };
        this.f99226wflxmlrfwp = new draadjrbmk() { // from class: yg1.gxszxtbevo
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.payment.impl.web.presentation.iobyxmoadg.ntlheqmsrt((ru.myspar.proloyalty.payment.impl.web.presentation.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xg1.wkgbmnqykc ntlheqmsrt(zoijcleaow zoijcleaowVar) {
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (!zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.iobyxmoadg.f99233iobyxmoadg) && !zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.ppxfxbqfkf.f99234iobyxmoadg) && !zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.wkgbmnqykc.f99235iobyxmoadg)) {
            if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.C2373zoijcleaow.f99236iobyxmoadg)) {
                return xg1.wkgbmnqykc.zoijcleaow.f122365iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.eablkybsjg.f99231iobyxmoadg)) {
                return xg1.wkgbmnqykc.ppxfxbqfkf.f122363iobyxmoadg;
            }
            if (zoijcleaowVar instanceof zoijcleaow.gxszxtbevo) {
                return new xg1.wkgbmnqykc.C3082wkgbmnqykc(((zoijcleaow.gxszxtbevo) zoijcleaowVar).iobyxmoadg());
            }
            throw new NoWhenBranchMatchedException();
        }
        return xg1.wkgbmnqykc.iobyxmoadg.f122362iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rgvfuqvkyq sopmlzcsov(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return new rgvfuqvkyq(state.getUrl(), state.getJwt());
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f99224draadjrbmk;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f99226wflxmlrfwp;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(xg1.eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof xg1.eablkybsjg.wkgbmnqykc) {
            Object objCllcsxoeiz = cllcsxoeiz(new ppxfxbqfkf.C2372ppxfxbqfkf(((xg1.eablkybsjg.wkgbmnqykc) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof xg1.eablkybsjg.ppxfxbqfkf) {
            Object objCllcsxoeiz2 = cllcsxoeiz(ppxfxbqfkf.iobyxmoadg.f99227iobyxmoadg, gxszxtbevoVar);
            return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof xg1.eablkybsjg.zoijcleaow) {
            Object objCllcsxoeiz3 = cllcsxoeiz(new ppxfxbqfkf.zoijcleaow(((xg1.eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!(eablkybsjgVar instanceof xg1.eablkybsjg.iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        i21.iobyxmoadg iobyxmoadgVar = i21.iobyxmoadg.f41720iobyxmoadg;
        iobyxmoadgVar.oxmwwwfdhm().ppxfxbqfkf(this.f99225gtknphoqwx.zoijcleaow(), this.f99225gtknphoqwx.iobyxmoadg(((xg1.eablkybsjg.iobyxmoadg) eablkybsjgVar).iobyxmoadg()));
        iobyxmoadgVar.gtknphoqwx();
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
