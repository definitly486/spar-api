package zynmafqrjb;

/* JADX INFO: loaded from: classes.dex */
final class ppxfxbqfkf extends zdlpuopuiu.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final jpowsppfya.jyumaefscl f131665iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f131666zoijcleaow;

    ppxfxbqfkf(jpowsppfya.jyumaefscl jyumaefsclVar, int i13) {
        if (jyumaefsclVar == null) {
            throw new NullPointerException("Null packet");
        }
        this.f131665iobyxmoadg = jyumaefsclVar;
        this.f131666zoijcleaow = i13;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zdlpuopuiu.iobyxmoadg)) {
            return false;
        }
        zdlpuopuiu.iobyxmoadg iobyxmoadgVar = (zdlpuopuiu.iobyxmoadg) obj;
        return this.f131665iobyxmoadg.equals(iobyxmoadgVar.zoijcleaow()) && this.f131666zoijcleaow == iobyxmoadgVar.iobyxmoadg();
    }

    public int hashCode() {
        return ((this.f131665iobyxmoadg.hashCode() ^ 1000003) * 1000003) ^ this.f131666zoijcleaow;
    }

    @Override // zynmafqrjb.zdlpuopuiu.iobyxmoadg
    int iobyxmoadg() {
        return this.f131666zoijcleaow;
    }

    public String toString() {
        return "In{packet=" + this.f131665iobyxmoadg + ", jpegQuality=" + this.f131666zoijcleaow + "}";
    }

    @Override // zynmafqrjb.zdlpuopuiu.iobyxmoadg
    jpowsppfya.jyumaefscl zoijcleaow() {
        return this.f131665iobyxmoadg;
    }
}
