package opjhrmiecq;

/* JADX INFO: loaded from: classes.dex */
final class yzdjzghtvl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final j0.eablkybsjg f74076iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private j0.eablkybsjg f74077zoijcleaow;

    public yzdjzghtvl(j0.eablkybsjg eablkybsjgVar) {
        this.f74076iobyxmoadg = eablkybsjgVar;
        this.f74077zoijcleaow = eablkybsjgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j0.eablkybsjg.wkgbmnqykc wkgbmnqykc(kotlin.jvm.internal.ylkuphrtab ylkuphrtabVar, j0.eablkybsjg.wkgbmnqykc wkgbmnqykcVar, j0.jrbgnlbqoe jrbgnlbqoeVar, j0.eablkybsjg.wkgbmnqykc wkgbmnqykcVar2) {
        j0.eablkybsjg.wkgbmnqykc wkgbmnqykcVar3;
        j0.eablkybsjg.wkgbmnqykc wkgbmnqykcVar4;
        if (ylkuphrtabVar.f60038zdlpuopuiu && (wkgbmnqykcVar2.lqeggnwhkg() instanceof j0.jrbgnlbqoe) && wkgbmnqykcVar2.nufgyqmvbu() == wkgbmnqykcVar.nufgyqmvbu() && wkgbmnqykcVar2.gxszxtbevo() == wkgbmnqykcVar.gxszxtbevo()) {
            wkgbmnqykcVar3 = new j0.eablkybsjg.wkgbmnqykc(jrbgnlbqoeVar == null ? new j0.jrbgnlbqoe(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65535, null) : jrbgnlbqoeVar, wkgbmnqykcVar2.nufgyqmvbu(), wkgbmnqykcVar2.gxszxtbevo());
            wkgbmnqykcVar4 = wkgbmnqykcVar2;
        } else {
            wkgbmnqykcVar3 = wkgbmnqykcVar2;
            wkgbmnqykcVar4 = wkgbmnqykcVar3;
        }
        ylkuphrtabVar.f60038zdlpuopuiu = kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykcVar4);
        return wkgbmnqykcVar3;
    }

    public final void ppxfxbqfkf(final j0.eablkybsjg.wkgbmnqykc wkgbmnqykcVar, final j0.jrbgnlbqoe jrbgnlbqoeVar) {
        final kotlin.jvm.internal.ylkuphrtab ylkuphrtabVar = new kotlin.jvm.internal.ylkuphrtab();
        this.f74077zoijcleaow = this.f74076iobyxmoadg.rgvfuqvkyq(new tg.draadjrbmk() { // from class: opjhrmiecq.rhgxfdycjh
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return yzdjzghtvl.wkgbmnqykc(ylkuphrtabVar, wkgbmnqykcVar, jrbgnlbqoeVar, (j0.eablkybsjg.wkgbmnqykc) obj);
            }
        });
    }

    public final j0.eablkybsjg zoijcleaow() {
        return this.f74077zoijcleaow;
    }
}
