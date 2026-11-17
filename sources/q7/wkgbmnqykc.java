package q7;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float[] f78155iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int[] f78156zoijcleaow;

    public wkgbmnqykc(float[] fArr, int[] iArr) {
        this.f78155iobyxmoadg = fArr;
        this.f78156zoijcleaow = iArr;
    }

    private void iobyxmoadg(wkgbmnqykc wkgbmnqykcVar) {
        int i13 = 0;
        while (true) {
            int[] iArr = wkgbmnqykcVar.f78156zoijcleaow;
            if (i13 >= iArr.length) {
                return;
            }
            this.f78155iobyxmoadg[i13] = wkgbmnqykcVar.f78155iobyxmoadg[i13];
            this.f78156zoijcleaow[i13] = iArr[i13];
            i13++;
        }
    }

    private int ppxfxbqfkf(float f13) {
        int iBinarySearch = Arrays.binarySearch(this.f78155iobyxmoadg, f13);
        if (iBinarySearch >= 0) {
            return this.f78156zoijcleaow[iBinarySearch];
        }
        int i13 = -(iBinarySearch + 1);
        if (i13 == 0) {
            return this.f78156zoijcleaow[0];
        }
        int[] iArr = this.f78156zoijcleaow;
        if (i13 == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.f78155iobyxmoadg;
        int i14 = i13 - 1;
        float f14 = fArr[i14];
        return v7.zoijcleaow.ppxfxbqfkf((f13 - f14) / (fArr[i13] - f14), iArr[i14], iArr[i13]);
    }

    public float[] eablkybsjg() {
        return this.f78155iobyxmoadg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return Arrays.equals(this.f78155iobyxmoadg, wkgbmnqykcVar.f78155iobyxmoadg) && Arrays.equals(this.f78156zoijcleaow, wkgbmnqykcVar.f78156zoijcleaow);
    }

    public int gxszxtbevo() {
        return this.f78156zoijcleaow.length;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f78155iobyxmoadg) * 31) + Arrays.hashCode(this.f78156zoijcleaow);
    }

    public void lqeggnwhkg(wkgbmnqykc wkgbmnqykcVar, wkgbmnqykc wkgbmnqykcVar2, float f13) {
        int[] iArr;
        if (wkgbmnqykcVar.equals(wkgbmnqykcVar2)) {
            iobyxmoadg(wkgbmnqykcVar);
            return;
        }
        if (f13 <= 0.0f) {
            iobyxmoadg(wkgbmnqykcVar);
            return;
        }
        if (f13 >= 1.0f) {
            iobyxmoadg(wkgbmnqykcVar2);
            return;
        }
        if (wkgbmnqykcVar.f78156zoijcleaow.length != wkgbmnqykcVar2.f78156zoijcleaow.length) {
            throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + wkgbmnqykcVar.f78156zoijcleaow.length + " vs " + wkgbmnqykcVar2.f78156zoijcleaow.length + ")");
        }
        int i13 = 0;
        while (true) {
            iArr = wkgbmnqykcVar.f78156zoijcleaow;
            if (i13 >= iArr.length) {
                break;
            }
            this.f78155iobyxmoadg[i13] = v7.dxjokdxxww.dxjokdxxww(wkgbmnqykcVar.f78155iobyxmoadg[i13], wkgbmnqykcVar2.f78155iobyxmoadg[i13], f13);
            this.f78156zoijcleaow[i13] = v7.zoijcleaow.ppxfxbqfkf(f13, wkgbmnqykcVar.f78156zoijcleaow[i13], wkgbmnqykcVar2.f78156zoijcleaow[i13]);
            i13++;
        }
        int length = iArr.length;
        while (true) {
            float[] fArr = this.f78155iobyxmoadg;
            if (length >= fArr.length) {
                return;
            }
            int[] iArr2 = wkgbmnqykcVar.f78156zoijcleaow;
            fArr[length] = fArr[iArr2.length - 1];
            int[] iArr3 = this.f78156zoijcleaow;
            iArr3[length] = iArr3[iArr2.length - 1];
            length++;
        }
    }

    public int[] wkgbmnqykc() {
        return this.f78156zoijcleaow;
    }

    public wkgbmnqykc zoijcleaow(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i13 = 0; i13 < fArr.length; i13++) {
            iArr[i13] = ppxfxbqfkf(fArr[i13]);
        }
        return new wkgbmnqykc(fArr, iArr);
    }
}
