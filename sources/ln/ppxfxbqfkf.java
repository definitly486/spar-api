package ln;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f63661iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final hn.iobyxmoadg f63662zoijcleaow;

    public ppxfxbqfkf(List types, hn.iobyxmoadg iobyxmoadgVar) {
        zdlpuopuiu.btonecajqb(types, "types");
        this.f63661iobyxmoadg = types;
        this.f63662zoijcleaow = iobyxmoadgVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f63661iobyxmoadg, ppxfxbqfkfVar.f63661iobyxmoadg) && this.f63662zoijcleaow == ppxfxbqfkfVar.f63662zoijcleaow;
    }

    public int hashCode() {
        int iHashCode = this.f63661iobyxmoadg.hashCode() * 31;
        hn.iobyxmoadg iobyxmoadgVar = this.f63662zoijcleaow;
        return iHashCode + (iobyxmoadgVar == null ? 0 : iobyxmoadgVar.hashCode());
    }

    public final hn.iobyxmoadg iobyxmoadg() {
        return this.f63662zoijcleaow;
    }

    public String toString() {
        return "AddressDetailTypesUiModel(types=" + this.f63661iobyxmoadg + ", selectedType=" + this.f63662zoijcleaow + ")";
    }

    public final List zoijcleaow() {
        return this.f63661iobyxmoadg;
    }
}
