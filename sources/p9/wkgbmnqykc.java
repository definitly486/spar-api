package p9;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class wkgbmnqykc extends agtfadlqog {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f76163iobyxmoadg;

    wkgbmnqykc(List list) {
        if (list == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.f76163iobyxmoadg = list;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agtfadlqog) {
            return this.f76163iobyxmoadg.equals(((agtfadlqog) obj).ppxfxbqfkf());
        }
        return false;
    }

    public int hashCode() {
        return this.f76163iobyxmoadg.hashCode() ^ 1000003;
    }

    @Override // p9.agtfadlqog
    public List ppxfxbqfkf() {
        return this.f76163iobyxmoadg;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f76163iobyxmoadg + "}";
    }
}
