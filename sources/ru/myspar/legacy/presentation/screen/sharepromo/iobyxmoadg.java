package ru.myspar.legacy.presentation.screen.sharepromo;

import androidx.lifecycle.pkzmftpjix;
import e80.lqeggnwhkg;
import gg.wwaezpbzkn;
import h40.dxjokdxxww;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import nd0.nufgyqmvbu;
import ru.myspar.domain.feature.sharepromo.store.State;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ws.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final draadjrbmk f89692btonecajqb;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f89693gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f89692btonecajqb = new draadjrbmk() { // from class: nd0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.legacy.presentation.screen.sharepromo.iobyxmoadg.sopmlzcsov((State) obj);
            }
        };
        this.f89693gtknphoqwx = new draadjrbmk() { // from class: nd0.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.legacy.presentation.screen.sharepromo.iobyxmoadg.ntlheqmsrt((ru.myspar.legacy.presentation.screen.sharepromo.ppxfxbqfkf) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e80.wkgbmnqykc ntlheqmsrt(ppxfxbqfkf ppxfxbqfkfVar) {
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.iobyxmoadg.f89695iobyxmoadg)) {
            return e80.wkgbmnqykc.iobyxmoadg.f30921iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.zoijcleaow.f89698iobyxmoadg)) {
            return e80.wkgbmnqykc.zoijcleaow.f30924iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.C2057ppxfxbqfkf.f89696iobyxmoadg)) {
            return e80.wkgbmnqykc.C0647wkgbmnqykc.f30923iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.wkgbmnqykc) {
            return new e80.wkgbmnqykc.eablkybsjg(((ppxfxbqfkf.wkgbmnqykc) ppxfxbqfkfVar).iobyxmoadg());
        }
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.eablkybsjg.f89694iobyxmoadg)) {
            return e80.wkgbmnqykc.ppxfxbqfkf.f30922iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nufgyqmvbu sopmlzcsov(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return new nufgyqmvbu(state.getImage(), state.getText(), state.getPromoCode(), state.getShareMsg(), state.getIsPromoAvailable(), state.getIsLoading());
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f89692btonecajqb;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f89693gtknphoqwx;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(e80.eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof e80.eablkybsjg.zoijcleaow) {
            Object objCllcsxoeiz = cllcsxoeiz(new wkgbmnqykc.iobyxmoadg(((e80.eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, e80.eablkybsjg.iobyxmoadg.f30900iobyxmoadg)) {
            d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
        } else if (eablkybsjgVar instanceof e80.eablkybsjg.ppxfxbqfkf) {
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().eablkybsjg(dxjokdxxww.f39382iobyxmoadg.jyumaefscl(((e80.eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg()));
        } else {
            if (!(eablkybsjgVar instanceof e80.eablkybsjg.C0645eablkybsjg)) {
                if (!(eablkybsjgVar instanceof e80.eablkybsjg.wkgbmnqykc)) {
                    throw new NoWhenBranchMatchedException();
                }
                Object objCllcsxoeiz2 = cllcsxoeiz(new wkgbmnqykc.zoijcleaow(((e80.eablkybsjg.wkgbmnqykc) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
                return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
            }
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().eablkybsjg(dxjokdxxww.f39382iobyxmoadg.vdvldrhtss(((e80.eablkybsjg.C0645eablkybsjg) eablkybsjgVar).iobyxmoadg()));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
