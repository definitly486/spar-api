package a61;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k21.ojitshcjhn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.proloyalty.analytics.api.model.AnalyticElement;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsLocation;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsPage;
import ru.myspar.proloyalty.core.domain.models.coupons.CouponCategoryDomain;
import ru.myspar.proloyalty.core.domain.models.coupons.CouponDomain;
import ru.myspar.proloyalty.core.navigation.model.AnalyticsPayload;
import ru.myspar.proloyalty.core.navigation.model.NavigationPayload;
import ru.myspar.proloyalty.domain.feature.coupons.store.State;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final vm0.zoijcleaow f926eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final t01.iobyxmoadg f927ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final lw1.zoijcleaow f928wkgbmnqykc;

    /* JADX INFO: renamed from: a61.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C0010iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f929jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ a61.ppxfxbqfkf f930yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f931zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0010iobyxmoadg(a61.ppxfxbqfkf ppxfxbqfkfVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f930yggfygwlhe = ppxfxbqfkfVar;
            this.f929jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new C0010iobyxmoadg(this.f930yggfygwlhe, this.f929jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f931zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f930yggfygwlhe, a61.ppxfxbqfkf.iobyxmoadg.f941iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                iobyxmoadg iobyxmoadgVar = this.f929jyumaefscl;
                this.f931zdlpuopuiu = 1;
                if (iobyxmoadgVar.sflfametgt(this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((C0010iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f932iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f934yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f935zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f934yggfygwlhe = obj;
            this.f932iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.sflfametgt(this);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f936jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ wkgbmnqykc f937yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f938zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f937yggfygwlhe = wkgbmnqykcVar;
            this.f936jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f937yggfygwlhe, this.f936jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f938zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            wkgbmnqykc wkgbmnqykcVar = this.f937yggfygwlhe;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.iobyxmoadg.f944iobyxmoadg)) {
                this.f936jyumaefscl.crxdokpmqz(eablkybsjg.iobyxmoadg.f918iobyxmoadg);
            } else if (wkgbmnqykcVar instanceof wkgbmnqykc.gxszxtbevo) {
                this.f936jyumaefscl.crxdokpmqz(new eablkybsjg.zoijcleaow(((wkgbmnqykc.gxszxtbevo) this.f937yggfygwlhe).iobyxmoadg()));
            } else if (wkgbmnqykcVar instanceof wkgbmnqykc.C0011wkgbmnqykc) {
                this.f936jyumaefscl.oipsdeybqn(((wkgbmnqykc.C0011wkgbmnqykc) this.f937yggfygwlhe).iobyxmoadg());
            } else if (wkgbmnqykcVar instanceof wkgbmnqykc.ppxfxbqfkf) {
                this.f936jyumaefscl.zfvoamnweg(((wkgbmnqykc.ppxfxbqfkf) this.f937yggfygwlhe).zoijcleaow(), ((wkgbmnqykc.ppxfxbqfkf) this.f937yggfygwlhe).ppxfxbqfkf(), ((wkgbmnqykc.ppxfxbqfkf) this.f937yggfygwlhe).iobyxmoadg(), ((wkgbmnqykc.ppxfxbqfkf) this.f937yggfygwlhe).wkgbmnqykc());
            } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.zoijcleaow.f950iobyxmoadg)) {
                this.f936jyumaefscl.ulzqkzuiru(gxszxtbevo.zoijcleaow.f925iobyxmoadg);
            } else {
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, wkgbmnqykc.eablkybsjg.f942iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f936jyumaefscl.bfopjjpdmp();
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(t01.iobyxmoadg getCouponCategoriesUseCase, lw1.zoijcleaow userNewsInteractor, vm0.zoijcleaow analyticsTracker, dr0.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getCouponCategoriesUseCase, "getCouponCategoriesUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userNewsInteractor, "userNewsInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f927ppxfxbqfkf = getCouponCategoriesUseCase;
        this.f928wkgbmnqykc = userNewsInteractor;
        this.f926eablkybsjg = analyticsTracker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bfopjjpdmp() {
        ulzqkzuiru(gxszxtbevo.zoijcleaow.f925iobyxmoadg);
        crxdokpmqz(eablkybsjg.wkgbmnqykc.f920iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void iyctptxqzt() {
        this.f928wkgbmnqykc.zoijcleaow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void oipsdeybqn(String str) {
        CouponDomain couponDomainYdmasvzmpa = ydmasvzmpa(((State) jlmebxxoox()).getItems(), str);
        CouponCategoryDomain couponCategoryDomainYfnezrywwk = yfnezrywwk(((State) jlmebxxoox()).getItems(), str);
        if (couponDomainYdmasvzmpa == null || couponCategoryDomainYfnezrywwk == null) {
            return;
        }
        AnalyticsLocation.DiscountsSection discountsSection = new AnalyticsLocation.DiscountsSection(couponCategoryDomainYfnezrywwk.getName());
        AnalyticElement.CouponItemElement couponItemElement = new AnalyticElement.CouponItemElement(couponDomainYdmasvzmpa.getId(), couponDomainYdmasvzmpa.getTitle());
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(couponDomainYdmasvzmpa.getAction(), ojitshcjhn.EVROPOLIS_GIFT.btonecajqb())) {
            i21.iobyxmoadg.f41720iobyxmoadg.pkzmftpjix(new NavigationPayload(null, couponDomainYdmasvzmpa.getReference(), null, null, false, null, new AnalyticsPayload(AnalyticsPage.MyCoupons.f92336iwizpuwonk, discountsSection, couponItemElement), false, 189, null));
        } else {
            this.f926eablkybsjg.wkgbmnqykc(new xm0.eablkybsjg(new xm0.gxszxtbevo(AnalyticsPage.MyCoupons.f92336iwizpuwonk, new AnalyticsPage.DiscountDetail(couponDomainYdmasvzmpa.getId(), couponDomainYdmasvzmpa.getTitle()), discountsSection, couponItemElement, null, 16, null)));
            ulzqkzuiru(new gxszxtbevo.wkgbmnqykc(couponDomainYdmasvzmpa));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void opjhrmiecq(Throwable th2) {
        ulzqkzuiru(new gxszxtbevo.ppxfxbqfkf(false));
        crxdokpmqz(new eablkybsjg.ppxfxbqfkf(th2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object sflfametgt(lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f932iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f932iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objZoijcleaow = ppxfxbqfkfVar.f934yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f932iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ulzqkzuiru(new gxszxtbevo.ppxfxbqfkf(true));
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                t01.iobyxmoadg iobyxmoadgVar3 = this.f927ppxfxbqfkf;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                ppxfxbqfkfVar.f935zdlpuopuiu = this;
                ppxfxbqfkfVar.f932iwizpuwonk = 1;
                objZoijcleaow = iobyxmoadgVar3.zoijcleaow(wwaezpbzknVar, ppxfxbqfkfVar);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar = this;
            } catch (Throwable th2) {
                th = th2;
                iobyxmoadgVar = this;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) ppxfxbqfkfVar.f935zdlpuopuiu;
            try {
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } catch (Throwable th3) {
                th = th3;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((List) objZoijcleaow);
        if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            iobyxmoadgVar.ulzqkzuiru(new gxszxtbevo.iobyxmoadg((List) objWkgbmnqykc));
            iobyxmoadgVar.iyctptxqzt();
            iobyxmoadgVar.f926eablkybsjg.zoijcleaow(ym0.wkgbmnqykc.iobyxmoadg.f125951gxszxtbevo);
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.opjhrmiecq(thDxjokdxxww);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final CouponDomain ydmasvzmpa(List list, String str) {
        Object next;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jyumaefscl.istkbnxepw(arrayList, ((CouponCategoryDomain) it.next()).getCoupons());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            next = it2.next();
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((CouponDomain) next).getId(), str)) {
                return (CouponDomain) next;
            }
        }
        next = null;
        return (CouponDomain) next;
    }

    private final CouponCategoryDomain yfnezrywwk(List list, String str) {
        Object next;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            next = it.next();
            List coupons = ((CouponCategoryDomain) next).getCoupons();
            if (coupons == null || !coupons.isEmpty()) {
                Iterator it2 = coupons.iterator();
                while (it2.hasNext()) {
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((CouponDomain) it2.next()).getId(), str)) {
                        return (CouponCategoryDomain) next;
                    }
                }
            }
        }
        next = null;
        return (CouponCategoryDomain) next;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zfvoamnweg(String str, String str2, String str3, String str4) {
        if (mj.kcexrzcfyt.zfvoamnweg(str3) || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str3, "promo")) {
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str3, "promocopy")) {
            crxdokpmqz(new eablkybsjg.zoijcleaow(str4));
        } else {
            CouponCategoryDomain couponCategoryDomainYfnezrywwk = yfnezrywwk(((State) jlmebxxoox()).getItems(), str);
            if (couponCategoryDomainYfnezrywwk == null) {
                return;
            }
            NavigationPayload navigationPayloadLqeggnwhkg = ojitshcjhn.lqeggnwhkg(ojitshcjhn.f53516yggfygwlhe.iobyxmoadg(str3), null, 1, null);
            i21.iobyxmoadg.f41720iobyxmoadg.pkzmftpjix(navigationPayloadLqeggnwhkg.ppxfxbqfkf((191 & 1) != 0 ? navigationPayloadLqeggnwhkg.navigationLink : null, (191 & 2) != 0 ? navigationPayloadLqeggnwhkg.reference : str4, (191 & 4) != 0 ? navigationPayloadLqeggnwhkg.title : null, (191 & 8) != 0 ? navigationPayloadLqeggnwhkg.message : null, (191 & 16) != 0 ? navigationPayloadLqeggnwhkg.isAdultConfirmed : false, (191 & 32) != 0 ? navigationPayloadLqeggnwhkg.deepLink : null, (191 & 64) != 0 ? navigationPayloadLqeggnwhkg.analyticsPayload : new AnalyticsPayload(AnalyticsPage.MyCoupons.f92336iwizpuwonk, new AnalyticsLocation.DiscountsSection(couponCategoryDomainYfnezrywwk.getName()), new AnalyticElement.CouponItemElement(str, str2)), (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? navigationPayloadLqeggnwhkg.isPushPayload : false));
        }
        ulzqkzuiru(gxszxtbevo.zoijcleaow.f925iobyxmoadg);
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: czzsidtyhn, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(a61.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new C0010iobyxmoadg(action, this, null), 3, null);
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: uwvvkdfqfp, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new zoijcleaow(intent, this, null), 3, null);
    }
}
