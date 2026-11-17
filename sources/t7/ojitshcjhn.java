package t7;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes2.dex */
public class ojitshcjhn implements cllcsxoeiz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private int f109981iobyxmoadg;

    public ojitshcjhn(int i13) {
        this.f109981iobyxmoadg = i13;
    }

    protected static float[] eablkybsjg(float[] fArr, float[] fArr2) {
        if (fArr.length == 0) {
            return fArr2;
        }
        if (fArr2.length == 0) {
            return fArr;
        }
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < length; i16++) {
            float f13 = i14 < fArr.length ? fArr[i14] : Float.NaN;
            float f14 = i15 < fArr2.length ? fArr2[i15] : Float.NaN;
            if (Float.isNaN(f14) || f13 < f14) {
                fArr3[i16] = f13;
                i14++;
            } else if (Float.isNaN(f13) || f14 < f13) {
                fArr3[i16] = f14;
                i15++;
            } else {
                fArr3[i16] = f13;
                i14++;
                i15++;
                i13++;
            }
        }
        return i13 == 0 ? fArr3 : Arrays.copyOf(fArr3, length - i13);
    }

    private int wkgbmnqykc(float f13, int i13, float[] fArr, float[] fArr2) {
        float fDxjokdxxww;
        if (fArr2.length < 2 || f13 <= fArr[0]) {
            return Color.argb((int) (fArr2[0] * 255.0f), Color.red(i13), Color.green(i13), Color.blue(i13));
        }
        for (int i14 = 1; i14 < fArr.length; i14++) {
            float f14 = fArr[i14];
            if (f14 >= f13 || i14 == fArr.length - 1) {
                if (f14 <= f13) {
                    fDxjokdxxww = fArr2[i14];
                } else {
                    int i15 = i14 - 1;
                    float f15 = fArr[i15];
                    fDxjokdxxww = v7.dxjokdxxww.dxjokdxxww(fArr2[i15], fArr2[i14], (f13 - f15) / (f14 - f15));
                }
                return Color.argb((int) (fDxjokdxxww * 255.0f), Color.red(i13), Color.green(i13), Color.blue(i13));
            }
        }
        throw new IllegalArgumentException("Unreachable code.");
    }

    private q7.wkgbmnqykc zoijcleaow(q7.wkgbmnqykc wkgbmnqykcVar, List list) {
        int i13 = this.f109981iobyxmoadg * 4;
        if (list.size() <= i13) {
            return wkgbmnqykcVar;
        }
        float[] fArrEablkybsjg = wkgbmnqykcVar.eablkybsjg();
        int[] iArrWkgbmnqykc = wkgbmnqykcVar.wkgbmnqykc();
        int size = (list.size() - i13) / 2;
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        int i14 = 0;
        while (i13 < list.size()) {
            if (i13 % 2 == 0) {
                fArr[i14] = ((Float) list.get(i13)).floatValue();
            } else {
                fArr2[i14] = ((Float) list.get(i13)).floatValue();
                i14++;
            }
            i13++;
        }
        float[] fArrEablkybsjg2 = eablkybsjg(wkgbmnqykcVar.eablkybsjg(), fArr);
        int length = fArrEablkybsjg2.length;
        int[] iArr = new int[length];
        for (int i15 = 0; i15 < length; i15++) {
            float f13 = fArrEablkybsjg2[i15];
            int iBinarySearch = Arrays.binarySearch(fArrEablkybsjg, f13);
            int iBinarySearch2 = Arrays.binarySearch(fArr, f13);
            if (iBinarySearch < 0 || iBinarySearch2 > 0) {
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = -(iBinarySearch2 + 1);
                }
                iArr[i15] = ppxfxbqfkf(f13, fArr2[iBinarySearch2], fArrEablkybsjg, iArrWkgbmnqykc);
            } else {
                iArr[i15] = wkgbmnqykc(f13, iArrWkgbmnqykc[iBinarySearch], fArr, fArr2);
            }
        }
        return new q7.wkgbmnqykc(fArrEablkybsjg2, iArr);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00cf  */
    @Override // t7.cllcsxoeiz
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public q7.wkgbmnqykc iobyxmoadg(u7.ppxfxbqfkf ppxfxbqfkfVar, float f13) {
        ArrayList arrayList = new ArrayList();
        boolean z13 = ppxfxbqfkfVar.zdlpuopuiu() == u7.ppxfxbqfkf.zoijcleaow.BEGIN_ARRAY;
        if (z13) {
            ppxfxbqfkfVar.wkgbmnqykc();
        }
        while (ppxfxbqfkfVar.btonecajqb()) {
            arrayList.add(Float.valueOf((float) ppxfxbqfkfVar.agtfadlqog()));
        }
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add((Float) arrayList.get(1));
            arrayList.add((Float) arrayList.get(2));
            arrayList.add((Float) arrayList.get(3));
            this.f109981iobyxmoadg = 2;
        }
        if (z13) {
            ppxfxbqfkfVar.nufgyqmvbu();
        }
        if (this.f109981iobyxmoadg == -1) {
            this.f109981iobyxmoadg = arrayList.size() / 4;
        }
        int i13 = this.f109981iobyxmoadg;
        float[] fArr = new float[i13];
        int[] iArr = new int[i13];
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < this.f109981iobyxmoadg * 4; i16++) {
            int i17 = i16 / 4;
            double dFloatValue = ((Float) arrayList.get(i16)).floatValue();
            int i18 = i16 % 4;
            if (i18 != 0) {
                if (i18 == 1) {
                    i14 = (int) (dFloatValue * 255.0d);
                } else if (i18 == 2) {
                    i15 = (int) (dFloatValue * 255.0d);
                } else if (i18 == 3) {
                    iArr[i17] = Color.argb(KotlinVersion.MAX_COMPONENT_VALUE, i14, i15, (int) (dFloatValue * 255.0d));
                }
            } else if (i17 > 0) {
                float f14 = (float) dFloatValue;
                if (fArr[i17 - 1] >= f14) {
                    fArr[i17] = f14 + 0.01f;
                } else {
                    fArr[i17] = (float) dFloatValue;
                }
            } else {
                fArr[i17] = (float) dFloatValue;
            }
        }
        return zoijcleaow(new q7.wkgbmnqykc(fArr, iArr), arrayList);
    }

    int ppxfxbqfkf(float f13, float f14, float[] fArr, int[] iArr) {
        if (iArr.length < 2 || f13 == fArr[0]) {
            return iArr[0];
        }
        for (int i13 = 1; i13 < fArr.length; i13++) {
            float f15 = fArr[i13];
            if (f15 >= f13 || i13 == fArr.length - 1) {
                if (i13 == fArr.length - 1 && f13 >= f15) {
                    return Color.argb((int) (f14 * 255.0f), Color.red(iArr[i13]), Color.green(iArr[i13]), Color.blue(iArr[i13]));
                }
                int i14 = i13 - 1;
                float f16 = fArr[i14];
                int iPpxfxbqfkf = v7.zoijcleaow.ppxfxbqfkf((f13 - f16) / (f15 - f16), iArr[i14], iArr[i13]);
                return Color.argb((int) (f14 * 255.0f), Color.red(iPpxfxbqfkf), Color.green(iPpxfxbqfkf), Color.blue(iPpxfxbqfkf));
            }
        }
        throw new IllegalArgumentException("Unreachable code.");
    }
}
