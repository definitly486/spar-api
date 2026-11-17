package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class g60 extends hl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final kotlin.coroutines.jvm.internal.draadjrbmk f56661iobyxmoadg;

    /* JADX WARN: Multi-variable type inference failed */
    public g60(tg.draadjrbmk draadjrbmkVar) {
        this.f56661iobyxmoadg = (kotlin.coroutines.jvm.internal.draadjrbmk) draadjrbmkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g60) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56661iobyxmoadg, ((g60) obj).f56661iobyxmoadg);
    }

    public final int hashCode() {
        return this.f56661iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "NoInternetConnectionError(caller=" + this.f56661iobyxmoadg + ")";
    }
}
