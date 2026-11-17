package dc;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class esjtqupxsv extends iozdgvuglv.eablkybsjg.wkgbmnqykc.gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f27469iobyxmoadg;

    static final class zoijcleaow extends iozdgvuglv.eablkybsjg.wkgbmnqykc.gxszxtbevo.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private List f27470iobyxmoadg;

        zoijcleaow() {
        }

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.gxszxtbevo.iobyxmoadg
        public iozdgvuglv.eablkybsjg.wkgbmnqykc.gxszxtbevo iobyxmoadg() {
            List list = this.f27470iobyxmoadg;
            if (list != null) {
                return new esjtqupxsv(list);
            }
            throw new IllegalStateException("Missing required properties: rolloutAssignments");
        }

        @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.gxszxtbevo.iobyxmoadg
        public iozdgvuglv.eablkybsjg.wkgbmnqykc.gxszxtbevo.iobyxmoadg zoijcleaow(List list) {
            if (list == null) {
                throw new NullPointerException("Null rolloutAssignments");
            }
            this.f27470iobyxmoadg = list;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iozdgvuglv.eablkybsjg.wkgbmnqykc.gxszxtbevo) {
            return this.f27469iobyxmoadg.equals(((iozdgvuglv.eablkybsjg.wkgbmnqykc.gxszxtbevo) obj).zoijcleaow());
        }
        return false;
    }

    public int hashCode() {
        return this.f27469iobyxmoadg.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f27469iobyxmoadg + "}";
    }

    @Override // dc.iozdgvuglv.eablkybsjg.wkgbmnqykc.gxszxtbevo
    public List zoijcleaow() {
        return this.f27469iobyxmoadg;
    }

    private esjtqupxsv(List list) {
        this.f27469iobyxmoadg = list;
    }
}
