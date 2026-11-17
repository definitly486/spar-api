package c52;

/* JADX INFO: loaded from: classes6.dex */
public final class lmojexxdyd {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f18951iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final wwaezpbzkn f18952ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f18953zoijcleaow;

    public lmojexxdyd(String title, String desc, wwaezpbzkn wwaezpbzknVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(title, "title");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(desc, "desc");
        this.f18951iobyxmoadg = title;
        this.f18953zoijcleaow = desc;
        this.f18952ppxfxbqfkf = wwaezpbzknVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lmojexxdyd)) {
            return false;
        }
        lmojexxdyd lmojexxdydVar = (lmojexxdyd) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18951iobyxmoadg, lmojexxdydVar.f18951iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18953zoijcleaow, lmojexxdydVar.f18953zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18952ppxfxbqfkf, lmojexxdydVar.f18952ppxfxbqfkf);
    }

    public int hashCode() {
        int iHashCode = ((this.f18951iobyxmoadg.hashCode() * 31) + this.f18953zoijcleaow.hashCode()) * 31;
        wwaezpbzkn wwaezpbzknVar = this.f18952ppxfxbqfkf;
        return iHashCode + (wwaezpbzknVar == null ? 0 : wwaezpbzknVar.hashCode());
    }

    public final wwaezpbzkn iobyxmoadg() {
        return this.f18952ppxfxbqfkf;
    }

    public final String ppxfxbqfkf() {
        return this.f18951iobyxmoadg;
    }

    public String toString() {
        return "SpecialBannerPopup(title=" + this.f18951iobyxmoadg + ", desc=" + this.f18953zoijcleaow + ", button=" + this.f18952ppxfxbqfkf + ")";
    }

    public final String zoijcleaow() {
        return this.f18953zoijcleaow;
    }

    public /* synthetic */ lmojexxdyd(String str, String str2, wwaezpbzkn wwaezpbzknVar, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? null : wwaezpbzknVar);
    }
}
