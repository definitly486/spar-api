package kk;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ti extends wj {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final List f58679iobyxmoadg;

    public ti(List list) {
        this.f58679iobyxmoadg = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ti) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58679iobyxmoadg, ((ti) obj).f58679iobyxmoadg);
    }

    public final int hashCode() {
        List list = this.f58679iobyxmoadg;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // kk.wj
    public final List iobyxmoadg() {
        return this.f58679iobyxmoadg;
    }

    public final String toString() {
        return "NoMoneyYesHelpers(bannerData=" + this.f58679iobyxmoadg + ")";
    }
}
