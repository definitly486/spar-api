package kk;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class wm extends nr {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final List f59183iobyxmoadg;

    public wm(List authenticators) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(authenticators, "authenticators");
        this.f59183iobyxmoadg = authenticators;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wm) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f59183iobyxmoadg, ((wm) obj).f59183iobyxmoadg);
    }

    public final int hashCode() {
        return this.f59183iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "ShowFullEmissionAuth(authenticators=" + this.f59183iobyxmoadg + ")";
    }
}
