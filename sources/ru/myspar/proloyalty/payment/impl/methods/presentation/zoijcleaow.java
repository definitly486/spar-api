package ru.myspar.proloyalty.payment.impl.methods.presentation;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.ui.model.MainTab;
import ru.myspar.proloyalty.orders.api.model.OrdersArgs;
import ru.myspar.proloyalty.orders.api.model.SpecificOrderArgs;
import ru.myspar.proloyalty.payment.api.PaymentMethodResultHelper;
import ru.myspar.proloyalty.payment.impl.methods.domain.store.State;
import sz0.eablkybsjg;
import tg.draadjrbmk;
import ug1.gxszxtbevo;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final PaymentMethodResultHelper f99189btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f99190draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final wf1.iobyxmoadg f99191gtknphoqwx;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final draadjrbmk f99192wflxmlrfwp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(gxszxtbevo store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, PaymentMethodResultHelper paymentMethodResultHelper, wf1.iobyxmoadg ordersFeatureApi) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(paymentMethodResultHelper, "paymentMethodResultHelper");
        zdlpuopuiu.btonecajqb(ordersFeatureApi, "ordersFeatureApi");
        this.f99189btonecajqb = paymentMethodResultHelper;
        this.f99191gtknphoqwx = ordersFeatureApi;
        this.f99190draadjrbmk = new draadjrbmk() { // from class: vg1.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.payment.impl.methods.presentation.zoijcleaow.sopmlzcsov((State) obj);
            }
        };
        this.f99192wflxmlrfwp = new draadjrbmk() { // from class: vg1.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.payment.impl.methods.presentation.zoijcleaow.ntlheqmsrt((ru.myspar.proloyalty.payment.impl.methods.presentation.ppxfxbqfkf) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ug1.ppxfxbqfkf ntlheqmsrt(ppxfxbqfkf ppxfxbqfkfVar) {
        ug1.ppxfxbqfkf wkgbmnqykcVar;
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.iobyxmoadg) {
            return ug1.ppxfxbqfkf.iobyxmoadg.f113552iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.C2371ppxfxbqfkf) {
            return ug1.ppxfxbqfkf.C2815ppxfxbqfkf.f113553iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.zoijcleaow) {
            wkgbmnqykcVar = new ug1.ppxfxbqfkf.zoijcleaow(((ppxfxbqfkf.zoijcleaow) ppxfxbqfkfVar).iobyxmoadg());
        } else {
            if (!(ppxfxbqfkfVar instanceof ppxfxbqfkf.wkgbmnqykc)) {
                throw new NoWhenBranchMatchedException();
            }
            wkgbmnqykcVar = new ug1.ppxfxbqfkf.wkgbmnqykc(((ppxfxbqfkf.wkgbmnqykc) ppxfxbqfkfVar).iobyxmoadg());
        }
        return wkgbmnqykcVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vg1.gxszxtbevo sopmlzcsov(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return new vg1.gxszxtbevo(state.getIsLoading(), state.getPrice(), state.getMethods(), state.getIsPaymentBonuses(), state.getSelectedMethod(), state.getNominal());
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f99190draadjrbmk;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f99192wflxmlrfwp;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(ug1.wkgbmnqykc wkgbmnqykcVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (wkgbmnqykcVar instanceof ug1.wkgbmnqykc.ppxfxbqfkf) {
            Object objCllcsxoeiz = cllcsxoeiz(new wkgbmnqykc.iobyxmoadg(((ug1.wkgbmnqykc.ppxfxbqfkf) wkgbmnqykcVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (wkgbmnqykcVar instanceof ug1.wkgbmnqykc.iobyxmoadg) {
            i21.iobyxmoadg iobyxmoadgVar = i21.iobyxmoadg.f41720iobyxmoadg;
            iobyxmoadgVar.oxmwwwfdhm().ppxfxbqfkf(this.f99189btonecajqb.zoijcleaow(), this.f99189btonecajqb.iobyxmoadg(((ug1.wkgbmnqykc.iobyxmoadg) wkgbmnqykcVar).iobyxmoadg()));
            iobyxmoadgVar.gtknphoqwx();
        } else {
            if (!(wkgbmnqykcVar instanceof ug1.wkgbmnqykc.zoijcleaow)) {
                throw new NoWhenBranchMatchedException();
            }
            i21.iobyxmoadg.f41720iobyxmoadg.ylkuphrtab(MainTab.PROFILE, true, jyumaefscl.rgvfuqvkyq(this.f99191gtknphoqwx.zoijcleaow(new OrdersArgs(eablkybsjg.CURRENT)), this.f99191gtknphoqwx.iobyxmoadg(new SpecificOrderArgs(((ug1.wkgbmnqykc.zoijcleaow) wkgbmnqykcVar).iobyxmoadg(), null, true, 2, null))));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
