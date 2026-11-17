package kk;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class w5 extends z6 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ArrayList f59093iobyxmoadg;

    public w5(ArrayList arrayList) {
        this.f59093iobyxmoadg = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w5) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f59093iobyxmoadg, ((w5) obj).f59093iobyxmoadg);
    }

    public final int hashCode() {
        return this.f59093iobyxmoadg.hashCode();
    }

    @Override // kk.z6
    public final List iobyxmoadg() {
        return this.f59093iobyxmoadg;
    }

    public final String toString() {
        return "YesCardsYesHelpers(bannerData=" + this.f59093iobyxmoadg + ")";
    }
}
