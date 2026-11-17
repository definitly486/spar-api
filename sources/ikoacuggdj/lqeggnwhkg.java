package ikoacuggdj;

import h.mhtqkkgtqm;

/* JADX INFO: loaded from: classes.dex */
final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private h.dvvnrvtcbc f44848iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private j.iobyxmoadg f44849ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private mhtqkkgtqm f44850wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private h.metgxyhuhe f44851zoijcleaow;

    public lqeggnwhkg(h.dvvnrvtcbc dvvnrvtcbcVar, h.metgxyhuhe metgxyhuheVar, j.iobyxmoadg iobyxmoadgVar, mhtqkkgtqm mhtqkkgtqmVar) {
        this.f44848iobyxmoadg = dvvnrvtcbcVar;
        this.f44851zoijcleaow = metgxyhuheVar;
        this.f44849ppxfxbqfkf = iobyxmoadgVar;
        this.f44850wkgbmnqykc = mhtqkkgtqmVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f44848iobyxmoadg, lqeggnwhkgVar.f44848iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f44851zoijcleaow, lqeggnwhkgVar.f44851zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f44849ppxfxbqfkf, lqeggnwhkgVar.f44849ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f44850wkgbmnqykc, lqeggnwhkgVar.f44850wkgbmnqykc);
    }

    public int hashCode() {
        h.dvvnrvtcbc dvvnrvtcbcVar = this.f44848iobyxmoadg;
        int iHashCode = (dvvnrvtcbcVar == null ? 0 : dvvnrvtcbcVar.hashCode()) * 31;
        h.metgxyhuhe metgxyhuheVar = this.f44851zoijcleaow;
        int iHashCode2 = (iHashCode + (metgxyhuheVar == null ? 0 : metgxyhuheVar.hashCode())) * 31;
        j.iobyxmoadg iobyxmoadgVar = this.f44849ppxfxbqfkf;
        int iHashCode3 = (iHashCode2 + (iobyxmoadgVar == null ? 0 : iobyxmoadgVar.hashCode())) * 31;
        mhtqkkgtqm mhtqkkgtqmVar = this.f44850wkgbmnqykc;
        return iHashCode3 + (mhtqkkgtqmVar != null ? mhtqkkgtqmVar.hashCode() : 0);
    }

    public final mhtqkkgtqm lqeggnwhkg() {
        mhtqkkgtqm mhtqkkgtqmVar = this.f44850wkgbmnqykc;
        if (mhtqkkgtqmVar != null) {
            return mhtqkkgtqmVar;
        }
        mhtqkkgtqm mhtqkkgtqmVarIobyxmoadg = h.ntlheqmsrt.iobyxmoadg();
        this.f44850wkgbmnqykc = mhtqkkgtqmVarIobyxmoadg;
        return mhtqkkgtqmVarIobyxmoadg;
    }

    public String toString() {
        return "BorderCache(imageBitmap=" + this.f44848iobyxmoadg + ", canvas=" + this.f44851zoijcleaow + ", canvasDrawScope=" + this.f44849ppxfxbqfkf + ", borderPath=" + this.f44850wkgbmnqykc + ')';
    }

    public /* synthetic */ lqeggnwhkg(h.dvvnrvtcbc dvvnrvtcbcVar, h.metgxyhuhe metgxyhuheVar, j.iobyxmoadg iobyxmoadgVar, mhtqkkgtqm mhtqkkgtqmVar, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? null : dvvnrvtcbcVar, (i13 & 2) != 0 ? null : metgxyhuheVar, (i13 & 4) != 0 ? null : iobyxmoadgVar, (i13 & 8) != 0 ? null : mhtqkkgtqmVar);
    }
}
