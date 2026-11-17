package ru.myspar.payment.impl.methods.presentation;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.ui.model.MainTab;
import ru.myspar.orders.api.model.OrdersArgs;
import ru.myspar.orders.api.model.SpecificOrderArgs;
import ru.myspar.payment.api.PaymentMethodResultHelper;
import ru.myspar.payment.impl.methods.domain.store.State;
import tg.draadjrbmk;
import tj0.gxszxtbevo;
import tj0.wkgbmnqykc;

/* JADX INFO: loaded from: classes3.dex */
public final class iobyxmoadg extends ws.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final PaymentMethodResultHelper f91534btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f91535draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final wi0.iobyxmoadg f91536gtknphoqwx;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final draadjrbmk f91537wflxmlrfwp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(gxszxtbevo store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, PaymentMethodResultHelper paymentMethodResultHelper, wi0.iobyxmoadg ordersFeatureApi) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(paymentMethodResultHelper, "paymentMethodResultHelper");
        zdlpuopuiu.btonecajqb(ordersFeatureApi, "ordersFeatureApi");
        this.f91534btonecajqb = paymentMethodResultHelper;
        this.f91536gtknphoqwx = ordersFeatureApi;
        this.f91535draadjrbmk = new draadjrbmk() { // from class: uj0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.payment.impl.methods.presentation.iobyxmoadg.sopmlzcsov((State) obj);
            }
        };
        this.f91537wflxmlrfwp = new draadjrbmk() { // from class: uj0.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.payment.impl.methods.presentation.iobyxmoadg.ntlheqmsrt((ru.myspar.payment.impl.methods.presentation.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tj0.ppxfxbqfkf ntlheqmsrt(zoijcleaow zoijcleaowVar) {
        tj0.ppxfxbqfkf wkgbmnqykcVar;
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zoijcleaowVar instanceof zoijcleaow.iobyxmoadg) {
            return tj0.ppxfxbqfkf.iobyxmoadg.f110734iobyxmoadg;
        }
        if (zoijcleaowVar instanceof zoijcleaow.ppxfxbqfkf) {
            return tj0.ppxfxbqfkf.C2728ppxfxbqfkf.f110735iobyxmoadg;
        }
        if (zoijcleaowVar instanceof zoijcleaow.C2124zoijcleaow) {
            wkgbmnqykcVar = new tj0.ppxfxbqfkf.zoijcleaow(((zoijcleaow.C2124zoijcleaow) zoijcleaowVar).iobyxmoadg());
        } else {
            if (!(zoijcleaowVar instanceof zoijcleaow.wkgbmnqykc)) {
                throw new NoWhenBranchMatchedException();
            }
            wkgbmnqykcVar = new tj0.ppxfxbqfkf.wkgbmnqykc(((zoijcleaow.wkgbmnqykc) zoijcleaowVar).iobyxmoadg());
        }
        return wkgbmnqykcVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final uj0.gxszxtbevo sopmlzcsov(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return new uj0.gxszxtbevo(state.getIsLoading(), state.getPrice(), state.getMethods(), state.getIsPaymentBonuses(), state.getSelectedMethod(), state.getNominal());
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f91535draadjrbmk;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f91537wflxmlrfwp;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(wkgbmnqykc wkgbmnqykcVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (wkgbmnqykcVar instanceof wkgbmnqykc.ppxfxbqfkf) {
            Object objCllcsxoeiz = cllcsxoeiz(new ppxfxbqfkf.iobyxmoadg(((wkgbmnqykc.ppxfxbqfkf) wkgbmnqykcVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (wkgbmnqykcVar instanceof wkgbmnqykc.iobyxmoadg) {
            d40.iobyxmoadg iobyxmoadgVar = d40.iobyxmoadg.f26931iobyxmoadg;
            iobyxmoadgVar.oxmwwwfdhm().ppxfxbqfkf(this.f91534btonecajqb.zoijcleaow(), this.f91534btonecajqb.iobyxmoadg(((wkgbmnqykc.iobyxmoadg) wkgbmnqykcVar).iobyxmoadg()));
            iobyxmoadgVar.gtknphoqwx();
        } else {
            if (!(wkgbmnqykcVar instanceof wkgbmnqykc.zoijcleaow)) {
                throw new NoWhenBranchMatchedException();
            }
            d40.iobyxmoadg.f26931iobyxmoadg.ylkuphrtab(MainTab.PROFILE, true, jyumaefscl.rgvfuqvkyq(this.f91536gtknphoqwx.iobyxmoadg(new OrdersArgs(c10.gxszxtbevo.CURRENT)), this.f91536gtknphoqwx.zoijcleaow(new SpecificOrderArgs(((wkgbmnqykc.zoijcleaow) wkgbmnqykcVar).iobyxmoadg(), null, true, 2, null))));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
