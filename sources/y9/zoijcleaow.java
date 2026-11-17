package y9;

/* JADX INFO: loaded from: classes2.dex */
final class zoijcleaow extends gtknphoqwx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long f124176iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final q9.dxjokdxxww f124177ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final q9.rgvfuqvkyq f124178zoijcleaow;

    zoijcleaow(long j13, q9.rgvfuqvkyq rgvfuqvkyqVar, q9.dxjokdxxww dxjokdxxwwVar) {
        this.f124176iobyxmoadg = j13;
        if (rgvfuqvkyqVar == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f124178zoijcleaow = rgvfuqvkyqVar;
        if (dxjokdxxwwVar == null) {
            throw new NullPointerException("Null event");
        }
        this.f124177ppxfxbqfkf = dxjokdxxwwVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gtknphoqwx)) {
            return false;
        }
        gtknphoqwx gtknphoqwxVar = (gtknphoqwx) obj;
        return this.f124176iobyxmoadg == gtknphoqwxVar.ppxfxbqfkf() && this.f124178zoijcleaow.equals(gtknphoqwxVar.wkgbmnqykc()) && this.f124177ppxfxbqfkf.equals(gtknphoqwxVar.zoijcleaow());
    }

    public int hashCode() {
        long j13 = this.f124176iobyxmoadg;
        return ((((((int) (j13 ^ (j13 >>> 32))) ^ 1000003) * 1000003) ^ this.f124178zoijcleaow.hashCode()) * 1000003) ^ this.f124177ppxfxbqfkf.hashCode();
    }

    @Override // y9.gtknphoqwx
    public long ppxfxbqfkf() {
        return this.f124176iobyxmoadg;
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f124176iobyxmoadg + ", transportContext=" + this.f124178zoijcleaow + ", event=" + this.f124177ppxfxbqfkf + "}";
    }

    @Override // y9.gtknphoqwx
    public q9.rgvfuqvkyq wkgbmnqykc() {
        return this.f124178zoijcleaow;
    }

    @Override // y9.gtknphoqwx
    public q9.dxjokdxxww zoijcleaow() {
        return this.f124177ppxfxbqfkf;
    }
}
