package zynmafqrjb;

/* JADX INFO: loaded from: classes.dex */
final class eablkybsjg extends jpowsppfya.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final hkdspvbjdz f131614iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final androidx.camera.core.agtfadlqog f131615zoijcleaow;

    eablkybsjg(hkdspvbjdz hkdspvbjdzVar, androidx.camera.core.agtfadlqog agtfadlqogVar) {
        throw new NullPointerException("Null processingRequest");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jpowsppfya.zoijcleaow)) {
            return false;
        }
        jpowsppfya.zoijcleaow zoijcleaowVar = (jpowsppfya.zoijcleaow) obj;
        return this.f131614iobyxmoadg.equals(zoijcleaowVar.zoijcleaow()) && this.f131615zoijcleaow.equals(zoijcleaowVar.iobyxmoadg());
    }

    public int hashCode() {
        return ((this.f131614iobyxmoadg.hashCode() ^ 1000003) * 1000003) ^ this.f131615zoijcleaow.hashCode();
    }

    @Override // zynmafqrjb.jpowsppfya.zoijcleaow
    androidx.camera.core.agtfadlqog iobyxmoadg() {
        return this.f131615zoijcleaow;
    }

    public String toString() {
        return "InputPacket{processingRequest=" + this.f131614iobyxmoadg + ", imageProxy=" + this.f131615zoijcleaow + "}";
    }

    @Override // zynmafqrjb.jpowsppfya.zoijcleaow
    hkdspvbjdz zoijcleaow() {
        return this.f131614iobyxmoadg;
    }
}
