package qb2;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class wflxmlrfwp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final String f78470iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final Map f78471zoijcleaow;

    public wflxmlrfwp(Map eventData) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb("sdkInfo", "eventName");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(eventData, "eventData");
        this.f78470iobyxmoadg = "sdkInfo";
        this.f78471zoijcleaow = eventData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wflxmlrfwp)) {
            return false;
        }
        wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f78470iobyxmoadg, wflxmlrfwpVar.f78470iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f78471zoijcleaow, wflxmlrfwpVar.f78471zoijcleaow);
    }

    public final int hashCode() {
        return this.f78471zoijcleaow.hashCode() + (this.f78470iobyxmoadg.hashCode() * 31);
    }

    public final String toString() {
        return "ReviewAnalyticsEvent(eventName=" + this.f78470iobyxmoadg + ", eventData=" + this.f78471zoijcleaow + ')';
    }
}
