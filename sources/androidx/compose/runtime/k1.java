package androidx.compose.runtime;

/* JADX INFO: loaded from: classes.dex */
public final class k1 implements n1 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Object f5710iobyxmoadg;

    public k1(Object obj) {
        this.f5710iobyxmoadg = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k1) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f5710iobyxmoadg, ((k1) obj).f5710iobyxmoadg);
    }

    public int hashCode() {
        Object obj = this.f5710iobyxmoadg;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // androidx.compose.runtime.n1
    public Object iobyxmoadg(jrbgnlbqoe jrbgnlbqoeVar) {
        return this.f5710iobyxmoadg;
    }

    public String toString() {
        return "StaticValueHolder(value=" + this.f5710iobyxmoadg + ')';
    }

    public final Object zoijcleaow() {
        return this.f5710iobyxmoadg;
    }
}
