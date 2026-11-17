package j12;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f50538iobyxmoadg;

    public iobyxmoadg(String bankLaunchSchema) {
        zdlpuopuiu.btonecajqb(bankLaunchSchema, "bankLaunchSchema");
        this.f50538iobyxmoadg = bankLaunchSchema;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f50538iobyxmoadg, ((iobyxmoadg) obj).f50538iobyxmoadg);
    }

    public int hashCode() {
        return this.f50538iobyxmoadg.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f50538iobyxmoadg;
    }

    public String toString() {
        return "SbpSelectBankingAppResult(bankLaunchSchema=" + this.f50538iobyxmoadg + ")";
    }
}
