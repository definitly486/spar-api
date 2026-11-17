package vi;

import jh.xrmfcynszj;

/* JADX INFO: loaded from: classes3.dex */
public final class dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final fi.ppxfxbqfkf f116904iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final fi.iobyxmoadg f116905ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final xrmfcynszj f116906wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final di.ppxfxbqfkf f116907zoijcleaow;

    public dxjokdxxww(fi.ppxfxbqfkf nameResolver, di.ppxfxbqfkf classProto, fi.iobyxmoadg metadataVersion, xrmfcynszj sourceElement) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(nameResolver, "nameResolver");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(classProto, "classProto");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(metadataVersion, "metadataVersion");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sourceElement, "sourceElement");
        this.f116904iobyxmoadg = nameResolver;
        this.f116907zoijcleaow = classProto;
        this.f116905ppxfxbqfkf = metadataVersion;
        this.f116906wkgbmnqykc = sourceElement;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxjokdxxww)) {
            return false;
        }
        dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f116904iobyxmoadg, dxjokdxxwwVar.f116904iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f116907zoijcleaow, dxjokdxxwwVar.f116907zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f116905ppxfxbqfkf, dxjokdxxwwVar.f116905ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f116906wkgbmnqykc, dxjokdxxwwVar.f116906wkgbmnqykc);
    }

    public int hashCode() {
        return (((((this.f116904iobyxmoadg.hashCode() * 31) + this.f116907zoijcleaow.hashCode()) * 31) + this.f116905ppxfxbqfkf.hashCode()) * 31) + this.f116906wkgbmnqykc.hashCode();
    }

    public final fi.ppxfxbqfkf iobyxmoadg() {
        return this.f116904iobyxmoadg;
    }

    public final fi.iobyxmoadg ppxfxbqfkf() {
        return this.f116905ppxfxbqfkf;
    }

    public String toString() {
        return "ClassData(nameResolver=" + this.f116904iobyxmoadg + ", classProto=" + this.f116907zoijcleaow + ", metadataVersion=" + this.f116905ppxfxbqfkf + ", sourceElement=" + this.f116906wkgbmnqykc + ')';
    }

    public final xrmfcynszj wkgbmnqykc() {
        return this.f116906wkgbmnqykc;
    }

    public final di.ppxfxbqfkf zoijcleaow() {
        return this.f116907zoijcleaow;
    }
}
