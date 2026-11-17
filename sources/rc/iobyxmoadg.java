package rc;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class iobyxmoadg extends draadjrbmk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f82524iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f82525zoijcleaow;

    iobyxmoadg(String str, List list) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f82524iobyxmoadg = str;
        if (list == null) {
            throw new NullPointerException("Null usedDates");
        }
        this.f82525zoijcleaow = list;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof draadjrbmk)) {
            return false;
        }
        draadjrbmk draadjrbmkVar = (draadjrbmk) obj;
        return this.f82524iobyxmoadg.equals(draadjrbmkVar.ppxfxbqfkf()) && this.f82525zoijcleaow.equals(draadjrbmkVar.zoijcleaow());
    }

    public int hashCode() {
        return ((this.f82524iobyxmoadg.hashCode() ^ 1000003) * 1000003) ^ this.f82525zoijcleaow.hashCode();
    }

    @Override // rc.draadjrbmk
    public String ppxfxbqfkf() {
        return this.f82524iobyxmoadg;
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f82524iobyxmoadg + ", usedDates=" + this.f82525zoijcleaow + "}";
    }

    @Override // rc.draadjrbmk
    public List zoijcleaow() {
        return this.f82525zoijcleaow;
    }
}
