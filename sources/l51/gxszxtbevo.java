package l51;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f61636iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f61637ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f61638wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f61639zoijcleaow;

    public gxszxtbevo(boolean z13, boolean z14, List intervalUiModelItems, boolean z15) {
        zdlpuopuiu.btonecajqb(intervalUiModelItems, "intervalUiModelItems");
        this.f61636iobyxmoadg = z13;
        this.f61639zoijcleaow = z14;
        this.f61637ppxfxbqfkf = intervalUiModelItems;
        this.f61638wkgbmnqykc = z15;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return this.f61636iobyxmoadg == gxszxtbevoVar.f61636iobyxmoadg && this.f61639zoijcleaow == gxszxtbevoVar.f61639zoijcleaow && zdlpuopuiu.eablkybsjg(this.f61637ppxfxbqfkf, gxszxtbevoVar.f61637ppxfxbqfkf) && this.f61638wkgbmnqykc == gxszxtbevoVar.f61638wkgbmnqykc;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.f61636iobyxmoadg) * 31) + Boolean.hashCode(this.f61639zoijcleaow)) * 31) + this.f61637ppxfxbqfkf.hashCode()) * 31) + Boolean.hashCode(this.f61638wkgbmnqykc);
    }

    public final boolean iobyxmoadg() {
        return this.f61639zoijcleaow;
    }

    public final boolean ppxfxbqfkf() {
        return this.f61638wkgbmnqykc;
    }

    public String toString() {
        return "Model(isLoading=" + this.f61636iobyxmoadg + ", confirmProgress=" + this.f61639zoijcleaow + ", intervalUiModelItems=" + this.f61637ppxfxbqfkf + ", isBtnContinueEnabled=" + this.f61638wkgbmnqykc + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f61636iobyxmoadg;
    }

    public final List zoijcleaow() {
        return this.f61637ppxfxbqfkf;
    }
}
