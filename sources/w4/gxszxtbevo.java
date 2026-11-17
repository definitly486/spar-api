package w4;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayDeque;
import java.util.Map;
import y2.kcexrzcfyt;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
abstract class gxszxtbevo {
    private static ppxfxbqfkf eablkybsjg(ppxfxbqfkf ppxfxbqfkfVar, Map map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(ppxfxbqfkfVar);
        while (!arrayDeque.isEmpty()) {
            ppxfxbqfkf ppxfxbqfkfVar2 = (ppxfxbqfkf) arrayDeque.pop();
            lqeggnwhkg lqeggnwhkgVarGxszxtbevo = gxszxtbevo(ppxfxbqfkfVar2.f118691gxszxtbevo, ppxfxbqfkfVar2.draadjrbmk(), map);
            if (lqeggnwhkgVarGxszxtbevo != null && lqeggnwhkgVarGxszxtbevo.draadjrbmk() == 3) {
                return ppxfxbqfkfVar2;
            }
            for (int iLqeggnwhkg = ppxfxbqfkfVar2.lqeggnwhkg() - 1; iLqeggnwhkg >= 0; iLqeggnwhkg--) {
                arrayDeque.push(ppxfxbqfkfVar2.gxszxtbevo(iLqeggnwhkg));
            }
        }
        return null;
    }

