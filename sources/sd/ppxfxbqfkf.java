package sd;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class ppxfxbqfkf extends eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Set f106000iobyxmoadg;

    ppxfxbqfkf(Set set) {
        if (set == null) {
            throw new NullPointerException("Null rolloutAssignments");
        }
        this.f106000iobyxmoadg = set;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eablkybsjg) {
            return this.f106000iobyxmoadg.equals(((eablkybsjg) obj).zoijcleaow());
        }
        return false;
    }

    public int hashCode() {
        return this.f106000iobyxmoadg.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f106000iobyxmoadg + "}";
    }

    @Override // sd.eablkybsjg
    public Set zoijcleaow() {
        return this.f106000iobyxmoadg;
    }
}
