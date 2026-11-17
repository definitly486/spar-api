package ru.myspar.catalog.impl.product_list.presentation;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.oxmwwwfdhm;
import androidx.fragment.app.stevsuqkhv;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.dxjokdxxww;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.lmojexxdyd;
import androidx.lifecycle.ribwqtqdhb;
import androidx.lifecycle.vdvldrhtss;
import gg.gtknphoqwx;
import gg.ojitshcjhn;
import gg.wwaezpbzkn;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.ageimvtcrz;
import pj.cllcsxoeiz;
import pj.ikoacuggdj;
import q2.kcexrzcfyt;
import ru.myspar.catalog.api.model.ProductListPayload;
import ru.myspar.catalog.impl.choosesort.domain.ChooseSortDialogArgs;
import ru.myspar.catalog.impl.choosesort.presentation.ChooseSortDialogFragment;
import ru.myspar.catalog.impl.product_list.presentation.ProductListMviFragment;
import ru.myspar.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.core.base.mvi.bottomsheet.BaseComposeMviBottomSheetDialogFragment;
import ru.myspar.core.domain.interactor.product_change.models.ChangeProductParams;
import ru.myspar.core.domain.models.ColorsModel;
import ru.myspar.core.domain.models.comboset.ComboSetProduct;
import ru.myspar.domain.feature.comboset.buildyourcombo.strore.BuildYourComboDialogArgs;
import ru.myspar.legacy.presentation.dialogs.comboset.buildyourcombo.BuildYourComboDialogFragment;
import ru.myspar.legacy.presentation.dialogs.iqos.IqosAgreementsDialogFragment;
import ru.myspar.purchases.api.model.PurchaseListAddProductDialogArgs;
import ru.myspar.story.api.model.StoryPayload;
import rx.nufgyqmvbu;
import tg.rgvfuqvkyq;
import ydmasvzmpa.metgxyhuhe;
import ydmasvzmpa.ydmasvzmpa;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 a2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001bB\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010\"\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001e2\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020$H\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\t2\u0006\u0010(\u001a\u00020\tH\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u000bH\u0016¢\u0006\u0004\b+\u0010\u0006J\u000f\u0010,\u001a\u00020\u000bH\u0016¢\u0006\u0004\b,\u0010\u0006J\u0017\u0010/\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u0002H\u0017¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u0004H\u0016¢\u0006\u0004\b5\u00106R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010F\u001a\u00020?8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010N\u001a\u00020G8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010V\u001a\u00020O8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u001b\u0010\\\u001a\u00020W8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u0018\u0010`\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_¨\u0006c"}, d2 = {"Lru/myspar/catalog/impl/product_list/presentation/ProductListMviFragment;", "Lru/myspar/core/base/mvi/fragment/BaseComposeMviFragment;", "Lhr/vdvldrhtss;", "Lru/myspar/catalog/impl/product_list/presentation/wkgbmnqykc;", "Lru/myspar/catalog/impl/product_list/presentation/eablkybsjg;", "<init>", "()V", "Lru/myspar/core/domain/interactor/product_change/models/ChangeProductParams;", "params", "", "message", "Lgg/wwaezpbzkn;", "ydmasvzmpa", "(Lru/myspar/core/domain/interactor/product_change/models/ChangeProductParams;Ljava/lang/String;)V", "bfopjjpdmp", "Lru/myspar/domain/feature/comboset/buildyourcombo/strore/BuildYourComboDialogArgs;", "dialogArgs", "iyctptxqzt", "(Lru/myspar/domain/feature/comboset/buildyourcombo/strore/BuildYourComboDialogArgs;)V", "Lru/myspar/purchases/api/model/PurchaseListAddProductDialogArgs;", "args", "zfvoamnweg", "(Lru/myspar/purchases/api/model/PurchaseListAddProductDialogArgs;)V", "Lgr/iobyxmoadg;", "lrnfpwlwnk", "(Lgr/iobyxmoadg;)V", "zeieaojujs", "(Lru/myspar/core/domain/interactor/product_change/models/ChangeProductParams;)V", "Lv00/ppxfxbqfkf;", "selected", "", "supportedTypes", "Lru/myspar/core/domain/models/ColorsModel;", "colorsModel", "tbqsvytpvh", "(Lv00/ppxfxbqfkf;Ljava/util/List;Lru/myspar/core/domain/models/ColorsModel;)V", "Lru/myspar/story/api/model/StoryPayload;", "uawqvzlxes", "(Lru/myspar/story/api/model/StoryPayload;)V", "categoryTitle", "categoryId", "czzsidtyhn", "(Ljava/lang/String;Ljava/lang/String;)V", "onStart", "onStop", "", "isHidden", "onHiddenChanged", "(Z)V", CommonUrlParts.MODEL, "ribwqtqdhb", "(Lhr/vdvldrhtss;Landroidx/compose/runtime/draadjrbmk;I)V", "uiLabel", "rlfsiqarku", "(Lru/myspar/catalog/impl/product_list/presentation/eablkybsjg;)V", "Lf70/iobyxmoadg;", "esjtqupxsv", "Lf70/iobyxmoadg;", "okpsazkaxt", "()Lf70/iobyxmoadg;", "setDialogManager", "(Lf70/iobyxmoadg;)V", "dialogManager", "Lq40/iobyxmoadg;", "lereixgezr", "Lq40/iobyxmoadg;", "xrmfcynszj", "()Lq40/iobyxmoadg;", "setSnackbarManager", "(Lq40/iobyxmoadg;)V", "snackbarManager", "Llx1/iobyxmoadg;", "pmvmpeiblj", "Llx1/iobyxmoadg;", "jztzpxfvev", "()Llx1/iobyxmoadg;", "setPurchasesFeatureApi", "(Llx1/iobyxmoadg;)V", "purchasesFeatureApi", "Lr72/iobyxmoadg;", "zynmafqrjb", "Lr72/iobyxmoadg;", "metgxyhuhe", "()Lr72/iobyxmoadg;", "setStoryFeatureApi", "(Lr72/iobyxmoadg;)V", "storyFeatureApi", "Lru/myspar/catalog/impl/product_list/presentation/zoijcleaow;", "istkbnxepw", "Lgg/gtknphoqwx;", "ikoacuggdj", "()Lru/myspar/catalog/impl/product_list/presentation/zoijcleaow;", "binder", "Lrx/nufgyqmvbu;", "cdpycssgdh", "Lrx/nufgyqmvbu;", "ageCheckedDialog", "yadqdtsiqt", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProductListMviFragment extends iobyxmoadg {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata */
    private nufgyqmvbu ageCheckedDialog;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    public f70.iobyxmoadg dialogManager;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx binder;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    public q40.iobyxmoadg snackbarManager;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    public lx1.iobyxmoadg purchasesFeatureApi;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    public r72.iobyxmoadg storyFeatureApi;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    public static final int f85269iozdgvuglv = 8;

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f85277zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f85277zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f85277zdlpuopuiu).getViewModelStore();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f85278yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f85279zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(tg.iobyxmoadg iobyxmoadgVar, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f85279zdlpuopuiu = iobyxmoadgVar;
            this.f85278yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f85279zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f85278yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.catalog.impl.product_list.presentation.ProductListMviFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final ProductListMviFragment iobyxmoadg(ProductListPayload catalogProducts) {
            zdlpuopuiu.btonecajqb(catalogProducts, "catalogProducts");
            return (ProductListMviFragment) b40.iobyxmoadg.zoijcleaow(new ProductListMviFragment(), catalogProducts, false, 2, null);
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f85280yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f85281zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(Fragment fragment, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f85281zdlpuopuiu = fragment;
            this.f85280yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f85280yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f85281zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f85282zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Fragment fragment) {
            super(0);
            this.f85282zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f85282zdlpuopuiu;
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f85283zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f85283zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f85283zdlpuopuiu.invoke();
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ metgxyhuhe f85284cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ cllcsxoeiz f85285iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ProductListMviFragment f85286jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ vdvldrhtss f85287yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f85288zdlpuopuiu;

        static final class iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            final /* synthetic */ metgxyhuhe f85289iwizpuwonk;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ cllcsxoeiz f85290jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ ProductListMviFragment f85291yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f85292zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.catalog.impl.product_list.presentation.ProductListMviFragment$zoijcleaow$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            static final class C1942iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

                /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
                final /* synthetic */ metgxyhuhe f85293iwizpuwonk;

                /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
                final /* synthetic */ cllcsxoeiz f85294jyumaefscl;

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                final /* synthetic */ ProductListMviFragment f85295yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                int f85296zdlpuopuiu;

                /* JADX INFO: renamed from: ru.myspar.catalog.impl.product_list.presentation.ProductListMviFragment$zoijcleaow$iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
                static final class C1943iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

                    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                    final /* synthetic */ metgxyhuhe f85297yggfygwlhe;

                    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                    int f85298zdlpuopuiu;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1943iobyxmoadg(metgxyhuhe metgxyhuheVar, lg.gxszxtbevo gxszxtbevoVar) {
                        super(2, gxszxtbevoVar);
                        this.f85297yggfygwlhe = metgxyhuheVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                        return new C1943iobyxmoadg(this.f85297yggfygwlhe, gxszxtbevoVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                    public final Object invokeSuspend(Object obj) {
                        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                        int i13 = this.f85298zdlpuopuiu;
                        if (i13 == 0) {
                            gg.zdlpuopuiu.zoijcleaow(obj);
                            metgxyhuhe metgxyhuheVar = this.f85297yggfygwlhe;
                            this.f85298zdlpuopuiu = 1;
                            if (metgxyhuhe.kcexrzcfyt(metgxyhuheVar, 0, 0, this, 2, null) == objGxszxtbevo) {
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
                        return ((C1943iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1942iobyxmoadg(ProductListMviFragment productListMviFragment, cllcsxoeiz cllcsxoeizVar, metgxyhuhe metgxyhuheVar, lg.gxszxtbevo gxszxtbevoVar) {
                    super(2, gxszxtbevoVar);
                    this.f85295yggfygwlhe = productListMviFragment;
                    this.f85294jyumaefscl = cllcsxoeizVar;
                    this.f85293iwizpuwonk = metgxyhuheVar;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final wwaezpbzkn kcexrzcfyt(cllcsxoeiz cllcsxoeizVar, metgxyhuhe metgxyhuheVar, ru.myspar.catalog.impl.product_list.presentation.eablkybsjg eablkybsjgVar) {
                    if (eablkybsjgVar instanceof ru.myspar.catalog.impl.product_list.presentation.eablkybsjg.iobyxmoadg) {
                        pj.gtknphoqwx.wkgbmnqykc(cllcsxoeizVar, null, null, new C1943iobyxmoadg(metgxyhuheVar, null), 3, null);
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                    return new C1942iobyxmoadg(this.f85295yggfygwlhe, this.f85294jyumaefscl, this.f85293iwizpuwonk, gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                    int i13 = this.f85296zdlpuopuiu;
                    if (i13 == 0) {
                        gg.zdlpuopuiu.zoijcleaow(obj);
                        ru.myspar.catalog.impl.product_list.presentation.zoijcleaow zoijcleaowVarPkzmftpjix = this.f85295yggfygwlhe.pkzmftpjix();
                        final cllcsxoeiz cllcsxoeizVar = this.f85294jyumaefscl;
                        final metgxyhuhe metgxyhuheVar = this.f85293iwizpuwonk;
                        tg.draadjrbmk draadjrbmkVar = new tg.draadjrbmk() { // from class: ru.myspar.catalog.impl.product_list.presentation.ppxfxbqfkf
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj2) {
                                return ProductListMviFragment.zoijcleaow.iobyxmoadg.C1942iobyxmoadg.kcexrzcfyt(cllcsxoeizVar, metgxyhuheVar, (eablkybsjg) obj2);
                            }
                        };
                        this.f85296zdlpuopuiu = 1;
                        if (zoijcleaowVarPkzmftpjix.wypolnanlu(draadjrbmkVar, this) == objGxszxtbevo) {
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
                    return ((C1942iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(ProductListMviFragment productListMviFragment, cllcsxoeiz cllcsxoeizVar, metgxyhuhe metgxyhuheVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f85291yggfygwlhe = productListMviFragment;
                this.f85290jyumaefscl = cllcsxoeizVar;
                this.f85289iwizpuwonk = metgxyhuheVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new iobyxmoadg(this.f85291yggfygwlhe, this.f85290jyumaefscl, this.f85289iwizpuwonk, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f85292zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    ageimvtcrz ageimvtcrzVarXrmfcynszj = ikoacuggdj.ppxfxbqfkf().xrmfcynszj();
                    C1942iobyxmoadg c1942iobyxmoadg = new C1942iobyxmoadg(this.f85291yggfygwlhe, this.f85290jyumaefscl, this.f85289iwizpuwonk, null);
                    this.f85292zdlpuopuiu = 1;
                    if (pj.dxjokdxxww.lqeggnwhkg(ageimvtcrzVarXrmfcynszj, c1942iobyxmoadg, this) == objGxszxtbevo) {
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
        zoijcleaow(vdvldrhtss vdvldrhtssVar, ProductListMviFragment productListMviFragment, cllcsxoeiz cllcsxoeizVar, metgxyhuhe metgxyhuheVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f85287yggfygwlhe = vdvldrhtssVar;
            this.f85286jyumaefscl = productListMviFragment;
            this.f85285iwizpuwonk = cllcsxoeizVar;
            this.f85284cqumvgiudr = metgxyhuheVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f85287yggfygwlhe, this.f85286jyumaefscl, this.f85285iwizpuwonk, this.f85284cqumvgiudr, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f85288zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                vdvldrhtss vdvldrhtssVar = this.f85287yggfygwlhe;
                androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = androidx.lifecycle.gtknphoqwx.zoijcleaow.STARTED;
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f85286jyumaefscl, this.f85285iwizpuwonk, this.f85284cqumvgiudr, null);
                this.f85288zdlpuopuiu = 1;
                if (lmojexxdyd.zoijcleaow(vdvldrhtssVar, zoijcleaowVar, iobyxmoadgVar, this) == objGxszxtbevo) {
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

    public ProductListMviFragment() {
        gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new wkgbmnqykc(new ppxfxbqfkf(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(ru.myspar.catalog.impl.product_list.presentation.zoijcleaow.class), new eablkybsjg(gtknphoqwxVarIobyxmoadg), new gxszxtbevo(null, gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(this, gtknphoqwxVarIobyxmoadg));
    }

    private final void bfopjjpdmp() {
        oxmwwwfdhm oxmwwwfdhmVarRequireActivity = requireActivity();
        zdlpuopuiu.dxjokdxxww(oxmwwwfdhmVarRequireActivity, "requireActivity(...)");
        f70.zoijcleaow.zoijcleaow(new ya0.wkgbmnqykc(oxmwwwfdhmVarRequireActivity, new tg.iobyxmoadg() { // from class: hr.dxjokdxxww
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ProductListMviFragment.opjhrmiecq(this.f40943zdlpuopuiu);
            }
        }, null, 4, null), okpsazkaxt(), g70.eablkybsjg.iobyxmoadg("PRODUCT_LIST_PAGER_SCREEN_KEY"));
    }

    private final void czzsidtyhn(final String categoryTitle, final String categoryId) {
        nufgyqmvbu nufgyqmvbuVar = this.ageCheckedDialog;
        if (nufgyqmvbuVar == null || !nufgyqmvbuVar.isShowing()) {
            ee0.zoijcleaow zoijcleaowVar = ee0.zoijcleaow.f31209iobyxmoadg;
            oxmwwwfdhm oxmwwwfdhmVarRequireActivity = requireActivity();
            zdlpuopuiu.dxjokdxxww(oxmwwwfdhmVarRequireActivity, "requireActivity(...)");
            nufgyqmvbu nufgyqmvbuVarZoijcleaow = ee0.zoijcleaow.zoijcleaow(zoijcleaowVar, oxmwwwfdhmVarRequireActivity, new tg.iobyxmoadg() { // from class: hr.wflxmlrfwp
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return ProductListMviFragment.uwvvkdfqfp(this.f40981zdlpuopuiu, categoryTitle, categoryId);
                }
            }, new tg.iobyxmoadg() { // from class: hr.agtfadlqog
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return ProductListMviFragment.yfnezrywwk(this.f40940zdlpuopuiu, categoryTitle, categoryId);
                }
            }, null, null, 24, null);
            this.ageCheckedDialog = nufgyqmvbuVarZoijcleaow;
            if (nufgyqmvbuVarZoijcleaow != null) {
                f70.zoijcleaow.zoijcleaow(nufgyqmvbuVarZoijcleaow, okpsazkaxt(), g70.eablkybsjg.iobyxmoadg("PRODUCT_LIST_PAGER_SCREEN_KEY"));
            }
        }
    }

    private final void iyctptxqzt(BuildYourComboDialogArgs dialogArgs) {
        f70.zoijcleaow.ppxfxbqfkf(BuildYourComboDialogFragment.INSTANCE.iobyxmoadg(dialogArgs).bfopjjpdmp(new rgvfuqvkyq() { // from class: hr.nufgyqmvbu
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return ProductListMviFragment.weqkydbzbr(this.f40953zdlpuopuiu, (ComboSetProduct) obj, (ComboSetProduct) obj2);
            }
        }), okpsazkaxt(), g70.eablkybsjg.iobyxmoadg("PRODUCT_LIST_PAGER_SCREEN_KEY"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn jhduphickx(ProductListMviFragment productListMviFragment, hr.vdvldrhtss vdvldrhtssVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
        productListMviFragment.wwaezpbzkn(vdvldrhtssVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void lrnfpwlwnk(gr.iobyxmoadg message) {
        q40.iobyxmoadg iobyxmoadgVarXrmfcynszj = xrmfcynszj();
        String strIobyxmoadg = message.iobyxmoadg();
        r40.iobyxmoadg.btonecajqb(iobyxmoadgVarXrmfcynszj, message.zoijcleaow(), strIobyxmoadg != null ? new ss.wkgbmnqykc.nufgyqmvbu.zoijcleaow(strIobyxmoadg) : null, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn nuxfzjnpeb(ChangeProductParams changeProductParams, ProductListMviFragment productListMviFragment) {
        if (changeProductParams != null) {
            productListMviFragment.ylkuphrtab(new ru.myspar.catalog.impl.product_list.presentation.wkgbmnqykc.agtfadlqog(changeProductParams));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn oipsdeybqn(ProductListMviFragment productListMviFragment) {
        r40.iobyxmoadg.eablkybsjg(productListMviFragment.xrmfcynszj(), pq.lqeggnwhkg.purchases_list_product_added_to_the_list);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn opjhrmiecq(ProductListMviFragment productListMviFragment) {
        productListMviFragment.ylkuphrtab(ru.myspar.catalog.impl.product_list.presentation.wkgbmnqykc.ojitshcjhn.f85351iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn roivzttewh(ProductListMviFragment productListMviFragment, v00.ppxfxbqfkf it) {
        zdlpuopuiu.btonecajqb(it, "it");
        productListMviFragment.pkzmftpjix().jyumaefscl(new ru.myspar.catalog.impl.product_list.presentation.wkgbmnqykc.cqumvgiudr(it));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn sflfametgt(ProductListMviFragment productListMviFragment, ChangeProductParams changeProductParams) {
        productListMviFragment.ylkuphrtab(new ru.myspar.catalog.impl.product_list.presentation.wkgbmnqykc.ppxfxbqfkf(changeProductParams));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void tbqsvytpvh(v00.ppxfxbqfkf selected, List supportedTypes, ColorsModel colorsModel) {
        f70.zoijcleaow.ppxfxbqfkf(ChooseSortDialogFragment.INSTANCE.iobyxmoadg(new ChooseSortDialogArgs(selected, supportedTypes, colorsModel), new tg.draadjrbmk() { // from class: hr.gxszxtbevo
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ProductListMviFragment.roivzttewh(this.f40949zdlpuopuiu, (v00.ppxfxbqfkf) obj);
            }
        }), okpsazkaxt(), g70.eablkybsjg.iobyxmoadg("PRODUCT_LIST_PAGER_SCREEN_KEY"));
    }

    private final void uawqvzlxes(StoryPayload args) {
        f70.zoijcleaow.wkgbmnqykc(metgxyhuhe().iobyxmoadg(args), okpsazkaxt(), g70.eablkybsjg.iobyxmoadg("PRODUCT_LIST_PAGER_SCREEN_KEY"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn uwvvkdfqfp(ProductListMviFragment productListMviFragment, String str, String str2) {
        productListMviFragment.pkzmftpjix().jyumaefscl(new ru.myspar.catalog.impl.product_list.presentation.wkgbmnqykc.zoijcleaow(true, str, str2));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn vipkmwdibw(ProductListMviFragment productListMviFragment, ru.myspar.catalog.impl.product_list.presentation.wkgbmnqykc it) {
        zdlpuopuiu.btonecajqb(it, "it");
        productListMviFragment.ylkuphrtab(it);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn weqkydbzbr(ProductListMviFragment productListMviFragment, ComboSetProduct productFirst, ComboSetProduct productSecond) {
        zdlpuopuiu.btonecajqb(productFirst, "productFirst");
        zdlpuopuiu.btonecajqb(productSecond, "productSecond");
        productListMviFragment.ylkuphrtab(new ru.myspar.catalog.impl.product_list.presentation.wkgbmnqykc.nufgyqmvbu(productFirst, productSecond));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void ydmasvzmpa(final ChangeProductParams params, String message) {
        ee0.zoijcleaow zoijcleaowVar = ee0.zoijcleaow.f31209iobyxmoadg;
        oxmwwwfdhm oxmwwwfdhmVarRequireActivity = requireActivity();
        zdlpuopuiu.dxjokdxxww(oxmwwwfdhmVarRequireActivity, "requireActivity(...)");
        f70.zoijcleaow.zoijcleaow(zoijcleaowVar.ppxfxbqfkf(oxmwwwfdhmVarRequireActivity, message, new tg.iobyxmoadg() { // from class: hr.lqeggnwhkg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ProductListMviFragment.sflfametgt(this.f40952zdlpuopuiu, params);
            }
        }, null), okpsazkaxt(), g70.eablkybsjg.iobyxmoadg("PRODUCT_LIST_PAGER_SCREEN_KEY"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn yfnezrywwk(ProductListMviFragment productListMviFragment, String str, String str2) {
        productListMviFragment.pkzmftpjix().jyumaefscl(new ru.myspar.catalog.impl.product_list.presentation.wkgbmnqykc.zoijcleaow(false, str, str2));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void zeieaojujs(final ChangeProductParams params) {
        f70.zoijcleaow.wkgbmnqykc(IqosAgreementsDialogFragment.INSTANCE.iobyxmoadg().lmojexxdyd(new tg.iobyxmoadg() { // from class: hr.eablkybsjg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ProductListMviFragment.nuxfzjnpeb(params, this);
            }
        }), okpsazkaxt(), g70.eablkybsjg.iobyxmoadg("PRODUCT_LIST_PAGER_SCREEN_KEY"));
    }

    private final void zfvoamnweg(PurchaseListAddProductDialogArgs args) {
        BaseComposeMviBottomSheetDialogFragment baseComposeMviBottomSheetDialogFragmentNufgyqmvbu = jztzpxfvev().nufgyqmvbu(args, new tg.iobyxmoadg() { // from class: hr.draadjrbmk
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ProductListMviFragment.oipsdeybqn(this.f40942zdlpuopuiu);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        zdlpuopuiu.dxjokdxxww(childFragmentManager, "getChildFragmentManager(...)");
        baseComposeMviBottomSheetDialogFragmentNufgyqmvbu.ntlheqmsrt(childFragmentManager);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.core.base.mvi.fragment.BaseComposeMviFragment
    /* JADX INFO: renamed from: ikoacuggdj, reason: merged with bridge method [inline-methods] */
    public ru.myspar.catalog.impl.product_list.presentation.zoijcleaow pkzmftpjix() {
        return (ru.myspar.catalog.impl.product_list.presentation.zoijcleaow) this.binder.getValue();
    }

    public final lx1.iobyxmoadg jztzpxfvev() {
        lx1.iobyxmoadg iobyxmoadgVar = this.purchasesFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("purchasesFeatureApi");
        return null;
    }

    public final r72.iobyxmoadg metgxyhuhe() {
        r72.iobyxmoadg iobyxmoadgVar = this.storyFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("storyFeatureApi");
        return null;
    }

    public final f70.iobyxmoadg okpsazkaxt() {
        f70.iobyxmoadg iobyxmoadgVar = this.dialogManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("dialogManager");
        return null;
    }

    @Override // ru.myspar.core.base.mvi.fragment.BaseComposeMviFragment, ru.myspar.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean isHidden) {
        super.onHiddenChanged(isHidden);
        ylkuphrtab(new ru.myspar.catalog.impl.product_list.presentation.wkgbmnqykc.draadjrbmk(isHidden));
    }

    @Override // ru.myspar.core.base.mvi.fragment.BaseComposeMviFragment, ru.myspar.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        ylkuphrtab(new ru.myspar.catalog.impl.product_list.presentation.wkgbmnqykc.esjtqupxsv(true));
    }

    @Override // ru.myspar.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onStop() {
        ylkuphrtab(new ru.myspar.catalog.impl.product_list.presentation.wkgbmnqykc.esjtqupxsv(false));
        super.onStop();
    }

    @Override // ru.myspar.core.base.mvi.fragment.BaseComposeMviFragment
    /* JADX INFO: renamed from: ribwqtqdhb, reason: merged with bridge method [inline-methods] */
    public void wwaezpbzkn(final hr.vdvldrhtss model, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        zdlpuopuiu.btonecajqb(model, "model");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-974103209);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.lmojexxdyd(model) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(this) ? 32 : 16;
        }
        if ((i14 & 19) == 18 && draadjrbmkVarBtonecajqb.gtknphoqwx()) {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        } else {
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-974103209, i14, -1, "ru.myspar.catalog.impl.product_list.presentation.ProductListMviFragment.Render (ProductListMviFragment.kt:85)");
            }
            metgxyhuhe metgxyhuheVarLqeggnwhkg = ydmasvzmpa.lqeggnwhkg(0, 0, draadjrbmkVarBtonecajqb, 0, 3);
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            androidx.compose.runtime.draadjrbmk.iobyxmoadg iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
            if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt = androidx.compose.runtime.jlmebxxoox.dxjokdxxww(lg.gtknphoqwx.f62507zdlpuopuiu, draadjrbmkVarBtonecajqb);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            cllcsxoeiz cllcsxoeizVar = (cllcsxoeiz) objYadqdtsiqt;
            vdvldrhtss vdvldrhtssVar = (vdvldrhtss) draadjrbmkVarBtonecajqb.ojitshcjhn(kcexrzcfyt.ppxfxbqfkf());
            androidx.lifecycle.gtknphoqwx lifecycle = vdvldrhtssVar.getLifecycle();
            draadjrbmkVarBtonecajqb.sopmlzcsov(-533802973);
            boolean zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(vdvldrhtssVar) | draadjrbmkVarBtonecajqb.lmojexxdyd(this) | draadjrbmkVarBtonecajqb.lmojexxdyd(cllcsxoeizVar) | draadjrbmkVarBtonecajqb.ulzqkzuiru(metgxyhuheVarLqeggnwhkg);
            Object objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zLmojexxdyd || objYadqdtsiqt2 == iobyxmoadgVar.iobyxmoadg()) {
                zoijcleaow zoijcleaowVar = new zoijcleaow(vdvldrhtssVar, this, cllcsxoeizVar, metgxyhuheVarLqeggnwhkg, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(zoijcleaowVar);
                objYadqdtsiqt2 = zoijcleaowVar;
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            androidx.compose.runtime.jlmebxxoox.eablkybsjg(lifecycle, (rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, 0);
            draadjrbmkVarBtonecajqb.sopmlzcsov(-533786003);
            boolean zLmojexxdyd2 = draadjrbmkVarBtonecajqb.lmojexxdyd(this);
            Object objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zLmojexxdyd2 || objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: hr.btonecajqb
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return ProductListMviFragment.vipkmwdibw(this.f40941zdlpuopuiu, (ru.myspar.catalog.impl.product_list.presentation.wkgbmnqykc) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            ir.oxmwwwfdhm.esjtqupxsv(model, metgxyhuheVarLqeggnwhkg, (tg.draadjrbmk) objYadqdtsiqt3, draadjrbmkVarBtonecajqb, i14 & 14);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: hr.gtknphoqwx
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return ProductListMviFragment.jhduphickx(this.f40948zdlpuopuiu, model, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // ru.myspar.core.base.mvi.fragment.BaseComposeMviFragment
    /* JADX INFO: renamed from: rlfsiqarku, reason: merged with bridge method [inline-methods] */
    public void hcddaimhww(ru.myspar.catalog.impl.product_list.presentation.eablkybsjg uiLabel) {
        zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
        if (zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.catalog.impl.product_list.presentation.eablkybsjg.iobyxmoadg.f85311iobyxmoadg)) {
            return;
        }
        if (zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.catalog.impl.product_list.presentation.eablkybsjg.zoijcleaow.f85322iobyxmoadg)) {
            r40.iobyxmoadg.eablkybsjg(xrmfcynszj(), pq.lqeggnwhkg.purchases_list_product_added_to_the_list);
            return;
        }
        if (uiLabel instanceof ru.myspar.catalog.impl.product_list.presentation.eablkybsjg.wkgbmnqykc) {
            ru.myspar.catalog.impl.product_list.presentation.eablkybsjg.wkgbmnqykc wkgbmnqykcVar = (ru.myspar.catalog.impl.product_list.presentation.eablkybsjg.wkgbmnqykc) uiLabel;
            ydmasvzmpa(wkgbmnqykcVar.zoijcleaow(), wkgbmnqykcVar.iobyxmoadg());
            return;
        }
        if (zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.catalog.impl.product_list.presentation.eablkybsjg.C1944eablkybsjg.f85307iobyxmoadg)) {
            bfopjjpdmp();
            return;
        }
        if (uiLabel instanceof ru.myspar.catalog.impl.product_list.presentation.eablkybsjg.gxszxtbevo) {
            iyctptxqzt(((ru.myspar.catalog.impl.product_list.presentation.eablkybsjg.gxszxtbevo) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.catalog.impl.product_list.presentation.eablkybsjg.lqeggnwhkg) {
            zfvoamnweg(((ru.myspar.catalog.impl.product_list.presentation.eablkybsjg.lqeggnwhkg) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.catalog.impl.product_list.presentation.eablkybsjg.dxjokdxxww) {
            lrnfpwlwnk(((ru.myspar.catalog.impl.product_list.presentation.eablkybsjg.dxjokdxxww) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.catalog.impl.product_list.presentation.eablkybsjg.btonecajqb) {
            zeieaojujs(((ru.myspar.catalog.impl.product_list.presentation.eablkybsjg.btonecajqb) uiLabel).iobyxmoadg());
            return;
        }
        if (zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.catalog.impl.product_list.presentation.eablkybsjg.gtknphoqwx.f85308iobyxmoadg)) {
            r40.iobyxmoadg.dxjokdxxww(xrmfcynszj(), pq.lqeggnwhkg.order_edit_delivery_price_changed, null, null, 6, null);
            return;
        }
        if (uiLabel instanceof ru.myspar.catalog.impl.product_list.presentation.eablkybsjg.draadjrbmk) {
            ru.myspar.catalog.impl.product_list.presentation.eablkybsjg.draadjrbmk draadjrbmkVar = (ru.myspar.catalog.impl.product_list.presentation.eablkybsjg.draadjrbmk) uiLabel;
            HintUiModel hintUiModelZoijcleaow = draadjrbmkVar.zoijcleaow();
            HintDialogAnalyticsInfo hintDialogAnalyticsInfoIobyxmoadg = draadjrbmkVar.iobyxmoadg();
            oxmwwwfdhm oxmwwwfdhmVarRequireActivity = requireActivity();
            zdlpuopuiu.dxjokdxxww(oxmwwwfdhmVarRequireActivity, "requireActivity(...)");
            st.zoijcleaow.iobyxmoadg(hintUiModelZoijcleaow, hintDialogAnalyticsInfoIobyxmoadg, oxmwwwfdhmVarRequireActivity);
            return;
        }
        if (zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.catalog.impl.product_list.presentation.eablkybsjg.wflxmlrfwp.f85319iobyxmoadg)) {
            r40.iobyxmoadg.ppxfxbqfkf(xrmfcynszj(), pq.lqeggnwhkg.product_not_available, null, ss.wkgbmnqykc.gxszxtbevo.NonFatal, 2, null);
            return;
        }
        if (uiLabel instanceof ru.myspar.catalog.impl.product_list.presentation.eablkybsjg.agtfadlqog) {
            ru.myspar.catalog.impl.product_list.presentation.eablkybsjg.agtfadlqog agtfadlqogVar = (ru.myspar.catalog.impl.product_list.presentation.eablkybsjg.agtfadlqog) uiLabel;
            tbqsvytpvh(agtfadlqogVar.zoijcleaow(), agtfadlqogVar.ppxfxbqfkf(), agtfadlqogVar.iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.catalog.impl.product_list.presentation.eablkybsjg.ojitshcjhn) {
            uawqvzlxes(((ru.myspar.catalog.impl.product_list.presentation.eablkybsjg.ojitshcjhn) uiLabel).iobyxmoadg());
            return;
        }
        if (zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.catalog.impl.product_list.presentation.eablkybsjg.rgvfuqvkyq.f85317iobyxmoadg)) {
            r40.iobyxmoadg.eablkybsjg(xrmfcynszj(), pq.lqeggnwhkg.msg_product_adding_to_edit_order);
            return;
        }
        if (uiLabel instanceof ru.myspar.catalog.impl.product_list.presentation.eablkybsjg.vdvldrhtss) {
            r40.iobyxmoadg.btonecajqb(xrmfcynszj(), ((ru.myspar.catalog.impl.product_list.presentation.eablkybsjg.vdvldrhtss) uiLabel).iobyxmoadg(), null, null, 6, null);
            return;
        }
        if (uiLabel instanceof ru.myspar.catalog.impl.product_list.presentation.eablkybsjg.nufgyqmvbu) {
            lmojexxdyd(((ru.myspar.catalog.impl.product_list.presentation.eablkybsjg.nufgyqmvbu) uiLabel).iobyxmoadg());
        } else {
            if (!(uiLabel instanceof ru.myspar.catalog.impl.product_list.presentation.eablkybsjg.ppxfxbqfkf)) {
                throw new NoWhenBranchMatchedException();
            }
            ru.myspar.catalog.impl.product_list.presentation.eablkybsjg.ppxfxbqfkf ppxfxbqfkfVar = (ru.myspar.catalog.impl.product_list.presentation.eablkybsjg.ppxfxbqfkf) uiLabel;
            czzsidtyhn(ppxfxbqfkfVar.zoijcleaow(), ppxfxbqfkfVar.iobyxmoadg());
        }
    }

    public final q40.iobyxmoadg xrmfcynszj() {
        q40.iobyxmoadg iobyxmoadgVar = this.snackbarManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("snackbarManager");
        return null;
    }
}
