package istkbnxepw;

/* JADX INFO: loaded from: classes.dex */
final class zoijcleaow extends hkdspvbjdz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Object f49449iobyxmoadg;

    zoijcleaow(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null value");
        }
        this.f49449iobyxmoadg = obj;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hkdspvbjdz) {
            return this.f49449iobyxmoadg.equals(((hkdspvbjdz) obj).zoijcleaow());
        }
        return false;
    }

    public int hashCode() {
        return this.f49449iobyxmoadg.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Identifier{value=" + this.f49449iobyxmoadg + "}";
    }

    @Override // istkbnxepw.hkdspvbjdz
    public Object zoijcleaow() {
        return this.f49449iobyxmoadg;
    }
}
