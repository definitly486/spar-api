package ru.myspar.proloyalty.scango.impl.screens.cart.presentation;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.payment.api.model.PaymentMethodsArgs;
import ru.myspar.proloyalty.payment.api.model.PaymentType;
import ru.myspar.proloyalty.scango.impl.component.domain.model.product.ScanGoScanProductPayload;
import ru.myspar.proloyalty.scango.impl.screens.cart.domain.State;
import ru.myspar.proloyalty.scango.impl.screens.cart.domain.lqeggnwhkg;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final rg1.iobyxmoadg f100749btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final draadjrbmk f100750draadjrbmk;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f100751gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle, rg1.iobyxmoadg paymentFeatureApi) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        zdlpuopuiu.btonecajqb(paymentFeatureApi, "paymentFeatureApi");
        this.f100749btonecajqb = paymentFeatureApi;
        this.f100751gtknphoqwx = new draadjrbmk() { // from class: to1.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.scango.impl.screens.cart.presentation.iobyxmoadg.crxdokpmqz((State) obj);
            }
        };
        this.f100750draadjrbmk = new draadjrbmk() { // from class: to1.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.scango.impl.screens.cart.presentation.iobyxmoadg.ntlheqmsrt((ru.myspar.proloyalty.scango.impl.screens.cart.presentation.ppxfxbqfkf) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wkgbmnqykc crxdokpmqz(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return vo1.iobyxmoadg.iobyxmoadg(state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.proloyalty.scango.impl.screens.cart.domain.wkgbmnqykc ntlheqmsrt(ppxfxbqfkf ppxfxbqfkfVar) {
        ru.myspar.proloyalty.scango.impl.screens.cart.domain.wkgbmnqykc nufgyqmvbuVar;
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.dxjokdxxww.f100754iobyxmoadg)) {
            return ru.myspar.proloyalty.scango.impl.screens.cart.domain.wkgbmnqykc.dxjokdxxww.f100690iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.btonecajqb) {
            nufgyqmvbuVar = new ru.myspar.proloyalty.scango.impl.screens.cart.domain.wkgbmnqykc.btonecajqb(((ppxfxbqfkf.btonecajqb) ppxfxbqfkfVar).iobyxmoadg());
        } else {
            if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.gxszxtbevo.f100757iobyxmoadg)) {
                return ru.myspar.proloyalty.scango.impl.screens.cart.domain.wkgbmnqykc.gxszxtbevo.f100693iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.iobyxmoadg.f100758iobyxmoadg)) {
                return ru.myspar.proloyalty.scango.impl.screens.cart.domain.wkgbmnqykc.iobyxmoadg.f100694iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.zoijcleaow.f100764iobyxmoadg)) {
                return ru.myspar.proloyalty.scango.impl.screens.cart.domain.wkgbmnqykc.zoijcleaow.f100700iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.C2428ppxfxbqfkf.f100761iobyxmoadg)) {
                return ru.myspar.proloyalty.scango.impl.screens.cart.domain.wkgbmnqykc.ppxfxbqfkf.f100697iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.wkgbmnqykc.f100763iobyxmoadg)) {
                return ru.myspar.proloyalty.scango.impl.screens.cart.domain.wkgbmnqykc.C2426wkgbmnqykc.f100699iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.gtknphoqwx.f100756iobyxmoadg)) {
                return ru.myspar.proloyalty.scango.impl.screens.cart.domain.wkgbmnqykc.gtknphoqwx.f100692iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.wflxmlrfwp.f100762iobyxmoadg)) {
                return ru.myspar.proloyalty.scango.impl.screens.cart.domain.wkgbmnqykc.wflxmlrfwp.f100698iobyxmoadg;
            }
            if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.eablkybsjg.f100755iobyxmoadg)) {
                return ru.myspar.proloyalty.scango.impl.screens.cart.domain.wkgbmnqykc.eablkybsjg.f100691iobyxmoadg;
            }
            if (ppxfxbqfkfVar instanceof ppxfxbqfkf.lqeggnwhkg) {
                nufgyqmvbuVar = new ru.myspar.proloyalty.scango.impl.screens.cart.domain.wkgbmnqykc.lqeggnwhkg(((ppxfxbqfkf.lqeggnwhkg) ppxfxbqfkfVar).iobyxmoadg());
            } else if (ppxfxbqfkfVar instanceof ppxfxbqfkf.draadjrbmk) {
                nufgyqmvbuVar = new ru.myspar.proloyalty.scango.impl.screens.cart.domain.wkgbmnqykc.draadjrbmk(((ppxfxbqfkf.draadjrbmk) ppxfxbqfkfVar).iobyxmoadg());
            } else {
                if (!(ppxfxbqfkfVar instanceof ppxfxbqfkf.nufgyqmvbu)) {
                    throw new NoWhenBranchMatchedException();
                }
                nufgyqmvbuVar = new ru.myspar.proloyalty.scango.impl.screens.cart.domain.wkgbmnqykc.nufgyqmvbu(((ppxfxbqfkf.nufgyqmvbu) ppxfxbqfkfVar).iobyxmoadg());
            }
        }
        return nufgyqmvbuVar;
    }

    private final List ulzqkzuiru() {
        return jyumaefscl.rgvfuqvkyq(ko1.iobyxmoadg.CHANGE_PRODUCT_QUANTITY, ko1.iobyxmoadg.DELETE_PRODUCT, ko1.iobyxmoadg.ORDER);
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f100751gtknphoqwx;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f100750draadjrbmk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: sopmlzcsov, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(ru.myspar.proloyalty.scango.impl.screens.cart.domain.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof ru.myspar.proloyalty.scango.impl.screens.cart.domain.eablkybsjg.C2420eablkybsjg) {
            Object objCllcsxoeiz = cllcsxoeiz(new eablkybsjg.gxszxtbevo(((ru.myspar.proloyalty.scango.impl.screens.cart.domain.eablkybsjg.C2420eablkybsjg) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, ru.myspar.proloyalty.scango.impl.screens.cart.domain.eablkybsjg.btonecajqb.f100602iobyxmoadg)) {
            Object objCllcsxoeiz2 = cllcsxoeiz(eablkybsjg.lqeggnwhkg.f100736iobyxmoadg, gxszxtbevoVar);
            return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, ru.myspar.proloyalty.scango.impl.screens.cart.domain.eablkybsjg.dxjokdxxww.f100604iobyxmoadg)) {
            Object objCllcsxoeiz3 = cllcsxoeiz(eablkybsjg.C2427eablkybsjg.f100733iobyxmoadg, gxszxtbevoVar);
            return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, ru.myspar.proloyalty.scango.impl.screens.cart.domain.eablkybsjg.iobyxmoadg.f100608iobyxmoadg)) {
            Object objCllcsxoeiz4 = cllcsxoeiz(eablkybsjg.iobyxmoadg.f100735iobyxmoadg, gxszxtbevoVar);
            return objCllcsxoeiz4 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz4 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, ru.myspar.proloyalty.scango.impl.screens.cart.domain.eablkybsjg.nufgyqmvbu.f100610iobyxmoadg)) {
            Object objCllcsxoeiz5 = cllcsxoeiz(eablkybsjg.wkgbmnqykc.f100739iobyxmoadg, gxszxtbevoVar);
            return objCllcsxoeiz5 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz5 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof ru.myspar.proloyalty.scango.impl.screens.cart.domain.eablkybsjg.gtknphoqwx) {
            Object objCllcsxoeiz6 = cllcsxoeiz(new eablkybsjg.nufgyqmvbu(((ru.myspar.proloyalty.scango.impl.screens.cart.domain.eablkybsjg.gtknphoqwx) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz6 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz6 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof ru.myspar.proloyalty.scango.impl.screens.cart.domain.eablkybsjg.lqeggnwhkg) {
            Object objCllcsxoeiz7 = cllcsxoeiz(new eablkybsjg.ppxfxbqfkf(((ru.myspar.proloyalty.scango.impl.screens.cart.domain.eablkybsjg.lqeggnwhkg) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz7 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz7 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof ru.myspar.proloyalty.scango.impl.screens.cart.domain.eablkybsjg.wflxmlrfwp) {
            Object objCllcsxoeiz8 = cllcsxoeiz(new eablkybsjg.btonecajqb(((ru.myspar.proloyalty.scango.impl.screens.cart.domain.eablkybsjg.wflxmlrfwp) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz8 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz8 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof ru.myspar.proloyalty.scango.impl.screens.cart.domain.eablkybsjg.draadjrbmk) {
            Object objCllcsxoeiz9 = cllcsxoeiz(new eablkybsjg.dxjokdxxww(ulzqkzuiru()), gxszxtbevoVar);
            return objCllcsxoeiz9 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz9 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof ru.myspar.proloyalty.scango.impl.screens.cart.domain.eablkybsjg.gxszxtbevo) {
            Object objCllcsxoeiz10 = cllcsxoeiz(new eablkybsjg.zoijcleaow(((ru.myspar.proloyalty.scango.impl.screens.cart.domain.eablkybsjg.gxszxtbevo) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz10 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz10 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof ru.myspar.proloyalty.scango.impl.screens.cart.domain.eablkybsjg.wkgbmnqykc) {
            i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.iobyxmoadg.zoijcleaow(new ScanGoScanProductPayload(((ru.myspar.proloyalty.scango.impl.screens.cart.domain.eablkybsjg.wkgbmnqykc) eablkybsjgVar).iobyxmoadg())));
        } else if (eablkybsjgVar instanceof ru.myspar.proloyalty.scango.impl.screens.cart.domain.eablkybsjg.zoijcleaow) {
            i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().eablkybsjg(null);
        } else {
            if (!(eablkybsjgVar instanceof ru.myspar.proloyalty.scango.impl.screens.cart.domain.eablkybsjg.ppxfxbqfkf)) {
                throw new NoWhenBranchMatchedException();
            }
            i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(this.f100749btonecajqb.zoijcleaow(new PaymentMethodsArgs(new PaymentType.ScanGo(null, 1, null), null, ((ru.myspar.proloyalty.scango.impl.screens.cart.domain.eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg(), false, null, 16, null)));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
