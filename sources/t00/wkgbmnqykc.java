package t00;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f109239iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Boolean f109240ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f109241wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f109242zoijcleaow;

    public wkgbmnqykc(String id2, boolean z13, Boolean bool, String str) {
        zdlpuopuiu.btonecajqb(id2, "id");
        this.f109239iobyxmoadg = id2;
        this.f109242zoijcleaow = z13;
        this.f109240ppxfxbqfkf = bool;
        this.f109241wkgbmnqykc = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return zdlpuopuiu.eablkybsjg(this.f109239iobyxmoadg, wkgbmnqykcVar.f109239iobyxmoadg) && this.f109242zoijcleaow == wkgbmnqykcVar.f109242zoijcleaow && zdlpuopuiu.eablkybsjg(this.f109240ppxfxbqfkf, wkgbmnqykcVar.f109240ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f109241wkgbmnqykc, wkgbmnqykcVar.f109241wkgbmnqykc);
    }

    public int hashCode() {
        int iHashCode = ((this.f109239iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f109242zoijcleaow)) * 31;
        Boolean bool = this.f109240ppxfxbqfkf;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f109241wkgbmnqykc;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String iobyxmoadg() {
        return this.f109239iobyxmoadg;
    }

    public String toString() {
        return "BasketOrderModel(id=" + this.f109239iobyxmoadg + ", isNeedPassport=" + this.f109242zoijcleaow + ", isWalletPayNeedVerify=" + this.f109240ppxfxbqfkf + ", infoText=" + this.f109241wkgbmnqykc + ")";
    }
}
