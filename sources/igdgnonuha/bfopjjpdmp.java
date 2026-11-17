package igdgnonuha;

/* JADX INFO: loaded from: classes.dex */
public final class bfopjjpdmp extends r4 {

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    public static final iobyxmoadg f42641oxmwwwfdhm = new iobyxmoadg(null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final bfopjjpdmp eablkybsjg(tg.draadjrbmk draadjrbmkVar, opjhrmiecq opjhrmiecqVar) {
            return new bfopjjpdmp(opjhrmiecqVar, draadjrbmkVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final opjhrmiecq wkgbmnqykc(rhgxfdycjh.lereixgezr lereixgezrVar, bfopjjpdmp bfopjjpdmpVar) {
            return (opjhrmiecq) bfopjjpdmpVar.kcexrzcfyt();
        }

        public final rhgxfdycjh.jyumaefscl ppxfxbqfkf(final tg.draadjrbmk draadjrbmkVar) {
            return rhgxfdycjh.esjtqupxsv.eablkybsjg(new tg.rgvfuqvkyq() { // from class: igdgnonuha.zfvoamnweg
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return bfopjjpdmp.iobyxmoadg.wkgbmnqykc((rhgxfdycjh.lereixgezr) obj, (bfopjjpdmp) obj2);
                }
            }, new tg.draadjrbmk() { // from class: igdgnonuha.oipsdeybqn
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return bfopjjpdmp.iobyxmoadg.eablkybsjg(draadjrbmkVar, (opjhrmiecq) obj);
                }
            });
        }

        private iobyxmoadg() {
        }
    }

    public bfopjjpdmp(opjhrmiecq opjhrmiecqVar, tg.draadjrbmk draadjrbmkVar) {
        super(opjhrmiecqVar, null, draadjrbmkVar, 2, null);
    }

    public final Object cllcsxoeiz(lg.gxszxtbevo gxszxtbevoVar) {
        Object objWflxmlrfwp = r4.wflxmlrfwp(this, opjhrmiecq.Default, null, gxszxtbevoVar, 2, null);
        return objWflxmlrfwp == mg.zoijcleaow.gxszxtbevo() ? objWflxmlrfwp : gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public final sflfametgt hkdspvbjdz() {
        if (((Number) jyumaefscl().getValue()).floatValue() == 0.0f) {
            return null;
        }
        return ((Number) jyumaefscl().getValue()).floatValue() > 0.0f ? sflfametgt.StartToEnd : sflfametgt.EndToStart;
    }
}
