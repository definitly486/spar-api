package ru.myspar.components.address.api.model;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f86310iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f86311zoijcleaow;

    public iobyxmoadg(List delivery, List pickup) {
        zdlpuopuiu.btonecajqb(delivery, "delivery");
        zdlpuopuiu.btonecajqb(pickup, "pickup");
        this.f86310iobyxmoadg = delivery;
        this.f86311zoijcleaow = pickup;
    }

    public static /* synthetic */ iobyxmoadg zoijcleaow(iobyxmoadg iobyxmoadgVar, List list, List list2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = iobyxmoadgVar.f86310iobyxmoadg;
        }
        if ((i13 & 2) != 0) {
            list2 = iobyxmoadgVar.f86311zoijcleaow;
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
        return zdlpuopuiu.eablkybsjg(this.f86310iobyxmoadg, iobyxmoadgVar.f86310iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f86311zoijcleaow, iobyxmoadgVar.f86311zoijcleaow);
    }

    public int hashCode() {
        return (this.f86310iobyxmoadg.hashCode() * 31) + this.f86311zoijcleaow.hashCode();
    }

    public final iobyxmoadg iobyxmoadg(List delivery, List pickup) {
        zdlpuopuiu.btonecajqb(delivery, "delivery");
        zdlpuopuiu.btonecajqb(pickup, "pickup");
        return new iobyxmoadg(delivery, pickup);
    }

    public final List ppxfxbqfkf() {
        return this.f86310iobyxmoadg;
    }

    public String toString() {
        return "AddressesModel(delivery=" + this.f86310iobyxmoadg + ", pickup=" + this.f86311zoijcleaow + ")";
    }

    public final List wkgbmnqykc() {
        return this.f86311zoijcleaow;
    }
}
