package te;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zoijcleaow implements Cloneable {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final int[] f110328iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final int f110329jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final int f110330yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int f110331zdlpuopuiu;

    public zoijcleaow(int i13) {
        this(i13, i13);
    }

    private String iobyxmoadg(String str, String str2, String str3) {
        StringBuilder sb3 = new StringBuilder(this.f110330yggfygwlhe * (this.f110331zdlpuopuiu + 1));
        for (int i13 = 0; i13 < this.f110330yggfygwlhe; i13++) {
            for (int i14 = 0; i14 < this.f110331zdlpuopuiu; i14++) {
                sb3.append(wkgbmnqykc(i14, i13) ? str : str2);
            }
            sb3.append(str3);
        }
        return sb3.toString();
    }

    public int eablkybsjg() {
        return this.f110330yggfygwlhe;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return this.f110331zdlpuopuiu == zoijcleaowVar.f110331zdlpuopuiu && this.f110330yggfygwlhe == zoijcleaowVar.f110330yggfygwlhe && this.f110329jyumaefscl == zoijcleaowVar.f110329jyumaefscl && Arrays.equals(this.f110328iwizpuwonk, zoijcleaowVar.f110328iwizpuwonk);
    }

    public String gtknphoqwx(String str, String str2) {
        return iobyxmoadg(str, str2, "\n");
    }

    public int gxszxtbevo() {
        return this.f110331zdlpuopuiu;
    }

    public int hashCode() {
        int i13 = this.f110331zdlpuopuiu;
        return (((((((i13 * 31) + i13) * 31) + this.f110330yggfygwlhe) * 31) + this.f110329jyumaefscl) * 31) + Arrays.hashCode(this.f110328iwizpuwonk);
    }

    public void lqeggnwhkg(int i13, int i14) {
        int i15 = (i14 * this.f110329jyumaefscl) + (i13 / 32);
        int[] iArr = this.f110328iwizpuwonk;
        iArr[i15] = (1 << (i13 & 31)) | iArr[i15];
    }

    public void nufgyqmvbu(int i13, int i14, int i15, int i16) {
        if (i14 < 0 || i13 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i16 <= 0 || i15 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i17 = i15 + i13;
        int i18 = i16 + i14;
        if (i18 > this.f110330yggfygwlhe || i17 > this.f110331zdlpuopuiu) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i14 < i18) {
            int i19 = this.f110329jyumaefscl * i14;
            for (int i23 = i13; i23 < i17; i23++) {
                int[] iArr = this.f110328iwizpuwonk;
                int i24 = (i23 / 32) + i19;
                iArr[i24] = iArr[i24] | (1 << (i23 & 31));
            }
            i14++;
        }
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public zoijcleaow clone() {
        return new zoijcleaow(this.f110331zdlpuopuiu, this.f110330yggfygwlhe, this.f110329jyumaefscl, (int[]) this.f110328iwizpuwonk.clone());
    }

    public String toString() {
        return gtknphoqwx("X ", "  ");
    }

    public boolean wkgbmnqykc(int i13, int i14) {
        return ((this.f110328iwizpuwonk[(i14 * this.f110329jyumaefscl) + (i13 / 32)] >>> (i13 & 31)) & 1) != 0;
    }

    public void zoijcleaow() {
        int length = this.f110328iwizpuwonk.length;
        for (int i13 = 0; i13 < length; i13++) {
            this.f110328iwizpuwonk[i13] = 0;
        }
    }

    public zoijcleaow(int i13, int i14) {
        if (i13 <= 0 || i14 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f110331zdlpuopuiu = i13;
        this.f110330yggfygwlhe = i14;
        int i15 = (i13 + 31) / 32;
        this.f110329jyumaefscl = i15;
        this.f110328iwizpuwonk = new int[i15 * i14];
    }

    private zoijcleaow(int i13, int i14, int i15, int[] iArr) {
        this.f110331zdlpuopuiu = i13;
        this.f110330yggfygwlhe = i14;
        this.f110329jyumaefscl = i15;
        this.f110328iwizpuwonk = iArr;
    }
}
