package h0;

import androidx.appcompat.app.yggfygwlhe;
import androidx.collection.iozdgvuglv;
import androidx.collection.rgvfuqvkyq;
import w0.agtfadlqog;

/* JADX INFO: loaded from: classes.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private long f39003eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private float[] f39004gxszxtbevo;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private long f39006ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private long f39007wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iozdgvuglv f39005iobyxmoadg = rgvfuqvkyq.ppxfxbqfkf();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private long f39008zoijcleaow = -1;

    public wkgbmnqykc() {
        agtfadlqog.iobyxmoadg iobyxmoadgVar = agtfadlqog.f118237zoijcleaow;
        this.f39006ppxfxbqfkf = iobyxmoadgVar.zoijcleaow();
        this.f39007wkgbmnqykc = iobyxmoadgVar.zoijcleaow();
    }

    public final iozdgvuglv eablkybsjg() {
        return this.f39005iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0047 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0049 A[LOOP:0: B:8:0x0014->B:18:0x0049, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x004c A[EDGE_INSN: B:25:0x004c->B:19:0x004c BREAK  A[LOOP:0: B:8:0x0014->B:18:0x0049], SYNTHETIC] */
    public final void gxszxtbevo(long j13) {
        if (this.f39008zoijcleaow > j13) {
            return;
        }
        iozdgvuglv iozdgvuglvVar = this.f39005iobyxmoadg;
        Object[] objArr = iozdgvuglvVar.f4351ppxfxbqfkf;
        long[] jArr = iozdgvuglvVar.f4350iobyxmoadg;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j14 = jArr[i13];
                if ((((~j14) << 7) & j14 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i13 != length) {
                        break;
                        break;
                    }
                    i13++;
                } else {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((255 & j14) < 128) {
                            yggfygwlhe.iobyxmoadg(objArr[(i13 << 3) + i15]);
                        }
                        j14 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    } else if (i13 != length) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
        }
        this.f39008zoijcleaow = Long.MAX_VALUE == Long.MAX_VALUE ? -1L : Long.MAX_VALUE;
    }

    public final void iobyxmoadg(long j13) {
    }

    public final boolean lqeggnwhkg(long j13, long j14, float[] fArr, int i13, int i14) {
        boolean z13;
        if (agtfadlqog.nufgyqmvbu(j14, this.f39006ppxfxbqfkf)) {
            z13 = false;
        } else {
            this.f39006ppxfxbqfkf = j14;
            z13 = true;
        }
        if (!agtfadlqog.nufgyqmvbu(j13, this.f39007wkgbmnqykc)) {
            this.f39007wkgbmnqykc = j13;
            z13 = true;
        }
        if (fArr != null) {
            this.f39004gxszxtbevo = fArr;
            z13 = true;
        }
        long j15 = (((long) i13) << 32) | (((long) i14) & 4294967295L);
        if (j15 == this.f39003eablkybsjg) {
            return z13;
        }
        this.f39003eablkybsjg = j15;
        return true;
    }

    public final void ppxfxbqfkf(int i13, long j13, long j14, long j15) {
        yggfygwlhe.iobyxmoadg(this.f39005iobyxmoadg.zoijcleaow(i13));
    }

    public final long wkgbmnqykc() {
        return this.f39008zoijcleaow;
    }

    public final void zoijcleaow(long j13) {
        iozdgvuglv iozdgvuglvVar = this.f39005iobyxmoadg;
        Object[] objArr = iozdgvuglvVar.f4351ppxfxbqfkf;
        long[] jArr = iozdgvuglvVar.f4350iobyxmoadg;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i13 = 0;
        while (true) {
            long j14 = jArr[i13];
            if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8 - ((~(i13 - length)) >>> 31);
                for (int i15 = 0; i15 < i14; i15++) {
                    if ((255 & j14) < 128) {
                        yggfygwlhe.iobyxmoadg(objArr[(i13 << 3) + i15]);
                    }
                    j14 >>= 8;
                }
                if (i14 != 8) {
                    return;
                }
            }
            if (i13 == length) {
                return;
            } else {
                i13++;
            }
        }
    }
}
