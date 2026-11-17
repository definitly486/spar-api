package jb0;

/* JADX INFO: loaded from: classes4.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f51040iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f51041ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f51042zoijcleaow;

    public lqeggnwhkg(String titleText, String messageText, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(titleText, "titleText");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(messageText, "messageText");
        this.f51040iobyxmoadg = titleText;
        this.f51042zoijcleaow = messageText;
        this.f51041ppxfxbqfkf = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f51040iobyxmoadg, lqeggnwhkgVar.f51040iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f51042zoijcleaow, lqeggnwhkgVar.f51042zoijcleaow) && this.f51041ppxfxbqfkf == lqeggnwhkgVar.f51041ppxfxbqfkf;
    }

    public int hashCode() {
        return (((this.f51040iobyxmoadg.hashCode() * 31) + this.f51042zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f51041ppxfxbqfkf);
    }

    public final lqeggnwhkg iobyxmoadg(String titleText, String messageText, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(titleText, "titleText");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(messageText, "messageText");
        return new lqeggnwhkg(titleText, messageText, z13);
    }

    public final boolean ppxfxbqfkf() {
        return this.f51041ppxfxbqfkf;
    }

    public String toString() {
        return "Model(titleText=" + this.f51040iobyxmoadg + ", messageText=" + this.f51042zoijcleaow + ", needForceUpdate=" + this.f51041ppxfxbqfkf + ")";
    }

    public final String wkgbmnqykc() {
        return this.f51040iobyxmoadg;
    }

    public final String zoijcleaow() {
        return this.f51042zoijcleaow;
    }

    public /* synthetic */ lqeggnwhkg(String str, String str2, boolean z13, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? false : z13);
    }
}
