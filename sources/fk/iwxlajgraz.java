package fk;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class iwxlajgraz implements dk.gxszxtbevo, wflxmlrfwp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final dk.gxszxtbevo f34165iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Set f34166ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f34167zoijcleaow;

    public iwxlajgraz(dk.gxszxtbevo original) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(original, "original");
        this.f34165iobyxmoadg = original;
        this.f34167zoijcleaow = original.nufgyqmvbu() + '?';
        this.f34166ppxfxbqfkf = ydmasvzmpa.iobyxmoadg(original);
    }

    public final dk.gxszxtbevo btonecajqb() {
        return this.f34165iobyxmoadg;
    }

    @Override // dk.gxszxtbevo
    public boolean dxjokdxxww(int i13) {
        return this.f34165iobyxmoadg.dxjokdxxww(i13);
    }

    @Override // dk.gxszxtbevo
    public String eablkybsjg(int i13) {
        return this.f34165iobyxmoadg.eablkybsjg(i13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iwxlajgraz) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34165iobyxmoadg, ((iwxlajgraz) obj).f34165iobyxmoadg);
    }

    @Override // dk.gxszxtbevo
    public List getAnnotations() {
        return this.f34165iobyxmoadg.getAnnotations();
    }

    @Override // dk.gxszxtbevo
    public dk.agtfadlqog getKind() {
        return this.f34165iobyxmoadg.getKind();
    }

    @Override // dk.gxszxtbevo
    public List gxszxtbevo(int i13) {
        return this.f34165iobyxmoadg.gxszxtbevo(i13);
    }

    public int hashCode() {
        return this.f34165iobyxmoadg.hashCode() * 31;
    }

    @Override // fk.wflxmlrfwp
    public Set iobyxmoadg() {
        return this.f34166ppxfxbqfkf;
    }

    @Override // dk.gxszxtbevo
    public boolean isInline() {
        return this.f34165iobyxmoadg.isInline();
    }

    @Override // dk.gxszxtbevo
    public dk.gxszxtbevo lqeggnwhkg(int i13) {
        return this.f34165iobyxmoadg.lqeggnwhkg(i13);
    }

    @Override // dk.gxszxtbevo
    public String nufgyqmvbu() {
        return this.f34167zoijcleaow;
    }

    @Override // dk.gxszxtbevo
    public int ppxfxbqfkf(String name) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        return this.f34165iobyxmoadg.ppxfxbqfkf(name);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f34165iobyxmoadg);
        sb3.append('?');
        return sb3.toString();
    }

    @Override // dk.gxszxtbevo
    public int wkgbmnqykc() {
        return this.f34165iobyxmoadg.wkgbmnqykc();
    }

    @Override // dk.gxszxtbevo
    public boolean zoijcleaow() {
        return true;
    }
}
