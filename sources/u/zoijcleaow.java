package u;

import java.util.Arrays;
import kotlin.jvm.internal.zdlpuopuiu;
import t.lereixgezr;

/* JADX INFO: loaded from: classes.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private int f112414iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private long[] f112415zoijcleaow = new long[2];

    private final long[] dxjokdxxww(int i13) {
        long[] jArr = this.f112415zoijcleaow;
        long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i13, jArr.length * 2));
        zdlpuopuiu.dxjokdxxww(jArrCopyOf, "copyOf(...)");
        this.f112415zoijcleaow = jArrCopyOf;
        return jArrCopyOf;
    }

    public final void btonecajqb(int i13, long j13) {
        long[] jArrDxjokdxxww = this.f112415zoijcleaow;
        if (i13 >= jArrDxjokdxxww.length) {
            jArrDxjokdxxww = dxjokdxxww(i13 + 1);
        }
        jArrDxjokdxxww[i13] = j13;
        if (i13 >= this.f112414iobyxmoadg) {
            this.f112414iobyxmoadg = i13 + 1;
        }
    }

    public final int eablkybsjg() {
        return this.f112414iobyxmoadg;
    }

    public final boolean gxszxtbevo() {
        return this.f112414iobyxmoadg == 0;
    }

    public final boolean iobyxmoadg(long j13) {
        if (ppxfxbqfkf(j13)) {
            return false;
        }
        btonecajqb(this.f112414iobyxmoadg, j13);
        return true;
    }

    public final boolean lqeggnwhkg(long j13) {
        int i13 = this.f112414iobyxmoadg;
        int i14 = 0;
        while (i14 < i13) {
            if (j13 == this.f112415zoijcleaow[i14]) {
                int i15 = this.f112414iobyxmoadg - 1;
                while (i14 < i15) {
                    long[] jArr = this.f112415zoijcleaow;
                    int i16 = i14 + 1;
                    jArr[i14] = jArr[i16];
                    i14 = i16;
                }
                this.f112414iobyxmoadg--;
                return true;
            }
            i14++;
        }
        return false;
    }

    public final boolean nufgyqmvbu(int i13) {
        int i14 = this.f112414iobyxmoadg;
        if (i13 >= i14) {
            return false;
        }
        int i15 = i14 - 1;
        while (i13 < i15) {
            long[] jArr = this.f112415zoijcleaow;
            int i16 = i13 + 1;
            jArr[i13] = jArr[i16];
            i13 = i16;
        }
        this.f112414iobyxmoadg--;
        return true;
    }

    public final boolean ppxfxbqfkf(long j13) {
        int i13 = this.f112414iobyxmoadg;
        for (int i14 = 0; i14 < i13; i14++) {
            if (this.f112415zoijcleaow[i14] == j13) {
                return true;
            }
        }
        return false;
    }

    public final long wkgbmnqykc(int i13) {
        return lereixgezr.iobyxmoadg(this.f112415zoijcleaow[i13]);
    }

    public final void zoijcleaow() {
        this.f112414iobyxmoadg = 0;
    }
}
