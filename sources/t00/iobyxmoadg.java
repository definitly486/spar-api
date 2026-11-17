package t00;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.models.Warning;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f109226iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Warning f109227zoijcleaow;

    public iobyxmoadg(List productList, Warning warning) {
        zdlpuopuiu.btonecajqb(productList, "productList");
        zdlpuopuiu.btonecajqb(warning, "warning");
        this.f109226iobyxmoadg = productList;
        this.f109227zoijcleaow = warning;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f109226iobyxmoadg, iobyxmoadgVar.f109226iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f109227zoijcleaow, iobyxmoadgVar.f109227zoijcleaow);
    }

    public int hashCode() {
        return (this.f109226iobyxmoadg.hashCode() * 31) + this.f109227zoijcleaow.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f109226iobyxmoadg;
    }

    public String toString() {
        return "AddComboToCartResult(productList=" + this.f109226iobyxmoadg + ", warning=" + this.f109227zoijcleaow + ")";
    }

    public final Warning zoijcleaow() {
        return this.f109227zoijcleaow;
    }
}
