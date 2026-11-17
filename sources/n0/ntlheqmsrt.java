package n0;

/* JADX INFO: loaded from: classes.dex */
public final class ntlheqmsrt implements draadjrbmk {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final int f68286eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f68287iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f68288ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final cdpycssgdh f68289wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final yadqdtsiqt f68290zoijcleaow;

    public /* synthetic */ ntlheqmsrt(int i13, yadqdtsiqt yadqdtsiqtVar, int i14, cdpycssgdh cdpycssgdhVar, int i15, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(i13, yadqdtsiqtVar, i14, cdpycssgdhVar, i15);
    }

    public final cdpycssgdh eablkybsjg() {
        return this.f68289wkgbmnqykc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ntlheqmsrt)) {
            return false;
        }
        ntlheqmsrt ntlheqmsrtVar = (ntlheqmsrt) obj;
        return this.f68287iobyxmoadg == ntlheqmsrtVar.f68287iobyxmoadg && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaow(), ntlheqmsrtVar.zoijcleaow()) && lereixgezr.gxszxtbevo(ppxfxbqfkf(), ntlheqmsrtVar.ppxfxbqfkf()) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f68289wkgbmnqykc, ntlheqmsrtVar.f68289wkgbmnqykc) && cqumvgiudr.eablkybsjg(iobyxmoadg(), ntlheqmsrtVar.iobyxmoadg());
    }

    public int hashCode() {
        return (((((((this.f68287iobyxmoadg * 31) + zoijcleaow().hashCode()) * 31) + lereixgezr.lqeggnwhkg(ppxfxbqfkf())) * 31) + cqumvgiudr.gxszxtbevo(iobyxmoadg())) * 31) + this.f68289wkgbmnqykc.hashCode();
    }

    @Override // n0.draadjrbmk
    public int iobyxmoadg() {
        return this.f68286eablkybsjg;
    }

    @Override // n0.draadjrbmk
    public int ppxfxbqfkf() {
        return this.f68288ppxfxbqfkf;
    }

    public String toString() {
        return "ResourceFont(resId=" + this.f68287iobyxmoadg + ", weight=" + zoijcleaow() + ", style=" + ((Object) lereixgezr.nufgyqmvbu(ppxfxbqfkf())) + ", loadingStrategy=" + ((Object) cqumvgiudr.lqeggnwhkg(iobyxmoadg())) + ')';
    }

    public final int wkgbmnqykc() {
        return this.f68287iobyxmoadg;
    }

    @Override // n0.draadjrbmk
    public yadqdtsiqt zoijcleaow() {
        return this.f68290zoijcleaow;
    }

    private ntlheqmsrt(int i13, yadqdtsiqt yadqdtsiqtVar, int i14, cdpycssgdh cdpycssgdhVar, int i15) {
        this.f68287iobyxmoadg = i13;
        this.f68290zoijcleaow = yadqdtsiqtVar;
        this.f68288ppxfxbqfkf = i14;
        this.f68289wkgbmnqykc = cdpycssgdhVar;
        this.f68286eablkybsjg = i15;
    }
}
