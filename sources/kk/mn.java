package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class mn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final int f57659iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final int f57660zoijcleaow;

    public mn(int i13, int i14) {
        this.f57659iobyxmoadg = i13;
        this.f57660zoijcleaow = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mn)) {
            return false;
        }
        mn mnVar = (mn) obj;
        return this.f57659iobyxmoadg == mnVar.f57659iobyxmoadg && this.f57660zoijcleaow == mnVar.f57660zoijcleaow;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f57660zoijcleaow) + (Integer.hashCode(this.f57659iobyxmoadg) * 31);
    }

    public final String toString() {
        return "SubstringIndexes(firstIndex=" + this.f57659iobyxmoadg + ", lastIndex=" + this.f57660zoijcleaow + ")";
    }
}
