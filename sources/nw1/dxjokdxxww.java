package nw1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f71273iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f71274zoijcleaow;

    public dxjokdxxww(int i13, String hash) {
        zdlpuopuiu.btonecajqb(hash, "hash");
        this.f71273iobyxmoadg = i13;
        this.f71274zoijcleaow = hash;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxjokdxxww)) {
            return false;
        }
        dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
        return this.f71273iobyxmoadg == dxjokdxxwwVar.f71273iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f71274zoijcleaow, dxjokdxxwwVar.f71274zoijcleaow);
    }

    public int hashCode() {
        return (Integer.hashCode(this.f71273iobyxmoadg) * 31) + this.f71274zoijcleaow.hashCode();
    }

    public final String iobyxmoadg() {
        return this.f71274zoijcleaow;
    }

    public String toString() {
        return "UserSignupResult(timeLimit=" + this.f71273iobyxmoadg + ", hash=" + this.f71274zoijcleaow + ")";
    }

    public final int zoijcleaow() {
        return this.f71273iobyxmoadg;
    }
}
