package u61;

import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinVersion;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.jvm.internal.agtfadlqog;
import kotlin.jvm.internal.gtknphoqwx;
import ow1.esjtqupxsv;
import p01.dxjokdxxww;
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import pj.wypolnanlu;
import ru.myspar.proloyalty.core.domain.models.BaseProduct;
import ru.myspar.proloyalty.core.domain.models.LoadingBase;
import ru.myspar.proloyalty.core.domain.models.cart.Cart;
import ru.myspar.proloyalty.core.domain.models.cart.IntervalInfo;
import ru.myspar.proloyalty.core.domain.models.restaurants.RestaurantDetails;
import ru.myspar.proloyalty.core.domain.models.restaurants.RestaurantProduct;
import ru.myspar.proloyalty.core.domain.models.restaurants.RestaurantSection;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import ru.myspar.proloyalty.core.models.measure_type.MeasureType;
import ru.myspar.proloyalty.core.models.paging.Paging;
import ru.myspar.proloyalty.domain.feature.specificrestaurant.store.State;
import sj.nufgyqmvbu;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public static final C2792iobyxmoadg f112810btonecajqb = new C2792iobyxmoadg(null);

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public static final int f112811gtknphoqwx = 8;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private auzgnhcxok f112812dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final esjtqupxsv f112813eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final dxjokdxxww f112814gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final dr0.iobyxmoadg f112815lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private auzgnhcxok f112816nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final cz0.iobyxmoadg f112817ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final m11.iobyxmoadg f112818wkgbmnqykc;

    static final class eablkybsjg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ int f112819jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f112821zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        eablkybsjg(int i13, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f112819jyumaefscl = i13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new eablkybsjg(this.f112819jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f112821zdlpuopuiu;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    State stateZfvoamnweg = iobyxmoadg.zfvoamnweg(iobyxmoadg.this);
                    List productList = stateZfvoamnweg.getProductList();
                    if (!stateZfvoamnweg.getProducts().isEmpty()) {
                        productList = jyumaefscl.jrbgnlbqoe(productList, LoadingBase.f94455zdlpuopuiu);
                    }
                    iobyxmoadg.this.ulzqkzuiru(new u61.gxszxtbevo.nufgyqmvbu(productList));
                    iobyxmoadg.this.ulzqkzuiru(new u61.gxszxtbevo.dxjokdxxww(productList));
                    m11.iobyxmoadg.zoijcleaow zoijcleaowVar = new m11.iobyxmoadg.zoijcleaow(stateZfvoamnweg.getRestaurantId(), stateZfvoamnweg.getCatalogSectionId(), this.f112819jyumaefscl);
                    iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                    m11.iobyxmoadg iobyxmoadgVar3 = iobyxmoadgVar.f112818wkgbmnqykc;
                    this.f112821zdlpuopuiu = 1;
                    obj = iobyxmoadgVar3.zoijcleaow(zoijcleaowVar, this);
                    if (obj == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((RestaurantDetails) obj);
            } catch (Throwable th2) {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th2));
            }
            iobyxmoadg iobyxmoadgVar5 = iobyxmoadg.this;
            int i14 = this.f112819jyumaefscl;
            if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                iobyxmoadgVar5.ageimvtcrz((RestaurantDetails) objWkgbmnqykc, i14);
            }
            Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar5.fiwbwshyhd(thDxjokdxxww);
            }
            iobyxmoadg.this.ulzqkzuiru(new u61.gxszxtbevo.zoijcleaow(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((eablkybsjg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gxszxtbevo extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f112823zdlpuopuiu;

        /* JADX INFO: renamed from: u61.iobyxmoadg$gxszxtbevo$iobyxmoadg, reason: collision with other inner class name */
        static final class C2791iobyxmoadg extends draadjrbmk implements vdvldrhtss {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f112824jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            /* synthetic */ Object f112825yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f112826zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2791iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(3, gxszxtbevoVar);
                this.f112824jyumaefscl = iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                mg.zoijcleaow.gxszxtbevo();
                if (this.f112826zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
                this.f112824jyumaefscl.fiwbwshyhd((Throwable) this.f112825yggfygwlhe);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.vdvldrhtss
            /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
            public final Object invoke(nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
                C2791iobyxmoadg c2791iobyxmoadg = new C2791iobyxmoadg(this.f112824jyumaefscl, gxszxtbevoVar);
                c2791iobyxmoadg.f112825yggfygwlhe = th2;
                return c2791iobyxmoadg.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* synthetic */ class zoijcleaow implements nufgyqmvbu, agtfadlqog {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f112827zdlpuopuiu;

            zoijcleaow(iobyxmoadg iobyxmoadgVar) {
                this.f112827zdlpuopuiu = iobyxmoadgVar;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof nufgyqmvbu) && (obj instanceof agtfadlqog)) {
                    return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaow(), ((agtfadlqog) obj).zoijcleaow());
                }
                return false;
            }

            public final int hashCode() {
                return zoijcleaow().hashCode();
            }

            @Override // sj.nufgyqmvbu
            /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
            public final Object emit(kz0.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
                Object objKcexrzcfyt = gxszxtbevo.kcexrzcfyt(this.f112827zdlpuopuiu, eablkybsjgVar, gxszxtbevoVar);
                return objKcexrzcfyt == mg.zoijcleaow.gxszxtbevo() ? objKcexrzcfyt : wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // kotlin.jvm.internal.agtfadlqog
            public final gg.dxjokdxxww zoijcleaow() {
                return new kotlin.jvm.internal.iobyxmoadg(2, this.f112827zdlpuopuiu, iobyxmoadg.class, "processCartState", "processCartState(Lru/myspar/proloyalty/core/domain/models/cart/CartState;)V", 4);
            }
        }

        gxszxtbevo(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object kcexrzcfyt(iobyxmoadg iobyxmoadgVar, kz0.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
            iobyxmoadgVar.wizcaqwiak(eablkybsjgVar);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new gxszxtbevo(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f112823zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                sj.lqeggnwhkg lqeggnwhkgVarGxszxtbevo = sj.dxjokdxxww.gxszxtbevo(iobyxmoadg.this.f112814gxszxtbevo.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg), new C2791iobyxmoadg(iobyxmoadg.this, null));
                zoijcleaow zoijcleaowVar = new zoijcleaow(iobyxmoadg.this);
                this.f112823zdlpuopuiu = 1;
                if (lqeggnwhkgVarGxszxtbevo.collect(zoijcleaowVar, this) == objGxszxtbevo) {
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
            return ((gxszxtbevo) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: renamed from: u61.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2792iobyxmoadg {
        public /* synthetic */ C2792iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C2792iobyxmoadg() {
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ MeasureType f112828cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        final /* synthetic */ String f112829esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ double f112830iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f112831jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f112833zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(String str, double d13, MeasureType measureType, String str2, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f112831jyumaefscl = str;
            this.f112830iwizpuwonk = d13;
            this.f112828cqumvgiudr = measureType;
            this.f112829esjtqupxsv = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new ppxfxbqfkf(this.f112831jyumaefscl, this.f112830iwizpuwonk, this.f112828cqumvgiudr, this.f112829esjtqupxsv, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f112833zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                String str = this.f112831jyumaefscl;
                double d13 = this.f112830iwizpuwonk;
                MeasureType measureType = this.f112828cqumvgiudr;
                String str2 = this.f112829esjtqupxsv;
                this.f112833zdlpuopuiu = 1;
                if (iobyxmoadgVar.oipsdeybqn(str, d13, measureType, str2, this) == objGxszxtbevo) {
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
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class wkgbmnqykc extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f112834jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ u61.wkgbmnqykc f112835yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f112836zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wkgbmnqykc(u61.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f112835yggfygwlhe = wkgbmnqykcVar;
            this.f112834jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new wkgbmnqykc(this.f112835yggfygwlhe, this.f112834jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f112836zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                u61.wkgbmnqykc wkgbmnqykcVar = this.f112835yggfygwlhe;
                if (wkgbmnqykcVar instanceof u61.wkgbmnqykc.zoijcleaow) {
                    iobyxmoadg iobyxmoadgVar = this.f112834jyumaefscl;
                    String strIobyxmoadg = ((u61.wkgbmnqykc.zoijcleaow) wkgbmnqykcVar).iobyxmoadg();
                    double dZoijcleaow = ((u61.wkgbmnqykc.zoijcleaow) this.f112835yggfygwlhe).zoijcleaow();
                    this.f112836zdlpuopuiu = 1;
                    if (iobyxmoadgVar.uawqvzlxes(strIobyxmoadg, dZoijcleaow, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else if (wkgbmnqykcVar instanceof u61.wkgbmnqykc.C2793wkgbmnqykc) {
                    this.f112834jyumaefscl.dvvnrvtcbc(((u61.wkgbmnqykc.C2793wkgbmnqykc) wkgbmnqykcVar).iobyxmoadg());
                } else if (wkgbmnqykcVar instanceof u61.wkgbmnqykc.eablkybsjg) {
                    this.f112834jyumaefscl.crxdokpmqz(new u61.eablkybsjg.C2789eablkybsjg(((u61.wkgbmnqykc.eablkybsjg) this.f112835yggfygwlhe).iobyxmoadg(), iobyxmoadg.zfvoamnweg(this.f112834jyumaefscl).getRestaurantId()));
                } else if (wkgbmnqykcVar instanceof u61.wkgbmnqykc.nufgyqmvbu) {
                    this.f112834jyumaefscl.lxfrhoxuzk(((u61.wkgbmnqykc.nufgyqmvbu) wkgbmnqykcVar).iobyxmoadg());
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, u61.wkgbmnqykc.iobyxmoadg.f112846iobyxmoadg)) {
                    this.f112834jyumaefscl.crxdokpmqz(u61.eablkybsjg.iobyxmoadg.f112786iobyxmoadg);
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, u61.wkgbmnqykc.ppxfxbqfkf.f112849iobyxmoadg)) {
                    this.f112834jyumaefscl.auzgnhcxok();
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, u61.wkgbmnqykc.gxszxtbevo.f112845iobyxmoadg)) {
                    this.f112834jyumaefscl.skhdrjzrfn();
                } else {
                    if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, u61.wkgbmnqykc.lqeggnwhkg.f112847iobyxmoadg)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f112834jyumaefscl.igdgnonuha();
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

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f112837iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f112839yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f112840zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f112839yggfygwlhe = obj;
            this.f112837iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.oipsdeybqn(null, 0.0d, null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(cz0.iobyxmoadg cartInteractor, m11.iobyxmoadg getRestaurantDetailsUseCase, esjtqupxsv isAuthUseCase, dxjokdxxww subscribeToCartStateUseCase, dr0.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cartInteractor, "cartInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getRestaurantDetailsUseCase, "getRestaurantDetailsUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isAuthUseCase, "isAuthUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToCartStateUseCase, "subscribeToCartStateUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f112817ppxfxbqfkf = cartInteractor;
        this.f112818wkgbmnqykc = getRestaurantDetailsUseCase;
        this.f112813eablkybsjg = isAuthUseCase;
        this.f112814gxszxtbevo = subscribeToCartStateUseCase;
        this.f112815lqeggnwhkg = dispatchersProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ageimvtcrz(RestaurantDetails restaurantDetails, int i13) {
        List listIxidwrxhsl;
        ulzqkzuiru(new u61.gxszxtbevo.btonecajqb(restaurantDetails));
        ulzqkzuiru(new u61.gxszxtbevo.wkgbmnqykc(i13));
        ulzqkzuiru(new u61.gxszxtbevo.C2790gxszxtbevo(restaurantDetails.getPaging()));
        if (i13 == 1) {
            listIxidwrxhsl = restaurantDetails.getItems();
        } else {
            List productList = ((State) jlmebxxoox()).getProductList();
            ArrayList arrayList = new ArrayList();
            for (Object obj : productList) {
                if (obj instanceof RestaurantProduct) {
                    arrayList.add(obj);
                }
            }
            listIxidwrxhsl = jyumaefscl.ixidwrxhsl(arrayList, restaurantDetails.getItems());
        }
        ulzqkzuiru(new u61.gxszxtbevo.nufgyqmvbu(listIxidwrxhsl));
        if (!((State) jlmebxxoox()).getIsRestaurantVisible()) {
            ulzqkzuiru(new u61.gxszxtbevo.iobyxmoadg(restaurantDetails, listIxidwrxhsl, restaurantDetails.getSections()));
        }
        ulzqkzuiru(new u61.gxszxtbevo.gtknphoqwx(true, listIxidwrxhsl));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void auzgnhcxok() {
        opjhrmiecq();
    }

    private final Object bfopjjpdmp(String str, double d13, MeasureType measureType, String str2, lg.gxszxtbevo gxszxtbevoVar) {
        List currentCartProducts = ((State) jlmebxxoox()).getCurrentCartProducts();
        if (currentCartProducts == null || currentCartProducts.isEmpty()) {
            this.f112816nufgyqmvbu = pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, wypolnanlu.LAZY, new ppxfxbqfkf(str, d13, measureType, str2, null), 1, null);
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        Object objOipsdeybqn = oipsdeybqn(str, d13, measureType, str2, gxszxtbevoVar);
        return objOipsdeybqn == mg.zoijcleaow.gxszxtbevo() ? objOipsdeybqn : wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dvvnrvtcbc(int i13) {
        if (tbqsvytpvh() || nuxfzjnpeb() || !roivzttewh(i13)) {
            return;
        }
        lrnfpwlwnk(((State) jlmebxxoox()).getCurrentPage() + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fyldjkxazc() {
        crxdokpmqz(u61.eablkybsjg.gxszxtbevo.f112785iobyxmoadg);
    }

    private final void grlcpdaxtj() {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new gxszxtbevo(null), 3, null);
    }

    private final void hszhottldk(Cart cart) {
        DeliveryCode deliveryCodeDxjokdxxww = cart.dxjokdxxww();
        IntervalInfo intervalInfo = cart.getIntervalInfo();
        ulzqkzuiru(new u61.gxszxtbevo.eablkybsjg(deliveryCodeDxjokdxxww, intervalInfo != null ? intervalInfo.getDate() : null));
        ulzqkzuiru(new u61.gxszxtbevo.lqeggnwhkg(cart.getPartnerCode()));
        ulzqkzuiru(new u61.gxszxtbevo.ppxfxbqfkf(cart.getBasket()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void igdgnonuha() {
        RestaurantDetails restaurant = ((State) jlmebxxoox()).getRestaurant();
        if (restaurant != null) {
            crxdokpmqz(new u61.eablkybsjg.wkgbmnqykc(restaurant.getDeliveryPrice(), restaurant.getAvgOrderTime(), restaurant.getHours(), restaurant.getAddress()));
        }
    }

    private final List ipoelvxyzq(RestaurantProduct restaurantProduct) {
        List<Parcelable> productList = ((State) jlmebxxoox()).getProductList();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(productList, 10));
        for (Parcelable parcelableZoijcleaow : productList) {
            if (parcelableZoijcleaow instanceof RestaurantProduct) {
                RestaurantProduct restaurantProduct2 = (RestaurantProduct) parcelableZoijcleaow;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(restaurantProduct2.getId(), restaurantProduct.getId())) {
                    parcelableZoijcleaow = restaurantProduct2.zoijcleaow((KotlinVersion.MAX_COMPONENT_VALUE & 1) != 0 ? restaurantProduct2.id : null, (KotlinVersion.MAX_COMPONENT_VALUE & 2) != 0 ? restaurantProduct2.article : null, (KotlinVersion.MAX_COMPONENT_VALUE & 4) != 0 ? restaurantProduct2.name : null, (KotlinVersion.MAX_COMPONENT_VALUE & 8) != 0 ? restaurantProduct2.price : 0.0d, (KotlinVersion.MAX_COMPONENT_VALUE & 16) != 0 ? restaurantProduct2.photoUrl : null, (KotlinVersion.MAX_COMPONENT_VALUE & 32) != 0 ? restaurantProduct2.weight : 0.0d, (KotlinVersion.MAX_COMPONENT_VALUE & 64) != 0 ? restaurantProduct2.isDispPer100 : false, (KotlinVersion.MAX_COMPONENT_VALUE & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? restaurantProduct2.measureTypeModel : null, (KotlinVersion.MAX_COMPONENT_VALUE & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? restaurantProduct2.buyState : gz0.zoijcleaow.PROGRESS);
                }
            }
            arrayList.add(parcelableZoijcleaow);
        }
        ulzqkzuiru(new u61.gxszxtbevo.dxjokdxxww(arrayList));
        ulzqkzuiru(new u61.gxszxtbevo.nufgyqmvbu(arrayList));
        return arrayList;
    }

    private final void iwxlajgraz() {
        ulzqkzuiru(new u61.gxszxtbevo.eablkybsjg(null, null));
        ulzqkzuiru(new u61.gxszxtbevo.ppxfxbqfkf(null));
    }

    private final void lrnfpwlwnk(int i13) {
        auzgnhcxok auzgnhcxokVar = this.f112812dxjokdxxww;
        if (auzgnhcxokVar != null) {
            auzgnhcxok.iobyxmoadg.iobyxmoadg(auzgnhcxokVar, null, 1, null);
        }
        this.f112812dxjokdxxww = pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new eablkybsjg(i13, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void lxfrhoxuzk(RestaurantSection restaurantSection) {
        for (Object obj : ((State) jlmebxxoox()).getSections()) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((RestaurantSection) obj).getCode(), restaurantSection.getCode())) {
                ulzqkzuiru(new u61.gxszxtbevo.draadjrbmk((RestaurantSection) obj, restaurantSection.getCode()));
                ulzqkzuiru(new u61.gxszxtbevo.zoijcleaow(true));
                lrnfpwlwnk(1);
            }
        }
        obj = null;
        ulzqkzuiru(new u61.gxszxtbevo.draadjrbmk((RestaurantSection) obj, restaurantSection.getCode()));
        ulzqkzuiru(new u61.gxszxtbevo.zoijcleaow(true));
        lrnfpwlwnk(1);
    }

    private final boolean nuxfzjnpeb() {
        auzgnhcxok auzgnhcxokVar = this.f112812dxjokdxxww;
        return (auzgnhcxokVar == null || auzgnhcxokVar.agtfadlqog()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public final Object oipsdeybqn(String str, double d13, MeasureType measureType, String str2, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f112837iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f112837iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        zoijcleaow zoijcleaowVar2 = zoijcleaowVar;
        Object objOjitshcjhn = zoijcleaowVar2.f112839yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar2.f112837iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objOjitshcjhn);
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                cz0.iobyxmoadg iobyxmoadgVar3 = this.f112817ppxfxbqfkf;
                zoijcleaowVar2.f112840zdlpuopuiu = this;
                zoijcleaowVar2.f112837iwizpuwonk = 1;
                objOjitshcjhn = iobyxmoadgVar3.ojitshcjhn((16 & 1) != 0 ? null : str, (16 & 2) != 0 ? null : str2, d13, measureType, (16 & 16) != 0 ? false : false, zoijcleaowVar2);
                if (objOjitshcjhn == objGxszxtbevo) {
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
            iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar2.f112840zdlpuopuiu;
            try {
                zdlpuopuiu.zoijcleaow(objOjitshcjhn);
            } catch (Throwable th3) {
                th = th3;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((kz0.ppxfxbqfkf) objOjitshcjhn);
        if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            iobyxmoadgVar.fyldjkxazc();
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.fiwbwshyhd(thDxjokdxxww);
        }
        iobyxmoadgVar.opjhrmiecq();
        iobyxmoadgVar.f112816nufgyqmvbu = null;
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void opjhrmiecq() {
        List<Parcelable> productList = ((State) jlmebxxoox()).getProductList();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(productList, 10));
        for (Parcelable parcelableZoijcleaow : productList) {
            if (parcelableZoijcleaow instanceof RestaurantProduct) {
                RestaurantProduct restaurantProduct = (RestaurantProduct) parcelableZoijcleaow;
                if (restaurantProduct.getBuyState() != null) {
                    parcelableZoijcleaow = restaurantProduct.zoijcleaow((KotlinVersion.MAX_COMPONENT_VALUE & 1) != 0 ? restaurantProduct.id : null, (KotlinVersion.MAX_COMPONENT_VALUE & 2) != 0 ? restaurantProduct.article : null, (KotlinVersion.MAX_COMPONENT_VALUE & 4) != 0 ? restaurantProduct.name : null, (KotlinVersion.MAX_COMPONENT_VALUE & 8) != 0 ? restaurantProduct.price : 0.0d, (KotlinVersion.MAX_COMPONENT_VALUE & 16) != 0 ? restaurantProduct.photoUrl : null, (KotlinVersion.MAX_COMPONENT_VALUE & 32) != 0 ? restaurantProduct.weight : 0.0d, (KotlinVersion.MAX_COMPONENT_VALUE & 64) != 0 ? restaurantProduct.isDispPer100 : false, (KotlinVersion.MAX_COMPONENT_VALUE & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? restaurantProduct.measureTypeModel : null, (KotlinVersion.MAX_COMPONENT_VALUE & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? restaurantProduct.buyState : null);
                }
            }
            arrayList.add(parcelableZoijcleaow);
        }
        ulzqkzuiru(new u61.gxszxtbevo.nufgyqmvbu(arrayList));
        ulzqkzuiru(new u61.gxszxtbevo.dxjokdxxww(arrayList));
    }

    private final boolean roivzttewh(int i13) {
        Paging paging = ((State) jlmebxxoox()).getPaging();
        return paging != null && i13 >= ((State) jlmebxxoox()).getProductList().size() - (paging.getItemsOnPageCount() / 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void skhdrjzrfn() {
        lrnfpwlwnk(1);
    }

    private final boolean tbqsvytpvh() {
        Paging paging = ((State) jlmebxxoox()).getPaging();
        return paging != null && ((State) jlmebxxoox()).getCurrentPage() >= paging.getPagesCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object uawqvzlxes(String str, double d13, lg.gxszxtbevo gxszxtbevoVar) {
        Object next;
        esjtqupxsv esjtqupxsvVar = this.f112813eablkybsjg;
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        if (!((Boolean) esjtqupxsvVar.zoijcleaow(wwaezpbzknVar)).booleanValue()) {
            crxdokpmqz(u61.eablkybsjg.zoijcleaow.f112792iobyxmoadg);
            opjhrmiecq();
            return wwaezpbzknVar;
        }
        Iterator it = ((State) jlmebxxoox()).getProducts().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            BaseProduct baseProduct = (BaseProduct) next;
            if ((baseProduct instanceof RestaurantProduct) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((RestaurantProduct) baseProduct).getArticle(), str)) {
                break;
            }
        }
        RestaurantProduct restaurantProduct = next instanceof RestaurantProduct ? (RestaurantProduct) next : null;
        if (restaurantProduct == null) {
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        if (this.f112816nufgyqmvbu == null) {
            ipoelvxyzq(restaurantProduct);
        }
        Object objBfopjjpdmp = bfopjjpdmp(restaurantProduct.getId(), d13, restaurantProduct.getMeasureTypeModel().getCurrentMeasure(), restaurantProduct.getArticle(), gxszxtbevoVar);
        return objBfopjjpdmp == mg.zoijcleaow.gxszxtbevo() ? objBfopjjpdmp : wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void wizcaqwiak(kz0.eablkybsjg eablkybsjgVar) {
        if (eablkybsjgVar instanceof kz0.eablkybsjg.iobyxmoadg) {
            iwxlajgraz();
        } else {
            if (!(eablkybsjgVar instanceof kz0.eablkybsjg.zoijcleaow)) {
                throw new NoWhenBranchMatchedException();
            }
            hszhottldk(((kz0.eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg());
        }
    }

    private final void zeieaojujs() {
        ulzqkzuiru(new u61.gxszxtbevo.zoijcleaow(true));
        grlcpdaxtj();
        lrnfpwlwnk(1);
    }

    public static final /* synthetic */ State zfvoamnweg(iobyxmoadg iobyxmoadgVar) {
        return (State) iobyxmoadgVar.jlmebxxoox();
    }

    public final void fiwbwshyhd(Throwable error) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        ulzqkzuiru(new u61.gxszxtbevo.zoijcleaow(false));
        crxdokpmqz(new u61.eablkybsjg.ppxfxbqfkf(error));
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: iyctptxqzt, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(u61.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, u61.ppxfxbqfkf.iobyxmoadg.f112843iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        zeieaojujs();
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: weqkydbzbr, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(u61.wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new wkgbmnqykc(intent, this, null), 3, null);
    }
}
