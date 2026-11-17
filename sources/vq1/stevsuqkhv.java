package vq1;

/* JADX INFO: loaded from: classes6.dex */
public final class stevsuqkhv implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f117908iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final kegysxyocb f117909ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f117910zoijcleaow;

    public stevsuqkhv(int i13, jpowsppfya type, kegysxyocb data) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
        this.f117908iobyxmoadg = i13;
        this.f117910zoijcleaow = type;
        this.f117909ppxfxbqfkf = data;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof stevsuqkhv)) {
            return false;
        }
        stevsuqkhv stevsuqkhvVar = (stevsuqkhv) obj;
        return this.f117908iobyxmoadg == stevsuqkhvVar.f117908iobyxmoadg && this.f117910zoijcleaow == stevsuqkhvVar.f117910zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117909ppxfxbqfkf, stevsuqkhvVar.f117909ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f117908iobyxmoadg) * 31) + this.f117910zoijcleaow.hashCode()) * 31) + this.f117909ppxfxbqfkf.hashCode();
    }

    public final kegysxyocb iobyxmoadg() {
        return this.f117909ppxfxbqfkf;
    }

    public String toString() {
        return "VideoSpecialBanner(index=" + this.f117908iobyxmoadg + ", type=" + this.f117910zoijcleaow + ", data=" + this.f117909ppxfxbqfkf + ")";
    }

    public int zoijcleaow() {
        return this.f117908iobyxmoadg;
    }
}
