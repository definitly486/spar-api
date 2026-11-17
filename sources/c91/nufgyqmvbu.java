package c91;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f19362iobyxmoadg;

    public nufgyqmvbu(String warningMessage) {
        zdlpuopuiu.btonecajqb(warningMessage, "warningMessage");
        this.f19362iobyxmoadg = warningMessage;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f19362iobyxmoadg, ((nufgyqmvbu) obj).f19362iobyxmoadg);
    }

    public int hashCode() {
        return this.f19362iobyxmoadg.hashCode();
    }

    public String toString() {
        return "Model(warningMessage=" + this.f19362iobyxmoadg + ")";
    }
}
