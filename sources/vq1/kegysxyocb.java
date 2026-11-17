package vq1;

/* JADX INFO: loaded from: classes6.dex */
public final class kegysxyocb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f117861iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f117862ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f117863zoijcleaow;

    public kegysxyocb(String url, String preview, String adv) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(url, "url");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(preview, "preview");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(adv, "adv");
        this.f117861iobyxmoadg = url;
        this.f117863zoijcleaow = preview;
        this.f117862ppxfxbqfkf = adv;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kegysxyocb)) {
            return false;
        }
        kegysxyocb kegysxyocbVar = (kegysxyocb) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117861iobyxmoadg, kegysxyocbVar.f117861iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117863zoijcleaow, kegysxyocbVar.f117863zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117862ppxfxbqfkf, kegysxyocbVar.f117862ppxfxbqfkf);
    }

    public int hashCode() {
        return (((this.f117861iobyxmoadg.hashCode() * 31) + this.f117863zoijcleaow.hashCode()) * 31) + this.f117862ppxfxbqfkf.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f117862ppxfxbqfkf;
    }

    public final String ppxfxbqfkf() {
        return this.f117861iobyxmoadg;
    }

    public String toString() {
        return "VideoSpecialBannerData(url=" + this.f117861iobyxmoadg + ", preview=" + this.f117863zoijcleaow + ", adv=" + this.f117862ppxfxbqfkf + ")";
    }

    public final String zoijcleaow() {
        return this.f117863zoijcleaow;
    }
}
