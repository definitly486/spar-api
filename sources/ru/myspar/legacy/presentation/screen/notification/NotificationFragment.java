package ru.myspar.legacy.presentation.screen.notification;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.stevsuqkhv;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.lmojexxdyd;
import androidx.lifecycle.ntlheqmsrt;
import androidx.lifecycle.oxmwwwfdhm;
import androidx.lifecycle.ribwqtqdhb;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import gg.ojitshcjhn;
import gg.wwaezpbzkn;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.yadqdtsiqt;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.cdpycssgdh;
import mj.kcexrzcfyt;
import sj.wypolnanlu;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007*\u00014\b\u0007\u0018\u0000 =2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001>B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010\u0004R\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020\u00028TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001b\u00103\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001b\u0010<\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010*\u001a\u0004\b:\u0010;¨\u0006?"}, d2 = {"Lru/myspar/legacy/presentation/screen/notification/NotificationFragment;", "Lru/myspar/core/base/mvvm/BaseMvvmFragment;", "Lru/myspar/legacy/presentation/screen/notification/agtfadlqog;", "<init>", "()V", "Lru/myspar/legacy/presentation/screen/notification/draadjrbmk;", "state", "Lgg/wwaezpbzkn;", "vipkmwdibw", "(Lru/myspar/legacy/presentation/screen/notification/draadjrbmk;)V", "Lru/myspar/legacy/presentation/screen/notification/wflxmlrfwp;", "uiLabel", "jhduphickx", "(Lru/myspar/legacy/presentation/screen/notification/wflxmlrfwp;)V", "Lpc0/zoijcleaow;", "notification", "rlfsiqarku", "(Lpc0/zoijcleaow;)V", "", "title", "message", "metgxyhuhe", "(Ljava/lang/String;Ljava/lang/String;)V", "promoCode", "ulzqkzuiru", "(Ljava/lang/String;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Lru/myspar/legacy/presentation/screen/notification/iobyxmoadg;", "esjtqupxsv", "Lru/myspar/legacy/presentation/screen/notification/iobyxmoadg;", "crxdokpmqz", "()Lru/myspar/legacy/presentation/screen/notification/iobyxmoadg;", "setAssistedFactory", "(Lru/myspar/legacy/presentation/screen/notification/iobyxmoadg;)V", "assistedFactory", "lereixgezr", "Lgg/gtknphoqwx;", "ribwqtqdhb", "()Lru/myspar/legacy/presentation/screen/notification/agtfadlqog;", "viewModel", "Lm60/cdpycssgdh;", "pmvmpeiblj", "Lys/ppxfxbqfkf;", "jlmebxxoox", "()Lm60/cdpycssgdh;", "binding", "ru/myspar/legacy/presentation/screen/notification/NotificationFragment$draadjrbmk", "zynmafqrjb", "Lru/myspar/legacy/presentation/screen/notification/NotificationFragment$draadjrbmk;", "viewPagerOnPageChangeCallback", "Lnc0/btonecajqb;", "istkbnxepw", "sopmlzcsov", "()Lnc0/btonecajqb;", "adapter", "cdpycssgdh", "iobyxmoadg", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NotificationFragment extends Hilt_NotificationFragment<agtfadlqog> {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    public iobyxmoadg assistedFactory;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    private final gg.gtknphoqwx adapter;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    private final gg.gtknphoqwx viewModel;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    private final ys.ppxfxbqfkf binding;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    private final draadjrbmk viewPagerOnPageChangeCallback;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f89248yadqdtsiqt = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(NotificationFragment.class, "binding", "getBinding()Lru/myspar/databinding/FragmentNotificationBinding;", 0))};

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    public static final int f89247iozdgvuglv = 8;

    public static final class btonecajqb extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f89254yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f89255zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public btonecajqb(tg.iobyxmoadg iobyxmoadgVar, gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f89255zdlpuopuiu = iobyxmoadgVar;
            this.f89254yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f89255zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f89254yggfygwlhe);
            androidx.lifecycle.dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof androidx.lifecycle.dxjokdxxww ? (androidx.lifecycle.dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    public static final class draadjrbmk extends ViewPager2.dxjokdxxww {
        draadjrbmk() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.dxjokdxxww
        public void ppxfxbqfkf(int i13) {
            super.ppxfxbqfkf(i13);
            NotificationFragment.this.wwaezpbzkn().sopmlzcsov(new ru.myspar.legacy.presentation.screen.notification.gtknphoqwx.ppxfxbqfkf(i13));
        }
    }

    public static final class dxjokdxxww extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f89257zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public dxjokdxxww(gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f89257zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f89257zdlpuopuiu).getViewModelStore();
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
        public final Object emit(ru.myspar.legacy.presentation.screen.notification.draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objJztzpxfvev = NotificationFragment.jztzpxfvev(NotificationFragment.this, draadjrbmkVar, gxszxtbevoVar);
            return objJztzpxfvev == mg.zoijcleaow.gxszxtbevo() ? objJztzpxfvev : wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // kotlin.jvm.internal.agtfadlqog
        public final gg.dxjokdxxww zoijcleaow() {
            return new kotlin.jvm.internal.iobyxmoadg(2, NotificationFragment.this, NotificationFragment.class, "handleState", "handleState(Lru/myspar/legacy/presentation/screen/notification/NotificationView$Model;)V", 4);
        }
    }

    public static final class gtknphoqwx implements crxdokpmqz.ppxfxbqfkf {
        public gtknphoqwx() {
        }

        @Override // androidx.lifecycle.crxdokpmqz.ppxfxbqfkf
        public ntlheqmsrt create(Class modelClass) {
            zdlpuopuiu.btonecajqb(modelClass, "modelClass");
            agtfadlqog agtfadlqogVarIobyxmoadg = NotificationFragment.this.crxdokpmqz().iobyxmoadg();
            zdlpuopuiu.nufgyqmvbu(agtfadlqogVarIobyxmoadg, "null cannot be cast to non-null type T of ru.myspar.legacy.presentation.ext.ViewModelExtKt.viewModelProviderFactoryOf.<no name provided>.create");
            return agtfadlqogVarIobyxmoadg;
        }
    }

    /* synthetic */ class gxszxtbevo implements sj.nufgyqmvbu, kotlin.jvm.internal.agtfadlqog {
        gxszxtbevo() {
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
        public final Object emit(wflxmlrfwp wflxmlrfwpVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objXrmfcynszj = NotificationFragment.xrmfcynszj(NotificationFragment.this, wflxmlrfwpVar, gxszxtbevoVar);
            return objXrmfcynszj == mg.zoijcleaow.gxszxtbevo() ? objXrmfcynszj : wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // kotlin.jvm.internal.agtfadlqog
        public final gg.dxjokdxxww zoijcleaow() {
            return new kotlin.jvm.internal.iobyxmoadg(2, NotificationFragment.this, NotificationFragment.class, "handleUiLabel", "handleUiLabel(Lru/myspar/legacy/presentation/screen/notification/NotificationView$UiLabel;)V", 4);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.legacy.presentation.screen.notification.NotificationFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final NotificationFragment iobyxmoadg() {
            return new NotificationFragment();
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f89261zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(Fragment fragment) {
            super(0);
            this.f89261zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f89261zdlpuopuiu;
        }
    }

    public static final class nufgyqmvbu extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f89262zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public nufgyqmvbu(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f89262zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f89262zdlpuopuiu.invoke();
        }
    }

    public static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ NotificationFragment f89263iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.gtknphoqwx.zoijcleaow f89264jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ Fragment f89265yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f89266zdlpuopuiu;

        public static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ NotificationFragment f89267jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private /* synthetic */ Object f89268yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f89269zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar, NotificationFragment notificationFragment) {
                super(2, gxszxtbevoVar);
                this.f89267jyumaefscl = notificationFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar, this.f89267jyumaefscl);
                iobyxmoadgVar.f89268yggfygwlhe = obj;
                return iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f89269zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    wypolnanlu state = this.f89267jyumaefscl.wwaezpbzkn().getState();
                    eablkybsjg eablkybsjgVar = this.f89267jyumaefscl.new eablkybsjg();
                    this.f89269zdlpuopuiu = 1;
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
        public ppxfxbqfkf(Fragment fragment, androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar, NotificationFragment notificationFragment) {
            super(2, gxszxtbevoVar);
            this.f89265yggfygwlhe = fragment;
            this.f89264jyumaefscl = zoijcleaowVar;
            this.f89263iwizpuwonk = notificationFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new ppxfxbqfkf(this.f89265yggfygwlhe, this.f89264jyumaefscl, gxszxtbevoVar, this.f89263iwizpuwonk);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f89266zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                androidx.lifecycle.gtknphoqwx lifecycle = this.f89265yggfygwlhe.getViewLifecycleOwner().getLifecycle();
                androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = this.f89264jyumaefscl;
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(null, this.f89263iwizpuwonk);
                this.f89266zdlpuopuiu = 1;
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
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ NotificationFragment f89270iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.gtknphoqwx.zoijcleaow f89271jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ Fragment f89272yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f89273zdlpuopuiu;

        public static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ NotificationFragment f89274jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private /* synthetic */ Object f89275yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f89276zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar, NotificationFragment notificationFragment) {
                super(2, gxszxtbevoVar);
                this.f89274jyumaefscl = notificationFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar, this.f89274jyumaefscl);
                iobyxmoadgVar.f89275yggfygwlhe = obj;
                return iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f89276zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    sj.lqeggnwhkg lqeggnwhkgVarDraadjrbmk = this.f89274jyumaefscl.wwaezpbzkn().draadjrbmk();
                    gxszxtbevo gxszxtbevoVar = this.f89274jyumaefscl.new gxszxtbevo();
                    this.f89276zdlpuopuiu = 1;
                    if (lqeggnwhkgVarDraadjrbmk.collect(gxszxtbevoVar, this) == objGxszxtbevo) {
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
                return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(Fragment fragment, androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar, NotificationFragment notificationFragment) {
            super(2, gxszxtbevoVar);
            this.f89272yggfygwlhe = fragment;
            this.f89271jyumaefscl = zoijcleaowVar;
            this.f89270iwizpuwonk = notificationFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new wkgbmnqykc(this.f89272yggfygwlhe, this.f89271jyumaefscl, gxszxtbevoVar, this.f89270iwizpuwonk);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f89273zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                androidx.lifecycle.gtknphoqwx lifecycle = this.f89272yggfygwlhe.getViewLifecycleOwner().getLifecycle();
                androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = this.f89271jyumaefscl;
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(null, this.f89270iwizpuwonk);
                this.f89273zdlpuopuiu = 1;
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
        public static final zoijcleaow f89277zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1, cdpycssgdh.class, "bind", "bind(Landroid/view/View;)Lru/myspar/databinding/FragmentNotificationBinding;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final cdpycssgdh invoke(View p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return cdpycssgdh.iobyxmoadg(p13);
        }
    }

    public NotificationFragment() {
        super(pm.gxszxtbevo.fragment_notification);
        tg.iobyxmoadg iobyxmoadgVar = new tg.iobyxmoadg() { // from class: ru.myspar.legacy.presentation.screen.notification.zoijcleaow
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return NotificationFragment.czzsidtyhn(this.f89340zdlpuopuiu);
            }
        };
        gg.gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new nufgyqmvbu(new lqeggnwhkg(this)));
        this.viewModel = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(agtfadlqog.class), new dxjokdxxww(gtknphoqwxVarIobyxmoadg), new btonecajqb(null, gtknphoqwxVarIobyxmoadg), iobyxmoadgVar);
        this.binding = ys.iobyxmoadg.zoijcleaow(this, zoijcleaow.f89277zdlpuopuiu);
        this.viewPagerOnPageChangeCallback = new draadjrbmk();
        this.adapter = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: ru.myspar.legacy.presentation.screen.notification.ppxfxbqfkf
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return NotificationFragment.mbcevpiqjq(this.f89334zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final crxdokpmqz.ppxfxbqfkf czzsidtyhn(NotificationFragment notificationFragment) {
        return notificationFragment.new gtknphoqwx();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ikoacuggdj(NotificationFragment notificationFragment) {
        notificationFragment.wwaezpbzkn().sopmlzcsov(ru.myspar.legacy.presentation.screen.notification.gtknphoqwx.iobyxmoadg.f89330iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void jhduphickx(wflxmlrfwp uiLabel) {
        if (uiLabel instanceof wflxmlrfwp.zoijcleaow) {
            wflxmlrfwp.zoijcleaow zoijcleaowVar = (wflxmlrfwp.zoijcleaow) uiLabel;
            metgxyhuhe(zoijcleaowVar.zoijcleaow(), zoijcleaowVar.iobyxmoadg());
        } else if (uiLabel instanceof wflxmlrfwp.ppxfxbqfkf) {
            rlfsiqarku(((wflxmlrfwp.ppxfxbqfkf) uiLabel).iobyxmoadg());
        } else {
            if (!(uiLabel instanceof wflxmlrfwp.iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            ulzqkzuiru(((wflxmlrfwp.iobyxmoadg) uiLabel).iobyxmoadg());
        }
    }

    private final cdpycssgdh jlmebxxoox() {
        return (cdpycssgdh) this.binding.iobyxmoadg(this, f89248yadqdtsiqt[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object jztzpxfvev(NotificationFragment notificationFragment, ru.myspar.legacy.presentation.screen.notification.draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
        notificationFragment.vipkmwdibw(draadjrbmkVar);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nc0.btonecajqb mbcevpiqjq(final NotificationFragment notificationFragment) {
        Context contextRequireContext = notificationFragment.requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        return new nc0.btonecajqb(contextRequireContext, new tg.draadjrbmk() { // from class: ru.myspar.legacy.presentation.screen.notification.gxszxtbevo
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return NotificationFragment.ntlheqmsrt(this.f89333zdlpuopuiu, (pc0.zoijcleaow) obj);
            }
        });
    }

    private final void metgxyhuhe(String title, String message) {
        rx.iobyxmoadg iobyxmoadgVar = new rx.iobyxmoadg(rx.zoijcleaow.PRIMARY, null, getResources().getString(pm.dxjokdxxww.action_close), null, 10, null);
        Context contextRequireContext = requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        rx.nufgyqmvbu.iobyxmoadg iobyxmoadgVarOjitshcjhn = new rx.nufgyqmvbu.iobyxmoadg(contextRequireContext, Boolean.TRUE, null, 4, null).ojitshcjhn(title);
        if (!kcexrzcfyt.zfvoamnweg(message)) {
            iobyxmoadgVarOjitshcjhn.nufgyqmvbu(message);
        }
        iobyxmoadgVarOjitshcjhn.iobyxmoadg(iobyxmoadgVar).zoijcleaow().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ntlheqmsrt(NotificationFragment notificationFragment, pc0.zoijcleaow it) {
        zdlpuopuiu.btonecajqb(it, "it");
        notificationFragment.wwaezpbzkn().sopmlzcsov(new ru.myspar.legacy.presentation.screen.notification.gtknphoqwx.zoijcleaow(it));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void okpsazkaxt(NotificationFragment notificationFragment, TabLayout.eablkybsjg tab, int i13) {
        zdlpuopuiu.btonecajqb(tab, "tab");
        tab.oxmwwwfdhm(notificationFragment.sopmlzcsov().nufgyqmvbu(i13));
    }

    private final void rlfsiqarku(pc0.zoijcleaow notification) {
        Context contextRequireContext = requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        new xa0.draadjrbmk.iobyxmoadg(contextRequireContext, Boolean.TRUE, null, 4, null).zoijcleaow(new xa0.wflxmlrfwp(notification.gxszxtbevo(), notification.zoijcleaow(), notification.eablkybsjg())).iobyxmoadg().show();
    }

    private final nc0.btonecajqb sopmlzcsov() {
        return (nc0.btonecajqb) this.adapter.getValue();
    }

    private final void ulzqkzuiru(String promoCode) {
        Context contextRequireContext = requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        c60.zoijcleaow.zoijcleaow(contextRequireContext, null, promoCode, 1, null);
    }

    private final void vipkmwdibw(ru.myspar.legacy.presentation.screen.notification.draadjrbmk state) {
        ComposeView clLoading = jlmebxxoox().f65407zoijcleaow;
        zdlpuopuiu.dxjokdxxww(clLoading, "clLoading");
        e50.wkgbmnqykc.nufgyqmvbu(clLoading, state.eablkybsjg());
        sopmlzcsov().wkgbmnqykc(state.ppxfxbqfkf());
        ViewPager2 viewPager = jlmebxxoox().f65403gxszxtbevo;
        zdlpuopuiu.dxjokdxxww(viewPager, "viewPager");
        viewPager.setVisibility(!state.wkgbmnqykc() ? 0 : 8);
        if (!state.wkgbmnqykc()) {
            FrameLayout flRoot = jlmebxxoox().f65406wkgbmnqykc.f65565zoijcleaow;
            zdlpuopuiu.dxjokdxxww(flRoot, "flRoot");
            flRoot.setVisibility(8);
        } else {
            int i13 = state.gxszxtbevo() ? pm.dxjokdxxww.title_notification_unauthorized_warning : pm.dxjokdxxww.title_notification_empty_warning;
            FrameLayout flRoot2 = jlmebxxoox().f65406wkgbmnqykc.f65565zoijcleaow;
            zdlpuopuiu.dxjokdxxww(flRoot2, "flRoot");
            flRoot2.setVisibility(0);
            jlmebxxoox().f65406wkgbmnqykc.f65564ppxfxbqfkf.setText(getString(i13));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object xrmfcynszj(NotificationFragment notificationFragment, wflxmlrfwp wflxmlrfwpVar, lg.gxszxtbevo gxszxtbevoVar) {
        notificationFragment.jhduphickx(wflxmlrfwpVar);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public final iobyxmoadg crxdokpmqz() {
        iobyxmoadg iobyxmoadgVar = this.assistedFactory;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("assistedFactory");
        return null;
    }

    @Override // ru.myspar.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        jlmebxxoox().f65403gxszxtbevo.agtfadlqog(this.viewPagerOnPageChangeCallback);
        jlmebxxoox().f65403gxszxtbevo.setAdapter(null);
        super.onDestroyView();
    }

    @Override // ru.myspar.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        zdlpuopuiu.btonecajqb(view, "view");
        super.onViewCreated(view, savedInstanceState);
        cdpycssgdh cdpycssgdhVarJlmebxxoox = jlmebxxoox();
        ComposeView cvActionBar = cdpycssgdhVarJlmebxxoox.f65405ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(cvActionBar, "cvActionBar");
        String string = getString(pm.dxjokdxxww.title_notifications);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        gt.iobyxmoadg.zoijcleaow(cvActionBar, null, string, null, false, new tg.iobyxmoadg() { // from class: ru.myspar.legacy.presentation.screen.notification.wkgbmnqykc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return NotificationFragment.ikoacuggdj(this.f89339zdlpuopuiu);
            }
        }, null, null, 109, null);
        cdpycssgdhVarJlmebxxoox.f65403gxszxtbevo.setAdapter(sopmlzcsov());
        cdpycssgdhVarJlmebxxoox.f65403gxszxtbevo.setUserInputEnabled(false);
        cdpycssgdhVarJlmebxxoox.f65403gxszxtbevo.lqeggnwhkg(this.viewPagerOnPageChangeCallback);
        fe0.iobyxmoadg.iobyxmoadg(new com.google.android.material.tabs.wkgbmnqykc(cdpycssgdhVarJlmebxxoox.f65402eablkybsjg, cdpycssgdhVarJlmebxxoox.f65403gxszxtbevo, new com.google.android.material.tabs.wkgbmnqykc.zoijcleaow() { // from class: ru.myspar.legacy.presentation.screen.notification.eablkybsjg
            @Override // com.google.android.material.tabs.wkgbmnqykc.zoijcleaow
            public final void iobyxmoadg(TabLayout.eablkybsjg eablkybsjgVar, int i13) {
                NotificationFragment.okpsazkaxt(this.f89329iobyxmoadg, eablkybsjgVar, i13);
            }
        }), cdpycssgdhVarJlmebxxoox);
        androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = androidx.lifecycle.gtknphoqwx.zoijcleaow.STARTED;
        androidx.lifecycle.vdvldrhtss viewLifecycleOwner = getViewLifecycleOwner();
        zdlpuopuiu.dxjokdxxww(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(viewLifecycleOwner), null, null, new ppxfxbqfkf(this, zoijcleaowVar, null, this), 3, null);
        androidx.lifecycle.vdvldrhtss viewLifecycleOwner2 = getViewLifecycleOwner();
        zdlpuopuiu.dxjokdxxww(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(viewLifecycleOwner2), null, null, new wkgbmnqykc(this, zoijcleaowVar, null, this), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.core.base.mvvm.BaseMvvmFragment
    /* JADX INFO: renamed from: ribwqtqdhb, reason: merged with bridge method [inline-methods] */
    public agtfadlqog wwaezpbzkn() {
        return (agtfadlqog) this.viewModel.getValue();
    }
}
