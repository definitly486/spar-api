package o7;

/* JADX INFO: loaded from: classes2.dex */
public class dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    Object f72187iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    Object f72188zoijcleaow;

    private static boolean iobyxmoadg(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof u1.ppxfxbqfkf)) {
            return false;
        }
        u1.ppxfxbqfkf ppxfxbqfkfVar = (u1.ppxfxbqfkf) obj;
        return iobyxmoadg(ppxfxbqfkfVar.f112467iobyxmoadg, this.f72187iobyxmoadg) && iobyxmoadg(ppxfxbqfkfVar.f112468zoijcleaow, this.f72188zoijcleaow);
    }

    public int hashCode() {
        Object obj = this.f72187iobyxmoadg;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f72188zoijcleaow;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f72187iobyxmoadg + " " + this.f72188zoijcleaow + "}";
    }

    public void zoijcleaow(Object obj, Object obj2) {
        this.f72187iobyxmoadg = obj;
        this.f72188zoijcleaow = obj2;
    }
}
