package ru.myspar.proloyalty.webview_screen.impl.trackingorder.presentation;

import androidx.lifecycle.pkzmftpjix;
import dx1.lqeggnwhkg;
import ex1.nufgyqmvbu;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import m21.dxjokdxxww;
import ru.myspar.proloyalty.webview_screen.impl.trackingorder.domain.store.State;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final draadjrbmk f102157btonecajqb;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f102158gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f102157btonecajqb = new draadjrbmk() { // from class: ex1.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.webview_screen.impl.trackingorder.presentation.iobyxmoadg.sopmlzcsov((State) obj);
            }
        };
        this.f102158gtknphoqwx = new draadjrbmk() { // from class: ex1.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.webview_screen.impl.trackingorder.presentation.iobyxmoadg.ntlheqmsrt((ru.myspar.proloyalty.webview_screen.impl.trackingorder.presentation.ppxfxbqfkf) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dx1.wkgbmnqykc ntlheqmsrt(ppxfxbqfkf ppxfxbqfkfVar) {
        dx1.wkgbmnqykc ppxfxbqfkfVar2;
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.iobyxmoadg.f102159iobyxmoadg)) {
            return dx1.wkgbmnqykc.iobyxmoadg.f29808iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.zoijcleaow) {
            ppxfxbqfkfVar2 = new dx1.wkgbmnqykc.zoijcleaow(((ppxfxbqfkf.zoijcleaow) ppxfxbqfkfVar).iobyxmoadg());
        } else {
            if (!(ppxfxbqfkfVar instanceof ppxfxbqfkf.C2461ppxfxbqfkf)) {
                throw new NoWhenBranchMatchedException();
            }
            ppxfxbqfkfVar2 = new dx1.wkgbmnqykc.ppxfxbqfkf(((ppxfxbqfkf.C2461ppxfxbqfkf) ppxfxbqfkfVar).iobyxmoadg());
        }
        return ppxfxbqfkfVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nufgyqmvbu sopmlzcsov(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return new nufgyqmvbu(state.getOrderId(), state.getTrackingUrl(), state.getToken());
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f102157btonecajqb;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f102158gtknphoqwx;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(dx1.eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof dx1.eablkybsjg.ppxfxbqfkf) {
            Object objCllcsxoeiz = cllcsxoeiz(new wkgbmnqykc.zoijcleaow(((dx1.eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof dx1.eablkybsjg.C0608eablkybsjg) {
            Object objCllcsxoeiz2 = cllcsxoeiz(new wkgbmnqykc.ppxfxbqfkf(((dx1.eablkybsjg.C0608eablkybsjg) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof dx1.eablkybsjg.zoijcleaow) {
            i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(dxjokdxxww.f64969iobyxmoadg.dxjokdxxww(((dx1.eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg()));
        } else {
            if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, dx1.eablkybsjg.iobyxmoadg.f29778iobyxmoadg)) {
                if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, dx1.eablkybsjg.wkgbmnqykc.f29780iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                Object objCllcsxoeiz3 = cllcsxoeiz(wkgbmnqykc.iobyxmoadg.f102162iobyxmoadg, gxszxtbevoVar);
                return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
            }
            i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
