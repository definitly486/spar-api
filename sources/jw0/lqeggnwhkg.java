package jw0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final nufgyqmvbu f52463iobyxmoadg;

    public lqeggnwhkg(nufgyqmvbu screenStateModel) {
        zdlpuopuiu.btonecajqb(screenStateModel, "screenStateModel");
        this.f52463iobyxmoadg = screenStateModel;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f52463iobyxmoadg, ((lqeggnwhkg) obj).f52463iobyxmoadg);
    }

    public int hashCode() {
        return this.f52463iobyxmoadg.hashCode();
    }

    public final nufgyqmvbu iobyxmoadg() {
        return this.f52463iobyxmoadg;
    }

    public String toString() {
        return "Model(screenStateModel=" + this.f52463iobyxmoadg + ")";
    }
}
