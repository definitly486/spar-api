package androidx.activity;

import android.window.BackEvent;

/* JADX INFO: loaded from: classes.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f2297iobyxmoadg = new iobyxmoadg();

    private iobyxmoadg() {
    }

    public final float eablkybsjg(BackEvent backEvent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(backEvent, "backEvent");
        return backEvent.getTouchY();
    }

    public final BackEvent iobyxmoadg(float f13, float f14, float f15, int i13) {
        return new BackEvent(f13, f14, f15, i13);
    }

    public final int ppxfxbqfkf(BackEvent backEvent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float wkgbmnqykc(BackEvent backEvent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float zoijcleaow(BackEvent backEvent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(backEvent, "backEvent");
        return backEvent.getProgress();
    }
}
