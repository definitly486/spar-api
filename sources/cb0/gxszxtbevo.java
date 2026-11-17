package cb0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f19517iobyxmoadg;

    public gxszxtbevo(String email) {
        zdlpuopuiu.btonecajqb(email, "email");
        this.f19517iobyxmoadg = email;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f19517iobyxmoadg, ((gxszxtbevo) obj).f19517iobyxmoadg);
    }

    public int hashCode() {
        return this.f19517iobyxmoadg.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f19517iobyxmoadg;
    }

    public String toString() {
        return "Model(email=" + this.f19517iobyxmoadg + ")";
    }
}
