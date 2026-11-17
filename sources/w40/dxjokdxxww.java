package w40;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Object f118721iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final nufgyqmvbu f118722zoijcleaow;

    public dxjokdxxww(Object obj, nufgyqmvbu state) {
        zdlpuopuiu.btonecajqb(state, "state");
        this.f118721iobyxmoadg = obj;
        this.f118722zoijcleaow = state;
    }

    public static /* synthetic */ dxjokdxxww zoijcleaow(dxjokdxxww dxjokdxxwwVar, Object obj, nufgyqmvbu nufgyqmvbuVar, int i13, Object obj2) {
        if ((i13 & 1) != 0) {
            obj = dxjokdxxwwVar.f118721iobyxmoadg;
        }
        if ((i13 & 2) != 0) {
            nufgyqmvbuVar = dxjokdxxwwVar.f118722zoijcleaow;
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
        return zdlpuopuiu.eablkybsjg(this.f118721iobyxmoadg, dxjokdxxwwVar.f118721iobyxmoadg) && this.f118722zoijcleaow == dxjokdxxwwVar.f118722zoijcleaow;
    }

    public int hashCode() {
        Object obj = this.f118721iobyxmoadg;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f118722zoijcleaow.hashCode();
    }

    public final dxjokdxxww iobyxmoadg(Object obj, nufgyqmvbu state) {
        zdlpuopuiu.btonecajqb(state, "state");
        return new dxjokdxxww(obj, state);
    }

    public final Object ppxfxbqfkf() {
        return this.f118721iobyxmoadg;
    }

    public String toString() {
        return "WithVisibility(data=" + this.f118721iobyxmoadg + ", state=" + this.f118722zoijcleaow + ")";
    }

    public final nufgyqmvbu wkgbmnqykc() {
        return this.f118722zoijcleaow;
    }

    public /* synthetic */ dxjokdxxww(Object obj, nufgyqmvbu nufgyqmvbuVar, int i13, gtknphoqwx gtknphoqwxVar) {
        this(obj, (i13 & 2) != 0 ? nufgyqmvbu.Initial : nufgyqmvbuVar);
    }
}
