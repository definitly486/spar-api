package f31;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Object f32720iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final nufgyqmvbu f32721zoijcleaow;

    public dxjokdxxww(Object obj, nufgyqmvbu state) {
        zdlpuopuiu.btonecajqb(state, "state");
        this.f32720iobyxmoadg = obj;
        this.f32721zoijcleaow = state;
    }

    public static /* synthetic */ dxjokdxxww zoijcleaow(dxjokdxxww dxjokdxxwwVar, Object obj, nufgyqmvbu nufgyqmvbuVar, int i13, Object obj2) {
        if ((i13 & 1) != 0) {
            obj = dxjokdxxwwVar.f32720iobyxmoadg;
        }
        if ((i13 & 2) != 0) {
            nufgyqmvbuVar = dxjokdxxwwVar.f32721zoijcleaow;
        }
        return dxjokdxxwwVar.iobyxmoadg(obj, nufgyqmvbuVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxjokdxxww)) {
            return false;
        }
        dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
        return zdlpuopuiu.eablkybsjg(this.f32720iobyxmoadg, dxjokdxxwwVar.f32720iobyxmoadg) && this.f32721zoijcleaow == dxjokdxxwwVar.f32721zoijcleaow;
    }

    public int hashCode() {
        Object obj = this.f32720iobyxmoadg;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f32721zoijcleaow.hashCode();
    }

    public final dxjokdxxww iobyxmoadg(Object obj, nufgyqmvbu state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return new dxjokdxxww(obj, state);
    }

    public final Object ppxfxbqfkf() {
        return this.f32720iobyxmoadg;
    }

    public String toString() {
        return "WithVisibility(data=" + this.f32720iobyxmoadg + ", state=" + this.f32721zoijcleaow + ")";
    }

    public final nufgyqmvbu wkgbmnqykc() {
        return this.f32721zoijcleaow;
    }

    public /* synthetic */ dxjokdxxww(Object obj, nufgyqmvbu nufgyqmvbuVar, int i13, gtknphoqwx gtknphoqwxVar) {
        this(obj, (i13 & 2) != 0 ? nufgyqmvbu.Initial : nufgyqmvbuVar);
    }
}
