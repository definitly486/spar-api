package jp1;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* JADX INFO: loaded from: classes6.dex */
public final class cqumvgiudr {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final int f51912eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f51913gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f51914iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final co1.zoijcleaow f51915lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final boolean f51916nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f51917ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f51918wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f51919zoijcleaow;

    public cqumvgiudr(String barcode, boolean z13, boolean z14, boolean z15, int i13, boolean z16, co1.zoijcleaow scanGoCartState, boolean z17) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(barcode, "barcode");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(scanGoCartState, "scanGoCartState");
        this.f51914iobyxmoadg = barcode;
        this.f51919zoijcleaow = z13;
        this.f51917ppxfxbqfkf = z14;
        this.f51918wkgbmnqykc = z15;
        this.f51912eablkybsjg = i13;
        this.f51913gxszxtbevo = z16;
        this.f51915lqeggnwhkg = scanGoCartState;
        this.f51916nufgyqmvbu = z17;
    }

    public final boolean dxjokdxxww() {
        return this.f51913gxszxtbevo;
    }

    public final boolean eablkybsjg() {
        return this.f51917ppxfxbqfkf;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqumvgiudr)) {
            return false;
        }
        cqumvgiudr cqumvgiudrVar = (cqumvgiudr) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f51914iobyxmoadg, cqumvgiudrVar.f51914iobyxmoadg) && this.f51919zoijcleaow == cqumvgiudrVar.f51919zoijcleaow && this.f51917ppxfxbqfkf == cqumvgiudrVar.f51917ppxfxbqfkf && this.f51918wkgbmnqykc == cqumvgiudrVar.f51918wkgbmnqykc && this.f51912eablkybsjg == cqumvgiudrVar.f51912eablkybsjg && this.f51913gxszxtbevo == cqumvgiudrVar.f51913gxszxtbevo && this.f51915lqeggnwhkg == cqumvgiudrVar.f51915lqeggnwhkg && this.f51916nufgyqmvbu == cqumvgiudrVar.f51916nufgyqmvbu;
    }

    public final boolean gxszxtbevo() {
        return this.f51919zoijcleaow;
    }

    public int hashCode() {
        return (((((((((((((this.f51914iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f51919zoijcleaow)) * 31) + Boolean.hashCode(this.f51917ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f51918wkgbmnqykc)) * 31) + Integer.hashCode(this.f51912eablkybsjg)) * 31) + Boolean.hashCode(this.f51913gxszxtbevo)) * 31) + this.f51915lqeggnwhkg.hashCode()) * 31) + Boolean.hashCode(this.f51916nufgyqmvbu);
    }

    public final cqumvgiudr iobyxmoadg(String barcode, boolean z13, boolean z14, boolean z15, int i13, boolean z16, co1.zoijcleaow scanGoCartState, boolean z17) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(barcode, "barcode");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(scanGoCartState, "scanGoCartState");
        return new cqumvgiudr(barcode, z13, z14, z15, i13, z16, scanGoCartState, z17);
    }

    public final int lqeggnwhkg() {
        return this.f51912eablkybsjg;
    }

    public final co1.zoijcleaow nufgyqmvbu() {
        return this.f51915lqeggnwhkg;
    }

    public final String ppxfxbqfkf() {
        return this.f51914iobyxmoadg;
    }

    public String toString() {
        return "Model(barcode=" + this.f51914iobyxmoadg + ", flashButtonIsVisible=" + this.f51919zoijcleaow + ", flashButtonIsEnabled=" + this.f51917ppxfxbqfkf + ", enterBarcodeIsEnabled=" + this.f51918wkgbmnqykc + ", productId=" + this.f51912eablkybsjg + ", isKeyboardVisible=" + this.f51913gxszxtbevo + ", scanGoCartState=" + this.f51915lqeggnwhkg + ", isLoading=" + this.f51916nufgyqmvbu + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f51918wkgbmnqykc;
    }

    public /* synthetic */ cqumvgiudr(String str, boolean z13, boolean z14, boolean z15, int i13, boolean z16, co1.zoijcleaow zoijcleaowVar, boolean z17, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? false : z13, (i14 & 4) != 0 ? false : z14, (i14 & 8) != 0 ? false : z15, (i14 & 16) != 0 ? 0 : i13, (i14 & 32) != 0 ? false : z16, (i14 & 64) != 0 ? co1.zoijcleaow.EMPTY : zoijcleaowVar, (i14 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0 ? z17 : false);
    }
}
