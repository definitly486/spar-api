package h50;

import kotlin.jvm.internal.zdlpuopuiu;
import sj.kegysxyocb;
import sj.zynmafqrjb;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final agtfadlqog f39484iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final zynmafqrjb f39485ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final nufgyqmvbu f39486zoijcleaow;

    public zoijcleaow(agtfadlqog theme, nufgyqmvbu effect, g.lqeggnwhkg lqeggnwhkgVar) {
        zdlpuopuiu.btonecajqb(theme, "theme");
        zdlpuopuiu.btonecajqb(effect, "effect");
        this.f39484iobyxmoadg = theme;
        this.f39486zoijcleaow = effect;
        this.f39485ppxfxbqfkf = kegysxyocb.iobyxmoadg(lqeggnwhkgVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zoijcleaow.class != obj.getClass()) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f39484iobyxmoadg, zoijcleaowVar.f39484iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f39486zoijcleaow, zoijcleaowVar.f39486zoijcleaow);
    }

    public int hashCode() {
        return (this.f39484iobyxmoadg.hashCode() * 31) + this.f39486zoijcleaow.hashCode();
    }

    public final zynmafqrjb iobyxmoadg() {
        return this.f39485ppxfxbqfkf;
    }

    public final agtfadlqog ppxfxbqfkf() {
        return this.f39484iobyxmoadg;
    }

    public final void wkgbmnqykc(g.lqeggnwhkg lqeggnwhkgVar) {
        this.f39485ppxfxbqfkf.setValue(lqeggnwhkgVar);
    }

    public final nufgyqmvbu zoijcleaow() {
        return this.f39486zoijcleaow;
    }
}