    public static lqeggnwhkg gxszxtbevo(lqeggnwhkg lqeggnwhkgVar, String[] strArr, Map map) {
        int i13 = 0;
        if (lqeggnwhkgVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (lqeggnwhkg) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                lqeggnwhkg lqeggnwhkgVar2 = new lqeggnwhkg();
                int length = strArr.length;
                while (i13 < length) {
                    lqeggnwhkgVar2.iobyxmoadg((lqeggnwhkg) map.get(strArr[i13]));
                    i13++;
                }
                return lqeggnwhkgVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return lqeggnwhkgVar.iobyxmoadg((lqeggnwhkg) map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i13 < length2) {
                    lqeggnwhkgVar.iobyxmoadg((lqeggnwhkg) map.get(strArr[i13]));
                    i13++;
                }
            }
        }
        return lqeggnwhkgVar;
    }

    public static void iobyxmoadg(Spannable spannable, int i13, int i14, lqeggnwhkg lqeggnwhkgVar, ppxfxbqfkf ppxfxbqfkfVar, Map map, int i15) {
        ppxfxbqfkf ppxfxbqfkfVarEablkybsjg;
        lqeggnwhkg lqeggnwhkgVarGxszxtbevo;
        int i16;
        if (lqeggnwhkgVar.agtfadlqog() != -1) {
            spannable.setSpan(new StyleSpan(lqeggnwhkgVar.agtfadlqog()), i13, i14, 33);
        }
        if (lqeggnwhkgVar.yggfygwlhe()) {
            spannable.setSpan(new StrikethroughSpan(), i13, i14, 33);
        }
        if (lqeggnwhkgVar.jyumaefscl()) {
            spannable.setSpan(new UnderlineSpan(), i13, i14, 33);
        }
        if (lqeggnwhkgVar.kcexrzcfyt()) {
            x2.lqeggnwhkg.zoijcleaow(spannable, new ForegroundColorSpan(lqeggnwhkgVar.wkgbmnqykc()), i13, i14, 33);
        }
        if (lqeggnwhkgVar.oxmwwwfdhm()) {
            x2.lqeggnwhkg.zoijcleaow(spannable, new BackgroundColorSpan(lqeggnwhkgVar.zoijcleaow()), i13, i14, 33);
        }
        if (lqeggnwhkgVar.eablkybsjg() != null) {
            x2.lqeggnwhkg.zoijcleaow(spannable, new TypefaceSpan(lqeggnwhkgVar.eablkybsjg()), i13, i14, 33);
        }
        if (lqeggnwhkgVar.vdvldrhtss() != null) {
            zoijcleaow zoijcleaowVar = (zoijcleaow) y2.iobyxmoadg.eablkybsjg(lqeggnwhkgVar.vdvldrhtss());
            int i17 = zoijcleaowVar.f118718iobyxmoadg;
            if (i17 == -1) {
                i17 = (i15 == 2 || i15 == 1) ? 3 : 1;
                i16 = 1;
            } else {
                i16 = zoijcleaowVar.f118720zoijcleaow;
            }
            int i18 = zoijcleaowVar.f118719ppxfxbqfkf;
            if (i18 == -2) {
                i18 = 1;
            }
            x2.lqeggnwhkg.zoijcleaow(spannable, new x2.nufgyqmvbu(i17, i16, i18), i13, i14, 33);
        }
        int iDraadjrbmk = lqeggnwhkgVar.draadjrbmk();
        if (iDraadjrbmk == 2) {
            ppxfxbqfkf ppxfxbqfkfVarWkgbmnqykc = wkgbmnqykc(ppxfxbqfkfVar, map);
            if (ppxfxbqfkfVarWkgbmnqykc != null && (ppxfxbqfkfVarEablkybsjg = eablkybsjg(ppxfxbqfkfVarWkgbmnqykc, map)) != null) {
                if (ppxfxbqfkfVarEablkybsjg.lqeggnwhkg() != 1 || ppxfxbqfkfVarEablkybsjg.gxszxtbevo(0).f118698zoijcleaow == null) {
                    kcexrzcfyt.gxszxtbevo("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                } else {
                    String str = (String) stevsuqkhv.nufgyqmvbu(ppxfxbqfkfVarEablkybsjg.gxszxtbevo(0).f118698zoijcleaow);
                    lqeggnwhkg lqeggnwhkgVarGxszxtbevo2 = gxszxtbevo(ppxfxbqfkfVarEablkybsjg.f118691gxszxtbevo, ppxfxbqfkfVarEablkybsjg.draadjrbmk(), map);
                    int iGtknphoqwx = lqeggnwhkgVarGxszxtbevo2 != null ? lqeggnwhkgVarGxszxtbevo2.gtknphoqwx() : -1;
                    if (iGtknphoqwx == -1 && (lqeggnwhkgVarGxszxtbevo = gxszxtbevo(ppxfxbqfkfVarWkgbmnqykc.f118691gxszxtbevo, ppxfxbqfkfVarWkgbmnqykc.draadjrbmk(), map)) != null) {
                        iGtknphoqwx = lqeggnwhkgVarGxszxtbevo.gtknphoqwx();
                    }
                    spannable.setSpan(new x2.gxszxtbevo(str, iGtknphoqwx), i13, i14, 33);
                }
            }
        } else if (iDraadjrbmk == 3 || iDraadjrbmk == 4) {
            spannable.setSpan(new iobyxmoadg(), i13, i14, 33);
        }
        if (lqeggnwhkgVar.rgvfuqvkyq()) {
            x2.lqeggnwhkg.zoijcleaow(spannable, new x2.wkgbmnqykc(), i13, i14, 33);
        }
        int iLqeggnwhkg = lqeggnwhkgVar.lqeggnwhkg();
        if (iLqeggnwhkg == 1) {
            x2.lqeggnwhkg.zoijcleaow(spannable, new AbsoluteSizeSpan((int) lqeggnwhkgVar.gxszxtbevo(), true), i13, i14, 33);
        } else if (iLqeggnwhkg == 2) {
            x2.lqeggnwhkg.zoijcleaow(spannable, new RelativeSizeSpan(lqeggnwhkgVar.gxszxtbevo()), i13, i14, 33);
        } else {
            if (iLqeggnwhkg != 3) {
                return;
            }
            x2.lqeggnwhkg.iobyxmoadg(spannable, lqeggnwhkgVar.gxszxtbevo() / 100.0f, i13, i14, 33);
        }
    }

    static void ppxfxbqfkf(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length < 0 || spannableStringBuilder.charAt(length) == '\n') {
            return;
        }
        spannableStringBuilder.append('\n');
    }

    private static ppxfxbqfkf wkgbmnqykc(ppxfxbqfkf ppxfxbqfkfVar, Map map) {
        while (ppxfxbqfkfVar != null) {
            lqeggnwhkg lqeggnwhkgVarGxszxtbevo = gxszxtbevo(ppxfxbqfkfVar.f118691gxszxtbevo, ppxfxbqfkfVar.draadjrbmk(), map);
            if (lqeggnwhkgVarGxszxtbevo != null && lqeggnwhkgVarGxszxtbevo.draadjrbmk() == 1) {
                return ppxfxbqfkfVar;
            }
            ppxfxbqfkfVar = ppxfxbqfkfVar.f118686btonecajqb;
        }
        return null;
    }

    static String zoijcleaow(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }
}
