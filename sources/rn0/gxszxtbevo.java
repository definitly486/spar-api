package rn0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f83154iobyxmoadg;

    public gxszxtbevo(String email) {
        zdlpuopuiu.btonecajqb(email, "email");
        this.f83154iobyxmoadg = email;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gxszxtbevo) && zdlpuopuiu.eablkybsjg(this.f83154iobyxmoadg, ((gxszxtbevo) obj).f83154iobyxmoadg);
    }

    public int hashCode() {
        return this.f83154iobyxmoadg.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f83154iobyxmoadg;
    }

    public String toString() {
        return "Model(email=" + this.f83154iobyxmoadg + ")";
    }
}
