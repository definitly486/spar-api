package ru.myspar.myspar.impl.presentation;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.stevsuqkhv;
import androidx.fragment.app.ylkuphrtab;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.ntlheqmsrt;
import androidx.lifecycle.ribwqtqdhb;
import gg.wwaezpbzkn;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.yadqdtsiqt;
import ru.myspar.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.core.domain.interactor.product_change.models.ChangeProductParams;
import ru.myspar.core.domain.models.comboset.ComboSetProduct;
import ru.myspar.domain.feature.comboset.buildyourcombo.strore.BuildYourComboDialogArgs;
import ru.myspar.dynamic_qr.api.model.DynamicQrCodeArgs;
import ru.myspar.legacy.presentation.dialogs.comboset.buildyourcombo.BuildYourComboDialogFragment;
import ru.myspar.legacy.presentation.dialogs.iqos.IqosAgreementsDialogFragment;
import ru.myspar.story.api.model.StoryPayload;
import yfnezrywwk.mbcevpiqjq;
import yfnezrywwk.sopmlzcsov;
import yh0.cqumvgiudr;
import yh0.esjtqupxsv;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001oB\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0004J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\t2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\tH\u0002¢\u0006\u0004\b%\u0010\u0004J\u000f\u0010&\u001a\u00020\tH\u0002¢\u0006\u0004\b&\u0010\u0004J\u0017\u0010)\u001a\u00020\t2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010J\u001a\u00020C8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010R\u001a\u00020K8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010Z\u001a\u00020S8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010b\u001a\u00020[8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u001b\u0010g\u001a\u00020\u00028TX\u0094\u0084\u0002¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u001b\u0010m\u001a\u00020h8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l¨\u0006p"}, d2 = {"Lru/myspar/myspar/impl/presentation/MySparFragment;", "Lru/myspar/core/base/mvvm/BaseMvvmFragment;", "Lru/myspar/myspar/impl/presentation/jyumaefscl;", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lgg/wwaezpbzkn;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lru/myspar/myspar/impl/presentation/zdlpuopuiu;", "uiLabel", "Lkotlin/Function0;", "onScrollToFirstPosition", "ikoacuggdj", "(Lru/myspar/myspar/impl/presentation/zdlpuopuiu;Ltg/iobyxmoadg;)V", "oipsdeybqn", "Lru/myspar/myspar/impl/presentation/jyumaefscl$iobyxmoadg;", AdRevenueConstants.SOURCE_KEY, "jztzpxfvev", "(Lru/myspar/myspar/impl/presentation/jyumaefscl$iobyxmoadg;)V", "", "isAddProduct", "Lru/myspar/core/domain/interactor/product_change/models/ChangeProductParams;", "params", "sflfametgt", "(ZLru/myspar/core/domain/interactor/product_change/models/ChangeProductParams;)V", "", "message", "metgxyhuhe", "(Lru/myspar/core/domain/interactor/product_change/models/ChangeProductParams;Ljava/lang/String;)V", "Lru/myspar/story/api/model/StoryPayload;", "args", "opjhrmiecq", "(Lru/myspar/story/api/model/StoryPayload;)V", "bfopjjpdmp", "czzsidtyhn", "Lru/myspar/domain/feature/comboset/buildyourcombo/strore/BuildYourComboDialogArgs;", "dialogArgs", "yfnezrywwk", "(Lru/myspar/domain/feature/comboset/buildyourcombo/strore/BuildYourComboDialogArgs;)V", "Lru/myspar/myspar/impl/presentation/iobyxmoadg;", "esjtqupxsv", "Lru/myspar/myspar/impl/presentation/iobyxmoadg;", "ntlheqmsrt", "()Lru/myspar/myspar/impl/presentation/iobyxmoadg;", "setAssistedFactory", "(Lru/myspar/myspar/impl/presentation/iobyxmoadg;)V", "assistedFactory", "Lfs/iobyxmoadg;", "lereixgezr", "Lfs/iobyxmoadg;", "getCitiesFeatureApi", "()Lfs/iobyxmoadg;", "setCitiesFeatureApi", "(Lfs/iobyxmoadg;)V", "citiesFeatureApi", "Lf70/iobyxmoadg;", "pmvmpeiblj", "Lf70/iobyxmoadg;", "crxdokpmqz", "()Lf70/iobyxmoadg;", "setDialogManager", "(Lf70/iobyxmoadg;)V", "dialogManager", "Lp80/iobyxmoadg;", "zynmafqrjb", "Lp80/iobyxmoadg;", "jlmebxxoox", "()Lp80/iobyxmoadg;", "setDynamicQrFeatureApi", "(Lp80/iobyxmoadg;)V", "dynamicQrFeatureApi", "Lr72/iobyxmoadg;", "istkbnxepw", "Lr72/iobyxmoadg;", "vipkmwdibw", "()Lr72/iobyxmoadg;", "setStoryFeatureApi", "(Lr72/iobyxmoadg;)V", "storyFeatureApi", "Lm70/ppxfxbqfkf;", "cdpycssgdh", "Lm70/ppxfxbqfkf;", "sopmlzcsov", "()Lm70/ppxfxbqfkf;", "setDebugPanel", "(Lm70/ppxfxbqfkf;)V", "debugPanel", "Lq40/iobyxmoadg;", "yadqdtsiqt", "Lq40/iobyxmoadg;", "ribwqtqdhb", "()Lq40/iobyxmoadg;", "setSnackbarManager", "(Lq40/iobyxmoadg;)V", "snackbarManager", "iozdgvuglv", "Lgg/gtknphoqwx;", "jhduphickx", "()Lru/myspar/myspar/impl/presentation/jyumaefscl;", "viewModel", "Lb60/iobyxmoadg;", "lmojexxdyd", "Lys/ppxfxbqfkf;", "ulzqkzuiru", "()Lb60/iobyxmoadg;", "binding", "wwaezpbzkn", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MySparFragment extends Hilt_MySparFragment<jyumaefscl> {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata */
    public m70.ppxfxbqfkf debugPanel;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    public iobyxmoadg assistedFactory;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata */
    private final gg.gtknphoqwx viewModel;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    public r72.iobyxmoadg storyFeatureApi;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    public fs.iobyxmoadg citiesFeatureApi;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata */
    private final ys.ppxfxbqfkf binding;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    public f70.iobyxmoadg dialogManager;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata */
    public q40.iobyxmoadg snackbarManager;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    public p80.iobyxmoadg dynamicQrFeatureApi;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f90505ylkuphrtab = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(MySparFragment.class, "binding", "getBinding()Lru/myspar/core/ui/databinding/ComposeViewBinding;", 0))};

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    public static final int f90503pkzmftpjix = 8;

    public static final class eablkybsjg extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f90515zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f90515zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f90515zdlpuopuiu.invoke();
        }
    }

    public static final class gxszxtbevo extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f90516zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f90516zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f90516zdlpuopuiu).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: ru.myspar.myspar.impl.presentation.MySparFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final MySparFragment iobyxmoadg() {
            return (MySparFragment) b40.iobyxmoadg.zoijcleaow(new MySparFragment(), null, false, 1, null);
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f90517yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f90518zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(tg.iobyxmoadg iobyxmoadgVar, gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f90518zdlpuopuiu = iobyxmoadgVar;
            this.f90517yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f90518zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f90517yggfygwlhe);
            androidx.lifecycle.dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof androidx.lifecycle.dxjokdxxww ? (androidx.lifecycle.dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    public static final class nufgyqmvbu implements crxdokpmqz.ppxfxbqfkf {
        public nufgyqmvbu() {
        }

        @Override // androidx.lifecycle.crxdokpmqz.ppxfxbqfkf
        public ntlheqmsrt create(Class modelClass) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(modelClass, "modelClass");
            jyumaefscl jyumaefsclVarIobyxmoadg = MySparFragment.this.ntlheqmsrt().iobyxmoadg();
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(jyumaefsclVarIobyxmoadg, "null cannot be cast to non-null type T of ru.myspar.legacy.presentation.ext.ViewModelExtKt.viewModelProviderFactoryOf.<no name provided>.create");
            return jyumaefsclVarIobyxmoadg;
        }
    }

    static final class ppxfxbqfkf implements tg.rgvfuqvkyq {

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ mbcevpiqjq f90521yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f90522zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(mbcevpiqjq mbcevpiqjqVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f90521yggfygwlhe = mbcevpiqjqVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new iobyxmoadg(this.f90521yggfygwlhe, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f90522zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    mbcevpiqjq mbcevpiqjqVar = this.f90521yggfygwlhe;
                    this.f90522zdlpuopuiu = 1;
                    if (mbcevpiqjq.oxmwwwfdhm(mbcevpiqjqVar, 0, 0, this, 2, null) == objGxszxtbevo) {
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

        static final class zoijcleaow implements tg.vdvldrhtss {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ MySparFragment f90523yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ mbcevpiqjq f90524zdlpuopuiu;

            /* synthetic */ class iobyxmoadg extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
                iobyxmoadg(Object obj) {
                    super(1, obj, jyumaefscl.class, "onEvent", "onEvent(Lru/myspar/myspar/impl/presentation/MySparView$Event;)V", 0);
                }

                @Override // tg.draadjrbmk
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    iobyxmoadg((oxmwwwfdhm) obj);
                    return wwaezpbzkn.f37140iobyxmoadg;
                }

                public final void iobyxmoadg(oxmwwwfdhm p13) {
                    kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
                    ((jyumaefscl) this.receiver).eslsurpljm(p13);
                }
            }

            zoijcleaow(mbcevpiqjq mbcevpiqjqVar, MySparFragment mySparFragment) {
                this.f90524zdlpuopuiu = mbcevpiqjqVar;
                this.f90523yggfygwlhe = mySparFragment;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final wwaezpbzkn btonecajqb(MySparFragment mySparFragment) {
                mySparFragment.wwaezpbzkn().eslsurpljm(oxmwwwfdhm.rgvfuqvkyq.f90814iobyxmoadg);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final wwaezpbzkn gtknphoqwx(MySparFragment mySparFragment) {
                if (xx.iobyxmoadg.f123319iobyxmoadg.iozdgvuglv()) {
                    mySparFragment.sopmlzcsov().dxjokdxxww();
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final pj.cllcsxoeiz lqeggnwhkg(MySparFragment mySparFragment) {
                androidx.lifecycle.vdvldrhtss viewLifecycleOwner = mySparFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                return androidx.lifecycle.oxmwwwfdhm.iobyxmoadg(viewLifecycleOwner);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final wwaezpbzkn wflxmlrfwp(MySparFragment mySparFragment) {
                mySparFragment.wwaezpbzkn().eslsurpljm(oxmwwwfdhm.cdpycssgdh.f90780iobyxmoadg);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void gxszxtbevo(kcexrzcfyt model, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(model, "model");
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(194150505, i13, -1, "ru.myspar.myspar.impl.presentation.MySparFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous> (MySparFragment.kt:105)");
                }
                mbcevpiqjq mbcevpiqjqVar = this.f90524zdlpuopuiu;
                draadjrbmkVar.sopmlzcsov(-690667565);
                boolean zLmojexxdyd = draadjrbmkVar.lmojexxdyd(this.f90523yggfygwlhe);
                final MySparFragment mySparFragment = this.f90523yggfygwlhe;
                Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
                if (zLmojexxdyd || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new tg.iobyxmoadg() { // from class: ru.myspar.myspar.impl.presentation.gtknphoqwx
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return MySparFragment.ppxfxbqfkf.zoijcleaow.lqeggnwhkg(mySparFragment);
                        }
                    };
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
                }
                tg.iobyxmoadg iobyxmoadgVar = (tg.iobyxmoadg) objYadqdtsiqt;
                draadjrbmkVar.stevsuqkhv();
                jyumaefscl jyumaefsclVarWwaezpbzkn = this.f90523yggfygwlhe.wwaezpbzkn();
                draadjrbmkVar.sopmlzcsov(-690665120);
                boolean zLmojexxdyd2 = draadjrbmkVar.lmojexxdyd(jyumaefsclVarWwaezpbzkn);
                Object objYadqdtsiqt2 = draadjrbmkVar.yadqdtsiqt();
                if (zLmojexxdyd2 || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt2 = new iobyxmoadg(jyumaefsclVarWwaezpbzkn);
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt2);
                }
                draadjrbmkVar.stevsuqkhv();
                esjtqupxsv esjtqupxsvVarIwizpuwonk = cqumvgiudr.iwizpuwonk(iobyxmoadgVar, (tg.draadjrbmk) ((ah.lqeggnwhkg) objYadqdtsiqt2));
                draadjrbmkVar.sopmlzcsov(-690662408);
                boolean zLmojexxdyd3 = draadjrbmkVar.lmojexxdyd(this.f90523yggfygwlhe);
                final MySparFragment mySparFragment2 = this.f90523yggfygwlhe;
                Object objYadqdtsiqt3 = draadjrbmkVar.yadqdtsiqt();
                if (zLmojexxdyd3 || objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: ru.myspar.myspar.impl.presentation.draadjrbmk
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return MySparFragment.ppxfxbqfkf.zoijcleaow.btonecajqb(mySparFragment2);
                        }
                    };
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt3);
                }
                tg.iobyxmoadg iobyxmoadgVar2 = (tg.iobyxmoadg) objYadqdtsiqt3;
                draadjrbmkVar.stevsuqkhv();
                draadjrbmkVar.sopmlzcsov(-690659537);
                boolean zLmojexxdyd4 = draadjrbmkVar.lmojexxdyd(this.f90523yggfygwlhe);
                final MySparFragment mySparFragment3 = this.f90523yggfygwlhe;
                Object objYadqdtsiqt4 = draadjrbmkVar.yadqdtsiqt();
                if (zLmojexxdyd4 || objYadqdtsiqt4 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: ru.myspar.myspar.impl.presentation.wflxmlrfwp
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return MySparFragment.ppxfxbqfkf.zoijcleaow.gtknphoqwx(mySparFragment3);
                        }
                    };
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt4);
                }
                tg.iobyxmoadg iobyxmoadgVar3 = (tg.iobyxmoadg) objYadqdtsiqt4;
                draadjrbmkVar.stevsuqkhv();
                draadjrbmkVar.sopmlzcsov(-690653294);
                boolean zLmojexxdyd5 = draadjrbmkVar.lmojexxdyd(this.f90523yggfygwlhe);
                final MySparFragment mySparFragment4 = this.f90523yggfygwlhe;
                Object objYadqdtsiqt5 = draadjrbmkVar.yadqdtsiqt();
                if (zLmojexxdyd5 || objYadqdtsiqt5 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt5 = new tg.iobyxmoadg() { // from class: ru.myspar.myspar.impl.presentation.agtfadlqog
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return MySparFragment.ppxfxbqfkf.zoijcleaow.wflxmlrfwp(mySparFragment4);
                        }
                    };
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt5);
                }
                draadjrbmkVar.stevsuqkhv();
                bh0.ojitshcjhn.eablkybsjg(model, mbcevpiqjqVar, esjtqupxsvVarIwizpuwonk, iobyxmoadgVar2, iobyxmoadgVar3, (tg.iobyxmoadg) objYadqdtsiqt5, draadjrbmkVar, i13 & 14, 0);
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
            }

            @Override // tg.vdvldrhtss
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                gxszxtbevo((kcexrzcfyt) obj, (androidx.compose.runtime.draadjrbmk) obj2, ((Number) obj3).intValue());
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        ppxfxbqfkf() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn eablkybsjg(MySparFragment mySparFragment, final pj.cllcsxoeiz cllcsxoeizVar, final mbcevpiqjq mbcevpiqjqVar, zdlpuopuiu label) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(label, "label");
            mySparFragment.ikoacuggdj(label, new tg.iobyxmoadg() { // from class: ru.myspar.myspar.impl.presentation.btonecajqb
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return MySparFragment.ppxfxbqfkf.gxszxtbevo(cllcsxoeizVar, mbcevpiqjqVar);
                }
            });
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn gxszxtbevo(pj.cllcsxoeiz cllcsxoeizVar, mbcevpiqjq mbcevpiqjqVar) {
            pj.gtknphoqwx.wkgbmnqykc(cllcsxoeizVar, null, null, new iobyxmoadg(mbcevpiqjqVar, null), 3, null);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            ppxfxbqfkf((androidx.compose.runtime.draadjrbmk) obj, ((Number) obj2).intValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void ppxfxbqfkf(androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
            if ((i13 & 3) == 2 && draadjrbmkVar.gtknphoqwx()) {
                draadjrbmkVar.hkdspvbjdz();
                return;
            }
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-476660510, i13, -1, "ru.myspar.myspar.impl.presentation.MySparFragment.onViewCreated.<anonymous>.<anonymous> (MySparFragment.kt:92)");
            }
            final mbcevpiqjq mbcevpiqjqVarPpxfxbqfkf = sopmlzcsov.ppxfxbqfkf(0, 0, draadjrbmkVar, 0, 3);
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            androidx.compose.runtime.draadjrbmk.iobyxmoadg iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
            if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt = androidx.compose.runtime.jlmebxxoox.dxjokdxxww(lg.gtknphoqwx.f62507zdlpuopuiu, draadjrbmkVar);
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            final pj.cllcsxoeiz cllcsxoeizVar = (pj.cllcsxoeiz) objYadqdtsiqt;
            jyumaefscl jyumaefsclVarWwaezpbzkn = MySparFragment.this.wwaezpbzkn();
            draadjrbmkVar.sopmlzcsov(368403909);
            boolean zLmojexxdyd = draadjrbmkVar.lmojexxdyd(MySparFragment.this) | draadjrbmkVar.lmojexxdyd(cllcsxoeizVar) | draadjrbmkVar.ulzqkzuiru(mbcevpiqjqVarPpxfxbqfkf);
            final MySparFragment mySparFragment = MySparFragment.this;
            Object objYadqdtsiqt2 = draadjrbmkVar.yadqdtsiqt();
            if (zLmojexxdyd || objYadqdtsiqt2 == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt2 = new tg.draadjrbmk() { // from class: ru.myspar.myspar.impl.presentation.dxjokdxxww
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return MySparFragment.ppxfxbqfkf.eablkybsjg(mySparFragment, cllcsxoeizVar, mbcevpiqjqVarPpxfxbqfkf, (zdlpuopuiu) obj);
                    }
                };
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt2);
            }
            draadjrbmkVar.stevsuqkhv();
            vx.ppxfxbqfkf.zoijcleaow(jyumaefsclVarWwaezpbzkn, (tg.draadjrbmk) objYadqdtsiqt2, ezmngbhpjk.nufgyqmvbu.eablkybsjg(194150505, true, new zoijcleaow(mbcevpiqjqVarPpxfxbqfkf, MySparFragment.this), draadjrbmkVar, 54), draadjrbmkVar, 384);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
    }

    public static final class wkgbmnqykc extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f90525zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(Fragment fragment) {
            super(0);
            this.f90525zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f90525zdlpuopuiu;
        }
    }

    /* synthetic */ class zoijcleaow extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f90526zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1, b60.iobyxmoadg.class, "bind", "bind(Landroid/view/View;)Lru/myspar/core/ui/databinding/ComposeViewBinding;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final b60.iobyxmoadg invoke(View p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return b60.iobyxmoadg.iobyxmoadg(p13);
        }
    }

    public MySparFragment() {
        super(s40.dxjokdxxww.compose_view);
        tg.iobyxmoadg iobyxmoadgVar = new tg.iobyxmoadg() { // from class: ru.myspar.myspar.impl.presentation.ppxfxbqfkf
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return MySparFragment.iyctptxqzt(this.f90825zdlpuopuiu);
            }
        };
        gg.gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(gg.ojitshcjhn.NONE, new eablkybsjg(new wkgbmnqykc(this)));
        this.viewModel = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(jyumaefscl.class), new gxszxtbevo(gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(null, gtknphoqwxVarIobyxmoadg), iobyxmoadgVar);
        this.binding = ys.iobyxmoadg.zoijcleaow(this, zoijcleaow.f90526zdlpuopuiu);
    }

    private final void bfopjjpdmp() {
        f70.zoijcleaow.ppxfxbqfkf(jlmebxxoox().iobyxmoadg(new DynamicQrCodeArgs(false)), crxdokpmqz(), g70.eablkybsjg.iobyxmoadg("MY_SPAR_SCREEN_KEY"));
    }

    private final void czzsidtyhn() {
        androidx.fragment.app.oxmwwwfdhm oxmwwwfdhmVarRequireActivity = requireActivity();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(oxmwwwfdhmVarRequireActivity, "requireActivity(...)");
        f70.zoijcleaow.zoijcleaow(new ya0.wkgbmnqykc(oxmwwwfdhmVarRequireActivity, new tg.iobyxmoadg() { // from class: ru.myspar.myspar.impl.presentation.wkgbmnqykc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return MySparFragment.uwvvkdfqfp(this.f90837zdlpuopuiu);
            }
        }, null, 4, null), crxdokpmqz(), g70.eablkybsjg.iobyxmoadg("MY_SPAR_SCREEN_KEY"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ikoacuggdj(zdlpuopuiu uiLabel, tg.iobyxmoadg onScrollToFirstPosition) {
        if (uiLabel instanceof zdlpuopuiu.btonecajqb) {
            bfopjjpdmp();
            return;
        }
        if (uiLabel instanceof zdlpuopuiu.gtknphoqwx) {
            opjhrmiecq(((zdlpuopuiu.gtknphoqwx) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof zdlpuopuiu.nufgyqmvbu) {
            r40.iobyxmoadg.btonecajqb(ribwqtqdhb(), ((zdlpuopuiu.nufgyqmvbu) uiLabel).iobyxmoadg(), null, null, 6, null);
            return;
        }
        if (uiLabel instanceof zdlpuopuiu.dxjokdxxww) {
            oipsdeybqn();
            return;
        }
        if (uiLabel instanceof zdlpuopuiu.lqeggnwhkg) {
            zdlpuopuiu.lqeggnwhkg lqeggnwhkgVar = (zdlpuopuiu.lqeggnwhkg) uiLabel;
            sflfametgt(lqeggnwhkgVar.zoijcleaow(), lqeggnwhkgVar.iobyxmoadg());
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(uiLabel, zdlpuopuiu.wkgbmnqykc.f90854iobyxmoadg)) {
            czzsidtyhn();
            return;
        }
        if (uiLabel instanceof zdlpuopuiu.eablkybsjg) {
            yfnezrywwk(((zdlpuopuiu.eablkybsjg) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof zdlpuopuiu.zoijcleaow) {
            jztzpxfvev(((zdlpuopuiu.zoijcleaow) uiLabel).iobyxmoadg());
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(uiLabel, zdlpuopuiu.iobyxmoadg.f90848iobyxmoadg)) {
            onScrollToFirstPosition.invoke();
            return;
        }
        if (uiLabel instanceof zdlpuopuiu.ppxfxbqfkf) {
            zdlpuopuiu.ppxfxbqfkf ppxfxbqfkfVar = (zdlpuopuiu.ppxfxbqfkf) uiLabel;
            metgxyhuhe(ppxfxbqfkfVar.zoijcleaow(), ppxfxbqfkfVar.iobyxmoadg());
            return;
        }
        if (!(uiLabel instanceof zdlpuopuiu.gxszxtbevo)) {
            if (!(uiLabel instanceof zdlpuopuiu.draadjrbmk)) {
                throw new NoWhenBranchMatchedException();
            }
            r40.iobyxmoadg.btonecajqb(ribwqtqdhb(), ((zdlpuopuiu.draadjrbmk) uiLabel).iobyxmoadg(), null, null, 6, null);
        } else {
            zdlpuopuiu.gxszxtbevo gxszxtbevoVar = (zdlpuopuiu.gxszxtbevo) uiLabel;
            HintUiModel hintUiModelZoijcleaow = gxszxtbevoVar.zoijcleaow();
            HintDialogAnalyticsInfo hintDialogAnalyticsInfoIobyxmoadg = gxszxtbevoVar.iobyxmoadg();
            androidx.fragment.app.oxmwwwfdhm oxmwwwfdhmVarRequireActivity = requireActivity();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(oxmwwwfdhmVarRequireActivity, "requireActivity(...)");
            st.zoijcleaow.iobyxmoadg(hintUiModelZoijcleaow, hintDialogAnalyticsInfoIobyxmoadg, oxmwwwfdhmVarRequireActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final crxdokpmqz.ppxfxbqfkf iyctptxqzt(MySparFragment mySparFragment) {
        return mySparFragment.new nufgyqmvbu();
    }

    private final void jztzpxfvev(final jyumaefscl.iobyxmoadg source) {
        ee0.zoijcleaow zoijcleaowVar = ee0.zoijcleaow.f31209iobyxmoadg;
        androidx.fragment.app.oxmwwwfdhm oxmwwwfdhmVarRequireActivity = requireActivity();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(oxmwwwfdhmVarRequireActivity, "requireActivity(...)");
        f70.zoijcleaow.zoijcleaow(ee0.zoijcleaow.zoijcleaow(zoijcleaowVar, oxmwwwfdhmVarRequireActivity, new tg.iobyxmoadg() { // from class: ru.myspar.myspar.impl.presentation.eablkybsjg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return MySparFragment.xrmfcynszj(this.f90535zdlpuopuiu, source);
            }
        }, null, null, rx.ppxfxbqfkf.VERTICAL, 12, null), crxdokpmqz(), g70.eablkybsjg.iobyxmoadg("MY_SPAR_SCREEN_KEY"));
    }

    private final void metgxyhuhe(final ChangeProductParams params, String message) {
        ee0.zoijcleaow zoijcleaowVar = ee0.zoijcleaow.f31209iobyxmoadg;
        androidx.fragment.app.oxmwwwfdhm oxmwwwfdhmVarRequireActivity = requireActivity();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(oxmwwwfdhmVarRequireActivity, "requireActivity(...)");
        f70.zoijcleaow.zoijcleaow(zoijcleaowVar.ppxfxbqfkf(oxmwwwfdhmVarRequireActivity, message, new tg.iobyxmoadg() { // from class: ru.myspar.myspar.impl.presentation.gxszxtbevo
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return MySparFragment.rlfsiqarku(this.f90538zdlpuopuiu, params);
            }
        }, null), crxdokpmqz(), g70.eablkybsjg.iobyxmoadg("MY_SPAR_SCREEN_KEY"));
    }

    private final void oipsdeybqn() {
        r40.iobyxmoadg.ppxfxbqfkf(ribwqtqdhb(), pm.dxjokdxxww.product_not_available, null, ss.wkgbmnqykc.gxszxtbevo.NonFatal, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void okpsazkaxt(MySparFragment mySparFragment, String str, Bundle bundle) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<unused var>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bundle, "<unused var>");
        mySparFragment.wwaezpbzkn().eslsurpljm(oxmwwwfdhm.gtknphoqwx.f90789iobyxmoadg);
    }

    private final void opjhrmiecq(StoryPayload args) {
        f70.zoijcleaow.wkgbmnqykc(vipkmwdibw().iobyxmoadg(args), crxdokpmqz(), g70.eablkybsjg.iobyxmoadg("MY_SPAR_SCREEN_KEY"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn rlfsiqarku(MySparFragment mySparFragment, ChangeProductParams changeProductParams) {
        mySparFragment.wwaezpbzkn().eslsurpljm(new oxmwwwfdhm.zoijcleaow(changeProductParams));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void sflfametgt(final boolean isAddProduct, final ChangeProductParams params) {
        f70.zoijcleaow.wkgbmnqykc(IqosAgreementsDialogFragment.INSTANCE.iobyxmoadg().lmojexxdyd(new tg.iobyxmoadg() { // from class: ru.myspar.myspar.impl.presentation.nufgyqmvbu
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return MySparFragment.zfvoamnweg(isAddProduct, this, params);
            }
        }), crxdokpmqz(), g70.eablkybsjg.iobyxmoadg("MY_SPAR_SCREEN_KEY"));
    }

    private final b60.iobyxmoadg ulzqkzuiru() {
        return (b60.iobyxmoadg) this.binding.iobyxmoadg(this, f90505ylkuphrtab[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn uwvvkdfqfp(MySparFragment mySparFragment) {
        mySparFragment.wwaezpbzkn().eslsurpljm(oxmwwwfdhm.vdvldrhtss.f90815iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn xrmfcynszj(MySparFragment mySparFragment, jyumaefscl.iobyxmoadg iobyxmoadgVar) {
        mySparFragment.wwaezpbzkn().eslsurpljm(new oxmwwwfdhm.iobyxmoadg(iobyxmoadgVar));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ydmasvzmpa(MySparFragment mySparFragment, ComboSetProduct productFirst, ComboSetProduct productSecond) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productFirst, "productFirst");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productSecond, "productSecond");
        mySparFragment.wwaezpbzkn().eslsurpljm(new oxmwwwfdhm.lqeggnwhkg(productFirst, productSecond));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void yfnezrywwk(BuildYourComboDialogArgs dialogArgs) {
        f70.zoijcleaow.ppxfxbqfkf(BuildYourComboDialogFragment.INSTANCE.iobyxmoadg(dialogArgs).bfopjjpdmp(new tg.rgvfuqvkyq() { // from class: ru.myspar.myspar.impl.presentation.lqeggnwhkg
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return MySparFragment.ydmasvzmpa(this.f90773zdlpuopuiu, (ComboSetProduct) obj, (ComboSetProduct) obj2);
            }
        }), crxdokpmqz(), g70.eablkybsjg.iobyxmoadg("MY_SPAR_SCREEN_KEY"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn zfvoamnweg(boolean z13, MySparFragment mySparFragment, ChangeProductParams changeProductParams) {
        if (z13) {
            mySparFragment.wwaezpbzkn().eslsurpljm(new oxmwwwfdhm.eablkybsjg(changeProductParams));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public final f70.iobyxmoadg crxdokpmqz() {
        f70.iobyxmoadg iobyxmoadgVar = this.dialogManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("dialogManager");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.core.base.mvvm.BaseMvvmFragment
    /* JADX INFO: renamed from: jhduphickx, reason: merged with bridge method [inline-methods] */
    public jyumaefscl wwaezpbzkn() {
        return (jyumaefscl) this.viewModel.getValue();
    }

    public final p80.iobyxmoadg jlmebxxoox() {
        p80.iobyxmoadg iobyxmoadgVar = this.dynamicQrFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("dynamicQrFeatureApi");
        return null;
    }

    public final iobyxmoadg ntlheqmsrt() {
        iobyxmoadg iobyxmoadgVar = this.assistedFactory;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("assistedFactory");
        return null;
    }

    @Override // ru.myspar.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(view, "view");
        super.onViewCreated(view, savedInstanceState);
        wwaezpbzkn().eslsurpljm(oxmwwwfdhm.istkbnxepw.f90793iobyxmoadg);
        ulzqkzuiru().f15357zoijcleaow.setContent(ezmngbhpjk.nufgyqmvbu.ppxfxbqfkf(-476660510, true, new ppxfxbqfkf()));
        getParentFragmentManager().R("special_banner_evropolis_shown_request_key", getViewLifecycleOwner(), new ylkuphrtab() { // from class: ru.myspar.myspar.impl.presentation.zoijcleaow
            @Override // androidx.fragment.app.ylkuphrtab
            public final void iobyxmoadg(String str, Bundle bundle) {
                MySparFragment.okpsazkaxt(this.f90856iobyxmoadg, str, bundle);
            }
        });
    }

    public final q40.iobyxmoadg ribwqtqdhb() {
        q40.iobyxmoadg iobyxmoadgVar = this.snackbarManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("snackbarManager");
        return null;
    }

    public final m70.ppxfxbqfkf sopmlzcsov() {
        m70.ppxfxbqfkf ppxfxbqfkfVar = this.debugPanel;
        if (ppxfxbqfkfVar != null) {
            return ppxfxbqfkfVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("debugPanel");
        return null;
    }

    public final r72.iobyxmoadg vipkmwdibw() {
        r72.iobyxmoadg iobyxmoadgVar = this.storyFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("storyFeatureApi");
        return null;
    }
}
