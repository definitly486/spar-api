package md;

import com.google.firebase.perf.metrics.Trace;

/* JADX INFO: loaded from: classes2.dex */
public abstract class btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final gd.iobyxmoadg f66801iobyxmoadg = gd.iobyxmoadg.eablkybsjg();

    public static Trace iobyxmoadg(Trace trace, hd.gxszxtbevo.iobyxmoadg iobyxmoadgVar) {
        if (iobyxmoadgVar.wkgbmnqykc() > 0) {
            trace.putMetric(zoijcleaow.FRAMES_TOTAL.toString(), iobyxmoadgVar.wkgbmnqykc());
        }
        if (iobyxmoadgVar.ppxfxbqfkf() > 0) {
            trace.putMetric(zoijcleaow.FRAMES_SLOW.toString(), iobyxmoadgVar.ppxfxbqfkf());
        }
        if (iobyxmoadgVar.zoijcleaow() > 0) {
            trace.putMetric(zoijcleaow.FRAMES_FROZEN.toString(), iobyxmoadgVar.zoijcleaow());
        }
        f66801iobyxmoadg.iobyxmoadg("Screen trace: " + trace.getName() + " _fr_tot:" + iobyxmoadgVar.wkgbmnqykc() + " _fr_slo:" + iobyxmoadgVar.ppxfxbqfkf() + " _fr_fzn:" + iobyxmoadgVar.zoijcleaow());
        return trace;
    }
}
