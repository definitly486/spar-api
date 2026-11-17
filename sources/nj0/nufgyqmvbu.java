package nj0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f70196iobyxmoadg;

    public nufgyqmvbu(List partners) {
        zdlpuopuiu.btonecajqb(partners, "partners");
        this.f70196iobyxmoadg = partners;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f70196iobyxmoadg, ((nufgyqmvbu) obj).f70196iobyxmoadg);
    }

    public int hashCode() {
        return this.f70196iobyxmoadg.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f70196iobyxmoadg;
    }

    public String toString() {
        return "Model(partners=" + this.f70196iobyxmoadg + ")";
    }
}
