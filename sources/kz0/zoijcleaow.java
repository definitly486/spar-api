package kz0;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.models.Warning;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Warning.DailyLimit f61183iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Object f61184zoijcleaow;

    public zoijcleaow(Warning.DailyLimit dailyLimit, Object obj) {
        this.f61183iobyxmoadg = dailyLimit;
        this.f61184zoijcleaow = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return zdlpuopuiu.eablkybsjg(this.f61183iobyxmoadg, zoijcleaowVar.f61183iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f61184zoijcleaow, zoijcleaowVar.f61184zoijcleaow);
    }

    public int hashCode() {
        Warning.DailyLimit dailyLimit = this.f61183iobyxmoadg;
        int iHashCode = (dailyLimit == null ? 0 : dailyLimit.hashCode()) * 31;
        Object obj = this.f61184zoijcleaow;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final Warning.DailyLimit iobyxmoadg() {
        return this.f61183iobyxmoadg;
    }

    public String toString() {
        return "AddToBasketData(dailyLimitWarning=" + this.f61183iobyxmoadg + ", data=" + this.f61184zoijcleaow + ")";
    }
}
