package u1;

/* JADX INFO: loaded from: classes.dex */
public class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final Object f112467iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final Object f112468zoijcleaow;

    public ppxfxbqfkf(Object obj, Object obj2) {
        this.f112467iobyxmoadg = obj;
        this.f112468zoijcleaow = obj2;
    }

    public static ppxfxbqfkf iobyxmoadg(Object obj, Object obj2) {
        return new ppxfxbqfkf(obj, obj2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return zoijcleaow.iobyxmoadg(ppxfxbqfkfVar.f112467iobyxmoadg, this.f112467iobyxmoadg) && zoijcleaow.iobyxmoadg(ppxfxbqfkfVar.f112468zoijcleaow, this.f112468zoijcleaow);
    }

    public int hashCode() {
        Object obj = this.f112467iobyxmoadg;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f112468zoijcleaow;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f112467iobyxmoadg + " " + this.f112468zoijcleaow + "}";
    }
}
