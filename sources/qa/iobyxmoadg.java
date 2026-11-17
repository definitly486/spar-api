package qa;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import j1.ppxfxbqfkf;

/* JADX INFO: loaded from: classes2.dex */
public class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f78356eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private int f78357gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Paint f78358iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final Path f78359lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final Paint f78360nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Paint f78361ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f78362wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Paint f78363zoijcleaow;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static final int[] f78354dxjokdxxww = new int[3];

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private static final float[] f78352btonecajqb = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private static final int[] f78355gtknphoqwx = new int[4];

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private static final float[] f78353draadjrbmk = {0.0f, 0.0f, 0.5f, 1.0f};

    public iobyxmoadg() {
        this(-16777216);
    }

    public void iobyxmoadg(Canvas canvas, Matrix matrix, RectF rectF, int i13, float f13, float f14) {
        boolean z13 = f14 < 0.0f;
        Path path = this.f78359lqeggnwhkg;
        if (z13) {
            int[] iArr = f78355gtknphoqwx;
            iArr[0] = 0;
            iArr[1] = this.f78357gxszxtbevo;
            iArr[2] = this.f78356eablkybsjg;
            iArr[3] = this.f78362wkgbmnqykc;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f13, f14);
            path.close();
            float f15 = -i13;
            rectF.inset(f15, f15);
            int[] iArr2 = f78355gtknphoqwx;
            iArr2[0] = 0;
            iArr2[1] = this.f78362wkgbmnqykc;
            iArr2[2] = this.f78356eablkybsjg;
            iArr2[3] = this.f78357gxszxtbevo;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f16 = 1.0f - (i13 / fWidth);
        float[] fArr = f78353draadjrbmk;
        fArr[1] = f16;
        fArr[2] = ((1.0f - f16) / 2.0f) + f16;
        this.f78363zoijcleaow.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, f78355gtknphoqwx, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z13) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f78360nufgyqmvbu);
        }
        canvas.drawArc(rectF, f13, f14, true, this.f78363zoijcleaow);
        canvas.restore();
    }

    public Paint ppxfxbqfkf() {
        return this.f78358iobyxmoadg;
    }

    public void wkgbmnqykc(int i13) {
        this.f78362wkgbmnqykc = ppxfxbqfkf.gtknphoqwx(i13, 68);
        this.f78356eablkybsjg = ppxfxbqfkf.gtknphoqwx(i13, 20);
        this.f78357gxszxtbevo = ppxfxbqfkf.gtknphoqwx(i13, 0);
        this.f78358iobyxmoadg.setColor(this.f78362wkgbmnqykc);
    }

    public void zoijcleaow(Canvas canvas, Matrix matrix, RectF rectF, int i13) {
        rectF.bottom += i13;
        rectF.offset(0.0f, -i13);
        int[] iArr = f78354dxjokdxxww;
        iArr[0] = this.f78357gxszxtbevo;
        iArr[1] = this.f78356eablkybsjg;
        iArr[2] = this.f78362wkgbmnqykc;
        Paint paint = this.f78361ppxfxbqfkf;
        float f13 = rectF.left;
        paint.setShader(new LinearGradient(f13, rectF.top, f13, rectF.bottom, iArr, f78352btonecajqb, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f78361ppxfxbqfkf);
        canvas.restore();
    }

    public iobyxmoadg(int i13) {
        this.f78359lqeggnwhkg = new Path();
        Paint paint = new Paint();
        this.f78360nufgyqmvbu = paint;
        this.f78358iobyxmoadg = new Paint();
        wkgbmnqykc(i13);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f78363zoijcleaow = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f78361ppxfxbqfkf = new Paint(paint2);
    }
}
