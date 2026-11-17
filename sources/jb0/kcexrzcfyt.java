package jb0;

/* JADX INFO: loaded from: classes4.dex */
public final class kcexrzcfyt {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f51035eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f51036iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f51037ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f51038wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f51039zoijcleaow;

    public kcexrzcfyt(String title, String message, boolean z13, boolean z14, String cardNumber) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(title, "title");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(message, "message");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cardNumber, "cardNumber");
        this.f51036iobyxmoadg = title;
        this.f51039zoijcleaow = message;
        this.f51037ppxfxbqfkf = z13;
        this.f51038wkgbmnqykc = z14;
        this.f51035eablkybsjg = cardNumber;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kcexrzcfyt)) {
            return false;
        }
        kcexrzcfyt kcexrzcfytVar = (kcexrzcfyt) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f51036iobyxmoadg, kcexrzcfytVar.f51036iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f51039zoijcleaow, kcexrzcfytVar.f51039zoijcleaow) && this.f51037ppxfxbqfkf == kcexrzcfytVar.f51037ppxfxbqfkf && this.f51038wkgbmnqykc == kcexrzcfytVar.f51038wkgbmnqykc && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f51035eablkybsjg, kcexrzcfytVar.f51035eablkybsjg);
    }

    public int hashCode() {
        return (((((((this.f51036iobyxmoadg.hashCode() * 31) + this.f51039zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f51037ppxfxbqfkf)) * 31) + Boolean.hashCode(this.f51038wkgbmnqykc)) * 31) + this.f51035eablkybsjg.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f51035eablkybsjg;
    }

    public final String ppxfxbqfkf() {
        return this.f51036iobyxmoadg;
    }

    public String toString() {
        return "Model(title=" + this.f51036iobyxmoadg + ", message=" + this.f51039zoijcleaow + ", isCardSwitchVisible=" + this.f51037ppxfxbqfkf + ", isCardVisible=" + this.f51038wkgbmnqykc + ", cardNumber=" + this.f51035eablkybsjg + ")";
    }

    public final String zoijcleaow() {
        return this.f51039zoijcleaow;
    }

    public /* synthetic */ kcexrzcfyt(String str, String str2, boolean z13, boolean z14, String str3, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? false : z13, (i13 & 8) != 0 ? false : z14, (i13 & 16) != 0 ? "" : str3);
    }
}
