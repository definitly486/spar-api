package kp;

import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes4.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f60197eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f60198gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final tzroggbefp f60199iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f60200ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f60201wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f60202zoijcleaow;

    public nufgyqmvbu(tzroggbefp phoneNumber, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        zdlpuopuiu.btonecajqb(phoneNumber, "phoneNumber");
        this.f60199iobyxmoadg = phoneNumber;
        this.f60202zoijcleaow = z13;
        this.f60200ppxfxbqfkf = z14;
        this.f60201wkgbmnqykc = z15;
        this.f60197eablkybsjg = z16;
        this.f60198gxszxtbevo = z17;
    }

    public final boolean eablkybsjg() {
        return this.f60200ppxfxbqfkf;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return zdlpuopuiu.eablkybsjg(this.f60199iobyxmoadg, nufgyqmvbuVar.f60199iobyxmoadg) && this.f60202zoijcleaow == nufgyqmvbuVar.f60202zoijcleaow && this.f60200ppxfxbqfkf == nufgyqmvbuVar.f60200ppxfxbqfkf && this.f60201wkgbmnqykc == nufgyqmvbuVar.f60201wkgbmnqykc && this.f60197eablkybsjg == nufgyqmvbuVar.f60197eablkybsjg && this.f60198gxszxtbevo == nufgyqmvbuVar.f60198gxszxtbevo;
    }

    public final boolean gxszxtbevo() {
        return this.f60198gxszxtbevo;
    }

    public int hashCode() {
        return (((((((((this.f60199iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f60202zoijcleaow)) * 31) + Boolean.hashCode(this.f60200ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f60201wkgbmnqykc)) * 31) + Boolean.hashCode(this.f60197eablkybsjg)) * 31) + Boolean.hashCode(this.f60198gxszxtbevo);
    }

    public final boolean iobyxmoadg() {
        return this.f60201wkgbmnqykc;
    }

    public final boolean ppxfxbqfkf() {
        return this.f60202zoijcleaow;
    }

    public String toString() {
        return "Model(phoneNumber=" + this.f60199iobyxmoadg + ", phoneNumberErrorIsVisible=" + this.f60202zoijcleaow + ", isAgreementChecked=" + this.f60200ppxfxbqfkf + ", agreementErrorIsVisible=" + this.f60201wkgbmnqykc + ", showAuthErrorDialog=" + this.f60197eablkybsjg + ", isLoading=" + this.f60198gxszxtbevo + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f60197eablkybsjg;
    }

    public final tzroggbefp zoijcleaow() {
        return this.f60199iobyxmoadg;
    }
}
