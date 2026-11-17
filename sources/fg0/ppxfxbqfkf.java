package fg0;

import com.google.protobuf.DescriptorProtos;
import gg.wwaezpbzkn;
import io.appmetrica.analytics.impl.C4007z9;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.myspar.catalog.api.model.ProductListPayload;
import ru.myspar.catalog.api.model.ProductPayload;
import ru.myspar.catalog.api.model.SubCatalogArgs;
import ru.myspar.core.domain.models.payload.sbp.RedirectPaySuccessPayload;
import ru.myspar.core.domain.models.promo.Promotion;
import ru.myspar.core.domain.models.restaurants.Restaurant;
import ru.myspar.core.models.delivery.DeliveryCode;
import ru.myspar.core.navigation.model.DeepLink;
import ru.myspar.core.navigation.model.NavigationPayload;
import ru.myspar.core.ui.model.MainTab;
import ru.myspar.domain.feature.specificrestaurant.store.SpecificRestaurantArgs;
import ru.myspar.evropolis.api.model.EvropolisGift;
import ru.myspar.orders.api.model.SpecificOrderArgs;
import ru.myspar.products_from_banner.api.models.ProductsFromBannerScreenArgs;
import ru.myspar.purchases.api.model.PurchaseListSharedWithYouDialogArgs;
import ru.myspar.specialbanner.api.models.SpecialBannerPayload;
import ru.myspar.subscription.api.model.SubscriptionDetailPayload;
import ru.myspar.tipsorder.api.model.TipsOrderArgs;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final oa0.wflxmlrfwp f33619agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final lo.zoijcleaow f33620btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final p90.iobyxmoadg f33621draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final k00.iobyxmoadg f33622dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final j00.wkgbmnqykc f33623eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final r42.iobyxmoadg f33624gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final d60.iobyxmoadg f33625gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final c20.eablkybsjg f33626iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final yj0.iobyxmoadg f33627lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final r20.iobyxmoadg f33628nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private final sm.iobyxmoadg f33629ojitshcjhn;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final c30.zoijcleaow f33630ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private final z10.iobyxmoadg f33631rgvfuqvkyq;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final yy1.iobyxmoadg f33632wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final nz1.iobyxmoadg f33633wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final g30.ppxfxbqfkf f33634zoijcleaow;

    static final class agtfadlqog extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f33635zdlpuopuiu;

        agtfadlqog(lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return new agtfadlqog(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f33635zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            return new fg0.zoijcleaow.ojitshcjhn(true);
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((agtfadlqog) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class btonecajqb extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f33636zdlpuopuiu;

        btonecajqb(lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return new btonecajqb(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f33636zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            return fg0.zoijcleaow.kcexrzcfyt.f33721iobyxmoadg;
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((btonecajqb) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class cqumvgiudr extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f33637iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f33639yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f33640zdlpuopuiu;

        cqumvgiudr(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f33639yggfygwlhe = obj;
            this.f33637iwizpuwonk |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.yggfygwlhe(null, this);
        }
    }

    static final class draadjrbmk extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f33641zdlpuopuiu;

        draadjrbmk(lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return new draadjrbmk(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f33641zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            return fg0.zoijcleaow.dxjokdxxww.f33708iobyxmoadg;
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((draadjrbmk) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class dxjokdxxww extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ NavigationPayload f33642yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f33643zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        dxjokdxxww(NavigationPayload navigationPayload, lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
            this.f33642yggfygwlhe = navigationPayload;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return new dxjokdxxww(this.f33642yggfygwlhe, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f33643zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            String strEablkybsjg = k30.draadjrbmk.eablkybsjg(this.f33642yggfygwlhe.getReference());
            if (strEablkybsjg != null) {
                return new fg0.zoijcleaow.ylkuphrtab(new SpecificOrderArgs(strEablkybsjg, null, false, 6, null));
            }
            return null;
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((dxjokdxxww) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class eablkybsjg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f33644cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f33646jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f33647yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f33648zdlpuopuiu;

        eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f33646jyumaefscl = obj;
            this.f33644cqumvgiudr |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.ojitshcjhn(null, this);
        }
    }

    static final class esjtqupxsv extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f33649jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f33651zdlpuopuiu;

        esjtqupxsv(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f33651zdlpuopuiu = obj;
            this.f33649jyumaefscl |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.jyumaefscl(null, this);
        }
    }

    static final class gtknphoqwx extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f33652iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f33654yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f33655zdlpuopuiu;

        gtknphoqwx(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f33654yggfygwlhe = obj;
            this.f33652iwizpuwonk |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.zdlpuopuiu(null, this);
        }
    }

    static final class gxszxtbevo extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        /* synthetic */ Object f33656cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        boolean f33658iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f33659jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        int f33660lereixgezr;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f33661yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f33662zdlpuopuiu;

        gxszxtbevo(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f33656cqumvgiudr = obj;
            this.f33660lereixgezr |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.rgvfuqvkyq(null, null, false, this);
        }
    }

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f33663iobyxmoadg;

        static {
            int[] iArr = new int[f40.zoijcleaow.values().length];
            try {
                iArr[f40.zoijcleaow.WITH_CARE_FOR_NATURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f40.zoijcleaow.RECEIVE_ELECTRONIC_CHECKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f40.zoijcleaow.DELIVERY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[f40.zoijcleaow.PICK_UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[f40.zoijcleaow.FUTURE_BASKET.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[f40.zoijcleaow.CHAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[f40.zoijcleaow.MY_COUPONS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[f40.zoijcleaow.PURCHASES_LISTS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[f40.zoijcleaow.LOYALTY_CATEGORIES_DETAIL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[f40.zoijcleaow.GAME_IN_WEB_VIEW.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[f40.zoijcleaow.TIPS_ORDER.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[f40.zoijcleaow.ORDER.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[f40.zoijcleaow.NOTIFICATION.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[f40.zoijcleaow.PRODUCT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[f40.zoijcleaow.PRODUCT_BY_ARTICLE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[f40.zoijcleaow.ONLINE_SKU.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[f40.zoijcleaow.SECTIONS.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[f40.zoijcleaow.FIRST_SECTION.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[f40.zoijcleaow.CATALOG.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[f40.zoijcleaow.SUBCATALOG.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[f40.zoijcleaow.SECTION.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[f40.zoijcleaow.SELECTION.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[f40.zoijcleaow.SHOPS.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[f40.zoijcleaow.FEED_BACK.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[f40.zoijcleaow.CARD.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[f40.zoijcleaow.QR.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[f40.zoijcleaow.QR_SCAN.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[f40.zoijcleaow.URL.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[f40.zoijcleaow.MY_ADDRESSES.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[f40.zoijcleaow.EVROPOLIS_GIFT.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[f40.zoijcleaow.ADD_PRODUCT_LIST_TO_BASKET.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[f40.zoijcleaow.BASKET.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[f40.zoijcleaow.POPUP.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[f40.zoijcleaow.LOYALTY_PROMOTION.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[f40.zoijcleaow.SUBSCRIPTION.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[f40.zoijcleaow.PARTNER.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[f40.zoijcleaow.PARTNERS.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[f40.zoijcleaow.BANNER.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[f40.zoijcleaow.BLOCKS.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[f40.zoijcleaow.CALL.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[f40.zoijcleaow.QUIZ.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[f40.zoijcleaow.DEEPLINK.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[f40.zoijcleaow.NONE.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            f33663iobyxmoadg = iArr;
        }
    }

    static final class iwizpuwonk extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ NavigationPayload f33664jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f33666zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iwizpuwonk(NavigationPayload navigationPayload, lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
            this.f33664jyumaefscl = navigationPayload;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return ppxfxbqfkf.this.new iwizpuwonk(this.f33664jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f33666zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                ppxfxbqfkf ppxfxbqfkfVar = ppxfxbqfkf.this;
                String reference = this.f33664jyumaefscl.getReference();
                if (reference == null) {
                    reference = "";
                }
                this.f33666zdlpuopuiu = 1;
                obj = ppxfxbqfkfVar.draadjrbmk(reference, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            String str = (String) obj;
            if (str != null) {
                return new fg0.zoijcleaow.wflxmlrfwp(str);
            }
            return null;
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((iwizpuwonk) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class jyumaefscl extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f33667zdlpuopuiu;

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
            if (this.f33667zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            return fg0.zoijcleaow.eablkybsjg.f33709iobyxmoadg;
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((jyumaefscl) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class kcexrzcfyt extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f33668zdlpuopuiu;

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
            if (this.f33668zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            return fg0.zoijcleaow.gxszxtbevo.f33712iobyxmoadg;
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((kcexrzcfyt) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class lqeggnwhkg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f33669iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f33671yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f33672zdlpuopuiu;

        lqeggnwhkg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f33671yggfygwlhe = obj;
            this.f33669iwizpuwonk |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.oxmwwwfdhm(null, this);
        }
    }

    static final class nufgyqmvbu extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ NavigationPayload f33673yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f33674zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        nufgyqmvbu(NavigationPayload navigationPayload, lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
            this.f33673yggfygwlhe = navigationPayload;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return new nufgyqmvbu(this.f33673yggfygwlhe, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f33674zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            String reference = this.f33673yggfygwlhe.getReference();
            if (reference == null) {
                reference = "";
            }
            return new fg0.zoijcleaow.hkdspvbjdz(new TipsOrderArgs(reference));
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((nufgyqmvbu) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class ojitshcjhn extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f33675zdlpuopuiu;

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
            if (this.f33675zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            return fg0.zoijcleaow.esjtqupxsv.f33710iobyxmoadg;
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((ojitshcjhn) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class oxmwwwfdhm extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f33676zdlpuopuiu;

        oxmwwwfdhm(lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return new oxmwwwfdhm(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f33676zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            return fg0.zoijcleaow.rgvfuqvkyq.f33733iobyxmoadg;
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((oxmwwwfdhm) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: fg0.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    static final class C0744ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f33677cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f33679jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f33680yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f33681zdlpuopuiu;

        C0744ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f33679jyumaefscl = obj;
            this.f33677cqumvgiudr |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.wflxmlrfwp(null, this);
        }
    }

    static final class rgvfuqvkyq extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f33682zdlpuopuiu;

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
            if (this.f33682zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            return fg0.zoijcleaow.cdpycssgdh.f33705iobyxmoadg;
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((rgvfuqvkyq) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class vdvldrhtss extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ DeepLink f33683jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f33685zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        vdvldrhtss(DeepLink deepLink, lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
            this.f33683jyumaefscl = deepLink;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return ppxfxbqfkf.this.new vdvldrhtss(this.f33683jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f33685zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                ppxfxbqfkf ppxfxbqfkfVar = ppxfxbqfkf.this;
                String purchaseListId = ((DeepLink.PurchaseList) this.f33683jyumaefscl).getPurchaseListId();
                this.f33685zdlpuopuiu = 1;
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
            return new fg0.zoijcleaow.iozdgvuglv((PurchaseListSharedWithYouDialogArgs) obj);
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((vdvldrhtss) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wflxmlrfwp extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ ppxfxbqfkf f33686iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ NavigationPayload f33687jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f33688yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f33689zdlpuopuiu;

        public /* synthetic */ class iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final /* synthetic */ int[] f33690iobyxmoadg;

            static {
                int[] iArr = new int[f40.zoijcleaow.values().length];
                try {
                    iArr[f40.zoijcleaow.DELIVERY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f33690iobyxmoadg = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wflxmlrfwp(NavigationPayload navigationPayload, ppxfxbqfkf ppxfxbqfkfVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(1, gxszxtbevoVar);
            this.f33687jyumaefscl = navigationPayload;
            this.f33686iwizpuwonk = ppxfxbqfkfVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(lg.gxszxtbevo gxszxtbevoVar) {
            return new wflxmlrfwp(this.f33687jyumaefscl, this.f33686iwizpuwonk, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            rm.zoijcleaow zoijcleaowVar;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f33688yggfygwlhe;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                rm.zoijcleaow zoijcleaowVar2 = iobyxmoadg.f33690iobyxmoadg[this.f33687jyumaefscl.getNavigationLink().ordinal()] == 1 ? rm.zoijcleaow.Delivery : rm.zoijcleaow.PickUp;
                sm.iobyxmoadg iobyxmoadgVar = this.f33686iwizpuwonk.f33629ojitshcjhn;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                this.f33689zdlpuopuiu = zoijcleaowVar2;
                this.f33688yggfygwlhe = 1;
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
                zoijcleaowVar = (rm.zoijcleaow) this.f33689zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return new fg0.zoijcleaow.nufgyqmvbu(((sm.iobyxmoadg.C2644iobyxmoadg) obj).zoijcleaow(), zoijcleaowVar);
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((wflxmlrfwp) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f33691iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f33693yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f33694zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f33693yggfygwlhe = obj;
            this.f33691iwizpuwonk |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.agtfadlqog(this);
        }
    }

    static final class yggfygwlhe extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f33695zdlpuopuiu;

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
            if (this.f33695zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            return fg0.zoijcleaow.lereixgezr.f33722iobyxmoadg;
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((yggfygwlhe) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zdlpuopuiu extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f33696zdlpuopuiu;

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
            if (this.f33696zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            return new fg0.zoijcleaow.ojitshcjhn(false);
        }

        @Override // tg.draadjrbmk
        public final Object invoke(lg.gxszxtbevo gxszxtbevoVar) {
            return ((zdlpuopuiu) create(gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f33697cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f33699jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f33700yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f33701zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f33699jyumaefscl = obj;
            this.f33697cqumvgiudr |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.gtknphoqwx(null, this);
        }
    }

    public ppxfxbqfkf(c20.eablkybsjg isLoggedInUseCase, g30.ppxfxbqfkf getRestaurantsUseCase, c30.zoijcleaow getPromoUseCase, nz1.iobyxmoadg getDefaultFeedbackPhoneUseCase, j00.wkgbmnqykc optionsInteractor, d60.iobyxmoadg resourcesManager, yj0.iobyxmoadg productsFromBannerComponent, r20.iobyxmoadg getGameUrlUseCase, k00.iobyxmoadg cartInteractor, lo.zoijcleaow analyticsTracker, r42.iobyxmoadg specialBannerFeatureApi, p90.iobyxmoadg evropolisGiftUseCase, yy1.iobyxmoadg purchasesListComponentApi, oa0.wflxmlrfwp isPurchaseListFeatureEnabledUseCase, sm.iobyxmoadg getUserAddressFlowInfo, z10.iobyxmoadg getCurrentDeliveryDataUseCase) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isLoggedInUseCase, "isLoggedInUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getRestaurantsUseCase, "getRestaurantsUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getPromoUseCase, "getPromoUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getDefaultFeedbackPhoneUseCase, "getDefaultFeedbackPhoneUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(optionsInteractor, "optionsInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(resourcesManager, "resourcesManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productsFromBannerComponent, "productsFromBannerComponent");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getGameUrlUseCase, "getGameUrlUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cartInteractor, "cartInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsTracker, "analyticsTracker");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(specialBannerFeatureApi, "specialBannerFeatureApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(evropolisGiftUseCase, "evropolisGiftUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(purchasesListComponentApi, "purchasesListComponentApi");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isPurchaseListFeatureEnabledUseCase, "isPurchaseListFeatureEnabledUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getUserAddressFlowInfo, "getUserAddressFlowInfo");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getCurrentDeliveryDataUseCase, "getCurrentDeliveryDataUseCase");
        this.f33626iobyxmoadg = isLoggedInUseCase;
        this.f33634zoijcleaow = getRestaurantsUseCase;
        this.f33630ppxfxbqfkf = getPromoUseCase;
        this.f33633wkgbmnqykc = getDefaultFeedbackPhoneUseCase;
        this.f33623eablkybsjg = optionsInteractor;
        this.f33625gxszxtbevo = resourcesManager;
        this.f33627lqeggnwhkg = productsFromBannerComponent;
        this.f33628nufgyqmvbu = getGameUrlUseCase;
        this.f33622dxjokdxxww = cartInteractor;
        this.f33620btonecajqb = analyticsTracker;
        this.f33624gtknphoqwx = specialBannerFeatureApi;
        this.f33621draadjrbmk = evropolisGiftUseCase;
        this.f33632wflxmlrfwp = purchasesListComponentApi;
        this.f33619agtfadlqog = isPurchaseListFeatureEnabledUseCase;
        this.f33629ojitshcjhn = getUserAddressFlowInfo;
        this.f33631rgvfuqvkyq = getCurrentDeliveryDataUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object agtfadlqog(lg.gxszxtbevo gxszxtbevoVar) {
        wkgbmnqykc wkgbmnqykcVar;
        ppxfxbqfkf ppxfxbqfkfVar;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i13 = wkgbmnqykcVar.f33691iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f33691iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object objZoijcleaow = wkgbmnqykcVar.f33693yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = wkgbmnqykcVar.f33691iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            c30.zoijcleaow zoijcleaowVar = this.f33630ppxfxbqfkf;
            c30.zoijcleaow.iobyxmoadg iobyxmoadgVar = new c30.zoijcleaow.iobyxmoadg(false, null, 2, null);
            wkgbmnqykcVar.f33694zdlpuopuiu = this;
            wkgbmnqykcVar.f33691iwizpuwonk = 1;
            objZoijcleaow = zoijcleaowVar.zoijcleaow(iobyxmoadgVar, wkgbmnqykcVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            ppxfxbqfkfVar = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ppxfxbqfkfVar = (ppxfxbqfkf) wkgbmnqykcVar.f33694zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(ppxfxbqfkfVar.f33623eablkybsjg.btonecajqb(((Promotion) objZoijcleaow).getCodePromo()));
    }

    static /* synthetic */ Object cqumvgiudr(ppxfxbqfkf ppxfxbqfkfVar, fg0.zoijcleaow zoijcleaowVar, tg.draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            zoijcleaowVar = new fg0.zoijcleaow.oxmwwwfdhm(null, 1, null);
        }
        return ppxfxbqfkfVar.iwizpuwonk(zoijcleaowVar, draadjrbmkVar, gxszxtbevoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object draadjrbmk(String str, lg.gxszxtbevo gxszxtbevoVar) {
        return this.f33628nufgyqmvbu.zoijcleaow(new r20.iobyxmoadg.zoijcleaow(str), gxszxtbevoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object gtknphoqwx(String str, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        Integer numVdvldrhtss;
        int iIntValue;
        ppxfxbqfkf ppxfxbqfkfVar;
        y00.iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f33697cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f33697cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = zoijcleaowVar.f33699jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f33697cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                iIntValue = zoijcleaowVar.f33700yggfygwlhe;
                ppxfxbqfkfVar = (ppxfxbqfkf) zoijcleaowVar.f33701zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iobyxmoadgVar = (y00.iobyxmoadg) zoijcleaowVar.f33701zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            }
            return gg.cqumvgiudr.iobyxmoadg((EvropolisGift) objZoijcleaow, iobyxmoadgVar.ppxfxbqfkf());
        }
        gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        if (str == null || (numVdvldrhtss = mj.kcexrzcfyt.vdvldrhtss(str)) == null) {
            return null;
        }
        iIntValue = numVdvldrhtss.intValue();
        z10.iobyxmoadg iobyxmoadgVar2 = this.f33631rgvfuqvkyq;
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        zoijcleaowVar.f33701zdlpuopuiu = this;
        zoijcleaowVar.f33700yggfygwlhe = iIntValue;
        zoijcleaowVar.f33697cqumvgiudr = 1;
        objZoijcleaow = iobyxmoadgVar2.zoijcleaow(wwaezpbzknVar, zoijcleaowVar);
        if (objZoijcleaow == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        ppxfxbqfkfVar = this;
        y00.iobyxmoadg iobyxmoadgVar3 = (y00.iobyxmoadg) objZoijcleaow;
        p90.iobyxmoadg iobyxmoadgVar4 = ppxfxbqfkfVar.f33621draadjrbmk;
        p90.iobyxmoadg.C1679iobyxmoadg c1679iobyxmoadg = new p90.iobyxmoadg.C1679iobyxmoadg(iIntValue, iobyxmoadgVar3.wkgbmnqykc(), iobyxmoadgVar3.ppxfxbqfkf());
        zoijcleaowVar.f33701zdlpuopuiu = iobyxmoadgVar3;
        zoijcleaowVar.f33697cqumvgiudr = 2;
        Object objInvoke = iobyxmoadgVar4.invoke(c1679iobyxmoadg, zoijcleaowVar);
        if (objInvoke == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        objZoijcleaow = objInvoke;
        iobyxmoadgVar = iobyxmoadgVar3;
        return gg.cqumvgiudr.iobyxmoadg((EvropolisGift) objZoijcleaow, iobyxmoadgVar.ppxfxbqfkf());
    }

    private final Object iwizpuwonk(fg0.zoijcleaow zoijcleaowVar, tg.draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
        return ((Boolean) this.f33626iobyxmoadg.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue() ? draadjrbmkVar.invoke(gxszxtbevoVar) : zoijcleaowVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object jyumaefscl(String str, lg.gxszxtbevo gxszxtbevoVar) {
        esjtqupxsv esjtqupxsvVar;
        if (gxszxtbevoVar instanceof esjtqupxsv) {
            esjtqupxsvVar = (esjtqupxsv) gxszxtbevoVar;
            int i13 = esjtqupxsvVar.f33649jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                esjtqupxsvVar.f33649jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                esjtqupxsvVar = new esjtqupxsv(gxszxtbevoVar);
            }
        } else {
            esjtqupxsvVar = new esjtqupxsv(gxszxtbevoVar);
        }
        Object objZoijcleaow = esjtqupxsvVar.f33651zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = esjtqupxsvVar.f33649jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, "restaurants")) {
                return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(false);
            }
            g30.ppxfxbqfkf ppxfxbqfkfVar = this.f33634zoijcleaow;
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            esjtqupxsvVar.f33649jyumaefscl = 1;
            objZoijcleaow = ppxfxbqfkfVar.zoijcleaow(wwaezpbzknVar, esjtqupxsvVar);
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
        if (str == null || (strWkgbmnqykc = k30.draadjrbmk.wkgbmnqykc(str)) == null) {
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
            int i13 = eablkybsjgVar.f33644cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eablkybsjgVar.f33644cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
            }
        } else {
            eablkybsjgVar = new eablkybsjg(gxszxtbevoVar);
        }
        Object objZoijcleaow = eablkybsjgVar.f33646jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = eablkybsjgVar.f33644cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                str = (String) eablkybsjgVar.f33647yggfygwlhe;
                ppxfxbqfkfVar = (ppxfxbqfkf) eablkybsjgVar.f33648zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            }
            az1.eablkybsjg eablkybsjgVar2 = (az1.eablkybsjg) objZoijcleaow;
            return new PurchaseListSharedWithYouDialogArgs.FeatureEnabled(eablkybsjgVar2.iobyxmoadg(), eablkybsjgVar2.zoijcleaow(), eablkybsjgVar2.ppxfxbqfkf(), eablkybsjgVar2.wkgbmnqykc());
        }
        gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        oa0.wflxmlrfwp wflxmlrfwpVar = this.f33619agtfadlqog;
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        eablkybsjgVar.f33648zdlpuopuiu = this;
        eablkybsjgVar.f33647yggfygwlhe = str;
        eablkybsjgVar.f33644cqumvgiudr = 1;
        objZoijcleaow = wflxmlrfwpVar.zoijcleaow(wwaezpbzknVar, eablkybsjgVar);
        if (objZoijcleaow == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        ppxfxbqfkfVar = this;
        if (!((Boolean) objZoijcleaow).booleanValue()) {
            return PurchaseListSharedWithYouDialogArgs.FeatureDisabled.f102217esjtqupxsv;
        }
        yy1.iobyxmoadg iobyxmoadgVar = ppxfxbqfkfVar.f33632wflxmlrfwp;
        eablkybsjgVar.f33648zdlpuopuiu = null;
        eablkybsjgVar.f33647yggfygwlhe = null;
        eablkybsjgVar.f33644cqumvgiudr = 2;
        objZoijcleaow = iobyxmoadgVar.gtknphoqwx(str, eablkybsjgVar);
        if (objZoijcleaow == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        az1.eablkybsjg eablkybsjgVar3 = (az1.eablkybsjg) objZoijcleaow;
        return new PurchaseListSharedWithYouDialogArgs.FeatureEnabled(eablkybsjgVar3.iobyxmoadg(), eablkybsjgVar3.zoijcleaow(), eablkybsjgVar3.ppxfxbqfkf(), eablkybsjgVar3.wkgbmnqykc());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object oxmwwwfdhm(String str, lg.gxszxtbevo gxszxtbevoVar) {
        lqeggnwhkg lqeggnwhkgVar;
        if (gxszxtbevoVar instanceof lqeggnwhkg) {
            lqeggnwhkgVar = (lqeggnwhkg) gxszxtbevoVar;
            int i13 = lqeggnwhkgVar.f33669iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                lqeggnwhkgVar.f33669iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                lqeggnwhkgVar = new lqeggnwhkg(gxszxtbevoVar);
            }
        } else {
            lqeggnwhkgVar = new lqeggnwhkg(gxszxtbevoVar);
        }
        Object objZoijcleaow = lqeggnwhkgVar.f33671yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = lqeggnwhkgVar.f33669iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            if (str == null) {
                return null;
            }
            g30.ppxfxbqfkf ppxfxbqfkfVar = this.f33634zoijcleaow;
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            lqeggnwhkgVar.f33672zdlpuopuiu = str;
            lqeggnwhkgVar.f33669iwizpuwonk = 1;
            objZoijcleaow = ppxfxbqfkfVar.zoijcleaow(wwaezpbzknVar, lqeggnwhkgVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) lqeggnwhkgVar.f33672zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        if (k30.zoijcleaow.iobyxmoadg((List) objZoijcleaow) != null) {
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
            int i13 = gxszxtbevoVar2.f33660lereixgezr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gxszxtbevoVar2.f33660lereixgezr = i13 - Integer.MIN_VALUE;
            } else {
                gxszxtbevoVar2 = new gxszxtbevo(gxszxtbevoVar);
            }
        } else {
            gxszxtbevoVar2 = new gxszxtbevo(gxszxtbevoVar);
        }
        Object objZoijcleaow = gxszxtbevoVar2.f33656cqumvgiudr;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = gxszxtbevoVar2.f33660lereixgezr;
        if (i14 != 0) {
            if (i14 == 1) {
                boolean z15 = gxszxtbevoVar2.f33658iwizpuwonk;
                String str5 = (String) gxszxtbevoVar2.f33659jyumaefscl;
                String str6 = (String) gxszxtbevoVar2.f33661yggfygwlhe;
                ppxfxbqfkf ppxfxbqfkfVar2 = (ppxfxbqfkf) gxszxtbevoVar2.f33662zdlpuopuiu;
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
        z10.iobyxmoadg iobyxmoadgVar = this.f33631rgvfuqvkyq;
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        gxszxtbevoVar2.f33662zdlpuopuiu = this;
        gxszxtbevoVar2.f33661yggfygwlhe = str4;
        gxszxtbevoVar2.f33659jyumaefscl = str2;
        gxszxtbevoVar2.f33658iwizpuwonk = z13;
        gxszxtbevoVar2.f33660lereixgezr = 1;
        objZoijcleaow = iobyxmoadgVar.zoijcleaow(wwaezpbzknVar, gxszxtbevoVar2);
        if (objZoijcleaow == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        ppxfxbqfkfVar = this;
        str3 = str2;
        z14 = z13;
        y00.iobyxmoadg iobyxmoadgVar2 = (y00.iobyxmoadg) objZoijcleaow;
        s42.iobyxmoadg iobyxmoadgVar3 = new s42.iobyxmoadg(str4, iobyxmoadgVar2.wkgbmnqykc(), iobyxmoadgVar2.ppxfxbqfkf(), str3, z14);
        lo.zoijcleaow zoijcleaowVar = ppxfxbqfkfVar.f33620btonecajqb;
        String strWkgbmnqykc = iobyxmoadgVar2.wkgbmnqykc();
        DeliveryCode deliveryCodePpxfxbqfkf = iobyxmoadgVar2.ppxfxbqfkf();
        zoijcleaowVar.wkgbmnqykc(new oo.dxjokdxxww.iobyxmoadg(str4, null, null, strWkgbmnqykc, deliveryCodePpxfxbqfkf != null ? deliveryCodePpxfxbqfkf.getServerCode() : null, 6, null));
        r42.iobyxmoadg iobyxmoadgVar4 = ppxfxbqfkfVar.f33624gtknphoqwx;
        gxszxtbevoVar2.f33662zdlpuopuiu = null;
        gxszxtbevoVar2.f33661yggfygwlhe = null;
        gxszxtbevoVar2.f33659jyumaefscl = null;
        gxszxtbevoVar2.f33660lereixgezr = 2;
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
        C0744ppxfxbqfkf c0744ppxfxbqfkf;
        ppxfxbqfkf ppxfxbqfkfVar;
        String str2;
        y00.iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof C0744ppxfxbqfkf) {
            c0744ppxfxbqfkf = (C0744ppxfxbqfkf) gxszxtbevoVar;
            int i13 = c0744ppxfxbqfkf.f33677cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0744ppxfxbqfkf.f33677cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                c0744ppxfxbqfkf = new C0744ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            c0744ppxfxbqfkf = new C0744ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objZoijcleaow = c0744ppxfxbqfkf.f33679jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c0744ppxfxbqfkf.f33677cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                str = (String) c0744ppxfxbqfkf.f33680yggfygwlhe;
                ppxfxbqfkfVar = (ppxfxbqfkf) c0744ppxfxbqfkf.f33681zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iobyxmoadgVar = (y00.iobyxmoadg) c0744ppxfxbqfkf.f33680yggfygwlhe;
                str2 = (String) c0744ppxfxbqfkf.f33681zdlpuopuiu;
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
        z10.iobyxmoadg iobyxmoadgVar2 = this.f33631rgvfuqvkyq;
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        c0744ppxfxbqfkf.f33681zdlpuopuiu = this;
        c0744ppxfxbqfkf.f33680yggfygwlhe = str;
        c0744ppxfxbqfkf.f33677cqumvgiudr = 1;
        objZoijcleaow = iobyxmoadgVar2.zoijcleaow(wwaezpbzknVar, c0744ppxfxbqfkf);
        if (objZoijcleaow == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        ppxfxbqfkfVar = this;
        y00.iobyxmoadg iobyxmoadgVar3 = (y00.iobyxmoadg) objZoijcleaow;
        zj0.ppxfxbqfkf ppxfxbqfkfVar2 = new zj0.ppxfxbqfkf(str, iobyxmoadgVar3.wkgbmnqykc(), iobyxmoadgVar3.ppxfxbqfkf());
        yj0.iobyxmoadg iobyxmoadgVar4 = ppxfxbqfkfVar.f33627lqeggnwhkg;
        c0744ppxfxbqfkf.f33681zdlpuopuiu = str;
        c0744ppxfxbqfkf.f33680yggfygwlhe = iobyxmoadgVar3;
        c0744ppxfxbqfkf.f33677cqumvgiudr = 2;
        Object objPpxfxbqfkf = iobyxmoadgVar4.ppxfxbqfkf(ppxfxbqfkfVar2, c0744ppxfxbqfkf);
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
        cqumvgiudr cqumvgiudrVar;
        if (gxszxtbevoVar instanceof cqumvgiudr) {
            cqumvgiudrVar = (cqumvgiudr) gxszxtbevoVar;
            int i13 = cqumvgiudrVar.f33637iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cqumvgiudrVar.f33637iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                cqumvgiudrVar = new cqumvgiudr(gxszxtbevoVar);
            }
        } else {
            cqumvgiudrVar = new cqumvgiudr(gxszxtbevoVar);
        }
        Object objZoijcleaow = cqumvgiudrVar.f33639yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = cqumvgiudrVar.f33637iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            g30.ppxfxbqfkf ppxfxbqfkfVar = this.f33634zoijcleaow;
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            cqumvgiudrVar.f33640zdlpuopuiu = str;
            cqumvgiudrVar.f33637iwizpuwonk = 1;
            objZoijcleaow = ppxfxbqfkfVar.zoijcleaow(wwaezpbzknVar, cqumvgiudrVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) cqumvgiudrVar.f33640zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        }
        List list = (List) objZoijcleaow;
        if (list.isEmpty()) {
            return fg0.zoijcleaow.vdvldrhtss.f33734iobyxmoadg;
        }
        if (str == null || mj.kcexrzcfyt.zfvoamnweg(str)) {
            return new fg0.zoijcleaow.wkgbmnqykc(true);
        }
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((Restaurant) it.next()).getCode(), str)) {
                    return new fg0.zoijcleaow.pkzmftpjix(new SpecificRestaurantArgs(str));
                }
            }
        }
        return fg0.zoijcleaow.vdvldrhtss.f33734iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x028b  */
    /* JADX WARN: Code duplicated, block: B:134:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:143:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:175:0x0363  */
    /* JADX WARN: Code duplicated, block: B:181:0x037d  */
    /* JADX WARN: Code duplicated, block: B:259:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:268:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:270:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:279:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:281:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object zdlpuopuiu(NavigationPayload navigationPayload, lg.gxszxtbevo gxszxtbevoVar) {
        gtknphoqwx gtknphoqwxVar;
        Object objWkgbmnqykc;
        fg0.zoijcleaow.wkgbmnqykc wkgbmnqykcVar;
        gg.vdvldrhtss vdvldrhtssVar;
        ProductsFromBannerScreenArgs productsFromBannerScreenArgs;
        fg0.zoijcleaow.cqumvgiudr cqumvgiudrVar;
        SpecificRestaurantArgs specificRestaurantArgs;
        SpecialBannerPayload specialBannerPayload;
        SpecialBannerPayload specialBannerPayload2;
        if (gxszxtbevoVar instanceof gtknphoqwx) {
            gtknphoqwxVar = (gtknphoqwx) gxszxtbevoVar;
            int i13 = gtknphoqwxVar.f33652iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gtknphoqwxVar.f33652iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                gtknphoqwxVar = new gtknphoqwx(gxszxtbevoVar);
            }
        } else {
            gtknphoqwxVar = new gtknphoqwx(gxszxtbevoVar);
        }
        gtknphoqwx gtknphoqwxVar2 = gtknphoqwxVar;
        Object objCqumvgiudr = gtknphoqwxVar2.f33654yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        try {
            switch (gtknphoqwxVar2.f33652iwizpuwonk) {
                case 0:
                    gg.zdlpuopuiu.zoijcleaow(objCqumvgiudr);
                    f40.zoijcleaow navigationLink = navigationPayload.getNavigationLink();
                    switch (iobyxmoadg.f33663iobyxmoadg[navigationLink.ordinal()]) {
                        case 1:
                        case 2:
                            draadjrbmk draadjrbmkVar = new draadjrbmk(null);
                            gtknphoqwxVar2.f33652iwizpuwonk = 1;
                            objCqumvgiudr = cqumvgiudr(this, null, draadjrbmkVar, gtknphoqwxVar2, 1, null);
                            return objCqumvgiudr == objGxszxtbevo ? objGxszxtbevo : objCqumvgiudr;
                        case 3:
                        case 4:
                            wflxmlrfwp wflxmlrfwpVar = new wflxmlrfwp(navigationPayload, this, null);
                            gtknphoqwxVar2.f33652iwizpuwonk = 2;
                            objCqumvgiudr = cqumvgiudr(this, null, wflxmlrfwpVar, gtknphoqwxVar2, 1, null);
                            return objCqumvgiudr == objGxszxtbevo ? objGxszxtbevo : objCqumvgiudr;
                        case 5:
                            oxmwwwfdhm oxmwwwfdhmVar = new oxmwwwfdhm(null);
                            gtknphoqwxVar2.f33652iwizpuwonk = 3;
                            objCqumvgiudr = cqumvgiudr(this, null, oxmwwwfdhmVar, gtknphoqwxVar2, 1, null);
                            return objCqumvgiudr == objGxszxtbevo ? objGxszxtbevo : objCqumvgiudr;
                        case 6:
                            kcexrzcfyt kcexrzcfytVar = new kcexrzcfyt(null);
                            gtknphoqwxVar2.f33652iwizpuwonk = 4;
                            objCqumvgiudr = cqumvgiudr(this, null, kcexrzcfytVar, gtknphoqwxVar2, 1, null);
                            return objCqumvgiudr == objGxszxtbevo ? objGxszxtbevo : objCqumvgiudr;
                        case 7:
                            zdlpuopuiu zdlpuopuiuVar = new zdlpuopuiu(null);
                            gtknphoqwxVar2.f33652iwizpuwonk = 5;
                            objCqumvgiudr = cqumvgiudr(this, null, zdlpuopuiuVar, gtknphoqwxVar2, 1, null);
                            return objCqumvgiudr == objGxszxtbevo ? objGxszxtbevo : objCqumvgiudr;
                        case 8:
                            yggfygwlhe yggfygwlheVar = new yggfygwlhe(null);
                            gtknphoqwxVar2.f33652iwizpuwonk = 6;
                            objCqumvgiudr = cqumvgiudr(this, null, yggfygwlheVar, gtknphoqwxVar2, 1, null);
                            return objCqumvgiudr == objGxszxtbevo ? objGxszxtbevo : objCqumvgiudr;
                        case 9:
                            jyumaefscl jyumaefsclVar = new jyumaefscl(null);
                            gtknphoqwxVar2.f33652iwizpuwonk = 7;
                            objCqumvgiudr = cqumvgiudr(this, null, jyumaefsclVar, gtknphoqwxVar2, 1, null);
                            return objCqumvgiudr == objGxszxtbevo ? objGxszxtbevo : objCqumvgiudr;
                        case 10:
                            iwizpuwonk iwizpuwonkVar = new iwizpuwonk(navigationPayload, null);
                            gtknphoqwxVar2.f33652iwizpuwonk = 8;
                            objCqumvgiudr = cqumvgiudr(this, null, iwizpuwonkVar, gtknphoqwxVar2, 1, null);
                            return objCqumvgiudr == objGxszxtbevo ? objGxszxtbevo : objCqumvgiudr;
                        case 11:
                            nufgyqmvbu nufgyqmvbuVar = new nufgyqmvbu(navigationPayload, null);
                            gtknphoqwxVar2.f33652iwizpuwonk = 9;
                            objCqumvgiudr = cqumvgiudr(this, null, nufgyqmvbuVar, gtknphoqwxVar2, 1, null);
                            return objCqumvgiudr == objGxszxtbevo ? objGxszxtbevo : objCqumvgiudr;
                        case 12:
                            tg.draadjrbmk dxjokdxxwwVar = new dxjokdxxww(navigationPayload, null);
                            gtknphoqwxVar2.f33652iwizpuwonk = 10;
                            objCqumvgiudr = iwizpuwonk(null, dxjokdxxwwVar, gtknphoqwxVar2);
                            return objCqumvgiudr == objGxszxtbevo ? objGxszxtbevo : objCqumvgiudr;
                        case 13:
                            tg.draadjrbmk btonecajqbVar = new btonecajqb(null);
                            gtknphoqwxVar2.f33652iwizpuwonk = 11;
                            objCqumvgiudr = iwizpuwonk(null, btonecajqbVar, gtknphoqwxVar2);
                            return objCqumvgiudr == objGxszxtbevo ? objGxszxtbevo : objCqumvgiudr;
                        case 14:
                        case 15:
                        case 16:
                            String reference = navigationPayload.getReference();
                            return new fg0.zoijcleaow.zdlpuopuiu(new ProductPayload(new ProductPayload.Type.Article(reference != null ? reference : ""), null, 2, null));
                        case 17:
                            wkgbmnqykcVar = new fg0.zoijcleaow.wkgbmnqykc(false, 1, null);
                            return wkgbmnqykcVar;
                        case 18:
                        case 19:
                            String reference2 = navigationPayload.getReference();
                            return new fg0.zoijcleaow.hcddaimhww(new SubCatalogArgs(null, null, reference2 == null ? "" : reference2, navigationPayload.getTitle(), 3, null));
                        case 20:
                            return new fg0.zoijcleaow.yggfygwlhe(new ProductListPayload(null, null, navigationPayload.getReference(), null, null, this.f33625gxszxtbevo.getString(s40.draadjrbmk.catalog), null, null, true, 219, null), MainTab.CATALOG);
                        case 21:
                        case 22:
                            return new fg0.zoijcleaow.yggfygwlhe(new ProductListPayload(null, null, navigationPayload.getReference(), navigationPayload.getReference(), null, navigationPayload.getTitle(), navigationLink == f40.zoijcleaow.SELECTION ? navigationPayload.getReference() : null, null, true, 147, null), null);
                        case 23:
                            return fg0.zoijcleaow.lmojexxdyd.f33723iobyxmoadg;
                        case 24:
                            return fg0.zoijcleaow.draadjrbmk.f33707iobyxmoadg;
                        case C4007z9.F /* 25 */:
                        case C4007z9.G /* 26 */:
                            return fg0.zoijcleaow.C0745zoijcleaow.f33743iobyxmoadg;
                        case 27:
                            return fg0.zoijcleaow.yadqdtsiqt.f33738iobyxmoadg;
                        case 28:
                            String strWkgbmnqykc = k30.draadjrbmk.wkgbmnqykc(navigationPayload.getReference());
                            if (strWkgbmnqykc != null) {
                                return new fg0.zoijcleaow.gtknphoqwx(strWkgbmnqykc);
                            }
                            return null;
                        case C4007z9.I /* 29 */:
                            return fg0.zoijcleaow.agtfadlqog.f33702iobyxmoadg;
                        case 30:
                            String reference3 = navigationPayload.getReference();
                            gtknphoqwxVar2.f33652iwizpuwonk = 12;
                            objCqumvgiudr = gtknphoqwx(reference3, gtknphoqwxVar2);
                            if (objCqumvgiudr == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            vdvldrhtssVar = (gg.vdvldrhtss) objCqumvgiudr;
                            if (vdvldrhtssVar != null) {
                                return new fg0.zoijcleaow.btonecajqb((EvropolisGift) vdvldrhtssVar.iobyxmoadg(), (DeliveryCode) vdvldrhtssVar.wkgbmnqykc());
                            }
                            return null;
                        case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                            String reference4 = navigationPayload.getReference();
                            gtknphoqwxVar2.f33652iwizpuwonk = 13;
                            objCqumvgiudr = wflxmlrfwp(reference4, gtknphoqwxVar2);
                            if (objCqumvgiudr == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            productsFromBannerScreenArgs = (ProductsFromBannerScreenArgs) objCqumvgiudr;
                            if (productsFromBannerScreenArgs != null) {
                                return new fg0.zoijcleaow.jyumaefscl(productsFromBannerScreenArgs);
                            }
                            return null;
                        case 32:
                            String strWkgbmnqykc2 = k30.draadjrbmk.wkgbmnqykc(navigationPayload.getReference());
                            if (strWkgbmnqykc2 != null) {
                                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                                k00.iobyxmoadg iobyxmoadgVar2 = this.f33622dxjokdxxww;
                                gtknphoqwxVar2.f33652iwizpuwonk = 14;
                                objCqumvgiudr = iobyxmoadgVar2.yggfygwlhe(strWkgbmnqykc2, gtknphoqwxVar2);
                                if (objCqumvgiudr == objGxszxtbevo) {
                                    return objGxszxtbevo;
                                }
                                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((wwaezpbzkn) objCqumvgiudr);
                                gg.kcexrzcfyt.iobyxmoadg(objWkgbmnqykc);
                            }
                            return fg0.zoijcleaow.ppxfxbqfkf.f33732iobyxmoadg;
                        case 33:
                            String reference5 = navigationPayload.getReference();
                            if (reference5 == null || mj.kcexrzcfyt.zfvoamnweg(reference5)) {
                                reference5 = null;
                            }
                            if (reference5 != null) {
                                return new fg0.zoijcleaow.pmvmpeiblj(reference5);
                            }
                            return null;
                        case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                            gtknphoqwxVar2.f33652iwizpuwonk = 15;
                            objCqumvgiudr = agtfadlqog(gtknphoqwxVar2);
                            if (objCqumvgiudr == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            return (((Boolean) (((Boolean) objCqumvgiudr).booleanValue() ? objCqumvgiudr : null)) != null || (cqumvgiudrVar = fg0.zoijcleaow.cqumvgiudr.f33706iobyxmoadg) == null) ? fg0.zoijcleaow.iwizpuwonk.f33718iobyxmoadg : cqumvgiudrVar;
                        case C4007z9.J /* 35 */:
                            SubscriptionDetailPayload subscriptionDetailPayloadKcexrzcfyt = kcexrzcfyt(navigationPayload.getReference());
                            if (subscriptionDetailPayloadKcexrzcfyt != null) {
                                return new fg0.zoijcleaow.jpowsppfya(subscriptionDetailPayloadKcexrzcfyt);
                            }
                            return null;
                        case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                            String reference6 = navigationPayload.getReference();
                            gtknphoqwxVar2.f33652iwizpuwonk = 16;
                            objCqumvgiudr = oxmwwwfdhm(reference6, gtknphoqwxVar2);
                            if (objCqumvgiudr == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            specificRestaurantArgs = (SpecificRestaurantArgs) objCqumvgiudr;
                            if (specificRestaurantArgs != null) {
                                return new fg0.zoijcleaow.pkzmftpjix(specificRestaurantArgs);
                            }
                            return null;
                        case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                            fg0.zoijcleaow.wkgbmnqykc wkgbmnqykcVar2 = new fg0.zoijcleaow.wkgbmnqykc(true);
                            String reference7 = navigationPayload.getReference();
                            gtknphoqwxVar2.f33655zdlpuopuiu = wkgbmnqykcVar2;
                            gtknphoqwxVar2.f33652iwizpuwonk = 17;
                            Object objJyumaefscl = jyumaefscl(reference7, gtknphoqwxVar2);
                            if (objJyumaefscl == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            objCqumvgiudr = objJyumaefscl;
                            wkgbmnqykcVar = wkgbmnqykcVar2;
                            if (!((Boolean) objCqumvgiudr).booleanValue()) {
                                return null;
                            }
                            return wkgbmnqykcVar;
                        case C4007z9.K /* 38 */:
                        case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                            String reference8 = navigationPayload.getReference();
                            String title = navigationPayload.getTitle();
                            boolean isAdultConfirmed = navigationPayload.getIsAdultConfirmed();
                            gtknphoqwxVar2.f33652iwizpuwonk = 18;
                            objCqumvgiudr = rgvfuqvkyq(reference8, title, isAdultConfirmed, gtknphoqwxVar2);
                            if (objCqumvgiudr == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            specialBannerPayload = (SpecialBannerPayload) objCqumvgiudr;
                            if (specialBannerPayload != null) {
                                return new fg0.zoijcleaow.wwaezpbzkn(specialBannerPayload);
                            }
                            return null;
                        case 40:
                            String strWkgbmnqykc3 = k30.draadjrbmk.wkgbmnqykc(navigationPayload.getReference());
                            if (strWkgbmnqykc3 == null) {
                                strWkgbmnqykc3 = (String) this.f33633wkgbmnqykc.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg);
                            }
                            return new fg0.zoijcleaow.iobyxmoadg(strWkgbmnqykc3);
                        case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                            return new fg0.zoijcleaow.zynmafqrjb(new xa0.wflxmlrfwp(navigationPayload.getTitle(), navigationPayload.getMessage(), navigationPayload.getReference()));
                        case 42:
                            DeepLink deepLink = navigationPayload.getDeepLink();
                            if (deepLink instanceof DeepLink.MyDiscounts) {
                                agtfadlqog agtfadlqogVar = new agtfadlqog(null);
                                gtknphoqwxVar2.f33652iwizpuwonk = 19;
                                objCqumvgiudr = cqumvgiudr(this, null, agtfadlqogVar, gtknphoqwxVar2, 1, null);
                                return objCqumvgiudr == objGxszxtbevo ? objGxszxtbevo : objCqumvgiudr;
                            }
                            if (deepLink instanceof DeepLink.Purchases) {
                                tg.draadjrbmk ojitshcjhnVar = new ojitshcjhn(null);
                                gtknphoqwxVar2.f33652iwizpuwonk = 20;
                                objCqumvgiudr = iwizpuwonk(null, ojitshcjhnVar, gtknphoqwxVar2);
                                return objCqumvgiudr == objGxszxtbevo ? objGxszxtbevo : objCqumvgiudr;
                            }
                            if (deepLink instanceof DeepLink.ReturnFromPaySystem) {
                                tg.draadjrbmk rgvfuqvkyqVar = new rgvfuqvkyq(null);
                                gtknphoqwxVar2.f33652iwizpuwonk = 21;
                                objCqumvgiudr = iwizpuwonk(null, rgvfuqvkyqVar, gtknphoqwxVar2);
                                return objCqumvgiudr == objGxszxtbevo ? objGxszxtbevo : objCqumvgiudr;
                            }
                            if (deepLink instanceof DeepLink.Catalog.ProductList) {
                                DeepLink.Catalog.ProductList productList = (DeepLink.Catalog.ProductList) deepLink;
                                return new fg0.zoijcleaow.yggfygwlhe(new ProductListPayload(null, null, productList.getSectionId(), productList.getParentId(), null, null, null, null, true, 243, null), MainTab.CATALOG);
                            }
                            if (deepLink instanceof DeepLink.Catalog.SubCatalog) {
                                return new fg0.zoijcleaow.hcddaimhww(new SubCatalogArgs(null, null, ((DeepLink.Catalog.SubCatalog) deepLink).getSectionId(), this.f33625gxszxtbevo.getString(s40.draadjrbmk.catalog), 3, null));
                            }
                            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(deepLink, DeepLink.Catalog.Tab.f87534cqumvgiudr)) {
                                wkgbmnqykcVar = new fg0.zoijcleaow.wkgbmnqykc(false, 1, null);
                                return wkgbmnqykcVar;
                            }
                            if (deepLink instanceof DeepLink.Product) {
                                return new fg0.zoijcleaow.zdlpuopuiu(new ProductPayload(new ProductPayload.Type.ProductId(((DeepLink.Product) deepLink).getId()), null, 2, null));
                            }
                            if (deepLink instanceof DeepLink.BlockBanners) {
                                String id2 = ((DeepLink.BlockBanners) deepLink).getId();
                                gtknphoqwxVar2.f33652iwizpuwonk = 22;
                                objCqumvgiudr = vdvldrhtss(this, id2, null, false, gtknphoqwxVar2, 6, null);
                                if (objCqumvgiudr == objGxszxtbevo) {
                                    return objGxszxtbevo;
                                }
                                specialBannerPayload2 = (SpecialBannerPayload) objCqumvgiudr;
                                if (specialBannerPayload2 != null) {
                                    return new fg0.zoijcleaow.wwaezpbzkn(specialBannerPayload2);
                                }
                                return null;
                            }
                            if (deepLink instanceof DeepLink.Partner) {
                                String code = ((DeepLink.Partner) deepLink).getCode();
                                gtknphoqwxVar2.f33652iwizpuwonk = 23;
                                objCqumvgiudr = yggfygwlhe(code, gtknphoqwxVar2);
                                if (objCqumvgiudr == objGxszxtbevo) {
                                    return objGxszxtbevo;
                                }
                                return (fg0.zoijcleaow) objCqumvgiudr;
                            }
                            if (deepLink instanceof DeepLink.Subscription) {
                                SubscriptionDetailPayload subscriptionDetailPayloadKcexrzcfyt2 = kcexrzcfyt(((DeepLink.Subscription) deepLink).getSubscriptionId());
                                if (subscriptionDetailPayloadKcexrzcfyt2 != null) {
                                    return new fg0.zoijcleaow.jpowsppfya(subscriptionDetailPayloadKcexrzcfyt2);
                                }
                                return null;
                            }
                            if (deepLink instanceof DeepLink.RedirectPayment) {
                                return new fg0.zoijcleaow.istkbnxepw(new RedirectPaySuccessPayload(((DeepLink.RedirectPayment) deepLink).getOrderId()));
                            }
                            if (deepLink instanceof DeepLink.PurchaseList) {
                                vdvldrhtss vdvldrhtssVar2 = new vdvldrhtss(deepLink, null);
                                gtknphoqwxVar2.f33652iwizpuwonk = 24;
                                objCqumvgiudr = cqumvgiudr(this, null, vdvldrhtssVar2, gtknphoqwxVar2, 1, null);
                                return objCqumvgiudr == objGxszxtbevo ? objGxszxtbevo : objCqumvgiudr;
                            }
                            if (deepLink instanceof DeepLink.Combo) {
                                return new fg0.zoijcleaow.lqeggnwhkg(((DeepLink.Combo) deepLink).getComboId());
                            }
                            if (deepLink instanceof DeepLink.None) {
                                return null;
                            }
                            throw new NoWhenBranchMatchedException();
                        case 43:
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
                    vdvldrhtssVar = (gg.vdvldrhtss) objCqumvgiudr;
                    if (vdvldrhtssVar != null) {
                        return new fg0.zoijcleaow.btonecajqb((EvropolisGift) vdvldrhtssVar.iobyxmoadg(), (DeliveryCode) vdvldrhtssVar.wkgbmnqykc());
                    }
                    return null;
                case 13:
                    gg.zdlpuopuiu.zoijcleaow(objCqumvgiudr);
                    productsFromBannerScreenArgs = (ProductsFromBannerScreenArgs) objCqumvgiudr;
                    if (productsFromBannerScreenArgs != null) {
                        return new fg0.zoijcleaow.jyumaefscl(productsFromBannerScreenArgs);
                    }
                    return null;
                case 14:
                    gg.zdlpuopuiu.zoijcleaow(objCqumvgiudr);
                    objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc((wwaezpbzkn) objCqumvgiudr);
                    gg.kcexrzcfyt.iobyxmoadg(objWkgbmnqykc);
                    return fg0.zoijcleaow.ppxfxbqfkf.f33732iobyxmoadg;
                case 15:
                    gg.zdlpuopuiu.zoijcleaow(objCqumvgiudr);
                    if (((Boolean) (((Boolean) objCqumvgiudr).booleanValue() ? objCqumvgiudr : null)) != null) {
                    }
                    break;
                case 16:
                    gg.zdlpuopuiu.zoijcleaow(objCqumvgiudr);
                    specificRestaurantArgs = (SpecificRestaurantArgs) objCqumvgiudr;
                    if (specificRestaurantArgs != null) {
                        return new fg0.zoijcleaow.pkzmftpjix(specificRestaurantArgs);
                    }
                    return null;
                case 17:
                    wkgbmnqykcVar = (fg0.zoijcleaow.wkgbmnqykc) gtknphoqwxVar2.f33655zdlpuopuiu;
                    gg.zdlpuopuiu.zoijcleaow(objCqumvgiudr);
                    if (!((Boolean) objCqumvgiudr).booleanValue()) {
                        return null;
                    }
                    return wkgbmnqykcVar;
                case 18:
                    gg.zdlpuopuiu.zoijcleaow(objCqumvgiudr);
                    specialBannerPayload = (SpecialBannerPayload) objCqumvgiudr;
                    if (specialBannerPayload != null) {
                        return new fg0.zoijcleaow.wwaezpbzkn(specialBannerPayload);
                    }
                    return null;
                case 19:
                    gg.zdlpuopuiu.zoijcleaow(objCqumvgiudr);
                case 20:
                    gg.zdlpuopuiu.zoijcleaow(objCqumvgiudr);
                case 21:
                    gg.zdlpuopuiu.zoijcleaow(objCqumvgiudr);
                case 22:
                    gg.zdlpuopuiu.zoijcleaow(objCqumvgiudr);
                    specialBannerPayload2 = (SpecialBannerPayload) objCqumvgiudr;
                    if (specialBannerPayload2 != null) {
                        return new fg0.zoijcleaow.wwaezpbzkn(specialBannerPayload2);
                    }
                    return null;
                case 23:
                    gg.zdlpuopuiu.zoijcleaow(objCqumvgiudr);
                    return (fg0.zoijcleaow) objCqumvgiudr;
                case 24:
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
