package androidx.compose.ui.graphics;

import h.l;
import kotlin.jvm.internal.gtknphoqwx;

/* JADX INFO: loaded from: classes.dex */
public final class btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long f6295iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final iobyxmoadg f6294zoijcleaow = new iobyxmoadg(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final long f6293ppxfxbqfkf = l.iobyxmoadg(0.5f, 0.5f);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final long iobyxmoadg() {
            return btonecajqb.f6293ppxfxbqfkf;
        }

        private iobyxmoadg() {
        }
    }

    private /* synthetic */ btonecajqb(long j13) {
        this.f6295iobyxmoadg = j13;
    }

    public static String dxjokdxxww(long j13) {
        return "TransformOrigin(packedValue=" + j13 + ')';
    }

    public static final boolean eablkybsjg(long j13, long j14) {
        return j13 == j14;
    }

    public static final float gxszxtbevo(long j13) {
        return Float.intBitsToFloat((int) (j13 >> 32));
    }

    public static final float lqeggnwhkg(long j13) {
        return Float.intBitsToFloat((int) (j13 & 4294967295L));
    }

    public static int nufgyqmvbu(long j13) {
        return Long.hashCode(j13);
    }

    public static long ppxfxbqfkf(long j13) {
        return j13;
    }

    public static boolean wkgbmnqykc(long j13, Object obj) {
        return (obj instanceof btonecajqb) && j13 == ((btonecajqb) obj).btonecajqb();
    }

    public static final /* synthetic */ btonecajqb zoijcleaow(long j13) {
        return new btonecajqb(j13);
    }

    public final /* synthetic */ long btonecajqb() {
        return this.f6295iobyxmoadg;
    }

    public boolean equals(Object obj) {
        return wkgbmnqykc(this.f6295iobyxmoadg, obj);
    }

    public int hashCode() {
        return nufgyqmvbu(this.f6295iobyxmoadg);
    }

    public String toString() {
        return dxjokdxxww(this.f6295iobyxmoadg);
    }
}
