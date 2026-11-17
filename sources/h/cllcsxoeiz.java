package h;

import android.graphics.Matrix;

/* JADX INFO: loaded from: classes.dex */
public abstract class cllcsxoeiz {
    public static final void iobyxmoadg(Matrix matrix, float[] fArr) {
        float f13 = fArr[0];
        float f14 = fArr[1];
        float f15 = fArr[2];
        float f16 = fArr[3];
        float f17 = fArr[4];
        float f18 = fArr[5];
        float f19 = fArr[6];
        float f23 = fArr[7];
        float f24 = fArr[8];
        float f25 = fArr[12];
        float f26 = fArr[13];
        float f27 = fArr[15];
        fArr[0] = f13;
        fArr[1] = f17;
        fArr[2] = f25;
        fArr[3] = f14;
        fArr[4] = f18;
        fArr[5] = f26;
        fArr[6] = f16;
        fArr[7] = f23;
        fArr[8] = f27;
        matrix.setValues(fArr);
        fArr[0] = f13;
        fArr[1] = f14;
        fArr[2] = f15;
        fArr[3] = f16;
        fArr[4] = f17;
        fArr[5] = f18;
        fArr[6] = f19;
        fArr[7] = f23;
        fArr[8] = f24;
    }

    public static final void zoijcleaow(float[] fArr, Matrix matrix) {
        matrix.getValues(fArr);
        float f13 = fArr[0];
        float f14 = fArr[1];
        float f15 = fArr[2];
        float f16 = fArr[3];
        float f17 = fArr[4];
        float f18 = fArr[5];
        float f19 = fArr[6];
        float f23 = fArr[7];
        float f24 = fArr[8];
        fArr[0] = f13;
        fArr[1] = f16;
        fArr[2] = 0.0f;
        fArr[3] = f19;
        fArr[4] = f14;
        fArr[5] = f17;
        fArr[6] = 0.0f;
        fArr[7] = f23;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f15;
        fArr[13] = f18;
        fArr[14] = 0.0f;
        fArr[15] = f24;
    }
}
