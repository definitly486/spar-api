package p0;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import j0.l;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hkdspvbjdz implements InputConnection {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f75220eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private boolean f75221gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final yggfygwlhe f75222iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final List f75223lqeggnwhkg = new ArrayList();

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private boolean f75224nufgyqmvbu = true;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f75225ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private tzroggbefp f75226wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f75227zoijcleaow;

    public hkdspvbjdz(tzroggbefp tzroggbefpVar, yggfygwlhe yggfygwlheVar, boolean z13) {
        this.f75222iobyxmoadg = yggfygwlheVar;
        this.f75227zoijcleaow = z13;
        this.f75226wkgbmnqykc = tzroggbefpVar;
    }

    private final void eablkybsjg(int i13) {
        sendKeyEvent(new KeyEvent(0, i13));
        sendKeyEvent(new KeyEvent(1, i13));
    }

    private final boolean ppxfxbqfkf() {
        this.f75225ppxfxbqfkf++;
        return true;
    }

    private final boolean wkgbmnqykc() {
        int i13 = this.f75225ppxfxbqfkf - 1;
        this.f75225ppxfxbqfkf = i13;
        if (i13 == 0 && !this.f75223lqeggnwhkg.isEmpty()) {
            this.f75222iobyxmoadg.wkgbmnqykc(hg.jyumaefscl.p(this.f75223lqeggnwhkg));
            this.f75223lqeggnwhkg.clear();
        }
        return this.f75225ppxfxbqfkf > 0;
    }

    private final void zoijcleaow(dxjokdxxww dxjokdxxwwVar) {
        ppxfxbqfkf();
        try {
            this.f75223lqeggnwhkg.add(dxjokdxxwwVar);
        } finally {
            wkgbmnqykc();
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        boolean z13 = this.f75224nufgyqmvbu;
        return z13 ? ppxfxbqfkf() : z13;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i13) {
        boolean z13 = this.f75224nufgyqmvbu;
        if (z13) {
            return false;
        }
        return z13;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.f75223lqeggnwhkg.clear();
        this.f75225ppxfxbqfkf = 0;
        this.f75224nufgyqmvbu = false;
        this.f75222iobyxmoadg.eablkybsjg(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z13 = this.f75224nufgyqmvbu;
        if (z13) {
            return false;
        }
        return z13;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i13, Bundle bundle) {
        boolean z13 = this.f75224nufgyqmvbu;
        if (z13) {
            return false;
        }
        return z13;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z13 = this.f75224nufgyqmvbu;
        return z13 ? this.f75227zoijcleaow : z13;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i13) {
        boolean z13 = this.f75224nufgyqmvbu;
        if (z13) {
            zoijcleaow(new iobyxmoadg(String.valueOf(charSequence), i13));
        }
        return z13;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i13, int i14) {
        boolean z13 = this.f75224nufgyqmvbu;
        if (!z13) {
            return z13;
        }
        zoijcleaow(new lqeggnwhkg(i13, i14));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i13, int i14) {
        boolean z13 = this.f75224nufgyqmvbu;
        if (!z13) {
            return z13;
        }
        zoijcleaow(new nufgyqmvbu(i13, i14));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return wkgbmnqykc();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        boolean z13 = this.f75224nufgyqmvbu;
        if (!z13) {
            return z13;
        }
        zoijcleaow(new ojitshcjhn());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i13) {
        return TextUtils.getCapsMode(this.f75226wkgbmnqykc.draadjrbmk(), l.draadjrbmk(this.f75226wkgbmnqykc.gtknphoqwx()), i13);
    }

    @Override // android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i13) {
        boolean z13 = (i13 & 1) != 0;
        this.f75221gxszxtbevo = z13;
        if (z13) {
            this.f75220eablkybsjg = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return cqumvgiudr.iobyxmoadg(this.f75226wkgbmnqykc);
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getSelectedText(int i13) {
        if (l.nufgyqmvbu(this.f75226wkgbmnqykc.gtknphoqwx())) {
            return null;
        }
        return mbcevpiqjq.iobyxmoadg(this.f75226wkgbmnqykc).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextAfterCursor(int i13, int i14) {
        return mbcevpiqjq.zoijcleaow(this.f75226wkgbmnqykc, i13).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextBeforeCursor(int i13, int i14) {
        return mbcevpiqjq.ppxfxbqfkf(this.f75226wkgbmnqykc, i13).toString();
    }

    public final void gxszxtbevo(tzroggbefp tzroggbefpVar) {
        this.f75226wkgbmnqykc = tzroggbefpVar;
    }

    public final void lqeggnwhkg(tzroggbefp tzroggbefpVar, jyumaefscl jyumaefsclVar) {
        if (this.f75224nufgyqmvbu) {
            gxszxtbevo(tzroggbefpVar);
            if (this.f75221gxszxtbevo) {
                jyumaefsclVar.iobyxmoadg(this.f75220eablkybsjg, cqumvgiudr.iobyxmoadg(tzroggbefpVar));
            }
            l lVarBtonecajqb = tzroggbefpVar.btonecajqb();
            int iDraadjrbmk = lVarBtonecajqb != null ? l.draadjrbmk(lVarBtonecajqb.oxmwwwfdhm()) : -1;
            l lVarBtonecajqb2 = tzroggbefpVar.btonecajqb();
            jyumaefsclVar.zoijcleaow(l.draadjrbmk(tzroggbefpVar.gtknphoqwx()), l.gtknphoqwx(tzroggbefpVar.gtknphoqwx()), iDraadjrbmk, lVarBtonecajqb2 != null ? l.gtknphoqwx(lVarBtonecajqb2.oxmwwwfdhm()) : -1);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i13) {
        boolean z13 = this.f75224nufgyqmvbu;
        if (z13) {
            z13 = false;
            switch (i13) {
                case R.id.selectAll:
                    zoijcleaow(new wypolnanlu(0, this.f75226wkgbmnqykc.draadjrbmk().length()));
                    break;
                case R.id.cut:
                    eablkybsjg(277);
                    break;
                case R.id.copy:
                    eablkybsjg(278);
                    break;
                case R.id.paste:
                    eablkybsjg(279);
                    break;
            }
        }
        return z13;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i13) {
        int iIobyxmoadg;
        boolean z13 = this.f75224nufgyqmvbu;
        if (!z13) {
            return z13;
        }
        if (i13 != 0) {
            switch (i13) {
                case 2:
                    iIobyxmoadg = kcexrzcfyt.f75246zoijcleaow.ppxfxbqfkf();
                    break;
                case 3:
                    iIobyxmoadg = kcexrzcfyt.f75246zoijcleaow.lqeggnwhkg();
                    break;
                case 4:
                    iIobyxmoadg = kcexrzcfyt.f75246zoijcleaow.nufgyqmvbu();
                    break;
                case 5:
                    iIobyxmoadg = kcexrzcfyt.f75246zoijcleaow.wkgbmnqykc();
                    break;
                case 6:
                    iIobyxmoadg = kcexrzcfyt.f75246zoijcleaow.zoijcleaow();
                    break;
                case 7:
                    iIobyxmoadg = kcexrzcfyt.f75246zoijcleaow.gxszxtbevo();
                    break;
                default:
                    Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i13);
                    iIobyxmoadg = kcexrzcfyt.f75246zoijcleaow.iobyxmoadg();
                    break;
            }
        } else {
            iIobyxmoadg = kcexrzcfyt.f75246zoijcleaow.iobyxmoadg();
        }
        this.f75222iobyxmoadg.ppxfxbqfkf(iIobyxmoadg);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z13 = this.f75224nufgyqmvbu;
        if (z13) {
            return true;
        }
        return z13;
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
        boolean z17 = this.f75224nufgyqmvbu;
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
        this.f75222iobyxmoadg.zoijcleaow(z19, z23, z15, z16, z13, z14);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z13 = this.f75224nufgyqmvbu;
        if (!z13) {
            return z13;
        }
        this.f75222iobyxmoadg.iobyxmoadg(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i13, int i14) {
        boolean z13 = this.f75224nufgyqmvbu;
        if (z13) {
            zoijcleaow(new cllcsxoeiz(i13, i14));
        }
        return z13;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i13) {
        boolean z13 = this.f75224nufgyqmvbu;
        if (z13) {
            zoijcleaow(new dsvhmnatus(String.valueOf(charSequence), i13));
        }
        return z13;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i13, int i14) {
        boolean z13 = this.f75224nufgyqmvbu;
        if (!z13) {
            return z13;
        }
        zoijcleaow(new wypolnanlu(i13, i14));
        return true;
    }
}
