package t3;

/* JADX INFO: loaded from: classes.dex */
public final class hcddaimhww {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final hcddaimhww f109431ppxfxbqfkf = new hcddaimhww(0, 0);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final long f109432iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final long f109433zoijcleaow;

    public hcddaimhww(long j13, long j14) {
        this.f109432iobyxmoadg = j13;
        this.f109433zoijcleaow = j14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hcddaimhww.class != obj.getClass()) {
            return false;
        }
        hcddaimhww hcddaimhwwVar = (hcddaimhww) obj;
        return this.f109432iobyxmoadg == hcddaimhwwVar.f109432iobyxmoadg && this.f109433zoijcleaow == hcddaimhwwVar.f109433zoijcleaow;
    }

    public int hashCode() {
        return (((int) this.f109432iobyxmoadg) * 31) + ((int) this.f109433zoijcleaow);
    }

    public String toString() {
        return "[timeUs=" + this.f109432iobyxmoadg + ", position=" + this.f109433zoijcleaow + "]";
    }
}
