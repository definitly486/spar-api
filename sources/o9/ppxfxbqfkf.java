package o9;

/* JADX INFO: loaded from: classes2.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f72343iobyxmoadg;

    private ppxfxbqfkf(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f72343iobyxmoadg = str;
    }

    public static ppxfxbqfkf zoijcleaow(String str) {
        return new ppxfxbqfkf(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ppxfxbqfkf) {
            return this.f72343iobyxmoadg.equals(((ppxfxbqfkf) obj).f72343iobyxmoadg);
        }
        return false;
    }

    public int hashCode() {
        return this.f72343iobyxmoadg.hashCode() ^ 1000003;
    }

    public String iobyxmoadg() {
        return this.f72343iobyxmoadg;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f72343iobyxmoadg + "\"}";
    }
}
