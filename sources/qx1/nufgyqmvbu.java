package qx1;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes6.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f80962iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final tzroggbefp f80963zoijcleaow;

    public nufgyqmvbu(boolean z13, tzroggbefp listName) {
        zdlpuopuiu.btonecajqb(listName, "listName");
        this.f80962iobyxmoadg = z13;
        this.f80963zoijcleaow = listName;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return this.f80962iobyxmoadg == nufgyqmvbuVar.f80962iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f80963zoijcleaow, nufgyqmvbuVar.f80963zoijcleaow);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f80962iobyxmoadg) * 31) + this.f80963zoijcleaow.hashCode();
    }

    public final tzroggbefp iobyxmoadg() {
        return this.f80963zoijcleaow;
    }

    public String toString() {
        return "Model(isLoading=" + this.f80962iobyxmoadg + ", listName=" + this.f80963zoijcleaow + ")";
    }

    public final boolean zoijcleaow() {
        return this.f80962iobyxmoadg;
    }
}
