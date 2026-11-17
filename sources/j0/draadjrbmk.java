package j0;

/* JADX INFO: loaded from: classes.dex */
public final class draadjrbmk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final gtknphoqwx f50151iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f50152ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f50153zoijcleaow;

    public draadjrbmk(gtknphoqwx gtknphoqwxVar, int i13, int i14) {
        this.f50151iobyxmoadg = gtknphoqwxVar;
        this.f50153zoijcleaow = i13;
        this.f50152ppxfxbqfkf = i14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof draadjrbmk)) {
            return false;
        }
        draadjrbmk draadjrbmkVar = (draadjrbmk) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f50151iobyxmoadg, draadjrbmkVar.f50151iobyxmoadg) && this.f50153zoijcleaow == draadjrbmkVar.f50153zoijcleaow && this.f50152ppxfxbqfkf == draadjrbmkVar.f50152ppxfxbqfkf;
    }

    public int hashCode() {
        return (((this.f50151iobyxmoadg.hashCode() * 31) + Integer.hashCode(this.f50153zoijcleaow)) * 31) + Integer.hashCode(this.f50152ppxfxbqfkf);
    }

    public final gtknphoqwx iobyxmoadg() {
        return this.f50151iobyxmoadg;
    }

    public final int ppxfxbqfkf() {
        return this.f50152ppxfxbqfkf;
    }

    public String toString() {
        return "BulletSpanWithLevel(bullet=" + this.f50151iobyxmoadg + ", indentationLevel=" + this.f50153zoijcleaow + ", start=" + this.f50152ppxfxbqfkf + ')';
    }

    public final int zoijcleaow() {
        return this.f50153zoijcleaow;
    }
}
