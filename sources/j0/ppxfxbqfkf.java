package j0;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;

/* JADX INFO: loaded from: classes.dex */
public abstract class ppxfxbqfkf {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int agtfadlqog(int i13) {
        v0.gxszxtbevo.zoijcleaow.iobyxmoadg iobyxmoadgVar = v0.gxszxtbevo.zoijcleaow.f114975iobyxmoadg;
        if (v0.gxszxtbevo.zoijcleaow.eablkybsjg(i13, iobyxmoadgVar.ppxfxbqfkf())) {
            return 0;
        }
        if (v0.gxszxtbevo.zoijcleaow.eablkybsjg(i13, iobyxmoadgVar.zoijcleaow())) {
            return 1;
        }
        return v0.gxszxtbevo.zoijcleaow.eablkybsjg(i13, iobyxmoadgVar.iobyxmoadg()) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence btonecajqb(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return charSequence;
        }
        Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : null;
        if (spannableString == null) {
            spannableString = new SpannableString(charSequence);
        }
        if (!k0.dsvhmnatus.iobyxmoadg(spannableString, m0.ppxfxbqfkf.class)) {
            t0.wkgbmnqykc.esjtqupxsv(spannableString, new m0.ppxfxbqfkf(), spannableString.length() - 1, spannableString.length() - 1);
        }
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean draadjrbmk(n nVar, boolean z13) {
        if (!z13 || w0.jyumaefscl.eablkybsjg(nVar.vdvldrhtss(), w0.iwizpuwonk.dxjokdxxww(0)) || w0.jyumaefscl.eablkybsjg(nVar.vdvldrhtss(), w0.jyumaefscl.f118259zoijcleaow.iobyxmoadg())) {
            return false;
        }
        int iLereixgezr = nVar.lereixgezr();
        v0.btonecajqb.iobyxmoadg iobyxmoadgVar = v0.btonecajqb.f114934zoijcleaow;
        return (v0.btonecajqb.gtknphoqwx(iLereixgezr, iobyxmoadgVar.lqeggnwhkg()) || v0.btonecajqb.gtknphoqwx(nVar.lereixgezr(), iobyxmoadgVar.gxszxtbevo()) || v0.btonecajqb.gtknphoqwx(nVar.lereixgezr(), iobyxmoadgVar.ppxfxbqfkf())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int gtknphoqwx(k0.rlfsiqarku rlfsiqarkuVar, int i13) {
        int iWflxmlrfwp = rlfsiqarkuVar.wflxmlrfwp();
        for (int i14 = 0; i14 < iWflxmlrfwp; i14++) {
            if (rlfsiqarkuVar.draadjrbmk(i14) > i13) {
                return i14;
            }
        }
        return rlfsiqarkuVar.wflxmlrfwp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ojitshcjhn(int i13) {
        v0.eablkybsjg.iobyxmoadg iobyxmoadgVar = v0.eablkybsjg.f114951zoijcleaow;
        if (v0.eablkybsjg.lqeggnwhkg(i13, iobyxmoadgVar.iobyxmoadg())) {
            return Build.VERSION.SDK_INT <= 32 ? 2 : 4;
        }
        v0.eablkybsjg.lqeggnwhkg(i13, iobyxmoadgVar.zoijcleaow());
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int oxmwwwfdhm(int i13) {
        eslsurpljm.iobyxmoadg iobyxmoadgVar = eslsurpljm.f50188iobyxmoadg;
        return (!eslsurpljm.wkgbmnqykc(i13, iobyxmoadgVar.iobyxmoadg()) && eslsurpljm.wkgbmnqykc(i13, iobyxmoadgVar.zoijcleaow())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int rgvfuqvkyq(int i13) {
        v0.gxszxtbevo.ppxfxbqfkf.iobyxmoadg iobyxmoadgVar = v0.gxszxtbevo.ppxfxbqfkf.f114966iobyxmoadg;
        if (v0.gxszxtbevo.ppxfxbqfkf.gxszxtbevo(i13, iobyxmoadgVar.iobyxmoadg())) {
            return 0;
        }
        if (v0.gxszxtbevo.ppxfxbqfkf.gxszxtbevo(i13, iobyxmoadgVar.zoijcleaow())) {
            return 1;
        }
        if (v0.gxszxtbevo.ppxfxbqfkf.gxszxtbevo(i13, iobyxmoadgVar.ppxfxbqfkf())) {
            return 2;
        }
        return v0.gxszxtbevo.ppxfxbqfkf.gxszxtbevo(i13, iobyxmoadgVar.wkgbmnqykc()) ? 3 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int vdvldrhtss(int i13) {
        v0.gxszxtbevo.wkgbmnqykc.iobyxmoadg iobyxmoadgVar = v0.gxszxtbevo.wkgbmnqykc.f114970iobyxmoadg;
        return (!v0.gxszxtbevo.wkgbmnqykc.wkgbmnqykc(i13, iobyxmoadgVar.iobyxmoadg()) && v0.gxszxtbevo.wkgbmnqykc.wkgbmnqykc(i13, iobyxmoadgVar.zoijcleaow())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int wflxmlrfwp(int i13) {
        v0.btonecajqb.iobyxmoadg iobyxmoadgVar = v0.btonecajqb.f114934zoijcleaow;
        if (v0.btonecajqb.gtknphoqwx(i13, iobyxmoadgVar.wkgbmnqykc())) {
            return 3;
        }
        if (v0.btonecajqb.gtknphoqwx(i13, iobyxmoadgVar.eablkybsjg())) {
            return 4;
        }
        if (v0.btonecajqb.gtknphoqwx(i13, iobyxmoadgVar.iobyxmoadg())) {
            return 2;
        }
        return (!v0.btonecajqb.gtknphoqwx(i13, iobyxmoadgVar.gxszxtbevo()) && v0.btonecajqb.gtknphoqwx(i13, iobyxmoadgVar.zoijcleaow())) ? 1 : 0;
    }
}
