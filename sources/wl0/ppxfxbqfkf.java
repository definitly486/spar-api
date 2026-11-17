package wl0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f120196iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final sl0.iobyxmoadg f120197zoijcleaow;

    public ppxfxbqfkf(List types, sl0.iobyxmoadg iobyxmoadgVar) {
        zdlpuopuiu.btonecajqb(types, "types");
        this.f120196iobyxmoadg = types;
        this.f120197zoijcleaow = iobyxmoadgVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zdlpuopuiu.eablkybsjg(this.f120196iobyxmoadg, ppxfxbqfkfVar.f120196iobyxmoadg) && this.f120197zoijcleaow == ppxfxbqfkfVar.f120197zoijcleaow;
    }

    public int hashCode() {
        int iHashCode = this.f120196iobyxmoadg.hashCode() * 31;
        sl0.iobyxmoadg iobyxmoadgVar = this.f120197zoijcleaow;
        return iHashCode + (iobyxmoadgVar == null ? 0 : iobyxmoadgVar.hashCode());
    }

    public final sl0.iobyxmoadg iobyxmoadg() {
        return this.f120197zoijcleaow;
    }

    public String toString() {
        return "AddressDetailTypesUiModel(types=" + this.f120196iobyxmoadg + ", selectedType=" + this.f120197zoijcleaow + ")";
    }

    public final List zoijcleaow() {
        return this.f120196iobyxmoadg;
    }
}
