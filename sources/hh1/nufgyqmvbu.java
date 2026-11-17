package hh1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f40404iobyxmoadg;

    public nufgyqmvbu(List bannerGroups) {
        zdlpuopuiu.btonecajqb(bannerGroups, "bannerGroups");
        this.f40404iobyxmoadg = bannerGroups;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f40404iobyxmoadg, ((nufgyqmvbu) obj).f40404iobyxmoadg);
    }

    public int hashCode() {
        return this.f40404iobyxmoadg.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f40404iobyxmoadg;
    }

    public String toString() {
        return "Banners(bannerGroups=" + this.f40404iobyxmoadg + ")";
    }
}
