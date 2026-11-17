package r9;

/* JADX INFO: loaded from: classes2.dex */
final class zoijcleaow extends lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final lqeggnwhkg.iobyxmoadg f82211iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final long f82212zoijcleaow;

    zoijcleaow(lqeggnwhkg.iobyxmoadg iobyxmoadgVar, long j13) {
        if (iobyxmoadgVar == null) {
            throw new NullPointerException("Null status");
        }
        this.f82211iobyxmoadg = iobyxmoadgVar;
        this.f82212zoijcleaow = j13;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return this.f82211iobyxmoadg.equals(lqeggnwhkgVar.ppxfxbqfkf()) && this.f82212zoijcleaow == lqeggnwhkgVar.zoijcleaow();
    }

    public int hashCode() {
        int iHashCode = (this.f82211iobyxmoadg.hashCode() ^ 1000003) * 1000003;
        long j13 = this.f82212zoijcleaow;
        return iHashCode ^ ((int) (j13 ^ (j13 >>> 32)));
    }

    @Override // r9.lqeggnwhkg
    public lqeggnwhkg.iobyxmoadg ppxfxbqfkf() {
        return this.f82211iobyxmoadg;
    }

    public String toString() {
        return "BackendResponse{status=" + this.f82211iobyxmoadg + ", nextRequestWaitMillis=" + this.f82212zoijcleaow + "}";
    }

    @Override // r9.lqeggnwhkg
    public long zoijcleaow() {
        return this.f82212zoijcleaow;
    }
}
