package y2;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zdlpuopuiu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private int f123633iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private long[] f123634zoijcleaow;

    public zdlpuopuiu() {
        this(32);
    }

    public void iobyxmoadg(long j13) {
        int i13 = this.f123633iobyxmoadg;
        long[] jArr = this.f123634zoijcleaow;
        if (i13 == jArr.length) {
            this.f123634zoijcleaow = Arrays.copyOf(jArr, i13 * 2);
        }
        long[] jArr2 = this.f123634zoijcleaow;
        int i14 = this.f123633iobyxmoadg;
        this.f123633iobyxmoadg = i14 + 1;
        jArr2[i14] = j13;
    }

    public long ppxfxbqfkf(int i13) {
        if (i13 >= 0 && i13 < this.f123633iobyxmoadg) {
            return this.f123634zoijcleaow[i13];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i13 + ", size is " + this.f123633iobyxmoadg);
    }

    public int wkgbmnqykc() {
        return this.f123633iobyxmoadg;
    }

    public void zoijcleaow(long[] jArr) {
        int length = this.f123633iobyxmoadg + jArr.length;
        long[] jArr2 = this.f123634zoijcleaow;
        if (length > jArr2.length) {
            this.f123634zoijcleaow = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, this.f123634zoijcleaow, this.f123633iobyxmoadg, jArr.length);
        this.f123633iobyxmoadg = length;
    }

    public zdlpuopuiu(int i13) {
        this.f123634zoijcleaow = new long[i13];
    }
}
