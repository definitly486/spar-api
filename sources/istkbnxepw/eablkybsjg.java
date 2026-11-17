package istkbnxepw;

/* JADX INFO: loaded from: classes.dex */
final class eablkybsjg extends sflfametgt.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Throwable f49315iobyxmoadg;

    eablkybsjg(Throwable th2) {
        if (th2 == null) {
            throw new NullPointerException("Null error");
        }
        this.f49315iobyxmoadg = th2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sflfametgt.iobyxmoadg) {
            return this.f49315iobyxmoadg.equals(((sflfametgt.iobyxmoadg) obj).iobyxmoadg());
        }
        return false;
    }

    public int hashCode() {
        return this.f49315iobyxmoadg.hashCode() ^ 1000003;
    }

    @Override // istkbnxepw.sflfametgt.iobyxmoadg
    public Throwable iobyxmoadg() {
        return this.f49315iobyxmoadg;
    }

    public String toString() {
        return "ErrorWrapper{error=" + this.f49315iobyxmoadg + "}";
    }
}
