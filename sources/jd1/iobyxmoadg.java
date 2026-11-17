package jd1;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f51147eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f51148iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f51149ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f51150wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wkgbmnqykc f51151zoijcleaow;

    /* JADX WARN: Code duplicated, block: B:4:0x0019  */
    public iobyxmoadg(String requestId, wkgbmnqykc vpnImage, boolean z13) {
        boolean z14;
        zdlpuopuiu.btonecajqb(requestId, "requestId");
        zdlpuopuiu.btonecajqb(vpnImage, "vpnImage");
        this.f51148iobyxmoadg = requestId;
        this.f51151zoijcleaow = vpnImage;
        this.f51149ppxfxbqfkf = z13;
        boolean z15 = true;
        if (!(vpnImage instanceof wkgbmnqykc.iobyxmoadg)) {
            if (vpnImage instanceof wkgbmnqykc.zoijcleaow) {
                z14 = ((wkgbmnqykc.zoijcleaow) vpnImage).iobyxmoadg().lqeggnwhkg() ? z14 : true;
            } else if (!(vpnImage instanceof wkgbmnqykc.ppxfxbqfkf) && !zdlpuopuiu.eablkybsjg(vpnImage, wkgbmnqykc.C1100wkgbmnqykc.f51172iobyxmoadg) && !zdlpuopuiu.eablkybsjg(vpnImage, wkgbmnqykc.eablkybsjg.f51169iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            z14 = false;
        }
        this.f51150wkgbmnqykc = z14;
        if (!(vpnImage instanceof wkgbmnqykc.iobyxmoadg) && !(vpnImage instanceof wkgbmnqykc.zoijcleaow) && !(vpnImage instanceof wkgbmnqykc.ppxfxbqfkf) && !zdlpuopuiu.eablkybsjg(vpnImage, wkgbmnqykc.C1100wkgbmnqykc.f51172iobyxmoadg)) {
            if (!zdlpuopuiu.eablkybsjg(vpnImage, wkgbmnqykc.eablkybsjg.f51169iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            z15 = false;
        }
        this.f51147eablkybsjg = z15;
    }

    public static /* synthetic */ iobyxmoadg zoijcleaow(iobyxmoadg iobyxmoadgVar, String str, wkgbmnqykc wkgbmnqykcVar, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = iobyxmoadgVar.f51148iobyxmoadg;
        }
        if ((i13 & 2) != 0) {
            wkgbmnqykcVar = iobyxmoadgVar.f51151zoijcleaow;
        }
        if ((i13 & 4) != 0) {
            z13 = iobyxmoadgVar.f51149ppxfxbqfkf;
        }
        return iobyxmoadgVar.iobyxmoadg(str, wkgbmnqykcVar, z13);
    }

    public final boolean eablkybsjg() {
        return this.f51150wkgbmnqykc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f51148iobyxmoadg, iobyxmoadgVar.f51148iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f51151zoijcleaow, iobyxmoadgVar.f51151zoijcleaow) && this.f51149ppxfxbqfkf == iobyxmoadgVar.f51149ppxfxbqfkf;
    }

    public final boolean gxszxtbevo() {
        return this.f51149ppxfxbqfkf;
    }

    public int hashCode() {
        return (((this.f51148iobyxmoadg.hashCode() * 31) + this.f51151zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f51149ppxfxbqfkf);
    }

    public final iobyxmoadg iobyxmoadg(String requestId, wkgbmnqykc vpnImage, boolean z13) {
        zdlpuopuiu.btonecajqb(requestId, "requestId");
        zdlpuopuiu.btonecajqb(vpnImage, "vpnImage");
        return new iobyxmoadg(requestId, vpnImage, z13);
    }

    public final boolean lqeggnwhkg() {
        return this.f51147eablkybsjg;
    }

    public final String ppxfxbqfkf() {
        return this.f51148iobyxmoadg;
    }

    public String toString() {
        return "MainVpnUiModel(requestId=" + this.f51148iobyxmoadg + ", vpnImage=" + this.f51151zoijcleaow + ", isLoading=" + this.f51149ppxfxbqfkf + ")";
    }

    public final wkgbmnqykc wkgbmnqykc() {
        return this.f51151zoijcleaow;
    }

    public /* synthetic */ iobyxmoadg(String str, wkgbmnqykc wkgbmnqykcVar, boolean z13, int i13, gtknphoqwx gtknphoqwxVar) {
        this(str, wkgbmnqykcVar, (i13 & 4) != 0 ? false : z13);
    }
}
