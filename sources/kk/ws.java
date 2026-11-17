package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class ws {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final String f59189eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final String f59190gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final String f59191iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final String f59192ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final String f59193wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final String f59194zoijcleaow;

    public ws(String str, String str2, String str3, String str4, String str5, String str6, int i13) {
        str2 = (i13 & 2) != 0 ? null : str2;
        str3 = (i13 & 4) != 0 ? null : str3;
        str4 = (i13 & 8) != 0 ? null : str4;
        str6 = (i13 & 32) != 0 ? null : str6;
        this.f59191iobyxmoadg = str;
        this.f59194zoijcleaow = str2;
        this.f59192ppxfxbqfkf = str3;
        this.f59193wkgbmnqykc = str4;
        this.f59189eablkybsjg = str5;
        this.f59190gxszxtbevo = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ws)) {
            return false;
        }
        ws wsVar = (ws) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f59191iobyxmoadg, wsVar.f59191iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f59194zoijcleaow, wsVar.f59194zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f59192ppxfxbqfkf, wsVar.f59192ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f59193wkgbmnqykc, wsVar.f59193wkgbmnqykc) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f59189eablkybsjg, wsVar.f59189eablkybsjg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f59190gxszxtbevo, wsVar.f59190gxszxtbevo) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(null, null) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(null, null);
    }

    public final int hashCode() {
        int iHashCode = this.f59191iobyxmoadg.hashCode() * 31;
        String str = this.f59194zoijcleaow;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f59192ppxfxbqfkf;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f59193wkgbmnqykc;
        int iIobyxmoadg = xg.iobyxmoadg(this.f59189eablkybsjg, (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        String str4 = this.f59190gxszxtbevo;
        return (iIobyxmoadg + (str4 != null ? str4.hashCode() : 0)) * 961;
    }

    public final String toString() {
        return "ScreenData(header=" + this.f59191iobyxmoadg + ", text=" + this.f59194zoijcleaow + ", declineText=" + this.f59192ppxfxbqfkf + ", buttonConfirm=" + this.f59193wkgbmnqykc + ", buttonDecline=" + this.f59189eablkybsjg + ", buttonInform=" + this.f59190gxszxtbevo + ", cybercabinetUrlAndroid=" + ((String) null) + ", cybercabinetUrlIOS=" + ((String) null) + ")";
    }
}
