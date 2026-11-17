package ru.myspar.payment.impl.web.presentation;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ru.myspar.payment.api.WebViewPaymentResultHelper;
import ru.myspar.payment.impl.web.domain.store.State;
import tg.draadjrbmk;
import wj0.lqeggnwhkg;
import xj0.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg extends ws.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final wi0.iobyxmoadg f91572btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f91573draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final WebViewPaymentResultHelper f91574gtknphoqwx;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final draadjrbmk f91575wflxmlrfwp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, wi0.iobyxmoadg ordersFeatureApi, WebViewPaymentResultHelper webViewPaymentResultHelper) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(ordersFeatureApi, "ordersFeatureApi");
        zdlpuopuiu.btonecajqb(webViewPaymentResultHelper, "webViewPaymentResultHelper");
        this.f91572btonecajqb = ordersFeatureApi;
        this.f91574gtknphoqwx = webViewPaymentResultHelper;
        this.f91573draadjrbmk = new draadjrbmk() { // from class: xj0.eablkybsjg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.payment.impl.web.presentation.iobyxmoadg.sopmlzcsov((State) obj);
            }
        };
        this.f91575wflxmlrfwp = new draadjrbmk() { // from class: xj0.gxszxtbevo
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.payment.impl.web.presentation.iobyxmoadg.ntlheqmsrt((ru.myspar.payment.impl.web.presentation.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wj0.wkgbmnqykc ntlheqmsrt(zoijcleaow zoijcleaowVar) {
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (!zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.iobyxmoadg.f91582iobyxmoadg) && !zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.ppxfxbqfkf.f91583iobyxmoadg) && !zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.wkgbmnqykc.f91584iobyxmoadg)) {
            if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.C2126zoijcleaow.f91585iobyxmoadg)) {
                return wj0.wkgbmnqykc.zoijcleaow.f119994iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.eablkybsjg.f91580iobyxmoadg)) {
                return wj0.wkgbmnqykc.ppxfxbqfkf.f119992iobyxmoadg;
            }
            if (zoijcleaowVar instanceof zoijcleaow.gxszxtbevo) {
                return new wj0.wkgbmnqykc.C2999wkgbmnqykc(((zoijcleaow.gxszxtbevo) zoijcleaowVar).iobyxmoadg());
            }
            throw new NoWhenBranchMatchedException();
        }
        return wj0.wkgbmnqykc.iobyxmoadg.f119991iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rgvfuqvkyq sopmlzcsov(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return new rgvfuqvkyq(state.getUrl());
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f91573draadjrbmk;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f91575wflxmlrfwp;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(wj0.eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof wj0.eablkybsjg.wkgbmnqykc) {
            Object objCllcsxoeiz = cllcsxoeiz(new ppxfxbqfkf.C2125ppxfxbqfkf(((wj0.eablkybsjg.wkgbmnqykc) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof wj0.eablkybsjg.ppxfxbqfkf) {
            Object objCllcsxoeiz2 = cllcsxoeiz(ppxfxbqfkf.iobyxmoadg.f91576iobyxmoadg, gxszxtbevoVar);
            return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof wj0.eablkybsjg.zoijcleaow) {
            Object objCllcsxoeiz3 = cllcsxoeiz(new ppxfxbqfkf.zoijcleaow(((wj0.eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (!(eablkybsjgVar instanceof wj0.eablkybsjg.iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        d40.iobyxmoadg iobyxmoadgVar = d40.iobyxmoadg.f26931iobyxmoadg;
        iobyxmoadgVar.oxmwwwfdhm().ppxfxbqfkf(this.f91574gtknphoqwx.zoijcleaow(), this.f91574gtknphoqwx.iobyxmoadg(((wj0.eablkybsjg.iobyxmoadg) eablkybsjgVar).iobyxmoadg()));
        iobyxmoadgVar.gtknphoqwx();
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
