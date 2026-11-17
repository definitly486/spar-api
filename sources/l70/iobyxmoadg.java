package l70;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import mj.kcexrzcfyt;
import pj.cllcsxoeiz;
import pj.gtknphoqwx;
import ru.myspar.analytics.api.model.AnalyticElement;
import ru.myspar.analytics.api.model.AnalyticsLocation;
import ru.myspar.analytics.api.model.AnalyticsPage;
import ru.myspar.core.domain.models.coupons.CouponCategoryDomain;
import ru.myspar.core.domain.models.coupons.CouponDomain;
import ru.myspar.core.navigation.model.AnalyticsPayload;
import ru.myspar.core.navigation.model.NavigationPayload;
import ru.myspar.domain.feature.coupons.store.State;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final lo.zoijcleaow f61781eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final k20.iobyxmoadg f61782ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ra2.lqeggnwhkg f61783wkgbmnqykc;

    /* JADX INFO: renamed from: l70.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1251iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f61784jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ l70.ppxfxbqfkf f61785yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f61786zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1251iobyxmoadg(l70.ppxfxbqfkf ppxfxbqfkfVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f61785yggfygwlhe = ppxfxbqfkfVar;
            this.f61784jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new C1251iobyxmoadg(this.f61785yggfygwlhe, this.f61784jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f61786zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f61785yggfygwlhe, l70.ppxfxbqfkf.iobyxmoadg.f61798iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                iobyxmoadg iobyxmoadgVar = this.f61784jyumaefscl;
                this.f61786zdlpuopuiu = 1;
                if (iobyxmoadgVar.zfvoamnweg(this) == objGxszxtbevo) {
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
            return ((C1251iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f61787iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f61789yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f61790zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f61789yggfygwlhe = obj;
            this.f61787iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.zfvoamnweg(this);
        }
    }

    static final class wkgbmnqykc extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f61792zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new wkgbmnqykc(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f61792zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                ra2.lqeggnwhkg.iobyxmoadg iobyxmoadgVar = new ra2.lqeggnwhkg.iobyxmoadg(true, false, 2, null);
                ra2.lqeggnwhkg lqeggnwhkgVar = iobyxmoadg.this.f61783wkgbmnqykc;
                this.f61792zdlpuopuiu = 1;
                if (lqeggnwhkgVar.zoijcleaow(iobyxmoadgVar, this) == objGxszxtbevo) {
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
            return ((wkgbmnqykc) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f61793jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ l70.wkgbmnqykc f61794yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f61795zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(l70.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f61794yggfygwlhe = wkgbmnqykcVar;
            this.f61793jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f61794yggfygwlhe, this.f61793jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f61795zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            l70.wkgbmnqykc wkgbmnqykcVar = this.f61794yggfygwlhe;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, l70.wkgbmnqykc.iobyxmoadg.f61801iobyxmoadg)) {
                this.f61793jyumaefscl.crxdokpmqz(eablkybsjg.iobyxmoadg.f61773iobyxmoadg);
            } else if (wkgbmnqykcVar instanceof l70.wkgbmnqykc.gxszxtbevo) {
                this.f61793jyumaefscl.crxdokpmqz(new eablkybsjg.zoijcleaow(((l70.wkgbmnqykc.gxszxtbevo) this.f61794yggfygwlhe).iobyxmoadg()));
            } else if (wkgbmnqykcVar instanceof l70.wkgbmnqykc.C1252wkgbmnqykc) {
                this.f61793jyumaefscl.bfopjjpdmp(((l70.wkgbmnqykc.C1252wkgbmnqykc) this.f61794yggfygwlhe).iobyxmoadg());
            } else if (wkgbmnqykcVar instanceof l70.wkgbmnqykc.ppxfxbqfkf) {
                this.f61793jyumaefscl.oipsdeybqn(((l70.wkgbmnqykc.ppxfxbqfkf) this.f61794yggfygwlhe).zoijcleaow(), ((l70.wkgbmnqykc.ppxfxbqfkf) this.f61794yggfygwlhe).ppxfxbqfkf(), ((l70.wkgbmnqykc.ppxfxbqfkf) this.f61794yggfygwlhe).iobyxmoadg(), ((l70.wkgbmnqykc.ppxfxbqfkf) this.f61794yggfygwlhe).wkgbmnqykc());
            } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, l70.wkgbmnqykc.zoijcleaow.f61807iobyxmoadg)) {
                this.f61793jyumaefscl.ulzqkzuiru(gxszxtbevo.zoijcleaow.f61780iobyxmoadg);
            } else {
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, l70.wkgbmnqykc.eablkybsjg.f61799iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f61793jyumaefscl.opjhrmiecq();
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(k20.iobyxmoadg getCouponCategoriesUseCase, ra2.lqeggnwhkg resetAllUnreadUserCouponsUseCase, lo.zoijcleaow analyticsTracker, ns.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getCouponCategoriesUseCase, "getCouponCategoriesUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(resetAllUnreadUserCouponsUseCase, "resetAllUnreadUserCouponsUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f61782ppxfxbqfkf = getCouponCategoriesUseCase;
        this.f61783wkgbmnqykc = resetAllUnreadUserCouponsUseCase;
        this.f61781eablkybsjg = analyticsTracker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bfopjjpdmp(String str) {
        CouponDomain couponDomainSflfametgt = sflfametgt(((State) jlmebxxoox()).getItems(), str);
        CouponCategoryDomain couponCategoryDomainYdmasvzmpa = ydmasvzmpa(((State) jlmebxxoox()).getItems(), str);
        if (couponDomainSflfametgt == null || couponCategoryDomainYdmasvzmpa == null) {
            return;
        }
        AnalyticsLocation.CouponsSection couponsSection = new AnalyticsLocation.CouponsSection(couponCategoryDomainYdmasvzmpa.getName());
        AnalyticElement.CouponItemElement couponItemElement = new AnalyticElement.CouponItemElement(couponDomainSflfametgt.getId(), couponDomainSflfametgt.getTitle());
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(couponDomainSflfametgt.getAction(), f40.zoijcleaow.EVROPOLIS_GIFT.dxjokdxxww())) {
            d40.iobyxmoadg.f26931iobyxmoadg.pkzmftpjix(new NavigationPayload(null, couponDomainSflfametgt.getReference(), null, null, false, null, new AnalyticsPayload(AnalyticsPage.MyCoupons.f84308iwizpuwonk, couponsSection, couponItemElement), false, 189, null));
        } else {
            this.f61781eablkybsjg.ppxfxbqfkf(new no.eablkybsjg(new no.gxszxtbevo(AnalyticsPage.MyCoupons.f84308iwizpuwonk, new AnalyticsPage.DiscountDetail(couponDomainSflfametgt.getId(), couponDomainSflfametgt.getTitle()), couponsSection, couponItemElement, null, 16, null)));
            ulzqkzuiru(new gxszxtbevo.wkgbmnqykc(couponDomainSflfametgt));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void iyctptxqzt(Throwable th2) {
        ulzqkzuiru(new gxszxtbevo.ppxfxbqfkf(false));
        crxdokpmqz(new eablkybsjg.ppxfxbqfkf(th2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void oipsdeybqn(String str, String str2, String str3, String str4) {
        if (kcexrzcfyt.zfvoamnweg(str3)) {
            return;
        }
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str3, "promo")) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str3, "promocopy")) {
                crxdokpmqz(new eablkybsjg.zoijcleaow(str4));
            } else {
                CouponCategoryDomain couponCategoryDomainYdmasvzmpa = ydmasvzmpa(((State) jlmebxxoox()).getItems(), str);
                if (couponCategoryDomainYdmasvzmpa == null) {
                    return;
                }
                NavigationPayload navigationPayloadWkgbmnqykc = f40.zoijcleaow.f32832yggfygwlhe.iobyxmoadg(str3).wkgbmnqykc();
                d40.iobyxmoadg.f26931iobyxmoadg.pkzmftpjix(navigationPayloadWkgbmnqykc.zoijcleaow((191 & 1) != 0 ? navigationPayloadWkgbmnqykc.navigationLink : null, (191 & 2) != 0 ? navigationPayloadWkgbmnqykc.reference : str4, (191 & 4) != 0 ? navigationPayloadWkgbmnqykc.title : null, (191 & 8) != 0 ? navigationPayloadWkgbmnqykc.message : null, (191 & 16) != 0 ? navigationPayloadWkgbmnqykc.isAdultConfirmed : false, (191 & 32) != 0 ? navigationPayloadWkgbmnqykc.deepLink : null, (191 & 64) != 0 ? navigationPayloadWkgbmnqykc.analyticsPayload : new AnalyticsPayload(AnalyticsPage.MyCoupons.f84308iwizpuwonk, new AnalyticsLocation.CouponsSection(couponCategoryDomainYdmasvzmpa.getName()), new AnalyticElement.CouponItemElement(str, str2)), (191 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? navigationPayloadWkgbmnqykc.isPushPayload : false));
            }
        }
        ulzqkzuiru(gxszxtbevo.zoijcleaow.f61780iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void opjhrmiecq() {
        ulzqkzuiru(gxszxtbevo.zoijcleaow.f61780iobyxmoadg);
        crxdokpmqz(eablkybsjg.wkgbmnqykc.f61775iobyxmoadg);
    }

    private final CouponDomain sflfametgt(List list, String str) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void weqkydbzbr() {
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new wkgbmnqykc(null), 3, null);
    }

    private final CouponCategoryDomain ydmasvzmpa(List list, String str) {
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
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zfvoamnweg(lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f61787iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f61787iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objZoijcleaow = ppxfxbqfkfVar.f61789yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f61787iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objZoijcleaow);
            ulzqkzuiru(new gxszxtbevo.ppxfxbqfkf(true));
            try {
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                k20.iobyxmoadg iobyxmoadgVar3 = this.f61782ppxfxbqfkf;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                ppxfxbqfkfVar.f61790zdlpuopuiu = this;
                ppxfxbqfkfVar.f61787iwizpuwonk = 1;
                objZoijcleaow = iobyxmoadgVar3.zoijcleaow(wwaezpbzknVar, ppxfxbqfkfVar);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                iobyxmoadgVar = this;
            } catch (Throwable th2) {
                th = th2;
                iobyxmoadgVar = this;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iobyxmoadgVar = (iobyxmoadg) ppxfxbqfkfVar.f61790zdlpuopuiu;
            try {
                zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } catch (Throwable th3) {
                th = th3;
                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = gg.kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((List) objZoijcleaow);
        if (gg.kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            iobyxmoadgVar.ulzqkzuiru(new gxszxtbevo.iobyxmoadg((List) objWkgbmnqykc));
            iobyxmoadgVar.weqkydbzbr();
            iobyxmoadgVar.f61781eablkybsjg.zoijcleaow(oo.wkgbmnqykc.iobyxmoadg.f73289gxszxtbevo);
        }
        Throwable thDxjokdxxww = gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.iyctptxqzt(thDxjokdxxww);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: uwvvkdfqfp, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(l70.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new C1251iobyxmoadg(action, this, null), 3, null);
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: yfnezrywwk, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(l70.wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new zoijcleaow(intent, this, null), 3, null);
    }
}
