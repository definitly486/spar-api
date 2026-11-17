package h50;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.compose.runtime.jyumaefscl;

/* JADX INFO: loaded from: classes4.dex */
public abstract class iobyxmoadg {
    public static final g.lqeggnwhkg iobyxmoadg(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
        draadjrbmkVar.sopmlzcsov(1409589143);
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.ntlheqmsrt(1409589143, i13, -1, "ru.myspar.core.ui.compose.components.shimmer.rememberWindowBounds (ScreenInfo.kt:8)");
        }
        draadjrbmkVar.sopmlzcsov(594766491);
        Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
        if (objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            g.lqeggnwhkg lqeggnwhkgVar = new g.lqeggnwhkg(0.0f, 0.0f, displayMetrics.widthPixels, displayMetrics.heightPixels);
            draadjrbmkVar.jyumaefscl(lqeggnwhkgVar);
            objYadqdtsiqt = lqeggnwhkgVar;
        }
        g.lqeggnwhkg lqeggnwhkgVar2 = (g.lqeggnwhkg) objYadqdtsiqt;
        draadjrbmkVar.stevsuqkhv();
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.mbcevpiqjq();
        }
        draadjrbmkVar.stevsuqkhv();
        return lqeggnwhkgVar2;
    }
}
