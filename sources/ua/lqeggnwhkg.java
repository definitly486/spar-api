package ua;

/* JADX INFO: loaded from: classes2.dex */
final class lqeggnwhkg extends ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f113051iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Long f113052zoijcleaow;

    /* synthetic */ lqeggnwhkg(String str, Long l13, gxszxtbevo gxszxtbevoVar) {
        this.f113051iobyxmoadg = str;
        this.f113052zoijcleaow = l13;
    }

    public final boolean equals(Object obj) {
        Long l13;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ppxfxbqfkf) {
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
            if (this.f113051iobyxmoadg.equals(ppxfxbqfkfVar.ppxfxbqfkf()) && ((l13 = this.f113052zoijcleaow) != null ? l13.equals(ppxfxbqfkfVar.zoijcleaow()) : ppxfxbqfkfVar.zoijcleaow() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f113051iobyxmoadg.hashCode() ^ 1000003;
        Long l13 = this.f113052zoijcleaow;
        return (iHashCode * 1000003) ^ (l13 == null ? 0 : l13.hashCode());
    }

    @Override // ua.ppxfxbqfkf
    public final String ppxfxbqfkf() {
        return this.f113051iobyxmoadg;
    }

    public final String toString() {
        return "IntegrityTokenRequest{nonce=" + this.f113051iobyxmoadg + ", cloudProjectNumber=" + this.f113052zoijcleaow + "}";
    }

    @Override // ua.ppxfxbqfkf
    public final Long zoijcleaow() {
        return this.f113052zoijcleaow;
    }
}
