package dc;

/* JADX INFO: loaded from: classes2.dex */
final class zynmafqrjb extends lmojexxdyd {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final lmojexxdyd.iobyxmoadg f27834iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final lmojexxdyd.zoijcleaow f27835ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final lmojexxdyd.ppxfxbqfkf f27836zoijcleaow;

    zynmafqrjb(lmojexxdyd.iobyxmoadg iobyxmoadgVar, lmojexxdyd.ppxfxbqfkf ppxfxbqfkfVar, lmojexxdyd.zoijcleaow zoijcleaowVar) {
        if (iobyxmoadgVar == null) {
            throw new NullPointerException("Null appData");
        }
        this.f27834iobyxmoadg = iobyxmoadgVar;
        if (ppxfxbqfkfVar == null) {
            throw new NullPointerException("Null osData");
        }
        this.f27836zoijcleaow = ppxfxbqfkfVar;
        if (zoijcleaowVar == null) {
            throw new NullPointerException("Null deviceData");
        }
        this.f27835ppxfxbqfkf = zoijcleaowVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lmojexxdyd)) {
            return false;
        }
        lmojexxdyd lmojexxdydVar = (lmojexxdyd) obj;
        return this.f27834iobyxmoadg.equals(lmojexxdydVar.iobyxmoadg()) && this.f27836zoijcleaow.equals(lmojexxdydVar.wkgbmnqykc()) && this.f27835ppxfxbqfkf.equals(lmojexxdydVar.ppxfxbqfkf());
    }

    public int hashCode() {
        return ((((this.f27834iobyxmoadg.hashCode() ^ 1000003) * 1000003) ^ this.f27836zoijcleaow.hashCode()) * 1000003) ^ this.f27835ppxfxbqfkf.hashCode();
    }

    @Override // dc.lmojexxdyd
    public lmojexxdyd.iobyxmoadg iobyxmoadg() {
        return this.f27834iobyxmoadg;
    }

    @Override // dc.lmojexxdyd
    public lmojexxdyd.zoijcleaow ppxfxbqfkf() {
        return this.f27835ppxfxbqfkf;
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f27834iobyxmoadg + ", osData=" + this.f27836zoijcleaow + ", deviceData=" + this.f27835ppxfxbqfkf + "}";
    }

    @Override // dc.lmojexxdyd
    public lmojexxdyd.ppxfxbqfkf wkgbmnqykc() {
        return this.f27836zoijcleaow;
    }
}
