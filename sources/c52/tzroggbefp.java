package c52;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class tzroggbefp implements zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f18991iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f18992ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final jpowsppfya f18993zoijcleaow;

    public tzroggbefp(int i13, jpowsppfya type, List data) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(data, "data");
        this.f18991iobyxmoadg = i13;
        this.f18993zoijcleaow = type;
        this.f18992ppxfxbqfkf = data;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tzroggbefp)) {
            return false;
        }
        tzroggbefp tzroggbefpVar = (tzroggbefp) obj;
        return this.f18991iobyxmoadg == tzroggbefpVar.f18991iobyxmoadg && this.f18993zoijcleaow == tzroggbefpVar.f18993zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f18992ppxfxbqfkf, tzroggbefpVar.f18992ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f18991iobyxmoadg) * 31) + this.f18993zoijcleaow.hashCode()) * 31) + this.f18992ppxfxbqfkf.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f18992ppxfxbqfkf;
    }

    public String toString() {
        return "VideosSpecialBannerModel(index=" + this.f18991iobyxmoadg + ", type=" + this.f18993zoijcleaow + ", data=" + this.f18992ppxfxbqfkf + ")";
    }

    public int zoijcleaow() {
        return this.f18991iobyxmoadg;
    }
}
