package androidx.compose.ui.viewinterop;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.kcexrzcfyt;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import f.btonecajqb;
import f.gtknphoqwx;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;
import z.opjhrmiecq;
import z.rlfsiqarku;
import z.wflxmlrfwp;

/* JADX INFO: loaded from: classes.dex */
final class lqeggnwhkg extends androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf implements gtknphoqwx, ViewTreeObserver.OnGlobalFocusChangeListener {

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private final draadjrbmk f7254hcddaimhww = new iobyxmoadg();

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private final draadjrbmk f7255jpowsppfya = new zoijcleaow();

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private ViewTreeObserver f7256pkzmftpjix;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private View f7257ylkuphrtab;

    static final class iobyxmoadg extends jyumaefscl implements draadjrbmk {
        iobyxmoadg() {
            super(1);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((f.ppxfxbqfkf) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(f.ppxfxbqfkf ppxfxbqfkfVar) {
            View viewLqeggnwhkg = gxszxtbevo.lqeggnwhkg(lqeggnwhkg.this);
            if (viewLqeggnwhkg.isFocused() || viewLqeggnwhkg.hasFocus()) {
                return;
            }
            if (androidx.compose.ui.focus.gxszxtbevo.zoijcleaow(viewLqeggnwhkg, androidx.compose.ui.focus.gxszxtbevo.ppxfxbqfkf(ppxfxbqfkfVar.zoijcleaow()), gxszxtbevo.gxszxtbevo(z.gtknphoqwx.vdvldrhtss(lqeggnwhkg.this).getFocusOwner(), z.draadjrbmk.iobyxmoadg(lqeggnwhkg.this), viewLqeggnwhkg))) {
                return;
            }
            ppxfxbqfkfVar.iobyxmoadg();
        }
    }

    static final class zoijcleaow extends jyumaefscl implements draadjrbmk {
        zoijcleaow() {
            super(1);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((f.ppxfxbqfkf) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(f.ppxfxbqfkf ppxfxbqfkfVar) {
            View viewFindNextFocusFromRect;
            View viewLqeggnwhkg = gxszxtbevo.lqeggnwhkg(lqeggnwhkg.this);
            if (a.nufgyqmvbu.f65wkgbmnqykc) {
                if (viewLqeggnwhkg.hasFocus() || viewLqeggnwhkg.isFocused()) {
                    viewLqeggnwhkg.clearFocus();
                    return;
                }
                return;
            }
            if (viewLqeggnwhkg.hasFocus()) {
                btonecajqb focusOwner = z.gtknphoqwx.vdvldrhtss(lqeggnwhkg.this).getFocusOwner();
                View viewIobyxmoadg = z.draadjrbmk.iobyxmoadg(lqeggnwhkg.this);
                if (!(viewLqeggnwhkg instanceof ViewGroup)) {
                    if (!viewIobyxmoadg.requestFocus()) {
                        throw new IllegalStateException("host view did not take focus");
                    }
                    return;
                }
                Rect rectGxszxtbevo = gxszxtbevo.gxszxtbevo(focusOwner, viewIobyxmoadg, viewLqeggnwhkg);
                Integer numPpxfxbqfkf = androidx.compose.ui.focus.gxszxtbevo.ppxfxbqfkf(ppxfxbqfkfVar.zoijcleaow());
                int iIntValue = numPpxfxbqfkf != null ? numPpxfxbqfkf.intValue() : 130;
                FocusFinder focusFinder = FocusFinder.getInstance();
                lqeggnwhkg lqeggnwhkgVar = lqeggnwhkg.this;
                if (lqeggnwhkgVar.I0() != null) {
                    zdlpuopuiu.nufgyqmvbu(viewIobyxmoadg, "null cannot be cast to non-null type android.view.ViewGroup");
                    viewFindNextFocusFromRect = focusFinder.findNextFocus((ViewGroup) viewIobyxmoadg, lqeggnwhkgVar.I0(), iIntValue);
                } else {
                    zdlpuopuiu.nufgyqmvbu(viewIobyxmoadg, "null cannot be cast to non-null type android.view.ViewGroup");
                    viewFindNextFocusFromRect = focusFinder.findNextFocusFromRect((ViewGroup) viewIobyxmoadg, rectGxszxtbevo, iIntValue);
                }
                if (viewFindNextFocusFromRect == null || !gxszxtbevo.wkgbmnqykc(viewLqeggnwhkg, viewFindNextFocusFromRect)) {
                    if (!viewIobyxmoadg.requestFocus()) {
                        throw new IllegalStateException("host view did not take focus");
                    }
                } else {
                    viewFindNextFocusFromRect.requestFocus(iIntValue, rectGxszxtbevo);
                    ppxfxbqfkfVar.iobyxmoadg();
                }
            }
        }
    }

    private final FocusTargetNode H0() {
        int iIobyxmoadg = rlfsiqarku.iobyxmoadg(UserVerificationMethods.USER_VERIFY_ALL);
        if (!wflxmlrfwp().n0()) {
            w.iobyxmoadg.zoijcleaow("visitLocalDescendants called on an unattached node");
        }
        androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarWflxmlrfwp = wflxmlrfwp();
        if ((ppxfxbqfkfVarWflxmlrfwp.d0() & iIobyxmoadg) != 0) {
            boolean z13 = false;
            for (androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarE0 = ppxfxbqfkfVarWflxmlrfwp.e0(); ppxfxbqfkfVarE0 != null; ppxfxbqfkfVarE0 = ppxfxbqfkfVarE0.e0()) {
                if ((ppxfxbqfkfVarE0.i0() & iIobyxmoadg) != 0) {
                    androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarDxjokdxxww = ppxfxbqfkfVarE0;
                    ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar = null;
                    while (ppxfxbqfkfVarDxjokdxxww != null) {
                        if (ppxfxbqfkfVarDxjokdxxww instanceof FocusTargetNode) {
                            FocusTargetNode focusTargetNode = (FocusTargetNode) ppxfxbqfkfVarDxjokdxxww;
                            if (z13) {
                                return focusTargetNode;
                            }
                            z13 = true;
                        } else if ((ppxfxbqfkfVarDxjokdxxww.i0() & iIobyxmoadg) != 0 && (ppxfxbqfkfVarDxjokdxxww instanceof wflxmlrfwp)) {
                            int i13 = 0;
                            for (androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarI0 = ((wflxmlrfwp) ppxfxbqfkfVarDxjokdxxww).I0(); ppxfxbqfkfVarI0 != null; ppxfxbqfkfVarI0 = ppxfxbqfkfVarI0.e0()) {
                                if ((ppxfxbqfkfVarI0.i0() & iIobyxmoadg) != 0) {
                                    i13++;
                                    if (i13 == 1) {
                                        ppxfxbqfkfVarDxjokdxxww = ppxfxbqfkfVarI0;
                                    } else {
                                        if (ppxfxbqfkfVar == null) {
                                            ppxfxbqfkfVar = new ipoelvxyzq.ppxfxbqfkf(new androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf[16], 0);
                                        }
                                        if (ppxfxbqfkfVarDxjokdxxww != null) {
                                            ppxfxbqfkfVar.zoijcleaow(ppxfxbqfkfVarDxjokdxxww);
                                            ppxfxbqfkfVarDxjokdxxww = null;
                                        }
                                        ppxfxbqfkfVar.zoijcleaow(ppxfxbqfkfVarI0);
                                    }
                                }
                            }
                            if (i13 == 1) {
                            }
                        }
                        ppxfxbqfkfVarDxjokdxxww = z.gtknphoqwx.dxjokdxxww(ppxfxbqfkfVar);
                    }
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }

    public final View I0() {
        return this.f7257ylkuphrtab;
    }

    @Override // f.gtknphoqwx
    public void m(androidx.compose.ui.focus.dxjokdxxww dxjokdxxwwVar) {
        dxjokdxxwwVar.gxszxtbevo(false);
        dxjokdxxwwVar.ppxfxbqfkf(this.f7254hcddaimhww);
        dxjokdxxwwVar.nufgyqmvbu(this.f7255jpowsppfya);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(View view, View view2) {
        if (z.gtknphoqwx.rgvfuqvkyq(this).uawqvzlxes() == null) {
            return;
        }
        View viewLqeggnwhkg = gxszxtbevo.lqeggnwhkg(this);
        btonecajqb focusOwner = z.gtknphoqwx.vdvldrhtss(this).getFocusOwner();
        opjhrmiecq opjhrmiecqVarVdvldrhtss = z.gtknphoqwx.vdvldrhtss(this);
        boolean z13 = (view == null || zdlpuopuiu.eablkybsjg(view, opjhrmiecqVarVdvldrhtss) || !gxszxtbevo.wkgbmnqykc(viewLqeggnwhkg, view)) ? false : true;
        boolean z14 = (view2 == null || zdlpuopuiu.eablkybsjg(view2, opjhrmiecqVarVdvldrhtss) || !gxszxtbevo.wkgbmnqykc(viewLqeggnwhkg, view2)) ? false : true;
        if (z13 && z14) {
            this.f7257ylkuphrtab = view2;
            return;
        }
        if (z14) {
            this.f7257ylkuphrtab = view2;
            FocusTargetNode focusTargetNodeH0 = H0();
            if (focusTargetNodeH0.jlmebxxoox().wkgbmnqykc()) {
                return;
            }
            kcexrzcfyt.dxjokdxxww(focusTargetNodeH0);
            return;
        }
        if (!z13) {
            this.f7257ylkuphrtab = null;
            return;
        }
        this.f7257ylkuphrtab = null;
        if (H0().jlmebxxoox().iobyxmoadg()) {
            focusOwner.rgvfuqvkyq(false, true, false, androidx.compose.ui.focus.wkgbmnqykc.f6266zoijcleaow.ppxfxbqfkf());
        }
    }

    @Override // androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf
    public void q0() {
        super.q0();
        ViewTreeObserver viewTreeObserver = z.draadjrbmk.iobyxmoadg(this).getViewTreeObserver();
        this.f7256pkzmftpjix = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf
    public void r0() {
        ViewTreeObserver viewTreeObserver = this.f7256pkzmftpjix;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.f7256pkzmftpjix = null;
        z.draadjrbmk.iobyxmoadg(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.f7257ylkuphrtab = null;
        super.r0();
    }
}
