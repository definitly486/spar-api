package ru.myspar.scango.impl.screens.cart.presentation;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.payment.api.model.PaymentMethodsArgs;
import ru.myspar.payment.api.model.PaymentType;
import ru.myspar.scango.impl.component.domain.model.product.ScanGoScanProductPayload;
import ru.myspar.scango.impl.screens.cart.domain.State;
import ru.myspar.scango.impl.screens.cart.domain.lqeggnwhkg;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends ws.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final qj0.iobyxmoadg f103406btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f103407draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f103408gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, qj0.iobyxmoadg paymentFeatureApi) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(paymentFeatureApi, "paymentFeatureApi");
        this.f103406btonecajqb = paymentFeatureApi;
        this.f103408gtknphoqwx = new draadjrbmk() { // from class: x22.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.scango.impl.screens.cart.presentation.iobyxmoadg.crxdokpmqz((State) obj);
            }
        };
        this.f103407draadjrbmk = new draadjrbmk() { // from class: x22.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.scango.impl.screens.cart.presentation.iobyxmoadg.ntlheqmsrt((ru.myspar.scango.impl.screens.cart.presentation.ppxfxbqfkf) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wkgbmnqykc crxdokpmqz(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return z22.iobyxmoadg.iobyxmoadg(state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.scango.impl.screens.cart.domain.wkgbmnqykc ntlheqmsrt(ppxfxbqfkf ppxfxbqfkfVar) {
        ru.myspar.scango.impl.screens.cart.domain.wkgbmnqykc nufgyqmvbuVar;
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.dxjokdxxww.f103411iobyxmoadg)) {
            return ru.myspar.scango.impl.screens.cart.domain.wkgbmnqykc.dxjokdxxww.f103347iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.btonecajqb) {
            nufgyqmvbuVar = new ru.myspar.scango.impl.screens.cart.domain.wkgbmnqykc.btonecajqb(((ppxfxbqfkf.btonecajqb) ppxfxbqfkfVar).iobyxmoadg());
        } else {
            if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.gxszxtbevo.f103414iobyxmoadg)) {
                return ru.myspar.scango.impl.screens.cart.domain.wkgbmnqykc.gxszxtbevo.f103350iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.iobyxmoadg.f103415iobyxmoadg)) {
                return ru.myspar.scango.impl.screens.cart.domain.wkgbmnqykc.iobyxmoadg.f103351iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.zoijcleaow.f103421iobyxmoadg)) {
                return ru.myspar.scango.impl.screens.cart.domain.wkgbmnqykc.zoijcleaow.f103357iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.C2507ppxfxbqfkf.f103418iobyxmoadg)) {
                return ru.myspar.scango.impl.screens.cart.domain.wkgbmnqykc.ppxfxbqfkf.f103354iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.wkgbmnqykc.f103420iobyxmoadg)) {
                return ru.myspar.scango.impl.screens.cart.domain.wkgbmnqykc.C2505wkgbmnqykc.f103356iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.gtknphoqwx.f103413iobyxmoadg)) {
                return ru.myspar.scango.impl.screens.cart.domain.wkgbmnqykc.gtknphoqwx.f103349iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.wflxmlrfwp.f103419iobyxmoadg)) {
                return ru.myspar.scango.impl.screens.cart.domain.wkgbmnqykc.wflxmlrfwp.f103355iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.eablkybsjg.f103412iobyxmoadg)) {
                return ru.myspar.scango.impl.screens.cart.domain.wkgbmnqykc.eablkybsjg.f103348iobyxmoadg;
            }
            if (ppxfxbqfkfVar instanceof ppxfxbqfkf.lqeggnwhkg) {
                nufgyqmvbuVar = new ru.myspar.scango.impl.screens.cart.domain.wkgbmnqykc.lqeggnwhkg(((ppxfxbqfkf.lqeggnwhkg) ppxfxbqfkfVar).iobyxmoadg());
            } else if (ppxfxbqfkfVar instanceof ppxfxbqfkf.draadjrbmk) {
                nufgyqmvbuVar = new ru.myspar.scango.impl.screens.cart.domain.wkgbmnqykc.draadjrbmk(((ppxfxbqfkf.draadjrbmk) ppxfxbqfkfVar).iobyxmoadg());
            } else {
                if (!(ppxfxbqfkfVar instanceof ppxfxbqfkf.nufgyqmvbu)) {
                    throw new NoWhenBranchMatchedException();
                }
                nufgyqmvbuVar = new ru.myspar.scango.impl.screens.cart.domain.wkgbmnqykc.nufgyqmvbu(((ppxfxbqfkf.nufgyqmvbu) ppxfxbqfkfVar).iobyxmoadg());
            }
        }
        return nufgyqmvbuVar;
    }

    private final List ulzqkzuiru() {
        return jyumaefscl.rgvfuqvkyq(o22.iobyxmoadg.CHANGE_PRODUCT_QUANTITY, o22.iobyxmoadg.DELETE_PRODUCT, o22.iobyxmoadg.ORDER);
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f103408gtknphoqwx;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f103407draadjrbmk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: sopmlzcsov, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(ru.myspar.scango.impl.screens.cart.domain.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof ru.myspar.scango.impl.screens.cart.domain.eablkybsjg.C2499eablkybsjg) {
            Object objCllcsxoeiz = cllcsxoeiz(new eablkybsjg.gxszxtbevo(((ru.myspar.scango.impl.screens.cart.domain.eablkybsjg.C2499eablkybsjg) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, ru.myspar.scango.impl.screens.cart.domain.eablkybsjg.btonecajqb.f103258iobyxmoadg)) {
            Object objCllcsxoeiz2 = cllcsxoeiz(eablkybsjg.lqeggnwhkg.f103393iobyxmoadg, gxszxtbevoVar);
            return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, ru.myspar.scango.impl.screens.cart.domain.eablkybsjg.dxjokdxxww.f103260iobyxmoadg)) {
            Object objCllcsxoeiz3 = cllcsxoeiz(eablkybsjg.C2506eablkybsjg.f103390iobyxmoadg, gxszxtbevoVar);
            return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, ru.myspar.scango.impl.screens.cart.domain.eablkybsjg.iobyxmoadg.f103264iobyxmoadg)) {
            Object objCllcsxoeiz4 = cllcsxoeiz(eablkybsjg.iobyxmoadg.f103392iobyxmoadg, gxszxtbevoVar);
            return objCllcsxoeiz4 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz4 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, ru.myspar.scango.impl.screens.cart.domain.eablkybsjg.nufgyqmvbu.f103266iobyxmoadg)) {
            Object objCllcsxoeiz5 = cllcsxoeiz(eablkybsjg.wkgbmnqykc.f103396iobyxmoadg, gxszxtbevoVar);
            return objCllcsxoeiz5 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz5 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof ru.myspar.scango.impl.screens.cart.domain.eablkybsjg.gtknphoqwx) {
            Object objCllcsxoeiz6 = cllcsxoeiz(new eablkybsjg.nufgyqmvbu(((ru.myspar.scango.impl.screens.cart.domain.eablkybsjg.gtknphoqwx) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz6 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz6 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof ru.myspar.scango.impl.screens.cart.domain.eablkybsjg.lqeggnwhkg) {
            Object objCllcsxoeiz7 = cllcsxoeiz(new eablkybsjg.ppxfxbqfkf(((ru.myspar.scango.impl.screens.cart.domain.eablkybsjg.lqeggnwhkg) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz7 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz7 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof ru.myspar.scango.impl.screens.cart.domain.eablkybsjg.wflxmlrfwp) {
            Object objCllcsxoeiz8 = cllcsxoeiz(new eablkybsjg.btonecajqb(((ru.myspar.scango.impl.screens.cart.domain.eablkybsjg.wflxmlrfwp) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz8 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz8 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof ru.myspar.scango.impl.screens.cart.domain.eablkybsjg.draadjrbmk) {
            Object objCllcsxoeiz9 = cllcsxoeiz(new eablkybsjg.dxjokdxxww(ulzqkzuiru()), gxszxtbevoVar);
            return objCllcsxoeiz9 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz9 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof ru.myspar.scango.impl.screens.cart.domain.eablkybsjg.gxszxtbevo) {
            Object objCllcsxoeiz10 = cllcsxoeiz(new eablkybsjg.zoijcleaow(((ru.myspar.scango.impl.screens.cart.domain.eablkybsjg.gxszxtbevo) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz10 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz10 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof ru.myspar.scango.impl.screens.cart.domain.eablkybsjg.wkgbmnqykc) {
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(ru.myspar.scango.impl.screens.scan.product.presentation.iobyxmoadg.zoijcleaow(new ScanGoScanProductPayload(((ru.myspar.scango.impl.screens.cart.domain.eablkybsjg.wkgbmnqykc) eablkybsjgVar).iobyxmoadg())));
        } else if (eablkybsjgVar instanceof ru.myspar.scango.impl.screens.cart.domain.eablkybsjg.zoijcleaow) {
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().eablkybsjg(null);
        } else {
            if (!(eablkybsjgVar instanceof ru.myspar.scango.impl.screens.cart.domain.eablkybsjg.ppxfxbqfkf)) {
                throw new NoWhenBranchMatchedException();
            }
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f103406btonecajqb.ppxfxbqfkf(new PaymentMethodsArgs(new PaymentType.ScanGo(null, 1, null), null, ((ru.myspar.scango.impl.screens.cart.domain.eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg(), false, null, 16, null)));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
