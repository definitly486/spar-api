package t3;

import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes.dex */
public final class stevsuqkhv {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final byte[] f109543iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f109544ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f109545wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f109546zoijcleaow;

    public stevsuqkhv(byte[] bArr) {
        this.f109543iobyxmoadg = bArr;
        this.f109546zoijcleaow = bArr.length;
    }

    private void iobyxmoadg() {
        int i13;
        int i14 = this.f109544ppxfxbqfkf;
        y2.iobyxmoadg.lqeggnwhkg(i14 >= 0 && (i14 < (i13 = this.f109546zoijcleaow) || (i14 == i13 && this.f109545wkgbmnqykc == 0)));
    }

    public void eablkybsjg(int i13) {
        int i14 = i13 / 8;
        int i15 = this.f109544ppxfxbqfkf + i14;
        this.f109544ppxfxbqfkf = i15;
        int i16 = this.f109545wkgbmnqykc + (i13 - (i14 * 8));
        this.f109545wkgbmnqykc = i16;
        if (i16 > 7) {
            this.f109544ppxfxbqfkf = i15 + 1;
            this.f109545wkgbmnqykc = i16 - 8;
        }
        iobyxmoadg();
    }

    public boolean ppxfxbqfkf() {
        boolean z13 = (((this.f109543iobyxmoadg[this.f109544ppxfxbqfkf] & 255) >> this.f109545wkgbmnqykc) & 1) == 1;
        eablkybsjg(1);
        return z13;
    }

    public int wkgbmnqykc(int i13) {
        int i14 = this.f109544ppxfxbqfkf;
        int iMin = Math.min(i13, 8 - this.f109545wkgbmnqykc);
        int i15 = i14 + 1;
        int i16 = ((this.f109543iobyxmoadg[i14] & 255) >> this.f109545wkgbmnqykc) & (KotlinVersion.MAX_COMPONENT_VALUE >> (8 - iMin));
        while (iMin < i13) {
            i16 |= (this.f109543iobyxmoadg[i15] & 255) << iMin;
            iMin += 8;
            i15++;
        }
        int i17 = i16 & ((-1) >>> (32 - i13));
        eablkybsjg(i13);
        return i17;
    }

    public int zoijcleaow() {
        return (this.f109544ppxfxbqfkf * 8) + this.f109545wkgbmnqykc;
    }
}
