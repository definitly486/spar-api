package db0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f27392iobyxmoadg;

    public nufgyqmvbu(String warningMessage) {
        zdlpuopuiu.btonecajqb(warningMessage, "warningMessage");
        this.f27392iobyxmoadg = warningMessage;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f27392iobyxmoadg, ((nufgyqmvbu) obj).f27392iobyxmoadg);
    }

    public int hashCode() {
        return this.f27392iobyxmoadg.hashCode();
    }

    public String toString() {
        return "Model(warningMessage=" + this.f27392iobyxmoadg + ")";
    }
}
