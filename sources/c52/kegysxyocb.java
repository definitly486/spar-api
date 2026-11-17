package c52;

/* JADX INFO: loaded from: classes6.dex */
public final class kegysxyocb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f18942iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f18943zoijcleaow;

    public kegysxyocb(String url, String preview) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(url, "url");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(preview, "preview");
        this.f18942iobyxmoadg = url;
        this.f18943zoijcleaow = preview;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kegysxyocb)) {
            return false;
        }
        kegysxyocb kegysxyocbVar = (kegysxyocb) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18942iobyxmoadg, kegysxyocbVar.f18942iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18943zoijcleaow, kegysxyocbVar.f18943zoijcleaow);
    }

    public int hashCode() {
        return (this.f18942iobyxmoadg.hashCode() * 31) + this.f18943zoijcleaow.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f18943zoijcleaow;
    }

    public String toString() {
        return "VideoSpecialBannerData(url=" + this.f18942iobyxmoadg + ", preview=" + this.f18943zoijcleaow + ")";
    }

    public final String zoijcleaow() {
        return this.f18942iobyxmoadg;
    }
}
