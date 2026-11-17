package md;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private long f66803iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private TimeUnit f66804ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private long f66805zoijcleaow;

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f66806iobyxmoadg;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f66806iobyxmoadg = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f66806iobyxmoadg[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f66806iobyxmoadg[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public dxjokdxxww(long j13, long j14, TimeUnit timeUnit) {
        this.f66803iobyxmoadg = j13;
        this.f66805zoijcleaow = j14;
        this.f66804ppxfxbqfkf = timeUnit;
    }

    public double iobyxmoadg() {
        int i13 = iobyxmoadg.f66806iobyxmoadg[this.f66804ppxfxbqfkf.ordinal()];
        if (i13 == 1) {
            return (this.f66803iobyxmoadg / this.f66805zoijcleaow) * TimeUnit.SECONDS.toNanos(1L);
        }
        if (i13 != 2) {
            return i13 != 3 ? this.f66803iobyxmoadg / this.f66804ppxfxbqfkf.toSeconds(this.f66805zoijcleaow) : (this.f66803iobyxmoadg / this.f66805zoijcleaow) * TimeUnit.SECONDS.toMillis(1L);
        }
        return (this.f66803iobyxmoadg / this.f66805zoijcleaow) * TimeUnit.SECONDS.toMicros(1L);
    }
}
