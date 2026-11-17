package androidx.activity;

import android.window.BackEvent;

/* JADX INFO: loaded from: classes.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final iobyxmoadg f2369eablkybsjg = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float f2370iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final float f2371ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f2372wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final float f2373zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public zoijcleaow(float f13, float f14, float f15, int i13) {
        this.f2370iobyxmoadg = f13;
        this.f2373zoijcleaow = f14;
        this.f2371ppxfxbqfkf = f15;
        this.f2372wkgbmnqykc = i13;
    }

    public final float iobyxmoadg() {
        return this.f2371ppxfxbqfkf;
    }

    public String toString() {
        return "BackEventCompat{touchX=" + this.f2370iobyxmoadg + ", touchY=" + this.f2373zoijcleaow + ", progress=" + this.f2371ppxfxbqfkf + ", swipeEdge=" + this.f2372wkgbmnqykc + '}';
    }

    public final int zoijcleaow() {
        return this.f2372wkgbmnqykc;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zoijcleaow(BackEvent backEvent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(backEvent, "backEvent");
        androidx.activity.iobyxmoadg iobyxmoadgVar = androidx.activity.iobyxmoadg.f2297iobyxmoadg;
        this(iobyxmoadgVar.wkgbmnqykc(backEvent), iobyxmoadgVar.eablkybsjg(backEvent), iobyxmoadgVar.zoijcleaow(backEvent), iobyxmoadgVar.ppxfxbqfkf(backEvent));
    }
}
