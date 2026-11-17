package a5;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class iwizpuwonk {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public int f550eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f551iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private boolean f552ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public byte[] f553wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private boolean f554zoijcleaow;

    public iwizpuwonk(int i13, int i14) {
        this.f551iobyxmoadg = i13;
        byte[] bArr = new byte[i14 + 3];
        this.f553wkgbmnqykc = bArr;
        bArr[2] = 1;
    }

    public void eablkybsjg(int i13) {
        y2.iobyxmoadg.lqeggnwhkg(!this.f554zoijcleaow);
        boolean z13 = i13 == this.f551iobyxmoadg;
        this.f554zoijcleaow = z13;
        if (z13) {
            this.f550eablkybsjg = 3;
            this.f552ppxfxbqfkf = false;
        }
    }

    public void iobyxmoadg(byte[] bArr, int i13, int i14) {
        if (this.f554zoijcleaow) {
            int i15 = i14 - i13;
            byte[] bArr2 = this.f553wkgbmnqykc;
            int length = bArr2.length;
            int i16 = this.f550eablkybsjg;
            if (length < i16 + i15) {
                this.f553wkgbmnqykc = Arrays.copyOf(bArr2, (i16 + i15) * 2);
            }
            System.arraycopy(bArr, i13, this.f553wkgbmnqykc, this.f550eablkybsjg, i15);
            this.f550eablkybsjg += i15;
        }
    }

    public boolean ppxfxbqfkf() {
        return this.f552ppxfxbqfkf;
    }

    public void wkgbmnqykc() {
        this.f554zoijcleaow = false;
        this.f552ppxfxbqfkf = false;
    }

    public boolean zoijcleaow(int i13) {
        if (!this.f554zoijcleaow) {
            return false;
        }
        this.f550eablkybsjg -= i13;
        this.f554zoijcleaow = false;
        this.f552ppxfxbqfkf = true;
        return true;
    }
}
