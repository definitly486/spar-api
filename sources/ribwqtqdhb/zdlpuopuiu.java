package ribwqtqdhb;

import vipkmwdibw.istkbnxepw;
import vipkmwdibw.pmvmpeiblj;

/* JADX INFO: loaded from: classes.dex */
public abstract class zdlpuopuiu {
    public static final pmvmpeiblj ppxfxbqfkf(w0.wkgbmnqykc wkgbmnqykcVar) {
        return istkbnxepw.zoijcleaow(new yggfygwlhe(wkgbmnqykcVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zoijcleaow(float[] fArr, float[] fArr2, int i13) {
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f23;
        float f24 = 0.0f;
        float f25 = 0.0f;
        for (int i14 = 0; i14 < i13; i14++) {
            float f26 = i14 / i13;
            float f27 = 1.0f;
            while (true) {
                f13 = ((f27 - f24) / 2.0f) + f24;
                f14 = 1.0f - f13;
                f15 = f13 * 3.0f * f14;
                f16 = f13 * f13 * f13;
                float f28 = (((f14 * 0.175f) + (f13 * 0.35000002f)) * f15) + f16;
                if (Math.abs(f28 - f26) < 1.0E-5d) {
                    break;
                } else if (f28 > f26) {
                    f27 = f13;
                } else {
                    f24 = f13;
                }
            }
            float f29 = 0.5f;
            fArr[i14] = (f15 * ((f14 * 0.5f) + f13)) + f16;
            float f33 = 1.0f;
            while (true) {
                f17 = ((f33 - f25) / 2.0f) + f25;
                f18 = 1.0f - f17;
                f19 = f17 * 3.0f * f18;
                f23 = f17 * f17 * f17;
                float f34 = (((f18 * f29) + f17) * f19) + f23;
                if (Math.abs(f34 - f26) >= 1.0E-5d) {
                    if (f34 > f26) {
                        f33 = f17;
                    } else {
                        f25 = f17;
                    }
                    f29 = 0.5f;
                }
            }
            fArr2[i14] = (f19 * ((f18 * 0.175f) + (f17 * 0.35000002f))) + f23;
        }
        fArr2[i13] = 1.0f;
        fArr[i13] = 1.0f;
    }
}
