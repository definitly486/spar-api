package em0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f31547iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f31548ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final cm0.gxszxtbevo f31549wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final hm0.ppxfxbqfkf f31550zoijcleaow;

    public gxszxtbevo(boolean z13, hm0.ppxfxbqfkf searchInput, List scrollableContent, cm0.gxszxtbevo gxszxtbevoVar) {
        zdlpuopuiu.btonecajqb(searchInput, "searchInput");
        zdlpuopuiu.btonecajqb(scrollableContent, "scrollableContent");
        this.f31547iobyxmoadg = z13;
        this.f31550zoijcleaow = searchInput;
        this.f31548ppxfxbqfkf = scrollableContent;
        this.f31549wkgbmnqykc = gxszxtbevoVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return this.f31547iobyxmoadg == gxszxtbevoVar.f31547iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f31550zoijcleaow, gxszxtbevoVar.f31550zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f31548ppxfxbqfkf, gxszxtbevoVar.f31548ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f31549wkgbmnqykc, gxszxtbevoVar.f31549wkgbmnqykc);
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.f31547iobyxmoadg) * 31) + this.f31550zoijcleaow.hashCode()) * 31) + this.f31548ppxfxbqfkf.hashCode()) * 31;
        cm0.gxszxtbevo gxszxtbevoVar = this.f31549wkgbmnqykc;
        return iHashCode + (gxszxtbevoVar == null ? 0 : gxszxtbevoVar.hashCode());
    }

    public final List iobyxmoadg() {
        return this.f31548ppxfxbqfkf;
    }

    public final cm0.gxszxtbevo ppxfxbqfkf() {
        return this.f31549wkgbmnqykc;
    }

    public String toString() {
        return "Model(isLoading=" + this.f31547iobyxmoadg + ", searchInput=" + this.f31550zoijcleaow + ", scrollableContent=" + this.f31548ppxfxbqfkf + ", warning=" + this.f31549wkgbmnqykc + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f31547iobyxmoadg;
    }

    public final hm0.ppxfxbqfkf zoijcleaow() {
        return this.f31550zoijcleaow;
    }
}
