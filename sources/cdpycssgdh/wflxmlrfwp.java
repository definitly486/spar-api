package cdpycssgdh;

import android.opengl.Matrix;

/* JADX INFO: loaded from: classes.dex */
public abstract class wflxmlrfwp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final float[] f19744iobyxmoadg = new float[16];

    private static void iobyxmoadg(float[] fArr, float f13, float f14) {
        Matrix.translateM(fArr, 0, -f13, -f14, 0.0f);
    }

    public static void ppxfxbqfkf(float[] fArr, float f13, float f14, float f15) {
        zoijcleaow(fArr, f14, f15);
        Matrix.rotateM(fArr, 0, f13, 0.0f, 0.0f, 1.0f);
        iobyxmoadg(fArr, f14, f15);
    }

    public static void wkgbmnqykc(float[] fArr, float f13) {
        zoijcleaow(fArr, 0.0f, f13);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        iobyxmoadg(fArr, 0.0f, f13);
    }

    private static void zoijcleaow(float[] fArr, float f13, float f14) {
        Matrix.translateM(fArr, 0, f13, f14, 0.0f);
    }
}
