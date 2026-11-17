package pd;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class iobyxmoadg extends zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Set f76411iobyxmoadg;

    iobyxmoadg(Set set) {
        if (set == null) {
            throw new NullPointerException("Null updatedKeys");
        }
        this.f76411iobyxmoadg = set;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zoijcleaow) {
            return this.f76411iobyxmoadg.equals(((zoijcleaow) obj).zoijcleaow());
        }
        return false;
    }

    public int hashCode() {
        return this.f76411iobyxmoadg.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ConfigUpdate{updatedKeys=" + this.f76411iobyxmoadg + "}";
    }

    @Override // pd.zoijcleaow
    public Set zoijcleaow() {
        return this.f76411iobyxmoadg;
    }
}
