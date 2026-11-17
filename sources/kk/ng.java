package kk;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ng extends wj {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final List f57824iobyxmoadg;

    public ng(List list) {
        this.f57824iobyxmoadg = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ng) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57824iobyxmoadg, ((ng) obj).f57824iobyxmoadg);
    }

    public final int hashCode() {
        List list = this.f57824iobyxmoadg;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // kk.wj
    public final List iobyxmoadg() {
        return this.f57824iobyxmoadg;
    }

    public final String toString() {
        return "NoCardsYesHelpers(bannerData=" + this.f57824iobyxmoadg + ")";
    }
}
