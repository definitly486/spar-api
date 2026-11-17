package xa0;

/* JADX INFO: loaded from: classes4.dex */
public final class wflxmlrfwp {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final int f121917wkgbmnqykc = 0;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f121918iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f121919ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f121920zoijcleaow;

    public wflxmlrfwp(String str, String str2, String str3) {
        this.f121918iobyxmoadg = str;
        this.f121920zoijcleaow = str2;
        this.f121919ppxfxbqfkf = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wflxmlrfwp)) {
            return false;
        }
        wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f121918iobyxmoadg, wflxmlrfwpVar.f121918iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f121920zoijcleaow, wflxmlrfwpVar.f121920zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f121919ppxfxbqfkf, wflxmlrfwpVar.f121919ppxfxbqfkf);
    }

    public int hashCode() {
        String str = this.f121918iobyxmoadg;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f121920zoijcleaow;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f121919ppxfxbqfkf;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String iobyxmoadg() {
        return this.f121920zoijcleaow;
    }

    public final String ppxfxbqfkf() {
        return this.f121918iobyxmoadg;
    }

    public String toString() {
        return "QuizDialogParams(title=" + this.f121918iobyxmoadg + ", message=" + this.f121920zoijcleaow + ", reference=" + this.f121919ppxfxbqfkf + ")";
    }

    public final String zoijcleaow() {
        return this.f121919ppxfxbqfkf;
    }
}
