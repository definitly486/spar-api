package h;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class jztzpxfvev {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final iobyxmoadg f38918zoijcleaow = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long f38919iobyxmoadg;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public static /* synthetic */ jztzpxfvev wkgbmnqykc(iobyxmoadg iobyxmoadgVar, List list, float f13, float f14, int i13, int i14, Object obj) {
            if ((i14 & 2) != 0) {
                f13 = 0.0f;
            }
            if ((i14 & 4) != 0) {
                f14 = Float.POSITIVE_INFINITY;
            }
            if ((i14 & 8) != 0) {
                i13 = i.f38905iobyxmoadg.iobyxmoadg();
            }
            return iobyxmoadgVar.ppxfxbqfkf(list, f13, f14, i13);
        }

        public static /* synthetic */ jztzpxfvev zoijcleaow(iobyxmoadg iobyxmoadgVar, List list, long j13, long j14, int i13, int i14, Object obj) {
            if ((i14 & 2) != 0) {
                j13 = g.eablkybsjg.f35584zoijcleaow.ppxfxbqfkf();
            }
            long j15 = j13;
            if ((i14 & 4) != 0) {
                j14 = g.eablkybsjg.f35584zoijcleaow.iobyxmoadg();
            }
            long j16 = j14;
            if ((i14 & 8) != 0) {
                i13 = i.f38905iobyxmoadg.iobyxmoadg();
            }
            return iobyxmoadgVar.iobyxmoadg(list, j15, j16, i13);
        }

        public final jztzpxfvev iobyxmoadg(List list, long j13, long j14, int i13) {
            return new wizcaqwiak(list, null, j13, j14, i13, null);
        }

        public final jztzpxfvev ppxfxbqfkf(List list, float f13, float f14, int i13) {
            return iobyxmoadg(list, g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f13)) & 4294967295L)), g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L)), i13);
        }

        private iobyxmoadg() {
        }
    }

    public /* synthetic */ jztzpxfvev(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    public abstract void iobyxmoadg(long j13, ipoelvxyzq ipoelvxyzqVar, float f13);

    private jztzpxfvev() {
        this.f38919iobyxmoadg = g.gtknphoqwx.f35588zoijcleaow.iobyxmoadg();
    }
}
