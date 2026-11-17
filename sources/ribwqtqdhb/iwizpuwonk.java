package ribwqtqdhb;

import hg.tzroggbefp;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class iwizpuwonk {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f82737eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final Map f82738gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final gtknphoqwx f82739iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final gxszxtbevo f82740ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final vdvldrhtss f82741wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final kcexrzcfyt f82742zoijcleaow;

    public iwizpuwonk(gtknphoqwx gtknphoqwxVar, kcexrzcfyt kcexrzcfytVar, gxszxtbevo gxszxtbevoVar, vdvldrhtss vdvldrhtssVar, boolean z13, Map map) {
        this.f82739iobyxmoadg = gtknphoqwxVar;
        this.f82742zoijcleaow = kcexrzcfytVar;
        this.f82740ppxfxbqfkf = gxszxtbevoVar;
        this.f82741wkgbmnqykc = vdvldrhtssVar;
        this.f82737eablkybsjg = z13;
        this.f82738gxszxtbevo = map;
    }

    public final vdvldrhtss eablkybsjg() {
        return this.f82741wkgbmnqykc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iwizpuwonk)) {
            return false;
        }
        iwizpuwonk iwizpuwonkVar = (iwizpuwonk) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f82739iobyxmoadg, iwizpuwonkVar.f82739iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f82742zoijcleaow, iwizpuwonkVar.f82742zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f82740ppxfxbqfkf, iwizpuwonkVar.f82740ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f82741wkgbmnqykc, iwizpuwonkVar.f82741wkgbmnqykc) && this.f82737eablkybsjg == iwizpuwonkVar.f82737eablkybsjg && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f82738gxszxtbevo, iwizpuwonkVar.f82738gxszxtbevo);
    }

    public final kcexrzcfyt gxszxtbevo() {
        return this.f82742zoijcleaow;
    }

    public int hashCode() {
        gtknphoqwx gtknphoqwxVar = this.f82739iobyxmoadg;
        int iHashCode = (gtknphoqwxVar == null ? 0 : gtknphoqwxVar.hashCode()) * 31;
        kcexrzcfyt kcexrzcfytVar = this.f82742zoijcleaow;
        int iHashCode2 = (iHashCode + (kcexrzcfytVar == null ? 0 : kcexrzcfytVar.hashCode())) * 31;
        gxszxtbevo gxszxtbevoVar = this.f82740ppxfxbqfkf;
        int iHashCode3 = (iHashCode2 + (gxszxtbevoVar == null ? 0 : gxszxtbevoVar.hashCode())) * 31;
        vdvldrhtss vdvldrhtssVar = this.f82741wkgbmnqykc;
        return ((((iHashCode3 + (vdvldrhtssVar != null ? vdvldrhtssVar.hashCode() : 0)) * 31) + Boolean.hashCode(this.f82737eablkybsjg)) * 31) + this.f82738gxszxtbevo.hashCode();
    }

    public final gxszxtbevo iobyxmoadg() {
        return this.f82740ppxfxbqfkf;
    }

    public final gtknphoqwx ppxfxbqfkf() {
        return this.f82739iobyxmoadg;
    }

    public String toString() {
        return "TransitionData(fade=" + this.f82739iobyxmoadg + ", slide=" + this.f82742zoijcleaow + ", changeSize=" + this.f82740ppxfxbqfkf + ", scale=" + this.f82741wkgbmnqykc + ", hold=" + this.f82737eablkybsjg + ", effectsMap=" + this.f82738gxszxtbevo + ')';
    }

    public final boolean wkgbmnqykc() {
        return this.f82737eablkybsjg;
    }

    public final Map zoijcleaow() {
        return this.f82738gxszxtbevo;
    }

    public /* synthetic */ iwizpuwonk(gtknphoqwx gtknphoqwxVar, kcexrzcfyt kcexrzcfytVar, gxszxtbevo gxszxtbevoVar, vdvldrhtss vdvldrhtssVar, boolean z13, Map map, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar2) {
        this((i13 & 1) != 0 ? null : gtknphoqwxVar, (i13 & 2) != 0 ? null : kcexrzcfytVar, (i13 & 4) != 0 ? null : gxszxtbevoVar, (i13 & 8) == 0 ? vdvldrhtssVar : null, (i13 & 16) != 0 ? false : z13, (i13 & 32) != 0 ? tzroggbefp.dxjokdxxww() : map);
    }
}
