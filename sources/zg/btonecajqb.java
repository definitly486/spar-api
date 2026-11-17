package zg;

/* JADX INFO: loaded from: classes3.dex */
public final class btonecajqb extends nufgyqmvbu implements lqeggnwhkg {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final iobyxmoadg f129919cqumvgiudr = new iobyxmoadg(null);

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final btonecajqb f129920esjtqupxsv = new btonecajqb(1, 0);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final btonecajqb iobyxmoadg() {
            return btonecajqb.f129920esjtqupxsv;
        }

        private iobyxmoadg() {
        }
    }

    public btonecajqb(int i13, int i14) {
        super(i13, i14, 1);
    }

    public Integer draadjrbmk() {
        return Integer.valueOf(eablkybsjg());
    }

    @Override // zg.nufgyqmvbu
    public boolean equals(Object obj) {
        if (obj instanceof btonecajqb) {
            if (!isEmpty() || !((btonecajqb) obj).isEmpty()) {
                btonecajqb btonecajqbVar = (btonecajqb) obj;
                if (wkgbmnqykc() != btonecajqbVar.wkgbmnqykc() || eablkybsjg() != btonecajqbVar.eablkybsjg()) {
                }
            }
            return true;
        }
        return false;
    }

    public boolean gtknphoqwx(int i13) {
        return wkgbmnqykc() <= i13 && i13 <= eablkybsjg();
    }

    @Override // zg.nufgyqmvbu
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (wkgbmnqykc() * 31) + eablkybsjg();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zg.lqeggnwhkg
    public /* bridge */ /* synthetic */ boolean iobyxmoadg(Comparable comparable) {
        return gtknphoqwx(((Number) comparable).intValue());
    }

    @Override // zg.nufgyqmvbu
    public boolean isEmpty() {
        return wkgbmnqykc() > eablkybsjg();
    }

    @Override // zg.nufgyqmvbu
    public String toString() {
        return wkgbmnqykc() + ".." + eablkybsjg();
    }

    public Integer wflxmlrfwp() {
        return Integer.valueOf(wkgbmnqykc());
    }
}
