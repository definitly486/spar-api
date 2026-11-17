package co1;

import hg.jyumaefscl;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.scango.impl.component.domain.model.cart.ScanGoCartModel;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final List f20249eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ScanGoCartModel f20250iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final bo1.zoijcleaow f20251ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f20252wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f20253zoijcleaow;

    public iobyxmoadg(ScanGoCartModel scanGoCartModel, boolean z13, bo1.zoijcleaow zoijcleaowVar, String str, List warnings) {
        zdlpuopuiu.btonecajqb(warnings, "warnings");
        this.f20250iobyxmoadg = scanGoCartModel;
        this.f20253zoijcleaow = z13;
        this.f20251ppxfxbqfkf = zoijcleaowVar;
        this.f20252wkgbmnqykc = str;
        this.f20249eablkybsjg = warnings;
    }

    public final boolean eablkybsjg() {
        return this.f20253zoijcleaow;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f20250iobyxmoadg, iobyxmoadgVar.f20250iobyxmoadg) && this.f20253zoijcleaow == iobyxmoadgVar.f20253zoijcleaow && this.f20251ppxfxbqfkf == iobyxmoadgVar.f20251ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f20252wkgbmnqykc, iobyxmoadgVar.f20252wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f20249eablkybsjg, iobyxmoadgVar.f20249eablkybsjg);
    }

    public int hashCode() {
        ScanGoCartModel scanGoCartModel = this.f20250iobyxmoadg;
        int iHashCode = (((scanGoCartModel == null ? 0 : scanGoCartModel.hashCode()) * 31) + Boolean.hashCode(this.f20253zoijcleaow)) * 31;
        bo1.zoijcleaow zoijcleaowVar = this.f20251ppxfxbqfkf;
        int iHashCode2 = (iHashCode + (zoijcleaowVar == null ? 0 : zoijcleaowVar.hashCode())) * 31;
        String str = this.f20252wkgbmnqykc;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.f20249eablkybsjg.hashCode();
    }

    public final ScanGoCartModel iobyxmoadg() {
        return this.f20250iobyxmoadg;
    }

    public final String ppxfxbqfkf() {
        return this.f20252wkgbmnqykc;
    }

    public String toString() {
        return "ScanGoCartResponseModel(cartModel=" + this.f20250iobyxmoadg + ", isSuccessful=" + this.f20253zoijcleaow + ", error=" + this.f20251ppxfxbqfkf + ", errorMessage=" + this.f20252wkgbmnqykc + ", warnings=" + this.f20249eablkybsjg + ")";
    }

    public final List wkgbmnqykc() {
        return this.f20249eablkybsjg;
    }

    public final bo1.zoijcleaow zoijcleaow() {
        return this.f20251ppxfxbqfkf;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ iobyxmoadg(ScanGoCartModel scanGoCartModel, boolean z13, bo1.zoijcleaow zoijcleaowVar, String str, List list, int i13, gtknphoqwx gtknphoqwxVar) {
        ScanGoCartModel scanGoCartModel2 = (i13 & 1) != 0 ? null : scanGoCartModel;
        if ((i13 & 2) != 0) {
            z13 = scanGoCartModel2 != null;
        }
        this(scanGoCartModel2, z13, (i13 & 4) != 0 ? null : zoijcleaowVar, (i13 & 8) == 0 ? str : null, (i13 & 16) != 0 ? jyumaefscl.wflxmlrfwp() : list);
    }
}
