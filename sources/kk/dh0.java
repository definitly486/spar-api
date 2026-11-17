package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class dh0 {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public String f56290eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public String f56291gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public Boolean f56292iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public String f56293ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public String f56294wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public String f56295zoijcleaow;

    public dh0(Boolean bool, String str, String str2, String str3, int i13) {
        bool = (i13 & 1) != 0 ? null : bool;
        str = (i13 & 2) != 0 ? null : str;
        str2 = (i13 & 4) != 0 ? null : str2;
        str3 = (i13 & 8) != 0 ? null : str3;
        this.f56292iobyxmoadg = bool;
        this.f56295zoijcleaow = str;
        this.f56293ppxfxbqfkf = str2;
        this.f56294wkgbmnqykc = str3;
        this.f56290eablkybsjg = null;
        this.f56291gxszxtbevo = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dh0)) {
            return false;
        }
        dh0 dh0Var = (dh0) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56292iobyxmoadg, dh0Var.f56292iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56295zoijcleaow, dh0Var.f56295zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56293ppxfxbqfkf, dh0Var.f56293ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56294wkgbmnqykc, dh0Var.f56294wkgbmnqykc) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56290eablkybsjg, dh0Var.f56290eablkybsjg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56291gxszxtbevo, dh0Var.f56291gxszxtbevo);
    }

    public final int hashCode() {
        Boolean bool = this.f56292iobyxmoadg;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.f56295zoijcleaow;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f56293ppxfxbqfkf;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f56294wkgbmnqykc;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f56290eablkybsjg;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f56291gxszxtbevo;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        return "SidAuthResultModel(isSuccess=" + this.f56292iobyxmoadg + ", state=" + this.f56295zoijcleaow + ", nonce=" + this.f56293ppxfxbqfkf + ", authCode=" + this.f56294wkgbmnqykc + ", errorDescription=" + this.f56290eablkybsjg + ", errorCode=" + this.f56291gxszxtbevo + ")";
    }
}
