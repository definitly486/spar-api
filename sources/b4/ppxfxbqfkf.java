package b4;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final long f15102iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final List f15103zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final String f15104iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final long f15105ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public final long f15106wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final String f15107zoijcleaow;

        public iobyxmoadg(String str, String str2, long j13, long j14) {
            this.f15104iobyxmoadg = str;
            this.f15107zoijcleaow = str2;
            this.f15105ppxfxbqfkf = j13;
            this.f15106wkgbmnqykc = j14;
        }
    }

    public ppxfxbqfkf(long j13, List list) {
        this.f15102iobyxmoadg = j13;
        this.f15103zoijcleaow = list;
    }

    public i4.iobyxmoadg iobyxmoadg(long j13) {
        long j14;
        if (this.f15103zoijcleaow.size() < 2) {
            return null;
        }
        long j15 = j13;
        long j16 = -1;
        long j17 = -1;
        long j18 = -1;
        long j19 = -1;
        boolean z13 = false;
        for (int size = this.f15103zoijcleaow.size() - 1; size >= 0; size--) {
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) this.f15103zoijcleaow.get(size);
            boolean zEquals = "video/mp4".equals(iobyxmoadgVar.f15104iobyxmoadg) | z13;
            if (size == 0) {
                j15 -= iobyxmoadgVar.f15106wkgbmnqykc;
                j14 = 0;
            } else {
                j14 = j15 - iobyxmoadgVar.f15105ppxfxbqfkf;
            }
            long j23 = j15;
            j15 = j14;
            if (!zEquals || j15 == j23) {
                z13 = zEquals;
            } else {
                j19 = j23 - j15;
                j18 = j15;
                z13 = false;
            }
            if (size == 0) {
                j16 = j15;
                j17 = j23;
            }
        }
        if (j18 == -1 || j19 == -1 || j16 == -1 || j17 == -1) {
            return null;
        }
        return new i4.iobyxmoadg(j16, j17, this.f15102iobyxmoadg, j18, j19);
    }
}
