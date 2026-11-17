package ze;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes2.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final zoijcleaow[] f129779iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f129780ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f129781wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f129782zoijcleaow;

    iobyxmoadg(int i13, int i14) {
        zoijcleaow[] zoijcleaowVarArr = new zoijcleaow[i13];
        this.f129779iobyxmoadg = zoijcleaowVarArr;
        int length = zoijcleaowVarArr.length;
        for (int i15 = 0; i15 < length; i15++) {
            this.f129779iobyxmoadg[i15] = new zoijcleaow(((i14 + 4) * 17) + 1);
        }
        this.f129781wkgbmnqykc = i14 * 17;
        this.f129780ppxfxbqfkf = i13;
        this.f129782zoijcleaow = -1;
    }

    zoijcleaow iobyxmoadg() {
        return this.f129779iobyxmoadg[this.f129782zoijcleaow];
    }

    void ppxfxbqfkf() {
        this.f129782zoijcleaow++;
    }

    public byte[][] zoijcleaow(int i13, int i14) {
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.f129780ppxfxbqfkf * i14, this.f129781wkgbmnqykc * i13);
        int i15 = this.f129780ppxfxbqfkf * i14;
        for (int i16 = 0; i16 < i15; i16++) {
            bArr[(i15 - i16) - 1] = this.f129779iobyxmoadg[i16 / i14].zoijcleaow(i13);
        }
        return bArr;
    }
}
