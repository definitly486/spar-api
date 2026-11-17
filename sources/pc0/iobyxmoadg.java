package pc0;

import hg.jyumaefscl;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f76381iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f76382zoijcleaow;

    public iobyxmoadg(int i13, List items) {
        zdlpuopuiu.btonecajqb(items, "items");
        this.f76381iobyxmoadg = i13;
        this.f76382zoijcleaow = items;
    }

    public static /* synthetic */ iobyxmoadg zoijcleaow(iobyxmoadg iobyxmoadgVar, int i13, List list, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = iobyxmoadgVar.f76381iobyxmoadg;
        }
        if ((i14 & 2) != 0) {
            list = iobyxmoadgVar.f76382zoijcleaow;
        }
        return iobyxmoadgVar.iobyxmoadg(i13, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return this.f76381iobyxmoadg == iobyxmoadgVar.f76381iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f76382zoijcleaow, iobyxmoadgVar.f76382zoijcleaow);
    }

    public int hashCode() {
        return (Integer.hashCode(this.f76381iobyxmoadg) * 31) + this.f76382zoijcleaow.hashCode();
    }

    public final iobyxmoadg iobyxmoadg(int i13, List items) {
        zdlpuopuiu.btonecajqb(items, "items");
        return new iobyxmoadg(i13, items);
    }

    public final int ppxfxbqfkf() {
        return this.f76381iobyxmoadg;
    }

    public String toString() {
        return "NotificationPageUiModel(id=" + this.f76381iobyxmoadg + ", items=" + this.f76382zoijcleaow + ")";
    }

    public final List wkgbmnqykc() {
        return this.f76382zoijcleaow;
    }

    public /* synthetic */ iobyxmoadg(int i13, List list, int i14, gtknphoqwx gtknphoqwxVar) {
        this((i14 & 1) != 0 ? 0 : i13, (i14 & 2) != 0 ? jyumaefscl.wflxmlrfwp() : list);
    }
}
