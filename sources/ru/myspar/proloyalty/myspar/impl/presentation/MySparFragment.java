package ru.myspar.proloyalty.myspar.impl.presentation;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.stevsuqkhv;
import androidx.fragment.app.ylkuphrtab;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.ntlheqmsrt;
import androidx.lifecycle.ribwqtqdhb;
import df1.cqumvgiudr;
import df1.iwizpuwonk;
import gg.wwaezpbzkn;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.yadqdtsiqt;
import ru.myspar.proloyalty.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.core.domain.interactor.product_change.models.ChangeProductParams;
import ru.myspar.proloyalty.core.domain.models.comboset.ComboSetProduct;
import ru.myspar.proloyalty.domain.feature.comboset.buildyourcombo.strore.BuildYourComboDialogArgs;
import ru.myspar.proloyalty.legacy.presentation.dialogs.comboset.buildyourcombo.BuildYourComboDialogFragment;
import ru.myspar.proloyalty.legacy.presentation.dialogs.iqos.IqosAgreementsDialogFragment;
import ru.myspar.proloyalty.story.api.model.StoryPayload;
import yfnezrywwk.mbcevpiqjq;
import yfnezrywwk.sopmlzcsov;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001uB\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\n\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\u0004J\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001e\u0010\u0004J\u0017\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J!\u0010'\u001a\u00020\b2\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b'\u0010(R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00108\u001a\u0002018\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010@\u001a\u0002098\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010H\u001a\u00020A8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010P\u001a\u00020I8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010X\u001a\u00020Q8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010`\u001a\u00020Y8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010h\u001a\u00020a8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\u001b\u0010m\u001a\u00020\u00028TX\u0094\u0084\u0002¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR\u001b\u0010s\u001a\u00020n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r¨\u0006v"}, d2 = {"Lru/myspar/proloyalty/myspar/impl/presentation/MySparFragment;", "Lru/myspar/proloyalty/core/base/mvvm/BaseMvvmFragment;", "Lru/myspar/proloyalty/myspar/impl/presentation/yggfygwlhe;", "<init>", "()V", "Lru/myspar/proloyalty/myspar/impl/presentation/kcexrzcfyt;", "uiLabel", "Lkotlin/Function0;", "Lgg/wwaezpbzkn;", "onScrollToFirstPosition", "jhduphickx", "(Lru/myspar/proloyalty/myspar/impl/presentation/kcexrzcfyt;Ltg/iobyxmoadg;)V", "ydmasvzmpa", "Lru/myspar/proloyalty/myspar/impl/presentation/yggfygwlhe$iobyxmoadg;", AdRevenueConstants.SOURCE_KEY, "okpsazkaxt", "(Lru/myspar/proloyalty/myspar/impl/presentation/yggfygwlhe$iobyxmoadg;)V", "", "isAddProduct", "Lru/myspar/proloyalty/core/domain/interactor/product_change/models/ChangeProductParams;", "params", "uwvvkdfqfp", "(ZLru/myspar/proloyalty/core/domain/interactor/product_change/models/ChangeProductParams;)V", "isAuto", "sflfametgt", "(Z)V", "Lru/myspar/proloyalty/story/api/model/StoryPayload;", "args", "zfvoamnweg", "(Lru/myspar/proloyalty/story/api/model/StoryPayload;)V", "xrmfcynszj", "Lru/myspar/proloyalty/domain/feature/comboset/buildyourcombo/strore/BuildYourComboDialogArgs;", "dialogArgs", "rlfsiqarku", "(Lru/myspar/proloyalty/domain/feature/comboset/buildyourcombo/strore/BuildYourComboDialogArgs;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lru/myspar/proloyalty/myspar/impl/presentation/iobyxmoadg;", "esjtqupxsv", "Lru/myspar/proloyalty/myspar/impl/presentation/iobyxmoadg;", "mbcevpiqjq", "()Lru/myspar/proloyalty/myspar/impl/presentation/iobyxmoadg;", "setAssistedFactory", "(Lru/myspar/proloyalty/myspar/impl/presentation/iobyxmoadg;)V", "assistedFactory", "Lvq0/iobyxmoadg;", "lereixgezr", "Lvq0/iobyxmoadg;", "getCitiesFeatureApi", "()Lvq0/iobyxmoadg;", "setCitiesFeatureApi", "(Lvq0/iobyxmoadg;)V", "citiesFeatureApi", "Lu51/iobyxmoadg;", "pmvmpeiblj", "Lu51/iobyxmoadg;", "sopmlzcsov", "()Lu51/iobyxmoadg;", "setDialogManager", "(Lu51/iobyxmoadg;)V", "dialogManager", "Ly61/iobyxmoadg;", "zynmafqrjb", "Ly61/iobyxmoadg;", "crxdokpmqz", "()Ly61/iobyxmoadg;", "setDynamicQrFeatureApi", "(Ly61/iobyxmoadg;)V", "dynamicQrFeatureApi", "Lkt1/iobyxmoadg;", "istkbnxepw", "Lkt1/iobyxmoadg;", "ribwqtqdhb", "()Lkt1/iobyxmoadg;", "setStoryFeatureApi", "(Lkt1/iobyxmoadg;)V", "storyFeatureApi", "Lan0/iobyxmoadg;", "cdpycssgdh", "Lan0/iobyxmoadg;", "getAuthFeatureApi", "()Lan0/iobyxmoadg;", "setAuthFeatureApi", "(Lan0/iobyxmoadg;)V", "authFeatureApi", "Lz21/iobyxmoadg;", "yadqdtsiqt", "Lz21/iobyxmoadg;", "jlmebxxoox", "()Lz21/iobyxmoadg;", "setSnackbarManager", "(Lz21/iobyxmoadg;)V", "snackbarManager", "La51/zoijcleaow;", "iozdgvuglv", "La51/zoijcleaow;", "ulzqkzuiru", "()La51/zoijcleaow;", "setDebugPanelFeatureObserver", "(La51/zoijcleaow;)V", "debugPanelFeatureObserver", "lmojexxdyd", "Lgg/gtknphoqwx;", "vipkmwdibw", "()Lru/myspar/proloyalty/myspar/impl/presentation/yggfygwlhe;", "viewModel", "Lo41/iobyxmoadg;", "wwaezpbzkn", "Lsr0/ppxfxbqfkf;", "ntlheqmsrt", "()Lo41/iobyxmoadg;", "binding", "ylkuphrtab", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MySparFragment extends Hilt_MySparFragment<yggfygwlhe> {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata */
    public an0.iobyxmoadg authFeatureApi;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    public iobyxmoadg assistedFactory;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata */
    public a51.zoijcleaow debugPanelFeatureObserver;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    public kt1.iobyxmoadg storyFeatureApi;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    public vq0.iobyxmoadg citiesFeatureApi;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata */
    private final gg.gtknphoqwx viewModel;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    public u51.iobyxmoadg dialogManager;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata */
    private final sr0.ppxfxbqfkf binding;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata */
    public z21.iobyxmoadg snackbarManager;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    public y61.iobyxmoadg dynamicQrFeatureApi;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f98114pkzmftpjix = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(MySparFragment.class, "binding", "getBinding()Lru/myspar/proloyalty/core/ui/databinding/ComposeViewProloyaltyBinding;", 0))};

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    public static final int f98113hcddaimhww = 8;

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f98126zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f98126zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f98126zdlpuopuiu.invoke();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f98127zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f98127zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f98127zdlpuopuiu).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.myspar.impl.presentation.MySparFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final MySparFragment iobyxmoadg() {
            return (MySparFragment) g21.iobyxmoadg.zoijcleaow(new MySparFragment(), null, false, 1, null);
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f98128yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f98129zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(tg.iobyxmoadg iobyxmoadgVar, gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f98129zdlpuopuiu = iobyxmoadgVar;
            this.f98128yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f98129zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f98128yggfygwlhe);
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
            yggfygwlhe yggfygwlheVarIobyxmoadg = MySparFragment.this.mbcevpiqjq().iobyxmoadg();
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(yggfygwlheVarIobyxmoadg, "null cannot be cast to non-null type T of ru.myspar.proloyalty.legacy.presentation.ext.ViewModelExtKt.viewModelProviderFactoryOf.<no name provided>.create");
            return yggfygwlheVarIobyxmoadg;
        }
    }

    static final class ppxfxbqfkf implements tg.rgvfuqvkyq {

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ mbcevpiqjq f98132yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f98133zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(mbcevpiqjq mbcevpiqjqVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f98132yggfygwlhe = mbcevpiqjqVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new iobyxmoadg(this.f98132yggfygwlhe, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f98133zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    mbcevpiqjq mbcevpiqjqVar = this.f98132yggfygwlhe;
                    this.f98133zdlpuopuiu = 1;
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
            final /* synthetic */ MySparFragment f98134yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ mbcevpiqjq f98135zdlpuopuiu;

            /* synthetic */ class iobyxmoadg extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
                iobyxmoadg(Object obj) {
                    super(1, obj, yggfygwlhe.class, "onEvent", "onEvent(Lru/myspar/proloyalty/myspar/impl/presentation/MySparView$Event;)V", 0);
                }

                @Override // tg.draadjrbmk
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    iobyxmoadg((vdvldrhtss) obj);
                    return wwaezpbzkn.f37140iobyxmoadg;
                }

                public final void iobyxmoadg(vdvldrhtss p13) {
                    kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
                    ((yggfygwlhe) this.receiver).eslsurpljm(p13);
                }
            }

            zoijcleaow(mbcevpiqjq mbcevpiqjqVar, MySparFragment mySparFragment) {
                this.f98135zdlpuopuiu = mbcevpiqjqVar;
                this.f98134yggfygwlhe = mySparFragment;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final wwaezpbzkn btonecajqb(MySparFragment mySparFragment) {
                mySparFragment.wwaezpbzkn().eslsurpljm(vdvldrhtss.ojitshcjhn.f98204iobyxmoadg);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final wwaezpbzkn gtknphoqwx(MySparFragment mySparFragment) {
                if (uw0.ppxfxbqfkf.f114521iobyxmoadg.kcexrzcfyt()) {
                    mySparFragment.ulzqkzuiru().btonecajqb();
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final wwaezpbzkn lqeggnwhkg(MySparFragment mySparFragment) {
                mySparFragment.wwaezpbzkn().eslsurpljm(vdvldrhtss.esjtqupxsv.f98189iobyxmoadg);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final wwaezpbzkn wflxmlrfwp(MySparFragment mySparFragment) {
                mySparFragment.wwaezpbzkn().eslsurpljm(vdvldrhtss.istkbnxepw.f98194iobyxmoadg);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void gxszxtbevo(oxmwwwfdhm model, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(model, "model");
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1137472617, i13, -1, "ru.myspar.proloyalty.myspar.impl.presentation.MySparFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous> (MySparFragment.kt:109)");
                }
                mbcevpiqjq mbcevpiqjqVar = this.f98135zdlpuopuiu;
                yggfygwlhe yggfygwlheVarWwaezpbzkn = this.f98134yggfygwlhe.wwaezpbzkn();
                draadjrbmkVar.sopmlzcsov(2027436829);
                boolean zLmojexxdyd = draadjrbmkVar.lmojexxdyd(yggfygwlheVarWwaezpbzkn);
                Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
                if (zLmojexxdyd || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new iobyxmoadg(yggfygwlheVarWwaezpbzkn);
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVar.stevsuqkhv();
                cqumvgiudr cqumvgiudrVarJyumaefscl = iwizpuwonk.jyumaefscl((tg.draadjrbmk) ((ah.lqeggnwhkg) objYadqdtsiqt));
                draadjrbmkVar.sopmlzcsov(2027438807);
                boolean zLmojexxdyd2 = draadjrbmkVar.lmojexxdyd(this.f98134yggfygwlhe);
                final MySparFragment mySparFragment = this.f98134yggfygwlhe;
                Object objYadqdtsiqt2 = draadjrbmkVar.yadqdtsiqt();
                if (zLmojexxdyd2 || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt2 = new tg.iobyxmoadg() { // from class: ru.myspar.proloyalty.myspar.impl.presentation.btonecajqb
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return MySparFragment.ppxfxbqfkf.zoijcleaow.lqeggnwhkg(mySparFragment);
                        }
                    };
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt2);
                }
                tg.iobyxmoadg iobyxmoadgVar = (tg.iobyxmoadg) objYadqdtsiqt2;
                draadjrbmkVar.stevsuqkhv();
                draadjrbmkVar.sopmlzcsov(2027441493);
                boolean zLmojexxdyd3 = draadjrbmkVar.lmojexxdyd(this.f98134yggfygwlhe);
                final MySparFragment mySparFragment2 = this.f98134yggfygwlhe;
                Object objYadqdtsiqt3 = draadjrbmkVar.yadqdtsiqt();
                if (zLmojexxdyd3 || objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt3 = new tg.iobyxmoadg() { // from class: ru.myspar.proloyalty.myspar.impl.presentation.gtknphoqwx
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return MySparFragment.ppxfxbqfkf.zoijcleaow.btonecajqb(mySparFragment2);
                        }
                    };
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt3);
                }
                tg.iobyxmoadg iobyxmoadgVar2 = (tg.iobyxmoadg) objYadqdtsiqt3;
                draadjrbmkVar.stevsuqkhv();
                draadjrbmkVar.sopmlzcsov(2027444335);
                boolean zLmojexxdyd4 = draadjrbmkVar.lmojexxdyd(this.f98134yggfygwlhe);
                final MySparFragment mySparFragment3 = this.f98134yggfygwlhe;
                Object objYadqdtsiqt4 = draadjrbmkVar.yadqdtsiqt();
                if (zLmojexxdyd4 || objYadqdtsiqt4 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt4 = new tg.iobyxmoadg() { // from class: ru.myspar.proloyalty.myspar.impl.presentation.draadjrbmk
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return MySparFragment.ppxfxbqfkf.zoijcleaow.gtknphoqwx(mySparFragment3);
                        }
                    };
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt4);
                }
                tg.iobyxmoadg iobyxmoadgVar3 = (tg.iobyxmoadg) objYadqdtsiqt4;
                draadjrbmkVar.stevsuqkhv();
                draadjrbmkVar.sopmlzcsov(2027449679);
                boolean zLmojexxdyd5 = draadjrbmkVar.lmojexxdyd(this.f98134yggfygwlhe);
                final MySparFragment mySparFragment4 = this.f98134yggfygwlhe;
                Object objYadqdtsiqt5 = draadjrbmkVar.yadqdtsiqt();
                if (zLmojexxdyd5 || objYadqdtsiqt5 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt5 = new tg.iobyxmoadg() { // from class: ru.myspar.proloyalty.myspar.impl.presentation.wflxmlrfwp
                        @Override // tg.iobyxmoadg
                        public final Object invoke() {
                            return MySparFragment.ppxfxbqfkf.zoijcleaow.wflxmlrfwp(mySparFragment4);
                        }
                    };
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt5);
                }
                draadjrbmkVar.stevsuqkhv();
                ge1.vdvldrhtss.gxszxtbevo(model, mbcevpiqjqVar, cqumvgiudrVarJyumaefscl, iobyxmoadgVar, iobyxmoadgVar2, iobyxmoadgVar3, (tg.iobyxmoadg) objYadqdtsiqt5, draadjrbmkVar, i13 & 14, 0);
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
            }

            @Override // tg.vdvldrhtss
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                gxszxtbevo((oxmwwwfdhm) obj, (androidx.compose.runtime.draadjrbmk) obj2, ((Number) obj3).intValue());
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        ppxfxbqfkf() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn eablkybsjg(MySparFragment mySparFragment, final pj.cllcsxoeiz cllcsxoeizVar, final mbcevpiqjq mbcevpiqjqVar, kcexrzcfyt label) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(label, "label");
            mySparFragment.jhduphickx(label, new tg.iobyxmoadg() { // from class: ru.myspar.proloyalty.myspar.impl.presentation.dxjokdxxww
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
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1127935376, i13, -1, "ru.myspar.proloyalty.myspar.impl.presentation.MySparFragment.onViewCreated.<anonymous>.<anonymous> (MySparFragment.kt:96)");
            }
            final mbcevpiqjq mbcevpiqjqVarPpxfxbqfkf = sopmlzcsov.ppxfxbqfkf(0, 0, draadjrbmkVar, 0, 3);
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            androidx.compose.runtime.draadjrbmk.iobyxmoadg iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
            if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt = androidx.compose.runtime.jlmebxxoox.dxjokdxxww(lg.gtknphoqwx.f62507zdlpuopuiu, draadjrbmkVar);
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            final pj.cllcsxoeiz cllcsxoeizVar = (pj.cllcsxoeiz) objYadqdtsiqt;
            yggfygwlhe yggfygwlheVarWwaezpbzkn = MySparFragment.this.wwaezpbzkn();
            draadjrbmkVar.sopmlzcsov(751385186);
            boolean zLmojexxdyd = draadjrbmkVar.lmojexxdyd(MySparFragment.this) | draadjrbmkVar.lmojexxdyd(cllcsxoeizVar) | draadjrbmkVar.ulzqkzuiru(mbcevpiqjqVarPpxfxbqfkf);
            final MySparFragment mySparFragment = MySparFragment.this;
            Object objYadqdtsiqt2 = draadjrbmkVar.yadqdtsiqt();
            if (zLmojexxdyd || objYadqdtsiqt2 == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt2 = new tg.draadjrbmk() { // from class: ru.myspar.proloyalty.myspar.impl.presentation.nufgyqmvbu
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return MySparFragment.ppxfxbqfkf.eablkybsjg(mySparFragment, cllcsxoeizVar, mbcevpiqjqVarPpxfxbqfkf, (kcexrzcfyt) obj);
                    }
                };
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt2);
            }
            draadjrbmkVar.stevsuqkhv();
            sw0.ppxfxbqfkf.zoijcleaow(yggfygwlheVarWwaezpbzkn, (tg.draadjrbmk) objYadqdtsiqt2, ezmngbhpjk.nufgyqmvbu.eablkybsjg(1137472617, true, new zoijcleaow(mbcevpiqjqVarPpxfxbqfkf, MySparFragment.this), draadjrbmkVar, 54), draadjrbmkVar, 384);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f98136zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(Fragment fragment) {
            super(0);
            this.f98136zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f98136zdlpuopuiu;
        }
    }

    /* synthetic */ class zoijcleaow extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f98137zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1, o41.iobyxmoadg.class, "bind", "bind(Landroid/view/View;)Lru/myspar/proloyalty/core/ui/databinding/ComposeViewProloyaltyBinding;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final o41.iobyxmoadg invoke(View p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return o41.iobyxmoadg.iobyxmoadg(p13);
        }
    }

    public MySparFragment() {
        super(b31.dxjokdxxww.compose_view_proloyalty);
        tg.iobyxmoadg iobyxmoadgVar = new tg.iobyxmoadg() { // from class: ru.myspar.proloyalty.myspar.impl.presentation.zoijcleaow
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return MySparFragment.oipsdeybqn(this.f98484zdlpuopuiu);
            }
        };
        gg.gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(gg.ojitshcjhn.NONE, new eablkybsjg(new wkgbmnqykc(this)));
        this.viewModel = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(yggfygwlhe.class), new gxszxtbevo(gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(null, gtknphoqwxVarIobyxmoadg), iobyxmoadgVar);
        this.binding = sr0.iobyxmoadg.zoijcleaow(this, zoijcleaow.f98137zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn czzsidtyhn(MySparFragment mySparFragment, ComboSetProduct productFirst, ComboSetProduct productSecond) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productFirst, "productFirst");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productSecond, "productSecond");
        mySparFragment.wwaezpbzkn().eslsurpljm(new vdvldrhtss.lqeggnwhkg(productFirst, productSecond));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ikoacuggdj(MySparFragment mySparFragment, String str, Bundle bundle) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<unused var>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bundle, "<unused var>");
        mySparFragment.wwaezpbzkn().eslsurpljm(vdvldrhtss.gtknphoqwx.f98190iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void jhduphickx(kcexrzcfyt uiLabel, tg.iobyxmoadg onScrollToFirstPosition) {
        if (uiLabel instanceof kcexrzcfyt.nufgyqmvbu) {
            sflfametgt(((kcexrzcfyt.nufgyqmvbu) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof kcexrzcfyt.dxjokdxxww) {
            zfvoamnweg(((kcexrzcfyt.dxjokdxxww) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof kcexrzcfyt.lqeggnwhkg) {
            ydmasvzmpa();
            return;
        }
        if (uiLabel instanceof kcexrzcfyt.gxszxtbevo) {
            kcexrzcfyt.gxszxtbevo gxszxtbevoVar = (kcexrzcfyt.gxszxtbevo) uiLabel;
            uwvvkdfqfp(gxszxtbevoVar.zoijcleaow(), gxszxtbevoVar.iobyxmoadg());
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(uiLabel, kcexrzcfyt.ppxfxbqfkf.f98157iobyxmoadg)) {
            xrmfcynszj();
            return;
        }
        if (uiLabel instanceof kcexrzcfyt.wkgbmnqykc) {
            rlfsiqarku(((kcexrzcfyt.wkgbmnqykc) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof kcexrzcfyt.zoijcleaow) {
            okpsazkaxt(((kcexrzcfyt.zoijcleaow) uiLabel).iobyxmoadg());
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(uiLabel, kcexrzcfyt.iobyxmoadg.f98154iobyxmoadg)) {
            onScrollToFirstPosition.invoke();
            return;
        }
        if (!(uiLabel instanceof kcexrzcfyt.eablkybsjg)) {
            if (!(uiLabel instanceof kcexrzcfyt.btonecajqb)) {
                throw new NoWhenBranchMatchedException();
            }
            a31.iobyxmoadg.btonecajqb(jlmebxxoox(), ((kcexrzcfyt.btonecajqb) uiLabel).iobyxmoadg(), null, null, 6, null);
        } else {
            kcexrzcfyt.eablkybsjg eablkybsjgVar = (kcexrzcfyt.eablkybsjg) uiLabel;
            HintUiModel hintUiModelZoijcleaow = eablkybsjgVar.zoijcleaow();
            HintDialogAnalyticsInfo hintDialogAnalyticsInfoIobyxmoadg = eablkybsjgVar.iobyxmoadg();
            androidx.fragment.app.oxmwwwfdhm oxmwwwfdhmVarRequireActivity = requireActivity();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(oxmwwwfdhmVarRequireActivity, "requireActivity(...)");
            ms0.zoijcleaow.iobyxmoadg(hintUiModelZoijcleaow, hintDialogAnalyticsInfoIobyxmoadg, oxmwwwfdhmVarRequireActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn jztzpxfvev(MySparFragment mySparFragment, yggfygwlhe.iobyxmoadg iobyxmoadgVar) {
        mySparFragment.wwaezpbzkn().eslsurpljm(new vdvldrhtss.iobyxmoadg(iobyxmoadgVar));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn metgxyhuhe(MySparFragment mySparFragment) {
        mySparFragment.wwaezpbzkn().eslsurpljm(vdvldrhtss.rgvfuqvkyq.f98211iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final o41.iobyxmoadg ntlheqmsrt() {
        return (o41.iobyxmoadg) this.binding.iobyxmoadg(this, f98114pkzmftpjix[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final crxdokpmqz.ppxfxbqfkf oipsdeybqn(MySparFragment mySparFragment) {
        return mySparFragment.new nufgyqmvbu();
    }

    private final void okpsazkaxt(final yggfygwlhe.iobyxmoadg source) {
        ac1.zoijcleaow zoijcleaowVar = ac1.zoijcleaow.f1546iobyxmoadg;
        androidx.fragment.app.oxmwwwfdhm oxmwwwfdhmVarRequireActivity = requireActivity();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(oxmwwwfdhmVarRequireActivity, "requireActivity(...)");
        u51.zoijcleaow.wkgbmnqykc(ac1.zoijcleaow.zoijcleaow(zoijcleaowVar, oxmwwwfdhmVarRequireActivity, new tg.iobyxmoadg() { // from class: ru.myspar.proloyalty.myspar.impl.presentation.lqeggnwhkg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return MySparFragment.jztzpxfvev(this.f98162zdlpuopuiu, source);
            }
        }, null, null, ow0.ppxfxbqfkf.VERTICAL, 12, null), sopmlzcsov(), v51.eablkybsjg.iobyxmoadg("MY_SPAR_SCREEN_KEY"));
    }

    private final void rlfsiqarku(BuildYourComboDialogArgs dialogArgs) {
        u51.zoijcleaow.zoijcleaow(BuildYourComboDialogFragment.INSTANCE.iobyxmoadg(dialogArgs).sflfametgt(new tg.rgvfuqvkyq() { // from class: ru.myspar.proloyalty.myspar.impl.presentation.wkgbmnqykc
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return MySparFragment.czzsidtyhn(this.f98227zdlpuopuiu, (ComboSetProduct) obj, (ComboSetProduct) obj2);
            }
        }), sopmlzcsov(), v51.eablkybsjg.iobyxmoadg("MY_SPAR_SCREEN_KEY"));
    }

    private final void sflfametgt(boolean isAuto) {
        if (!isAuto) {
            sopmlzcsov().clear();
        }
        u51.zoijcleaow.zoijcleaow(crxdokpmqz().iobyxmoadg(), sopmlzcsov(), isAuto ? v51.eablkybsjg.iobyxmoadg("MY_SPAR_SCREEN_KEY") : new v51.wkgbmnqykc.iobyxmoadg(null, 1, null));
    }

    private final void uwvvkdfqfp(final boolean isAddProduct, final ChangeProductParams params) {
        u51.zoijcleaow.ppxfxbqfkf(IqosAgreementsDialogFragment.INSTANCE.iobyxmoadg().lmojexxdyd(new tg.iobyxmoadg() { // from class: ru.myspar.proloyalty.myspar.impl.presentation.gxszxtbevo
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return MySparFragment.yfnezrywwk(isAddProduct, this, params);
            }
        }), sopmlzcsov(), v51.eablkybsjg.iobyxmoadg("MY_SPAR_SCREEN_KEY"));
    }

    private final void xrmfcynszj() {
        androidx.fragment.app.oxmwwwfdhm oxmwwwfdhmVarRequireActivity = requireActivity();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(oxmwwwfdhmVarRequireActivity, "requireActivity(...)");
        u51.zoijcleaow.wkgbmnqykc(new y81.wkgbmnqykc(oxmwwwfdhmVarRequireActivity, new tg.iobyxmoadg() { // from class: ru.myspar.proloyalty.myspar.impl.presentation.eablkybsjg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return MySparFragment.metgxyhuhe(this.f98142zdlpuopuiu);
            }
        }, null, 4, null), sopmlzcsov(), v51.eablkybsjg.iobyxmoadg("MY_SPAR_SCREEN_KEY"));
    }

    private final void ydmasvzmpa() {
        a31.iobyxmoadg.ppxfxbqfkf(jlmebxxoox(), vk0.lqeggnwhkg.proloyalty_product_not_available, null, lr0.eablkybsjg.gxszxtbevo.NonFatal, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn yfnezrywwk(boolean z13, MySparFragment mySparFragment, ChangeProductParams changeProductParams) {
        if (z13) {
            mySparFragment.wwaezpbzkn().eslsurpljm(new vdvldrhtss.eablkybsjg(changeProductParams));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void zfvoamnweg(StoryPayload args) {
        u51.zoijcleaow.ppxfxbqfkf(ribwqtqdhb().iobyxmoadg(args), sopmlzcsov(), v51.eablkybsjg.iobyxmoadg("MY_SPAR_SCREEN_KEY"));
    }

    public final y61.iobyxmoadg crxdokpmqz() {
        y61.iobyxmoadg iobyxmoadgVar = this.dynamicQrFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("dynamicQrFeatureApi");
        return null;
    }

    public final z21.iobyxmoadg jlmebxxoox() {
        z21.iobyxmoadg iobyxmoadgVar = this.snackbarManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("snackbarManager");
        return null;
    }

    public final iobyxmoadg mbcevpiqjq() {
        iobyxmoadg iobyxmoadgVar = this.assistedFactory;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("assistedFactory");
        return null;
    }

    @Override // ru.myspar.proloyalty.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(view, "view");
        super.onViewCreated(view, savedInstanceState);
        wwaezpbzkn().eslsurpljm(vdvldrhtss.zynmafqrjb.f98225iobyxmoadg);
        ntlheqmsrt().f72032zoijcleaow.setContent(ezmngbhpjk.nufgyqmvbu.ppxfxbqfkf(1127935376, true, new ppxfxbqfkf()));
        getParentFragmentManager().R("special_banner_evropolis_shown_request_key", getViewLifecycleOwner(), new ylkuphrtab() { // from class: ru.myspar.proloyalty.myspar.impl.presentation.ppxfxbqfkf
            @Override // androidx.fragment.app.ylkuphrtab
            public final void iobyxmoadg(String str, Bundle bundle) {
                MySparFragment.ikoacuggdj(this.f98170iobyxmoadg, str, bundle);
            }
        });
    }

    public final kt1.iobyxmoadg ribwqtqdhb() {
        kt1.iobyxmoadg iobyxmoadgVar = this.storyFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("storyFeatureApi");
        return null;
    }

    public final u51.iobyxmoadg sopmlzcsov() {
        u51.iobyxmoadg iobyxmoadgVar = this.dialogManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("dialogManager");
        return null;
    }

    public final a51.zoijcleaow ulzqkzuiru() {
        a51.zoijcleaow zoijcleaowVar = this.debugPanelFeatureObserver;
        if (zoijcleaowVar != null) {
            return zoijcleaowVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("debugPanelFeatureObserver");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvvm.BaseMvvmFragment
    /* JADX INFO: renamed from: vipkmwdibw, reason: merged with bridge method [inline-methods] */
    public yggfygwlhe wwaezpbzkn() {
        return (yggfygwlhe) this.viewModel.getValue();
    }
}
