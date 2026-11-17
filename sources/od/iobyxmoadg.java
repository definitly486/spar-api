package od;

/* JADX INFO: loaded from: classes2.dex */
final class iobyxmoadg extends gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f72607iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f72608zoijcleaow;

    iobyxmoadg(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f72607iobyxmoadg = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f72608zoijcleaow = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gxszxtbevo)) {
            return false;
        }
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
        return this.f72607iobyxmoadg.equals(gxszxtbevoVar.zoijcleaow()) && this.f72608zoijcleaow.equals(gxszxtbevoVar.ppxfxbqfkf());
    }

    public int hashCode() {
        return ((this.f72607iobyxmoadg.hashCode() ^ 1000003) * 1000003) ^ this.f72608zoijcleaow.hashCode();
    }

    @Override // od.gxszxtbevo
    public String ppxfxbqfkf() {
        return this.f72608zoijcleaow;
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f72607iobyxmoadg + ", version=" + this.f72608zoijcleaow + "}";
    }

    @Override // od.gxszxtbevo
    public String zoijcleaow() {
        return this.f72607iobyxmoadg;
    }
}
