package t0;

import android.text.Spannable;
import androidx.appcompat.app.yggfygwlhe;
import j0.hcddaimhww;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class zoijcleaow {
    private static final void iobyxmoadg(Spannable spannable, hcddaimhww hcddaimhwwVar, int i13, int i14, w0.wkgbmnqykc wkgbmnqykcVar) {
        Object[] spans = spannable.getSpans(i13, i14, i2.ppxfxbqfkf.class);
        for (Object obj : spans) {
            yggfygwlhe.iobyxmoadg(obj);
            spannable.removeSpan(null);
        }
        throw null;
    }

    public static final void zoijcleaow(Spannable spannable, List list, w0.wkgbmnqykc wkgbmnqykcVar) {
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            j0.eablkybsjg.wkgbmnqykc wkgbmnqykcVar2 = (j0.eablkybsjg.wkgbmnqykc) list.get(i13);
            yggfygwlhe.iobyxmoadg(wkgbmnqykcVar2.iobyxmoadg());
            iobyxmoadg(spannable, null, wkgbmnqykcVar2.zoijcleaow(), wkgbmnqykcVar2.ppxfxbqfkf(), wkgbmnqykcVar);
        }
    }
}
