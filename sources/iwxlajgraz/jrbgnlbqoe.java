package iwxlajgraz;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.ui.platform.w;
import j0.l;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes.dex */
public final class jrbgnlbqoe implements InputConnection {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private boolean f49879dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final w f49880eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private int f49882gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final auzgnhcxok f49883iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private p0.tzroggbefp f49884lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private int f49885nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final opjhrmiecq.igdgnonuha f49886ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final skhdrjzrfn.skhdrjzrfn f49887wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f49888zoijcleaow;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final List f49878btonecajqb = new ArrayList();

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private boolean f49881gtknphoqwx = true;

    public jrbgnlbqoe(p0.tzroggbefp tzroggbefpVar, auzgnhcxok auzgnhcxokVar, boolean z13, opjhrmiecq.igdgnonuha igdgnonuhaVar, skhdrjzrfn.skhdrjzrfn skhdrjzrfnVar, w wVar) {
        this.f49883iobyxmoadg = auzgnhcxokVar;
        this.f49888zoijcleaow = z13;
        this.f49886ppxfxbqfkf = igdgnonuhaVar;
        this.f49887wkgbmnqykc = skhdrjzrfnVar;
        this.f49880eablkybsjg = wVar;
        this.f49884lqeggnwhkg = tzroggbefpVar;
    }

