package dc;

/* JADX INFO: loaded from: classes2.dex */
final class istkbnxepw extends lmojexxdyd.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final int f27642eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final xb.gxszxtbevo f27643gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f27644iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f27645ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f27646wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f27647zoijcleaow;

    istkbnxepw(String str, String str2, String str3, String str4, int i13, xb.gxszxtbevo gxszxtbevoVar) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.f27644iobyxmoadg = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.f27647zoijcleaow = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.f27645ppxfxbqfkf = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.f27646wkgbmnqykc = str4;
        this.f27642eablkybsjg = i13;
        if (gxszxtbevoVar == null) {
            throw new NullPointerException("Null developmentPlatformProvider");
        }
        this.f27643gxszxtbevo = gxszxtbevoVar;
    }

    @Override // dc.lmojexxdyd.iobyxmoadg
    public String eablkybsjg() {
        return this.f27646wkgbmnqykc;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lmojexxdyd.iobyxmoadg)) {
            return false;
        }
        lmojexxdyd.iobyxmoadg iobyxmoadgVar = (lmojexxdyd.iobyxmoadg) obj;
        return this.f27644iobyxmoadg.equals(iobyxmoadgVar.iobyxmoadg()) && this.f27647zoijcleaow.equals(iobyxmoadgVar.gxszxtbevo()) && this.f27645ppxfxbqfkf.equals(iobyxmoadgVar.lqeggnwhkg()) && this.f27646wkgbmnqykc.equals(iobyxmoadgVar.eablkybsjg()) && this.f27642eablkybsjg == iobyxmoadgVar.ppxfxbqfkf() && this.f27643gxszxtbevo.equals(iobyxmoadgVar.wkgbmnqykc());
    }

    @Override // dc.lmojexxdyd.iobyxmoadg
    public String gxszxtbevo() {
        return this.f27647zoijcleaow;
    }

    public int hashCode() {
        return ((((((((((this.f27644iobyxmoadg.hashCode() ^ 1000003) * 1000003) ^ this.f27647zoijcleaow.hashCode()) * 1000003) ^ this.f27645ppxfxbqfkf.hashCode()) * 1000003) ^ this.f27646wkgbmnqykc.hashCode()) * 1000003) ^ this.f27642eablkybsjg) * 1000003) ^ this.f27643gxszxtbevo.hashCode();
    }

    @Override // dc.lmojexxdyd.iobyxmoadg
    public String iobyxmoadg() {
        return this.f27644iobyxmoadg;
    }

    @Override // dc.lmojexxdyd.iobyxmoadg
    public String lqeggnwhkg() {
        return this.f27645ppxfxbqfkf;
    }

    @Override // dc.lmojexxdyd.iobyxmoadg
    public int ppxfxbqfkf() {
        return this.f27642eablkybsjg;
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f27644iobyxmoadg + ", versionCode=" + this.f27647zoijcleaow + ", versionName=" + this.f27645ppxfxbqfkf + ", installUuid=" + this.f27646wkgbmnqykc + ", deliveryMechanism=" + this.f27642eablkybsjg + ", developmentPlatformProvider=" + this.f27643gxszxtbevo + "}";
    }

    @Override // dc.lmojexxdyd.iobyxmoadg
    public xb.gxszxtbevo wkgbmnqykc() {
        return this.f27643gxszxtbevo;
    }
}
