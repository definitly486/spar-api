package uj;

import pj.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pkzmftpjix {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final istkbnxepw f113663iobyxmoadg = new istkbnxepw("NO_THREAD_ELEMENTS");

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final tg.rgvfuqvkyq f113666zoijcleaow = new tg.rgvfuqvkyq() { // from class: uj.lmojexxdyd
        @Override // tg.rgvfuqvkyq
        public final Object invoke(Object obj, Object obj2) {
            return pkzmftpjix.wkgbmnqykc(obj, (lg.btonecajqb.zoijcleaow) obj2);
        }
    };

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final tg.rgvfuqvkyq f113664ppxfxbqfkf = new tg.rgvfuqvkyq() { // from class: uj.wwaezpbzkn
        @Override // tg.rgvfuqvkyq
        public final Object invoke(Object obj, Object obj2) {
            return pkzmftpjix.eablkybsjg((a) obj, (lg.btonecajqb.zoijcleaow) obj2);
        }
    };

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final tg.rgvfuqvkyq f113665wkgbmnqykc = new tg.rgvfuqvkyq() { // from class: uj.ylkuphrtab
        @Override // tg.rgvfuqvkyq
        public final Object invoke(Object obj, Object obj2) {
            return pkzmftpjix.nufgyqmvbu((wypolnanlu) obj, (lg.btonecajqb.zoijcleaow) obj2);
        }
    };

    public static final Object dxjokdxxww(lg.btonecajqb btonecajqbVar, Object obj) {
        if (obj == null) {
            obj = lqeggnwhkg(btonecajqbVar);
        }
        if (obj == 0) {
            return f113663iobyxmoadg;
        }
        if (obj instanceof Integer) {
            return btonecajqbVar.fold(new wypolnanlu(btonecajqbVar, ((Number) obj).intValue()), f113665wkgbmnqykc);
        }
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((a) obj).jyumaefscl(btonecajqbVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a eablkybsjg(a aVar, lg.btonecajqb.zoijcleaow zoijcleaowVar) {
        if (aVar != null) {
            return aVar;
        }
        if (zoijcleaowVar instanceof a) {
            return (a) zoijcleaowVar;
        }
        return null;
    }

    public static final void gxszxtbevo(lg.btonecajqb btonecajqbVar, Object obj) {
        if (obj == f113663iobyxmoadg) {
            return;
        }
        if (obj instanceof wypolnanlu) {
            ((wypolnanlu) obj).zoijcleaow(btonecajqbVar);
            return;
        }
        Object objFold = btonecajqbVar.fold(null, f113664ppxfxbqfkf);
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((a) objFold).istkbnxepw(btonecajqbVar, obj);
    }

    public static final Object lqeggnwhkg(lg.btonecajqb btonecajqbVar) {
        Object objFold = btonecajqbVar.fold(0, f113666zoijcleaow);
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(objFold);
        return objFold;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wypolnanlu nufgyqmvbu(wypolnanlu wypolnanluVar, lg.btonecajqb.zoijcleaow zoijcleaowVar) {
        if (zoijcleaowVar instanceof a) {
            a aVar = (a) zoijcleaowVar;
            wypolnanluVar.iobyxmoadg(aVar, aVar.jyumaefscl(wypolnanluVar.f113677iobyxmoadg));
        }
        return wypolnanluVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object wkgbmnqykc(Object obj, lg.btonecajqb.zoijcleaow zoijcleaowVar) {
        if (!(zoijcleaowVar instanceof a)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int iIntValue = num != null ? num.intValue() : 1;
        return iIntValue == 0 ? zoijcleaowVar : Integer.valueOf(iIntValue + 1);
    }
}
