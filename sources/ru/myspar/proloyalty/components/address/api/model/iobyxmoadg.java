package ru.myspar.proloyalty.components.address.api.model;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f94041iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f94042zoijcleaow;

    public iobyxmoadg(List delivery, List pickup) {
        zdlpuopuiu.btonecajqb(delivery, "delivery");
        zdlpuopuiu.btonecajqb(pickup, "pickup");
        this.f94041iobyxmoadg = delivery;
        this.f94042zoijcleaow = pickup;
    }

    public static /* synthetic */ iobyxmoadg zoijcleaow(iobyxmoadg iobyxmoadgVar, List list, List list2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = iobyxmoadgVar.f94041iobyxmoadg;
        }
        if ((i13 & 2) != 0) {
            list2 = iobyxmoadgVar.f94042zoijcleaow;
        }
        return iobyxmoadgVar.iobyxmoadg(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f94041iobyxmoadg, iobyxmoadgVar.f94041iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f94042zoijcleaow, iobyxmoadgVar.f94042zoijcleaow);
    }

    public int hashCode() {
        return (this.f94041iobyxmoadg.hashCode() * 31) + this.f94042zoijcleaow.hashCode();
    }

    public final iobyxmoadg iobyxmoadg(List delivery, List pickup) {
        zdlpuopuiu.btonecajqb(delivery, "delivery");
        zdlpuopuiu.btonecajqb(pickup, "pickup");
        return new iobyxmoadg(delivery, pickup);
    }

    public final List ppxfxbqfkf() {
        return this.f94041iobyxmoadg;
    }

    public String toString() {
        return "AddressesModel(delivery=" + this.f94041iobyxmoadg + ", pickup=" + this.f94042zoijcleaow + ")";
    }

    public final List wkgbmnqykc() {
        return this.f94042zoijcleaow;
    }
}
