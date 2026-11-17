package skhdrjzrfn;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final long f107431iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final long f107432zoijcleaow;

    public /* synthetic */ i(long j13, long j14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(j13, j14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return h.oipsdeybqn.ojitshcjhn(this.f107431iobyxmoadg, iVar.f107431iobyxmoadg) && h.oipsdeybqn.ojitshcjhn(this.f107432zoijcleaow, iVar.f107432zoijcleaow);
    }

    public int hashCode() {
        return (h.oipsdeybqn.yggfygwlhe(this.f107431iobyxmoadg) * 31) + h.oipsdeybqn.yggfygwlhe(this.f107432zoijcleaow);
    }

    public final long iobyxmoadg() {
        return this.f107432zoijcleaow;
    }

    public String toString() {
        return "SelectionColors(selectionHandleColor=" + ((Object) h.oipsdeybqn.jyumaefscl(this.f107431iobyxmoadg)) + ", selectionBackgroundColor=" + ((Object) h.oipsdeybqn.jyumaefscl(this.f107432zoijcleaow)) + ')';
    }

    public final long zoijcleaow() {
        return this.f107431iobyxmoadg;
    }

    private i(long j13, long j14) {
        this.f107431iobyxmoadg = j13;
        this.f107432zoijcleaow = j14;
    }
}
