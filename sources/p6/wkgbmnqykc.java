package p6;

/* JADX INFO: loaded from: classes2.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f75783iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Long f75784zoijcleaow;

    public wkgbmnqykc(String key, Long l13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
        this.f75783iobyxmoadg = key;
        this.f75784zoijcleaow = l13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f75783iobyxmoadg, wkgbmnqykcVar.f75783iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f75784zoijcleaow, wkgbmnqykcVar.f75784zoijcleaow);
    }

    public int hashCode() {
        int iHashCode = this.f75783iobyxmoadg.hashCode() * 31;
        Long l13 = this.f75784zoijcleaow;
        return iHashCode + (l13 == null ? 0 : l13.hashCode());
    }

    public final String iobyxmoadg() {
        return this.f75783iobyxmoadg;
    }

    public String toString() {
        return "Preference(key=" + this.f75783iobyxmoadg + ", value=" + this.f75784zoijcleaow + ')';
    }

    public final Long zoijcleaow() {
        return this.f75784zoijcleaow;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(String key, boolean z13) {
        this(key, Long.valueOf(z13 ? 1L : 0L));
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
    }
}
