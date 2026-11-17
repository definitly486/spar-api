package og1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f72837iobyxmoadg;

    public nufgyqmvbu(List partners) {
        zdlpuopuiu.btonecajqb(partners, "partners");
        this.f72837iobyxmoadg = partners;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f72837iobyxmoadg, ((nufgyqmvbu) obj).f72837iobyxmoadg);
    }

    public int hashCode() {
        return this.f72837iobyxmoadg.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f72837iobyxmoadg;
    }

    public String toString() {
        return "Model(partners=" + this.f72837iobyxmoadg + ")";
    }
}
