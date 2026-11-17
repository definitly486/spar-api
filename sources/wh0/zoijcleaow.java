package wh0;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f119903iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f119904zoijcleaow;

    public zoijcleaow(String information, int i13) {
        zdlpuopuiu.btonecajqb(information, "information");
        this.f119903iobyxmoadg = information;
        this.f119904zoijcleaow = i13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f119903iobyxmoadg, zoijcleaowVar.f119903iobyxmoadg) && this.f119904zoijcleaow == zoijcleaowVar.f119904zoijcleaow;
    }

    public int hashCode() {
        return (this.f119903iobyxmoadg.hashCode() * 31) + Integer.hashCode(this.f119904zoijcleaow);
    }

    public final int iobyxmoadg() {
        return this.f119904zoijcleaow;
    }

    public String toString() {
        return "CardUiModel(information=" + this.f119903iobyxmoadg + ", bonuses=" + this.f119904zoijcleaow + ")";
    }

    public final String zoijcleaow() {
        return this.f119903iobyxmoadg;
    }
}
