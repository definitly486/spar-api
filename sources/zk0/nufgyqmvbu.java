package zk0;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes5.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f130299eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f130300gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f130301iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f130302lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final tzroggbefp f130303ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f130304wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f130305zoijcleaow;

    public nufgyqmvbu(boolean z13, String str, tzroggbefp cardNumber, String str2, boolean z14, boolean z15, boolean z16) {
        zdlpuopuiu.btonecajqb(cardNumber, "cardNumber");
        this.f130301iobyxmoadg = z13;
        this.f130305zoijcleaow = str;
        this.f130303ppxfxbqfkf = cardNumber;
        this.f130304wkgbmnqykc = str2;
        this.f130299eablkybsjg = z14;
        this.f130300gxszxtbevo = z15;
        this.f130302lqeggnwhkg = z16;
    }

    public final boolean eablkybsjg() {
        return this.f130302lqeggnwhkg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return this.f130301iobyxmoadg == nufgyqmvbuVar.f130301iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f130305zoijcleaow, nufgyqmvbuVar.f130305zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f130303ppxfxbqfkf, nufgyqmvbuVar.f130303ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f130304wkgbmnqykc, nufgyqmvbuVar.f130304wkgbmnqykc) && this.f130299eablkybsjg == nufgyqmvbuVar.f130299eablkybsjg && this.f130300gxszxtbevo == nufgyqmvbuVar.f130300gxszxtbevo && this.f130302lqeggnwhkg == nufgyqmvbuVar.f130302lqeggnwhkg;
    }

    public final boolean gxszxtbevo() {
        return this.f130301iobyxmoadg;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.f130301iobyxmoadg) * 31;
        String str = this.f130305zoijcleaow;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f130303ppxfxbqfkf.hashCode()) * 31;
        String str2 = this.f130304wkgbmnqykc;
        return ((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.f130299eablkybsjg)) * 31) + Boolean.hashCode(this.f130300gxszxtbevo)) * 31) + Boolean.hashCode(this.f130302lqeggnwhkg);
    }

    public final tzroggbefp iobyxmoadg() {
        return this.f130303ppxfxbqfkf;
    }

    public final boolean lqeggnwhkg() {
        return this.f130300gxszxtbevo;
    }

    public final String ppxfxbqfkf() {
        return this.f130305zoijcleaow;
    }

    public String toString() {
        return "Model(isNeedToActivateCard=" + this.f130301iobyxmoadg + ", phoneNumber=" + this.f130305zoijcleaow + ", cardNumber=" + this.f130303ppxfxbqfkf + ", conditions=" + this.f130304wkgbmnqykc + ", isAvailableConfirmButton=" + this.f130299eablkybsjg + ", isShowConfirmDialog=" + this.f130300gxszxtbevo + ", isLoading=" + this.f130302lqeggnwhkg + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f130299eablkybsjg;
    }

    public final String zoijcleaow() {
        return this.f130304wkgbmnqykc;
    }

    public /* synthetic */ nufgyqmvbu(boolean z13, String str, tzroggbefp tzroggbefpVar, String str2, boolean z14, boolean z15, boolean z16, int i13, gtknphoqwx gtknphoqwxVar) {
        this(z13, str, tzroggbefpVar, str2, z14, z15, (i13 & 64) != 0 ? false : z16);
    }
}
