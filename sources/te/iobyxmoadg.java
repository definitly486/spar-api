package te;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class iobyxmoadg implements Cloneable {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private int f110294yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private int[] f110295zdlpuopuiu;

    public iobyxmoadg() {
        this.f110294yggfygwlhe = 0;
        this.f110295zdlpuopuiu = new int[1];
    }

    private void eablkybsjg(int i13) {
        if (i13 > (this.f110295zdlpuopuiu.length << 5)) {
            int[] iArrGtknphoqwx = gtknphoqwx(i13);
            int[] iArr = this.f110295zdlpuopuiu;
            System.arraycopy(iArr, 0, iArrGtknphoqwx, 0, iArr.length);
            this.f110295zdlpuopuiu = iArrGtknphoqwx;
        }
    }

    private static int[] gtknphoqwx(int i13) {
        return new int[(i13 + 31) / 32];
    }

    public void draadjrbmk(int i13, byte[] bArr, int i14, int i15) {
        for (int i16 = 0; i16 < i15; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < 8; i18++) {
                if (gxszxtbevo(i13)) {
                    i17 |= 1 << (7 - i18);
                }
                i13++;
            }
            bArr[i14 + i16] = (byte) i17;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return this.f110294yggfygwlhe == iobyxmoadgVar.f110294yggfygwlhe && Arrays.equals(this.f110295zdlpuopuiu, iobyxmoadgVar.f110295zdlpuopuiu);
    }

    public boolean gxszxtbevo(int i13) {
        return ((1 << (i13 & 31)) & this.f110295zdlpuopuiu[i13 / 32]) != 0;
    }

    public int hashCode() {
        return (this.f110294yggfygwlhe * 31) + Arrays.hashCode(this.f110295zdlpuopuiu);
    }

    public void iobyxmoadg(boolean z13) {
        eablkybsjg(this.f110294yggfygwlhe + 1);
        if (z13) {
            int[] iArr = this.f110295zdlpuopuiu;
            int i13 = this.f110294yggfygwlhe;
            int i14 = i13 / 32;
            iArr[i14] = (1 << (i13 & 31)) | iArr[i14];
        }
        this.f110294yggfygwlhe++;
    }

    public int lqeggnwhkg() {
        return this.f110294yggfygwlhe;
    }

    public int nufgyqmvbu() {
        return (this.f110294yggfygwlhe + 7) / 8;
    }

    public void ppxfxbqfkf(int i13, int i14) {
        if (i14 < 0 || i14 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        eablkybsjg(this.f110294yggfygwlhe + i14);
        while (i14 > 0) {
            boolean z13 = true;
            if (((i13 >> (i14 - 1)) & 1) != 1) {
                z13 = false;
            }
            iobyxmoadg(z13);
            i14--;
        }
    }

    public String toString() {
        int i13 = this.f110294yggfygwlhe;
        StringBuilder sb3 = new StringBuilder(i13 + (i13 / 8) + 1);
        for (int i14 = 0; i14 < this.f110294yggfygwlhe; i14++) {
            if ((i14 & 7) == 0) {
                sb3.append(' ');
            }
            sb3.append(gxszxtbevo(i14) ? 'X' : '.');
        }
        return sb3.toString();
    }

    public void wflxmlrfwp(iobyxmoadg iobyxmoadgVar) {
        if (this.f110294yggfygwlhe != iobyxmoadgVar.f110294yggfygwlhe) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i13 = 0;
        while (true) {
            int[] iArr = this.f110295zdlpuopuiu;
            if (i13 >= iArr.length) {
                return;
            }
            iArr[i13] = iArr[i13] ^ iobyxmoadgVar.f110295zdlpuopuiu[i13];
            i13++;
        }
    }

    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg clone() {
        return new iobyxmoadg((int[]) this.f110295zdlpuopuiu.clone(), this.f110294yggfygwlhe);
    }

    public void zoijcleaow(iobyxmoadg iobyxmoadgVar) {
        int i13 = iobyxmoadgVar.f110294yggfygwlhe;
        eablkybsjg(this.f110294yggfygwlhe + i13);
        for (int i14 = 0; i14 < i13; i14++) {
            iobyxmoadg(iobyxmoadgVar.gxszxtbevo(i14));
        }
    }

    iobyxmoadg(int[] iArr, int i13) {
        this.f110295zdlpuopuiu = iArr;
        this.f110294yggfygwlhe = i13;
    }
}
