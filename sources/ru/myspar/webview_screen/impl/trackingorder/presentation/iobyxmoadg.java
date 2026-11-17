package ru.myspar.webview_screen.impl.trackingorder.presentation;

import androidx.lifecycle.pkzmftpjix;
import gb2.lqeggnwhkg;
import gg.wwaezpbzkn;
import h40.dxjokdxxww;
import hb2.nufgyqmvbu;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ru.myspar.webview_screen.impl.trackingorder.domain.store.State;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends ws.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final draadjrbmk f104796btonecajqb;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f104797gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(lqeggnwhkg store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f104796btonecajqb = new draadjrbmk() { // from class: hb2.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.webview_screen.impl.trackingorder.presentation.iobyxmoadg.sopmlzcsov((State) obj);
            }
        };
        this.f104797gtknphoqwx = new draadjrbmk() { // from class: hb2.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.webview_screen.impl.trackingorder.presentation.iobyxmoadg.ntlheqmsrt((ru.myspar.webview_screen.impl.trackingorder.presentation.ppxfxbqfkf) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gb2.wkgbmnqykc ntlheqmsrt(ppxfxbqfkf ppxfxbqfkfVar) {
        gb2.wkgbmnqykc ppxfxbqfkfVar2;
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, ppxfxbqfkf.iobyxmoadg.f104798iobyxmoadg)) {
            return gb2.wkgbmnqykc.iobyxmoadg.f36788iobyxmoadg;
        }
        if (ppxfxbqfkfVar instanceof ppxfxbqfkf.zoijcleaow) {
            ppxfxbqfkfVar2 = new gb2.wkgbmnqykc.zoijcleaow(((ppxfxbqfkf.zoijcleaow) ppxfxbqfkfVar).iobyxmoadg());
        } else {
            if (!(ppxfxbqfkfVar instanceof ppxfxbqfkf.C2539ppxfxbqfkf)) {
                throw new NoWhenBranchMatchedException();
            }
            ppxfxbqfkfVar2 = new gb2.wkgbmnqykc.ppxfxbqfkf(((ppxfxbqfkf.C2539ppxfxbqfkf) ppxfxbqfkfVar).iobyxmoadg());
        }
        return ppxfxbqfkfVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nufgyqmvbu sopmlzcsov(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return new nufgyqmvbu(state.getOrderId(), state.getTrackingUrl());
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f104796btonecajqb;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f104797gtknphoqwx;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(gb2.eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (eablkybsjgVar instanceof gb2.eablkybsjg.ppxfxbqfkf) {
            Object objCllcsxoeiz = cllcsxoeiz(new wkgbmnqykc.zoijcleaow(((gb2.eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof gb2.eablkybsjg.C0831eablkybsjg) {
            Object objCllcsxoeiz2 = cllcsxoeiz(new wkgbmnqykc.ppxfxbqfkf(((gb2.eablkybsjg.C0831eablkybsjg) eablkybsjgVar).iobyxmoadg()), gxszxtbevoVar);
            return objCllcsxoeiz2 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz2 : wwaezpbzkn.f37140iobyxmoadg;
        }
        if (eablkybsjgVar instanceof gb2.eablkybsjg.zoijcleaow) {
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(dxjokdxxww.f39382iobyxmoadg.dxjokdxxww(((gb2.eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg()));
        } else {
            if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, gb2.eablkybsjg.iobyxmoadg.f36771iobyxmoadg)) {
                if (!zdlpuopuiu.eablkybsjg(eablkybsjgVar, gb2.eablkybsjg.wkgbmnqykc.f36773iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                Object objCllcsxoeiz3 = cllcsxoeiz(wkgbmnqykc.iobyxmoadg.f104801iobyxmoadg, gxszxtbevoVar);
                return objCllcsxoeiz3 == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz3 : wwaezpbzkn.f37140iobyxmoadg;
            }
            d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
