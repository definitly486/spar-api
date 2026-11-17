package da1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f27347iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f27348zoijcleaow;

    public zoijcleaow(String header, List items) {
        zdlpuopuiu.btonecajqb(header, "header");
        zdlpuopuiu.btonecajqb(items, "items");
        this.f27347iobyxmoadg = header;
        this.f27348zoijcleaow = items;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f27347iobyxmoadg, zoijcleaowVar.f27347iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f27348zoijcleaow, zoijcleaowVar.f27348zoijcleaow);
    }

    public int hashCode() {
        return (this.f27347iobyxmoadg.hashCode() * 31) + this.f27348zoijcleaow.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f27347iobyxmoadg;
    }

    public String toString() {
        return "CouponGroupsUiModel(header=" + this.f27347iobyxmoadg + ", items=" + this.f27348zoijcleaow + ")";
    }

    public final List zoijcleaow() {
        return this.f27348zoijcleaow;
    }
}
