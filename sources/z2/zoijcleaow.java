package z2;

import v2.jyumaefscl;

/* JADX INFO: loaded from: classes.dex */
public final class zoijcleaow implements jyumaefscl.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final int f127714iobyxmoadg;

    public zoijcleaow(int i13) {
        this.f127714iobyxmoadg = i13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zoijcleaow) && this.f127714iobyxmoadg == ((zoijcleaow) obj).f127714iobyxmoadg;
    }

    public int hashCode() {
        return this.f127714iobyxmoadg;
    }

    public String toString() {
        return "Mp4AlternateGroup: " + this.f127714iobyxmoadg;
    }
}
