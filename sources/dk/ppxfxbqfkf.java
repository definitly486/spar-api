package dk;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
final class ppxfxbqfkf implements gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final gxszxtbevo f29099iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f29100ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ah.wkgbmnqykc f29101zoijcleaow;

    public ppxfxbqfkf(gxszxtbevo original, ah.wkgbmnqykc kClass) {
        zdlpuopuiu.btonecajqb(original, "original");
        zdlpuopuiu.btonecajqb(kClass, "kClass");
        this.f29099iobyxmoadg = original;
        this.f29101zoijcleaow = kClass;
        this.f29100ppxfxbqfkf = original.nufgyqmvbu() + '<' + kClass.jyumaefscl() + '>';
    }

    @Override // dk.gxszxtbevo
    public boolean dxjokdxxww(int i13) {
        return this.f29099iobyxmoadg.dxjokdxxww(i13);
    }

    @Override // dk.gxszxtbevo
    public String eablkybsjg(int i13) {
        return this.f29099iobyxmoadg.eablkybsjg(i13);
    }

    public boolean equals(Object obj) {
        ppxfxbqfkf ppxfxbqfkfVar = obj instanceof ppxfxbqfkf ? (ppxfxbqfkf) obj : null;
        return ppxfxbqfkfVar != null && zdlpuopuiu.eablkybsjg(this.f29099iobyxmoadg, ppxfxbqfkfVar.f29099iobyxmoadg) && zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar.f29101zoijcleaow, this.f29101zoijcleaow);
    }

    @Override // dk.gxszxtbevo
    public List getAnnotations() {
        return this.f29099iobyxmoadg.getAnnotations();
    }

    @Override // dk.gxszxtbevo
    public agtfadlqog getKind() {
        return this.f29099iobyxmoadg.getKind();
    }

    @Override // dk.gxszxtbevo
    public List gxszxtbevo(int i13) {
        return this.f29099iobyxmoadg.gxszxtbevo(i13);
    }

    public int hashCode() {
        return (this.f29101zoijcleaow.hashCode() * 31) + nufgyqmvbu().hashCode();
    }

    @Override // dk.gxszxtbevo
    public boolean isInline() {
        return this.f29099iobyxmoadg.isInline();
    }

    @Override // dk.gxszxtbevo
    public gxszxtbevo lqeggnwhkg(int i13) {
        return this.f29099iobyxmoadg.lqeggnwhkg(i13);
    }

    @Override // dk.gxszxtbevo
    public String nufgyqmvbu() {
        return this.f29100ppxfxbqfkf;
    }

    @Override // dk.gxszxtbevo
    public int ppxfxbqfkf(String name) {
        zdlpuopuiu.btonecajqb(name, "name");
        return this.f29099iobyxmoadg.ppxfxbqfkf(name);
    }

    public String toString() {
        return "ContextDescriptor(kClass: " + this.f29101zoijcleaow + ", original: " + this.f29099iobyxmoadg + ')';
    }

    @Override // dk.gxszxtbevo
    public int wkgbmnqykc() {
        return this.f29099iobyxmoadg.wkgbmnqykc();
    }

    @Override // dk.gxszxtbevo
    public boolean zoijcleaow() {
        return this.f29099iobyxmoadg.zoijcleaow();
    }
}
