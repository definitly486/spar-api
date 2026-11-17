package vq1;

/* JADX INFO: loaded from: classes6.dex */
public final class lmojexxdyd {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f117871iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final wwaezpbzkn f117872ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f117873zoijcleaow;

    public lmojexxdyd(String title, String desc, wwaezpbzkn wwaezpbzknVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(title, "title");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(desc, "desc");
        this.f117871iobyxmoadg = title;
        this.f117873zoijcleaow = desc;
        this.f117872ppxfxbqfkf = wwaezpbzknVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lmojexxdyd)) {
            return false;
        }
        lmojexxdyd lmojexxdydVar = (lmojexxdyd) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117871iobyxmoadg, lmojexxdydVar.f117871iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117873zoijcleaow, lmojexxdydVar.f117873zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117872ppxfxbqfkf, lmojexxdydVar.f117872ppxfxbqfkf);
    }

    public int hashCode() {
        int iHashCode = ((this.f117871iobyxmoadg.hashCode() * 31) + this.f117873zoijcleaow.hashCode()) * 31;
        wwaezpbzkn wwaezpbzknVar = this.f117872ppxfxbqfkf;
        return iHashCode + (wwaezpbzknVar == null ? 0 : wwaezpbzknVar.hashCode());
    }

    public final wwaezpbzkn iobyxmoadg() {
        return this.f117872ppxfxbqfkf;
    }

    public final String ppxfxbqfkf() {
        return this.f117871iobyxmoadg;
    }

    public String toString() {
        return "SpecialBannerPopup(title=" + this.f117871iobyxmoadg + ", desc=" + this.f117873zoijcleaow + ", button=" + this.f117872ppxfxbqfkf + ")";
    }

    public final String zoijcleaow() {
        return this.f117873zoijcleaow;
    }

    public /* synthetic */ lmojexxdyd(String str, String str2, wwaezpbzkn wwaezpbzknVar, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? null : wwaezpbzknVar);
    }
}
