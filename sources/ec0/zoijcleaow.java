package ec0;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f31110iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f31111zoijcleaow;

    public zoijcleaow(String header, List items) {
        zdlpuopuiu.btonecajqb(header, "header");
        zdlpuopuiu.btonecajqb(items, "items");
        this.f31110iobyxmoadg = header;
        this.f31111zoijcleaow = items;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f31110iobyxmoadg, zoijcleaowVar.f31110iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f31111zoijcleaow, zoijcleaowVar.f31111zoijcleaow);
    }

    public int hashCode() {
        return (this.f31110iobyxmoadg.hashCode() * 31) + this.f31111zoijcleaow.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f31110iobyxmoadg;
    }

    public String toString() {
        return "CouponGroupsUiModel(header=" + this.f31110iobyxmoadg + ", items=" + this.f31111zoijcleaow + ")";
    }

    public final List zoijcleaow() {
        return this.f31111zoijcleaow;
    }
}
