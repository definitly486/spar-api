package vq1;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class tzroggbefp implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f117911iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f117912ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f117913zoijcleaow;

    public tzroggbefp(int i13, jpowsppfya type, List data) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
        this.f117911iobyxmoadg = i13;
        this.f117913zoijcleaow = type;
        this.f117912ppxfxbqfkf = data;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tzroggbefp)) {
            return false;
        }
        tzroggbefp tzroggbefpVar = (tzroggbefp) obj;
        return this.f117911iobyxmoadg == tzroggbefpVar.f117911iobyxmoadg && this.f117913zoijcleaow == tzroggbefpVar.f117913zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117912ppxfxbqfkf, tzroggbefpVar.f117912ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f117911iobyxmoadg) * 31) + this.f117913zoijcleaow.hashCode()) * 31) + this.f117912ppxfxbqfkf.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f117912ppxfxbqfkf;
    }

    public String toString() {
        return "VideosSpecialBannerModel(index=" + this.f117911iobyxmoadg + ", type=" + this.f117913zoijcleaow + ", data=" + this.f117912ppxfxbqfkf + ")";
    }

    public int zoijcleaow() {
        return this.f117911iobyxmoadg;
    }
}
