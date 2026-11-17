package zi;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jyumaefscl implements zeieaojujs {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private int f130047iobyxmoadg;

    private final boolean lqeggnwhkg(jh.nufgyqmvbu nufgyqmvbuVar) {
        return (bj.draadjrbmk.wflxmlrfwp(nufgyqmvbuVar) || li.dxjokdxxww.yadqdtsiqt(nufgyqmvbuVar)) ? false : true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zeieaojujs) || obj.hashCode() != hashCode()) {
            return false;
        }
        zeieaojujs zeieaojujsVar = (zeieaojujs) obj;
        if (zeieaojujsVar.getParameters().size() != getParameters().size()) {
            return false;
        }
        jh.nufgyqmvbu nufgyqmvbuVarWkgbmnqykc = ylkuphrtab();
        jh.nufgyqmvbu nufgyqmvbuVarWkgbmnqykc2 = zeieaojujsVar.ylkuphrtab();
        if (nufgyqmvbuVarWkgbmnqykc2 != null && lqeggnwhkg(nufgyqmvbuVarWkgbmnqykc) && lqeggnwhkg(nufgyqmvbuVarWkgbmnqykc2)) {
            return nufgyqmvbu(nufgyqmvbuVarWkgbmnqykc2);
        }
        return false;
    }

    protected final boolean gxszxtbevo(jh.nufgyqmvbu first, jh.nufgyqmvbu second) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(first, "first");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(second, "second");
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(first.getName(), second.getName())) {
            return false;
        }
        jh.wflxmlrfwp wflxmlrfwpVarZoijcleaow = first.zoijcleaow();
        for (jh.wflxmlrfwp wflxmlrfwpVarZoijcleaow2 = second.zoijcleaow(); wflxmlrfwpVarZoijcleaow != null && wflxmlrfwpVarZoijcleaow2 != null; wflxmlrfwpVarZoijcleaow2 = wflxmlrfwpVarZoijcleaow2.zoijcleaow()) {
            if (wflxmlrfwpVarZoijcleaow instanceof jh.lmojexxdyd) {
                return wflxmlrfwpVarZoijcleaow2 instanceof jh.lmojexxdyd;
            }
            if (wflxmlrfwpVarZoijcleaow2 instanceof jh.lmojexxdyd) {
                return false;
            }
            if (wflxmlrfwpVarZoijcleaow instanceof jh.hkdspvbjdz) {
                return (wflxmlrfwpVarZoijcleaow2 instanceof jh.hkdspvbjdz) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((jh.hkdspvbjdz) wflxmlrfwpVarZoijcleaow).gxszxtbevo(), ((jh.hkdspvbjdz) wflxmlrfwpVarZoijcleaow2).gxszxtbevo());
            }
            if ((wflxmlrfwpVarZoijcleaow2 instanceof jh.hkdspvbjdz) || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wflxmlrfwpVarZoijcleaow.getName(), wflxmlrfwpVarZoijcleaow2.getName())) {
                return false;
            }
            wflxmlrfwpVarZoijcleaow = wflxmlrfwpVarZoijcleaow.zoijcleaow();
        }
        return true;
    }

    public int hashCode() {
        int i13 = this.f130047iobyxmoadg;
        if (i13 != 0) {
            return i13;
        }
        jh.nufgyqmvbu nufgyqmvbuVarWkgbmnqykc = ylkuphrtab();
        int iHashCode = lqeggnwhkg(nufgyqmvbuVarWkgbmnqykc) ? li.dxjokdxxww.wflxmlrfwp(nufgyqmvbuVarWkgbmnqykc).hashCode() : System.identityHashCode(this);
        this.f130047iobyxmoadg = iHashCode;
        return iHashCode;
    }

    protected abstract boolean nufgyqmvbu(jh.nufgyqmvbu nufgyqmvbuVar);

    @Override // zi.zeieaojujs
    /* JADX INFO: renamed from: wkgbmnqykc */
    public abstract jh.nufgyqmvbu ylkuphrtab();
}
