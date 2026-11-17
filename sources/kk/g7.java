package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class g7 extends nr {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final kotlin.coroutines.jvm.internal.draadjrbmk f56662iobyxmoadg;

    /* JADX WARN: Multi-variable type inference failed */
    public g7(tg.draadjrbmk draadjrbmkVar) {
        this.f56662iobyxmoadg = (kotlin.coroutines.jvm.internal.draadjrbmk) draadjrbmkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g7) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56662iobyxmoadg, ((g7) obj).f56662iobyxmoadg);
    }

    public final int hashCode() {
        return this.f56662iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "NoInternetConnectionError(caller=" + this.f56662iobyxmoadg + ")";
    }
}
