package y2;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class yggfygwlhe {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f123624eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private int f123625iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f123626ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private long[] f123627wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f123628zoijcleaow;

    public yggfygwlhe() {
        this(16);
    }

    private void ppxfxbqfkf() {
        long[] jArr = this.f123627wkgbmnqykc;
        int length = jArr.length << 1;
        if (length < 0) {
            throw new IllegalStateException();
        }
        long[] jArr2 = new long[length];
        int length2 = jArr.length;
        int i13 = this.f123625iobyxmoadg;
        int i14 = length2 - i13;
        System.arraycopy(jArr, i13, jArr2, 0, i14);
        System.arraycopy(this.f123627wkgbmnqykc, 0, jArr2, i14, i13);
        this.f123625iobyxmoadg = 0;
        this.f123628zoijcleaow = this.f123626ppxfxbqfkf - 1;
        this.f123627wkgbmnqykc = jArr2;
        this.f123624eablkybsjg = jArr2.length - 1;
    }

    public boolean eablkybsjg() {
        return this.f123626ppxfxbqfkf == 0;
    }

    public long gxszxtbevo() {
        int i13 = this.f123626ppxfxbqfkf;
        if (i13 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f123627wkgbmnqykc;
        int i14 = this.f123625iobyxmoadg;
        long j13 = jArr[i14];
        this.f123625iobyxmoadg = this.f123624eablkybsjg & (i14 + 1);
        this.f123626ppxfxbqfkf = i13 - 1;
        return j13;
    }

    public void iobyxmoadg(long j13) {
        if (this.f123626ppxfxbqfkf == this.f123627wkgbmnqykc.length) {
            ppxfxbqfkf();
        }
        int i13 = (this.f123628zoijcleaow + 1) & this.f123624eablkybsjg;
        this.f123628zoijcleaow = i13;
        this.f123627wkgbmnqykc[i13] = j13;
        this.f123626ppxfxbqfkf++;
    }

    public long wkgbmnqykc() {
        if (this.f123626ppxfxbqfkf != 0) {
            return this.f123627wkgbmnqykc[this.f123625iobyxmoadg];
        }
        throw new NoSuchElementException();
    }

    public void zoijcleaow() {
        this.f123625iobyxmoadg = 0;
        this.f123628zoijcleaow = -1;
        this.f123626ppxfxbqfkf = 0;
    }

    public yggfygwlhe(int i13) {
        iobyxmoadg.iobyxmoadg(i13 >= 0 && i13 <= 1073741824);
        i13 = i13 == 0 ? 1 : i13;
        i13 = Integer.bitCount(i13) != 1 ? Integer.highestOneBit(i13 - 1) << 1 : i13;
        this.f123625iobyxmoadg = 0;
        this.f123628zoijcleaow = -1;
        this.f123626ppxfxbqfkf = 0;
        long[] jArr = new long[i13];
        this.f123627wkgbmnqykc = jArr;
        this.f123624eablkybsjg = jArr.length - 1;
    }
}
