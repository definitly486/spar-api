package mx;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final nufgyqmvbu f68034iobyxmoadg;

    public lqeggnwhkg(nufgyqmvbu screenStateModel) {
        zdlpuopuiu.btonecajqb(screenStateModel, "screenStateModel");
        this.f68034iobyxmoadg = screenStateModel;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f68034iobyxmoadg, ((lqeggnwhkg) obj).f68034iobyxmoadg);
    }

    public int hashCode() {
        return this.f68034iobyxmoadg.hashCode();
    }

    public final nufgyqmvbu iobyxmoadg() {
        return this.f68034iobyxmoadg;
    }

    public String toString() {
        return "Model(screenStateModel=" + this.f68034iobyxmoadg + ")";
    }
}
