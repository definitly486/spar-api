package ru.myspar.specialbanner.impl.presentation;

/* JADX INFO: loaded from: classes6.dex */
public final class rlfsiqarku {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final gg.vdvldrhtss f104161iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f104162ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final y00.iobyxmoadg f104163zoijcleaow;

    public rlfsiqarku(gg.vdvldrhtss isLoggedIn, y00.iobyxmoadg currentDeliveryData, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isLoggedIn, "isLoggedIn");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(currentDeliveryData, "currentDeliveryData");
        this.f104161iobyxmoadg = isLoggedIn;
        this.f104163zoijcleaow = currentDeliveryData;
        this.f104162ppxfxbqfkf = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rlfsiqarku)) {
            return false;
        }
        rlfsiqarku rlfsiqarkuVar = (rlfsiqarku) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104161iobyxmoadg, rlfsiqarkuVar.f104161iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f104163zoijcleaow, rlfsiqarkuVar.f104163zoijcleaow) && this.f104162ppxfxbqfkf == rlfsiqarkuVar.f104162ppxfxbqfkf;
    }

    public int hashCode() {
        return (((this.f104161iobyxmoadg.hashCode() * 31) + this.f104163zoijcleaow.hashCode()) * 31) + Boolean.hashCode(this.f104162ppxfxbqfkf);
    }

    public final gg.vdvldrhtss iobyxmoadg() {
        return this.f104161iobyxmoadg;
    }

    public final boolean ppxfxbqfkf() {
        return this.f104162ppxfxbqfkf;
    }

    public String toString() {
        return "FlowModel(isLoggedIn=" + this.f104161iobyxmoadg + ", currentDeliveryData=" + this.f104163zoijcleaow + ", isScreenVisible=" + this.f104162ppxfxbqfkf + ")";
    }

    public final y00.iobyxmoadg zoijcleaow() {
        return this.f104163zoijcleaow;
    }
}
