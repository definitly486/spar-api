package hh1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f40372iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f40373zoijcleaow;

    public gxszxtbevo(String str, String str2) {
        this.f40372iobyxmoadg = str;
        this.f40373zoijcleaow = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return zdlpuopuiu.eablkybsjg(this.f40372iobyxmoadg, gxszxtbevoVar.f40372iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f40373zoijcleaow, gxszxtbevoVar.f40373zoijcleaow);
    }

    public int hashCode() {
        String str = this.f40372iobyxmoadg;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f40373zoijcleaow;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String iobyxmoadg() {
        return this.f40372iobyxmoadg;
    }

    public String toString() {
        return "BannerSubtitle(title=" + this.f40372iobyxmoadg + ", value=" + this.f40373zoijcleaow + ")";
    }

    public final String zoijcleaow() {
        return this.f40373zoijcleaow;
    }
}
