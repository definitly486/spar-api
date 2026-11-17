package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class t10 extends e40 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final wu f58603iobyxmoadg;

    public t10(wu effect) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(effect, "effect");
        this.f58603iobyxmoadg = effect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t10) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58603iobyxmoadg, ((t10) obj).f58603iobyxmoadg);
    }

    public final int hashCode() {
        return this.f58603iobyxmoadg.hashCode();
    }

    @Override // kk.e40
    public final tg.iobyxmoadg iobyxmoadg() {
        return this.f58603iobyxmoadg;
    }

    public final String toString() {
        return "RevokeFail(effect=" + this.f58603iobyxmoadg + ")";
    }
}
