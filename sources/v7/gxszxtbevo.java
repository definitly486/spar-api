package v7;

import q1.gtknphoqwx;

/* JADX INFO: loaded from: classes2.dex */
public class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String[] f116255iobyxmoadg = new String[5];

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final long[] f116258zoijcleaow = new long[5];

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f116256ppxfxbqfkf = 0;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f116257wkgbmnqykc = 0;

    public void iobyxmoadg(String str) {
        int i13 = this.f116256ppxfxbqfkf;
        if (i13 == 5) {
            this.f116257wkgbmnqykc++;
            return;
        }
        this.f116255iobyxmoadg[i13] = str;
        this.f116258zoijcleaow[i13] = System.nanoTime();
        gtknphoqwx.iobyxmoadg(str);
        this.f116256ppxfxbqfkf++;
    }

    public float zoijcleaow(String str) {
        int i13 = this.f116257wkgbmnqykc;
        if (i13 > 0) {
            this.f116257wkgbmnqykc = i13 - 1;
            return 0.0f;
        }
        int i14 = this.f116256ppxfxbqfkf - 1;
        this.f116256ppxfxbqfkf = i14;
        if (i14 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (str.equals(this.f116255iobyxmoadg[i14])) {
            gtknphoqwx.zoijcleaow();
            return (System.nanoTime() - this.f116258zoijcleaow[this.f116256ppxfxbqfkf]) / 1000000.0f;
        }
        throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + this.f116255iobyxmoadg[this.f116256ppxfxbqfkf] + ".");
    }
}
