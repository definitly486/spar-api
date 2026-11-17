package ru.myspar.core.base.mvi.dialog;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.gtknphoqwx;
import androidx.lifecycle.lmojexxdyd;
import androidx.lifecycle.oxmwwwfdhm;
import gg.dxjokdxxww;
import gg.wwaezpbzkn;
import kotlin.Metadata;
import kotlin.jvm.internal.agtfadlqog;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.analytics.EcomMetricKey;
import pj.cllcsxoeiz;
import ru.myspar.core.base.api.dialog.BaseDialogFragment;
import sj.lqeggnwhkg;
import sj.nufgyqmvbu;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u0001*\b\b\u0002\u0010\u0004*\u00020\u00012\u00020\u0005B\u0011\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00028\u0002H&¢\u0006\u0004\b\u0012\u0010\u0013R2\u0010\u0017\u001a \u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00148$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00188$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/myspar/core/base/mvi/dialog/BaseMviDialogFragment;", "", "Model", EcomMetricKey.ACTION_TYPE, "UiLabel", "Lru/myspar/core/base/api/dialog/BaseDialogFragment;", "", "layoutId", "<init>", "(I)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lgg/wwaezpbzkn;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "uiLabel", "cllcsxoeiz", "(Ljava/lang/Object;)V", "Lws/zoijcleaow;", "jpowsppfya", "()Lws/zoijcleaow;", "binder", "Ld8/zoijcleaow;", "hkdspvbjdz", "()Ld8/zoijcleaow;", "viewImpl", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BaseMviDialogFragment<Model, Event, UiLabel> extends BaseDialogFragment {

    /* synthetic */ class eablkybsjg implements nufgyqmvbu, agtfadlqog {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ d8.zoijcleaow f86549zdlpuopuiu;

        eablkybsjg(d8.zoijcleaow zoijcleaowVar) {
            this.f86549zdlpuopuiu = zoijcleaowVar;
        }

        @Override // sj.nufgyqmvbu
        public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            Object objWypolnanlu = BaseMviDialogFragment.wypolnanlu(this.f86549zdlpuopuiu, obj, gxszxtbevoVar);
            return objWypolnanlu == mg.zoijcleaow.gxszxtbevo() ? objWypolnanlu : wwaezpbzkn.f37140iobyxmoadg;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof nufgyqmvbu) && (obj instanceof agtfadlqog)) {
                return zdlpuopuiu.eablkybsjg(zoijcleaow(), ((agtfadlqog) obj).zoijcleaow());
            }
            return false;
        }

        public final int hashCode() {
            return zoijcleaow().hashCode();
        }

        @Override // kotlin.jvm.internal.agtfadlqog
        public final dxjokdxxww zoijcleaow() {
            return new kotlin.jvm.internal.iobyxmoadg(2, this.f86549zdlpuopuiu, d8.zoijcleaow.class, "render", "render(Ljava/lang/Object;)V", 4);
        }
    }

    /* synthetic */ class gxszxtbevo extends vdvldrhtss implements draadjrbmk {
        gxszxtbevo(Object obj) {
            super(1, obj, BaseMviDialogFragment.class, "handleUiLabel", "handleUiLabel(Ljava/lang/Object;)V", 0);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg(obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(Object p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            ((BaseMviDialogFragment) this.receiver).cllcsxoeiz(p13);
        }
    }

    public static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ BaseMviDialogFragment f86550iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx.zoijcleaow f86551jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ Fragment f86552yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f86553zdlpuopuiu;

        /* JADX INFO: renamed from: ru.myspar.core.base.mvi.dialog.BaseMviDialogFragment$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C1992iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ BaseMviDialogFragment f86554jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private /* synthetic */ Object f86555yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f86556zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1992iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar, BaseMviDialogFragment baseMviDialogFragment) {
                super(2, gxszxtbevoVar);
                this.f86554jyumaefscl = baseMviDialogFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C1992iobyxmoadg c1992iobyxmoadg = new C1992iobyxmoadg(gxszxtbevoVar, this.f86554jyumaefscl);
                c1992iobyxmoadg.f86555yggfygwlhe = obj;
                return c1992iobyxmoadg;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f86556zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    lqeggnwhkg lqeggnwhkgVarIobyxmoadg = e8.ppxfxbqfkf.iobyxmoadg(this.f86554jyumaefscl.hkdspvbjdz());
                    wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(this.f86554jyumaefscl.jpowsppfya());
                    this.f86556zdlpuopuiu = 1;
                    if (lqeggnwhkgVarIobyxmoadg.collect(wkgbmnqykcVar, this) == objGxszxtbevo) {
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
            public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((C1992iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(Fragment fragment, gtknphoqwx.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar, BaseMviDialogFragment baseMviDialogFragment) {
            super(2, gxszxtbevoVar);
            this.f86552yggfygwlhe = fragment;
            this.f86551jyumaefscl = zoijcleaowVar;
            this.f86550iwizpuwonk = baseMviDialogFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new iobyxmoadg(this.f86552yggfygwlhe, this.f86551jyumaefscl, gxszxtbevoVar, this.f86550iwizpuwonk);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f86553zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                gtknphoqwx lifecycle = this.f86552yggfygwlhe.getViewLifecycleOwner().getLifecycle();
                gtknphoqwx.zoijcleaow zoijcleaowVar = this.f86551jyumaefscl;
                C1992iobyxmoadg c1992iobyxmoadg = new C1992iobyxmoadg(null, this.f86550iwizpuwonk);
                this.f86553zdlpuopuiu = 1;
                if (lmojexxdyd.iobyxmoadg(lifecycle, zoijcleaowVar, c1992iobyxmoadg, this) == objGxszxtbevo) {
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
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ BaseMviDialogFragment f86557iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx.zoijcleaow f86558jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ Fragment f86559yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f86560zdlpuopuiu;

        public static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ BaseMviDialogFragment f86561jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private /* synthetic */ Object f86562yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f86563zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar, BaseMviDialogFragment baseMviDialogFragment) {
                super(2, gxszxtbevoVar);
                this.f86561jyumaefscl = baseMviDialogFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar, this.f86561jyumaefscl);
                iobyxmoadgVar.f86562yggfygwlhe = obj;
                return iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f86563zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    ws.zoijcleaow zoijcleaowVarJpowsppfya = this.f86561jyumaefscl.jpowsppfya();
                    gxszxtbevo gxszxtbevoVar = new gxszxtbevo(this.f86561jyumaefscl);
                    this.f86563zdlpuopuiu = 1;
                    if (zoijcleaowVarJpowsppfya.wypolnanlu(gxszxtbevoVar, this) == objGxszxtbevo) {
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
            public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Fragment fragment, gtknphoqwx.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar, BaseMviDialogFragment baseMviDialogFragment) {
            super(2, gxszxtbevoVar);
            this.f86559yggfygwlhe = fragment;
            this.f86558jyumaefscl = zoijcleaowVar;
            this.f86557iwizpuwonk = baseMviDialogFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new ppxfxbqfkf(this.f86559yggfygwlhe, this.f86558jyumaefscl, gxszxtbevoVar, this.f86557iwizpuwonk);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f86560zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                gtknphoqwx lifecycle = this.f86559yggfygwlhe.getViewLifecycleOwner().getLifecycle();
                gtknphoqwx.zoijcleaow zoijcleaowVar = this.f86558jyumaefscl;
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(null, this.f86557iwizpuwonk);
                this.f86560zdlpuopuiu = 1;
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
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* synthetic */ class wkgbmnqykc implements nufgyqmvbu, agtfadlqog {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ ws.zoijcleaow f86564zdlpuopuiu;

        wkgbmnqykc(ws.zoijcleaow zoijcleaowVar) {
            this.f86564zdlpuopuiu = zoijcleaowVar;
        }

        @Override // sj.nufgyqmvbu
        public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            Object objDsvhmnatus = BaseMviDialogFragment.dsvhmnatus(this.f86564zdlpuopuiu, obj, gxszxtbevoVar);
            return objDsvhmnatus == mg.zoijcleaow.gxszxtbevo() ? objDsvhmnatus : wwaezpbzkn.f37140iobyxmoadg;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof nufgyqmvbu) && (obj instanceof agtfadlqog)) {
                return zdlpuopuiu.eablkybsjg(zoijcleaow(), ((agtfadlqog) obj).zoijcleaow());
            }
            return false;
        }

        public final int hashCode() {
            return zoijcleaow().hashCode();
        }

        @Override // kotlin.jvm.internal.agtfadlqog
        public final dxjokdxxww zoijcleaow() {
            return new kotlin.jvm.internal.iobyxmoadg(2, this.f86564zdlpuopuiu, ws.zoijcleaow.class, "dispatch", "dispatch(Ljava/lang/Object;)V", 4);
        }
    }

    public static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ BaseMviDialogFragment f86565iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx.zoijcleaow f86566jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ Fragment f86567yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f86568zdlpuopuiu;

        public static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ BaseMviDialogFragment f86569jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private /* synthetic */ Object f86570yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f86571zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar, BaseMviDialogFragment baseMviDialogFragment) {
                super(2, gxszxtbevoVar);
                this.f86569jyumaefscl = baseMviDialogFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar, this.f86569jyumaefscl);
                iobyxmoadgVar.f86570yggfygwlhe = obj;
                return iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f86571zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    lqeggnwhkg lqeggnwhkgVarCqumvgiudr = this.f86569jyumaefscl.jpowsppfya().cqumvgiudr();
                    eablkybsjg eablkybsjgVar = new eablkybsjg(this.f86569jyumaefscl.hkdspvbjdz());
                    this.f86571zdlpuopuiu = 1;
                    if (lqeggnwhkgVarCqumvgiudr.collect(eablkybsjgVar, this) == objGxszxtbevo) {
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
            public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(Fragment fragment, gtknphoqwx.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar, BaseMviDialogFragment baseMviDialogFragment) {
            super(2, gxszxtbevoVar);
            this.f86567yggfygwlhe = fragment;
            this.f86566jyumaefscl = zoijcleaowVar;
            this.f86565iwizpuwonk = baseMviDialogFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f86567yggfygwlhe, this.f86566jyumaefscl, gxszxtbevoVar, this.f86565iwizpuwonk);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f86568zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                gtknphoqwx lifecycle = this.f86567yggfygwlhe.getViewLifecycleOwner().getLifecycle();
                gtknphoqwx.zoijcleaow zoijcleaowVar = this.f86566jyumaefscl;
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(null, this.f86565iwizpuwonk);
                this.f86568zdlpuopuiu = 1;
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
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public BaseMviDialogFragment(int i13) {
        super(i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object dsvhmnatus(ws.zoijcleaow zoijcleaowVar, Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaowVar.jyumaefscl(obj);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object wypolnanlu(d8.zoijcleaow zoijcleaowVar, Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaowVar.zoijcleaow(obj);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public abstract void cllcsxoeiz(Object uiLabel);

    protected abstract d8.zoijcleaow hkdspvbjdz();

    protected abstract ws.zoijcleaow jpowsppfya();

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        zdlpuopuiu.btonecajqb(view, "view");
        super.onViewCreated(view, savedInstanceState);
        gtknphoqwx.zoijcleaow zoijcleaowVar = gtknphoqwx.zoijcleaow.CREATED;
        androidx.lifecycle.vdvldrhtss viewLifecycleOwner = getViewLifecycleOwner();
        zdlpuopuiu.dxjokdxxww(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(viewLifecycleOwner), null, null, new iobyxmoadg(this, zoijcleaowVar, null, this), 3, null);
        gtknphoqwx.zoijcleaow zoijcleaowVar2 = gtknphoqwx.zoijcleaow.STARTED;
        androidx.lifecycle.vdvldrhtss viewLifecycleOwner2 = getViewLifecycleOwner();
        zdlpuopuiu.dxjokdxxww(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(viewLifecycleOwner2), null, null, new zoijcleaow(this, zoijcleaowVar2, null, this), 3, null);
        gtknphoqwx.zoijcleaow zoijcleaowVar3 = gtknphoqwx.zoijcleaow.RESUMED;
        androidx.lifecycle.vdvldrhtss viewLifecycleOwner3 = getViewLifecycleOwner();
        zdlpuopuiu.dxjokdxxww(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(viewLifecycleOwner3), null, null, new ppxfxbqfkf(this, zoijcleaowVar3, null, this), 3, null);
    }
}
