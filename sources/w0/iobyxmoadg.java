package w0;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class iobyxmoadg {
    public static final wkgbmnqykc iobyxmoadg(Context context) {
        float f13 = context.getResources().getConfiguration().fontScale;
        float f14 = context.getResources().getDisplayMetrics().density;
        x0.iobyxmoadg iobyxmoadgVarZoijcleaow = x0.zoijcleaow.f120887iobyxmoadg.zoijcleaow(f13);
        if (iobyxmoadgVarZoijcleaow == null) {
            iobyxmoadgVarZoijcleaow = new yggfygwlhe(f13);
        }
        return new lqeggnwhkg(f14, f13, iobyxmoadgVarZoijcleaow);
    }
}