    private final boolean eablkybsjg() {
        int i13 = this.f49882gxszxtbevo - 1;
        this.f49882gxszxtbevo = i13;
        if (i13 == 0 && !this.f49878btonecajqb.isEmpty()) {
            this.f49883iobyxmoadg.wkgbmnqykc(hg.jyumaefscl.p(this.f49878btonecajqb));
            this.f49878btonecajqb.clear();
        }
        return this.f49882gxszxtbevo > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn gxszxtbevo(jrbgnlbqoe jrbgnlbqoeVar, p0.dxjokdxxww dxjokdxxwwVar) {
        jrbgnlbqoeVar.ppxfxbqfkf(dxjokdxxwwVar);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void lqeggnwhkg(int i13) {
        sendKeyEvent(new KeyEvent(0, i13));
        sendKeyEvent(new KeyEvent(1, i13));
    }

    private final void ppxfxbqfkf(p0.dxjokdxxww dxjokdxxwwVar) {
        wkgbmnqykc();
        try {
            this.f49878btonecajqb.add(dxjokdxxwwVar);
        } finally {
            eablkybsjg();
        }
    }

    private final boolean wkgbmnqykc() {
        this.f49882gxszxtbevo++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        boolean z13 = this.f49881gtknphoqwx;
        return z13 ? wkgbmnqykc() : z13;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i13) {
        boolean z13 = this.f49881gtknphoqwx;
        if (z13) {
            return false;
        }
        return z13;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.f49878btonecajqb.clear();
        this.f49882gxszxtbevo = 0;
        this.f49881gtknphoqwx = false;
        this.f49883iobyxmoadg.eablkybsjg(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z13 = this.f49881gtknphoqwx;
        if (z13) {
            return false;
        }
        return z13;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i13, Bundle bundle) {
        boolean z13 = this.f49881gtknphoqwx;
        if (z13) {
            return false;
        }
        return z13;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z13 = this.f49881gtknphoqwx;
        return z13 ? this.f49888zoijcleaow : z13;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i13) {
        boolean z13 = this.f49881gtknphoqwx;
        if (z13) {
            ppxfxbqfkf(new p0.iobyxmoadg(String.valueOf(charSequence), i13));
        }
        return z13;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i13, int i14) {
        boolean z13 = this.f49881gtknphoqwx;
        if (!z13) {
            return z13;
        }
        ppxfxbqfkf(new p0.lqeggnwhkg(i13, i14));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i13, int i14) {
        boolean z13 = this.f49881gtknphoqwx;
        if (!z13) {
            return z13;
        }
        ppxfxbqfkf(new p0.nufgyqmvbu(i13, i14));
        return true;
    }

    public final void dxjokdxxww(p0.tzroggbefp tzroggbefpVar, iwxlajgraz iwxlajgrazVar) {
        if (this.f49881gtknphoqwx) {
            nufgyqmvbu(tzroggbefpVar);
            if (this.f49879dxjokdxxww) {
                iwxlajgrazVar.iobyxmoadg(this.f49885nufgyqmvbu, fmlbqenlif.zoijcleaow(tzroggbefpVar));
            }
            l lVarBtonecajqb = tzroggbefpVar.btonecajqb();
            int iDraadjrbmk = lVarBtonecajqb != null ? l.draadjrbmk(lVarBtonecajqb.oxmwwwfdhm()) : -1;
            l lVarBtonecajqb2 = tzroggbefpVar.btonecajqb();
            iwxlajgrazVar.zoijcleaow(l.draadjrbmk(tzroggbefpVar.gtknphoqwx()), l.gtknphoqwx(tzroggbefpVar.gtknphoqwx()), iDraadjrbmk, lVarBtonecajqb2 != null ? l.gtknphoqwx(lVarBtonecajqb2.oxmwwwfdhm()) : -1);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return eablkybsjg();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        boolean z13 = this.f49881gtknphoqwx;
        if (!z13) {
            return z13;
        }
        ppxfxbqfkf(new p0.ojitshcjhn());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i13) {
        return TextUtils.getCapsMode(this.f49884lqeggnwhkg.draadjrbmk(), l.draadjrbmk(this.f49884lqeggnwhkg.gtknphoqwx()), i13);
    }

    @Override // android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i13) {
        boolean z13 = (i13 & 1) != 0;
        this.f49879dxjokdxxww = z13;
        if (z13) {
            this.f49885nufgyqmvbu = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return fmlbqenlif.zoijcleaow(this.f49884lqeggnwhkg);
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getSelectedText(int i13) {
        if (l.nufgyqmvbu(this.f49884lqeggnwhkg.gtknphoqwx())) {
            return null;
        }
        return p0.mbcevpiqjq.iobyxmoadg(this.f49884lqeggnwhkg).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextAfterCursor(int i13, int i14) {
        return p0.mbcevpiqjq.zoijcleaow(this.f49884lqeggnwhkg, i13).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextBeforeCursor(int i13, int i14) {
        return p0.mbcevpiqjq.ppxfxbqfkf(this.f49884lqeggnwhkg, i13).toString();
    }

    public final void nufgyqmvbu(p0.tzroggbefp tzroggbefpVar) {
        this.f49884lqeggnwhkg = tzroggbefpVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i13) {
        boolean z13 = this.f49881gtknphoqwx;
        if (z13) {
            z13 = false;
            switch (i13) {
                case R.id.selectAll:
                    ppxfxbqfkf(new p0.wypolnanlu(0, this.f49884lqeggnwhkg.draadjrbmk().length()));
                    break;
                case R.id.cut:
                    lqeggnwhkg(277);
                    break;
                case R.id.copy:
                    lqeggnwhkg(278);
                    break;
                case R.id.paste:
                    lqeggnwhkg(279);
                    break;
            }
        }
        return z13;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i13) {
        int iIobyxmoadg;
        boolean z13 = this.f49881gtknphoqwx;
        if (!z13) {
            return z13;
        }
        if (i13 != 0) {
            switch (i13) {
                case 2:
                    iIobyxmoadg = p0.kcexrzcfyt.f75246zoijcleaow.ppxfxbqfkf();
                    break;
                case 3:
                    iIobyxmoadg = p0.kcexrzcfyt.f75246zoijcleaow.lqeggnwhkg();
                    break;
                case 4:
                    iIobyxmoadg = p0.kcexrzcfyt.f75246zoijcleaow.nufgyqmvbu();
                    break;
                case 5:
                    iIobyxmoadg = p0.kcexrzcfyt.f75246zoijcleaow.wkgbmnqykc();
                    break;
                case 6:
                    iIobyxmoadg = p0.kcexrzcfyt.f75246zoijcleaow.zoijcleaow();
                    break;
                case 7:
                    iIobyxmoadg = p0.kcexrzcfyt.f75246zoijcleaow.gxszxtbevo();
                    break;
                default:
                    Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i13);
                    iIobyxmoadg = p0.kcexrzcfyt.f75246zoijcleaow.iobyxmoadg();
                    break;
            }
        } else {
            iIobyxmoadg = p0.kcexrzcfyt.f75246zoijcleaow.iobyxmoadg();
        }
        this.f49883iobyxmoadg.ppxfxbqfkf(iIobyxmoadg);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        if (Build.VERSION.SDK_INT >= 34) {
            eablkybsjg.f49845iobyxmoadg.zoijcleaow(this.f49886ppxfxbqfkf, this.f49887wkgbmnqykc, handwritingGesture, this.f49880eablkybsjg, executor, intConsumer, new tg.draadjrbmk() { // from class: iwxlajgraz.ixidwrxhsl
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return jrbgnlbqoe.gxszxtbevo(this.f49877zdlpuopuiu, (p0.dxjokdxxww) obj);
                }
            });
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z13 = this.f49881gtknphoqwx;
        if (z13) {
            return true;
        }
        return z13;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (Build.VERSION.SDK_INT >= 34) {
            return eablkybsjg.f49845iobyxmoadg.wkgbmnqykc(this.f49886ppxfxbqfkf, this.f49887wkgbmnqykc, previewableHandwritingGesture, cancellationSignal);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z13) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i13) {
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17 = this.f49881gtknphoqwx;
        if (!z17) {
            return z17;
        }
        boolean z18 = false;
        boolean z19 = (i13 & 1) != 0;
        boolean z23 = (i13 & 2) != 0;
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 33) {
            boolean z24 = (i13 & 16) != 0;
            boolean z25 = (i13 & 8) != 0;
            boolean z26 = (i13 & 4) != 0;
            if (i14 >= 34 && (i13 & 32) != 0) {
                z18 = true;
            }
            if (z24 || z25 || z26 || z18) {
                z14 = z18;
                z13 = z26;
                z16 = z25;
                z15 = z24;
            } else if (i14 >= 34) {
                z15 = true;
                z16 = true;
                z13 = true;
                z14 = true;
            } else {
                z14 = z18;
                z15 = true;
                z16 = true;
                z13 = true;
            }
        } else {
            z13 = false;
            z14 = false;
            z15 = true;
            z16 = true;
        }
        this.f49883iobyxmoadg.zoijcleaow(z19, z23, z15, z16, z13, z14);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z13 = this.f49881gtknphoqwx;
        if (!z13) {
            return z13;
        }
        this.f49883iobyxmoadg.iobyxmoadg(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i13, int i14) {
        boolean z13 = this.f49881gtknphoqwx;
        if (z13) {
            ppxfxbqfkf(new p0.cllcsxoeiz(i13, i14));
        }
        return z13;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i13) {
        boolean z13 = this.f49881gtknphoqwx;
        if (z13) {
            ppxfxbqfkf(new p0.dsvhmnatus(String.valueOf(charSequence), i13));
        }
        return z13;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i13, int i14) {
        boolean z13 = this.f49881gtknphoqwx;
        if (!z13) {
            return z13;
        }
        ppxfxbqfkf(new p0.wypolnanlu(i13, i14));
        return true;
    }
}
