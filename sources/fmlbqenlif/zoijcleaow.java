package fmlbqenlif;

import kotlin.jvm.internal.gtknphoqwx;

/* JADX INFO: loaded from: classes.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private int f34416iobyxmoadg;

    public zoijcleaow(int i13) {
        this.f34416iobyxmoadg = i13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zoijcleaow) && this.f34416iobyxmoadg == ((zoijcleaow) obj).f34416iobyxmoadg;
    }

    public int hashCode() {
        return Integer.hashCode(this.f34416iobyxmoadg);
    }

    public final int iobyxmoadg() {
        return this.f34416iobyxmoadg;
    }

    public final void ppxfxbqfkf(int i13) {
        this.f34416iobyxmoadg = i13;
    }

    public String toString() {
        return "DeltaCounter(count=" + this.f34416iobyxmoadg + ')';
    }

    public final void zoijcleaow(int i13) {
        this.f34416iobyxmoadg += i13;
    }

    public /* synthetic */ zoijcleaow(int i13, int i14, gtknphoqwx gtknphoqwxVar) {
        this((i14 & 1) != 0 ? 0 : i13);
    }
}
