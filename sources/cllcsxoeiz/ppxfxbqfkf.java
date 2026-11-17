package cllcsxoeiz;

import android.opengl.EGLSurface;

/* JADX INFO: loaded from: classes.dex */
final class ppxfxbqfkf extends lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final EGLSurface f20026iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f20027ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f20028zoijcleaow;

    ppxfxbqfkf(EGLSurface eGLSurface, int i13, int i14) {
        if (eGLSurface == null) {
            throw new NullPointerException("Null eglSurface");
        }
        this.f20026iobyxmoadg = eGLSurface;
        this.f20028zoijcleaow = i13;
        this.f20027ppxfxbqfkf = i14;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return this.f20026iobyxmoadg.equals(lqeggnwhkgVar.iobyxmoadg()) && this.f20028zoijcleaow == lqeggnwhkgVar.ppxfxbqfkf() && this.f20027ppxfxbqfkf == lqeggnwhkgVar.zoijcleaow();
    }

    public int hashCode() {
        return ((((this.f20026iobyxmoadg.hashCode() ^ 1000003) * 1000003) ^ this.f20028zoijcleaow) * 1000003) ^ this.f20027ppxfxbqfkf;
    }

    @Override // cllcsxoeiz.lqeggnwhkg
    public EGLSurface iobyxmoadg() {
        return this.f20026iobyxmoadg;
    }

    @Override // cllcsxoeiz.lqeggnwhkg
    public int ppxfxbqfkf() {
        return this.f20028zoijcleaow;
    }

    public String toString() {
        return "OutputSurface{eglSurface=" + this.f20026iobyxmoadg + ", width=" + this.f20028zoijcleaow + ", height=" + this.f20027ppxfxbqfkf + "}";
    }

    @Override // cllcsxoeiz.lqeggnwhkg
    public int zoijcleaow() {
        return this.f20027ppxfxbqfkf;
    }
}
