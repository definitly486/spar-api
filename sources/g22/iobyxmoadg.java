package g22;

import hg.jyumaefscl;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.scango.impl.component.domain.model.cart.ScanGoCartModel;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final List f35874eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ScanGoCartModel f35875iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final f22.zoijcleaow f35876ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f35877wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f35878zoijcleaow;

    public iobyxmoadg(ScanGoCartModel scanGoCartModel, boolean z13, f22.zoijcleaow zoijcleaowVar, String str, List warnings) {
        zdlpuopuiu.btonecajqb(warnings, "warnings");
        this.f35875iobyxmoadg = scanGoCartModel;
        this.f35878zoijcleaow = z13;
        this.f35876ppxfxbqfkf = zoijcleaowVar;
        this.f35877wkgbmnqykc = str;
        this.f35874eablkybsjg = warnings;
    }

    public final boolean eablkybsjg() {
        return this.f35878zoijcleaow;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f35875iobyxmoadg, iobyxmoadgVar.f35875iobyxmoadg) && this.f35878zoijcleaow == iobyxmoadgVar.f35878zoijcleaow && this.f35876ppxfxbqfkf == iobyxmoadgVar.f35876ppxfxbqfkf && zdlpuopuiu.eablkybsjg(this.f35877wkgbmnqykc, iobyxmoadgVar.f35877wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f35874eablkybsjg, iobyxmoadgVar.f35874eablkybsjg);
    }

    public int hashCode() {
        ScanGoCartModel scanGoCartModel = this.f35875iobyxmoadg;
        int iHashCode = (((scanGoCartModel == null ? 0 : scanGoCartModel.hashCode()) * 31) + Boolean.hashCode(this.f35878zoijcleaow)) * 31;
        f22.zoijcleaow zoijcleaowVar = this.f35876ppxfxbqfkf;
        int iHashCode2 = (iHashCode + (zoijcleaowVar == null ? 0 : zoijcleaowVar.hashCode())) * 31;
        String str = this.f35877wkgbmnqykc;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.f35874eablkybsjg.hashCode();
    }

    public final ScanGoCartModel iobyxmoadg() {
        return this.f35875iobyxmoadg;
    }

    public final String ppxfxbqfkf() {
        return this.f35877wkgbmnqykc;
    }

    public String toString() {
        return "ScanGoCartResponseModel(cartModel=" + this.f35875iobyxmoadg + ", isSuccessful=" + this.f35878zoijcleaow + ", error=" + this.f35876ppxfxbqfkf + ", errorMessage=" + this.f35877wkgbmnqykc + ", warnings=" + this.f35874eablkybsjg + ")";
    }

    public final List wkgbmnqykc() {
        return this.f35874eablkybsjg;
    }

    public final f22.zoijcleaow zoijcleaow() {
        return this.f35876ppxfxbqfkf;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ iobyxmoadg(ScanGoCartModel scanGoCartModel, boolean z13, f22.zoijcleaow zoijcleaowVar, String str, List list, int i13, gtknphoqwx gtknphoqwxVar) {
        ScanGoCartModel scanGoCartModel2 = (i13 & 1) != 0 ? null : scanGoCartModel;
        if ((i13 & 2) != 0) {
            z13 = scanGoCartModel2 != null;
        }
        this(scanGoCartModel2, z13, (i13 & 4) != 0 ? null : zoijcleaowVar, (i13 & 8) == 0 ? str : null, (i13 & 16) != 0 ? jyumaefscl.wflxmlrfwp() : list);
    }
}
