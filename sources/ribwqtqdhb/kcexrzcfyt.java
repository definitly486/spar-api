package ribwqtqdhb;

import vipkmwdibw.wwaezpbzkn;

/* JADX INFO: loaded from: classes.dex */
public final class kcexrzcfyt {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final tg.draadjrbmk f82744iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wwaezpbzkn f82745zoijcleaow;

    public kcexrzcfyt(tg.draadjrbmk draadjrbmkVar, wwaezpbzkn wwaezpbzknVar) {
        this.f82744iobyxmoadg = draadjrbmkVar;
        this.f82745zoijcleaow = wwaezpbzknVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kcexrzcfyt)) {
            return false;
        }
        kcexrzcfyt kcexrzcfytVar = (kcexrzcfyt) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f82744iobyxmoadg, kcexrzcfytVar.f82744iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f82745zoijcleaow, kcexrzcfytVar.f82745zoijcleaow);
    }

    public int hashCode() {
        return (this.f82744iobyxmoadg.hashCode() * 31) + this.f82745zoijcleaow.hashCode();
    }

    public final wwaezpbzkn iobyxmoadg() {
        return this.f82745zoijcleaow;
    }

    public String toString() {
        return "Slide(slideOffset=" + this.f82744iobyxmoadg + ", animationSpec=" + this.f82745zoijcleaow + ')';
    }

    public final tg.draadjrbmk zoijcleaow() {
        return this.f82744iobyxmoadg;
    }
}
