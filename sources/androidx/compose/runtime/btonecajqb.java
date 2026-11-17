package androidx.compose.runtime;

/* JADX INFO: loaded from: classes.dex */
final class btonecajqb extends Exception {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final int f5532iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final androidx.collection.wflxmlrfwp f5533jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final androidx.collection.mbcevpiqjq f5534yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final androidx.collection.mbcevpiqjq f5535zdlpuopuiu;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.gtknphoqwx implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f5536cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private /* synthetic */ Object f5537esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f5538iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f5539jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f5541yggfygwlhe;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar = btonecajqb.this.new iobyxmoadg(gxszxtbevoVar);
            iobyxmoadgVar.f5537esjtqupxsv = obj;
            return iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            int i13;
            lj.draadjrbmk draadjrbmkVar;
            int i14;
            int i15;
            String str;
            int i16;
            int i17;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i18 = this.f5536cqumvgiudr;
            if (i18 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                i13 = 0;
                draadjrbmkVar = (lj.draadjrbmk) this.f5537esjtqupxsv;
                i14 = 0;
                i15 = 0;
            } else {
                if (i18 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i19 = this.f5538iwizpuwonk;
                int i23 = this.f5539jyumaefscl;
                int i24 = this.f5541yggfygwlhe;
                draadjrbmkVar = (lj.draadjrbmk) this.f5537esjtqupxsv;
                gg.zdlpuopuiu.zoijcleaow(obj);
                i14 = i23;
                i15 = i19;
                i13 = i24;
            }
            while (i13 < Math.min(btonecajqb.this.f5532iwizpuwonk, btonecajqb.this.f5533jyumaefscl.f4401zoijcleaow)) {
                int i25 = i13 + 1;
                int iEablkybsjg = btonecajqb.this.f5533jyumaefscl.eablkybsjg(i13);
                switch (iEablkybsjg) {
                    case 0:
                        str = "up";
                        break;
                    case 1:
                        int i26 = i14 + 1;
                        str = "down " + btonecajqb.this.f5535zdlpuopuiu.wkgbmnqykc(i14);
                        i14 = i26;
                        break;
                    case 2:
                        str = "remove " + btonecajqb.this.f5533jyumaefscl.eablkybsjg(i25) + ' ' + btonecajqb.this.f5533jyumaefscl.eablkybsjg(i13 + 2);
                        i25 = i13 + 3;
                        break;
                    case 3:
                        str = "move " + btonecajqb.this.f5533jyumaefscl.eablkybsjg(i25) + ' ' + btonecajqb.this.f5533jyumaefscl.eablkybsjg(i13 + 2) + ' ' + btonecajqb.this.f5533jyumaefscl.eablkybsjg(i13 + 3);
                        i25 = i13 + 4;
                        break;
                    case 4:
                        str = "clear";
                        break;
                    case 5:
                        i16 = i13 + 2;
                        i17 = i14 + 1;
                        str = "insertBottomUp " + btonecajqb.this.f5533jyumaefscl.eablkybsjg(i25) + ' ' + btonecajqb.this.f5535zdlpuopuiu.wkgbmnqykc(i14);
                        i25 = i16;
                        i14 = i17;
                        break;
                    case 6:
                        i16 = i13 + 2;
                        i17 = i14 + 1;
                        str = "insertTopDown " + btonecajqb.this.f5533jyumaefscl.eablkybsjg(i25) + ' ' + btonecajqb.this.f5535zdlpuopuiu.wkgbmnqykc(i14);
                        i25 = i16;
                        i14 = i17;
                        break;
                    case 7:
                        int i27 = i14 + 1;
                        Object objWkgbmnqykc = btonecajqb.this.f5535zdlpuopuiu.wkgbmnqykc(i14);
                        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(objWkgbmnqykc, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
                        i14 += 2;
                        str = "apply " + ((tg.rgvfuqvkyq) kotlin.jvm.internal.mbcevpiqjq.eablkybsjg(objWkgbmnqykc, 2)) + ' ' + btonecajqb.this.f5535zdlpuopuiu.wkgbmnqykc(i27);
                        break;
                    case 8:
                        str = "reuse " + btonecajqb.this.f5534yggfygwlhe.wkgbmnqykc(i15);
                        i15++;
                        break;
                    default:
                        str = "unknown op: " + iEablkybsjg;
                        break;
                }
                String str2 = i13 + ": " + str;
                this.f5537esjtqupxsv = draadjrbmkVar;
                this.f5541yggfygwlhe = i25;
                this.f5539jyumaefscl = i14;
                this.f5538iwizpuwonk = i15;
                this.f5536cqumvgiudr = 1;
                if (draadjrbmkVar.iobyxmoadg(str2, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                i13 = i25;
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lj.draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(draadjrbmkVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public btonecajqb(androidx.collection.mbcevpiqjq mbcevpiqjqVar, androidx.collection.mbcevpiqjq mbcevpiqjqVar2, androidx.collection.wflxmlrfwp wflxmlrfwpVar, int i13, Throwable th2) {
        super(th2);
        this.f5535zdlpuopuiu = mbcevpiqjqVar;
        this.f5534yggfygwlhe = mbcevpiqjqVar2;
        this.f5533jyumaefscl = wflxmlrfwpVar;
        this.f5532iwizpuwonk = i13;
    }

    private final lj.btonecajqb dxjokdxxww() {
        return lj.wflxmlrfwp.zoijcleaow(new iobyxmoadg(null));
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return mj.kcexrzcfyt.draadjrbmk("\n            |Exception while applying pausable composition. Last 10 operations:\n            |" + hg.jyumaefscl.iwxlajgraz(hg.jyumaefscl.g(lj.wflxmlrfwp.crxdokpmqz(dxjokdxxww()), 10), "\n", null, null, 0, null, null, 62, null) + "\n            ", null, 1, null);
    }
}
