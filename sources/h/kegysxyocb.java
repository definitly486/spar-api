package h;

import android.graphics.DashPathEffect;
import android.graphics.PathEffect;

/* JADX INFO: loaded from: classes.dex */
public abstract class kegysxyocb {
    public static final ixidwrxhsl iobyxmoadg(float[] fArr, float f13) {
        return new stevsuqkhv(new DashPathEffect(fArr, f13));
    }

    public static final PathEffect zoijcleaow(ixidwrxhsl ixidwrxhslVar) {
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(ixidwrxhslVar, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidPathEffect");
        return ((stevsuqkhv) ixidwrxhslVar).iobyxmoadg();
    }
}
