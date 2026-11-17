package czzsidtyhn;

/* JADX INFO: loaded from: classes.dex */
final class kcexrzcfyt implements y.wkgbmnqykc {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private lxfrhoxuzk f26410ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final tg.draadjrbmk f26411zoijcleaow;

    public kcexrzcfyt(tg.draadjrbmk draadjrbmkVar) {
        this.f26411zoijcleaow = draadjrbmkVar;
    }

    @Override // y.wkgbmnqykc
    public void dxjokdxxww(y.gtknphoqwx gtknphoqwxVar) {
        lxfrhoxuzk lxfrhoxuzkVar = (lxfrhoxuzk) gtknphoqwxVar.zynmafqrjb(fyldjkxazc.wkgbmnqykc());
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(lxfrhoxuzkVar, this.f26410ppxfxbqfkf)) {
            return;
        }
        this.f26410ppxfxbqfkf = lxfrhoxuzkVar;
        this.f26411zoijcleaow.invoke(lxfrhoxuzkVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kcexrzcfyt) && ((kcexrzcfyt) obj).f26411zoijcleaow == this.f26411zoijcleaow;
    }

    public int hashCode() {
        return this.f26411zoijcleaow.hashCode();
    }
}
