package ac;

/* JADX INFO: loaded from: classes2.dex */
final class wkgbmnqykc extends hcddaimhww.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f1464iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f1465ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f1466zoijcleaow;

    wkgbmnqykc(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.f1464iobyxmoadg = str;
        this.f1466zoijcleaow = str2;
        this.f1465ppxfxbqfkf = str3;
    }

    @Override // ac.hcddaimhww.iobyxmoadg
    public String eablkybsjg() {
        return this.f1466zoijcleaow;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hcddaimhww.iobyxmoadg)) {
            return false;
        }
        hcddaimhww.iobyxmoadg iobyxmoadgVar = (hcddaimhww.iobyxmoadg) obj;
        if (this.f1464iobyxmoadg.equals(iobyxmoadgVar.ppxfxbqfkf()) && ((str = this.f1466zoijcleaow) != null ? str.equals(iobyxmoadgVar.eablkybsjg()) : iobyxmoadgVar.eablkybsjg() == null)) {
            String str2 = this.f1465ppxfxbqfkf;
            if (str2 == null) {
                if (iobyxmoadgVar.wkgbmnqykc() == null) {
                    return true;
                }
            } else if (str2.equals(iobyxmoadgVar.wkgbmnqykc())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f1464iobyxmoadg.hashCode() ^ 1000003) * 1000003;
        String str = this.f1466zoijcleaow;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f1465ppxfxbqfkf;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    @Override // ac.hcddaimhww.iobyxmoadg
    public String ppxfxbqfkf() {
        return this.f1464iobyxmoadg;
    }

    public String toString() {
        return "InstallIds{crashlyticsInstallId=" + this.f1464iobyxmoadg + ", firebaseInstallationId=" + this.f1466zoijcleaow + ", firebaseAuthenticationToken=" + this.f1465ppxfxbqfkf + "}";
    }

    @Override // ac.hcddaimhww.iobyxmoadg
    public String wkgbmnqykc() {
        return this.f1465ppxfxbqfkf;
    }
}
