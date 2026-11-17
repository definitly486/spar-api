package zg0;

import hg.jyumaefscl;
import java.util.List;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import ru.myspar.user.models.User;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final C3310iobyxmoadg f129949gxszxtbevo = new C3310iobyxmoadg(null);

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final int f129950lqeggnwhkg = 8;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final na0.iobyxmoadg f129951eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ca2.wkgbmnqykc f129952ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ca2.ppxfxbqfkf f129953wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final yg0.iobyxmoadg f129954zoijcleaow;

    /* JADX INFO: renamed from: zg0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private static final class C3310iobyxmoadg {
        public /* synthetic */ C3310iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C3310iobyxmoadg() {
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        /* synthetic */ Object f129955cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f129957iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f129958jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        int f129959lereixgezr;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f129960yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f129961zdlpuopuiu;

        ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f129955cqumvgiudr = obj;
            this.f129959lereixgezr |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, this);
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f129962iobyxmoadg;

        public zoijcleaow(String shopId) {
            zdlpuopuiu.btonecajqb(shopId, "shopId");
            this.f129962iobyxmoadg = shopId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f129962iobyxmoadg, ((zoijcleaow) obj).f129962iobyxmoadg);
        }

        public int hashCode() {
            return this.f129962iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f129962iobyxmoadg;
        }

        public String toString() {
            return "Params(shopId=" + this.f129962iobyxmoadg + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(yg0.iobyxmoadg mySparSectionsRepository, ca2.wkgbmnqykc userSharedPreferences, ca2.ppxfxbqfkf userRepository, na0.iobyxmoadg featureManager, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(mySparSectionsRepository, "mySparSectionsRepository");
        zdlpuopuiu.btonecajqb(userSharedPreferences, "userSharedPreferences");
        zdlpuopuiu.btonecajqb(userRepository, "userRepository");
        zdlpuopuiu.btonecajqb(featureManager, "featureManager");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f129954zoijcleaow = mySparSectionsRepository;
        this.f129952ppxfxbqfkf = userSharedPreferences;
        this.f129953wkgbmnqykc = userRepository;
        this.f129951eablkybsjg = featureManager;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:39:0x00b6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cf A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(zoijcleaow zoijcleaowVar, gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        List listWflxmlrfwp;
        iobyxmoadg iobyxmoadgVar;
        int i13;
        iobyxmoadg iobyxmoadgVar2;
        int i14;
        List listIobyxmoadg;
        Object objLqeggnwhkg;
        int i15;
        List list;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i16 = ppxfxbqfkfVar.f129959lereixgezr;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f129959lereixgezr = i16 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objLqeggnwhkg2 = ppxfxbqfkfVar.f129955cqumvgiudr;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i17 = ppxfxbqfkfVar.f129959lereixgezr;
        int promoNew = 0;
        if (i17 != 0) {
            if (i17 == 1) {
                zoijcleaowVar = (zoijcleaow) ppxfxbqfkfVar.f129960yggfygwlhe;
                iobyxmoadgVar = (iobyxmoadg) ppxfxbqfkfVar.f129961zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg2);
            } else if (i17 == 2) {
                int i18 = ppxfxbqfkfVar.f129957iwizpuwonk;
                int i19 = ppxfxbqfkfVar.f129958jyumaefscl;
                iobyxmoadgVar2 = (iobyxmoadg) ppxfxbqfkfVar.f129961zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg2);
                i13 = i18;
                i14 = i19;
                listIobyxmoadg = ((xg0.zoijcleaow) objLqeggnwhkg2).iobyxmoadg();
                na0.iobyxmoadg iobyxmoadgVar3 = iobyxmoadgVar2.f129951eablkybsjg;
                ppxfxbqfkfVar.f129961zdlpuopuiu = listIobyxmoadg;
                ppxfxbqfkfVar.f129958jyumaefscl = i13;
                ppxfxbqfkfVar.f129957iwizpuwonk = i14;
                ppxfxbqfkfVar.f129959lereixgezr = 3;
                objLqeggnwhkg = iobyxmoadgVar3.lqeggnwhkg(ppxfxbqfkfVar);
                if (objLqeggnwhkg == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                i15 = i13;
                list = listIobyxmoadg;
                objLqeggnwhkg2 = objLqeggnwhkg;
            } else {
                if (i17 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i14 = ppxfxbqfkfVar.f129957iwizpuwonk;
                i15 = ppxfxbqfkfVar.f129958jyumaefscl;
                list = (List) ppxfxbqfkfVar.f129961zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg2);
            }
            return new xg0.ppxfxbqfkf(list, i14, ((Boolean) objLqeggnwhkg2).booleanValue(), i15);
        }
        gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg2);
        listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
        if (this.f129952ppxfxbqfkf.nufgyqmvbu()) {
            ca2.ppxfxbqfkf ppxfxbqfkfVar2 = this.f129953wkgbmnqykc;
            ppxfxbqfkfVar.f129961zdlpuopuiu = this;
            ppxfxbqfkfVar.f129960yggfygwlhe = zoijcleaowVar;
            ppxfxbqfkfVar.f129959lereixgezr = 1;
            objLqeggnwhkg2 = ppxfxbqfkfVar2.lqeggnwhkg(ppxfxbqfkfVar);
            if (objLqeggnwhkg2 == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar = this;
        } else {
            iobyxmoadgVar = this;
            i13 = 0;
        }
        yg0.iobyxmoadg iobyxmoadgVar4 = iobyxmoadgVar.f129954zoijcleaow;
        String strIobyxmoadg = zoijcleaowVar.iobyxmoadg();
        ppxfxbqfkfVar.f129961zdlpuopuiu = iobyxmoadgVar;
        ppxfxbqfkfVar.f129960yggfygwlhe = null;
        ppxfxbqfkfVar.f129958jyumaefscl = promoNew;
        ppxfxbqfkfVar.f129957iwizpuwonk = i13;
        ppxfxbqfkfVar.f129959lereixgezr = 2;
        objLqeggnwhkg2 = iobyxmoadgVar4.wkgbmnqykc(strIobyxmoadg, listWflxmlrfwp, ppxfxbqfkfVar);
        if (objLqeggnwhkg2 == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar2 = iobyxmoadgVar;
        i14 = promoNew;
        listIobyxmoadg = ((xg0.zoijcleaow) objLqeggnwhkg2).iobyxmoadg();
        na0.iobyxmoadg iobyxmoadgVar5 = iobyxmoadgVar2.f129951eablkybsjg;
        ppxfxbqfkfVar.f129961zdlpuopuiu = listIobyxmoadg;
        ppxfxbqfkfVar.f129958jyumaefscl = i13;
        ppxfxbqfkfVar.f129957iwizpuwonk = i14;
        ppxfxbqfkfVar.f129959lereixgezr = 3;
        objLqeggnwhkg = iobyxmoadgVar5.lqeggnwhkg(ppxfxbqfkfVar);
        if (objLqeggnwhkg == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        i15 = i13;
        list = listIobyxmoadg;
        objLqeggnwhkg2 = objLqeggnwhkg;
        return new xg0.ppxfxbqfkf(list, i14, ((Boolean) objLqeggnwhkg2).booleanValue(), i15);
        User user = (User) objLqeggnwhkg2;
        List segments = user != null ? user.getSegments() : null;
        if (segments == null) {
            segments = jyumaefscl.wflxmlrfwp();
        }
        int discountsNew = user != null ? user.getDiscountsNew() : 0;
        promoNew = user != null ? user.getPromoNew() : 0;
        listWflxmlrfwp = segments;
        i13 = promoNew;
        promoNew = discountsNew;
        yg0.iobyxmoadg iobyxmoadgVar6 = iobyxmoadgVar.f129954zoijcleaow;
        String strIobyxmoadg2 = zoijcleaowVar.iobyxmoadg();
        ppxfxbqfkfVar.f129961zdlpuopuiu = iobyxmoadgVar;
        ppxfxbqfkfVar.f129960yggfygwlhe = null;
        ppxfxbqfkfVar.f129958jyumaefscl = promoNew;
        ppxfxbqfkfVar.f129957iwizpuwonk = i13;
        ppxfxbqfkfVar.f129959lereixgezr = 2;
        objLqeggnwhkg2 = iobyxmoadgVar6.wkgbmnqykc(strIobyxmoadg2, listWflxmlrfwp, ppxfxbqfkfVar);
        if (objLqeggnwhkg2 == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        iobyxmoadgVar2 = iobyxmoadgVar;
        i14 = promoNew;
        listIobyxmoadg = ((xg0.zoijcleaow) objLqeggnwhkg2).iobyxmoadg();
        na0.iobyxmoadg iobyxmoadgVar7 = iobyxmoadgVar2.f129951eablkybsjg;
        ppxfxbqfkfVar.f129961zdlpuopuiu = listIobyxmoadg;
        ppxfxbqfkfVar.f129958jyumaefscl = i13;
        ppxfxbqfkfVar.f129957iwizpuwonk = i14;
        ppxfxbqfkfVar.f129959lereixgezr = 3;
        objLqeggnwhkg = iobyxmoadgVar7.lqeggnwhkg(ppxfxbqfkfVar);
        if (objLqeggnwhkg == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        i15 = i13;
        list = listIobyxmoadg;
        objLqeggnwhkg2 = objLqeggnwhkg;
        return new xg0.ppxfxbqfkf(list, i14, ((Boolean) objLqeggnwhkg2).booleanValue(), i15);
    }
}
