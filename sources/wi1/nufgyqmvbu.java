package wi1;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes6.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f119913iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final tzroggbefp f119914zoijcleaow;

    public nufgyqmvbu(boolean z13, tzroggbefp listName) {
        zdlpuopuiu.btonecajqb(listName, "listName");
        this.f119913iobyxmoadg = z13;
        this.f119914zoijcleaow = listName;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return this.f119913iobyxmoadg == nufgyqmvbuVar.f119913iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f119914zoijcleaow, nufgyqmvbuVar.f119914zoijcleaow);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f119913iobyxmoadg) * 31) + this.f119914zoijcleaow.hashCode();
    }

    public final tzroggbefp iobyxmoadg() {
        return this.f119914zoijcleaow;
    }

    public String toString() {
        return "Model(isLoading=" + this.f119913iobyxmoadg + ", listName=" + this.f119914zoijcleaow + ")";
    }

    public final boolean zoijcleaow() {
        return this.f119913iobyxmoadg;
    }
}
