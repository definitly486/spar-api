package com.google.firebase.perf.application;

import android.app.Activity;
import android.os.Build;
import android.util.SparseIntArray;
import androidx.core.app.nufgyqmvbu;
import androidx.fragment.app.Fragment;
import hd.gxszxtbevo;
import java.util.HashMap;
import java.util.Map;
import md.lqeggnwhkg;

/* JADX INFO: loaded from: classes2.dex */
public class wkgbmnqykc {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final gd.iobyxmoadg f24551eablkybsjg = gd.iobyxmoadg.eablkybsjg();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Activity f24552iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Map f24553ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f24554wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final nufgyqmvbu f24555zoijcleaow;

    public wkgbmnqykc(Activity activity) {
        this(activity, new nufgyqmvbu(), new HashMap());
    }

    static boolean iobyxmoadg() {
        return true;
    }

    private lqeggnwhkg zoijcleaow() {
        if (!this.f24554wkgbmnqykc) {
            f24551eablkybsjg.iobyxmoadg("No recording has been started.");
            return lqeggnwhkg.iobyxmoadg();
        }
        SparseIntArray[] sparseIntArrayArrZoijcleaow = this.f24555zoijcleaow.zoijcleaow();
        if (sparseIntArrayArrZoijcleaow == null) {
            f24551eablkybsjg.iobyxmoadg("FrameMetricsAggregator.mMetrics is uninitialized.");
            return lqeggnwhkg.iobyxmoadg();
        }
        if (sparseIntArrayArrZoijcleaow[0] != null) {
            return lqeggnwhkg.eablkybsjg(gxszxtbevo.iobyxmoadg(sparseIntArrayArrZoijcleaow));
        }
        f24551eablkybsjg.iobyxmoadg("FrameMetricsAggregator.mMetrics[TOTAL_INDEX] is uninitialized.");
        return lqeggnwhkg.iobyxmoadg();
    }

    public lqeggnwhkg eablkybsjg() {
        if (!this.f24554wkgbmnqykc) {
            f24551eablkybsjg.iobyxmoadg("Cannot stop because no recording was started");
            return lqeggnwhkg.iobyxmoadg();
        }
        if (!this.f24553ppxfxbqfkf.isEmpty()) {
            f24551eablkybsjg.iobyxmoadg("Sub-recordings are still ongoing! Sub-recordings should be stopped first before stopping Activity screen trace.");
            this.f24553ppxfxbqfkf.clear();
        }
        lqeggnwhkg lqeggnwhkgVarZoijcleaow = zoijcleaow();
        try {
            this.f24555zoijcleaow.ppxfxbqfkf(this.f24552iobyxmoadg);
        } catch (IllegalArgumentException | NullPointerException e13) {
            if ((e13 instanceof NullPointerException) && Build.VERSION.SDK_INT > 28) {
                throw e13;
            }
            f24551eablkybsjg.gtknphoqwx("View not hardware accelerated. Unable to collect FrameMetrics. %s", e13.toString());
            lqeggnwhkgVarZoijcleaow = lqeggnwhkg.iobyxmoadg();
        }
        this.f24555zoijcleaow.wkgbmnqykc();
        this.f24554wkgbmnqykc = false;
        return lqeggnwhkgVarZoijcleaow;
    }

    public lqeggnwhkg gxszxtbevo(Fragment fragment) {
        if (!this.f24554wkgbmnqykc) {
            f24551eablkybsjg.iobyxmoadg("Cannot stop sub-recording because FrameMetricsAggregator is not recording");
            return lqeggnwhkg.iobyxmoadg();
        }
        if (!this.f24553ppxfxbqfkf.containsKey(fragment)) {
            f24551eablkybsjg.zoijcleaow("Sub-recording associated with key %s was not started or does not exist", fragment.getClass().getSimpleName());
            return lqeggnwhkg.iobyxmoadg();
        }
        gxszxtbevo.iobyxmoadg iobyxmoadgVar = (gxszxtbevo.iobyxmoadg) this.f24553ppxfxbqfkf.remove(fragment);
        lqeggnwhkg lqeggnwhkgVarZoijcleaow = zoijcleaow();
        if (lqeggnwhkgVarZoijcleaow.wkgbmnqykc()) {
            return lqeggnwhkg.eablkybsjg(((gxszxtbevo.iobyxmoadg) lqeggnwhkgVarZoijcleaow.ppxfxbqfkf()).iobyxmoadg(iobyxmoadgVar));
        }
        f24551eablkybsjg.zoijcleaow("stopFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
        return lqeggnwhkg.iobyxmoadg();
    }

    public void ppxfxbqfkf() {
        if (this.f24554wkgbmnqykc) {
            f24551eablkybsjg.zoijcleaow("FrameMetricsAggregator is already recording %s", this.f24552iobyxmoadg.getClass().getSimpleName());
        } else {
            this.f24555zoijcleaow.iobyxmoadg(this.f24552iobyxmoadg);
            this.f24554wkgbmnqykc = true;
        }
    }

    public void wkgbmnqykc(Fragment fragment) {
        if (!this.f24554wkgbmnqykc) {
            f24551eablkybsjg.iobyxmoadg("Cannot start sub-recording because FrameMetricsAggregator is not recording");
            return;
        }
        if (this.f24553ppxfxbqfkf.containsKey(fragment)) {
            f24551eablkybsjg.zoijcleaow("Cannot start sub-recording because one is already ongoing with the key %s", fragment.getClass().getSimpleName());
            return;
        }
        lqeggnwhkg lqeggnwhkgVarZoijcleaow = zoijcleaow();
        if (lqeggnwhkgVarZoijcleaow.wkgbmnqykc()) {
            this.f24553ppxfxbqfkf.put(fragment, (gxszxtbevo.iobyxmoadg) lqeggnwhkgVarZoijcleaow.ppxfxbqfkf());
        } else {
            f24551eablkybsjg.zoijcleaow("startFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
        }
    }

    wkgbmnqykc(Activity activity, nufgyqmvbu nufgyqmvbuVar, Map map) {
        this.f24554wkgbmnqykc = false;
        this.f24552iobyxmoadg = activity;
        this.f24555zoijcleaow = nufgyqmvbuVar;
        this.f24553ppxfxbqfkf = map;
    }
}
