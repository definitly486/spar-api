package rlfsiqarku;

import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import androidx.compose.ui.platform.opjhrmiecq;
import hg.agtfadlqog;
import j0.jrbgnlbqoe;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public abstract class zoijcleaow {
    public static final opjhrmiecq eablkybsjg(j0.eablkybsjg eablkybsjgVar) {
        return iobyxmoadg.ppxfxbqfkf(eablkybsjgVar);
    }

    public static final j0.eablkybsjg iobyxmoadg(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof Spanned)) {
            return new j0.eablkybsjg(charSequence.toString(), null, 2, null);
        }
        Spanned spanned = (Spanned) charSequence;
        int i13 = 0;
        Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, spanned.length(), Annotation.class);
        ArrayList arrayList = new ArrayList();
        int iOpjhrmiecq = agtfadlqog.opjhrmiecq(annotationArr);
        if (iOpjhrmiecq >= 0) {
            while (true) {
                Annotation annotation = annotationArr[i13];
                if (zdlpuopuiu.eablkybsjg(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                    arrayList.add(new j0.eablkybsjg.wkgbmnqykc(new ppxfxbqfkf(annotation.getValue()).gtknphoqwx(), spanned.getSpanStart(annotation), spanned.getSpanEnd(annotation)));
                }
                if (i13 == iOpjhrmiecq) {
                    break;
                }
                i13++;
            }
        }
        return new j0.eablkybsjg(charSequence.toString(), arrayList, null, 4, null);
    }

    public static final boolean ppxfxbqfkf(opjhrmiecq opjhrmiecqVar) {
        return iobyxmoadg.iobyxmoadg(opjhrmiecqVar);
    }

    public static final Object wkgbmnqykc(opjhrmiecq opjhrmiecqVar, lg.gxszxtbevo gxszxtbevoVar) {
        return iobyxmoadg.zoijcleaow(opjhrmiecqVar);
    }

    public static final CharSequence zoijcleaow(j0.eablkybsjg eablkybsjgVar) {
        if (eablkybsjgVar.lqeggnwhkg().isEmpty()) {
            return eablkybsjgVar.btonecajqb();
        }
        SpannableString spannableString = new SpannableString(eablkybsjgVar.btonecajqb());
        wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc();
        List listLqeggnwhkg = eablkybsjgVar.lqeggnwhkg();
        int size = listLqeggnwhkg.size();
        for (int i13 = 0; i13 < size; i13++) {
            j0.eablkybsjg.wkgbmnqykc wkgbmnqykcVar2 = (j0.eablkybsjg.wkgbmnqykc) listLqeggnwhkg.get(i13);
            jrbgnlbqoe jrbgnlbqoeVar = (jrbgnlbqoe) wkgbmnqykcVar2.iobyxmoadg();
            int iZoijcleaow = wkgbmnqykcVar2.zoijcleaow();
            int iPpxfxbqfkf = wkgbmnqykcVar2.ppxfxbqfkf();
            wkgbmnqykcVar.vdvldrhtss();
            wkgbmnqykcVar.eablkybsjg(jrbgnlbqoeVar);
            spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", wkgbmnqykcVar.rgvfuqvkyq()), iZoijcleaow, iPpxfxbqfkf, 33);
        }
        return spannableString;
    }
}
