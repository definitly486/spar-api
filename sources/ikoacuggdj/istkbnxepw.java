package ikoacuggdj;

import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public abstract class istkbnxepw {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final float f44820iobyxmoadg = ViewConfiguration.getScrollFriction();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final double f44821ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final double f44822zoijcleaow;

    static {
        double dLog = Math.log(0.78d) / Math.log(0.9d);
        f44822zoijcleaow = dLog;
        f44821ppxfxbqfkf = dLog - 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float zoijcleaow(w0.wkgbmnqykc wkgbmnqykcVar, float f13) {
        double density = wkgbmnqykcVar.getDensity() * 386.0878f * 160.0f * 0.84f;
        double dAbs = Math.abs(f13) * 0.35f;
        float f14 = f44820iobyxmoadg;
        return (float) (((double) f14) * density * Math.exp((f44822zoijcleaow / f44821ppxfxbqfkf) * Math.log(dAbs / (((double) f14) * density))));
    }
}
