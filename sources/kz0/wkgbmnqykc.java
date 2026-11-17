package kz0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f61179iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Boolean f61180ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f61181wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f61182zoijcleaow;

    public wkgbmnqykc(String id2, boolean z13, Boolean bool, String str) {
        zdlpuopuiu.btonecajqb(id2, "id");
        this.f61179iobyxmoadg = id2;
        this.f61182zoijcleaow = z13;
        this.f61180ppxfxbqfkf = bool;
        this.f61181wkgbmnqykc = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return zdlpuopuiu.eablkybsjg(this.f61179iobyxmoadg, wkgbmnqykcVar.f61179iobyxmoadg) && this.f61182zoijcleaow == wkgbmnqykcVar.f61182zoijcleaow && zdlpuopuiu.eablkybsjg(this.f61180ppxfxbqfkf, wkgbmnqykcVar.f61180ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f61181wkgbmnqykc, wkgbmnqykcVar.f61181wkgbmnqykc);
    }

    public int hashCode() {
        int iHashCode = ((this.f61179iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f61182zoijcleaow)) * 31;
        Boolean bool = this.f61180ppxfxbqfkf;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f61181wkgbmnqykc;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String iobyxmoadg() {
        return this.f61179iobyxmoadg;
    }

    public String toString() {
        return "BasketOrderModel(id=" + this.f61179iobyxmoadg + ", isNeedPassport=" + this.f61182zoijcleaow + ", isWalletPayNeedVerify=" + this.f61180ppxfxbqfkf + ", infoText=" + this.f61181wkgbmnqykc + ")";
    }
}
