package n32;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* JADX INFO: loaded from: classes6.dex */
public final class cqumvgiudr {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final int f68524eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f68525gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f68526iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final g22.zoijcleaow f68527lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final boolean f68528nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f68529ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f68530wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f68531zoijcleaow;

    public cqumvgiudr(String barcode, boolean z13, boolean z14, boolean z15, int i13, boolean z16, g22.zoijcleaow scanGoCartState, boolean z17) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(barcode, "barcode");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(scanGoCartState, "scanGoCartState");
        this.f68526iobyxmoadg = barcode;
        this.f68531zoijcleaow = z13;
        this.f68529ppxfxbqfkf = z14;
        this.f68530wkgbmnqykc = z15;
        this.f68524eablkybsjg = i13;
        this.f68525gxszxtbevo = z16;
        this.f68527lqeggnwhkg = scanGoCartState;
        this.f68528nufgyqmvbu = z17;
    }

    public final boolean dxjokdxxww() {
        return this.f68525gxszxtbevo;
    }

    public final boolean eablkybsjg() {
        return this.f68529ppxfxbqfkf;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqumvgiudr)) {
            return false;
        }
        cqumvgiudr cqumvgiudrVar = (cqumvgiudr) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f68526iobyxmoadg, cqumvgiudrVar.f68526iobyxmoadg) && this.f68531zoijcleaow == cqumvgiudrVar.f68531zoijcleaow && this.f68529ppxfxbqfkf == cqumvgiudrVar.f68529ppxfxbqfkf && this.f68530wkgbmnqykc == cqumvgiudrVar.f68530wkgbmnqykc && this.f68524eablkybsjg == cqumvgiudrVar.f68524eablkybsjg && this.f68525gxszxtbevo == cqumvgiudrVar.f68525gxszxtbevo && this.f68527lqeggnwhkg == cqumvgiudrVar.f68527lqeggnwhkg && this.f68528nufgyqmvbu == cqumvgiudrVar.f68528nufgyqmvbu;
    }

    public final boolean gxszxtbevo() {
        return this.f68531zoijcleaow;
    }

    public int hashCode() {
        return (((((((((((((this.f68526iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f68531zoijcleaow)) * 31) + Boolean.hashCode(this.f68529ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f68530wkgbmnqykc)) * 31) + Integer.hashCode(this.f68524eablkybsjg)) * 31) + Boolean.hashCode(this.f68525gxszxtbevo)) * 31) + this.f68527lqeggnwhkg.hashCode()) * 31) + Boolean.hashCode(this.f68528nufgyqmvbu);
    }

    public final cqumvgiudr iobyxmoadg(String barcode, boolean z13, boolean z14, boolean z15, int i13, boolean z16, g22.zoijcleaow scanGoCartState, boolean z17) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(barcode, "barcode");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(scanGoCartState, "scanGoCartState");
        return new cqumvgiudr(barcode, z13, z14, z15, i13, z16, scanGoCartState, z17);
    }

    public final int lqeggnwhkg() {
        return this.f68524eablkybsjg;
    }

    public final g22.zoijcleaow nufgyqmvbu() {
        return this.f68527lqeggnwhkg;
    }

    public final String ppxfxbqfkf() {
        return this.f68526iobyxmoadg;
    }

    public String toString() {
        return "Model(barcode=" + this.f68526iobyxmoadg + ", flashButtonIsVisible=" + this.f68531zoijcleaow + ", flashButtonIsEnabled=" + this.f68529ppxfxbqfkf + ", enterBarcodeIsEnabled=" + this.f68530wkgbmnqykc + ", productId=" + this.f68524eablkybsjg + ", isKeyboardVisible=" + this.f68525gxszxtbevo + ", scanGoCartState=" + this.f68527lqeggnwhkg + ", isLoading=" + this.f68528nufgyqmvbu + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f68530wkgbmnqykc;
    }

    public /* synthetic */ cqumvgiudr(String str, boolean z13, boolean z14, boolean z15, int i13, boolean z16, g22.zoijcleaow zoijcleaowVar, boolean z17, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? false : z13, (i14 & 4) != 0 ? false : z14, (i14 & 8) != 0 ? false : z15, (i14 & 16) != 0 ? 0 : i13, (i14 & 32) != 0 ? false : z16, (i14 & 64) != 0 ? g22.zoijcleaow.EMPTY : zoijcleaowVar, (i14 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0 ? z17 : false);
    }
}
