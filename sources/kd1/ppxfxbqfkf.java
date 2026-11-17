package kd1;

import com.google.protobuf.DescriptorProtos;
import gg.wwaezpbzkn;
import io.appmetrica.analytics.impl.C4007z9;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.myspar.proloyalty.catalog.api.model.ProductListPayload;
import ru.myspar.proloyalty.catalog.api.model.ProductPayload;
import ru.myspar.proloyalty.catalog.api.model.SubCatalogArgs;
import ru.myspar.proloyalty.core.domain.models.payload.sbp.RedirectPaySuccessPayload;
import ru.myspar.proloyalty.core.domain.models.promo.Promotion;
import ru.myspar.proloyalty.core.domain.models.restaurants.Restaurant;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import ru.myspar.proloyalty.core.navigation.model.DeepLink;
import ru.myspar.proloyalty.core.navigation.model.NavigationPayload;
import ru.myspar.proloyalty.core.ui.model.MainTab;
import ru.myspar.proloyalty.domain.feature.specificrestaurant.store.SpecificRestaurantArgs;
import ru.myspar.proloyalty.evropolis.api.model.EvropolisGift;
import ru.myspar.proloyalty.orders.api.model.SpecificOrderArgs;
import ru.myspar.proloyalty.products_from_banner.api.models.ProductsFromBannerScreenArgs;
import ru.myspar.proloyalty.purchases.api.model.PurchaseListSharedWithYouDialogArgs;
import ru.myspar.proloyalty.specialbanner.api.models.SpecialBannerPayload;
import ru.myspar.proloyalty.subscription.api.model.SubscriptionDetailPayload;
import ru.myspar.proloyalty.tipsorder.api.model.TipsOrderArgs;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final ow1.oxmwwwfdhm f55194agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final kq1.iobyxmoadg f55195btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final ek1.iobyxmoadg f55196draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final vm0.zoijcleaow f55197dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final bz0.ppxfxbqfkf f55198eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final t71.iobyxmoadg f55199gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final q41.iobyxmoadg f55200gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ow1.esjtqupxsv f55201iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final oh1.iobyxmoadg f55202lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final cz0.iobyxmoadg f55203nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final t81.iobyxmoadg f55204ojitshcjhn;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final h11.zoijcleaow f55205ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final dl0.iobyxmoadg f55206rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private final m01.iobyxmoadg f55207vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final ow1.jyumaefscl f55208wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final el1.iobyxmoadg f55209wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final m11.ppxfxbqfkf f55210zoijcleaow;

    static final class agtfadlqog extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ ppxfxbqfkf f55211iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ NavigationPayload f55212jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f55213yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f55214zdlpuopuiu;

        public /* synthetic */ class iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final /* synthetic */ int[] f55215iobyxmoadg;

            static {
                int[] iArr = new int[k21.ojitshcjhn.values().length];
                try {
                    iArr[k21.ojitshcjhn.DELIVERY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f55215iobyxmoadg = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        agtfadlqog(NavigationPayload navigationPayload, ppxfxbqfkf ppxfxbqfkfVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
            this.f55212jyumaefscl = navigationPayload;
            this.f55211iwizpuwonk = ppxfxbqfkfVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return new agtfadlqog(this.f55212jyumaefscl, this.f55211iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            cl0.zoijcleaow zoijcleaowVar;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f55213yggfygwlhe;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                cl0.zoijcleaow zoijcleaowVar2 = iobyxmoadg.f55215iobyxmoadg[this.f55212jyumaefscl.getNavigationLink().ordinal()] == 1 ? cl0.zoijcleaow.Delivery : cl0.zoijcleaow.PickUp;
                dl0.iobyxmoadg iobyxmoadgVar = this.f55211iwizpuwonk.f55206rgvfuqvkyq;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                this.f55214zdlpuopuiu = zoijcleaowVar2;
                this.f55213yggfygwlhe = 1;
                Object objZoijcleaow = iobyxmoadgVar.zoijcleaow(wwaezpbzknVar, this);
                if (objZoijcleaow == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                zoijcleaowVar = zoijcleaowVar2;
                obj = objZoijcleaow;
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zoijcleaowVar = (cl0.zoijcleaow) this.f55214zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return new kd1.zoijcleaow.dxjokdxxww(((dl0.iobyxmoadg.C0579iobyxmoadg) obj).zoijcleaow(), zoijcleaowVar);
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((agtfadlqog) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class btonecajqb extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ NavigationPayload f55216yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f55217zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        btonecajqb(NavigationPayload navigationPayload, lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
            this.f55216yggfygwlhe = navigationPayload;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return new btonecajqb(this.f55216yggfygwlhe, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f55217zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            String strEablkybsjg = q11.dxjokdxxww.eablkybsjg(this.f55216yggfygwlhe.getReference());
            if (strEablkybsjg != null) {
                return new kd1.zoijcleaow.hcddaimhww(new SpecificOrderArgs(strEablkybsjg, null, false, 6, null));
            }
            return null;
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((btonecajqb) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class cqumvgiudr extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f55218zdlpuopuiu;

        cqumvgiudr(lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return new cqumvgiudr(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f55218zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            return kd1.zoijcleaow.gxszxtbevo.f55295iobyxmoadg;
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((cqumvgiudr) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class draadjrbmk extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f55219iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f55221yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f55222zdlpuopuiu;

        draadjrbmk(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f55221yggfygwlhe = obj;
            this.f55219iwizpuwonk |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.zdlpuopuiu(null, this);
        }
    }

    static final class dxjokdxxww extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ NavigationPayload f55223yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f55224zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        dxjokdxxww(NavigationPayload navigationPayload, lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
            this.f55223yggfygwlhe = navigationPayload;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return new dxjokdxxww(this.f55223yggfygwlhe, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f55224zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            String reference = this.f55223yggfygwlhe.getReference();
            if (reference == null) {
                reference = "";
            }
            return new kd1.zoijcleaow.dsvhmnatus(new TipsOrderArgs(reference));
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((dxjokdxxww) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f55225cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f55227jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f55228yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f55229zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f55227jyumaefscl = obj;
            this.f55225cqumvgiudr |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.ojitshcjhn(null, this);
        }
    }

    static final class esjtqupxsv extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f55230iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f55232yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f55233zdlpuopuiu;

        esjtqupxsv(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f55232yggfygwlhe = obj;
            this.f55230iwizpuwonk |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.yggfygwlhe(null, this);
        }
    }

    static final class gtknphoqwx extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f55234zdlpuopuiu;

        gtknphoqwx(lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return new gtknphoqwx(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f55234zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            return kd1.zoijcleaow.yggfygwlhe.f55322iobyxmoadg;
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((gtknphoqwx) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        /* synthetic */ Object f55235cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        boolean f55237iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f55238jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        int f55239lereixgezr;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f55240yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f55241zdlpuopuiu;

        gxszxtbevo(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f55235cqumvgiudr = obj;
            this.f55239lereixgezr |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.rgvfuqvkyq(null, null, false, this);
        }
    }

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f55242iobyxmoadg;

        static {
            int[] iArr = new int[k21.ojitshcjhn.values().length];
            try {
                iArr[k21.ojitshcjhn.WITH_CARE_FOR_NATURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k21.ojitshcjhn.RECEIVE_ELECTRONIC_CHECKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k21.ojitshcjhn.DELIVERY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[k21.ojitshcjhn.PICK_UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[k21.ojitshcjhn.INTERVALS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[k21.ojitshcjhn.FUTURE_BASKET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[k21.ojitshcjhn.CHAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[k21.ojitshcjhn.MY_COUPONS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[k21.ojitshcjhn.PURCHASES_LISTS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[k21.ojitshcjhn.LOYALTY_CATEGORIES_DETAIL.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[k21.ojitshcjhn.GAME_IN_WEB_VIEW.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[k21.ojitshcjhn.TIPS_ORDER.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[k21.ojitshcjhn.ORDER.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[k21.ojitshcjhn.NOTIFICATION.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[k21.ojitshcjhn.PRODUCT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[k21.ojitshcjhn.PRODUCT_BY_ARTICLE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[k21.ojitshcjhn.ONLINE_SKU.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[k21.ojitshcjhn.SECTIONS.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[k21.ojitshcjhn.FIRST_SECTION.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[k21.ojitshcjhn.CATALOG.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[k21.ojitshcjhn.SUBCATALOG.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[k21.ojitshcjhn.SECTION.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[k21.ojitshcjhn.SELECTION.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[k21.ojitshcjhn.SHOPS.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[k21.ojitshcjhn.FEED_BACK.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[k21.ojitshcjhn.CARD.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[k21.ojitshcjhn.QR.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[k21.ojitshcjhn.QR_SCAN.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[k21.ojitshcjhn.URL.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[k21.ojitshcjhn.MY_ADDRESSES.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[k21.ojitshcjhn.EVROPOLIS_GIFT.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[k21.ojitshcjhn.ADD_PRODUCT_LIST_TO_BASKET.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[k21.ojitshcjhn.BASKET.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[k21.ojitshcjhn.POPUP.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[k21.ojitshcjhn.LOYALTY_PROMOTION.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[k21.ojitshcjhn.SUBSCRIPTION.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[k21.ojitshcjhn.PARTNER.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[k21.ojitshcjhn.PARTNERS.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[k21.ojitshcjhn.BANNER.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[k21.ojitshcjhn.BLOCKS.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[k21.ojitshcjhn.CALL.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[k21.ojitshcjhn.ACTIVATION_CARD.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[k21.ojitshcjhn.QUIZ.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[k21.ojitshcjhn.DEEPLINK.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[k21.ojitshcjhn.NONE.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            f55242iobyxmoadg = iArr;
        }
    }

    static final class iwizpuwonk extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f55243zdlpuopuiu;

        iwizpuwonk(lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return new iwizpuwonk(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f55243zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            return kd1.zoijcleaow.zynmafqrjb.f55326iobyxmoadg;
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((iwizpuwonk) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class jyumaefscl extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f55244zdlpuopuiu;

        jyumaefscl(lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return new jyumaefscl(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f55244zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            return new kd1.zoijcleaow.vdvldrhtss(false);
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((jyumaefscl) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class kcexrzcfyt extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f55245zdlpuopuiu;

        kcexrzcfyt(lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return new kcexrzcfyt(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f55245zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            return kd1.zoijcleaow.ojitshcjhn.f55311iobyxmoadg;
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((kcexrzcfyt) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class lereixgezr extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f55246jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f55248zdlpuopuiu;

        lereixgezr(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f55248zdlpuopuiu = obj;
            this.f55246jyumaefscl |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.jyumaefscl(null, this);
        }
    }

    static final class lqeggnwhkg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f55249iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f55251yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f55252zdlpuopuiu;

        lqeggnwhkg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f55251yggfygwlhe = obj;
            this.f55249iwizpuwonk |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.oxmwwwfdhm(null, this);
        }
    }

    static final class nufgyqmvbu extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ NavigationPayload f55253iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f55255yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f55256zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        nufgyqmvbu(NavigationPayload navigationPayload, lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
            this.f55253iwizpuwonk = navigationPayload;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return ppxfxbqfkf.this.new nufgyqmvbu(this.f55253iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            String str;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f55255yggfygwlhe;
            if (i13 != 0) {
                if (i13 == 1) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) this.f55256zdlpuopuiu;
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                return new kd1.zoijcleaow.agtfadlqog(str, (String) obj);
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            ow1.oxmwwwfdhm oxmwwwfdhmVar = ppxfxbqfkf.this.f55194agtfadlqog;
            String reference = this.f55253iwizpuwonk.getReference();
            if (reference == null) {
                reference = "";
            }
            this.f55255yggfygwlhe = 1;
            obj = oxmwwwfdhmVar.zoijcleaow(reference, this);
            if (obj == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            String str2 = (String) obj;
            if (str2 == null) {
                return null;
            }
            ow1.jyumaefscl jyumaefsclVar = ppxfxbqfkf.this.f55208wflxmlrfwp;
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            this.f55256zdlpuopuiu = str2;
            this.f55255yggfygwlhe = 2;
            Object objZoijcleaow = jyumaefsclVar.zoijcleaow(wwaezpbzknVar, this);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            str = str2;
            obj = objZoijcleaow;
            return new kd1.zoijcleaow.agtfadlqog(str, (String) obj);
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((nufgyqmvbu) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ojitshcjhn extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f55257zdlpuopuiu;

        ojitshcjhn(lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return new ojitshcjhn(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f55257zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            return new kd1.zoijcleaow.vdvldrhtss(true);
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((ojitshcjhn) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class oxmwwwfdhm extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ DeepLink f55258jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f55260zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        oxmwwwfdhm(DeepLink deepLink, lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
            this.f55258jyumaefscl = deepLink;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return ppxfxbqfkf.this.new oxmwwwfdhm(this.f55258jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f55260zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                ppxfxbqfkf ppxfxbqfkfVar = ppxfxbqfkf.this;
                String purchaseListId = ((DeepLink.PurchaseList) this.f55258jyumaefscl).getPurchaseListId();
                this.f55260zdlpuopuiu = 1;
                obj = ppxfxbqfkfVar.ojitshcjhn(purchaseListId, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return new kd1.zoijcleaow.wwaezpbzkn((PurchaseListSharedWithYouDialogArgs) obj);
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((oxmwwwfdhm) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: kd1.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    static final class C1176ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f55261cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f55263jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f55264yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f55265zdlpuopuiu;

        C1176ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f55263jyumaefscl = obj;
            this.f55261cqumvgiudr |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.wflxmlrfwp(null, this);
        }
    }

    static final class rgvfuqvkyq extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f55266zdlpuopuiu;

        rgvfuqvkyq(lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return new rgvfuqvkyq(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f55266zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            return kd1.zoijcleaow.pmvmpeiblj.f55314iobyxmoadg;
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((rgvfuqvkyq) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class vdvldrhtss extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f55267zdlpuopuiu;

        vdvldrhtss(lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return new vdvldrhtss(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f55267zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            return kd1.zoijcleaow.iozdgvuglv.f55299iobyxmoadg;
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((vdvldrhtss) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wflxmlrfwp extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f55268zdlpuopuiu;

        wflxmlrfwp(lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return new wflxmlrfwp(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f55268zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            return kd1.zoijcleaow.btonecajqb.f55282iobyxmoadg;
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((wflxmlrfwp) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f55269iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f55271yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f55272zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f55271yggfygwlhe = obj;
            this.f55269iwizpuwonk |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.agtfadlqog(this);
        }
    }

    static final class yggfygwlhe extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f55273zdlpuopuiu;

        yggfygwlhe(lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return new yggfygwlhe(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f55273zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            return kd1.zoijcleaow.lqeggnwhkg.f55309iobyxmoadg;
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((yggfygwlhe) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zdlpuopuiu extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f55274zdlpuopuiu;

        zdlpuopuiu(lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return new zdlpuopuiu(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f55274zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            return kd1.zoijcleaow.oxmwwwfdhm.f55312iobyxmoadg;
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((zdlpuopuiu) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f55275cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f55277jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f55278yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f55279zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f55277jyumaefscl = obj;
            this.f55275cqumvgiudr |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.draadjrbmk(null, this);
        }
    }

    public ppxfxbqfkf(ow1.esjtqupxsv isAuthUseCase, m11.ppxfxbqfkf getRestaurantsUseCase, h11.zoijcleaow getPromoUseCase, el1.iobyxmoadg getDefaultFeedbackPhoneUseCase, bz0.ppxfxbqfkf optionsInteractor, q41.iobyxmoadg resourcesManager, oh1.iobyxmoadg productsFromBannerComponent, cz0.iobyxmoadg cartInteractor, vm0.zoijcleaow analyticsTracker, kq1.iobyxmoadg specialBannerFeatureApi, t71.iobyxmoadg evropolisGiftUseCase, ek1.iobyxmoadg purchasesListComponentApi, ow1.jyumaefscl getWebViewTokenUseCase, ow1.oxmwwwfdhm getGameUrlUseCase, t81.iobyxmoadg featureManager, dl0.iobyxmoadg getUserAddressFlowInfo, m01.iobyxmoadg getCurrentDeliveryDataUseCase) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isAuthUseCase, "isAuthUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getRestaurantsUseCase, "getRestaurantsUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getPromoUseCase, "getPromoUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getDefaultFeedbackPhoneUseCase, "getDefaultFeedbackPhoneUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(optionsInteractor, "optionsInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productsFromBannerComponent, "productsFromBannerComponent");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cartInteractor, "cartInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(specialBannerFeatureApi, "specialBannerFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(evropolisGiftUseCase, "evropolisGiftUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(purchasesListComponentApi, "purchasesListComponentApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getWebViewTokenUseCase, "getWebViewTokenUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getGameUrlUseCase, "getGameUrlUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(featureManager, "featureManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getUserAddressFlowInfo, "getUserAddressFlowInfo");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getCurrentDeliveryDataUseCase, "getCurrentDeliveryDataUseCase");
        this.f55201iobyxmoadg = isAuthUseCase;
        this.f55210zoijcleaow = getRestaurantsUseCase;
        this.f55205ppxfxbqfkf = getPromoUseCase;
        this.f55209wkgbmnqykc = getDefaultFeedbackPhoneUseCase;
        this.f55198eablkybsjg = optionsInteractor;
        this.f55200gxszxtbevo = resourcesManager;
        this.f55202lqeggnwhkg = productsFromBannerComponent;
        this.f55203nufgyqmvbu = cartInteractor;
        this.f55197dxjokdxxww = analyticsTracker;
        this.f55195btonecajqb = specialBannerFeatureApi;
        this.f55199gtknphoqwx = evropolisGiftUseCase;
        this.f55196draadjrbmk = purchasesListComponentApi;
        this.f55208wflxmlrfwp = getWebViewTokenUseCase;
        this.f55194agtfadlqog = getGameUrlUseCase;
        this.f55204ojitshcjhn = featureManager;
        this.f55206rgvfuqvkyq = getUserAddressFlowInfo;
        this.f55207vdvldrhtss = getCurrentDeliveryDataUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object agtfadlqog(lg.gxszxtbevo gxszxtbevoVar) {
        wkgbmnqykc wkgbmnqykcVar;
        ppxfxbqfkf ppxfxbqfkfVar;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i13 = wkgbmnqykcVar.f55269iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f55269iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object objZoijcleaow = wkgbmnqykcVar.f55271yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f55269iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            h11.zoijcleaow zoijcleaowVar = this.f55205ppxfxbqfkf;
            h11.zoijcleaow.iobyxmoadg iobyxmoadgVar = new h11.zoijcleaow.iobyxmoadg(false, null, 2, null);
            wkgbmnqykcVar.f55272zdlpuopuiu = this;
            wkgbmnqykcVar.f55269iwizpuwonk = 1;
            objZoijcleaow = zoijcleaowVar.zoijcleaow(iobyxmoadgVar, wkgbmnqykcVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            ppxfxbqfkfVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ppxfxbqfkfVar = (ppxfxbqfkf) wkgbmnqykcVar.f55272zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(ppxfxbqfkfVar.f55198eablkybsjg.dxjokdxxww(((Promotion) objZoijcleaow).getCodePromo()));
    }

    static /* synthetic */ Object cqumvgiudr(ppxfxbqfkf ppxfxbqfkfVar, kd1.zoijcleaow zoijcleaowVar, tg.draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            zoijcleaowVar = kd1.zoijcleaow.zdlpuopuiu.f55324iobyxmoadg;
        }
        return ppxfxbqfkfVar.iwizpuwonk(zoijcleaowVar, draadjrbmkVar, gxszxtbevoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object draadjrbmk(String str, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        Integer numVdvldrhtss;
        int iIntValue;
        ppxfxbqfkf ppxfxbqfkfVar;
        pz0.iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f55275cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f55275cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = zoijcleaowVar.f55277jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f55275cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                iIntValue = zoijcleaowVar.f55278yggfygwlhe;
                ppxfxbqfkfVar = (ppxfxbqfkf) zoijcleaowVar.f55279zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iobyxmoadgVar = (pz0.iobyxmoadg) zoijcleaowVar.f55279zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            }
            return gg.cqumvgiudr.iobyxmoadg((EvropolisGift) objZoijcleaow, iobyxmoadgVar.ppxfxbqfkf());
        }
        gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        if (str == null || (numVdvldrhtss = mj.kcexrzcfyt.vdvldrhtss(str)) == null) {
            return null;
        }
        iIntValue = numVdvldrhtss.intValue();
        m01.iobyxmoadg iobyxmoadgVar2 = this.f55207vdvldrhtss;
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        zoijcleaowVar.f55279zdlpuopuiu = this;
        zoijcleaowVar.f55278yggfygwlhe = iIntValue;
        zoijcleaowVar.f55275cqumvgiudr = 1;
        objZoijcleaow = iobyxmoadgVar2.zoijcleaow(wwaezpbzknVar, zoijcleaowVar);
        if (objZoijcleaow == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        ppxfxbqfkfVar = this;
        pz0.iobyxmoadg iobyxmoadgVar3 = (pz0.iobyxmoadg) objZoijcleaow;
        t71.iobyxmoadg iobyxmoadgVar4 = ppxfxbqfkfVar.f55199gtknphoqwx;
        t71.iobyxmoadg.C2700iobyxmoadg c2700iobyxmoadg = new t71.iobyxmoadg.C2700iobyxmoadg(iIntValue, iobyxmoadgVar3.wkgbmnqykc(), iobyxmoadgVar3.ppxfxbqfkf());
        zoijcleaowVar.f55279zdlpuopuiu = iobyxmoadgVar3;
        zoijcleaowVar.f55275cqumvgiudr = 2;
        Object objInvoke = iobyxmoadgVar4.invoke(c2700iobyxmoadg, zoijcleaowVar);
        if (objInvoke == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        objZoijcleaow = objInvoke;
        iobyxmoadgVar = iobyxmoadgVar3;
        return gg.cqumvgiudr.iobyxmoadg((EvropolisGift) objZoijcleaow, iobyxmoadgVar.ppxfxbqfkf());
    }

    private final Object iwizpuwonk(kd1.zoijcleaow zoijcleaowVar, tg.draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
        return ((Boolean) this.f55201iobyxmoadg.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue() ? draadjrbmkVar.invoke(gxszxtbevoVar) : zoijcleaowVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object jyumaefscl(String str, lg.gxszxtbevo gxszxtbevoVar) {
        lereixgezr lereixgezrVar;
        if (gxszxtbevoVar instanceof lereixgezr) {
            lereixgezrVar = (lereixgezr) gxszxtbevoVar;
            int i13 = lereixgezrVar.f55246jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                lereixgezrVar.f55246jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                lereixgezrVar = new lereixgezr(gxszxtbevoVar);
            }
        } else {
            lereixgezrVar = new lereixgezr(gxszxtbevoVar);
        }
        Object objZoijcleaow = lereixgezrVar.f55248zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = lereixgezrVar.f55246jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, "restaurants")) {
                return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(false);
            }
            m11.ppxfxbqfkf ppxfxbqfkfVar = this.f55210zoijcleaow;
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            lereixgezrVar.f55246jyumaefscl = 1;
            objZoijcleaow = ppxfxbqfkfVar.zoijcleaow(wwaezpbzknVar, lereixgezrVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(!((Collection) objZoijcleaow).isEmpty());
    }

    private final SubscriptionDetailPayload kcexrzcfyt(String str) {
        String strWkgbmnqykc;
        if (str == null || (strWkgbmnqykc = q11.dxjokdxxww.wkgbmnqykc(str)) == null) {
            return null;
        }
        return new SubscriptionDetailPayload(strWkgbmnqykc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object ojitshcjhn(String str, lg.gxszxtbevo gxszxtbevoVar) {
        eablkybsjg eablkybsjgVar;
        ppxfxbqfkf ppxfxbqfkfVar;
        if (gxszxtbevoVar instanceof eablkybsjg) {
            eablkybsjgVar = (eablkybsjg) gxszxtbevoVar;
            int i13 = eablkybsjgVar.f55225cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eablkybsjgVar.f55225cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
            }
        } else {
            eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = eablkybsjgVar.f55227jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = eablkybsjgVar.f55225cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                str = (String) eablkybsjgVar.f55228yggfygwlhe;
                ppxfxbqfkfVar = (ppxfxbqfkf) eablkybsjgVar.f55229zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            }
            gk1.eablkybsjg eablkybsjgVar2 = (gk1.eablkybsjg) objPpxfxbqfkf;
            return new PurchaseListSharedWithYouDialogArgs.FeatureEnabled(eablkybsjgVar2.iobyxmoadg(), eablkybsjgVar2.zoijcleaow(), eablkybsjgVar2.ppxfxbqfkf(), eablkybsjgVar2.wkgbmnqykc());
        }
        gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
        t81.iobyxmoadg iobyxmoadgVar = this.f55204ojitshcjhn;
        s81.iobyxmoadg iobyxmoadgVar2 = s81.iobyxmoadg.f105732jpowsppfya;
        eablkybsjgVar.f55229zdlpuopuiu = this;
        eablkybsjgVar.f55228yggfygwlhe = str;
        eablkybsjgVar.f55225cqumvgiudr = 1;
        objPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf(iobyxmoadgVar2, eablkybsjgVar);
        if (objPpxfxbqfkf == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        ppxfxbqfkfVar = this;
        if (!((Boolean) objPpxfxbqfkf).booleanValue()) {
            return PurchaseListSharedWithYouDialogArgs.FeatureDisabled.f99509esjtqupxsv;
        }
        ek1.iobyxmoadg iobyxmoadgVar3 = ppxfxbqfkfVar.f55196draadjrbmk;
        eablkybsjgVar.f55229zdlpuopuiu = null;
        eablkybsjgVar.f55228yggfygwlhe = null;
        eablkybsjgVar.f55225cqumvgiudr = 2;
        objPpxfxbqfkf = iobyxmoadgVar3.gtknphoqwx(str, eablkybsjgVar);
        if (objPpxfxbqfkf == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        gk1.eablkybsjg eablkybsjgVar3 = (gk1.eablkybsjg) objPpxfxbqfkf;
        return new PurchaseListSharedWithYouDialogArgs.FeatureEnabled(eablkybsjgVar3.iobyxmoadg(), eablkybsjgVar3.zoijcleaow(), eablkybsjgVar3.ppxfxbqfkf(), eablkybsjgVar3.wkgbmnqykc());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object oxmwwwfdhm(String str, lg.gxszxtbevo gxszxtbevoVar) {
        lqeggnwhkg lqeggnwhkgVar;
        if (gxszxtbevoVar instanceof lqeggnwhkg) {
            lqeggnwhkgVar = (lqeggnwhkg) gxszxtbevoVar;
            int i13 = lqeggnwhkgVar.f55249iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                lqeggnwhkgVar.f55249iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                lqeggnwhkgVar = new lqeggnwhkg(gxszxtbevoVar);
            }
        } else {
            lqeggnwhkgVar = new lqeggnwhkg(gxszxtbevoVar);
        }
        Object objZoijcleaow = lqeggnwhkgVar.f55251yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = lqeggnwhkgVar.f55249iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            if (str == null) {
                return null;
            }
            m11.ppxfxbqfkf ppxfxbqfkfVar = this.f55210zoijcleaow;
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            lqeggnwhkgVar.f55252zdlpuopuiu = str;
            lqeggnwhkgVar.f55249iwizpuwonk = 1;
            objZoijcleaow = ppxfxbqfkfVar.zoijcleaow(wwaezpbzknVar, lqeggnwhkgVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) lqeggnwhkgVar.f55252zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        if (q11.zoijcleaow.iobyxmoadg((List) objZoijcleaow) != null) {
            return new SpecificRestaurantArgs(str);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object rgvfuqvkyq(String str, String str2, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
        gxszxtbevo gxszxtbevoVar2;
        ppxfxbqfkf ppxfxbqfkfVar;
        String str3;
        boolean z14;
        String str4 = str;
        if (gxszxtbevoVar instanceof gxszxtbevo) {
            gxszxtbevoVar2 = (gxszxtbevo) gxszxtbevoVar;
            int i13 = gxszxtbevoVar2.f55239lereixgezr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gxszxtbevoVar2.f55239lereixgezr = i13 - Integer.MIN_VALUE;
            } else {
                gxszxtbevoVar2 = new gxszxtbevo(gxszxtbevoVar);
            }
        } else {
            gxszxtbevoVar2 = new gxszxtbevo(gxszxtbevoVar);
        }
        Object objZoijcleaow = gxszxtbevoVar2.f55235cqumvgiudr;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = gxszxtbevoVar2.f55239lereixgezr;
        if (i14 != 0) {
            if (i14 == 1) {
                boolean z15 = gxszxtbevoVar2.f55237iwizpuwonk;
                String str5 = (String) gxszxtbevoVar2.f55238jyumaefscl;
                String str6 = (String) gxszxtbevoVar2.f55240yggfygwlhe;
                ppxfxbqfkf ppxfxbqfkfVar2 = (ppxfxbqfkf) gxszxtbevoVar2.f55241zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
                z14 = z15;
                str3 = str5;
                str4 = str6;
                ppxfxbqfkfVar = ppxfxbqfkfVar2;
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            }
        }
        gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        if (str4 == null || str.length() == 0) {
            return null;
        }
        m01.iobyxmoadg iobyxmoadgVar = this.f55207vdvldrhtss;
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        gxszxtbevoVar2.f55241zdlpuopuiu = this;
        gxszxtbevoVar2.f55240yggfygwlhe = str4;
        gxszxtbevoVar2.f55238jyumaefscl = str2;
        gxszxtbevoVar2.f55237iwizpuwonk = z13;
        gxszxtbevoVar2.f55239lereixgezr = 1;
        objZoijcleaow = iobyxmoadgVar.zoijcleaow(wwaezpbzknVar, gxszxtbevoVar2);
        if (objZoijcleaow == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        ppxfxbqfkfVar = this;
        str3 = str2;
        z14 = z13;
        pz0.iobyxmoadg iobyxmoadgVar2 = (pz0.iobyxmoadg) objZoijcleaow;
        lq1.iobyxmoadg iobyxmoadgVar3 = new lq1.iobyxmoadg(str4, iobyxmoadgVar2.wkgbmnqykc(), iobyxmoadgVar2.ppxfxbqfkf(), str3, z14);
        vm0.zoijcleaow zoijcleaowVar = ppxfxbqfkfVar.f55197dxjokdxxww;
        String strWkgbmnqykc = iobyxmoadgVar2.wkgbmnqykc();
        DeliveryCode deliveryCodePpxfxbqfkf = iobyxmoadgVar2.ppxfxbqfkf();
        zoijcleaowVar.ppxfxbqfkf(new ym0.dxjokdxxww.iobyxmoadg(str4, null, null, strWkgbmnqykc, deliveryCodePpxfxbqfkf != null ? deliveryCodePpxfxbqfkf.getServerCode() : null, 6, null));
        kq1.iobyxmoadg iobyxmoadgVar4 = ppxfxbqfkfVar.f55195btonecajqb;
        gxszxtbevoVar2.f55241zdlpuopuiu = null;
        gxszxtbevoVar2.f55240yggfygwlhe = null;
        gxszxtbevoVar2.f55238jyumaefscl = null;
        gxszxtbevoVar2.f55239lereixgezr = 2;
        objZoijcleaow = iobyxmoadgVar4.ppxfxbqfkf(iobyxmoadgVar3, gxszxtbevoVar2);
        return objZoijcleaow == objGxszxtbevo ? objGxszxtbevo : objZoijcleaow;
    }

    static /* synthetic */ Object vdvldrhtss(ppxfxbqfkf ppxfxbqfkfVar, String str, String str2, boolean z13, lg.gxszxtbevo gxszxtbevoVar, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str2 = null;
        }
        if ((i13 & 4) != 0) {
            z13 = false;
        }
        return ppxfxbqfkfVar.rgvfuqvkyq(str, str2, z13, gxszxtbevoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:32:0x0093  */
    /* JADX WARN: Code duplicated, block: B:35:0x0098  */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object wflxmlrfwp(String str, lg.gxszxtbevo gxszxtbevoVar) {
        C1176ppxfxbqfkf c1176ppxfxbqfkf;
        ppxfxbqfkf ppxfxbqfkfVar;
        String str2;
        pz0.iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof C1176ppxfxbqfkf) {
            c1176ppxfxbqfkf = (C1176ppxfxbqfkf) gxszxtbevoVar;
            int i13 = c1176ppxfxbqfkf.f55261cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1176ppxfxbqfkf.f55261cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                c1176ppxfxbqfkf = new C1176ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            c1176ppxfxbqfkf = new C1176ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objZoijcleaow = c1176ppxfxbqfkf.f55263jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c1176ppxfxbqfkf.f55261cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                str = (String) c1176ppxfxbqfkf.f55264yggfygwlhe;
                ppxfxbqfkfVar = (ppxfxbqfkf) c1176ppxfxbqfkf.f55265zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iobyxmoadgVar = (pz0.iobyxmoadg) c1176ppxfxbqfkf.f55264yggfygwlhe;
                str2 = (String) c1176ppxfxbqfkf.f55265zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            }
            if (!((Boolean) objZoijcleaow).booleanValue()) {
                objZoijcleaow = null;
            }
            if (((Boolean) objZoijcleaow) != null) {
                return new ProductsFromBannerScreenArgs(str2, iobyxmoadgVar.wkgbmnqykc(), iobyxmoadgVar.ppxfxbqfkf());
            }
            return null;
        }
        gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        if (str == null || str.length() == 0) {
            return null;
        }
        m01.iobyxmoadg iobyxmoadgVar2 = this.f55207vdvldrhtss;
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        c1176ppxfxbqfkf.f55265zdlpuopuiu = this;
        c1176ppxfxbqfkf.f55264yggfygwlhe = str;
        c1176ppxfxbqfkf.f55261cqumvgiudr = 1;
        objZoijcleaow = iobyxmoadgVar2.zoijcleaow(wwaezpbzknVar, c1176ppxfxbqfkf);
        if (objZoijcleaow == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        ppxfxbqfkfVar = this;
        pz0.iobyxmoadg iobyxmoadgVar3 = (pz0.iobyxmoadg) objZoijcleaow;
        ph1.ppxfxbqfkf ppxfxbqfkfVar2 = new ph1.ppxfxbqfkf(str, iobyxmoadgVar3.wkgbmnqykc(), iobyxmoadgVar3.ppxfxbqfkf());
        oh1.iobyxmoadg iobyxmoadgVar4 = ppxfxbqfkfVar.f55202lqeggnwhkg;
        c1176ppxfxbqfkf.f55265zdlpuopuiu = str;
        c1176ppxfxbqfkf.f55264yggfygwlhe = iobyxmoadgVar3;
        c1176ppxfxbqfkf.f55261cqumvgiudr = 2;
        Object objPpxfxbqfkf = iobyxmoadgVar4.ppxfxbqfkf(ppxfxbqfkfVar2, c1176ppxfxbqfkf);
        if (objPpxfxbqfkf == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        str2 = str;
        iobyxmoadgVar = iobyxmoadgVar3;
        objZoijcleaow = objPpxfxbqfkf;
        if (!((Boolean) objZoijcleaow).booleanValue()) {
            objZoijcleaow = null;
        }
        if (((Boolean) objZoijcleaow) != null) {
            return new ProductsFromBannerScreenArgs(str2, iobyxmoadgVar.wkgbmnqykc(), iobyxmoadgVar.ppxfxbqfkf());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object yggfygwlhe(String str, lg.gxszxtbevo gxszxtbevoVar) {
        esjtqupxsv esjtqupxsvVar;
        if (gxszxtbevoVar instanceof esjtqupxsv) {
            esjtqupxsvVar = (esjtqupxsv) gxszxtbevoVar;
            int i13 = esjtqupxsvVar.f55230iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                esjtqupxsvVar.f55230iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                esjtqupxsvVar = new esjtqupxsv(gxszxtbevoVar);
            }
        } else {
            esjtqupxsvVar = new esjtqupxsv(gxszxtbevoVar);
        }
        Object objZoijcleaow = esjtqupxsvVar.f55232yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = esjtqupxsvVar.f55230iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            m11.ppxfxbqfkf ppxfxbqfkfVar = this.f55210zoijcleaow;
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            esjtqupxsvVar.f55233zdlpuopuiu = str;
            esjtqupxsvVar.f55230iwizpuwonk = 1;
            objZoijcleaow = ppxfxbqfkfVar.zoijcleaow(wwaezpbzknVar, esjtqupxsvVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) esjtqupxsvVar.f55233zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        List list = (List) objZoijcleaow;
        if (list.isEmpty()) {
            return kd1.zoijcleaow.kcexrzcfyt.f55306iobyxmoadg;
        }
        if (str == null || mj.kcexrzcfyt.zfvoamnweg(str)) {
            return new kd1.zoijcleaow.eablkybsjg(true);
        }
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((Restaurant) it.next()).getCode(), str)) {
                    return new kd1.zoijcleaow.jpowsppfya(new SpecificRestaurantArgs(str));
                }
            }
        }
        return kd1.zoijcleaow.kcexrzcfyt.f55306iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x029c  */
    /* JADX WARN: Code duplicated, block: B:139:0x02db  */
    /* JADX WARN: Code duplicated, block: B:148:0x0307  */
    /* JADX WARN: Code duplicated, block: B:180:0x0374  */
    /* JADX WARN: Code duplicated, block: B:186:0x038e  */
    /* JADX WARN: Code duplicated, block: B:268:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:279:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:281:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:282:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:290:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:292:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object zdlpuopuiu(NavigationPayload navigationPayload, lg.gxszxtbevo gxszxtbevoVar) {
        draadjrbmk draadjrbmkVar;
        Object objWkgbmnqykc;
        kd1.zoijcleaow.eablkybsjg eablkybsjgVar;
        gg.vdvldrhtss vdvldrhtssVar;
        ProductsFromBannerScreenArgs productsFromBannerScreenArgs;
        kd1.zoijcleaow.lereixgezr lereixgezrVar;
        SpecificRestaurantArgs specificRestaurantArgs;
        SpecialBannerPayload specialBannerPayload;
        SpecialBannerPayload specialBannerPayload2;
        if (gxszxtbevoVar instanceof draadjrbmk) {
            draadjrbmkVar = (draadjrbmk) gxszxtbevoVar;
            int i13 = draadjrbmkVar.f55219iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                draadjrbmkVar.f55219iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                draadjrbmkVar = new draadjrbmk(gxszxtbevoVar);
            }
        } else {
            draadjrbmkVar = new draadjrbmk(gxszxtbevoVar);
        }
        draadjrbmk draadjrbmkVar2 = draadjrbmkVar;
        Object objCqumvgiudr = draadjrbmkVar2.f55221yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        try {
            switch (draadjrbmkVar2.f55219iwizpuwonk) {
                case 0:
                    gg.zdlpuopuiu.zoijcleaow(objCqumvgiudr);
                    k21.ojitshcjhn navigationLink = navigationPayload.getNavigationLink();
                    switch (iobyxmoadg.f55242iobyxmoadg[navigationLink.ordinal()]) {
                        case 1:
                        case 2:
                            wflxmlrfwp wflxmlrfwpVar = new wflxmlrfwp(null);
                            draadjrbmkVar2.f55219iwizpuwonk = 1;
                            objCqumvgiudr = cqumvgiudr(this, null, wflxmlrfwpVar, draadjrbmkVar2, 1, null);
                            return objCqumvgiudr == objGxszxtbevo ? objGxszxtbevo : objCqumvgiudr;
                        case 3:
                        case 4:
                            agtfadlqog agtfadlqogVar = new agtfadlqog(navigationPayload, this, null);
                            draadjrbmkVar2.f55219iwizpuwonk = 2;
                            objCqumvgiudr = cqumvgiudr(this, null, agtfadlqogVar, draadjrbmkVar2, 1, null);
                            return objCqumvgiudr == objGxszxtbevo ? objGxszxtbevo : objCqumvgiudr;
                        case 5:
                            kcexrzcfyt kcexrzcfytVar = new kcexrzcfyt(null);
                            draadjrbmkVar2.f55219iwizpuwonk = 3;
                            objCqumvgiudr = cqumvgiudr(this, null, kcexrzcfytVar, draadjrbmkVar2, 1, null);
                            return objCqumvgiudr == objGxszxtbevo ? objGxszxtbevo : objCqumvgiudr;
                        case 6:
                            zdlpuopuiu zdlpuopuiuVar = new zdlpuopuiu(null);
                            draadjrbmkVar2.f55219iwizpuwonk = 4;
                            objCqumvgiudr = cqumvgiudr(this, null, zdlpuopuiuVar, draadjrbmkVar2, 1, null);
                            return objCqumvgiudr == objGxszxtbevo ? objGxszxtbevo : objCqumvgiudr;
                        case 7:
                            yggfygwlhe yggfygwlheVar = new yggfygwlhe(null);
                            draadjrbmkVar2.f55219iwizpuwonk = 5;
                            objCqumvgiudr = cqumvgiudr(this, null, yggfygwlheVar, draadjrbmkVar2, 1, null);
                            return objCqumvgiudr == objGxszxtbevo ? objGxszxtbevo : objCqumvgiudr;
                        case 8:
                            jyumaefscl jyumaefsclVar = new jyumaefscl(null);
                            draadjrbmkVar2.f55219iwizpuwonk = 6;
                            objCqumvgiudr = cqumvgiudr(this, null, jyumaefsclVar, draadjrbmkVar2, 1, null);
                            return objCqumvgiudr == objGxszxtbevo ? objGxszxtbevo : objCqumvgiudr;
                        case 9:
                            iwizpuwonk iwizpuwonkVar = new iwizpuwonk(null);
                            draadjrbmkVar2.f55219iwizpuwonk = 7;
                            objCqumvgiudr = cqumvgiudr(this, null, iwizpuwonkVar, draadjrbmkVar2, 1, null);
                            return objCqumvgiudr == objGxszxtbevo ? objGxszxtbevo : objCqumvgiudr;
                        case 10:
                            cqumvgiudr cqumvgiudrVar = new cqumvgiudr(null);
                            draadjrbmkVar2.f55219iwizpuwonk = 8;
                            objCqumvgiudr = cqumvgiudr(this, null, cqumvgiudrVar, draadjrbmkVar2, 1, null);
                            return objCqumvgiudr == objGxszxtbevo ? objGxszxtbevo : objCqumvgiudr;
                        case 11:
                            nufgyqmvbu nufgyqmvbuVar = new nufgyqmvbu(navigationPayload, null);
                            draadjrbmkVar2.f55219iwizpuwonk = 9;
                            objCqumvgiudr = cqumvgiudr(this, null, nufgyqmvbuVar, draadjrbmkVar2, 1, null);
                            return objCqumvgiudr == objGxszxtbevo ? objGxszxtbevo : objCqumvgiudr;
                        case 12:
                            dxjokdxxww dxjokdxxwwVar = new dxjokdxxww(navigationPayload, null);
                            draadjrbmkVar2.f55219iwizpuwonk = 10;
                            objCqumvgiudr = cqumvgiudr(this, null, dxjokdxxwwVar, draadjrbmkVar2, 1, null);
                            return objCqumvgiudr == objGxszxtbevo ? objGxszxtbevo : objCqumvgiudr;
                        case 13:
                            tg.draadjrbmk btonecajqbVar = new btonecajqb(navigationPayload, null);
                            draadjrbmkVar2.f55219iwizpuwonk = 11;
                            objCqumvgiudr = iwizpuwonk(null, btonecajqbVar, draadjrbmkVar2);
                            return objCqumvgiudr == objGxszxtbevo ? objGxszxtbevo : objCqumvgiudr;
                        case 14:
                            tg.draadjrbmk gtknphoqwxVar = new gtknphoqwx(null);
                            draadjrbmkVar2.f55219iwizpuwonk = 12;
                            objCqumvgiudr = iwizpuwonk(null, gtknphoqwxVar, draadjrbmkVar2);
                            return objCqumvgiudr == objGxszxtbevo ? objGxszxtbevo : objCqumvgiudr;
                        case 15:
                        case 16:
                        case 17:
                            String reference = navigationPayload.getReference();
                            return new kd1.zoijcleaow.jyumaefscl(new ProductPayload(new ProductPayload.Type.Article(reference != null ? reference : ""), null, 2, null));
                        case 18:
                            eablkybsjgVar = new kd1.zoijcleaow.eablkybsjg(false, 1, null);
                            return eablkybsjgVar;
                        case 19:
                        case 20:
                            String reference2 = navigationPayload.getReference();
                            return new kd1.zoijcleaow.hkdspvbjdz(new SubCatalogArgs(null, null, reference2 == null ? "" : reference2, navigationPayload.getTitle(), 3, null));
                        case 21:
                            return new kd1.zoijcleaow.iwizpuwonk(new ProductListPayload(null, null, navigationPayload.getReference(), null, null, this.f55200gxszxtbevo.getString(b31.wflxmlrfwp.proloyalty_catalog), null, null, true, 219, null), MainTab.CATALOG);
                        case 22:
                        case 23:
                            return new kd1.zoijcleaow.iwizpuwonk(new ProductListPayload(null, null, navigationPayload.getReference(), navigationPayload.getReference(), null, navigationPayload.getTitle(), navigationLink == k21.ojitshcjhn.SELECTION ? navigationPayload.getReference() : null, null, true, 147, null), null);
                        case 24:
                            return kd1.zoijcleaow.ylkuphrtab.f55323iobyxmoadg;
                        case C4007z9.F /* 25 */:
                            return kd1.zoijcleaow.wflxmlrfwp.f55318iobyxmoadg;
                        case C4007z9.G /* 26 */:
                        case 27:
                            return kd1.zoijcleaow.ppxfxbqfkf.f55315iobyxmoadg;
                        case 28:
                            return kd1.zoijcleaow.lmojexxdyd.f55308iobyxmoadg;
                        case C4007z9.I /* 29 */:
                            String strWkgbmnqykc = q11.dxjokdxxww.wkgbmnqykc(navigationPayload.getReference());
                            if (strWkgbmnqykc != null) {
                                return new kd1.zoijcleaow.draadjrbmk(strWkgbmnqykc);
                            }
                            return null;
                        case 30:
                            return kd1.zoijcleaow.rgvfuqvkyq.f55316iobyxmoadg;
                        case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                            String reference3 = navigationPayload.getReference();
                            draadjrbmkVar2.f55219iwizpuwonk = 13;
                            objCqumvgiudr = draadjrbmk(reference3, draadjrbmkVar2);
                            if (objCqumvgiudr == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            vdvldrhtssVar = (gg.vdvldrhtss) objCqumvgiudr;
                            if (vdvldrhtssVar != null) {
                                return new kd1.zoijcleaow.gtknphoqwx((EvropolisGift) vdvldrhtssVar.iobyxmoadg(), (DeliveryCode) vdvldrhtssVar.wkgbmnqykc());
                            }
                            return null;
                        case 32:
                            String reference4 = navigationPayload.getReference();
                            draadjrbmkVar2.f55219iwizpuwonk = 14;
                            objCqumvgiudr = wflxmlrfwp(reference4, draadjrbmkVar2);
                            if (objCqumvgiudr == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            productsFromBannerScreenArgs = (ProductsFromBannerScreenArgs) objCqumvgiudr;
                            if (productsFromBannerScreenArgs != null) {
                                return new kd1.zoijcleaow.cqumvgiudr(productsFromBannerScreenArgs);
                            }
                            return null;
                        case 33:
                            String strWkgbmnqykc2 = q11.dxjokdxxww.wkgbmnqykc(navigationPayload.getReference());
                            if (strWkgbmnqykc2 != null) {
                                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                                cz0.iobyxmoadg iobyxmoadgVar2 = this.f55203nufgyqmvbu;
                                draadjrbmkVar2.f55219iwizpuwonk = 15;
                                if (iobyxmoadgVar2.oxmwwwfdhm(strWkgbmnqykc2, draadjrbmkVar2) == objGxszxtbevo) {
                                    return objGxszxtbevo;
                                }
                                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
                                gg.kcexrzcfyt.iobyxmoadg(objWkgbmnqykc);
                            }
                            return kd1.zoijcleaow.wkgbmnqykc.f55319iobyxmoadg;
                        case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                            String reference5 = navigationPayload.getReference();
                            if (reference5 == null || mj.kcexrzcfyt.zfvoamnweg(reference5)) {
                                reference5 = null;
                            }
                            if (reference5 != null) {
                                return new kd1.zoijcleaow.istkbnxepw(reference5);
                            }
                            return null;
                        case C4007z9.J /* 35 */:
                            draadjrbmkVar2.f55219iwizpuwonk = 16;
                            objCqumvgiudr = agtfadlqog(draadjrbmkVar2);
                            if (objCqumvgiudr == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            return (((Boolean) (((Boolean) objCqumvgiudr).booleanValue() ? objCqumvgiudr : null)) != null || (lereixgezrVar = kd1.zoijcleaow.lereixgezr.f55307iobyxmoadg) == null) ? kd1.zoijcleaow.esjtqupxsv.f55292iobyxmoadg : lereixgezrVar;
                        case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                            SubscriptionDetailPayload subscriptionDetailPayloadKcexrzcfyt = kcexrzcfyt(navigationPayload.getReference());
                            if (subscriptionDetailPayloadKcexrzcfyt != null) {
                                return new kd1.zoijcleaow.cllcsxoeiz(subscriptionDetailPayloadKcexrzcfyt);
                            }
                            return null;
                        case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                            String reference6 = navigationPayload.getReference();
                            draadjrbmkVar2.f55219iwizpuwonk = 17;
                            objCqumvgiudr = oxmwwwfdhm(reference6, draadjrbmkVar2);
                            if (objCqumvgiudr == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            specificRestaurantArgs = (SpecificRestaurantArgs) objCqumvgiudr;
                            if (specificRestaurantArgs != null) {
                                return new kd1.zoijcleaow.jpowsppfya(specificRestaurantArgs);
                            }
                            return null;
                        case C4007z9.K /* 38 */:
                            kd1.zoijcleaow.eablkybsjg eablkybsjgVar2 = new kd1.zoijcleaow.eablkybsjg(true);
                            String reference7 = navigationPayload.getReference();
                            draadjrbmkVar2.f55222zdlpuopuiu = eablkybsjgVar2;
                            draadjrbmkVar2.f55219iwizpuwonk = 18;
                            Object objJyumaefscl = jyumaefscl(reference7, draadjrbmkVar2);
                            if (objJyumaefscl == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            objCqumvgiudr = objJyumaefscl;
                            eablkybsjgVar = eablkybsjgVar2;
                            if (!((Boolean) objCqumvgiudr).booleanValue()) {
                                return null;
                            }
                            return eablkybsjgVar;
                        case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                        case 40:
                            String reference8 = navigationPayload.getReference();
                            String title = navigationPayload.getTitle();
                            boolean isAdultConfirmed = navigationPayload.getIsAdultConfirmed();
                            draadjrbmkVar2.f55219iwizpuwonk = 19;
                            objCqumvgiudr = rgvfuqvkyq(reference8, title, isAdultConfirmed, draadjrbmkVar2);
                            if (objCqumvgiudr == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            specialBannerPayload = (SpecialBannerPayload) objCqumvgiudr;
                            if (specialBannerPayload != null) {
                                return new kd1.zoijcleaow.pkzmftpjix(specialBannerPayload);
                            }
                            return null;
                        case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                            String strWkgbmnqykc3 = q11.dxjokdxxww.wkgbmnqykc(navigationPayload.getReference());
                            if (strWkgbmnqykc3 == null) {
                                strWkgbmnqykc3 = (String) this.f55209wkgbmnqykc.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg);
                            }
                            return new kd1.zoijcleaow.C1177zoijcleaow(strWkgbmnqykc3);
                        case 42:
                            return kd1.zoijcleaow.iobyxmoadg.f55298iobyxmoadg;
                        case 43:
                            return new kd1.zoijcleaow.cdpycssgdh(new x81.wflxmlrfwp(navigationPayload.getTitle(), navigationPayload.getMessage(), navigationPayload.getReference()));
                        case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                            DeepLink deepLink = navigationPayload.getDeepLink();
                            if (deepLink instanceof DeepLink.MyDiscounts) {
                                ojitshcjhn ojitshcjhnVar = new ojitshcjhn(null);
                                draadjrbmkVar2.f55219iwizpuwonk = 20;
                                objCqumvgiudr = cqumvgiudr(this, null, ojitshcjhnVar, draadjrbmkVar2, 1, null);
                                return objCqumvgiudr == objGxszxtbevo ? objGxszxtbevo : objCqumvgiudr;
                            }
                            if (deepLink instanceof DeepLink.Purchases) {
                                tg.draadjrbmk rgvfuqvkyqVar = new rgvfuqvkyq(null);
                                draadjrbmkVar2.f55219iwizpuwonk = 21;
                                objCqumvgiudr = iwizpuwonk(null, rgvfuqvkyqVar, draadjrbmkVar2);
                                return objCqumvgiudr == objGxszxtbevo ? objGxszxtbevo : objCqumvgiudr;
                            }
                            if (deepLink instanceof DeepLink.ReturnFromPaySystem) {
                                tg.draadjrbmk vdvldrhtssVar2 = new vdvldrhtss(null);
                                draadjrbmkVar2.f55219iwizpuwonk = 22;
                                objCqumvgiudr = iwizpuwonk(null, vdvldrhtssVar2, draadjrbmkVar2);
                                return objCqumvgiudr == objGxszxtbevo ? objGxszxtbevo : objCqumvgiudr;
                            }
                            if (deepLink instanceof DeepLink.Catalog.ProductList) {
                                DeepLink.Catalog.ProductList productList = (DeepLink.Catalog.ProductList) deepLink;
                                return new kd1.zoijcleaow.iwizpuwonk(new ProductListPayload(null, null, productList.getSectionId(), productList.getParentId(), null, null, null, null, true, 243, null), MainTab.CATALOG);
                            }
                            if (deepLink instanceof DeepLink.Catalog.SubCatalog) {
                                return new kd1.zoijcleaow.hkdspvbjdz(new SubCatalogArgs(null, null, ((DeepLink.Catalog.SubCatalog) deepLink).getSectionId(), this.f55200gxszxtbevo.getString(b31.wflxmlrfwp.proloyalty_catalog), 3, null));
                            }
                            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(deepLink, DeepLink.Catalog.Tab.f95312cqumvgiudr)) {
                                eablkybsjgVar = new kd1.zoijcleaow.eablkybsjg(false, 1, null);
                                return eablkybsjgVar;
                            }
                            if (deepLink instanceof DeepLink.Product) {
                                return new kd1.zoijcleaow.jyumaefscl(new ProductPayload(new ProductPayload.Type.Article(((DeepLink.Product) deepLink).getId()), null, 2, null));
                            }
                            if (deepLink instanceof DeepLink.BlockBanners) {
                                String id2 = ((DeepLink.BlockBanners) deepLink).getId();
                                draadjrbmkVar2.f55219iwizpuwonk = 23;
                                objCqumvgiudr = vdvldrhtss(this, id2, null, false, draadjrbmkVar2, 6, null);
                                if (objCqumvgiudr == objGxszxtbevo) {
                                    return objGxszxtbevo;
                                }
                                specialBannerPayload2 = (SpecialBannerPayload) objCqumvgiudr;
                                if (specialBannerPayload2 != null) {
                                    return new kd1.zoijcleaow.pkzmftpjix(specialBannerPayload2);
                                }
                                return null;
                            }
                            if (deepLink instanceof DeepLink.Partner) {
                                String code = ((DeepLink.Partner) deepLink).getCode();
                                draadjrbmkVar2.f55219iwizpuwonk = 24;
                                objCqumvgiudr = yggfygwlhe(code, draadjrbmkVar2);
                                if (objCqumvgiudr == objGxszxtbevo) {
                                    return objGxszxtbevo;
                                }
                                return (kd1.zoijcleaow) objCqumvgiudr;
                            }
                            if (deepLink instanceof DeepLink.Subscription) {
                                SubscriptionDetailPayload subscriptionDetailPayloadKcexrzcfyt2 = kcexrzcfyt(((DeepLink.Subscription) deepLink).getSubscriptionId());
                                if (subscriptionDetailPayloadKcexrzcfyt2 != null) {
                                    return new kd1.zoijcleaow.cllcsxoeiz(subscriptionDetailPayloadKcexrzcfyt2);
                                }
                                return null;
                            }
                            if (deepLink instanceof DeepLink.RedirectPayment) {
                                return new kd1.zoijcleaow.yadqdtsiqt(new RedirectPaySuccessPayload(((DeepLink.RedirectPayment) deepLink).getOrderId()));
                            }
                            if (deepLink instanceof DeepLink.PurchaseList) {
                                oxmwwwfdhm oxmwwwfdhmVar = new oxmwwwfdhm(deepLink, null);
                                draadjrbmkVar2.f55219iwizpuwonk = 25;
                                objCqumvgiudr = cqumvgiudr(this, null, oxmwwwfdhmVar, draadjrbmkVar2, 1, null);
                                return objCqumvgiudr == objGxszxtbevo ? objGxszxtbevo : objCqumvgiudr;
                            }
                            if (deepLink instanceof DeepLink.ActivationCard) {
                                return kd1.zoijcleaow.iobyxmoadg.f55298iobyxmoadg;
                            }
                            if (deepLink instanceof DeepLink.Combo) {
                                return new kd1.zoijcleaow.nufgyqmvbu(((DeepLink.Combo) deepLink).getComboId());
                            }
                            if (deepLink instanceof DeepLink.None) {
                                return null;
                            }
                            throw new NoWhenBranchMatchedException();
                        case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                            return null;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                case 1:
                    gg.zdlpuopuiu.zoijcleaow(objCqumvgiudr);
                case 2:
                    gg.zdlpuopuiu.zoijcleaow(objCqumvgiudr);
                case 3:
                    gg.zdlpuopuiu.zoijcleaow(objCqumvgiudr);
                case 4:
                    gg.zdlpuopuiu.zoijcleaow(objCqumvgiudr);
                case 5:
                    gg.zdlpuopuiu.zoijcleaow(objCqumvgiudr);
                case 6:
                    gg.zdlpuopuiu.zoijcleaow(objCqumvgiudr);
                case 7:
                    gg.zdlpuopuiu.zoijcleaow(objCqumvgiudr);
                case 8:
                    gg.zdlpuopuiu.zoijcleaow(objCqumvgiudr);
                case 9:
                    gg.zdlpuopuiu.zoijcleaow(objCqumvgiudr);
                case 10:
                    gg.zdlpuopuiu.zoijcleaow(objCqumvgiudr);
                case 11:
                    gg.zdlpuopuiu.zoijcleaow(objCqumvgiudr);
                case 12:
                    gg.zdlpuopuiu.zoijcleaow(objCqumvgiudr);
                case 13:
                    gg.zdlpuopuiu.zoijcleaow(objCqumvgiudr);
                    vdvldrhtssVar = (gg.vdvldrhtss) objCqumvgiudr;
                    if (vdvldrhtssVar != null) {
                        return new kd1.zoijcleaow.gtknphoqwx((EvropolisGift) vdvldrhtssVar.iobyxmoadg(), (DeliveryCode) vdvldrhtssVar.wkgbmnqykc());
                    }
                    return null;
                case 14:
                    gg.zdlpuopuiu.zoijcleaow(objCqumvgiudr);
                    productsFromBannerScreenArgs = (ProductsFromBannerScreenArgs) objCqumvgiudr;
                    if (productsFromBannerScreenArgs != null) {
                        return new kd1.zoijcleaow.cqumvgiudr(productsFromBannerScreenArgs);
                    }
                    return null;
                case 15:
                    gg.zdlpuopuiu.zoijcleaow(objCqumvgiudr);
                    objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
                    gg.kcexrzcfyt.iobyxmoadg(objWkgbmnqykc);
                    return kd1.zoijcleaow.wkgbmnqykc.f55319iobyxmoadg;
                case 16:
                    gg.zdlpuopuiu.zoijcleaow(objCqumvgiudr);
                    if (((Boolean) (((Boolean) objCqumvgiudr).booleanValue() ? objCqumvgiudr : null)) != null) {
                    }
                    break;
                case 17:
                    gg.zdlpuopuiu.zoijcleaow(objCqumvgiudr);
                    specificRestaurantArgs = (SpecificRestaurantArgs) objCqumvgiudr;
                    if (specificRestaurantArgs != null) {
                        return new kd1.zoijcleaow.jpowsppfya(specificRestaurantArgs);
                    }
                    return null;
                case 18:
                    eablkybsjgVar = (kd1.zoijcleaow.eablkybsjg) draadjrbmkVar2.f55222zdlpuopuiu;
                    gg.zdlpuopuiu.zoijcleaow(objCqumvgiudr);
                    if (!((Boolean) objCqumvgiudr).booleanValue()) {
                        return null;
                    }
                    return eablkybsjgVar;
                case 19:
                    gg.zdlpuopuiu.zoijcleaow(objCqumvgiudr);
                    specialBannerPayload = (SpecialBannerPayload) objCqumvgiudr;
                    if (specialBannerPayload != null) {
                        return new kd1.zoijcleaow.pkzmftpjix(specialBannerPayload);
                    }
                    return null;
                case 20:
                    gg.zdlpuopuiu.zoijcleaow(objCqumvgiudr);
                case 21:
                    gg.zdlpuopuiu.zoijcleaow(objCqumvgiudr);
                case 22:
                    gg.zdlpuopuiu.zoijcleaow(objCqumvgiudr);
                case 23:
                    gg.zdlpuopuiu.zoijcleaow(objCqumvgiudr);
                    specialBannerPayload2 = (SpecialBannerPayload) objCqumvgiudr;
                    if (specialBannerPayload2 != null) {
                        return new kd1.zoijcleaow.pkzmftpjix(specialBannerPayload2);
                    }
                    return null;
                case 24:
                    gg.zdlpuopuiu.zoijcleaow(objCqumvgiudr);
                    return (kd1.zoijcleaow) objCqumvgiudr;
                case C4007z9.F /* 25 */:
                    gg.zdlpuopuiu.zoijcleaow(objCqumvgiudr);
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Throwable th2) {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
    }
}
