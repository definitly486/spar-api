package ud;

/* JADX INFO: loaded from: classes2.dex */
public final class lereixgezr {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final dxjokdxxww f113398iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final zoijcleaow f113399ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final istkbnxepw f113400zoijcleaow;

    public lereixgezr(dxjokdxxww eventType, istkbnxepw sessionData, zoijcleaow applicationInfo) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(eventType, "eventType");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sessionData, "sessionData");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(applicationInfo, "applicationInfo");
        this.f113398iobyxmoadg = eventType;
        this.f113400zoijcleaow = sessionData;
        this.f113399ppxfxbqfkf = applicationInfo;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lereixgezr)) {
            return false;
        }
        lereixgezr lereixgezrVar = (lereixgezr) obj;
        return this.f113398iobyxmoadg == lereixgezrVar.f113398iobyxmoadg && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f113400zoijcleaow, lereixgezrVar.f113400zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f113399ppxfxbqfkf, lereixgezrVar.f113399ppxfxbqfkf);
    }

    public int hashCode() {
        return (((this.f113398iobyxmoadg.hashCode() * 31) + this.f113400zoijcleaow.hashCode()) * 31) + this.f113399ppxfxbqfkf.hashCode();
    }

    public final zoijcleaow iobyxmoadg() {
        return this.f113399ppxfxbqfkf;
    }

    public final istkbnxepw ppxfxbqfkf() {
        return this.f113400zoijcleaow;
    }

    public String toString() {
        return "SessionEvent(eventType=" + this.f113398iobyxmoadg + ", sessionData=" + this.f113400zoijcleaow + ", applicationInfo=" + this.f113399ppxfxbqfkf + ')';
    }

    public final dxjokdxxww zoijcleaow() {
        return this.f113398iobyxmoadg;
    }
}
