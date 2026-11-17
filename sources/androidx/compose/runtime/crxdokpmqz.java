package androidx.compose.runtime;

/* JADX INFO: loaded from: classes.dex */
public final class crxdokpmqz implements n1 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iwxlajgraz f5544iobyxmoadg;

    public crxdokpmqz(iwxlajgraz iwxlajgrazVar) {
        this.f5544iobyxmoadg = iwxlajgrazVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof crxdokpmqz) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f5544iobyxmoadg, ((crxdokpmqz) obj).f5544iobyxmoadg);
    }

    public int hashCode() {
        return this.f5544iobyxmoadg.hashCode();
    }

    @Override // androidx.compose.runtime.n1
    public Object iobyxmoadg(jrbgnlbqoe jrbgnlbqoeVar) {
        return this.f5544iobyxmoadg.getValue();
    }

    public String toString() {
        return "DynamicValueHolder(state=" + this.f5544iobyxmoadg + ')';
    }

    public final iwxlajgraz zoijcleaow() {
        return this.f5544iobyxmoadg;
    }
}
