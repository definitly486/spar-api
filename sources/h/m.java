package h;

import android.graphics.Matrix;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private Matrix f38922iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private Shader f38923zoijcleaow;

    private final Matrix zoijcleaow() {
        Matrix matrix = this.f38922iobyxmoadg;
        if (matrix != null) {
            return matrix;
        }
        Matrix matrix2 = new Matrix();
        this.f38922iobyxmoadg = matrix2;
        return matrix2;
    }

    public final Shader iobyxmoadg() {
        return this.f38923zoijcleaow;
    }

    public final void ppxfxbqfkf(Shader shader) {
        Matrix matrix = this.f38922iobyxmoadg;
        if (matrix != null && shader != null) {
            shader.setLocalMatrix(matrix);
        }
        this.f38923zoijcleaow = shader;
    }

    public final void wkgbmnqykc(float[] fArr) {
        Matrix matrix;
        if (fArr == null) {
            matrix = null;
            this.f38922iobyxmoadg = null;
        } else {
            Matrix matrixZoijcleaow = zoijcleaow();
            cllcsxoeiz.iobyxmoadg(matrixZoijcleaow, fArr);
            matrix = matrixZoijcleaow;
        }
        Shader shader = this.f38923zoijcleaow;
        if (shader != null) {
            shader.setLocalMatrix(matrix);
        }
    }
}
