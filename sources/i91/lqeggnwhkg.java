package i91;

/* JADX INFO: loaded from: classes5.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f42158iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f42159ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f42160zoijcleaow;

    public lqeggnwhkg(String titleText, String messageText, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(titleText, "titleText");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(messageText, "messageText");
        this.f42158iobyxmoadg = titleText;
        this.f42160zoijcleaow = messageText;
        this.f42159ppxfxbqfkf = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f42158iobyxmoadg, lqeggnwhkgVar.f42158iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f42160zoijcleaow, lqeggnwhkgVar.f42160zoijcleaow) && this.f42159ppxfxbqfkf == lqeggnwhkgVar.f42159ppxfxbqfkf;
    }

    public int hashCode() {
        return (((this.f42158iobyxmoadg.hashCode() * 31) + this.f42160zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f42159ppxfxbqfkf);
    }

    public final lqeggnwhkg iobyxmoadg(String titleText, String messageText, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(titleText, "titleText");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(messageText, "messageText");
        return new lqeggnwhkg(titleText, messageText, z13);
    }

    public final boolean ppxfxbqfkf() {
        return this.f42159ppxfxbqfkf;
    }

    public String toString() {
        return "Model(titleText=" + this.f42158iobyxmoadg + ", messageText=" + this.f42160zoijcleaow + ", needForceUpdate=" + this.f42159ppxfxbqfkf + ")";
    }

    public final String wkgbmnqykc() {
        return this.f42158iobyxmoadg;
    }

    public final String zoijcleaow() {
        return this.f42160zoijcleaow;
    }

    public /* synthetic */ lqeggnwhkg(String str, String str2, boolean z13, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? false : z13);
    }
}
