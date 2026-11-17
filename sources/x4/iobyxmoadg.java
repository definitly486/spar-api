package x4;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.common.collect.zdlpuopuiu;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import kotlin.KotlinVersion;
import q4.eablkybsjg;
import q4.oxmwwwfdhm;
import y2.kcexrzcfyt;
import y2.stevsuqkhv;
import y2.wflxmlrfwp;
import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
public final class iobyxmoadg implements oxmwwwfdhm {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f121135eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final float f121136gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final yadqdtsiqt f121137iobyxmoadg = new yadqdtsiqt();

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final int f121138lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f121139ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f121140wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f121141zoijcleaow;

    public iobyxmoadg(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f121139ppxfxbqfkf = 0;
            this.f121140wkgbmnqykc = -1;
            this.f121135eablkybsjg = "sans-serif";
            this.f121141zoijcleaow = false;
            this.f121136gxszxtbevo = 0.85f;
            this.f121138lqeggnwhkg = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f121139ppxfxbqfkf = bArr[24];
        this.f121140wkgbmnqykc = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f121135eablkybsjg = "Serif".equals(stevsuqkhv.wwaezpbzkn(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i13 = bArr[25] * 20;
        this.f121138lqeggnwhkg = i13;
        boolean z13 = (bArr[0] & 32) != 0;
        this.f121141zoijcleaow = z13;
        if (z13) {
            this.f121136gxszxtbevo = stevsuqkhv.agtfadlqog(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i13, 0.0f, 0.95f);
        } else {
            this.f121136gxszxtbevo = 0.85f;
        }
    }

    private static String dxjokdxxww(yadqdtsiqt yadqdtsiqtVar) {
        y2.iobyxmoadg.iobyxmoadg(yadqdtsiqtVar.iobyxmoadg() >= 2);
        int iWypolnanlu = yadqdtsiqtVar.wypolnanlu();
        if (iWypolnanlu == 0) {
            return "";
        }
        int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo();
        Charset charsetKegysxyocb = yadqdtsiqtVar.kegysxyocb();
        int iGxszxtbevo2 = iWypolnanlu - (yadqdtsiqtVar.gxszxtbevo() - iGxszxtbevo);
        if (charsetKegysxyocb == null) {
            charsetKegysxyocb = StandardCharsets.UTF_8;
        }
        return yadqdtsiqtVar.iozdgvuglv(iGxszxtbevo2, charsetKegysxyocb);
    }

    private void eablkybsjg(yadqdtsiqt yadqdtsiqtVar, SpannableStringBuilder spannableStringBuilder) {
        y2.iobyxmoadg.iobyxmoadg(yadqdtsiqtVar.iobyxmoadg() >= 12);
        int iWypolnanlu = yadqdtsiqtVar.wypolnanlu();
        int iWypolnanlu2 = yadqdtsiqtVar.wypolnanlu();
        yadqdtsiqtVar.crxdokpmqz(2);
        int iWwaezpbzkn = yadqdtsiqtVar.wwaezpbzkn();
        yadqdtsiqtVar.crxdokpmqz(1);
        int iVdvldrhtss = yadqdtsiqtVar.vdvldrhtss();
        if (iWypolnanlu2 > spannableStringBuilder.length()) {
            kcexrzcfyt.nufgyqmvbu("Tx3gParser", "Truncating styl end (" + iWypolnanlu2 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            iWypolnanlu2 = spannableStringBuilder.length();
        }
        if (iWypolnanlu < iWypolnanlu2) {
            int i13 = iWypolnanlu2;
            lqeggnwhkg(spannableStringBuilder, iWwaezpbzkn, this.f121139ppxfxbqfkf, iWypolnanlu, i13, 0);
            gxszxtbevo(spannableStringBuilder, iVdvldrhtss, this.f121140wkgbmnqykc, iWypolnanlu, i13, 0);
            return;
        }
        kcexrzcfyt.nufgyqmvbu("Tx3gParser", "Ignoring styl with start (" + iWypolnanlu + ") >= end (" + iWypolnanlu2 + ").");
    }

    private static void gxszxtbevo(SpannableStringBuilder spannableStringBuilder, int i13, int i14, int i15, int i16, int i17) {
        if (i13 != i14) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i13 >>> 8) | ((i13 & KotlinVersion.MAX_COMPONENT_VALUE) << 24)), i15, i16, i17 | 33);
        }
    }

    private static void lqeggnwhkg(SpannableStringBuilder spannableStringBuilder, int i13, int i14, int i15, int i16, int i17) {
        if (i13 != i14) {
            int i18 = i17 | 33;
            boolean z13 = (i13 & 1) != 0;
            boolean z14 = (i13 & 2) != 0;
            if (z13) {
                if (z14) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i15, i16, i18);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i15, i16, i18);
                }
            } else if (z14) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i15, i16, i18);
            }
            boolean z15 = (i13 & 4) != 0;
            if (z15) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i15, i16, i18);
            }
            if (z15 || z13 || z14) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i15, i16, i18);
        }
    }

    private static void nufgyqmvbu(SpannableStringBuilder spannableStringBuilder, String str, int i13, int i14) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i13, i14, 16711713);
        }
    }

    @Override // q4.oxmwwwfdhm
    public void ppxfxbqfkf(byte[] bArr, int i13, int i14, oxmwwwfdhm.zoijcleaow zoijcleaowVar, wflxmlrfwp wflxmlrfwpVar) {
        this.f121137iobyxmoadg.ntlheqmsrt(bArr, i13 + i14);
        this.f121137iobyxmoadg.sopmlzcsov(i13);
        String strDxjokdxxww = dxjokdxxww(this.f121137iobyxmoadg);
        if (strDxjokdxxww.isEmpty()) {
            wflxmlrfwpVar.accept(new eablkybsjg(zdlpuopuiu.zynmafqrjb(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strDxjokdxxww);
        lqeggnwhkg(spannableStringBuilder, this.f121139ppxfxbqfkf, 0, 0, spannableStringBuilder.length(), 16711680);
        gxszxtbevo(spannableStringBuilder, this.f121140wkgbmnqykc, -1, 0, spannableStringBuilder.length(), 16711680);
        nufgyqmvbu(spannableStringBuilder, this.f121135eablkybsjg, 0, spannableStringBuilder.length());
        float fAgtfadlqog = this.f121136gxszxtbevo;
        while (this.f121137iobyxmoadg.iobyxmoadg() >= 8) {
            int iGxszxtbevo = this.f121137iobyxmoadg.gxszxtbevo();
            int iVdvldrhtss = this.f121137iobyxmoadg.vdvldrhtss();
            int iVdvldrhtss2 = this.f121137iobyxmoadg.vdvldrhtss();
            if (iVdvldrhtss2 == 1937013100) {
                y2.iobyxmoadg.iobyxmoadg(this.f121137iobyxmoadg.iobyxmoadg() >= 2);
                int iWypolnanlu = this.f121137iobyxmoadg.wypolnanlu();
                for (int i15 = 0; i15 < iWypolnanlu; i15++) {
                    eablkybsjg(this.f121137iobyxmoadg, spannableStringBuilder);
                }
            } else if (iVdvldrhtss2 == 1952608120 && this.f121141zoijcleaow) {
                y2.iobyxmoadg.iobyxmoadg(this.f121137iobyxmoadg.iobyxmoadg() >= 2);
                fAgtfadlqog = stevsuqkhv.agtfadlqog(this.f121137iobyxmoadg.wypolnanlu() / this.f121138lqeggnwhkg, 0.0f, 0.95f);
            }
            this.f121137iobyxmoadg.sopmlzcsov(iGxszxtbevo + iVdvldrhtss);
        }
        wflxmlrfwpVar.accept(new eablkybsjg(zdlpuopuiu.istkbnxepw(new x2.iobyxmoadg.zoijcleaow().ojitshcjhn(spannableStringBuilder).nufgyqmvbu(fAgtfadlqog, 0).dxjokdxxww(0).iobyxmoadg()), -9223372036854775807L, -9223372036854775807L));
    }

    @Override // q4.oxmwwwfdhm
    public int wkgbmnqykc() {
        return 2;
    }
}
