package n0;

import android.content.Context;
import android.os.Build;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class cllcsxoeiz {
    public static final String eablkybsjg(cdpycssgdh cdpycssgdhVar, final w0.wkgbmnqykc wkgbmnqykcVar, int i13) {
        if (i13 == 0) {
            return y0.ppxfxbqfkf.eablkybsjg(cdpycssgdhVar.iobyxmoadg(), null, null, null, 0, null, new tg.draadjrbmk() { // from class: n0.hkdspvbjdz
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    w0.wkgbmnqykc wkgbmnqykcVar2 = wkgbmnqykcVar;
                    androidx.appcompat.app.yggfygwlhe.iobyxmoadg(obj);
                    return cllcsxoeiz.gxszxtbevo(wkgbmnqykcVar2, null);
                }
            }, 31, null);
        }
        List listIobyxmoadg = cdpycssgdhVar.iobyxmoadg();
        if (listIobyxmoadg.size() > 0) {
            androidx.appcompat.app.yggfygwlhe.iobyxmoadg(listIobyxmoadg.get(0));
            throw null;
        }
        float fZoijcleaow = zoijcleaow(i13 + 400.0f);
        String str = "";
        if (!cdpycssgdhVar.iobyxmoadg().isEmpty()) {
            str = ",";
        }
        return str + "'wght' " + fZoijcleaow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence gxszxtbevo(w0.wkgbmnqykc wkgbmnqykcVar, istkbnxepw istkbnxepwVar) {
        return '\'' + istkbnxepwVar.zoijcleaow() + "' " + istkbnxepwVar.iobyxmoadg(wkgbmnqykcVar);
    }

    public static final int ppxfxbqfkf(Context context) {
        if (context == null || Build.VERSION.SDK_INT < 31 || context.getResources().getConfiguration().fontWeightAdjustment == Integer.MAX_VALUE) {
            return 0;
        }
        return context.getResources().getConfiguration().fontWeightAdjustment;
    }

    public static final String wkgbmnqykc(cdpycssgdh cdpycssgdhVar, Context context) {
        return eablkybsjg(cdpycssgdhVar, w0.iobyxmoadg.iobyxmoadg(context), ppxfxbqfkf(context));
    }

    private static final float zoijcleaow(float f13) {
        return zg.gtknphoqwx.wflxmlrfwp(f13, 1.0f, 1000.0f);
    }
}
