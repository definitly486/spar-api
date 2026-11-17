package j;

import h.g;
import h.h;
import h.ixidwrxhsl;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public final class gtknphoqwx extends lqeggnwhkg {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final iobyxmoadg f50095gxszxtbevo = new iobyxmoadg(null);

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final int f50096lqeggnwhkg = g.f38891iobyxmoadg.iobyxmoadg();

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final int f50097nufgyqmvbu = h.f38898iobyxmoadg.zoijcleaow();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final ixidwrxhsl f50098eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float f50099iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f50100ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f50101wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final float f50102zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final int iobyxmoadg() {
            return gtknphoqwx.f50096lqeggnwhkg;
        }

        private iobyxmoadg() {
        }
    }

    public /* synthetic */ gtknphoqwx(float f13, float f14, int i13, int i14, ixidwrxhsl ixidwrxhslVar, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(f13, f14, i13, i14, ixidwrxhslVar);
    }

    public final ixidwrxhsl eablkybsjg() {
        return this.f50098eablkybsjg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gtknphoqwx)) {
            return false;
        }
        gtknphoqwx gtknphoqwxVar = (gtknphoqwx) obj;
        return this.f50099iobyxmoadg == gtknphoqwxVar.f50099iobyxmoadg && this.f50102zoijcleaow == gtknphoqwxVar.f50102zoijcleaow && g.eablkybsjg(this.f50100ppxfxbqfkf, gtknphoqwxVar.f50100ppxfxbqfkf) && h.eablkybsjg(this.f50101wkgbmnqykc, gtknphoqwxVar.f50101wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f50098eablkybsjg, gtknphoqwxVar.f50098eablkybsjg);
    }

    public final float gxszxtbevo() {
        return this.f50099iobyxmoadg;
    }

    public int hashCode() {
        int iHashCode = ((((((Float.hashCode(this.f50099iobyxmoadg) * 31) + Float.hashCode(this.f50102zoijcleaow)) * 31) + g.gxszxtbevo(this.f50100ppxfxbqfkf)) * 31) + h.gxszxtbevo(this.f50101wkgbmnqykc)) * 31;
        ixidwrxhsl ixidwrxhslVar = this.f50098eablkybsjg;
        return iHashCode + (ixidwrxhslVar != null ? ixidwrxhslVar.hashCode() : 0);
    }

    public final int ppxfxbqfkf() {
        return this.f50101wkgbmnqykc;
    }

    public String toString() {
        return "Stroke(width=" + this.f50099iobyxmoadg + ", miter=" + this.f50102zoijcleaow + ", cap=" + ((Object) g.lqeggnwhkg(this.f50100ppxfxbqfkf)) + ", join=" + ((Object) h.lqeggnwhkg(this.f50101wkgbmnqykc)) + ", pathEffect=" + this.f50098eablkybsjg + ')';
    }

    public final float wkgbmnqykc() {
        return this.f50102zoijcleaow;
    }

    public final int zoijcleaow() {
        return this.f50100ppxfxbqfkf;
    }

    public /* synthetic */ gtknphoqwx(float f13, float f14, int i13, int i14, ixidwrxhsl ixidwrxhslVar, int i15, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i15 & 1) != 0 ? 0.0f : f13, (i15 & 2) != 0 ? 4.0f : f14, (i15 & 4) != 0 ? f50096lqeggnwhkg : i13, (i15 & 8) != 0 ? f50097nufgyqmvbu : i14, (i15 & 16) != 0 ? null : ixidwrxhslVar, null);
    }

    private gtknphoqwx(float f13, float f14, int i13, int i14, ixidwrxhsl ixidwrxhslVar) {
        super(null);
        this.f50099iobyxmoadg = f13;
        this.f50102zoijcleaow = f14;
        this.f50100ppxfxbqfkf = i13;
        this.f50101wkgbmnqykc = i14;
        this.f50098eablkybsjg = ixidwrxhslVar;
    }
}
