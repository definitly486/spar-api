package h;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;

/* JADX INFO: loaded from: classes.dex */
public final class cdpycssgdh implements metgxyhuhe {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private Canvas f38874iobyxmoadg = yadqdtsiqt.f38986iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private Rect f38875ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private Rect f38876zoijcleaow;

    @Override // h.metgxyhuhe
    public void agtfadlqog() {
        this.f38874iobyxmoadg.restore();
    }

    @Override // h.metgxyhuhe
    public void cqumvgiudr(float[] fArr) {
        if (fiwbwshyhd.iobyxmoadg(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        cllcsxoeiz.iobyxmoadg(matrix, fArr);
        this.f38874iobyxmoadg.concat(matrix);
    }

    @Override // h.metgxyhuhe
    public void dxjokdxxww(g.lqeggnwhkg lqeggnwhkgVar, ipoelvxyzq ipoelvxyzqVar) {
        this.f38874iobyxmoadg.saveLayer(lqeggnwhkgVar.nufgyqmvbu(), lqeggnwhkgVar.gtknphoqwx(), lqeggnwhkgVar.dxjokdxxww(), lqeggnwhkgVar.eablkybsjg(), ipoelvxyzqVar.vdvldrhtss(), 31);
    }

    @Override // h.metgxyhuhe
    public void eablkybsjg(float f13, float f14) {
        this.f38874iobyxmoadg.scale(f13, f14);
    }

    @Override // h.metgxyhuhe
    public void esjtqupxsv(float f13, float f14, float f15, float f16, float f17, float f18, boolean z13, ipoelvxyzq ipoelvxyzqVar) {
        this.f38874iobyxmoadg.drawArc(f13, f14, f15, f16, f17, f18, z13, ipoelvxyzqVar.vdvldrhtss());
    }

    @Override // h.metgxyhuhe
    public void gxszxtbevo(long j13, long j14, ipoelvxyzq ipoelvxyzqVar) {
        this.f38874iobyxmoadg.drawLine(Float.intBitsToFloat((int) (j13 >> 32)), Float.intBitsToFloat((int) (j13 & 4294967295L)), Float.intBitsToFloat((int) (j14 >> 32)), Float.intBitsToFloat((int) (j14 & 4294967295L)), ipoelvxyzqVar.vdvldrhtss());
    }

    public final Canvas iobyxmoadg() {
        return this.f38874iobyxmoadg;
    }

    @Override // h.metgxyhuhe
    public void iwizpuwonk() {
        uwvvkdfqfp.f38971iobyxmoadg.iobyxmoadg(this.f38874iobyxmoadg, false);
    }

    @Override // h.metgxyhuhe
    public void jyumaefscl() {
        this.f38874iobyxmoadg.save();
    }

    @Override // h.metgxyhuhe
    public void kcexrzcfyt(dvvnrvtcbc dvvnrvtcbcVar, long j13, ipoelvxyzq ipoelvxyzqVar) {
        this.f38874iobyxmoadg.drawBitmap(hkdspvbjdz.zoijcleaow(dvvnrvtcbcVar), Float.intBitsToFloat((int) (j13 >> 32)), Float.intBitsToFloat((int) (j13 & 4294967295L)), ipoelvxyzqVar.vdvldrhtss());
    }

    public final void lereixgezr(Canvas canvas) {
        this.f38874iobyxmoadg = canvas;
    }

    @Override // h.metgxyhuhe
    public void nufgyqmvbu(dvvnrvtcbc dvvnrvtcbcVar, long j13, long j14, long j15, long j16, ipoelvxyzq ipoelvxyzqVar) {
        if (this.f38876zoijcleaow == null) {
            this.f38876zoijcleaow = new Rect();
            this.f38875ppxfxbqfkf = new Rect();
        }
        Canvas canvas = this.f38874iobyxmoadg;
        Bitmap bitmapZoijcleaow = hkdspvbjdz.zoijcleaow(dvvnrvtcbcVar);
        Rect rect = this.f38876zoijcleaow;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(rect);
        rect.left = w0.agtfadlqog.dxjokdxxww(j13);
        rect.top = w0.agtfadlqog.btonecajqb(j13);
        rect.right = w0.agtfadlqog.dxjokdxxww(j13) + ((int) (j14 >> 32));
        rect.bottom = w0.agtfadlqog.btonecajqb(j13) + ((int) (j14 & 4294967295L));
        gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
        Rect rect2 = this.f38875ppxfxbqfkf;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(rect2);
        rect2.left = w0.agtfadlqog.dxjokdxxww(j15);
        rect2.top = w0.agtfadlqog.btonecajqb(j15);
        rect2.right = w0.agtfadlqog.dxjokdxxww(j15) + ((int) (j16 >> 32));
        rect2.bottom = w0.agtfadlqog.btonecajqb(j15) + ((int) (j16 & 4294967295L));
        canvas.drawBitmap(bitmapZoijcleaow, rect, rect2, ipoelvxyzqVar.vdvldrhtss());
    }

    @Override // h.metgxyhuhe
    public void ojitshcjhn(long j13, float f13, ipoelvxyzq ipoelvxyzqVar) {
        this.f38874iobyxmoadg.drawCircle(Float.intBitsToFloat((int) (j13 >> 32)), Float.intBitsToFloat((int) (j13 & 4294967295L)), f13, ipoelvxyzqVar.vdvldrhtss());
    }

    @Override // h.metgxyhuhe
    public void oxmwwwfdhm(float f13, float f14, float f15, float f16, float f17, float f18, ipoelvxyzq ipoelvxyzqVar) {
        this.f38874iobyxmoadg.drawRoundRect(f13, f14, f15, f16, f17, f18, ipoelvxyzqVar.vdvldrhtss());
    }

    public final Region.Op pmvmpeiblj(int i13) {
        return zfvoamnweg.wkgbmnqykc(i13, zfvoamnweg.f38997iobyxmoadg.iobyxmoadg()) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
    }

    @Override // h.metgxyhuhe
    public void ppxfxbqfkf(float f13, float f14, float f15, float f16, int i13) {
        this.f38874iobyxmoadg.clipRect(f13, f14, f15, f16, pmvmpeiblj(i13));
    }

    @Override // h.metgxyhuhe
    public void rgvfuqvkyq(mhtqkkgtqm mhtqkkgtqmVar, ipoelvxyzq ipoelvxyzqVar) {
        Canvas canvas = this.f38874iobyxmoadg;
        if (!(mhtqkkgtqmVar instanceof wypolnanlu)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((wypolnanlu) mhtqkkgtqmVar).cqumvgiudr(), ipoelvxyzqVar.vdvldrhtss());
    }

    @Override // h.metgxyhuhe
    public void vdvldrhtss() {
        uwvvkdfqfp.f38971iobyxmoadg.iobyxmoadg(this.f38874iobyxmoadg, true);
    }

    @Override // h.metgxyhuhe
    public void wkgbmnqykc(float f13, float f14) {
        this.f38874iobyxmoadg.translate(f13, f14);
    }

    @Override // h.metgxyhuhe
    public void yggfygwlhe(float f13, float f14, float f15, float f16, ipoelvxyzq ipoelvxyzqVar) {
        this.f38874iobyxmoadg.drawRect(f13, f14, f15, f16, ipoelvxyzqVar.vdvldrhtss());
    }

    @Override // h.metgxyhuhe
    public void zdlpuopuiu(float f13) {
        this.f38874iobyxmoadg.rotate(f13);
    }

    @Override // h.metgxyhuhe
    public void zoijcleaow(mhtqkkgtqm mhtqkkgtqmVar, int i13) {
        Canvas canvas = this.f38874iobyxmoadg;
        if (!(mhtqkkgtqmVar instanceof wypolnanlu)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((wypolnanlu) mhtqkkgtqmVar).cqumvgiudr(), pmvmpeiblj(i13));
    }
}
