package ru.myspar.webview_screen.impl.myspar.presentation;

import androidx.lifecycle.pkzmftpjix;
import db2.eablkybsjg;
import db2.lqeggnwhkg;
import gg.wwaezpbzkn;
import h40.dxjokdxxww;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import ru.myspar.webview_screen.impl.myspar.domain.State;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf extends ws.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final draadjrbmk f104766btonecajqb;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f104767gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(lqeggnwhkg store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f104766btonecajqb = new draadjrbmk() { // from class: fb2.ppxfxbqfkf
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.webview_screen.impl.myspar.presentation.ppxfxbqfkf.sopmlzcsov((State) obj);
            }
        };
        this.f104767gtknphoqwx = new draadjrbmk() { // from class: fb2.wkgbmnqykc
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.webview_screen.impl.myspar.presentation.ppxfxbqfkf.ntlheqmsrt((ru.myspar.webview_screen.impl.myspar.presentation.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final db2.wkgbmnqykc ntlheqmsrt(zoijcleaow zoijcleaowVar) {
        db2.wkgbmnqykc ppxfxbqfkfVar;
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.iobyxmoadg.f104770iobyxmoadg)) {
            return db2.wkgbmnqykc.iobyxmoadg.f27413iobyxmoadg;
        }
        if (zoijcleaowVar instanceof zoijcleaow.C2538zoijcleaow) {
            ppxfxbqfkfVar = new db2.wkgbmnqykc.zoijcleaow(((zoijcleaow.C2538zoijcleaow) zoijcleaowVar).iobyxmoadg());
        } else {
            if (!(zoijcleaowVar instanceof zoijcleaow.ppxfxbqfkf)) {
                throw new NoWhenBranchMatchedException();
            }
            ppxfxbqfkfVar = new db2.wkgbmnqykc.ppxfxbqfkf(((zoijcleaow.ppxfxbqfkf) zoijcleaowVar).iobyxmoadg());
        }
        return ppxfxbqfkfVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fb2.iobyxmoadg sopmlzcsov(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        return new fb2.iobyxmoadg(state.getActionBarTitle(), state.getUrl(), state.getLoadWithOverviewMode());
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f104766btonecajqb;
    }

    @Override // ws.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f104767gtknphoqwx;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.iobyxmoadg.f27405iobyxmoadg)) {
            d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
        } else if (eablkybsjgVar instanceof eablkybsjg.zoijcleaow) {
            d40.iobyxmoadg.f26931iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(dxjokdxxww.f39382iobyxmoadg.jyumaefscl(((eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg()));
        } else {
            if (!(eablkybsjgVar instanceof eablkybsjg.ppxfxbqfkf)) {
                throw new NoWhenBranchMatchedException();
            }
            d40.iobyxmoadg.f26931iobyxmoadg.pkzmftpjix(((eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg());
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
