package x9;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zoijcleaow extends gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final aa.iobyxmoadg f121820iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Map f121821zoijcleaow;

    zoijcleaow(aa.iobyxmoadg iobyxmoadgVar, Map map) {
        if (iobyxmoadgVar == null) {
            throw new NullPointerException("Null clock");
        }
        this.f121820iobyxmoadg = iobyxmoadgVar;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f121821zoijcleaow = map;
    }

    @Override // x9.gxszxtbevo
    aa.iobyxmoadg eablkybsjg() {
        return this.f121820iobyxmoadg;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return this.f121820iobyxmoadg.equals(gxszxtbevoVar.eablkybsjg()) && this.f121821zoijcleaow.equals(gxszxtbevoVar.nufgyqmvbu());
    }

    public int hashCode() {
        return ((this.f121820iobyxmoadg.hashCode() ^ 1000003) * 1000003) ^ this.f121821zoijcleaow.hashCode();
    }

    @Override // x9.gxszxtbevo
    Map nufgyqmvbu() {
        return this.f121821zoijcleaow;
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f121820iobyxmoadg + ", values=" + this.f121821zoijcleaow + "}";
    }
}
