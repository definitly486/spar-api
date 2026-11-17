package zq0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes5.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f130931iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final tzroggbefp f130932ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f130933zoijcleaow;

    public gxszxtbevo(boolean z13, List cities, tzroggbefp searchValue) {
        zdlpuopuiu.btonecajqb(cities, "cities");
        zdlpuopuiu.btonecajqb(searchValue, "searchValue");
        this.f130931iobyxmoadg = z13;
        this.f130933zoijcleaow = cities;
        this.f130932ppxfxbqfkf = searchValue;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return this.f130931iobyxmoadg == gxszxtbevoVar.f130931iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f130933zoijcleaow, gxszxtbevoVar.f130933zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f130932ppxfxbqfkf, gxszxtbevoVar.f130932ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f130931iobyxmoadg) * 31) + this.f130933zoijcleaow.hashCode()) * 31) + this.f130932ppxfxbqfkf.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f130933zoijcleaow;
    }

    public final boolean ppxfxbqfkf() {
        return this.f130931iobyxmoadg;
    }

    public String toString() {
        return "Model(isLoading=" + this.f130931iobyxmoadg + ", cities=" + this.f130933zoijcleaow + ", searchValue=" + this.f130932ppxfxbqfkf + ")";
    }

    public final tzroggbefp zoijcleaow() {
        return this.f130932ppxfxbqfkf;
    }
}
