package an1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f2276iobyxmoadg;

    public iobyxmoadg(String bankLaunchSchema) {
        zdlpuopuiu.btonecajqb(bankLaunchSchema, "bankLaunchSchema");
        this.f2276iobyxmoadg = bankLaunchSchema;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f2276iobyxmoadg, ((iobyxmoadg) obj).f2276iobyxmoadg);
    }

    public int hashCode() {
        return this.f2276iobyxmoadg.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f2276iobyxmoadg;
    }

    public String toString() {
        return "SbpSelectBankingAppResult(bankLaunchSchema=" + this.f2276iobyxmoadg + ")";
    }
}
