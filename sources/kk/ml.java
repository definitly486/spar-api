package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class ml extends kz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final String f57655iobyxmoadg;

    public ml(String uri) {
        xh mode = xh.f59306iobyxmoadg;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(mode, "mode");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(uri, "uri");
        this.f57655iobyxmoadg = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml)) {
            return false;
        }
        ml mlVar = (ml) obj;
        xh xhVar = xh.f59306iobyxmoadg;
        mlVar.getClass();
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(xhVar, xhVar) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57655iobyxmoadg, mlVar.f57655iobyxmoadg);
    }

    public final int hashCode() {
        return this.f57655iobyxmoadg.hashCode() + (xh.f59306iobyxmoadg.hashCode() * 31);
    }

    public final String toString() {
        return "ShowOrderBnplAgreementScreen(mode=" + xh.f59306iobyxmoadg + ", uri=" + this.f57655iobyxmoadg + ")";
    }
}
