package ru.myspar.proloyalty.webview_screen.impl.myspar.presentation;

import androidx.lifecycle.pkzmftpjix;
import bx1.eablkybsjg;
import bx1.lqeggnwhkg;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import m21.dxjokdxxww;
import ru.myspar.proloyalty.webview_screen.impl.myspar.domain.State;
import ru.myspar.proloyalty.webview_screen.impl.myspar.domain.args.MySparWebViewTitle;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final draadjrbmk f102125btonecajqb;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final draadjrbmk f102126gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(lqeggnwhkg store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f102125btonecajqb = new draadjrbmk() { // from class: cx1.ppxfxbqfkf
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.webview_screen.impl.myspar.presentation.ppxfxbqfkf.sopmlzcsov((State) obj);
            }
        };
        this.f102126gtknphoqwx = new draadjrbmk() { // from class: cx1.wkgbmnqykc
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ru.myspar.proloyalty.webview_screen.impl.myspar.presentation.ppxfxbqfkf.ntlheqmsrt((ru.myspar.proloyalty.webview_screen.impl.myspar.presentation.zoijcleaow) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bx1.wkgbmnqykc ntlheqmsrt(zoijcleaow zoijcleaowVar) {
        bx1.wkgbmnqykc ppxfxbqfkfVar;
        zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(zoijcleaowVar, zoijcleaow.iobyxmoadg.f102130iobyxmoadg)) {
            return bx1.wkgbmnqykc.iobyxmoadg.f17354iobyxmoadg;
        }
        if (zoijcleaowVar instanceof zoijcleaow.C2460zoijcleaow) {
            ppxfxbqfkfVar = new bx1.wkgbmnqykc.zoijcleaow(((zoijcleaow.C2460zoijcleaow) zoijcleaowVar).iobyxmoadg());
        } else {
            if (!(zoijcleaowVar instanceof zoijcleaow.ppxfxbqfkf)) {
                throw new NoWhenBranchMatchedException();
            }
            ppxfxbqfkfVar = new bx1.wkgbmnqykc.ppxfxbqfkf(((zoijcleaow.ppxfxbqfkf) zoijcleaowVar).iobyxmoadg());
        }
        return ppxfxbqfkfVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cx1.iobyxmoadg sopmlzcsov(State state) {
        zdlpuopuiu.btonecajqb(state, "<this>");
        MySparWebViewTitle actionBarTitle = state.getActionBarTitle();
        String url = state.getUrl();
        if (url == null) {
            url = "";
        }
        boolean loadWithOverviewMode = state.getLoadWithOverviewMode();
        String webViewToken = state.getWebViewToken();
        return new cx1.iobyxmoadg(actionBarTitle, url, loadWithOverviewMode, webViewToken != null ? webViewToken : "");
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk esjtqupxsv() {
        return this.f102125btonecajqb;
    }

    @Override // pr0.zoijcleaow
    protected draadjrbmk iwizpuwonk() {
        return this.f102126gtknphoqwx;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(eablkybsjg eablkybsjgVar, gxszxtbevo gxszxtbevoVar) {
        if (zdlpuopuiu.eablkybsjg(eablkybsjgVar, eablkybsjg.iobyxmoadg.f17333iobyxmoadg)) {
            i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
        } else if (eablkybsjgVar instanceof eablkybsjg.zoijcleaow) {
            i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().lqeggnwhkg(dxjokdxxww.f64969iobyxmoadg.jyumaefscl(((eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg()));
        } else {
            if (!(eablkybsjgVar instanceof eablkybsjg.ppxfxbqfkf)) {
                throw new NoWhenBranchMatchedException();
            }
            i21.iobyxmoadg.f41720iobyxmoadg.pkzmftpjix(((eablkybsjg.ppxfxbqfkf) eablkybsjgVar).iobyxmoadg());
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
