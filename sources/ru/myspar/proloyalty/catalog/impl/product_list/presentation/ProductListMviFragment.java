package ru.myspar.proloyalty.catalog.impl.product_list.presentation;

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
import ow0.nufgyqmvbu;
import pj.ageimvtcrz;
import pj.cllcsxoeiz;
import pj.ikoacuggdj;
import q2.kcexrzcfyt;
import ru.myspar.proloyalty.catalog.api.model.ProductListPayload;
import ru.myspar.proloyalty.catalog.impl.choosesort.domain.ChooseSortDialogArgs;
import ru.myspar.proloyalty.catalog.impl.choosesort.presentation.ChooseSortDialogFragment;
import ru.myspar.proloyalty.catalog.impl.product_list.presentation.ProductListMviFragment;
import ru.myspar.proloyalty.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.core.base.mvi.bottomsheet.BaseComposeMviBottomSheetDialogFragment;
import ru.myspar.proloyalty.core.domain.interactor.product_change.models.ChangeProductParams;
import ru.myspar.proloyalty.core.domain.models.ColorsModel;
import ru.myspar.proloyalty.core.domain.models.comboset.ComboSetProduct;
import ru.myspar.proloyalty.domain.feature.comboset.buildyourcombo.strore.BuildYourComboDialogArgs;
import ru.myspar.proloyalty.legacy.presentation.dialogs.comboset.buildyourcombo.BuildYourComboDialogFragment;
import ru.myspar.proloyalty.legacy.presentation.dialogs.iqos.IqosAgreementsDialogFragment;
import ru.myspar.proloyalty.purchases.api.model.PurchaseListAddProductDialogArgs;
import ru.myspar.proloyalty.story.api.model.StoryPayload;
import tg.rgvfuqvkyq;
import ydmasvzmpa.metgxyhuhe;
import ydmasvzmpa.ydmasvzmpa;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 _2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001`B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u001f\u0010'\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0007H\u0016¢\u0006\u0004\b)\u0010\u0006J\u000f\u0010*\u001a\u00020\u0007H\u0016¢\u0006\u0004\b*\u0010\u0006J\u0017\u0010-\u001a\u00020\u00072\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u0002H\u0017¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u0004H\u0016¢\u0006\u0004\b3\u00104R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010D\u001a\u00020=8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010L\u001a\u00020E8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010T\u001a\u00020M8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001b\u0010Z\u001a\u00020U8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u0018\u0010^\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]¨\u0006a"}, d2 = {"Lru/myspar/proloyalty/catalog/impl/product_list/presentation/ProductListMviFragment;", "Lru/myspar/proloyalty/core/base/mvi/fragment/BaseComposeMviFragment;", "Ltp0/rgvfuqvkyq;", "Lru/myspar/proloyalty/catalog/impl/product_list/presentation/wkgbmnqykc;", "Lru/myspar/proloyalty/catalog/impl/product_list/presentation/eablkybsjg;", "<init>", "()V", "Lgg/wwaezpbzkn;", "sflfametgt", "Lru/myspar/proloyalty/domain/feature/comboset/buildyourcombo/strore/BuildYourComboDialogArgs;", "dialogArgs", "oipsdeybqn", "(Lru/myspar/proloyalty/domain/feature/comboset/buildyourcombo/strore/BuildYourComboDialogArgs;)V", "Lru/myspar/proloyalty/purchases/api/model/PurchaseListAddProductDialogArgs;", "args", "yfnezrywwk", "(Lru/myspar/proloyalty/purchases/api/model/PurchaseListAddProductDialogArgs;)V", "Lsp0/iobyxmoadg;", "message", "opjhrmiecq", "(Lsp0/iobyxmoadg;)V", "Lru/myspar/proloyalty/core/domain/interactor/product_change/models/ChangeProductParams;", "params", "iyctptxqzt", "(Lru/myspar/proloyalty/core/domain/interactor/product_change/models/ChangeProductParams;)V", "Lmz0/ppxfxbqfkf;", "selected", "", "supportedTypes", "Lru/myspar/proloyalty/core/domain/models/ColorsModel;", "colorsModel", "lrnfpwlwnk", "(Lmz0/ppxfxbqfkf;Ljava/util/List;Lru/myspar/proloyalty/core/domain/models/ColorsModel;)V", "Lru/myspar/proloyalty/story/api/model/StoryPayload;", "nuxfzjnpeb", "(Lru/myspar/proloyalty/story/api/model/StoryPayload;)V", "", "categoryTitle", "categoryId", "rlfsiqarku", "(Ljava/lang/String;Ljava/lang/String;)V", "onStart", "onStop", "", "isHidden", "onHiddenChanged", "(Z)V", CommonUrlParts.MODEL, "jlmebxxoox", "(Ltp0/rgvfuqvkyq;Landroidx/compose/runtime/draadjrbmk;I)V", "uiLabel", "metgxyhuhe", "(Lru/myspar/proloyalty/catalog/impl/product_list/presentation/eablkybsjg;)V", "Lu51/iobyxmoadg;", "esjtqupxsv", "Lu51/iobyxmoadg;", "ikoacuggdj", "()Lu51/iobyxmoadg;", "setDialogManager", "(Lu51/iobyxmoadg;)V", "dialogManager", "Lz21/iobyxmoadg;", "lereixgezr", "Lz21/iobyxmoadg;", "jztzpxfvev", "()Lz21/iobyxmoadg;", "setSnackbarManager", "(Lz21/iobyxmoadg;)V", "snackbarManager", "Lri1/iobyxmoadg;", "pmvmpeiblj", "Lri1/iobyxmoadg;", "okpsazkaxt", "()Lri1/iobyxmoadg;", "setPurchasesFeatureApi", "(Lri1/iobyxmoadg;)V", "purchasesFeatureApi", "Lkt1/iobyxmoadg;", "zynmafqrjb", "Lkt1/iobyxmoadg;", "xrmfcynszj", "()Lkt1/iobyxmoadg;", "setStoryFeatureApi", "(Lkt1/iobyxmoadg;)V", "storyFeatureApi", "Lru/myspar/proloyalty/catalog/impl/product_list/presentation/zoijcleaow;", "istkbnxepw", "Lgg/gtknphoqwx;", "jhduphickx", "()Lru/myspar/proloyalty/catalog/impl/product_list/presentation/zoijcleaow;", "binder", "Low0/nufgyqmvbu;", "cdpycssgdh", "Low0/nufgyqmvbu;", "ageCheckedDialog", "yadqdtsiqt", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProductListMviFragment extends iobyxmoadg {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata */
    private nufgyqmvbu ageCheckedDialog;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    public u51.iobyxmoadg dialogManager;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx binder;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    public z21.iobyxmoadg snackbarManager;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    public ri1.iobyxmoadg purchasesFeatureApi;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    public kt1.iobyxmoadg storyFeatureApi;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    public static final int f93196iozdgvuglv = 8;

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f93204zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f93204zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f93204zdlpuopuiu).getViewModelStore();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f93205yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f93206zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(tg.iobyxmoadg iobyxmoadgVar, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f93206zdlpuopuiu = iobyxmoadgVar;
            this.f93205yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f93206zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f93205yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.catalog.impl.product_list.presentation.ProductListMviFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final ProductListMviFragment iobyxmoadg(ProductListPayload catalogProducts) {
            zdlpuopuiu.btonecajqb(catalogProducts, "catalogProducts");
            return (ProductListMviFragment) g21.iobyxmoadg.zoijcleaow(new ProductListMviFragment(), catalogProducts, false, 2, null);
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f93207yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f93208zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(Fragment fragment, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f93208zdlpuopuiu = fragment;
            this.f93207yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f93207yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f93208zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f93209zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Fragment fragment) {
            super(0);
            this.f93209zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f93209zdlpuopuiu;
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f93210zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f93210zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f93210zdlpuopuiu.invoke();
        }
    }

    static final class zoijcleaow extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ metgxyhuhe f93211cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ cllcsxoeiz f93212iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ProductListMviFragment f93213jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ vdvldrhtss f93214yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f93215zdlpuopuiu;

        static final class iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            final /* synthetic */ metgxyhuhe f93216iwizpuwonk;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ cllcsxoeiz f93217jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ ProductListMviFragment f93218yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f93219zdlpuopuiu;

            /* JADX INFO: renamed from: ru.myspar.proloyalty.catalog.impl.product_list.presentation.ProductListMviFragment$zoijcleaow$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
            static final class C2184iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

                /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
                final /* synthetic */ metgxyhuhe f93220iwizpuwonk;

                /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
                final /* synthetic */ cllcsxoeiz f93221jyumaefscl;

                /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                final /* synthetic */ ProductListMviFragment f93222yggfygwlhe;

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                int f93223zdlpuopuiu;

                /* JADX INFO: renamed from: ru.myspar.proloyalty.catalog.impl.product_list.presentation.ProductListMviFragment$zoijcleaow$iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
                static final class C2185iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

                    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
                    final /* synthetic */ metgxyhuhe f93224yggfygwlhe;

                    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                    int f93225zdlpuopuiu;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C2185iobyxmoadg(metgxyhuhe metgxyhuheVar, lg.gxszxtbevo gxszxtbevoVar) {
                        super(2, gxszxtbevoVar);
                        this.f93224yggfygwlhe = metgxyhuheVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                        return new C2185iobyxmoadg(this.f93224yggfygwlhe, gxszxtbevoVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                    public final Object invokeSuspend(Object obj) {
                        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                        int i13 = this.f93225zdlpuopuiu;
                        if (i13 == 0) {
                            gg.zdlpuopuiu.zoijcleaow(obj);
                            metgxyhuhe metgxyhuheVar = this.f93224yggfygwlhe;
                            this.f93225zdlpuopuiu = 1;
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
                        return ((C2185iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2184iobyxmoadg(ProductListMviFragment productListMviFragment, cllcsxoeiz cllcsxoeizVar, metgxyhuhe metgxyhuheVar, lg.gxszxtbevo gxszxtbevoVar) {
                    super(2, gxszxtbevoVar);
                    this.f93222yggfygwlhe = productListMviFragment;
                    this.f93221jyumaefscl = cllcsxoeizVar;
                    this.f93220iwizpuwonk = metgxyhuheVar;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final wwaezpbzkn kcexrzcfyt(cllcsxoeiz cllcsxoeizVar, metgxyhuhe metgxyhuheVar, ru.myspar.proloyalty.catalog.impl.product_list.presentation.eablkybsjg eablkybsjgVar) {
                    if (eablkybsjgVar instanceof ru.myspar.proloyalty.catalog.impl.product_list.presentation.eablkybsjg.iobyxmoadg) {
                        pj.gtknphoqwx.wkgbmnqykc(cllcsxoeizVar, null, null, new C2185iobyxmoadg(metgxyhuheVar, null), 3, null);
                    }
                    return wwaezpbzkn.f37140iobyxmoadg;
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                    return new C2184iobyxmoadg(this.f93222yggfygwlhe, this.f93221jyumaefscl, this.f93220iwizpuwonk, gxszxtbevoVar);
                }

                @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
                public final Object invokeSuspend(Object obj) {
                    Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                    int i13 = this.f93223zdlpuopuiu;
                    if (i13 == 0) {
                        gg.zdlpuopuiu.zoijcleaow(obj);
                        ru.myspar.proloyalty.catalog.impl.product_list.presentation.zoijcleaow zoijcleaowVarPkzmftpjix = this.f93222yggfygwlhe.pkzmftpjix();
                        final cllcsxoeiz cllcsxoeizVar = this.f93221jyumaefscl;
                        final metgxyhuhe metgxyhuheVar = this.f93220iwizpuwonk;
                        tg.draadjrbmk draadjrbmkVar = new tg.draadjrbmk() { // from class: ru.myspar.proloyalty.catalog.impl.product_list.presentation.ppxfxbqfkf
                            @Override // tg.draadjrbmk
                            public final Object invoke(Object obj2) {
                                return ProductListMviFragment.zoijcleaow.iobyxmoadg.C2184iobyxmoadg.kcexrzcfyt(cllcsxoeizVar, metgxyhuheVar, (eablkybsjg) obj2);
                            }
                        };
                        this.f93223zdlpuopuiu = 1;
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
                    return ((C2184iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(ProductListMviFragment productListMviFragment, cllcsxoeiz cllcsxoeizVar, metgxyhuhe metgxyhuheVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f93218yggfygwlhe = productListMviFragment;
                this.f93217jyumaefscl = cllcsxoeizVar;
                this.f93216iwizpuwonk = metgxyhuheVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new iobyxmoadg(this.f93218yggfygwlhe, this.f93217jyumaefscl, this.f93216iwizpuwonk, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f93219zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    ageimvtcrz ageimvtcrzVarXrmfcynszj = ikoacuggdj.ppxfxbqfkf().xrmfcynszj();
                    C2184iobyxmoadg c2184iobyxmoadg = new C2184iobyxmoadg(this.f93218yggfygwlhe, this.f93217jyumaefscl, this.f93216iwizpuwonk, null);
                    this.f93219zdlpuopuiu = 1;
                    if (pj.dxjokdxxww.lqeggnwhkg(ageimvtcrzVarXrmfcynszj, c2184iobyxmoadg, this) == objGxszxtbevo) {
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
            this.f93214yggfygwlhe = vdvldrhtssVar;
            this.f93213jyumaefscl = productListMviFragment;
            this.f93212iwizpuwonk = cllcsxoeizVar;
            this.f93211cqumvgiudr = metgxyhuheVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new zoijcleaow(this.f93214yggfygwlhe, this.f93213jyumaefscl, this.f93212iwizpuwonk, this.f93211cqumvgiudr, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f93215zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                vdvldrhtss vdvldrhtssVar = this.f93214yggfygwlhe;
                androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = androidx.lifecycle.gtknphoqwx.zoijcleaow.STARTED;
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f93213jyumaefscl, this.f93212iwizpuwonk, this.f93211cqumvgiudr, null);
                this.f93215zdlpuopuiu = 1;
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
        this.binder = stevsuqkhv.zoijcleaow(this, kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(ru.myspar.proloyalty.catalog.impl.product_list.presentation.zoijcleaow.class), new eablkybsjg(gtknphoqwxVarIobyxmoadg), new gxszxtbevo(null, gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(this, gtknphoqwxVarIobyxmoadg));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn bfopjjpdmp(ProductListMviFragment productListMviFragment, ComboSetProduct productFirst, ComboSetProduct productSecond) {
        zdlpuopuiu.btonecajqb(productFirst, "productFirst");
        zdlpuopuiu.btonecajqb(productSecond, "productSecond");
        productListMviFragment.ylkuphrtab(new ru.myspar.proloyalty.catalog.impl.product_list.presentation.wkgbmnqykc.lqeggnwhkg(productFirst, productSecond));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn czzsidtyhn(ProductListMviFragment productListMviFragment, String str, String str2) {
        productListMviFragment.pkzmftpjix().jyumaefscl(new ru.myspar.proloyalty.catalog.impl.product_list.presentation.wkgbmnqykc.zoijcleaow(true, str, str2));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void iyctptxqzt(final ChangeProductParams params) {
        u51.zoijcleaow.ppxfxbqfkf(IqosAgreementsDialogFragment.INSTANCE.iobyxmoadg().lmojexxdyd(new tg.iobyxmoadg() { // from class: tp0.wflxmlrfwp
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ProductListMviFragment.weqkydbzbr(params, this);
            }
        }), ikoacuggdj(), v51.eablkybsjg.iobyxmoadg("PRODUCT_LIST_PAGER_SCREEN_KEY"));
    }

    private final void lrnfpwlwnk(mz0.ppxfxbqfkf selected, List supportedTypes, ColorsModel colorsModel) {
        u51.zoijcleaow.zoijcleaow(ChooseSortDialogFragment.INSTANCE.iobyxmoadg(new ChooseSortDialogArgs(selected, supportedTypes, colorsModel), new tg.draadjrbmk() { // from class: tp0.dxjokdxxww
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ProductListMviFragment.zeieaojujs(this.f111139zdlpuopuiu, (mz0.ppxfxbqfkf) obj);
            }
        }), ikoacuggdj(), v51.eablkybsjg.iobyxmoadg("PRODUCT_LIST_PAGER_SCREEN_KEY"));
    }

    private final void nuxfzjnpeb(StoryPayload args) {
        u51.zoijcleaow.ppxfxbqfkf(xrmfcynszj().iobyxmoadg(args), ikoacuggdj(), v51.eablkybsjg.iobyxmoadg("PRODUCT_LIST_PAGER_SCREEN_KEY"));
    }

    private final void oipsdeybqn(BuildYourComboDialogArgs dialogArgs) {
        u51.zoijcleaow.zoijcleaow(BuildYourComboDialogFragment.INSTANCE.iobyxmoadg(dialogArgs).sflfametgt(new rgvfuqvkyq() { // from class: tp0.nufgyqmvbu
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return ProductListMviFragment.bfopjjpdmp(this.f111149zdlpuopuiu, (ComboSetProduct) obj, (ComboSetProduct) obj2);
            }
        }), ikoacuggdj(), v51.eablkybsjg.iobyxmoadg("PRODUCT_LIST_PAGER_SCREEN_KEY"));
    }

    private final void opjhrmiecq(sp0.iobyxmoadg message) {
        z21.iobyxmoadg iobyxmoadgVarJztzpxfvev = jztzpxfvev();
        String strIobyxmoadg = message.iobyxmoadg();
        a31.iobyxmoadg.btonecajqb(iobyxmoadgVarJztzpxfvev, message.zoijcleaow(), strIobyxmoadg != null ? new lr0.eablkybsjg.nufgyqmvbu.zoijcleaow(strIobyxmoadg) : null, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ribwqtqdhb(ProductListMviFragment productListMviFragment, ru.myspar.proloyalty.catalog.impl.product_list.presentation.wkgbmnqykc it) {
        zdlpuopuiu.btonecajqb(it, "it");
        productListMviFragment.ylkuphrtab(it);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void rlfsiqarku(final String categoryTitle, final String categoryId) {
        nufgyqmvbu nufgyqmvbuVar = this.ageCheckedDialog;
        if (nufgyqmvbuVar == null || !nufgyqmvbuVar.isShowing()) {
            ac1.zoijcleaow zoijcleaowVar = ac1.zoijcleaow.f1546iobyxmoadg;
            oxmwwwfdhm oxmwwwfdhmVarRequireActivity = requireActivity();
            zdlpuopuiu.dxjokdxxww(oxmwwwfdhmVarRequireActivity, "requireActivity(...)");
            nufgyqmvbu nufgyqmvbuVarZoijcleaow = ac1.zoijcleaow.zoijcleaow(zoijcleaowVar, oxmwwwfdhmVarRequireActivity, new tg.iobyxmoadg() { // from class: tp0.gxszxtbevo
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return ProductListMviFragment.czzsidtyhn(this.f111144zdlpuopuiu, categoryTitle, categoryId);
                }
            }, new tg.iobyxmoadg() { // from class: tp0.lqeggnwhkg
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return ProductListMviFragment.uwvvkdfqfp(this.f111148zdlpuopuiu, categoryTitle, categoryId);
                }
            }, null, null, 24, null);
            this.ageCheckedDialog = nufgyqmvbuVarZoijcleaow;
            if (nufgyqmvbuVarZoijcleaow != null) {
                u51.zoijcleaow.wkgbmnqykc(nufgyqmvbuVarZoijcleaow, ikoacuggdj(), v51.eablkybsjg.iobyxmoadg("PRODUCT_LIST_PAGER_SCREEN_KEY"));
            }
        }
    }

    private final void sflfametgt() {
        oxmwwwfdhm oxmwwwfdhmVarRequireActivity = requireActivity();
        zdlpuopuiu.dxjokdxxww(oxmwwwfdhmVarRequireActivity, "requireActivity(...)");
        u51.zoijcleaow.wkgbmnqykc(new y81.wkgbmnqykc(oxmwwwfdhmVarRequireActivity, new tg.iobyxmoadg() { // from class: tp0.btonecajqb
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ProductListMviFragment.zfvoamnweg(this.f111135zdlpuopuiu);
            }
        }, null, 4, null), ikoacuggdj(), v51.eablkybsjg.iobyxmoadg("PRODUCT_LIST_PAGER_SCREEN_KEY"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn uwvvkdfqfp(ProductListMviFragment productListMviFragment, String str, String str2) {
        productListMviFragment.pkzmftpjix().jyumaefscl(new ru.myspar.proloyalty.catalog.impl.product_list.presentation.wkgbmnqykc.zoijcleaow(false, str, str2));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn vipkmwdibw(ProductListMviFragment productListMviFragment, tp0.rgvfuqvkyq rgvfuqvkyqVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
        productListMviFragment.wwaezpbzkn(rgvfuqvkyqVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn weqkydbzbr(ChangeProductParams changeProductParams, ProductListMviFragment productListMviFragment) {
        if (changeProductParams != null) {
            productListMviFragment.ylkuphrtab(new ru.myspar.proloyalty.catalog.impl.product_list.presentation.wkgbmnqykc.wflxmlrfwp(changeProductParams));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ydmasvzmpa(ProductListMviFragment productListMviFragment) {
        a31.iobyxmoadg.eablkybsjg(productListMviFragment.jztzpxfvev(), bp0.lqeggnwhkg.proloyalty_purchases_list_product_added_to_the_list);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void yfnezrywwk(PurchaseListAddProductDialogArgs args) {
        BaseComposeMviBottomSheetDialogFragment baseComposeMviBottomSheetDialogFragmentDxjokdxxww = okpsazkaxt().dxjokdxxww(args, new tg.iobyxmoadg() { // from class: tp0.eablkybsjg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ProductListMviFragment.ydmasvzmpa(this.f111140zdlpuopuiu);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        zdlpuopuiu.dxjokdxxww(childFragmentManager, "getChildFragmentManager(...)");
        baseComposeMviBottomSheetDialogFragmentDxjokdxxww.ntlheqmsrt(childFragmentManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn zeieaojujs(ProductListMviFragment productListMviFragment, mz0.ppxfxbqfkf it) {
        zdlpuopuiu.btonecajqb(it, "it");
        productListMviFragment.pkzmftpjix().jyumaefscl(new ru.myspar.proloyalty.catalog.impl.product_list.presentation.wkgbmnqykc.cqumvgiudr(it));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn zfvoamnweg(ProductListMviFragment productListMviFragment) {
        productListMviFragment.ylkuphrtab(ru.myspar.proloyalty.catalog.impl.product_list.presentation.wkgbmnqykc.agtfadlqog.f93255iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public final u51.iobyxmoadg ikoacuggdj() {
        u51.iobyxmoadg iobyxmoadgVar = this.dialogManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("dialogManager");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseComposeMviFragment
    /* JADX INFO: renamed from: jhduphickx, reason: merged with bridge method [inline-methods] */
    public ru.myspar.proloyalty.catalog.impl.product_list.presentation.zoijcleaow pkzmftpjix() {
        return (ru.myspar.proloyalty.catalog.impl.product_list.presentation.zoijcleaow) this.binder.getValue();
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseComposeMviFragment
    /* JADX INFO: renamed from: jlmebxxoox, reason: merged with bridge method [inline-methods] */
    public void wwaezpbzkn(final tp0.rgvfuqvkyq model, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        zdlpuopuiu.btonecajqb(model, "model");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-1793208554);
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
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1793208554, i14, -1, "ru.myspar.proloyalty.catalog.impl.product_list.presentation.ProductListMviFragment.Render (ProductListMviFragment.kt:85)");
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
            draadjrbmkVarBtonecajqb.sopmlzcsov(299777286);
            boolean zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(vdvldrhtssVar) | draadjrbmkVarBtonecajqb.lmojexxdyd(this) | draadjrbmkVarBtonecajqb.lmojexxdyd(cllcsxoeizVar) | draadjrbmkVarBtonecajqb.ulzqkzuiru(metgxyhuheVarLqeggnwhkg);
            Object objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zLmojexxdyd || objYadqdtsiqt2 == iobyxmoadgVar.iobyxmoadg()) {
                zoijcleaow zoijcleaowVar = new zoijcleaow(vdvldrhtssVar, this, cllcsxoeizVar, metgxyhuheVarLqeggnwhkg, null);
                draadjrbmkVarBtonecajqb.jyumaefscl(zoijcleaowVar);
                objYadqdtsiqt2 = zoijcleaowVar;
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            androidx.compose.runtime.jlmebxxoox.eablkybsjg(lifecycle, (rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVarBtonecajqb, 0);
            draadjrbmkVarBtonecajqb.sopmlzcsov(299794256);
            boolean zLmojexxdyd2 = draadjrbmkVarBtonecajqb.lmojexxdyd(this);
            Object objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zLmojexxdyd2 || objYadqdtsiqt3 == iobyxmoadgVar.iobyxmoadg()) {
                objYadqdtsiqt3 = new tg.draadjrbmk() { // from class: tp0.gtknphoqwx
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return ProductListMviFragment.ribwqtqdhb(this.f111141zdlpuopuiu, (ru.myspar.proloyalty.catalog.impl.product_list.presentation.wkgbmnqykc) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            up0.kcexrzcfyt.pmvmpeiblj(model, metgxyhuheVarLqeggnwhkg, (tg.draadjrbmk) objYadqdtsiqt3, draadjrbmkVarBtonecajqb, i14 & 14);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: tp0.draadjrbmk
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return ProductListMviFragment.vipkmwdibw(this.f111138zdlpuopuiu, model, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final z21.iobyxmoadg jztzpxfvev() {
        z21.iobyxmoadg iobyxmoadgVar = this.snackbarManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("snackbarManager");
        return null;
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseComposeMviFragment
    /* JADX INFO: renamed from: metgxyhuhe, reason: merged with bridge method [inline-methods] */
    public void hcddaimhww(ru.myspar.proloyalty.catalog.impl.product_list.presentation.eablkybsjg uiLabel) {
        zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
        if (zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.proloyalty.catalog.impl.product_list.presentation.eablkybsjg.iobyxmoadg.f93236iobyxmoadg)) {
            return;
        }
        if (zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.proloyalty.catalog.impl.product_list.presentation.eablkybsjg.zoijcleaow.f93247iobyxmoadg)) {
            a31.iobyxmoadg.eablkybsjg(jztzpxfvev(), bp0.lqeggnwhkg.proloyalty_purchases_list_product_added_to_the_list);
            return;
        }
        if (zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.proloyalty.catalog.impl.product_list.presentation.eablkybsjg.wkgbmnqykc.f93246iobyxmoadg)) {
            sflfametgt();
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.catalog.impl.product_list.presentation.eablkybsjg.C2186eablkybsjg) {
            oipsdeybqn(((ru.myspar.proloyalty.catalog.impl.product_list.presentation.eablkybsjg.C2186eablkybsjg) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.catalog.impl.product_list.presentation.eablkybsjg.gxszxtbevo) {
            yfnezrywwk(((ru.myspar.proloyalty.catalog.impl.product_list.presentation.eablkybsjg.gxszxtbevo) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.catalog.impl.product_list.presentation.eablkybsjg.nufgyqmvbu) {
            opjhrmiecq(((ru.myspar.proloyalty.catalog.impl.product_list.presentation.eablkybsjg.nufgyqmvbu) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.catalog.impl.product_list.presentation.eablkybsjg.dxjokdxxww) {
            iyctptxqzt(((ru.myspar.proloyalty.catalog.impl.product_list.presentation.eablkybsjg.dxjokdxxww) uiLabel).iobyxmoadg());
            return;
        }
        if (zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.proloyalty.catalog.impl.product_list.presentation.eablkybsjg.btonecajqb.f93227iobyxmoadg)) {
            a31.iobyxmoadg.dxjokdxxww(jztzpxfvev(), bp0.lqeggnwhkg.proloyalty_order_edit_delivery_price_changed, null, null, 6, null);
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.catalog.impl.product_list.presentation.eablkybsjg.gtknphoqwx) {
            ru.myspar.proloyalty.catalog.impl.product_list.presentation.eablkybsjg.gtknphoqwx gtknphoqwxVar = (ru.myspar.proloyalty.catalog.impl.product_list.presentation.eablkybsjg.gtknphoqwx) uiLabel;
            HintUiModel hintUiModelZoijcleaow = gtknphoqwxVar.zoijcleaow();
            HintDialogAnalyticsInfo hintDialogAnalyticsInfoIobyxmoadg = gtknphoqwxVar.iobyxmoadg();
            oxmwwwfdhm oxmwwwfdhmVarRequireActivity = requireActivity();
            zdlpuopuiu.dxjokdxxww(oxmwwwfdhmVarRequireActivity, "requireActivity(...)");
            ms0.zoijcleaow.iobyxmoadg(hintUiModelZoijcleaow, hintDialogAnalyticsInfoIobyxmoadg, oxmwwwfdhmVarRequireActivity);
            return;
        }
        if (zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.proloyalty.catalog.impl.product_list.presentation.eablkybsjg.draadjrbmk.f93228iobyxmoadg)) {
            a31.iobyxmoadg.ppxfxbqfkf(jztzpxfvev(), bp0.lqeggnwhkg.proloyalty_product_not_available, null, lr0.eablkybsjg.gxszxtbevo.NonFatal, 2, null);
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.catalog.impl.product_list.presentation.eablkybsjg.wflxmlrfwp) {
            ru.myspar.proloyalty.catalog.impl.product_list.presentation.eablkybsjg.wflxmlrfwp wflxmlrfwpVar = (ru.myspar.proloyalty.catalog.impl.product_list.presentation.eablkybsjg.wflxmlrfwp) uiLabel;
            lrnfpwlwnk(wflxmlrfwpVar.zoijcleaow(), wflxmlrfwpVar.ppxfxbqfkf(), wflxmlrfwpVar.iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.catalog.impl.product_list.presentation.eablkybsjg.agtfadlqog) {
            nuxfzjnpeb(((ru.myspar.proloyalty.catalog.impl.product_list.presentation.eablkybsjg.agtfadlqog) uiLabel).iobyxmoadg());
            return;
        }
        if (zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.proloyalty.catalog.impl.product_list.presentation.eablkybsjg.ojitshcjhn.f93239iobyxmoadg)) {
            a31.iobyxmoadg.eablkybsjg(jztzpxfvev(), bp0.lqeggnwhkg.proloyalty_msg_product_adding_to_edit_order);
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.catalog.impl.product_list.presentation.eablkybsjg.rgvfuqvkyq) {
            a31.iobyxmoadg.btonecajqb(jztzpxfvev(), ((ru.myspar.proloyalty.catalog.impl.product_list.presentation.eablkybsjg.rgvfuqvkyq) uiLabel).iobyxmoadg(), null, null, 6, null);
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.catalog.impl.product_list.presentation.eablkybsjg.lqeggnwhkg) {
            lmojexxdyd(((ru.myspar.proloyalty.catalog.impl.product_list.presentation.eablkybsjg.lqeggnwhkg) uiLabel).iobyxmoadg());
        } else {
            if (!(uiLabel instanceof ru.myspar.proloyalty.catalog.impl.product_list.presentation.eablkybsjg.ppxfxbqfkf)) {
                throw new NoWhenBranchMatchedException();
            }
            ru.myspar.proloyalty.catalog.impl.product_list.presentation.eablkybsjg.ppxfxbqfkf ppxfxbqfkfVar = (ru.myspar.proloyalty.catalog.impl.product_list.presentation.eablkybsjg.ppxfxbqfkf) uiLabel;
            rlfsiqarku(ppxfxbqfkfVar.zoijcleaow(), ppxfxbqfkfVar.iobyxmoadg());
        }
    }

    public final ri1.iobyxmoadg okpsazkaxt() {
        ri1.iobyxmoadg iobyxmoadgVar = this.purchasesFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("purchasesFeatureApi");
        return null;
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseComposeMviFragment, ru.myspar.proloyalty.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean isHidden) {
        super.onHiddenChanged(isHidden);
        ylkuphrtab(new ru.myspar.proloyalty.catalog.impl.product_list.presentation.wkgbmnqykc.gtknphoqwx(isHidden));
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseComposeMviFragment, ru.myspar.proloyalty.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        ylkuphrtab(new ru.myspar.proloyalty.catalog.impl.product_list.presentation.wkgbmnqykc.esjtqupxsv(true));
    }

    @Override // ru.myspar.proloyalty.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onStop() {
        ylkuphrtab(new ru.myspar.proloyalty.catalog.impl.product_list.presentation.wkgbmnqykc.esjtqupxsv(false));
        super.onStop();
    }

    public final kt1.iobyxmoadg xrmfcynszj() {
        kt1.iobyxmoadg iobyxmoadgVar = this.storyFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("storyFeatureApi");
        return null;
    }
}
