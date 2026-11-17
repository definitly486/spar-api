package ru.myspar.proloyalty.specialbanner.impl.presentation;

/* JADX INFO: loaded from: classes6.dex */
public final class metgxyhuhe {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f101465iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f101466ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final pz0.iobyxmoadg f101467zoijcleaow;

    public metgxyhuhe(boolean z13, pz0.iobyxmoadg currentDeliveryData, boolean z14) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(currentDeliveryData, "currentDeliveryData");
        this.f101465iobyxmoadg = z13;
        this.f101467zoijcleaow = currentDeliveryData;
        this.f101466ppxfxbqfkf = z14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof metgxyhuhe)) {
            return false;
        }
        metgxyhuhe metgxyhuheVar = (metgxyhuhe) obj;
        return this.f101465iobyxmoadg == metgxyhuheVar.f101465iobyxmoadg && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f101467zoijcleaow, metgxyhuheVar.f101467zoijcleaow) && this.f101466ppxfxbqfkf == metgxyhuheVar.f101466ppxfxbqfkf;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f101465iobyxmoadg) * 31) + this.f101467zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f101466ppxfxbqfkf);
    }

    public final boolean iobyxmoadg() {
        return this.f101465iobyxmoadg;
    }

    public final boolean ppxfxbqfkf() {
        return this.f101466ppxfxbqfkf;
    }

    public String toString() {
        return "FlowModel(isLoggedIn=" + this.f101465iobyxmoadg + ", currentDeliveryData=" + this.f101467zoijcleaow + ", isScreenVisible=" + this.f101466ppxfxbqfkf + ")";
    }

    public final pz0.iobyxmoadg zoijcleaow() {
        return this.f101467zoijcleaow;
    }
}
