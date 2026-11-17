package k80;

import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import f20.dxjokdxxww;
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
import pj.auzgnhcxok;
import pj.cllcsxoeiz;
import pj.wypolnanlu;
import ru.myspar.core.domain.models.BaseProduct;
import ru.myspar.core.domain.models.LoadingBase;
import ru.myspar.core.domain.models.cart.Cart;
import ru.myspar.core.domain.models.cart.IntervalInfo;
import ru.myspar.core.domain.models.restaurants.RestaurantDetails;
import ru.myspar.core.domain.models.restaurants.RestaurantProduct;
import ru.myspar.core.domain.models.restaurants.RestaurantSection;
import ru.myspar.core.models.delivery.DeliveryCode;
import ru.myspar.core.models.measure_type.MeasureType;
import ru.myspar.core.models.paging.Paging;
import ru.myspar.domain.feature.specificrestaurant.store.State;
import sj.nufgyqmvbu;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends e8.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public static final C1165iobyxmoadg f54147btonecajqb = new C1165iobyxmoadg(null);

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public static final int f54148gtknphoqwx = 8;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private auzgnhcxok f54149dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final c20.eablkybsjg f54150eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final dxjokdxxww f54151gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final ns.iobyxmoadg f54152lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private auzgnhcxok f54153nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final k00.iobyxmoadg f54154ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final g30.iobyxmoadg f54155wkgbmnqykc;

    static final class eablkybsjg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ int f54156jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f54158zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        eablkybsjg(int i13, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f54156jyumaefscl = i13;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new eablkybsjg(this.f54156jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objWkgbmnqykc;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f54158zdlpuopuiu;
            try {
                if (i13 == 0) {
                    zdlpuopuiu.zoijcleaow(obj);
                    State stateZfvoamnweg = iobyxmoadg.zfvoamnweg(iobyxmoadg.this);
                    List productList = stateZfvoamnweg.getProductList();
                    if (!stateZfvoamnweg.getProducts().isEmpty()) {
                        productList = jyumaefscl.jrbgnlbqoe(productList, LoadingBase.f86718zdlpuopuiu);
                    }
                    iobyxmoadg.this.ulzqkzuiru(new k80.gxszxtbevo.nufgyqmvbu(productList));
                    iobyxmoadg.this.ulzqkzuiru(new k80.gxszxtbevo.dxjokdxxww(productList));
                    g30.iobyxmoadg.zoijcleaow zoijcleaowVar = new g30.iobyxmoadg.zoijcleaow(stateZfvoamnweg.getRestaurantId(), stateZfvoamnweg.getCatalogSectionId(), this.f54156jyumaefscl);
                    iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                    kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                    g30.iobyxmoadg iobyxmoadgVar3 = iobyxmoadgVar.f54155wkgbmnqykc;
                    this.f54158zdlpuopuiu = 1;
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
            int i14 = this.f54156jyumaefscl;
            if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
                iobyxmoadgVar5.ageimvtcrz((RestaurantDetails) objWkgbmnqykc, i14);
            }
            Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
            if (thDxjokdxxww != null) {
                iobyxmoadgVar5.fiwbwshyhd(thDxjokdxxww);
            }
            iobyxmoadg.this.ulzqkzuiru(new k80.gxszxtbevo.zoijcleaow(false));
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((eablkybsjg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class gxszxtbevo extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f54160zdlpuopuiu;

        /* JADX INFO: renamed from: k80.iobyxmoadg$gxszxtbevo$iobyxmoadg, reason: collision with other inner class name */
        static final class C1164iobyxmoadg extends draadjrbmk implements vdvldrhtss {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f54161jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            /* synthetic */ Object f54162yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f54163zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1164iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(3, gxszxtbevoVar);
                this.f54161jyumaefscl = iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                mg.zoijcleaow.gxszxtbevo();
                if (this.f54163zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
                this.f54161jyumaefscl.fiwbwshyhd((Throwable) this.f54162yggfygwlhe);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.vdvldrhtss
            /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
            public final Object invoke(nufgyqmvbu nufgyqmvbuVar, Throwable th2, lg.gxszxtbevo gxszxtbevoVar) {
                C1164iobyxmoadg c1164iobyxmoadg = new C1164iobyxmoadg(this.f54161jyumaefscl, gxszxtbevoVar);
                c1164iobyxmoadg.f54162yggfygwlhe = th2;
                return c1164iobyxmoadg.invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* synthetic */ class zoijcleaow implements nufgyqmvbu, agtfadlqog {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f54164zdlpuopuiu;

            zoijcleaow(iobyxmoadg iobyxmoadgVar) {
                this.f54164zdlpuopuiu = iobyxmoadgVar;
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
            public final Object emit(t00.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
                Object objKcexrzcfyt = gxszxtbevo.kcexrzcfyt(this.f54164zdlpuopuiu, eablkybsjgVar, gxszxtbevoVar);
                return objKcexrzcfyt == mg.zoijcleaow.gxszxtbevo() ? objKcexrzcfyt : wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // kotlin.jvm.internal.agtfadlqog
            public final gg.dxjokdxxww zoijcleaow() {
                return new kotlin.jvm.internal.iobyxmoadg(2, this.f54164zdlpuopuiu, iobyxmoadg.class, "processCartState", "processCartState(Lru/myspar/core/domain/models/cart/CartState;)V", 4);
            }
        }

        gxszxtbevo(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object kcexrzcfyt(iobyxmoadg iobyxmoadgVar, t00.eablkybsjg eablkybsjgVar, lg.gxszxtbevo gxszxtbevoVar) {
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
            int i13 = this.f54160zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                sj.lqeggnwhkg lqeggnwhkgVarGxszxtbevo = sj.dxjokdxxww.gxszxtbevo(iobyxmoadg.this.f54151gxszxtbevo.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg), new C1164iobyxmoadg(iobyxmoadg.this, null));
                zoijcleaow zoijcleaowVar = new zoijcleaow(iobyxmoadg.this);
                this.f54160zdlpuopuiu = 1;
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

    /* JADX INFO: renamed from: k80.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1165iobyxmoadg {
        public /* synthetic */ C1165iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C1165iobyxmoadg() {
        }
    }

    static final class ppxfxbqfkf extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ MeasureType f54165cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        final /* synthetic */ String f54166esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ double f54167iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ String f54168jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f54170zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(String str, double d13, MeasureType measureType, String str2, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f54168jyumaefscl = str;
            this.f54167iwizpuwonk = d13;
            this.f54165cqumvgiudr = measureType;
            this.f54166esjtqupxsv = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return iobyxmoadg.this.new ppxfxbqfkf(this.f54168jyumaefscl, this.f54167iwizpuwonk, this.f54165cqumvgiudr, this.f54166esjtqupxsv, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f54170zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                String str = this.f54168jyumaefscl;
                double d13 = this.f54167iwizpuwonk;
                MeasureType measureType = this.f54165cqumvgiudr;
                String str2 = this.f54166esjtqupxsv;
                this.f54170zdlpuopuiu = 1;
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
        final /* synthetic */ iobyxmoadg f54171jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ k80.wkgbmnqykc f54172yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f54173zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        wkgbmnqykc(k80.wkgbmnqykc wkgbmnqykcVar, iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f54172yggfygwlhe = wkgbmnqykcVar;
            this.f54171jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new wkgbmnqykc(this.f54172yggfygwlhe, this.f54171jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f54173zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                k80.wkgbmnqykc wkgbmnqykcVar = this.f54172yggfygwlhe;
                if (wkgbmnqykcVar instanceof k80.wkgbmnqykc.zoijcleaow) {
                    iobyxmoadg iobyxmoadgVar = this.f54171jyumaefscl;
                    String strIobyxmoadg = ((k80.wkgbmnqykc.zoijcleaow) wkgbmnqykcVar).iobyxmoadg();
                    double dZoijcleaow = ((k80.wkgbmnqykc.zoijcleaow) this.f54172yggfygwlhe).zoijcleaow();
                    this.f54173zdlpuopuiu = 1;
                    if (iobyxmoadgVar.uawqvzlxes(strIobyxmoadg, dZoijcleaow, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else if (wkgbmnqykcVar instanceof k80.wkgbmnqykc.C1166wkgbmnqykc) {
                    this.f54171jyumaefscl.dvvnrvtcbc(((k80.wkgbmnqykc.C1166wkgbmnqykc) wkgbmnqykcVar).iobyxmoadg());
                } else if (wkgbmnqykcVar instanceof k80.wkgbmnqykc.eablkybsjg) {
                    this.f54171jyumaefscl.crxdokpmqz(new k80.eablkybsjg.C1162eablkybsjg(((k80.wkgbmnqykc.eablkybsjg) this.f54172yggfygwlhe).iobyxmoadg(), iobyxmoadg.zfvoamnweg(this.f54171jyumaefscl).getRestaurantId()));
                } else if (wkgbmnqykcVar instanceof k80.wkgbmnqykc.nufgyqmvbu) {
                    this.f54171jyumaefscl.lxfrhoxuzk(((k80.wkgbmnqykc.nufgyqmvbu) wkgbmnqykcVar).iobyxmoadg());
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, k80.wkgbmnqykc.iobyxmoadg.f54183iobyxmoadg)) {
                    this.f54171jyumaefscl.crxdokpmqz(k80.eablkybsjg.iobyxmoadg.f54123iobyxmoadg);
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, k80.wkgbmnqykc.ppxfxbqfkf.f54186iobyxmoadg)) {
                    this.f54171jyumaefscl.auzgnhcxok();
                } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, k80.wkgbmnqykc.gxszxtbevo.f54182iobyxmoadg)) {
                    this.f54171jyumaefscl.skhdrjzrfn();
                } else {
                    if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, k80.wkgbmnqykc.lqeggnwhkg.f54184iobyxmoadg)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f54171jyumaefscl.igdgnonuha();
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
        int f54174iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f54176yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f54177zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f54176yggfygwlhe = obj;
            this.f54174iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.oipsdeybqn(null, 0.0d, null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(k00.iobyxmoadg cartInteractor, g30.iobyxmoadg getRestaurantDetailsUseCase, c20.eablkybsjg isLoggedInUseCase, dxjokdxxww subscribeToCartStateUseCase, ns.iobyxmoadg dispatchersProvider) {
        super(dispatchersProvider.iobyxmoadg());
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cartInteractor, "cartInteractor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getRestaurantDetailsUseCase, "getRestaurantDetailsUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(isLoggedInUseCase, "isLoggedInUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(subscribeToCartStateUseCase, "subscribeToCartStateUseCase");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        this.f54154ppxfxbqfkf = cartInteractor;
        this.f54155wkgbmnqykc = getRestaurantDetailsUseCase;
        this.f54150eablkybsjg = isLoggedInUseCase;
        this.f54151gxszxtbevo = subscribeToCartStateUseCase;
        this.f54152lqeggnwhkg = dispatchersProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ageimvtcrz(RestaurantDetails restaurantDetails, int i13) {
        List listIxidwrxhsl;
        ulzqkzuiru(new k80.gxszxtbevo.btonecajqb(restaurantDetails));
        ulzqkzuiru(new k80.gxszxtbevo.wkgbmnqykc(i13));
        ulzqkzuiru(new k80.gxszxtbevo.C1163gxszxtbevo(restaurantDetails.getPaging()));
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
        ulzqkzuiru(new k80.gxszxtbevo.nufgyqmvbu(listIxidwrxhsl));
        if (!((State) jlmebxxoox()).getIsRestaurantVisible()) {
            ulzqkzuiru(new k80.gxszxtbevo.iobyxmoadg(restaurantDetails, listIxidwrxhsl, restaurantDetails.getSections()));
        }
        ulzqkzuiru(new k80.gxszxtbevo.gtknphoqwx(true, listIxidwrxhsl));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void auzgnhcxok() {
        opjhrmiecq();
    }

    private final Object bfopjjpdmp(String str, double d13, MeasureType measureType, String str2, lg.gxszxtbevo gxszxtbevoVar) {
        List currentCartProducts = ((State) jlmebxxoox()).getCurrentCartProducts();
        if (currentCartProducts == null || currentCartProducts.isEmpty()) {
            this.f54153nufgyqmvbu = pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, wypolnanlu.LAZY, new ppxfxbqfkf(str, d13, measureType, str2, null), 1, null);
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
        crxdokpmqz(k80.eablkybsjg.gxszxtbevo.f54122iobyxmoadg);
    }

    private final void grlcpdaxtj() {
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new gxszxtbevo(null), 3, null);
    }

    private final void hszhottldk(Cart cart) {
        DeliveryCode deliveryCodeDxjokdxxww = cart.dxjokdxxww();
        IntervalInfo intervalInfo = cart.getIntervalInfo();
        ulzqkzuiru(new k80.gxszxtbevo.eablkybsjg(deliveryCodeDxjokdxxww, intervalInfo != null ? intervalInfo.getDate() : null));
        ulzqkzuiru(new k80.gxszxtbevo.lqeggnwhkg(cart.getPartnerCode()));
        ulzqkzuiru(new k80.gxszxtbevo.ppxfxbqfkf(cart.getBasket()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void igdgnonuha() {
        RestaurantDetails restaurant = ((State) jlmebxxoox()).getRestaurant();
        if (restaurant != null) {
            crxdokpmqz(new k80.eablkybsjg.wkgbmnqykc(restaurant.getDeliveryPrice(), restaurant.getAvgOrderTime(), restaurant.getHours(), restaurant.getAddress()));
        }
    }

    private final List ipoelvxyzq(RestaurantProduct restaurantProduct) {
        List<Parcelable> productList = ((State) jlmebxxoox()).getProductList();
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(productList, 10));
        for (Parcelable parcelableZoijcleaow : productList) {
            if (parcelableZoijcleaow instanceof RestaurantProduct) {
                RestaurantProduct restaurantProduct2 = (RestaurantProduct) parcelableZoijcleaow;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(restaurantProduct2.getId(), restaurantProduct.getId())) {
                    parcelableZoijcleaow = restaurantProduct2.zoijcleaow((KotlinVersion.MAX_COMPONENT_VALUE & 1) != 0 ? restaurantProduct2.id : null, (KotlinVersion.MAX_COMPONENT_VALUE & 2) != 0 ? restaurantProduct2.article : null, (KotlinVersion.MAX_COMPONENT_VALUE & 4) != 0 ? restaurantProduct2.name : null, (KotlinVersion.MAX_COMPONENT_VALUE & 8) != 0 ? restaurantProduct2.price : 0.0d, (KotlinVersion.MAX_COMPONENT_VALUE & 16) != 0 ? restaurantProduct2.photoUrl : null, (KotlinVersion.MAX_COMPONENT_VALUE & 32) != 0 ? restaurantProduct2.weight : 0.0d, (KotlinVersion.MAX_COMPONENT_VALUE & 64) != 0 ? restaurantProduct2.isDispPer100 : false, (KotlinVersion.MAX_COMPONENT_VALUE & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? restaurantProduct2.measureTypeModel : null, (KotlinVersion.MAX_COMPONENT_VALUE & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? restaurantProduct2.buyState : o00.zoijcleaow.PROGRESS);
                }
            }
            arrayList.add(parcelableZoijcleaow);
        }
        ulzqkzuiru(new k80.gxszxtbevo.dxjokdxxww(arrayList));
        ulzqkzuiru(new k80.gxszxtbevo.nufgyqmvbu(arrayList));
        return arrayList;
    }

    private final void iwxlajgraz() {
        ulzqkzuiru(new k80.gxszxtbevo.eablkybsjg(null, null));
        ulzqkzuiru(new k80.gxszxtbevo.ppxfxbqfkf(null));
    }

    private final void lrnfpwlwnk(int i13) {
        auzgnhcxok auzgnhcxokVar = this.f54149dxjokdxxww;
        if (auzgnhcxokVar != null) {
            auzgnhcxok.iobyxmoadg.iobyxmoadg(auzgnhcxokVar, null, 1, null);
        }
        this.f54149dxjokdxxww = pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new eablkybsjg(i13, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void lxfrhoxuzk(RestaurantSection restaurantSection) {
        for (Object obj : ((State) jlmebxxoox()).getSections()) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((RestaurantSection) obj).getCode(), restaurantSection.getCode())) {
                ulzqkzuiru(new k80.gxszxtbevo.draadjrbmk((RestaurantSection) obj, restaurantSection.getCode()));
                ulzqkzuiru(new k80.gxszxtbevo.zoijcleaow(true));
                lrnfpwlwnk(1);
            }
        }
        obj = null;
        ulzqkzuiru(new k80.gxszxtbevo.draadjrbmk((RestaurantSection) obj, restaurantSection.getCode()));
        ulzqkzuiru(new k80.gxszxtbevo.zoijcleaow(true));
        lrnfpwlwnk(1);
    }

    private final boolean nuxfzjnpeb() {
        auzgnhcxok auzgnhcxokVar = this.f54149dxjokdxxww;
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
            int i13 = zoijcleaowVar.f54174iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f54174iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        zoijcleaow zoijcleaowVar2 = zoijcleaowVar;
        Object objOxmwwwfdhm = zoijcleaowVar2.f54176yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar2.f54174iwizpuwonk;
        if (i14 == 0) {
            zdlpuopuiu.zoijcleaow(objOxmwwwfdhm);
            try {
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
                k00.iobyxmoadg iobyxmoadgVar3 = this.f54154ppxfxbqfkf;
                zoijcleaowVar2.f54177zdlpuopuiu = this;
                zoijcleaowVar2.f54174iwizpuwonk = 1;
                objOxmwwwfdhm = iobyxmoadgVar3.oxmwwwfdhm((16 & 1) != 0 ? null : str, (16 & 2) != 0 ? null : str2, d13, measureType, (16 & 16) != 0 ? false : false, zoijcleaowVar2);
                if (objOxmwwwfdhm == objGxszxtbevo) {
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
            iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar2.f54177zdlpuopuiu;
            try {
                zdlpuopuiu.zoijcleaow(objOxmwwwfdhm);
            } catch (Throwable th3) {
                th = th3;
                kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = kcexrzcfyt.f37117yggfygwlhe;
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(zdlpuopuiu.iobyxmoadg(th));
            }
        }
        objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((t00.ppxfxbqfkf) objOxmwwwfdhm);
        if (kcexrzcfyt.agtfadlqog(objWkgbmnqykc)) {
            iobyxmoadgVar.fyldjkxazc();
        }
        Throwable thDxjokdxxww = kcexrzcfyt.dxjokdxxww(objWkgbmnqykc);
        if (thDxjokdxxww != null) {
            iobyxmoadgVar.fiwbwshyhd(thDxjokdxxww);
        }
        iobyxmoadgVar.opjhrmiecq();
        iobyxmoadgVar.f54153nufgyqmvbu = null;
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
        ulzqkzuiru(new k80.gxszxtbevo.nufgyqmvbu(arrayList));
        ulzqkzuiru(new k80.gxszxtbevo.dxjokdxxww(arrayList));
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
        c20.eablkybsjg eablkybsjgVar = this.f54150eablkybsjg;
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        if (!((Boolean) eablkybsjgVar.zoijcleaow(wwaezpbzknVar)).booleanValue()) {
            crxdokpmqz(k80.eablkybsjg.zoijcleaow.f54129iobyxmoadg);
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
        if (this.f54153nufgyqmvbu == null) {
            ipoelvxyzq(restaurantProduct);
        }
        Object objBfopjjpdmp = bfopjjpdmp(restaurantProduct.getId(), d13, restaurantProduct.getMeasureTypeModel().getCurrentMeasure(), restaurantProduct.getArticle(), gxszxtbevoVar);
        return objBfopjjpdmp == mg.zoijcleaow.gxszxtbevo() ? objBfopjjpdmp : wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void wizcaqwiak(t00.eablkybsjg eablkybsjgVar) {
        if (eablkybsjgVar instanceof t00.eablkybsjg.iobyxmoadg) {
            iwxlajgraz();
        } else {
            if (!(eablkybsjgVar instanceof t00.eablkybsjg.zoijcleaow)) {
                throw new NoWhenBranchMatchedException();
            }
            hszhottldk(((t00.eablkybsjg.zoijcleaow) eablkybsjgVar).iobyxmoadg());
        }
    }

    private final void zeieaojujs() {
        ulzqkzuiru(new k80.gxszxtbevo.zoijcleaow(true));
        grlcpdaxtj();
        lrnfpwlwnk(1);
    }

    public static final /* synthetic */ State zfvoamnweg(iobyxmoadg iobyxmoadgVar) {
        return (State) iobyxmoadgVar.jlmebxxoox();
    }

    public final void fiwbwshyhd(Throwable error) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
        ulzqkzuiru(new k80.gxszxtbevo.zoijcleaow(false));
        crxdokpmqz(new k80.eablkybsjg.ppxfxbqfkf(error));
    }

    @Override // e8.iobyxmoadg, a8.zoijcleaow
    /* JADX INFO: renamed from: iyctptxqzt, reason: merged with bridge method [inline-methods] */
    public void pmvmpeiblj(k80.ppxfxbqfkf action) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(action, k80.ppxfxbqfkf.iobyxmoadg.f54180iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        zeieaojujs();
    }

    @Override // a8.zoijcleaow
    /* JADX INFO: renamed from: weqkydbzbr, reason: merged with bridge method [inline-methods] */
    public void zynmafqrjb(k80.wkgbmnqykc intent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(intent, "intent");
        pj.gtknphoqwx.wkgbmnqykc(sopmlzcsov(), null, null, new wkgbmnqykc(intent, this, null), 3, null);
    }
}
