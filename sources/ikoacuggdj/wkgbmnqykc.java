package ikoacuggdj;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class wkgbmnqykc implements metgxyhuhe {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f44946iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final long f44947ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final czzsidtyhn.ydmasvzmpa f44948wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final w0.wkgbmnqykc f44949zoijcleaow;

    public /* synthetic */ wkgbmnqykc(Context context, w0.wkgbmnqykc wkgbmnqykcVar, long j13, czzsidtyhn.ydmasvzmpa ydmasvzmpaVar, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(context, wkgbmnqykcVar, j13, ydmasvzmpaVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykc.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type androidx.compose.foundation.AndroidEdgeEffectOverscrollFactory");
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f44946iobyxmoadg, wkgbmnqykcVar.f44946iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f44949zoijcleaow, wkgbmnqykcVar.f44949zoijcleaow) && h.oipsdeybqn.ojitshcjhn(this.f44947ppxfxbqfkf, wkgbmnqykcVar.f44947ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f44948wkgbmnqykc, wkgbmnqykcVar.f44948wkgbmnqykc);
    }

    public int hashCode() {
        return (((((this.f44946iobyxmoadg.hashCode() * 31) + this.f44949zoijcleaow.hashCode()) * 31) + h.oipsdeybqn.yggfygwlhe(this.f44947ppxfxbqfkf)) * 31) + this.f44948wkgbmnqykc.hashCode();
    }

    @Override // ikoacuggdj.metgxyhuhe
    public xrmfcynszj iobyxmoadg() {
        return new ppxfxbqfkf(this.f44946iobyxmoadg, this.f44949zoijcleaow, this.f44947ppxfxbqfkf, this.f44948wkgbmnqykc, null);
    }

    private wkgbmnqykc(Context context, w0.wkgbmnqykc wkgbmnqykcVar, long j13, czzsidtyhn.ydmasvzmpa ydmasvzmpaVar) {
        this.f44946iobyxmoadg = context;
        this.f44949zoijcleaow = wkgbmnqykcVar;
        this.f44947ppxfxbqfkf = j13;
        this.f44948wkgbmnqykc = ydmasvzmpaVar;
    }
}
