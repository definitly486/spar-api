package s31;

import kotlin.jvm.internal.zdlpuopuiu;
import sj.kegysxyocb;
import sj.zynmafqrjb;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final agtfadlqog f105401iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final zynmafqrjb f105402ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final nufgyqmvbu f105403zoijcleaow;

    public zoijcleaow(agtfadlqog theme, nufgyqmvbu effect, g.lqeggnwhkg lqeggnwhkgVar) {
        zdlpuopuiu.btonecajqb(theme, "theme");
        zdlpuopuiu.btonecajqb(effect, "effect");
        this.f105401iobyxmoadg = theme;
        this.f105403zoijcleaow = effect;
        this.f105402ppxfxbqfkf = kegysxyocb.iobyxmoadg(lqeggnwhkgVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zoijcleaow.class != obj.getClass()) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f105401iobyxmoadg, zoijcleaowVar.f105401iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f105403zoijcleaow, zoijcleaowVar.f105403zoijcleaow);
    }

    public int hashCode() {
        return (this.f105401iobyxmoadg.hashCode() * 31) + this.f105403zoijcleaow.hashCode();
    }

    public final zynmafqrjb iobyxmoadg() {
        return this.f105402ppxfxbqfkf;
    }

    public final agtfadlqog ppxfxbqfkf() {
        return this.f105401iobyxmoadg;
    }

    public final void wkgbmnqykc(g.lqeggnwhkg lqeggnwhkgVar) {
        this.f105402ppxfxbqfkf.setValue(lqeggnwhkgVar);
    }

    public final nufgyqmvbu zoijcleaow() {
        return this.f105403zoijcleaow;
    }
}
