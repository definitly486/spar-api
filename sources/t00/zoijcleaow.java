package t00;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.models.Warning;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Warning.DailyLimit f109243iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Object f109244zoijcleaow;

    public zoijcleaow(Warning.DailyLimit dailyLimit, Object obj) {
        this.f109243iobyxmoadg = dailyLimit;
        this.f109244zoijcleaow = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f109243iobyxmoadg, zoijcleaowVar.f109243iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f109244zoijcleaow, zoijcleaowVar.f109244zoijcleaow);
    }

    public int hashCode() {
        Warning.DailyLimit dailyLimit = this.f109243iobyxmoadg;
        int iHashCode = (dailyLimit == null ? 0 : dailyLimit.hashCode()) * 31;
        Object obj = this.f109244zoijcleaow;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final Warning.DailyLimit iobyxmoadg() {
        return this.f109243iobyxmoadg;
    }

    public String toString() {
        return "AddToBasketData(dailyLimitWarning=" + this.f109243iobyxmoadg + ", data=" + this.f109244zoijcleaow + ")";
    }
}
