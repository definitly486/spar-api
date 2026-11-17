package igdgnonuha;

/* JADX INFO: loaded from: classes.dex */
public final class ezmngbhpjk {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final iobyxmoadg f42884ppxfxbqfkf = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final lqeggnwhkg f42885iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private w0.wkgbmnqykc f42886zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ezmngbhpjk eablkybsjg(tg.draadjrbmk draadjrbmkVar, rhgxfdycjh rhgxfdycjhVar) {
            return new ezmngbhpjk(rhgxfdycjhVar, draadjrbmkVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final rhgxfdycjh wkgbmnqykc(rhgxfdycjh.lereixgezr lereixgezrVar, ezmngbhpjk ezmngbhpjkVar) {
            return ezmngbhpjkVar.lqeggnwhkg();
        }

        public final rhgxfdycjh.jyumaefscl ppxfxbqfkf(final tg.draadjrbmk draadjrbmkVar) {
            return rhgxfdycjh.esjtqupxsv.eablkybsjg(new tg.rgvfuqvkyq() { // from class: igdgnonuha.jrbgnlbqoe
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return ezmngbhpjk.iobyxmoadg.wkgbmnqykc((rhgxfdycjh.lereixgezr) obj, (ezmngbhpjk) obj2);
                }
            }, new tg.draadjrbmk() { // from class: igdgnonuha.fmlbqenlif
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return ezmngbhpjk.iobyxmoadg.eablkybsjg(draadjrbmkVar, (rhgxfdycjh) obj);
                }
            });
        }

        private iobyxmoadg() {
        }
    }

    public ezmngbhpjk(rhgxfdycjh rhgxfdycjhVar, tg.draadjrbmk draadjrbmkVar) {
        this.f42885iobyxmoadg = new lqeggnwhkg(rhgxfdycjhVar, new tg.draadjrbmk() { // from class: igdgnonuha.mhtqkkgtqm
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return Float.valueOf(ezmngbhpjk.ppxfxbqfkf(this.f43426zdlpuopuiu, ((Float) obj).floatValue()));
            }
        }, new tg.iobyxmoadg() { // from class: igdgnonuha.ixidwrxhsl
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return Float.valueOf(ezmngbhpjk.wkgbmnqykc(this.f43122zdlpuopuiu));
            }
        }, ipoelvxyzq.f43102wkgbmnqykc, draadjrbmkVar);
    }

    private final w0.wkgbmnqykc dxjokdxxww() {
        w0.wkgbmnqykc wkgbmnqykcVar = this.f42886zoijcleaow;
        if (wkgbmnqykcVar != null) {
            return wkgbmnqykcVar;
        }
        throw new IllegalArgumentException(("The density on DrawerState (" + this + ") was not set. Did you use DrawerState with the Drawer composable?").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ppxfxbqfkf(ezmngbhpjk ezmngbhpjkVar, float f13) {
        return ezmngbhpjkVar.dxjokdxxww().I(ipoelvxyzq.f43103zoijcleaow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float wkgbmnqykc(ezmngbhpjk ezmngbhpjkVar) {
        return ezmngbhpjkVar.dxjokdxxww().I(ipoelvxyzq.f43101ppxfxbqfkf);
    }

    public final float btonecajqb() {
        return this.f42885iobyxmoadg.yadqdtsiqt();
    }

    public final Object eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
        Object objLqeggnwhkg = androidx.compose.material.iobyxmoadg.lqeggnwhkg(this.f42885iobyxmoadg, rhgxfdycjh.Closed, 0.0f, gxszxtbevoVar, 2, null);
        return objLqeggnwhkg == mg.zoijcleaow.gxszxtbevo() ? objLqeggnwhkg : gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public final void gtknphoqwx(w0.wkgbmnqykc wkgbmnqykcVar) {
        this.f42886zoijcleaow = wkgbmnqykcVar;
    }

    public final lqeggnwhkg gxszxtbevo() {
        return this.f42885iobyxmoadg;
    }

    public final rhgxfdycjh lqeggnwhkg() {
        return (rhgxfdycjh) this.f42885iobyxmoadg.jyumaefscl();
    }

    public final boolean nufgyqmvbu() {
        return lqeggnwhkg() == rhgxfdycjh.Open;
    }
}
