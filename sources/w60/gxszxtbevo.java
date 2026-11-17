package w60;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f118871iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final List f118872ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f118873wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f118874zoijcleaow;

    public gxszxtbevo(boolean z13, boolean z14, List intervalUiModelItems, boolean z15) {
        zdlpuopuiu.btonecajqb(intervalUiModelItems, "intervalUiModelItems");
        this.f118871iobyxmoadg = z13;
        this.f118874zoijcleaow = z14;
        this.f118872ppxfxbqfkf = intervalUiModelItems;
        this.f118873wkgbmnqykc = z15;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return this.f118871iobyxmoadg == gxszxtbevoVar.f118871iobyxmoadg && this.f118874zoijcleaow == gxszxtbevoVar.f118874zoijcleaow && zdlpuopuiu.eablkybsjg(this.f118872ppxfxbqfkf, gxszxtbevoVar.f118872ppxfxbqfkf) && this.f118873wkgbmnqykc == gxszxtbevoVar.f118873wkgbmnqykc;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.f118871iobyxmoadg) * 31) + Boolean.hashCode(this.f118874zoijcleaow)) * 31) + this.f118872ppxfxbqfkf.hashCode()) * 31) + Boolean.hashCode(this.f118873wkgbmnqykc);
    }

    public final boolean iobyxmoadg() {
        return this.f118874zoijcleaow;
    }

    public final boolean ppxfxbqfkf() {
        return this.f118873wkgbmnqykc;
    }

    public String toString() {
        return "Model(isLoading=" + this.f118871iobyxmoadg + ", confirmProgress=" + this.f118874zoijcleaow + ", intervalUiModelItems=" + this.f118872ppxfxbqfkf + ", isBtnContinueEnabled=" + this.f118873wkgbmnqykc + ")";
    }

    public final boolean wkgbmnqykc() {
        return this.f118871iobyxmoadg;
    }

    public final List zoijcleaow() {
        return this.f118872ppxfxbqfkf;
    }
}
