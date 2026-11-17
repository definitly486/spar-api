package l4;

import t3.vdvldrhtss;

/* JADX INFO: loaded from: classes.dex */
final class lqeggnwhkg {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final long[] f61564wkgbmnqykc = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final byte[] f61565iobyxmoadg = new byte[8];

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f61566ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f61567zoijcleaow;

    public static long iobyxmoadg(byte[] bArr, int i13, boolean z13) {
        long j13 = ((long) bArr[0]) & 255;
        if (z13) {
            j13 &= ~f61564wkgbmnqykc[i13 - 1];
        }
        for (int i14 = 1; i14 < i13; i14++) {
            j13 = (j13 << 8) | (((long) bArr[i14]) & 255);
        }
        return j13;
    }

    public static int ppxfxbqfkf(int i13) {
        int i14 = 0;
        while (true) {
            long[] jArr = f61564wkgbmnqykc;
            if (i14 >= jArr.length) {
                return -1;
            }
            if ((jArr[i14] & ((long) i13)) != 0) {
                return i14 + 1;
            }
            i14++;
        }
    }

    public void eablkybsjg() {
        this.f61567zoijcleaow = 0;
        this.f61566ppxfxbqfkf = 0;
    }

    public long wkgbmnqykc(vdvldrhtss vdvldrhtssVar, boolean z13, boolean z14, int i13) {
        if (this.f61567zoijcleaow == 0) {
            if (!vdvldrhtssVar.lqeggnwhkg(this.f61565iobyxmoadg, 0, 1, z13)) {
                return -1L;
            }
            int iPpxfxbqfkf = ppxfxbqfkf(this.f61565iobyxmoadg[0] & 255);
            this.f61566ppxfxbqfkf = iPpxfxbqfkf;
            if (iPpxfxbqfkf == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f61567zoijcleaow = 1;
        }
        int i14 = this.f61566ppxfxbqfkf;
        if (i14 > i13) {
            this.f61567zoijcleaow = 0;
            return -2L;
        }
        if (i14 != 1) {
            vdvldrhtssVar.readFully(this.f61565iobyxmoadg, 1, i14 - 1);
        }
        this.f61567zoijcleaow = 0;
        return iobyxmoadg(this.f61565iobyxmoadg, this.f61566ppxfxbqfkf, z14);
    }

    public int zoijcleaow() {
        return this.f61566ppxfxbqfkf;
    }
}
