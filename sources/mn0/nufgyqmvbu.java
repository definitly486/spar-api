package mn0;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes5.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final tzroggbefp f67643iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f67644ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f67645zoijcleaow;

    public nufgyqmvbu(tzroggbefp phoneNumber, boolean z13, boolean z14) {
        zdlpuopuiu.btonecajqb(phoneNumber, "phoneNumber");
        this.f67643iobyxmoadg = phoneNumber;
        this.f67645zoijcleaow = z13;
        this.f67644ppxfxbqfkf = z14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return zdlpuopuiu.eablkybsjg(this.f67643iobyxmoadg, nufgyqmvbuVar.f67643iobyxmoadg) && this.f67645zoijcleaow == nufgyqmvbuVar.f67645zoijcleaow && this.f67644ppxfxbqfkf == nufgyqmvbuVar.f67644ppxfxbqfkf;
    }

    public int hashCode() {
        return (((this.f67643iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f67645zoijcleaow)) * 31) + Boolean.hashCode(this.f67644ppxfxbqfkf);
    }

    public final tzroggbefp iobyxmoadg() {
        return this.f67643iobyxmoadg;
    }

    public final boolean ppxfxbqfkf() {
        return this.f67644ppxfxbqfkf;
    }

    public String toString() {
        return "Model(phoneNumber=" + this.f67643iobyxmoadg + ", isContinueButtonEnabled=" + this.f67645zoijcleaow + ", isLoading=" + this.f67644ppxfxbqfkf + ")";
    }

    public final boolean zoijcleaow() {
        return this.f67645zoijcleaow;
    }
}
