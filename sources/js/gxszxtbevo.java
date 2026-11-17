package js;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import p0.tzroggbefp;

/* JADX INFO: loaded from: classes4.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f52257iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final tzroggbefp f52258ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f52259zoijcleaow;

    public gxszxtbevo(boolean z13, List cities, tzroggbefp searchValue) {
        zdlpuopuiu.btonecajqb(cities, "cities");
        zdlpuopuiu.btonecajqb(searchValue, "searchValue");
        this.f52257iobyxmoadg = z13;
        this.f52259zoijcleaow = cities;
        this.f52258ppxfxbqfkf = searchValue;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return this.f52257iobyxmoadg == gxszxtbevoVar.f52257iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f52259zoijcleaow, gxszxtbevoVar.f52259zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f52258ppxfxbqfkf, gxszxtbevoVar.f52258ppxfxbqfkf);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f52257iobyxmoadg) * 31) + this.f52259zoijcleaow.hashCode()) * 31) + this.f52258ppxfxbqfkf.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f52259zoijcleaow;
    }

    public final boolean ppxfxbqfkf() {
        return this.f52257iobyxmoadg;
    }

    public String toString() {
        return "Model(isLoading=" + this.f52257iobyxmoadg + ", cities=" + this.f52259zoijcleaow + ", searchValue=" + this.f52258ppxfxbqfkf + ")";
    }

    public final tzroggbefp zoijcleaow() {
        return this.f52258ppxfxbqfkf;
    }
}
