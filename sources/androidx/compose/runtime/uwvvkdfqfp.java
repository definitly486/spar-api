package androidx.compose.runtime;

/* JADX INFO: loaded from: classes.dex */
public final class uwvvkdfqfp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Object f6056iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Object f6057zoijcleaow;

    public uwvvkdfqfp(Object obj, Object obj2) {
        this.f6056iobyxmoadg = obj;
        this.f6057zoijcleaow = obj2;
    }

    private final int iobyxmoadg(Object obj) {
        if (obj instanceof Enum) {
            return ((Enum) obj).ordinal();
        }
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uwvvkdfqfp)) {
            return false;
        }
        uwvvkdfqfp uwvvkdfqfpVar = (uwvvkdfqfp) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f6056iobyxmoadg, uwvvkdfqfpVar.f6056iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f6057zoijcleaow, uwvvkdfqfpVar.f6057zoijcleaow);
    }

    public int hashCode() {
        return (iobyxmoadg(this.f6056iobyxmoadg) * 31) + iobyxmoadg(this.f6057zoijcleaow);
    }

    public String toString() {
        return "JoinedKey(left=" + this.f6056iobyxmoadg + ", right=" + this.f6057zoijcleaow + ')';
    }
}
