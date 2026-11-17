package androidx.compose.runtime;

/* JADX INFO: loaded from: classes.dex */
public final class q implements wkgbmnqykc {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private Object f5920ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final iobyxmoadg f5918wkgbmnqykc = new iobyxmoadg(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final int f5917eablkybsjg = 8;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final androidx.collection.yadqdtsiqt f5919iobyxmoadg = new androidx.collection.yadqdtsiqt(0, 1, null);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final androidx.collection.jpowsppfya f5921zoijcleaow = new androidx.collection.jpowsppfya(0, 1, null);

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public q(Object obj) {
        this.f5920ppxfxbqfkf = obj;
    }

    @Override // androidx.compose.runtime.wkgbmnqykc
    public void clear() {
        this.f5919iobyxmoadg.btonecajqb(4);
    }

    public final void draadjrbmk(wkgbmnqykc wkgbmnqykcVar, ezmngbhpjk.ojitshcjhn ojitshcjhnVar) {
        Exception exc;
        int i13;
        androidx.collection.yadqdtsiqt yadqdtsiqtVar = this.f5919iobyxmoadg;
        int i14 = yadqdtsiqtVar.f4401zoijcleaow;
        androidx.collection.jpowsppfya jpowsppfyaVar = this.f5921zoijcleaow;
        androidx.collection.jpowsppfya jpowsppfyaVar2 = new androidx.collection.jpowsppfya(0, 1, null);
        wkgbmnqykcVar.btonecajqb();
        int i15 = 0;
        int i16 = 0;
        while (i15 < i14) {
            int i17 = i15 + 1;
            try {
                try {
                    switch (yadqdtsiqtVar.eablkybsjg(i15)) {
                        case 0:
                            wkgbmnqykcVar.gtknphoqwx();
                            i15 = i17;
                            break;
                        case 1:
                            int i18 = i16 + 1;
                            wkgbmnqykcVar.nufgyqmvbu(jpowsppfyaVar.wkgbmnqykc(i16));
                            i16 = i18;
                            i15 = i17;
                            break;
                        case 2:
                            int i19 = i15 + 2;
                            i15 += 3;
                            wkgbmnqykcVar.zoijcleaow(yadqdtsiqtVar.eablkybsjg(i17), yadqdtsiqtVar.eablkybsjg(i19));
                            break;
                        case 3:
                            int i23 = i15 + 2;
                            try {
                                int i24 = i15 + 3;
                                try {
                                    i15 += 4;
                                    wkgbmnqykcVar.ppxfxbqfkf(yadqdtsiqtVar.eablkybsjg(i17), yadqdtsiqtVar.eablkybsjg(i23), yadqdtsiqtVar.eablkybsjg(i24));
                                } catch (Exception e13) {
                                    exc = e13;
                                    i15 = i24;
                                    throw new btonecajqb(jpowsppfyaVar, jpowsppfyaVar2, yadqdtsiqtVar, i15, exc);
                                }
                            } catch (Exception e14) {
                                exc = e14;
                                i15 = i23;
                            }
                            break;
                        case 4:
                            wkgbmnqykcVar.clear();
                            i15 = i17;
                            break;
                        case 5:
                            i15 += 2;
                            i13 = i16 + 1;
                            wkgbmnqykcVar.lqeggnwhkg(yadqdtsiqtVar.eablkybsjg(i17), jpowsppfyaVar.wkgbmnqykc(i16));
                            i16 = i13;
                            break;
                        case 6:
                            i15 += 2;
                            try {
                                i13 = i16 + 1;
                                wkgbmnqykcVar.eablkybsjg(yadqdtsiqtVar.eablkybsjg(i17), jpowsppfyaVar.wkgbmnqykc(i16));
                                i16 = i13;
                            } catch (Exception e15) {
                                exc = e15;
                                throw new btonecajqb(jpowsppfyaVar, jpowsppfyaVar2, yadqdtsiqtVar, i15, exc);
                            }
                            break;
                        case 7:
                            int i25 = i16 + 1;
                            Object objWkgbmnqykc = jpowsppfyaVar.wkgbmnqykc(i16);
                            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(objWkgbmnqykc, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
                            i16 += 2;
                            wkgbmnqykcVar.wkgbmnqykc((tg.rgvfuqvkyq) kotlin.jvm.internal.mbcevpiqjq.eablkybsjg(objWkgbmnqykc, 2), jpowsppfyaVar.wkgbmnqykc(i25));
                            i15 = i17;
                            break;
                        case 8:
                            Object objIobyxmoadg = wkgbmnqykcVar.iobyxmoadg();
                            if (objIobyxmoadg instanceof dxjokdxxww) {
                                ojitshcjhnVar.gtknphoqwx((dxjokdxxww) objIobyxmoadg);
                            }
                            jpowsppfyaVar2.agtfadlqog(objIobyxmoadg);
                            wkgbmnqykcVar.dxjokdxxww();
                            i15 = i17;
                            break;
                        default:
                            i15 = i17;
                            break;
                    }
                } catch (Throwable th2) {
                    wkgbmnqykcVar.gxszxtbevo();
                    throw th2;
                }
            } catch (Exception e16) {
                exc = e16;
                i15 = i17;
            }
        }
        if (!(i16 == jpowsppfyaVar.eablkybsjg())) {
            jyumaefscl.zdlpuopuiu("Applier operation size mismatch");
        }
        jpowsppfyaVar.yggfygwlhe();
        yadqdtsiqtVar.draadjrbmk();
        wkgbmnqykcVar.gxszxtbevo();
    }

    @Override // androidx.compose.runtime.wkgbmnqykc
    public void dxjokdxxww() {
        this.f5919iobyxmoadg.btonecajqb(8);
    }

    @Override // androidx.compose.runtime.wkgbmnqykc
    public void eablkybsjg(int i13, Object obj) {
        this.f5919iobyxmoadg.btonecajqb(6);
        this.f5919iobyxmoadg.btonecajqb(i13);
        this.f5921zoijcleaow.agtfadlqog(obj);
    }

    @Override // androidx.compose.runtime.wkgbmnqykc
    public void gtknphoqwx() {
        this.f5919iobyxmoadg.btonecajqb(0);
    }

    @Override // androidx.compose.runtime.wkgbmnqykc
    public Object iobyxmoadg() {
        return this.f5920ppxfxbqfkf;
    }

    @Override // androidx.compose.runtime.wkgbmnqykc
    public void lqeggnwhkg(int i13, Object obj) {
        this.f5919iobyxmoadg.btonecajqb(5);
        this.f5919iobyxmoadg.btonecajqb(i13);
        this.f5921zoijcleaow.agtfadlqog(obj);
    }

    @Override // androidx.compose.runtime.wkgbmnqykc
    public void nufgyqmvbu(Object obj) {
        this.f5919iobyxmoadg.btonecajqb(1);
        this.f5921zoijcleaow.agtfadlqog(obj);
    }

    @Override // androidx.compose.runtime.wkgbmnqykc
    public void ppxfxbqfkf(int i13, int i14, int i15) {
        this.f5919iobyxmoadg.btonecajqb(3);
        this.f5919iobyxmoadg.btonecajqb(i13);
        this.f5919iobyxmoadg.btonecajqb(i14);
        this.f5919iobyxmoadg.btonecajqb(i15);
    }

    @Override // androidx.compose.runtime.wkgbmnqykc
    public void wkgbmnqykc(tg.rgvfuqvkyq rgvfuqvkyqVar, Object obj) {
        this.f5919iobyxmoadg.btonecajqb(7);
        this.f5921zoijcleaow.agtfadlqog(rgvfuqvkyqVar);
        this.f5921zoijcleaow.agtfadlqog(obj);
    }

    @Override // androidx.compose.runtime.wkgbmnqykc
    public void zoijcleaow(int i13, int i14) {
        this.f5919iobyxmoadg.btonecajqb(2);
        this.f5919iobyxmoadg.btonecajqb(i13);
        this.f5919iobyxmoadg.btonecajqb(i14);
    }
}
