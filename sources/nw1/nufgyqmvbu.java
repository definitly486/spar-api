package nw1;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f71298iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f71299zoijcleaow;

    public nufgyqmvbu(List notifications, List subscriptions) {
        zdlpuopuiu.btonecajqb(notifications, "notifications");
        zdlpuopuiu.btonecajqb(subscriptions, "subscriptions");
        this.f71298iobyxmoadg = notifications;
        this.f71299zoijcleaow = subscriptions;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nufgyqmvbu)) {
            return false;
        }
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
        return zdlpuopuiu.eablkybsjg(this.f71298iobyxmoadg, nufgyqmvbuVar.f71298iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f71299zoijcleaow, nufgyqmvbuVar.f71299zoijcleaow);
    }

    public int hashCode() {
        return (this.f71298iobyxmoadg.hashCode() * 31) + this.f71299zoijcleaow.hashCode();
    }

    public final List iobyxmoadg() {
        return this.f71298iobyxmoadg;
    }

    public String toString() {
        return "UserSettings(notifications=" + this.f71298iobyxmoadg + ", subscriptions=" + this.f71299zoijcleaow + ")";
    }

    public final List zoijcleaow() {
        return this.f71299zoijcleaow;
    }
}
