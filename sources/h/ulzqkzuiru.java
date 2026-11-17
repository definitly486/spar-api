package h;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ulzqkzuiru {
    private static final void eablkybsjg(List list, List list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }

    public static final Shader iobyxmoadg(long j13, long j14, List list, List list2, int i13) {
        eablkybsjg(list, list2);
        int iZoijcleaow = zoijcleaow(list);
        return new LinearGradient(Float.intBitsToFloat((int) (j13 >> 32)), Float.intBitsToFloat((int) (j13 & 4294967295L)), Float.intBitsToFloat((int) (j14 >> 32)), Float.intBitsToFloat((int) (4294967295L & j14)), ppxfxbqfkf(list, iZoijcleaow), wkgbmnqykc(list2, list, iZoijcleaow), sopmlzcsov.iobyxmoadg(i13));
    }

    public static final int[] ppxfxbqfkf(List list, int i13) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i14 = 0; i14 < size; i14++) {
            iArr[i14] = bfopjjpdmp.nufgyqmvbu(((oipsdeybqn) list.get(i14)).iwizpuwonk());
        }
        return iArr;
    }

    public static final float[] wkgbmnqykc(List list, List list2, int i13) {
        if (i13 == 0) {
            if (list != null) {
                return hg.jyumaefscl.j(list);
            }
            return null;
        }
        float[] fArr = new float[list2.size() + i13];
        fArr[0] = list != null ? ((Number) list.get(0)).floatValue() : 0.0f;
        int iOjitshcjhn = hg.jyumaefscl.ojitshcjhn(list2);
        int i14 = 1;
        for (int i15 = 1; i15 < iOjitshcjhn; i15++) {
            long jIwizpuwonk = ((oipsdeybqn) list2.get(i15)).iwizpuwonk();
            float fFloatValue = list != null ? ((Number) list.get(i15)).floatValue() : i15 / hg.jyumaefscl.ojitshcjhn(list2);
            int i16 = i14 + 1;
            fArr[i14] = fFloatValue;
            if (oipsdeybqn.rgvfuqvkyq(jIwizpuwonk) == 0.0f) {
                i14 += 2;
                fArr[i16] = fFloatValue;
            } else {
                i14 = i16;
            }
        }
        fArr[i14] = list != null ? ((Number) list.get(hg.jyumaefscl.ojitshcjhn(list2))).floatValue() : 1.0f;
        return fArr;
    }

    public static final int zoijcleaow(List list) {
        return 0;
    }
}
