package c52;

/* JADX INFO: loaded from: classes6.dex */
public final class stevsuqkhv implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f18988iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final kegysxyocb f18989ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f18990zoijcleaow;

    public stevsuqkhv(int i13, jpowsppfya type, kegysxyocb data) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
        this.f18988iobyxmoadg = i13;
        this.f18990zoijcleaow = type;
        this.f18989ppxfxbqfkf = data;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof stevsuqkhv)) {
            return false;
        }
        stevsuqkhv stevsuqkhvVar = (stevsuqkhv) obj;
        return this.f18988iobyxmoadg == stevsuqkhvVar.f18988iobyxmoadg && this.f18990zoijcleaow == stevsuqkhvVar.f18990zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18989ppxfxbqfkf, stevsuqkhvVar.f18989ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f18988iobyxmoadg) * 31) + this.f18990zoijcleaow.hashCode()) * 31) + this.f18989ppxfxbqfkf.hashCode();
    }

    public final kegysxyocb iobyxmoadg() {
        return this.f18989ppxfxbqfkf;
    }

    public String toString() {
        return "VideoSpecialBanner(index=" + this.f18988iobyxmoadg + ", type=" + this.f18990zoijcleaow + ", data=" + this.f18989ppxfxbqfkf + ")";
    }

    public int zoijcleaow() {
        return this.f18988iobyxmoadg;
    }
}
