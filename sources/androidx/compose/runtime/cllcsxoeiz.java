package androidx.compose.runtime;

/* JADX INFO: loaded from: classes.dex */
public final class cllcsxoeiz implements n1 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final tg.draadjrbmk f5543iobyxmoadg;

    public cllcsxoeiz(tg.draadjrbmk draadjrbmkVar) {
        this.f5543iobyxmoadg = draadjrbmkVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cllcsxoeiz) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f5543iobyxmoadg, ((cllcsxoeiz) obj).f5543iobyxmoadg);
    }

    public int hashCode() {
        return this.f5543iobyxmoadg.hashCode();
    }

    @Override // androidx.compose.runtime.n1
    public Object iobyxmoadg(jrbgnlbqoe jrbgnlbqoeVar) {
        return this.f5543iobyxmoadg.invoke(jrbgnlbqoeVar);
    }

    public String toString() {
        return "ComputedValueHolder(compute=" + this.f5543iobyxmoadg + ')';
    }

    public final tg.draadjrbmk zoijcleaow() {
        return this.f5543iobyxmoadg;
    }
}
