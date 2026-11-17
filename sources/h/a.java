package h;

import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends jztzpxfvev {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private float[] f38862eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private m f38863ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private long f38864wkgbmnqykc;

    public a() {
        super(null);
        this.f38864wkgbmnqykc = g.gtknphoqwx.f35588zoijcleaow.iobyxmoadg();
    }

    private final m ppxfxbqfkf() {
        m mVar = this.f38863ppxfxbqfkf;
        if (mVar != null) {
            return mVar;
        }
        m mVar2 = new m();
        this.f38863ppxfxbqfkf = mVar2;
        return mVar2;
    }

    @Override // h.jztzpxfvev
    public final void iobyxmoadg(long j13, ipoelvxyzq ipoelvxyzqVar, float f13) {
        m mVarPpxfxbqfkf = this.f38863ppxfxbqfkf;
        if (mVarPpxfxbqfkf == null || !g.gtknphoqwx.nufgyqmvbu(this.f38864wkgbmnqykc, j13)) {
            if (g.gtknphoqwx.wflxmlrfwp(j13)) {
                this.f38863ppxfxbqfkf = null;
                this.f38864wkgbmnqykc = g.gtknphoqwx.f35588zoijcleaow.iobyxmoadg();
                mVarPpxfxbqfkf = null;
            } else {
                mVarPpxfxbqfkf = ppxfxbqfkf();
                float[] fArr = this.f38862eablkybsjg;
                if (fArr != null) {
                    mVarPpxfxbqfkf.wkgbmnqykc(fArr);
                }
                mVarPpxfxbqfkf.ppxfxbqfkf(zoijcleaow(j13));
                this.f38863ppxfxbqfkf = mVarPpxfxbqfkf;
                this.f38864wkgbmnqykc = j13;
            }
        }
        long jZoijcleaow = ipoelvxyzqVar.zoijcleaow();
        oipsdeybqn.iobyxmoadg iobyxmoadgVar = oipsdeybqn.f38945zoijcleaow;
        if (!oipsdeybqn.ojitshcjhn(jZoijcleaow, iobyxmoadgVar.iobyxmoadg())) {
            ipoelvxyzqVar.wflxmlrfwp(iobyxmoadgVar.iobyxmoadg());
        }
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ipoelvxyzqVar.kcexrzcfyt(), mVarPpxfxbqfkf != null ? mVarPpxfxbqfkf.iobyxmoadg() : null)) {
            ipoelvxyzqVar.oxmwwwfdhm(mVarPpxfxbqfkf != null ? mVarPpxfxbqfkf.iobyxmoadg() : null);
        }
        if (ipoelvxyzqVar.iobyxmoadg() == f13) {
            return;
        }
        ipoelvxyzqVar.eablkybsjg(f13);
    }

    public abstract Shader zoijcleaow(long j13);
}
