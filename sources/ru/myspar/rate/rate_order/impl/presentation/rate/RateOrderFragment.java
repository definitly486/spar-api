package ru.myspar.rate.rate_order.impl.presentation.rate;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.s;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.stevsuqkhv;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.lmojexxdyd;
import androidx.lifecycle.ntlheqmsrt;
import androidx.lifecycle.oxmwwwfdhm;
import androidx.lifecycle.ribwqtqdhb;
import gg.wwaezpbzkn;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.yadqdtsiqt;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.rate.rate_order.api.models.RateOrderPayload;
import sj.wypolnanlu;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010!\u001a\u00020\u00028TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010 R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lru/myspar/rate/rate_order/impl/presentation/rate/RateOrderFragment;", "Lru/myspar/core/base/mvvm/BaseMvvmFragment;", "Lru/myspar/rate/rate_order/impl/presentation/rate/rgvfuqvkyq;", "<init>", "()V", "Lg02/zoijcleaow;", "state", "Lgg/wwaezpbzkn;", "ntlheqmsrt", "(Lg02/zoijcleaow;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lru/myspar/rate/rate_order/impl/presentation/rate/iobyxmoadg;", "esjtqupxsv", "Lru/myspar/rate/rate_order/impl/presentation/rate/iobyxmoadg;", "stevsuqkhv", "()Lru/myspar/rate/rate_order/impl/presentation/rate/iobyxmoadg;", "setAssistedFactory", "(Lru/myspar/rate/rate_order/impl/presentation/rate/iobyxmoadg;)V", "assistedFactory", "Lru/myspar/rate/rate_order/api/models/RateOrderPayload;", "lereixgezr", "Lgg/gtknphoqwx;", "tzroggbefp", "()Lru/myspar/rate/rate_order/api/models/RateOrderPayload;", "payload", "pmvmpeiblj", "mbcevpiqjq", "()Lru/myspar/rate/rate_order/impl/presentation/rate/rgvfuqvkyq;", "viewModel", "Lf02/iobyxmoadg;", "zynmafqrjb", "Lys/ppxfxbqfkf;", "kegysxyocb", "()Lf02/iobyxmoadg;", "binding", "istkbnxepw", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RateOrderFragment extends Hilt_RateOrderFragment<rgvfuqvkyq> {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f102801cdpycssgdh = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(RateOrderFragment.class, "binding", "getBinding()Lru/myspar/rate/rate_order/impl/databinding/FragmentRateOrderBinding;", 0))};

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    public static final int f102803yadqdtsiqt = 8;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    public iobyxmoadg assistedFactory;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    private final gg.gtknphoqwx payload;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    private final gg.gtknphoqwx viewModel;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    private final ys.ppxfxbqfkf binding;

    public static final class btonecajqb implements crxdokpmqz.ppxfxbqfkf {
        public btonecajqb() {
        }

        @Override // androidx.lifecycle.crxdokpmqz.ppxfxbqfkf
        public ntlheqmsrt create(Class modelClass) {
            zdlpuopuiu.btonecajqb(modelClass, "modelClass");
            rgvfuqvkyq rgvfuqvkyqVarIobyxmoadg = RateOrderFragment.this.stevsuqkhv().iobyxmoadg(RateOrderFragment.this.tzroggbefp());
            zdlpuopuiu.nufgyqmvbu(rgvfuqvkyqVarIobyxmoadg, "null cannot be cast to non-null type T of ru.myspar.legacy.presentation.ext.ViewModelExtKt.viewModelProviderFactoryOf.<no name provided>.create");
            return rgvfuqvkyqVarIobyxmoadg;
        }
    }

    public static final class dxjokdxxww extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f102809yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f102810zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public dxjokdxxww(tg.iobyxmoadg iobyxmoadgVar, gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f102810zdlpuopuiu = iobyxmoadgVar;
            this.f102809yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f102810zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f102809yggfygwlhe);
            androidx.lifecycle.dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof androidx.lifecycle.dxjokdxxww ? (androidx.lifecycle.dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    /* synthetic */ class eablkybsjg implements sj.nufgyqmvbu, kotlin.jvm.internal.agtfadlqog {
        eablkybsjg() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof sj.nufgyqmvbu) && (obj instanceof kotlin.jvm.internal.agtfadlqog)) {
                return zdlpuopuiu.eablkybsjg(zoijcleaow(), ((kotlin.jvm.internal.agtfadlqog) obj).zoijcleaow());
            }
            return false;
        }

        public final int hashCode() {
            return zoijcleaow().hashCode();
        }

        @Override // sj.nufgyqmvbu
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public final Object emit(g02.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objUlzqkzuiru = RateOrderFragment.ulzqkzuiru(RateOrderFragment.this, zoijcleaowVar, gxszxtbevoVar);
            return objUlzqkzuiru == mg.zoijcleaow.gxszxtbevo() ? objUlzqkzuiru : wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // kotlin.jvm.internal.agtfadlqog
        public final gg.dxjokdxxww zoijcleaow() {
            return new kotlin.jvm.internal.iobyxmoadg(2, RateOrderFragment.this, RateOrderFragment.class, "handleState", "handleState(Lru/myspar/rate/rate_order/impl/presentation/RateOrderView$Model;)V", 4);
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f102812zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(Fragment fragment) {
            super(0);
            this.f102812zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f102812zdlpuopuiu;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.rate.rate_order.impl.presentation.rate.RateOrderFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final RateOrderFragment iobyxmoadg(RateOrderPayload payload) {
            zdlpuopuiu.btonecajqb(payload, "payload");
            RateOrderFragment rateOrderFragment = new RateOrderFragment();
            b40.iobyxmoadg.zoijcleaow(rateOrderFragment, payload, false, 2, null);
            return rateOrderFragment;
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f102813zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f102813zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f102813zdlpuopuiu.invoke();
        }
    }

    public static final class nufgyqmvbu extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f102814zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public nufgyqmvbu(gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f102814zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f102814zdlpuopuiu).getViewModelStore();
        }
    }

    static final class ppxfxbqfkf implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ g02.zoijcleaow f102815yggfygwlhe;

        static final class iobyxmoadg implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ RateOrderFragment f102817yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ g02.zoijcleaow f102818zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.rate.rate_order.impl.presentation.rate.RateOrderFragment$ppxfxbqfkf$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            /* synthetic */ class C2486iobyxmoadg extends vdvldrhtss implements tg.draadjrbmk {
                C2486iobyxmoadg(Object obj) {
                    super(1, obj, rgvfuqvkyq.class, "onEvent", "onEvent(Lru/myspar/rate/rate_order/impl/presentation/RateOrderView$Event;)V", 0);
                }

                @Override // tg.draadjrbmk
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    iobyxmoadg((g02.iobyxmoadg) obj);
                    return wwaezpbzkn.f37140iobyxmoadg;
                }

                public final void iobyxmoadg(g02.iobyxmoadg p13) {
                    zdlpuopuiu.btonecajqb(p13, "p0");
                    ((rgvfuqvkyq) this.receiver).okpsazkaxt(p13);
                }
            }

            iobyxmoadg(g02.zoijcleaow zoijcleaowVar, RateOrderFragment rateOrderFragment) {
                this.f102818zdlpuopuiu = zoijcleaowVar;
                this.f102817yggfygwlhe = rateOrderFragment;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final wwaezpbzkn btonecajqb(RateOrderFragment rateOrderFragment, String it) {
                zdlpuopuiu.btonecajqb(it, "it");
                rateOrderFragment.wwaezpbzkn().okpsazkaxt(new g02.iobyxmoadg.zoijcleaow(it));
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final wwaezpbzkn gxszxtbevo(RateOrderFragment rateOrderFragment, int i13) {
                rateOrderFragment.wwaezpbzkn().okpsazkaxt(new g02.iobyxmoadg.wkgbmnqykc(i13));
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final wwaezpbzkn lqeggnwhkg(RateOrderFragment rateOrderFragment, gg.vdvldrhtss it) {
                zdlpuopuiu.btonecajqb(it, "it");
                rateOrderFragment.wwaezpbzkn().okpsazkaxt(new g02.iobyxmoadg.eablkybsjg(it));
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void eablkybsjg(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
                if ((i13 & 3) == 2 && draadjrbmkVar.gtknphoqwx()) {
                    draadjrbmkVar.hkdspvbjdz();
                    return;
                }
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(205992031, i13, -1, "ru.myspar.rate.rate_order.impl.presentation.rate.RateOrderFragment.handleState.<anonymous>.<anonymous> (RateOrderFragment.kt:55)");
                }
                g02.zoijcleaow zoijcleaowVar = this.f102818zdlpuopuiu;
                RateOrderPayload rateOrderPayloadTzroggbefp = this.f102817yggfygwlhe.tzroggbefp();
                rgvfuqvkyq rgvfuqvkyqVarWwaezpbzkn = this.f102817yggfygwlhe.wwaezpbzkn();
                draadjrbmkVar.sopmlzcsov(1328536507);
                boolean zLmojexxdyd = draadjrbmkVar.lmojexxdyd(rgvfuqvkyqVarWwaezpbzkn);
                Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
                if (zLmojexxdyd || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new C2486iobyxmoadg(rgvfuqvkyqVarWwaezpbzkn);
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVar.stevsuqkhv();
                tg.draadjrbmk draadjrbmkVar2 = (tg.draadjrbmk) ((ah.lqeggnwhkg) objYadqdtsiqt);
                draadjrbmkVar.sopmlzcsov(1328538611);
                boolean zLmojexxdyd2 = draadjrbmkVar.lmojexxdyd(this.f102817yggfygwlhe);
                final RateOrderFragment rateOrderFragment = this.f102817yggfygwlhe;
                Object objYadqdtsiqt2 = draadjrbmkVar.yadqdtsiqt();
                if (zLmojexxdyd2 || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt2 = new tg.draadjrbmk() { // from class: ru.myspar.rate.rate_order.impl.presentation.rate.wkgbmnqykc
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return RateOrderFragment.ppxfxbqfkf.iobyxmoadg.gxszxtbevo(rateOrderFragment, ((Integer) obj).intValue());
                        }
                    };
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt2);
                }
                tg.draadjrbmk draadjrbmkVar3 = (tg.draadjrbmk) objYadqdtsiqt2;
                draadjrbmkVar.stevsuqkhv();
                draadjrbmkVar.sopmlzcsov(1328543443);
                boolean zLmojexxdyd3 = draadjrbmkVar.lmojexxdyd(this.f102817yggfygwlhe);
                final RateOrderFragment rateOrderFragment2 = this.f102817yggfygwlhe;
                Object objYadqdtsiqt3 = draadjrbmkVar.yadqdtsiqt();
                if (zLmojexxdyd3 || objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: ru.myspar.rate.rate_order.impl.presentation.rate.eablkybsjg
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return RateOrderFragment.ppxfxbqfkf.iobyxmoadg.lqeggnwhkg(rateOrderFragment2, (gg.vdvldrhtss) obj);
                        }
                    };
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt3);
                }
                tg.draadjrbmk draadjrbmkVar4 = (tg.draadjrbmk) objYadqdtsiqt3;
                draadjrbmkVar.stevsuqkhv();
                draadjrbmkVar.sopmlzcsov(1328548308);
                boolean zLmojexxdyd4 = draadjrbmkVar.lmojexxdyd(this.f102817yggfygwlhe);
                final RateOrderFragment rateOrderFragment3 = this.f102817yggfygwlhe;
                Object objYadqdtsiqt4 = draadjrbmkVar.yadqdtsiqt();
                if (zLmojexxdyd4 || objYadqdtsiqt4 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt4 = new tg.draadjrbmk() { // from class: ru.myspar.rate.rate_order.impl.presentation.rate.gxszxtbevo
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return RateOrderFragment.ppxfxbqfkf.iobyxmoadg.btonecajqb(rateOrderFragment3, (String) obj);
                        }
                    };
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt4);
                }
                draadjrbmkVar.stevsuqkhv();
                agtfadlqog.gtknphoqwx(zoijcleaowVar, rateOrderPayloadTzroggbefp, draadjrbmkVar2, draadjrbmkVar3, draadjrbmkVar4, (tg.draadjrbmk) objYadqdtsiqt4, draadjrbmkVar, 0);
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
            }

            @Override // tg.rgvfuqvkyq
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                eablkybsjg((androidx.compose.runtime.draadjrbmk) obj, ((Number) obj2).intValue());
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        ppxfxbqfkf(g02.zoijcleaow zoijcleaowVar) {
            this.f102815yggfygwlhe = zoijcleaowVar;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            iobyxmoadg((androidx.compose.runtime.draadjrbmk) obj, ((Number) obj2).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            if ((i13 & 3) == 2 && draadjrbmkVar.gtknphoqwx()) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-711418172, i13, -1, "ru.myspar.rate.rate_order.impl.presentation.rate.RateOrderFragment.handleState.<anonymous> (RateOrderFragment.kt:52)");
            }
            y50.nufgyqmvbu.iobyxmoadg iobyxmoadgVar = y50.nufgyqmvbu.f123927yggfygwlhe;
            Context contextRequireContext = RateOrderFragment.this.requireContext();
            zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
            y50.zoijcleaow.zoijcleaow(iobyxmoadgVar.iobyxmoadg(c60.zoijcleaow.eablkybsjg(contextRequireContext)), ezmngbhpjk.nufgyqmvbu.eablkybsjg(205992031, true, new iobyxmoadg(this.f102815yggfygwlhe, RateOrderFragment.this), draadjrbmkVar, 54), draadjrbmkVar, 48);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
    }

    public static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ RateOrderFragment f102819iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.gtknphoqwx.zoijcleaow f102820jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ Fragment f102821yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f102822zdlpuopuiu;

        public static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ RateOrderFragment f102823jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private /* synthetic */ Object f102824yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f102825zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar, RateOrderFragment rateOrderFragment) {
                super(2, gxszxtbevoVar);
                this.f102823jyumaefscl = rateOrderFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar, this.f102823jyumaefscl);
                iobyxmoadgVar.f102824yggfygwlhe = obj;
                return iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f102825zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    wypolnanlu state = this.f102823jyumaefscl.wwaezpbzkn().getState();
                    eablkybsjg eablkybsjgVar = this.f102823jyumaefscl.new eablkybsjg();
                    this.f102825zdlpuopuiu = 1;
                    if (state.collect(eablkybsjgVar, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                throw new KotlinNothingValueException();
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(Fragment fragment, androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar, RateOrderFragment rateOrderFragment) {
            super(2, gxszxtbevoVar);
            this.f102821yggfygwlhe = fragment;
            this.f102820jyumaefscl = zoijcleaowVar;
            this.f102819iwizpuwonk = rateOrderFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new wkgbmnqykc(this.f102821yggfygwlhe, this.f102820jyumaefscl, gxszxtbevoVar, this.f102819iwizpuwonk);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f102822zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                androidx.lifecycle.gtknphoqwx lifecycle = this.f102821yggfygwlhe.getViewLifecycleOwner().getLifecycle();
                androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = this.f102820jyumaefscl;
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(null, this.f102819iwizpuwonk);
                this.f102822zdlpuopuiu = 1;
                if (lmojexxdyd.iobyxmoadg(lifecycle, zoijcleaowVar, iobyxmoadgVar, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((wkgbmnqykc) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f102826zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1, f02.iobyxmoadg.class, "bind", "bind(Landroid/view/View;)Lru/myspar/rate/rate_order/impl/databinding/FragmentRateOrderBinding;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final f02.iobyxmoadg invoke(View p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return f02.iobyxmoadg.iobyxmoadg(p13);
        }
    }

    public RateOrderFragment() {
        super(e02.zoijcleaow.fragment_rate_order);
        this.payload = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: ru.myspar.rate.rate_order.impl.presentation.rate.zoijcleaow
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return RateOrderFragment.sopmlzcsov(this.f102897zdlpuopuiu);
            }
        });
        tg.iobyxmoadg iobyxmoadgVar = new tg.iobyxmoadg() { // from class: ru.myspar.rate.rate_order.impl.presentation.rate.ppxfxbqfkf
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return RateOrderFragment.crxdokpmqz(this.f102861zdlpuopuiu);
            }
        };
        gg.gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(gg.ojitshcjhn.NONE, new lqeggnwhkg(new gxszxtbevo(this)));
        this.viewModel = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(rgvfuqvkyq.class), new nufgyqmvbu(gtknphoqwxVarIobyxmoadg), new dxjokdxxww(null, gtknphoqwxVarIobyxmoadg), iobyxmoadgVar);
        this.binding = ys.iobyxmoadg.zoijcleaow(this, zoijcleaow.f102826zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final crxdokpmqz.ppxfxbqfkf crxdokpmqz(RateOrderFragment rateOrderFragment) {
        return rateOrderFragment.new btonecajqb();
    }

    private final f02.iobyxmoadg kegysxyocb() {
        return (f02.iobyxmoadg) this.binding.iobyxmoadg(this, f102801cdpycssgdh[0]);
    }

    private final void ntlheqmsrt(g02.zoijcleaow state) {
        kegysxyocb().f32539zoijcleaow.setContent(ezmngbhpjk.nufgyqmvbu.ppxfxbqfkf(-711418172, true, new ppxfxbqfkf(state)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RateOrderPayload sopmlzcsov(RateOrderFragment rateOrderFragment) {
        return (RateOrderPayload) qs.ppxfxbqfkf.wkgbmnqykc(rateOrderFragment, cllcsxoeiz.zoijcleaow(RateOrderPayload.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RateOrderPayload tzroggbefp() {
        return (RateOrderPayload) this.payload.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object ulzqkzuiru(RateOrderFragment rateOrderFragment, g02.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
        rateOrderFragment.ntlheqmsrt(zoijcleaowVar);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.core.base.mvvm.BaseMvvmFragment
    /* JADX INFO: renamed from: mbcevpiqjq, reason: merged with bridge method [inline-methods] */
    public rgvfuqvkyq wwaezpbzkn() {
        return (rgvfuqvkyq) this.viewModel.getValue();
    }

    @Override // ru.myspar.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        zdlpuopuiu.btonecajqb(view, "view");
        super.onViewCreated(view, savedInstanceState);
        kegysxyocb().f32539zoijcleaow.setViewCompositionStrategy(s.wkgbmnqykc.f7052zoijcleaow);
        androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = androidx.lifecycle.gtknphoqwx.zoijcleaow.STARTED;
        androidx.lifecycle.vdvldrhtss viewLifecycleOwner = getViewLifecycleOwner();
        zdlpuopuiu.dxjokdxxww(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(viewLifecycleOwner), null, null, new wkgbmnqykc(this, zoijcleaowVar, null, this), 3, null);
    }

    public final iobyxmoadg stevsuqkhv() {
        iobyxmoadg iobyxmoadgVar = this.assistedFactory;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("assistedFactory");
        return null;
    }
}
