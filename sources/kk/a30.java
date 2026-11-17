package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class a30 extends e40 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final wu f55770iobyxmoadg;

    public a30(wu effect) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(effect, "effect");
        this.f55770iobyxmoadg = effect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a30) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f55770iobyxmoadg, ((a30) obj).f55770iobyxmoadg);
    }

    public final int hashCode() {
        return this.f55770iobyxmoadg.hashCode();
    }

    @Override // kk.e40
    public final tg.iobyxmoadg iobyxmoadg() {
        return this.f55770iobyxmoadg;
    }

    public final String toString() {
        return "RevokeSuccess(effect=" + this.f55770iobyxmoadg + ")";
    }
}
