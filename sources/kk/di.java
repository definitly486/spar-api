package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class di extends kz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final wj f56296iobyxmoadg;

    public di(wj helperScreenMode) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(helperScreenMode, "helperScreenMode");
        this.f56296iobyxmoadg = helperScreenMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof di) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f56296iobyxmoadg, ((di) obj).f56296iobyxmoadg);
    }

    public final int hashCode() {
        return this.f56296iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "ShowHelperScreen(helperScreenMode=" + this.f56296iobyxmoadg + ")";
    }
}
