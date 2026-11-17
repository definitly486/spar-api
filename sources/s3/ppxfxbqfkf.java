package s3;

import android.opengl.Matrix;
import androidx.media3.common.util.GlUtil;
import y2.pkzmftpjix;

/* JADX INFO: loaded from: classes.dex */
final class ppxfxbqfkf {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f105334wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float[] f105332iobyxmoadg = new float[16];

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final float[] f105335zoijcleaow = new float[16];

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final pkzmftpjix f105333ppxfxbqfkf = new pkzmftpjix();

    public static void iobyxmoadg(float[] fArr, float[] fArr2) {
        GlUtil.gtknphoqwx(fArr);
        float f13 = fArr2[10];
        float f14 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f13 * f13) + (f14 * f14));
        float f15 = fArr2[10];
        fArr[0] = f15 / fSqrt;
        float f16 = fArr2[8];
        fArr[2] = f16 / fSqrt;
        fArr[8] = (-f16) / fSqrt;
        fArr[10] = f15 / fSqrt;
    }

    private static void zoijcleaow(float[] fArr, float[] fArr2) {
        float f13 = fArr2[0];
        float f14 = -fArr2[1];
        float f15 = -fArr2[2];
        float length = Matrix.length(f13, f14, f15);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees(length), f13 / length, f14 / length, f15 / length);
        } else {
            GlUtil.gtknphoqwx(fArr);
        }
    }

    public void eablkybsjg(long j13, float[] fArr) {
        this.f105333ppxfxbqfkf.iobyxmoadg(j13, fArr);
    }

    public boolean ppxfxbqfkf(float[] fArr, long j13) {
        float[] fArr2 = (float[]) this.f105333ppxfxbqfkf.btonecajqb(j13);
        if (fArr2 == null) {
            return false;
        }
        zoijcleaow(this.f105335zoijcleaow, fArr2);
        if (!this.f105334wkgbmnqykc) {
            iobyxmoadg(this.f105332iobyxmoadg, this.f105335zoijcleaow);
            this.f105334wkgbmnqykc = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f105332iobyxmoadg, 0, this.f105335zoijcleaow, 0);
        return true;
    }

    public void wkgbmnqykc() {
        this.f105333ppxfxbqfkf.ppxfxbqfkf();
        this.f105334wkgbmnqykc = false;
    }
}
