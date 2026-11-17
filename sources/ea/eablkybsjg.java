package ea;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes2.dex */
public abstract class eablkybsjg implements TypeEvaluator {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float[] f31014iobyxmoadg = new float[9];

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final float[] f31016zoijcleaow = new float[9];

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Matrix f31015ppxfxbqfkf = new Matrix();

    public Matrix iobyxmoadg(float f13, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f31014iobyxmoadg);
        matrix2.getValues(this.f31016zoijcleaow);
        for (int i13 = 0; i13 < 9; i13++) {
            float[] fArr = this.f31016zoijcleaow;
            float f14 = fArr[i13];
            float f15 = this.f31014iobyxmoadg[i13];
            fArr[i13] = f15 + ((f14 - f15) * f13);
        }
        this.f31015ppxfxbqfkf.setValues(this.f31016zoijcleaow);
        return this.f31015ppxfxbqfkf;
    }
}
