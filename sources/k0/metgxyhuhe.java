package k0;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;

/* JADX INFO: loaded from: classes.dex */
public final class metgxyhuhe extends Canvas {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private Canvas f53337iobyxmoadg;

    @Override // android.graphics.Canvas
    public boolean clipOutPath(Path path) {
        agtfadlqog agtfadlqogVar = agtfadlqog.f53294iobyxmoadg;
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        return agtfadlqogVar.iobyxmoadg(canvas, path);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(RectF rectF) {
        agtfadlqog agtfadlqogVar = agtfadlqog.f53294iobyxmoadg;
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        return agtfadlqogVar.eablkybsjg(canvas, rectF);
    }

    @Override // android.graphics.Canvas
    public boolean clipPath(Path path, Region.Op op2) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        return canvas.clipPath(path, op2);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(RectF rectF, Region.Op op2) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rectF, op2);
    }

    @Override // android.graphics.Canvas
    public void concat(Matrix matrix) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        canvas.concat(matrix);
    }

    @Override // android.graphics.Canvas
    public void disableZ() {
        yggfygwlhe yggfygwlheVar = yggfygwlhe.f53386iobyxmoadg;
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        yggfygwlheVar.iobyxmoadg(canvas);
    }

    @Override // android.graphics.Canvas
    public void drawARGB(int i13, int i14, int i15, int i16) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        canvas.drawARGB(i13, i14, i15, i16);
    }

    @Override // android.graphics.Canvas
    public void drawArc(RectF rectF, float f13, float f14, boolean z13, Paint paint) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        canvas.drawArc(rectF, f13, f14, z13, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, float f13, float f14, Paint paint) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, f13, f14, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmapMesh(Bitmap bitmap, int i13, int i14, float[] fArr, int i15, int[] iArr, int i16, Paint paint) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmapMesh(bitmap, i13, i14, fArr, i15, iArr, i16, paint);
    }

    @Override // android.graphics.Canvas
    public void drawCircle(float f13, float f14, float f15, Paint paint) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        canvas.drawCircle(f13, f14, f15, paint);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int i13) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(i13);
    }

    @Override // android.graphics.Canvas
    public void drawDoubleRoundRect(RectF rectF, float f13, float f14, RectF rectF2, float f15, float f16, Paint paint) {
        yggfygwlhe yggfygwlheVar = yggfygwlhe.f53386iobyxmoadg;
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        yggfygwlheVar.eablkybsjg(canvas, rectF, f13, f14, rectF2, f15, f16, paint);
    }

    @Override // android.graphics.Canvas
    public void drawGlyphs(int[] iArr, int i13, float[] fArr, int i14, int i15, Font font, Paint paint) {
        istkbnxepw istkbnxepwVar = istkbnxepw.f53314iobyxmoadg;
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        istkbnxepwVar.iobyxmoadg(canvas, iArr, i13, fArr, i14, i15, font, paint);
    }

    @Override // android.graphics.Canvas
    public void drawLine(float f13, float f14, float f15, float f16, Paint paint) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        canvas.drawLine(f13, f14, f15, f16, paint);
    }

    @Override // android.graphics.Canvas
    public void drawLines(float[] fArr, int i13, int i14, Paint paint) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        canvas.drawLines(fArr, i13, i14, paint);
    }

    @Override // android.graphics.Canvas
    public void drawOval(RectF rectF, Paint paint) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        canvas.drawOval(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPaint(Paint paint) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        canvas.drawPaint(paint);
    }

    @Override // android.graphics.Canvas
    public void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        istkbnxepw istkbnxepwVar = istkbnxepw.f53314iobyxmoadg;
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        istkbnxepwVar.zoijcleaow(canvas, ninePatch, rect, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPath(Path path, Paint paint) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        canvas.drawPath(path, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(Picture picture) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture);
    }

    @Override // android.graphics.Canvas
    public void drawPoint(float f13, float f14, Paint paint) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoint(f13, f14, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPoints(float[] fArr, int i13, int i14, Paint paint) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoints(fArr, i13, i14, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPosText(char[] cArr, int i13, int i14, float[] fArr, Paint paint) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        canvas.drawPosText(cArr, i13, i14, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRGB(int i13, int i14, int i15) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        canvas.drawRGB(i13, i14, i15);
    }

    @Override // android.graphics.Canvas
    public void drawRect(RectF rectF, Paint paint) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRenderNode(RenderNode renderNode) {
        yggfygwlhe yggfygwlheVar = yggfygwlhe.f53386iobyxmoadg;
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        yggfygwlheVar.lqeggnwhkg(canvas, renderNode);
    }

    @Override // android.graphics.Canvas
    public void drawRoundRect(RectF rectF, float f13, float f14, Paint paint) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        canvas.drawRoundRect(rectF, f13, f14, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(char[] cArr, int i13, int i14, float f13, float f14, Paint paint) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(cArr, i13, i14, f13, f14, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextOnPath(char[] cArr, int i13, int i14, Path path, float f13, float f14, Paint paint) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextOnPath(cArr, i13, i14, path, f13, f14, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextRun(char[] cArr, int i13, int i14, int i15, int i16, float f13, float f14, boolean z13, Paint paint) {
        wflxmlrfwp wflxmlrfwpVar = wflxmlrfwp.f53370iobyxmoadg;
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        wflxmlrfwpVar.zoijcleaow(canvas, cArr, i13, i14, i15, i16, f13, f14, z13, paint);
    }

    @Override // android.graphics.Canvas
    public void drawVertices(Canvas.VertexMode vertexMode, int i13, float[] fArr, int i14, float[] fArr2, int i15, int[] iArr, int i16, short[] sArr, int i17, int i18, Paint paint) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        canvas.drawVertices(vertexMode, i13, fArr, i14, fArr2, i15, iArr, i16, sArr, i17, i18, paint);
    }

    @Override // android.graphics.Canvas
    public void enableZ() {
        yggfygwlhe yggfygwlheVar = yggfygwlhe.f53386iobyxmoadg;
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        yggfygwlheVar.dxjokdxxww(canvas);
    }

    @Override // android.graphics.Canvas
    public boolean getClipBounds(Rect rect) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        boolean clipBounds = canvas.getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    @Override // android.graphics.Canvas
    public int getDensity() {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        return canvas.getDensity();
    }

    @Override // android.graphics.Canvas
    public DrawFilter getDrawFilter() {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        return canvas.getDrawFilter();
    }

    @Override // android.graphics.Canvas
    public int getHeight() {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        return canvas.getHeight();
    }

    @Override // android.graphics.Canvas
    public void getMatrix(Matrix matrix) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        canvas.getMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public int getMaximumBitmapHeight() {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        return canvas.getMaximumBitmapHeight();
    }

    @Override // android.graphics.Canvas
    public int getMaximumBitmapWidth() {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        return canvas.getMaximumBitmapWidth();
    }

    @Override // android.graphics.Canvas
    public int getSaveCount() {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        return canvas.getSaveCount();
    }

    @Override // android.graphics.Canvas
    public int getWidth() {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        return canvas.getWidth();
    }

    public final void iobyxmoadg(Canvas canvas) {
        this.f53337iobyxmoadg = canvas;
    }

    @Override // android.graphics.Canvas
    public boolean isOpaque() {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        return canvas.isOpaque();
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(rectF, edgeType);
    }

    @Override // android.graphics.Canvas
    public void restore() {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        canvas.restore();
    }

    @Override // android.graphics.Canvas
    public void restoreToCount(int i13) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        canvas.restoreToCount(i13);
    }

    @Override // android.graphics.Canvas
    public void rotate(float f13) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        canvas.rotate(f13);
    }

    @Override // android.graphics.Canvas
    public int save() {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        return canvas.save();
    }

    @Override // android.graphics.Canvas
    public int saveLayer(RectF rectF, Paint paint, int i13) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(rectF, paint, i13);
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(RectF rectF, int i13, int i14) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(rectF, i13, i14);
    }

    @Override // android.graphics.Canvas
    public void scale(float f13, float f14) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        canvas.scale(f13, f14);
    }

    @Override // android.graphics.Canvas
    public void setBitmap(Bitmap bitmap) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        canvas.setBitmap(bitmap);
    }

    @Override // android.graphics.Canvas
    public void setDensity(int i13) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        canvas.setDensity(i13);
    }

    @Override // android.graphics.Canvas
    public void setDrawFilter(DrawFilter drawFilter) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        canvas.setDrawFilter(drawFilter);
    }

    @Override // android.graphics.Canvas
    public void setMatrix(Matrix matrix) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        canvas.setMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public void skew(float f13, float f14) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        canvas.skew(f13, f14);
    }

    @Override // android.graphics.Canvas
    public void translate(float f13, float f14) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        canvas.translate(f13, f14);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(Rect rect) {
        agtfadlqog agtfadlqogVar = agtfadlqog.f53294iobyxmoadg;
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        return agtfadlqogVar.wkgbmnqykc(canvas, rect);
    }

    @Override // android.graphics.Canvas
    public boolean clipPath(Path path) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        return canvas.clipPath(path);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(Rect rect, Region.Op op2) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rect, op2);
    }

    @Override // android.graphics.Canvas
    public void drawArc(float f13, float f14, float f15, float f16, float f17, float f18, boolean z13, Paint paint) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        canvas.drawArc(f13, f14, f15, f16, f17, f18, z13, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, rect, rectF, paint);
    }

    @Override // android.graphics.Canvas
    public void drawColor(long j13) {
        yggfygwlhe yggfygwlheVar = yggfygwlhe.f53386iobyxmoadg;
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        yggfygwlheVar.ppxfxbqfkf(canvas, j13);
    }

    @Override // android.graphics.Canvas
    public void drawLines(float[] fArr, Paint paint) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        canvas.drawLines(fArr, paint);
    }

    @Override // android.graphics.Canvas
    public void drawOval(float f13, float f14, float f15, float f16, Paint paint) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        canvas.drawOval(f13, f14, f15, f16, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        istkbnxepw istkbnxepwVar = istkbnxepw.f53314iobyxmoadg;
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        istkbnxepwVar.ppxfxbqfkf(canvas, ninePatch, rectF, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(Picture picture, RectF rectF) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture, rectF);
    }

    @Override // android.graphics.Canvas
    public void drawPoints(float[] fArr, Paint paint) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        canvas.drawPoints(fArr, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPosText(String str, float[] fArr, Paint paint) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        canvas.drawPosText(str, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRect(Rect rect, Paint paint) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(rect, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRoundRect(float f13, float f14, float f15, float f16, float f17, float f18, Paint paint) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        canvas.drawRoundRect(f13, f14, f15, f16, f17, f18, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(String str, float f13, float f14, Paint paint) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(str, f13, f14, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextOnPath(String str, Path path, float f13, float f14, Paint paint) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        canvas.drawTextOnPath(str, path, f13, f14, paint);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(RectF rectF) {
        esjtqupxsv esjtqupxsvVar = esjtqupxsv.f53302iobyxmoadg;
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        return esjtqupxsvVar.ppxfxbqfkf(canvas, rectF);
    }

    @Override // android.graphics.Canvas
    public int saveLayer(RectF rectF, Paint paint) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(RectF rectF, int i13) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(rectF, i13);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(float f13, float f14, float f15, float f16) {
        agtfadlqog agtfadlqogVar = agtfadlqog.f53294iobyxmoadg;
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        return agtfadlqogVar.zoijcleaow(canvas, f13, f14, f15, f16);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(RectF rectF) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rectF);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, rect, rect2, paint);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int i13, PorterDuff.Mode mode) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        canvas.drawColor(i13, mode);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(Picture picture, Rect rect) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        canvas.drawPicture(picture, rect);
    }

    @Override // android.graphics.Canvas
    public void drawRect(float f13, float f14, float f15, float f16, Paint paint) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        canvas.drawRect(f13, f14, f15, f16, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(String str, int i13, int i14, float f13, float f14, Paint paint) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(str, i13, i14, f13, f14, paint);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(path, edgeType);
    }

    @Override // android.graphics.Canvas
    public int saveLayer(float f13, float f14, float f15, float f16, Paint paint, int i13) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(f13, f14, f15, f16, paint, i13);
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(float f13, float f14, float f15, float f16, int i13, int i14) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(f13, f14, f15, f16, i13, i14);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(int i13, int i14, int i15, int i16) {
        agtfadlqog agtfadlqogVar = agtfadlqog.f53294iobyxmoadg;
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        return agtfadlqogVar.ppxfxbqfkf(canvas, i13, i14, i15, i16);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(Rect rect) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(rect);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(int[] iArr, int i13, int i14, float f13, float f14, int i15, int i16, boolean z13, Paint paint) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(iArr, i13, i14, f13, f14, i15, i16, z13, paint);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int i13, BlendMode blendMode) {
        yggfygwlhe yggfygwlheVar = yggfygwlhe.f53386iobyxmoadg;
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        yggfygwlheVar.zoijcleaow(canvas, i13, blendMode);
    }

    @Override // android.graphics.Canvas
    public void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        yggfygwlhe yggfygwlheVar = yggfygwlhe.f53386iobyxmoadg;
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        yggfygwlheVar.gxszxtbevo(canvas, rectF, fArr, rectF2, fArr2, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(CharSequence charSequence, int i13, int i14, float f13, float f14, Paint paint) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        canvas.drawText(charSequence, i13, i14, f13, f14, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextRun(CharSequence charSequence, int i13, int i14, int i15, int i16, float f13, float f14, boolean z13, Paint paint) {
        wflxmlrfwp wflxmlrfwpVar = wflxmlrfwp.f53370iobyxmoadg;
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        wflxmlrfwpVar.iobyxmoadg(canvas, charSequence, i13, i14, i15, i16, f13, f14, z13, paint);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(Path path) {
        esjtqupxsv esjtqupxsvVar = esjtqupxsv.f53302iobyxmoadg;
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        return esjtqupxsvVar.zoijcleaow(canvas, path);
    }

    @Override // android.graphics.Canvas
    public int saveLayer(float f13, float f14, float f15, float f16, Paint paint) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayer(f13, f14, f15, f16, paint);
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(float f13, float f14, float f15, float f16, int i13) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        return canvas.saveLayerAlpha(f13, f14, f15, f16, i13);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(float f13, float f14, float f15, float f16, Region.Op op2) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(f13, f14, f15, f16, op2);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(int[] iArr, int i13, int i14, int i15, int i16, int i17, int i18, boolean z13, Paint paint) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(iArr, i13, i14, i15, i16, i17, i18, z13, paint);
    }

    @Override // android.graphics.Canvas
    public void drawColor(long j13, BlendMode blendMode) {
        yggfygwlhe yggfygwlheVar = yggfygwlhe.f53386iobyxmoadg;
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        yggfygwlheVar.wkgbmnqykc(canvas, j13, blendMode);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(float f13, float f14, float f15, float f16, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        return canvas.quickReject(f13, f14, f15, f16, edgeType);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(float f13, float f14, float f15, float f16) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(f13, f14, f15, f16);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        canvas.drawBitmap(bitmap, matrix, paint);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(float f13, float f14, float f15, float f16) {
        esjtqupxsv esjtqupxsvVar = esjtqupxsv.f53302iobyxmoadg;
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        return esjtqupxsvVar.iobyxmoadg(canvas, f13, f14, f15, f16);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(int i13, int i14, int i15, int i16) {
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        return canvas.clipRect(i13, i14, i15, i16);
    }

    @Override // android.graphics.Canvas
    public void drawTextRun(MeasuredText measuredText, int i13, int i14, int i15, int i16, float f13, float f14, boolean z13, Paint paint) {
        yggfygwlhe yggfygwlheVar = yggfygwlhe.f53386iobyxmoadg;
        Canvas canvas = this.f53337iobyxmoadg;
        if (canvas == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("nativeCanvas");
            canvas = null;
        }
        yggfygwlheVar.nufgyqmvbu(canvas, measuredText, i13, i14, i15, i16, f13, f14, z13, paint);
    }
}
