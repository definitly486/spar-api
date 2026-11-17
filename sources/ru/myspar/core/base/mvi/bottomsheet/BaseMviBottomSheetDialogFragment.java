package ru.myspar.core.base.mvi.bottomsheet;

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
import ru.myspar.core.base.api.bottomsheet.BaseBottomSheetDialogFragment;
import sj.lqeggnwhkg;
import sj.nufgyqmvbu;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u0001*\b\b\u0002\u0010\u0004*\u00020\u00012\u00020\u0005B\u0011\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00028\u0002H&¢\u0006\u0004\b\u0012\u0010\u0013R2\u0010\u0017\u001a \u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00148$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00188$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/myspar/core/base/mvi/bottomsheet/BaseMviBottomSheetDialogFragment;", "", "Model", EcomMetricKey.ACTION_TYPE, "UiLabel", "Lru/myspar/core/base/api/bottomsheet/BaseBottomSheetDialogFragment;", "", "layoutId", "<init>", "(I)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lgg/wwaezpbzkn;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "uiLabel", "jhduphickx", "(Ljava/lang/Object;)V", "Lws/zoijcleaow;", "ribwqtqdhb", "()Lws/zoijcleaow;", "binder", "Ld8/zoijcleaow;", "vipkmwdibw", "()Ld8/zoijcleaow;", "viewImpl", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BaseMviBottomSheetDialogFragment<Model, Event, UiLabel> extends BaseBottomSheetDialogFragment {

    /* synthetic */ class eablkybsjg implements nufgyqmvbu, agtfadlqog {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ d8.zoijcleaow f86524zdlpuopuiu;

        eablkybsjg(d8.zoijcleaow zoijcleaowVar) {
            this.f86524zdlpuopuiu = zoijcleaowVar;
        }

        @Override // sj.nufgyqmvbu
        public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            Object objOkpsazkaxt = BaseMviBottomSheetDialogFragment.okpsazkaxt(this.f86524zdlpuopuiu, obj, gxszxtbevoVar);
            return objOkpsazkaxt == mg.zoijcleaow.gxszxtbevo() ? objOkpsazkaxt : wwaezpbzkn.f37140iobyxmoadg;
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
            return new kotlin.jvm.internal.iobyxmoadg(2, this.f86524zdlpuopuiu, d8.zoijcleaow.class, "render", "render(Ljava/lang/Object;)V", 4);
        }
    }

    /* synthetic */ class gxszxtbevo extends vdvldrhtss implements draadjrbmk {
        gxszxtbevo(Object obj) {
            super(1, obj, BaseMviBottomSheetDialogFragment.class, "handleUiLabel", "handleUiLabel(Ljava/lang/Object;)V", 0);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg(obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(Object p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            ((BaseMviBottomSheetDialogFragment) this.receiver).jhduphickx(p13);
        }
    }

    public static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ BaseMviBottomSheetDialogFragment f86525iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx.zoijcleaow f86526jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ Fragment f86527yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f86528zdlpuopuiu;

        /* JADX INFO: renamed from: ru.myspar.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C1990iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ BaseMviBottomSheetDialogFragment f86529jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private /* synthetic */ Object f86530yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f86531zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1990iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar, BaseMviBottomSheetDialogFragment baseMviBottomSheetDialogFragment) {
                super(2, gxszxtbevoVar);
                this.f86529jyumaefscl = baseMviBottomSheetDialogFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C1990iobyxmoadg c1990iobyxmoadg = new C1990iobyxmoadg(gxszxtbevoVar, this.f86529jyumaefscl);
                c1990iobyxmoadg.f86530yggfygwlhe = obj;
                return c1990iobyxmoadg;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f86531zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    lqeggnwhkg lqeggnwhkgVarIobyxmoadg = e8.ppxfxbqfkf.iobyxmoadg(this.f86529jyumaefscl.vipkmwdibw());
                    wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(this.f86529jyumaefscl.ribwqtqdhb());
                    this.f86531zdlpuopuiu = 1;
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
                return ((C1990iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(Fragment fragment, gtknphoqwx.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar, BaseMviBottomSheetDialogFragment baseMviBottomSheetDialogFragment) {
            super(2, gxszxtbevoVar);
            this.f86527yggfygwlhe = fragment;
            this.f86526jyumaefscl = zoijcleaowVar;
            this.f86525iwizpuwonk = baseMviBottomSheetDialogFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new iobyxmoadg(this.f86527yggfygwlhe, this.f86526jyumaefscl, gxszxtbevoVar, this.f86525iwizpuwonk);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f86528zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                gtknphoqwx lifecycle = this.f86527yggfygwlhe.getViewLifecycleOwner().getLifecycle();
                gtknphoqwx.zoijcleaow zoijcleaowVar = this.f86526jyumaefscl;
                C1990iobyxmoadg c1990iobyxmoadg = new C1990iobyxmoadg(null, this.f86525iwizpuwonk);
                this.f86528zdlpuopuiu = 1;
                if (lmojexxdyd.iobyxmoadg(lifecycle, zoijcleaowVar, c1990iobyxmoadg, this) == objGxszxtbevo) {
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
        final /* synthetic */ BaseMviBottomSheetDialogFragment f86532iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx.zoijcleaow f86533jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ Fragment f86534yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f86535zdlpuopuiu;

        public static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ BaseMviBottomSheetDialogFragment f86536jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private /* synthetic */ Object f86537yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f86538zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar, BaseMviBottomSheetDialogFragment baseMviBottomSheetDialogFragment) {
                super(2, gxszxtbevoVar);
                this.f86536jyumaefscl = baseMviBottomSheetDialogFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar, this.f86536jyumaefscl);
                iobyxmoadgVar.f86537yggfygwlhe = obj;
                return iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f86538zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    ws.zoijcleaow zoijcleaowVarRibwqtqdhb = this.f86536jyumaefscl.ribwqtqdhb();
                    gxszxtbevo gxszxtbevoVar = new gxszxtbevo(this.f86536jyumaefscl);
                    this.f86538zdlpuopuiu = 1;
                    if (zoijcleaowVarRibwqtqdhb.wypolnanlu(gxszxtbevoVar, this) == objGxszxtbevo) {
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
        public ppxfxbqfkf(Fragment fragment, gtknphoqwx.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar, BaseMviBottomSheetDialogFragment baseMviBottomSheetDialogFragment) {
            super(2, gxszxtbevoVar);
            this.f86534yggfygwlhe = fragment;
            this.f86533jyumaefscl = zoijcleaowVar;
            this.f86532iwizpuwonk = baseMviBottomSheetDialogFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new ppxfxbqfkf(this.f86534yggfygwlhe, this.f86533jyumaefscl, gxszxtbevoVar, this.f86532iwizpuwonk);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f86535zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                gtknphoqwx lifecycle = this.f86534yggfygwlhe.getViewLifecycleOwner().getLifecycle();
                gtknphoqwx.zoijcleaow zoijcleaowVar = this.f86533jyumaefscl;
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(null, this.f86532iwizpuwonk);
                this.f86535zdlpuopuiu = 1;
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
        final /* synthetic */ ws.zoijcleaow f86539zdlpuopuiu;

        wkgbmnqykc(ws.zoijcleaow zoijcleaowVar) {
            this.f86539zdlpuopuiu = zoijcleaowVar;
        }

        @Override // sj.nufgyqmvbu
        public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            Object objIkoacuggdj = BaseMviBottomSheetDialogFragment.ikoacuggdj(this.f86539zdlpuopuiu, obj, gxszxtbevoVar);
            return objIkoacuggdj == mg.zoijcleaow.gxszxtbevo() ? objIkoacuggdj : wwaezpbzkn.f37140iobyxmoadg;
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
            return new kotlin.jvm.internal.iobyxmoadg(2, this.f86539zdlpuopuiu, ws.zoijcleaow.class, "dispatch", "dispatch(Ljava/lang/Object;)V", 4);
        }
    }

    public static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ BaseMviBottomSheetDialogFragment f86540iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx.zoijcleaow f86541jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ Fragment f86542yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f86543zdlpuopuiu;

        public static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ BaseMviBottomSheetDialogFragment f86544jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private /* synthetic */ Object f86545yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f86546zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar, BaseMviBottomSheetDialogFragment baseMviBottomSheetDialogFragment) {
                super(2, gxszxtbevoVar);
                this.f86544jyumaefscl = baseMviBottomSheetDialogFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar, this.f86544jyumaefscl);
                iobyxmoadgVar.f86545yggfygwlhe = obj;
                return iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f86546zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    lqeggnwhkg lqeggnwhkgVarCqumvgiudr = this.f86544jyumaefscl.ribwqtqdhb().cqumvgiudr();
                    eablkybsjg eablkybsjgVar = new eablkybsjg(this.f86544jyumaefscl.vipkmwdibw());
                    this.f86546zdlpuopuiu = 1;
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
        public zoijcleaow(Fragment fragment, gtknphoqwx.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar, BaseMviBottomSheetDialogFragment baseMviBottomSheetDialogFragment) {
            super(2, gxszxtbevoVar);
            this.f86542yggfygwlhe = fragment;
            this.f86541jyumaefscl = zoijcleaowVar;
            this.f86540iwizpuwonk = baseMviBottomSheetDialogFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f86542yggfygwlhe, this.f86541jyumaefscl, gxszxtbevoVar, this.f86540iwizpuwonk);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f86543zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                gtknphoqwx lifecycle = this.f86542yggfygwlhe.getViewLifecycleOwner().getLifecycle();
                gtknphoqwx.zoijcleaow zoijcleaowVar = this.f86541jyumaefscl;
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(null, this.f86540iwizpuwonk);
                this.f86543zdlpuopuiu = 1;
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

    public BaseMviBottomSheetDialogFragment(int i13) {
        super(i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object ikoacuggdj(ws.zoijcleaow zoijcleaowVar, Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaowVar.jyumaefscl(obj);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object okpsazkaxt(d8.zoijcleaow zoijcleaowVar, Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaowVar.zoijcleaow(obj);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public abstract void jhduphickx(Object uiLabel);

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

    protected abstract ws.zoijcleaow ribwqtqdhb();

    protected abstract d8.zoijcleaow vipkmwdibw();
}
