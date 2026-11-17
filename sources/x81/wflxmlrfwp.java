package x81;

/* JADX INFO: loaded from: classes5.dex */
public final class wflxmlrfwp {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final int f121527wkgbmnqykc = 0;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f121528iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f121529ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f121530zoijcleaow;

    public wflxmlrfwp(String str, String str2, String str3) {
        this.f121528iobyxmoadg = str;
        this.f121530zoijcleaow = str2;
        this.f121529ppxfxbqfkf = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wflxmlrfwp)) {
            return false;
        }
        wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f121528iobyxmoadg, wflxmlrfwpVar.f121528iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f121530zoijcleaow, wflxmlrfwpVar.f121530zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f121529ppxfxbqfkf, wflxmlrfwpVar.f121529ppxfxbqfkf);
    }

    public int hashCode() {
        String str = this.f121528iobyxmoadg;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f121530zoijcleaow;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f121529ppxfxbqfkf;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String iobyxmoadg() {
        return this.f121530zoijcleaow;
    }

    public final String ppxfxbqfkf() {
        return this.f121528iobyxmoadg;
    }

    public String toString() {
        return "QuizDialogParams(title=" + this.f121528iobyxmoadg + ", message=" + this.f121530zoijcleaow + ", reference=" + this.f121529ppxfxbqfkf + ")";
    }

    public final String zoijcleaow() {
        return this.f121529ppxfxbqfkf;
    }
}
