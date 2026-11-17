package wa;

/* JADX INFO: loaded from: classes2.dex */
final class lqeggnwhkg extends nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long f119136iobyxmoadg;

    lqeggnwhkg(int i13, long j13) {
        this.f119136iobyxmoadg = j13;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nufgyqmvbu) {
            nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) obj;
            nufgyqmvbuVar.iobyxmoadg();
            if (this.f119136iobyxmoadg == nufgyqmvbuVar.zoijcleaow()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j13 = this.f119136iobyxmoadg;
        return ((int) (j13 ^ (j13 >>> 32))) ^ (-724379968);
    }

    @Override // wa.nufgyqmvbu
    public final int iobyxmoadg() {
        return 3;
    }

    public final String toString() {
        return "EventRecord{eventType=3, eventTimestamp=" + this.f119136iobyxmoadg + "}";
    }

    @Override // wa.nufgyqmvbu
    public final long zoijcleaow() {
        return this.f119136iobyxmoadg;
    }
}
