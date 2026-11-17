package s0;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import j0.cllcsxoeiz;
import j0.jpowsppfya;
import j0.n;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final iobyxmoadg f105141iobyxmoadg = new iobyxmoadg();

    public static final class iobyxmoadg extends CharacterStyle {
        iobyxmoadg() {
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final CharSequence iobyxmoadg(String str, float f13, n nVar, List list, List list2, w0.wkgbmnqykc wkgbmnqykcVar, tg.oxmwwwfdhm oxmwwwfdhmVar, boolean z13) {
        jpowsppfya jpowsppfyaVarIobyxmoadg;
        if (z13 && i2.iobyxmoadg.wkgbmnqykc()) {
            cllcsxoeiz cllcsxoeizVarIwizpuwonk = nVar.iwizpuwonk();
            j0.ojitshcjhn ojitshcjhnVarWkgbmnqykc = (cllcsxoeizVarIwizpuwonk == null || (jpowsppfyaVarIobyxmoadg = cllcsxoeizVarIwizpuwonk.iobyxmoadg()) == null) ? null : j0.ojitshcjhn.wkgbmnqykc(jpowsppfyaVarIobyxmoadg.zoijcleaow());
            int iIobyxmoadg = j0.ojitshcjhn.f50305zoijcleaow.iobyxmoadg();
            if (ojitshcjhnVarWkgbmnqykc != null) {
                j0.ojitshcjhn.lqeggnwhkg(ojitshcjhnVarWkgbmnqykc.btonecajqb(), iIobyxmoadg);
            }
            i2.iobyxmoadg.iobyxmoadg();
            str.length();
            throw null;
        }
        if (list.isEmpty() && list2.isEmpty() && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(nVar.cdpycssgdh(), v0.kcexrzcfyt.f114990ppxfxbqfkf.iobyxmoadg()) && w0.jyumaefscl.gxszxtbevo(nVar.kcexrzcfyt()) == 0) {
            return str;
        }
        Spannable spannableString = str instanceof Spannable ? (Spannable) str : new SpannableString(str);
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(nVar.pmvmpeiblj(), v0.gtknphoqwx.f114956zoijcleaow.wkgbmnqykc())) {
            t0.wkgbmnqykc.esjtqupxsv(spannableString, f105141iobyxmoadg, 0, str.length());
        }
        if (zoijcleaow(nVar) && nVar.zdlpuopuiu() == null) {
            t0.wkgbmnqykc.jyumaefscl(spannableString, nVar.kcexrzcfyt(), f13, wkgbmnqykcVar);
        } else {
            v0.nufgyqmvbu nufgyqmvbuVarZdlpuopuiu = nVar.zdlpuopuiu();
            if (nufgyqmvbuVarZdlpuopuiu == null) {
                nufgyqmvbuVarZdlpuopuiu = v0.nufgyqmvbu.f114995wkgbmnqykc.iobyxmoadg();
            }
            t0.wkgbmnqykc.yggfygwlhe(spannableString, nVar.kcexrzcfyt(), f13, wkgbmnqykcVar, nufgyqmvbuVarZdlpuopuiu);
        }
        t0.wkgbmnqykc.istkbnxepw(spannableString, nVar.cdpycssgdh(), f13, wkgbmnqykcVar);
        t0.wkgbmnqykc.pmvmpeiblj(spannableString, nVar, list, wkgbmnqykcVar, oxmwwwfdhmVar);
        t0.wkgbmnqykc.wflxmlrfwp(spannableString, list, f13, wkgbmnqykcVar, nVar.cdpycssgdh());
        t0.zoijcleaow.zoijcleaow(spannableString, list2, wkgbmnqykcVar);
        return spannableString;
    }

    public static final boolean zoijcleaow(n nVar) {
        jpowsppfya jpowsppfyaVarIobyxmoadg;
        cllcsxoeiz cllcsxoeizVarIwizpuwonk = nVar.iwizpuwonk();
        if (cllcsxoeizVarIwizpuwonk == null || (jpowsppfyaVarIobyxmoadg = cllcsxoeizVarIwizpuwonk.iobyxmoadg()) == null) {
            return false;
        }
        return jpowsppfyaVarIobyxmoadg.ppxfxbqfkf();
    }
}
