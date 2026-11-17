package ru.myspar.proloyalty.core.base.mvi.fragment;

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
import ru.myspar.proloyalty.core.base.api.fragment.BaseFragment;
import sj.lqeggnwhkg;
import sj.nufgyqmvbu;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u0001*\b\b\u0002\u0010\u0004*\u00020\u00012\u00020\u0005B\u0011\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00028\u0002H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0017¢\u0006\u0004\b\u0016\u0010\fJ\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u0019\u0010\u001aR2\u0010\u001e\u001a \u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u001b8$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001f8$X¤\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lru/myspar/proloyalty/core/base/mvi/fragment/BaseMviFragment;", "", "Model", EcomMetricKey.ACTION_TYPE, "UiLabel", "Lru/myspar/proloyalty/core/base/api/fragment/BaseFragment;", "", "layoutId", "<init>", "(I)V", "Lgg/wwaezpbzkn;", "dsvhmnatus", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "uiLabel", "jpowsppfya", "(Ljava/lang/Object;)V", "onStart", "", "isHidden", "onHiddenChanged", "(Z)V", "Lpr0/zoijcleaow;", "pkzmftpjix", "()Lpr0/zoijcleaow;", "binder", "Ld8/zoijcleaow;", "hcddaimhww", "()Ld8/zoijcleaow;", "viewImpl", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BaseMviFragment<Model, Event, UiLabel> extends BaseFragment {

    /* synthetic */ class eablkybsjg implements nufgyqmvbu, agtfadlqog {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ d8.zoijcleaow f94309zdlpuopuiu;

        eablkybsjg(d8.zoijcleaow zoijcleaowVar) {
            this.f94309zdlpuopuiu = zoijcleaowVar;
        }

        @Override // sj.nufgyqmvbu
        public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            Object objCllcsxoeiz = BaseMviFragment.cllcsxoeiz(this.f94309zdlpuopuiu, obj, gxszxtbevoVar);
            return objCllcsxoeiz == mg.zoijcleaow.gxszxtbevo() ? objCllcsxoeiz : wwaezpbzkn.f37140iobyxmoadg;
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
            return new kotlin.jvm.internal.iobyxmoadg(2, this.f94309zdlpuopuiu, d8.zoijcleaow.class, "render", "render(Ljava/lang/Object;)V", 4);
        }
    }

    /* synthetic */ class gxszxtbevo extends vdvldrhtss implements draadjrbmk {
        gxszxtbevo(Object obj) {
            super(1, obj, BaseMviFragment.class, "handleUiLabel", "handleUiLabel(Ljava/lang/Object;)V", 0);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg(obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(Object p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            ((BaseMviFragment) this.receiver).jpowsppfya(p13);
        }
    }

    public static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ BaseMviFragment f94310iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx.zoijcleaow f94311jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ Fragment f94312yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f94313zdlpuopuiu;

        /* JADX INFO: renamed from: ru.myspar.proloyalty.core.base.mvi.fragment.BaseMviFragment$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2230iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ BaseMviFragment f94314jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private /* synthetic */ Object f94315yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f94316zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2230iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar, BaseMviFragment baseMviFragment) {
                super(2, gxszxtbevoVar);
                this.f94314jyumaefscl = baseMviFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                C2230iobyxmoadg c2230iobyxmoadg = new C2230iobyxmoadg(gxszxtbevoVar, this.f94314jyumaefscl);
                c2230iobyxmoadg.f94315yggfygwlhe = obj;
                return c2230iobyxmoadg;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f94316zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    lqeggnwhkg lqeggnwhkgVarIobyxmoadg = e8.ppxfxbqfkf.iobyxmoadg(this.f94314jyumaefscl.hcddaimhww());
                    wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(this.f94314jyumaefscl.pkzmftpjix());
                    this.f94316zdlpuopuiu = 1;
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
                return ((C2230iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(Fragment fragment, gtknphoqwx.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar, BaseMviFragment baseMviFragment) {
            super(2, gxszxtbevoVar);
            this.f94312yggfygwlhe = fragment;
            this.f94311jyumaefscl = zoijcleaowVar;
            this.f94310iwizpuwonk = baseMviFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new iobyxmoadg(this.f94312yggfygwlhe, this.f94311jyumaefscl, gxszxtbevoVar, this.f94310iwizpuwonk);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f94313zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                gtknphoqwx lifecycle = this.f94312yggfygwlhe.getViewLifecycleOwner().getLifecycle();
                gtknphoqwx.zoijcleaow zoijcleaowVar = this.f94311jyumaefscl;
                C2230iobyxmoadg c2230iobyxmoadg = new C2230iobyxmoadg(null, this.f94310iwizpuwonk);
                this.f94313zdlpuopuiu = 1;
                if (lmojexxdyd.iobyxmoadg(lifecycle, zoijcleaowVar, c2230iobyxmoadg, this) == objGxszxtbevo) {
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
        final /* synthetic */ BaseMviFragment f94317iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx.zoijcleaow f94318jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ Fragment f94319yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f94320zdlpuopuiu;

        public static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ BaseMviFragment f94321jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private /* synthetic */ Object f94322yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f94323zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar, BaseMviFragment baseMviFragment) {
                super(2, gxszxtbevoVar);
                this.f94321jyumaefscl = baseMviFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar, this.f94321jyumaefscl);
                iobyxmoadgVar.f94322yggfygwlhe = obj;
                return iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f94323zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    pr0.zoijcleaow zoijcleaowVarPkzmftpjix = this.f94321jyumaefscl.pkzmftpjix();
                    gxszxtbevo gxszxtbevoVar = new gxszxtbevo(this.f94321jyumaefscl);
                    this.f94323zdlpuopuiu = 1;
                    if (zoijcleaowVarPkzmftpjix.wypolnanlu(gxszxtbevoVar, this) == objGxszxtbevo) {
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
        public ppxfxbqfkf(Fragment fragment, gtknphoqwx.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar, BaseMviFragment baseMviFragment) {
            super(2, gxszxtbevoVar);
            this.f94319yggfygwlhe = fragment;
            this.f94318jyumaefscl = zoijcleaowVar;
            this.f94317iwizpuwonk = baseMviFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new ppxfxbqfkf(this.f94319yggfygwlhe, this.f94318jyumaefscl, gxszxtbevoVar, this.f94317iwizpuwonk);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f94320zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                gtknphoqwx lifecycle = this.f94319yggfygwlhe.getViewLifecycleOwner().getLifecycle();
                gtknphoqwx.zoijcleaow zoijcleaowVar = this.f94318jyumaefscl;
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(null, this.f94317iwizpuwonk);
                this.f94320zdlpuopuiu = 1;
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
        final /* synthetic */ pr0.zoijcleaow f94324zdlpuopuiu;

        wkgbmnqykc(pr0.zoijcleaow zoijcleaowVar) {
            this.f94324zdlpuopuiu = zoijcleaowVar;
        }

        @Override // sj.nufgyqmvbu
        public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            Object objHkdspvbjdz = BaseMviFragment.hkdspvbjdz(this.f94324zdlpuopuiu, obj, gxszxtbevoVar);
            return objHkdspvbjdz == mg.zoijcleaow.gxszxtbevo() ? objHkdspvbjdz : wwaezpbzkn.f37140iobyxmoadg;
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
            return new kotlin.jvm.internal.iobyxmoadg(2, this.f94324zdlpuopuiu, pr0.zoijcleaow.class, "dispatch", "dispatch(Ljava/lang/Object;)V", 4);
        }
    }

    public static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ BaseMviFragment f94325iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx.zoijcleaow f94326jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ Fragment f94327yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f94328zdlpuopuiu;

        public static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ BaseMviFragment f94329jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private /* synthetic */ Object f94330yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f94331zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar, BaseMviFragment baseMviFragment) {
                super(2, gxszxtbevoVar);
                this.f94329jyumaefscl = baseMviFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar, this.f94329jyumaefscl);
                iobyxmoadgVar.f94330yggfygwlhe = obj;
                return iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f94331zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    lqeggnwhkg lqeggnwhkgVarCqumvgiudr = this.f94329jyumaefscl.pkzmftpjix().cqumvgiudr();
                    eablkybsjg eablkybsjgVar = new eablkybsjg(this.f94329jyumaefscl.hcddaimhww());
                    this.f94331zdlpuopuiu = 1;
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
        public zoijcleaow(Fragment fragment, gtknphoqwx.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar, BaseMviFragment baseMviFragment) {
            super(2, gxszxtbevoVar);
            this.f94327yggfygwlhe = fragment;
            this.f94326jyumaefscl = zoijcleaowVar;
            this.f94325iwizpuwonk = baseMviFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f94327yggfygwlhe, this.f94326jyumaefscl, gxszxtbevoVar, this.f94325iwizpuwonk);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f94328zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                gtknphoqwx lifecycle = this.f94327yggfygwlhe.getViewLifecycleOwner().getLifecycle();
                gtknphoqwx.zoijcleaow zoijcleaowVar = this.f94326jyumaefscl;
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(null, this.f94325iwizpuwonk);
                this.f94328zdlpuopuiu = 1;
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

    public BaseMviFragment(int i13) {
        super(i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object cllcsxoeiz(d8.zoijcleaow zoijcleaowVar, Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaowVar.zoijcleaow(obj);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void dsvhmnatus() {
        androidx.core.content.zoijcleaow zoijcleaowVarRequireActivity = requireActivity();
        pw0.zoijcleaow zoijcleaowVar = zoijcleaowVarRequireActivity instanceof pw0.zoijcleaow ? (pw0.zoijcleaow) zoijcleaowVarRequireActivity : null;
        if (zoijcleaowVar != null) {
            zoijcleaowVar.iobyxmoadg(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object hkdspvbjdz(pr0.zoijcleaow zoijcleaowVar, Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaowVar.jyumaefscl(obj);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    protected abstract d8.zoijcleaow hcddaimhww();

    public abstract void jpowsppfya(Object uiLabel);

    @Override // ru.myspar.proloyalty.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean isHidden) {
        super.onHiddenChanged(isHidden);
        if (isVisible()) {
            dsvhmnatus();
        }
    }

    @Override // ru.myspar.proloyalty.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (isHidden()) {
            return;
        }
        dsvhmnatus();
    }

    @Override // ru.myspar.proloyalty.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
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

    protected abstract pr0.zoijcleaow pkzmftpjix();
}
