package i91;

/* JADX INFO: loaded from: classes5.dex */
public final class kcexrzcfyt {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f42153eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f42154iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f42155ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f42156wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f42157zoijcleaow;

    public kcexrzcfyt(String title, String message, boolean z13, boolean z14, String cardNumber) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(title, "title");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(message, "message");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cardNumber, "cardNumber");
        this.f42154iobyxmoadg = title;
        this.f42157zoijcleaow = message;
        this.f42155ppxfxbqfkf = z13;
        this.f42156wkgbmnqykc = z14;
        this.f42153eablkybsjg = cardNumber;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kcexrzcfyt)) {
            return false;
        }
        kcexrzcfyt kcexrzcfytVar = (kcexrzcfyt) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f42154iobyxmoadg, kcexrzcfytVar.f42154iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f42157zoijcleaow, kcexrzcfytVar.f42157zoijcleaow) && this.f42155ppxfxbqfkf == kcexrzcfytVar.f42155ppxfxbqfkf && this.f42156wkgbmnqykc == kcexrzcfytVar.f42156wkgbmnqykc && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f42153eablkybsjg, kcexrzcfytVar.f42153eablkybsjg);
    }

    public int hashCode() {
        return (((((((this.f42154iobyxmoadg.hashCode() * 31) + this.f42157zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f42155ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f42156wkgbmnqykc)) * 31) + this.f42153eablkybsjg.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f42153eablkybsjg;
    }

    public final String ppxfxbqfkf() {
        return this.f42154iobyxmoadg;
    }

    public String toString() {
        return "Model(title=" + this.f42154iobyxmoadg + ", message=" + this.f42157zoijcleaow + ", isCardSwitchVisible=" + this.f42155ppxfxbqfkf + ", isCardVisible=" + this.f42156wkgbmnqykc + ", cardNumber=" + this.f42153eablkybsjg + ")";
    }

    public final String zoijcleaow() {
        return this.f42157zoijcleaow;
    }

    public /* synthetic */ kcexrzcfyt(String str, String str2, boolean z13, boolean z14, String str3, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? false : z13, (i13 & 8) != 0 ? false : z14, (i13 & 16) != 0 ? "" : str3);
    }
}
