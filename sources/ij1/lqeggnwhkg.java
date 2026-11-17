package ij1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final gk1.iobyxmoadg f44587iobyxmoadg;

    public lqeggnwhkg(gk1.iobyxmoadg section) {
        zdlpuopuiu.btonecajqb(section, "section");
        this.f44587iobyxmoadg = section;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lqeggnwhkg) && this.f44587iobyxmoadg == ((lqeggnwhkg) obj).f44587iobyxmoadg;
    }

    public int hashCode() {
        return this.f44587iobyxmoadg.hashCode();
    }

    public final gk1.iobyxmoadg iobyxmoadg() {
        return this.f44587iobyxmoadg;
    }

    public String toString() {
        return "Model(section=" + this.f44587iobyxmoadg + ")";
    }
}
