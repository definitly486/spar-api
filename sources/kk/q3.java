package kk;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class q3 extends z6 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ArrayList f58149iobyxmoadg;

    public q3(ArrayList arrayList) {
        this.f58149iobyxmoadg = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q3) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58149iobyxmoadg, ((q3) obj).f58149iobyxmoadg);
    }

    public final int hashCode() {
        return this.f58149iobyxmoadg.hashCode();
    }

    @Override // kk.z6
    public final List iobyxmoadg() {
        return this.f58149iobyxmoadg;
    }

    public final String toString() {
        return "NoCardsYesHelpers(bannerData=" + this.f58149iobyxmoadg + ")";
    }
}
