package sj;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class oxmwwwfdhm {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final tg.draadjrbmk f107031iobyxmoadg = new tg.draadjrbmk() { // from class: sj.rgvfuqvkyq
        @Override // tg.draadjrbmk
        public final Object invoke(Object obj) {
            return oxmwwwfdhm.wkgbmnqykc(obj);
        }
    };

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final tg.rgvfuqvkyq f107032zoijcleaow = new tg.rgvfuqvkyq() { // from class: sj.vdvldrhtss
        @Override // tg.rgvfuqvkyq
        public final Object invoke(Object obj, Object obj2) {
            return Boolean.valueOf(oxmwwwfdhm.ppxfxbqfkf(obj, obj2));
        }
    };

    public static final lqeggnwhkg eablkybsjg(lqeggnwhkg lqeggnwhkgVar) {
        return lqeggnwhkgVar instanceof wypolnanlu ? lqeggnwhkgVar : nufgyqmvbu(lqeggnwhkgVar, f107031iobyxmoadg, f107032zoijcleaow);
    }

    public static final lqeggnwhkg gxszxtbevo(lqeggnwhkg lqeggnwhkgVar, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        tg.draadjrbmk draadjrbmkVar = f107031iobyxmoadg;
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(rgvfuqvkyqVar, "null cannot be cast to non-null type kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Boolean>");
        return nufgyqmvbu(lqeggnwhkgVar, draadjrbmkVar, (tg.rgvfuqvkyq) kotlin.jvm.internal.mbcevpiqjq.eablkybsjg(rgvfuqvkyqVar, 2));
    }

    public static final lqeggnwhkg lqeggnwhkg(lqeggnwhkg lqeggnwhkgVar, tg.draadjrbmk draadjrbmkVar) {
        return nufgyqmvbu(lqeggnwhkgVar, draadjrbmkVar, f107032zoijcleaow);
    }

    private static final lqeggnwhkg nufgyqmvbu(lqeggnwhkg lqeggnwhkgVar, tg.draadjrbmk draadjrbmkVar, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        if (lqeggnwhkgVar instanceof eablkybsjg) {
            eablkybsjg eablkybsjgVar = (eablkybsjg) lqeggnwhkgVar;
            if (eablkybsjgVar.f106848yggfygwlhe == draadjrbmkVar && eablkybsjgVar.f106847jyumaefscl == rgvfuqvkyqVar) {
                return lqeggnwhkgVar;
            }
        }
        return new eablkybsjg(lqeggnwhkgVar, draadjrbmkVar, rgvfuqvkyqVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ppxfxbqfkf(Object obj, Object obj2) {
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object wkgbmnqykc(Object obj) {
        return obj;
    }
}
