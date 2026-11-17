package androidx.compose.ui.platform;

/* JADX INFO: loaded from: classes.dex */
public abstract class fmlbqenlif {
    public static final boolean iobyxmoadg(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f13 = fArr[0];
        float f14 = fArr[1];
        float f15 = fArr[2];
        float f16 = fArr[3];
        float f17 = fArr[4];
        float f18 = fArr[5];
        float f19 = fArr[6];
        float f23 = fArr[7];
        float f24 = fArr[8];
        float f25 = fArr[9];
        float f26 = fArr[10];
        float f27 = fArr[11];
        float f28 = fArr[12];
        float f29 = fArr[13];
        float f33 = fArr[14];
        float f34 = fArr[15];
        float f35 = (f13 * f18) - (f14 * f17);
        float f36 = (f13 * f19) - (f15 * f17);
        float f37 = (f13 * f23) - (f16 * f17);
        float f38 = (f14 * f19) - (f15 * f18);
        float f39 = (f14 * f23) - (f16 * f18);
        float f43 = (f15 * f23) - (f16 * f19);
        float f44 = (f24 * f29) - (f25 * f28);
        float f45 = (f24 * f33) - (f26 * f28);
        float f46 = (f24 * f34) - (f27 * f28);
        float f47 = (f25 * f33) - (f26 * f29);
        float f48 = (f25 * f34) - (f27 * f29);
        float f49 = (f26 * f34) - (f27 * f33);
        float f53 = (((((f35 * f49) - (f36 * f48)) + (f37 * f47)) + (f38 * f46)) - (f39 * f45)) + (f43 * f44);
        if (f53 != 0.0f) {
            float f54 = 1.0f / f53;
            fArr2[0] = (((f18 * f49) - (f19 * f48)) + (f23 * f47)) * f54;
            fArr2[1] = ((((-f14) * f49) + (f15 * f48)) - (f16 * f47)) * f54;
            fArr2[2] = (((f29 * f43) - (f33 * f39)) + (f34 * f38)) * f54;
            fArr2[3] = ((((-f25) * f43) + (f26 * f39)) - (f27 * f38)) * f54;
            float f55 = -f17;
            fArr2[4] = (((f55 * f49) + (f19 * f46)) - (f23 * f45)) * f54;
            fArr2[5] = (((f49 * f13) - (f15 * f46)) + (f16 * f45)) * f54;
            float f56 = -f28;
            fArr2[6] = (((f56 * f43) + (f33 * f37)) - (f34 * f36)) * f54;
            fArr2[7] = (((f43 * f24) - (f26 * f37)) + (f27 * f36)) * f54;
            fArr2[8] = (((f17 * f48) - (f18 * f46)) + (f23 * f44)) * f54;
            fArr2[9] = ((((-f13) * f48) + (f46 * f14)) - (f16 * f44)) * f54;
            fArr2[10] = (((f28 * f39) - (f29 * f37)) + (f34 * f35)) * f54;
            fArr2[11] = ((((-f24) * f39) + (f37 * f25)) - (f27 * f35)) * f54;
            fArr2[12] = (((f55 * f47) + (f18 * f45)) - (f19 * f44)) * f54;
            fArr2[13] = (((f13 * f47) - (f14 * f45)) + (f15 * f44)) * f54;
            fArr2[14] = (((f56 * f38) + (f29 * f36)) - (f33 * f35)) * f54;
            fArr2[15] = (((f24 * f38) - (f25 * f36)) + (f26 * f35)) * f54;
        }
        return !(f53 == 0.0f);
    }
}
