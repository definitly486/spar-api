package bz;

import android.content.Context;
import android.util.DisplayMetrics;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class k0 extends metgxyhuhe {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Context f17500eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final Set f17501gxszxtbevo;

    k0(Set set, Context context) {
        super(kc2.lqeggnwhkg.DisplayMetrics);
        this.f17501gxszxtbevo = set;
        this.f17500eablkybsjg = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public oc2.iobyxmoadg lereixgezr() {
        oc2.iobyxmoadg iobyxmoadgVar = new oc2.iobyxmoadg();
        DisplayMetrics displayMetrics = this.f17500eablkybsjg.getResources().getDisplayMetrics();
        if (this.f17501gxszxtbevo.contains(kc2.lqeggnwhkg.Density)) {
            iobyxmoadgVar.put("Density", Float.valueOf(displayMetrics.density));
        }
        if (this.f17501gxszxtbevo.contains(kc2.lqeggnwhkg.DensityDpi)) {
            iobyxmoadgVar.put("DensityDpi", Integer.valueOf(displayMetrics.densityDpi));
        }
        if (this.f17501gxszxtbevo.contains(kc2.lqeggnwhkg.ScaledDensity)) {
            iobyxmoadgVar.put("ScaledDensity", Float.valueOf(displayMetrics.scaledDensity));
        }
        return iobyxmoadgVar;
    }
}
