package j8;

/* JADX INFO: loaded from: classes2.dex */
public final class dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f50836iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f50837zoijcleaow;

    public dxjokdxxww(int i13, int i14) {
        this.f50836iobyxmoadg = i13;
        this.f50837zoijcleaow = i14;
        if (!ppxfxbqfkf.ppxfxbqfkf(i13)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!ppxfxbqfkf.ppxfxbqfkf(i14)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxjokdxxww)) {
            return false;
        }
        dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
        return this.f50836iobyxmoadg == dxjokdxxwwVar.f50836iobyxmoadg && this.f50837zoijcleaow == dxjokdxxwwVar.f50837zoijcleaow;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f50836iobyxmoadg) * 31) + Integer.hashCode(this.f50837zoijcleaow);
    }

    public final int iobyxmoadg() {
        return this.f50837zoijcleaow;
    }

    public String toString() {
        return "Size(width=" + this.f50836iobyxmoadg + ", height=" + this.f50837zoijcleaow + ')';
    }

    public final int zoijcleaow() {
        return this.f50836iobyxmoadg;
    }
}
