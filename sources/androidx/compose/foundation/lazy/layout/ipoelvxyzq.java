package androidx.compose.foundation.lazy.layout;

import android.os.Build;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class ipoelvxyzq {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final iobyxmoadg f5022iobyxmoadg;

    public static final class iobyxmoadg implements fyldjkxazc {
        iobyxmoadg() {
        }

        @Override // androidx.compose.foundation.lazy.layout.fyldjkxazc
        public void iobyxmoadg(fiwbwshyhd fiwbwshyhdVar) {
        }
    }

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(lowerCase, "toLowerCase(...)");
        f5022iobyxmoadg = kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(lowerCase, "robolectric") ? new iobyxmoadg() : null;
    }

    public static final fyldjkxazc iobyxmoadg(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1141871251, i13, -1, "androidx.compose.foundation.lazy.layout.rememberDefaultPrefetchScheduler (PrefetchScheduler.android.kt:36)");
        }
        fyldjkxazc fyldjkxazcVar = f5022iobyxmoadg;
        if (fyldjkxazcVar != null) {
            draadjrbmkVar.sopmlzcsov(1345648624);
            draadjrbmkVar.stevsuqkhv();
        } else {
            draadjrbmkVar.sopmlzcsov(1345697697);
            View view = (View) draadjrbmkVar.ojitshcjhn(AndroidCompositionLocals_androidKt.gtknphoqwx());
            boolean zUlzqkzuiru = draadjrbmkVar.ulzqkzuiru(view);
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (zUlzqkzuiru || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                Object tag = view.getTag(ikoacuggdj.opjhrmiecq.compose_prefetch_scheduler);
                Object zoijcleaowVar = tag instanceof fyldjkxazc ? (fyldjkxazc) tag : null;
                if (zoijcleaowVar == null) {
                    zoijcleaowVar = new zoijcleaow(view);
                    view.setTag(ikoacuggdj.opjhrmiecq.compose_prefetch_scheduler, zoijcleaowVar);
                }
                objYadqdtsiqt = zoijcleaowVar;
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            fyldjkxazcVar = (fyldjkxazc) objYadqdtsiqt;
            draadjrbmkVar.stevsuqkhv();
        }
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
        }
        return fyldjkxazcVar;
    }
}
