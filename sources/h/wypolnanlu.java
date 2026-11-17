package h;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class wypolnanlu implements mhtqkkgtqm {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private Matrix f38981eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private RectF f38982ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private float[] f38983wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Path f38984zoijcleaow;

    public wypolnanlu(Path path) {
        this.f38984zoijcleaow = path;
    }

    private final void esjtqupxsv(g.lqeggnwhkg lqeggnwhkgVar) {
        if (Float.isNaN(lqeggnwhkgVar.nufgyqmvbu()) || Float.isNaN(lqeggnwhkgVar.gtknphoqwx()) || Float.isNaN(lqeggnwhkgVar.dxjokdxxww()) || Float.isNaN(lqeggnwhkgVar.eablkybsjg())) {
            ntlheqmsrt.wkgbmnqykc("Invalid rectangle, make sure no value is NaN");
        }
    }

    @Override // h.mhtqkkgtqm
    public void agtfadlqog(long j13) {
        Matrix matrix = this.f38981eablkybsjg;
        if (matrix == null) {
            this.f38981eablkybsjg = new Matrix();
        } else {
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(matrix);
            matrix.reset();
        }
        Matrix matrix2 = this.f38981eablkybsjg;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(matrix2);
        matrix2.setTranslate(Float.intBitsToFloat((int) (j13 >> 32)), Float.intBitsToFloat((int) (j13 & 4294967295L)));
        Path path = this.f38984zoijcleaow;
        Matrix matrix3 = this.f38981eablkybsjg;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(matrix3);
        path.transform(matrix3);
    }

    @Override // h.mhtqkkgtqm
    public void btonecajqb(float f13, float f14, float f15, float f16, float f17, float f18) {
        this.f38984zoijcleaow.rCubicTo(f13, f14, f15, f16, f17, f18);
    }

    @Override // h.mhtqkkgtqm
    public void close() {
        this.f38984zoijcleaow.close();
    }

    public final Path cqumvgiudr() {
        return this.f38984zoijcleaow;
    }

    @Override // h.mhtqkkgtqm
    public void draadjrbmk(float f13, float f14, float f15, float f16) {
        this.f38984zoijcleaow.quadTo(f13, f14, f15, f16);
    }

    @Override // h.mhtqkkgtqm
    public void dxjokdxxww(g.lqeggnwhkg lqeggnwhkgVar, float f13, float f14, boolean z13) {
        float fNufgyqmvbu = lqeggnwhkgVar.nufgyqmvbu();
        float fGtknphoqwx = lqeggnwhkgVar.gtknphoqwx();
        float fDxjokdxxww = lqeggnwhkgVar.dxjokdxxww();
        float fEablkybsjg = lqeggnwhkgVar.eablkybsjg();
        if (this.f38982ppxfxbqfkf == null) {
            this.f38982ppxfxbqfkf = new RectF();
        }
        RectF rectF = this.f38982ppxfxbqfkf;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(rectF);
        rectF.set(fNufgyqmvbu, fGtknphoqwx, fDxjokdxxww, fEablkybsjg);
        Path path = this.f38984zoijcleaow;
        RectF rectF2 = this.f38982ppxfxbqfkf;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(rectF2);
        path.arcTo(rectF2, f13, f14, z13);
    }

    @Override // h.mhtqkkgtqm
    public g.lqeggnwhkg getBounds() {
        if (this.f38982ppxfxbqfkf == null) {
            this.f38982ppxfxbqfkf = new RectF();
        }
        RectF rectF = this.f38982ppxfxbqfkf;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(rectF);
        this.f38984zoijcleaow.computeBounds(rectF, true);
        return new g.lqeggnwhkg(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // h.mhtqkkgtqm
    public void gtknphoqwx(int i13) {
        this.f38984zoijcleaow.setFillType(jrbgnlbqoe.wkgbmnqykc(i13, jrbgnlbqoe.f38915iobyxmoadg.iobyxmoadg()) ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    @Override // h.mhtqkkgtqm
    public boolean gxszxtbevo() {
        return this.f38984zoijcleaow.isConvex();
    }

    @Override // h.mhtqkkgtqm
    public void iobyxmoadg(float f13, float f14) {
        this.f38984zoijcleaow.moveTo(f13, f14);
    }

    @Override // h.mhtqkkgtqm
    public boolean isEmpty() {
        return this.f38984zoijcleaow.isEmpty();
    }

    @Override // h.mhtqkkgtqm
    public void iwizpuwonk(float f13, float f14) {
        this.f38984zoijcleaow.rLineTo(f13, f14);
    }

    @Override // h.mhtqkkgtqm
    public void jyumaefscl(g.lqeggnwhkg lqeggnwhkgVar, mhtqkkgtqm.zoijcleaow zoijcleaowVar) {
        esjtqupxsv(lqeggnwhkgVar);
        if (this.f38982ppxfxbqfkf == null) {
            this.f38982ppxfxbqfkf = new RectF();
        }
        RectF rectF = this.f38982ppxfxbqfkf;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(rectF);
        rectF.set(lqeggnwhkgVar.nufgyqmvbu(), lqeggnwhkgVar.gtknphoqwx(), lqeggnwhkgVar.dxjokdxxww(), lqeggnwhkgVar.eablkybsjg());
        Path path = this.f38984zoijcleaow;
        RectF rectF2 = this.f38982ppxfxbqfkf;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(rectF2);
        path.addRect(rectF2, ntlheqmsrt.eablkybsjg(zoijcleaowVar));
    }

    @Override // h.mhtqkkgtqm
    public int kcexrzcfyt() {
        return this.f38984zoijcleaow.getFillType() == Path.FillType.EVEN_ODD ? jrbgnlbqoe.f38915iobyxmoadg.iobyxmoadg() : jrbgnlbqoe.f38915iobyxmoadg.zoijcleaow();
    }

    @Override // h.mhtqkkgtqm
    public void lqeggnwhkg(g.lqeggnwhkg lqeggnwhkgVar, float f13, float f14) {
        esjtqupxsv(lqeggnwhkgVar);
        if (this.f38982ppxfxbqfkf == null) {
            this.f38982ppxfxbqfkf = new RectF();
        }
        RectF rectF = this.f38982ppxfxbqfkf;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(rectF);
        rectF.set(lqeggnwhkgVar.nufgyqmvbu(), lqeggnwhkgVar.gtknphoqwx(), lqeggnwhkgVar.dxjokdxxww(), lqeggnwhkgVar.eablkybsjg());
        Path path = this.f38984zoijcleaow;
        RectF rectF2 = this.f38982ppxfxbqfkf;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(rectF2);
        path.addArc(rectF2, f13, f14);
    }

    @Override // h.mhtqkkgtqm
    public void nufgyqmvbu(float f13, float f14) {
        this.f38984zoijcleaow.rMoveTo(f13, f14);
    }

    @Override // h.mhtqkkgtqm
    public void ojitshcjhn(float f13, float f14, float f15, float f16) {
        this.f38984zoijcleaow.rQuadTo(f13, f14, f15, f16);
    }

    @Override // h.mhtqkkgtqm
    public void oxmwwwfdhm(mhtqkkgtqm mhtqkkgtqmVar, long j13) {
        Path path = this.f38984zoijcleaow;
        if (!(mhtqkkgtqmVar instanceof wypolnanlu)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        path.addPath(((wypolnanlu) mhtqkkgtqmVar).cqumvgiudr(), Float.intBitsToFloat((int) (j13 >> 32)), Float.intBitsToFloat((int) (j13 & 4294967295L)));
    }

    @Override // h.mhtqkkgtqm
    public void ppxfxbqfkf(float f13, float f14, float f15, float f16, float f17, float f18) {
        this.f38984zoijcleaow.cubicTo(f13, f14, f15, f16, f17, f18);
    }

    @Override // h.mhtqkkgtqm
    public void vdvldrhtss(g.dxjokdxxww dxjokdxxwwVar, mhtqkkgtqm.zoijcleaow zoijcleaowVar) {
        if (this.f38982ppxfxbqfkf == null) {
            this.f38982ppxfxbqfkf = new RectF();
        }
        RectF rectF = this.f38982ppxfxbqfkf;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(rectF);
        rectF.set(dxjokdxxwwVar.eablkybsjg(), dxjokdxxwwVar.lqeggnwhkg(), dxjokdxxwwVar.gxszxtbevo(), dxjokdxxwwVar.iobyxmoadg());
        if (this.f38983wkgbmnqykc == null) {
            this.f38983wkgbmnqykc = new float[8];
        }
        float[] fArr = this.f38983wkgbmnqykc;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(fArr);
        fArr[0] = Float.intBitsToFloat((int) (dxjokdxxwwVar.nufgyqmvbu() >> 32));
        fArr[1] = Float.intBitsToFloat((int) (dxjokdxxwwVar.nufgyqmvbu() & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (dxjokdxxwwVar.dxjokdxxww() >> 32));
        fArr[3] = Float.intBitsToFloat((int) (dxjokdxxwwVar.dxjokdxxww() & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (dxjokdxxwwVar.ppxfxbqfkf() >> 32));
        fArr[5] = Float.intBitsToFloat((int) (dxjokdxxwwVar.ppxfxbqfkf() & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (dxjokdxxwwVar.zoijcleaow() >> 32));
        fArr[7] = Float.intBitsToFloat((int) (dxjokdxxwwVar.zoijcleaow() & 4294967295L));
        Path path = this.f38984zoijcleaow;
        RectF rectF2 = this.f38982ppxfxbqfkf;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(rectF2);
        float[] fArr2 = this.f38983wkgbmnqykc;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(fArr2);
        path.addRoundRect(rectF2, fArr2, ntlheqmsrt.eablkybsjg(zoijcleaowVar));
    }

    @Override // h.mhtqkkgtqm
    public void wflxmlrfwp() {
        this.f38984zoijcleaow.rewind();
    }

    @Override // h.mhtqkkgtqm
    public void wkgbmnqykc(float f13, float f14) {
        this.f38984zoijcleaow.lineTo(f13, f14);
    }

    @Override // h.mhtqkkgtqm
    public boolean yggfygwlhe(mhtqkkgtqm mhtqkkgtqmVar, mhtqkkgtqm mhtqkkgtqmVar2, int i13) {
        Path.Op op2;
        ezmngbhpjk.iobyxmoadg iobyxmoadgVar = ezmngbhpjk.f38886iobyxmoadg;
        if (ezmngbhpjk.gxszxtbevo(i13, iobyxmoadgVar.iobyxmoadg())) {
            op2 = Path.Op.DIFFERENCE;
        } else if (ezmngbhpjk.gxszxtbevo(i13, iobyxmoadgVar.zoijcleaow())) {
            op2 = Path.Op.INTERSECT;
        } else if (ezmngbhpjk.gxszxtbevo(i13, iobyxmoadgVar.ppxfxbqfkf())) {
            op2 = Path.Op.REVERSE_DIFFERENCE;
        } else {
            op2 = ezmngbhpjk.gxszxtbevo(i13, iobyxmoadgVar.wkgbmnqykc()) ? Path.Op.UNION : Path.Op.XOR;
        }
        Path path = this.f38984zoijcleaow;
        if (!(mhtqkkgtqmVar instanceof wypolnanlu)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path pathCqumvgiudr = ((wypolnanlu) mhtqkkgtqmVar).cqumvgiudr();
        if (mhtqkkgtqmVar2 instanceof wypolnanlu) {
            return path.op(pathCqumvgiudr, ((wypolnanlu) mhtqkkgtqmVar2).cqumvgiudr(), op2);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // h.mhtqkkgtqm
    public void zoijcleaow() {
        this.f38984zoijcleaow.reset();
    }

    public /* synthetic */ wypolnanlu(Path path, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? new Path() : path);
    }
}
