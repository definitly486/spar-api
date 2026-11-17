package ru.myspar.proloyalty.catalog.impl.search;

import android.app.Dialog;
import android.content.Context;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.oxmwwwfdhm;
import androidx.fragment.app.stevsuqkhv;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.dxjokdxxww;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.ribwqtqdhb;
import bp0.lqeggnwhkg;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import gg.ojitshcjhn;
import gg.wwaezpbzkn;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;
import ow0.nufgyqmvbu;
import ru.myspar.proloyalty.catalog.api.model.SearchPayload;
import ru.myspar.proloyalty.catalog.impl.choosesort.domain.ChooseSortDialogArgs;
import ru.myspar.proloyalty.catalog.impl.choosesort.presentation.ChooseSortDialogFragment;
import ru.myspar.proloyalty.catalog.impl.search.SearchFragment;
import ru.myspar.proloyalty.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.core.base.mvi.bottomsheet.BaseComposeMviBottomSheetDialogFragment;
import ru.myspar.proloyalty.purchases.api.model.PurchaseListAddProductDialogArgs;
import yp0.rgvfuqvkyq;
import zp0.lmojexxdyd;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 F2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001GB\t\b\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0007J\u000f\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0007J\u000f\u0010\u0019\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u0007J\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001aH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\nH\u0016¢\u0006\u0004\b&\u0010\u0007R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001b\u0010<\u001a\u0002078TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0018\u0010@\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u001b\u0010E\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u00109\u001a\u0004\bC\u0010D¨\u0006H"}, d2 = {"Lru/myspar/proloyalty/catalog/impl/search/SearchFragment;", "Lru/myspar/proloyalty/core/base/mvi/fragment/BaseComposeMviFragment;", "Lyp0/rgvfuqvkyq;", "Lru/myspar/proloyalty/catalog/impl/search/wkgbmnqykc;", "Lru/myspar/proloyalty/catalog/impl/search/eablkybsjg;", "Lj21/iobyxmoadg;", "<init>", "()V", "Lbq0/iobyxmoadg;", "params", "Lgg/wwaezpbzkn;", "metgxyhuhe", "(Lbq0/iobyxmoadg;)V", "Lru/myspar/proloyalty/purchases/api/model/PurchaseListAddProductDialogArgs;", "args", "yfnezrywwk", "(Lru/myspar/proloyalty/purchases/api/model/PurchaseListAddProductDialogArgs;)V", "Lmz0/ppxfxbqfkf;", "selected", "", "supportedTypes", "sflfametgt", "(Lmz0/ppxfxbqfkf;Ljava/util/List;)V", "oipsdeybqn", "onStart", "onStop", "", "isHidden", "onHiddenChanged", "(Z)V", CommonUrlParts.MODEL, "crxdokpmqz", "(Lyp0/rgvfuqvkyq;Landroidx/compose/runtime/draadjrbmk;I)V", "uiLabel", "jztzpxfvev", "(Lru/myspar/proloyalty/catalog/impl/search/eablkybsjg;)V", "gxszxtbevo", "()Z", "onDestroyView", "Lri1/iobyxmoadg;", "esjtqupxsv", "Lri1/iobyxmoadg;", "ikoacuggdj", "()Lri1/iobyxmoadg;", "setPurchasesFeatureApi", "(Lri1/iobyxmoadg;)V", "purchasesFeatureApi", "Lz21/iobyxmoadg;", "lereixgezr", "Lz21/iobyxmoadg;", "okpsazkaxt", "()Lz21/iobyxmoadg;", "setSnackbarManager", "(Lz21/iobyxmoadg;)V", "snackbarManager", "Lru/myspar/proloyalty/catalog/impl/search/zoijcleaow;", "pmvmpeiblj", "Lgg/gtknphoqwx;", "vipkmwdibw", "()Lru/myspar/proloyalty/catalog/impl/search/zoijcleaow;", "binder", "Landroid/app/Dialog;", "zynmafqrjb", "Landroid/app/Dialog;", "ageCheckedDialog", "Lru/myspar/proloyalty/catalog/api/model/SearchPayload;", "istkbnxepw", "jhduphickx", "()Lru/myspar/proloyalty/catalog/api/model/SearchPayload;", "payload", "cdpycssgdh", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SearchFragment extends iobyxmoadg implements j21.iobyxmoadg {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    public static final int f93302yadqdtsiqt = 8;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    public ri1.iobyxmoadg purchasesFeatureApi;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx payload;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    public z21.iobyxmoadg snackbarManager;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx binder;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    private Dialog ageCheckedDialog;

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f93308yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f93309zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(tg.iobyxmoadg iobyxmoadgVar, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f93309zdlpuopuiu = iobyxmoadgVar;
            this.f93308yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f93309zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f93308yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f93310yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f93311zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(Fragment fragment, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f93311zdlpuopuiu = fragment;
            this.f93310yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f93310yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f93311zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.catalog.impl.search.SearchFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final SearchFragment iobyxmoadg(SearchPayload payload) {
            zdlpuopuiu.btonecajqb(payload, "payload");
            SearchFragment searchFragment = new SearchFragment();
            g21.iobyxmoadg.zoijcleaow(searchFragment, payload, false, 2, null);
            return searchFragment;
        }

        private Companion() {
        }
    }

    public static final class ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f93312zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f93312zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f93312zdlpuopuiu.invoke();
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f93313zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f93313zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f93313zdlpuopuiu).getViewModelStore();
        }
    }

    public static final class zoijcleaow extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f93314zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(Fragment fragment) {
            super(0);
            this.f93314zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f93314zdlpuopuiu;
        }
    }

    public SearchFragment() {
        gtknphoqwx gtknphoqwxVarIobyxmoadg = draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new ppxfxbqfkf(new zoijcleaow(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(ru.myspar.proloyalty.catalog.impl.search.zoijcleaow.class), new wkgbmnqykc(gtknphoqwxVarIobyxmoadg), new eablkybsjg(null, gtknphoqwxVarIobyxmoadg), new gxszxtbevo(this, gtknphoqwxVarIobyxmoadg));
        this.payload = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: yp0.draadjrbmk
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return SearchFragment.xrmfcynszj(this.f126112zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn czzsidtyhn(SearchFragment searchFragment) {
        searchFragment.ylkuphrtab(ru.myspar.proloyalty.catalog.impl.search.wkgbmnqykc.ppxfxbqfkf.f93374iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final SearchPayload jhduphickx() {
        return (SearchPayload) this.payload.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn jlmebxxoox(SearchFragment searchFragment, ru.myspar.proloyalty.catalog.impl.search.wkgbmnqykc it) {
        zdlpuopuiu.btonecajqb(it, "it");
        searchFragment.ylkuphrtab(it);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void metgxyhuhe(final bq0.iobyxmoadg params) {
        Dialog dialog = this.ageCheckedDialog;
        if (dialog == null || !dialog.isShowing()) {
            ac1.zoijcleaow zoijcleaowVar = ac1.zoijcleaow.f1546iobyxmoadg;
            Context contextRequireContext = requireContext();
            zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
            nufgyqmvbu nufgyqmvbuVarZoijcleaow = ac1.zoijcleaow.zoijcleaow(zoijcleaowVar, contextRequireContext, new tg.iobyxmoadg() { // from class: yp0.dxjokdxxww
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return SearchFragment.rlfsiqarku(this.f126114zdlpuopuiu, params);
                }
            }, new tg.iobyxmoadg() { // from class: yp0.btonecajqb
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return SearchFragment.czzsidtyhn(this.f126111zdlpuopuiu);
                }
            }, new tg.iobyxmoadg() { // from class: yp0.gtknphoqwx
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return SearchFragment.uwvvkdfqfp(this.f126116zdlpuopuiu);
                }
            }, null, 16, null);
            this.ageCheckedDialog = nufgyqmvbuVarZoijcleaow;
            if (nufgyqmvbuVarZoijcleaow != null) {
                nufgyqmvbuVarZoijcleaow.show();
            }
        }
    }

    private final void oipsdeybqn() {
        if (jhduphickx().getFlow() == mz0.iobyxmoadg.ORDER_EDIT) {
            a31.iobyxmoadg.eablkybsjg(okpsazkaxt(), lqeggnwhkg.proloyalty_msg_product_adding_to_edit_order);
        } else {
            a31.iobyxmoadg.eablkybsjg(okpsazkaxt(), lqeggnwhkg.proloyalty_msg_product_adding_to_cart);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ribwqtqdhb(SearchFragment searchFragment, rgvfuqvkyq rgvfuqvkyqVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
        searchFragment.wwaezpbzkn(rgvfuqvkyqVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn rlfsiqarku(SearchFragment searchFragment, bq0.iobyxmoadg iobyxmoadgVar) {
        searchFragment.ylkuphrtab(new ru.myspar.proloyalty.catalog.impl.search.wkgbmnqykc.zoijcleaow(iobyxmoadgVar));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void sflfametgt(mz0.ppxfxbqfkf selected, List supportedTypes) {
        ChooseSortDialogFragment chooseSortDialogFragmentIobyxmoadg = ChooseSortDialogFragment.INSTANCE.iobyxmoadg(new ChooseSortDialogArgs(selected, supportedTypes, null, 4, null), new tg.draadjrbmk() { // from class: yp0.eablkybsjg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SearchFragment.zfvoamnweg(this.f126115zdlpuopuiu, (mz0.ppxfxbqfkf) obj);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        zdlpuopuiu.dxjokdxxww(childFragmentManager, "getChildFragmentManager(...)");
        chooseSortDialogFragmentIobyxmoadg.ntlheqmsrt(childFragmentManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn uwvvkdfqfp(SearchFragment searchFragment) {
        searchFragment.ylkuphrtab(ru.myspar.proloyalty.catalog.impl.search.wkgbmnqykc.ppxfxbqfkf.f93374iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchPayload xrmfcynszj(SearchFragment searchFragment) {
        return (SearchPayload) jr0.zoijcleaow.wkgbmnqykc(searchFragment, cllcsxoeiz.zoijcleaow(SearchPayload.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ydmasvzmpa(SearchFragment searchFragment) {
        a31.iobyxmoadg.eablkybsjg(searchFragment.okpsazkaxt(), lqeggnwhkg.proloyalty_purchases_list_product_added_to_the_list);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void yfnezrywwk(PurchaseListAddProductDialogArgs args) {
        BaseComposeMviBottomSheetDialogFragment baseComposeMviBottomSheetDialogFragmentDxjokdxxww = ikoacuggdj().dxjokdxxww(args, new tg.iobyxmoadg() { // from class: yp0.gxszxtbevo
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return SearchFragment.ydmasvzmpa(this.f126117zdlpuopuiu);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        zdlpuopuiu.dxjokdxxww(childFragmentManager, "getChildFragmentManager(...)");
        baseComposeMviBottomSheetDialogFragmentDxjokdxxww.ntlheqmsrt(childFragmentManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn zfvoamnweg(SearchFragment searchFragment, mz0.ppxfxbqfkf it) {
        zdlpuopuiu.btonecajqb(it, "it");
        searchFragment.ylkuphrtab(new ru.myspar.proloyalty.catalog.impl.search.wkgbmnqykc.jyumaefscl(it));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseComposeMviFragment
    /* JADX INFO: renamed from: crxdokpmqz, reason: merged with bridge method [inline-methods] */
    public void wwaezpbzkn(final rgvfuqvkyq model, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        zdlpuopuiu.btonecajqb(model, "model");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-2081705428);
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
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-2081705428, i14, -1, "ru.myspar.proloyalty.catalog.impl.search.SearchFragment.Render (SearchFragment.kt:71)");
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(-454135421);
            boolean zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(this);
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zLmojexxdyd || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new tg.draadjrbmk() { // from class: yp0.lqeggnwhkg
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return SearchFragment.jlmebxxoox(this.f126119zdlpuopuiu, (ru.myspar.proloyalty.catalog.impl.search.wkgbmnqykc) obj);
                    }
                };
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            lmojexxdyd.zoijcleaow(model, (tg.draadjrbmk) objYadqdtsiqt, draadjrbmkVarBtonecajqb, i14 & 14);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: yp0.nufgyqmvbu
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return SearchFragment.ribwqtqdhb(this.f126122zdlpuopuiu, model, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // j21.iobyxmoadg
    public boolean gxszxtbevo() {
        ylkuphrtab(ru.myspar.proloyalty.catalog.impl.search.wkgbmnqykc.C2189wkgbmnqykc.f93381iobyxmoadg);
        return true;
    }

    public final ri1.iobyxmoadg ikoacuggdj() {
        ri1.iobyxmoadg iobyxmoadgVar = this.purchasesFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("purchasesFeatureApi");
        return null;
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseComposeMviFragment
    /* JADX INFO: renamed from: jztzpxfvev, reason: merged with bridge method [inline-methods] */
    public void hcddaimhww(ru.myspar.proloyalty.catalog.impl.search.eablkybsjg uiLabel) {
        zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
        if (uiLabel instanceof ru.myspar.proloyalty.catalog.impl.search.eablkybsjg.C2188eablkybsjg) {
            a31.iobyxmoadg.ppxfxbqfkf(okpsazkaxt(), lqeggnwhkg.proloyalty_product_not_available, null, lr0.eablkybsjg.gxszxtbevo.NonFatal, 2, null);
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.catalog.impl.search.eablkybsjg.ppxfxbqfkf) {
            a31.iobyxmoadg.ppxfxbqfkf(okpsazkaxt(), lqeggnwhkg.proloyalty_order_edit_delivery_price_changed, null, lr0.eablkybsjg.gxszxtbevo.NonFatal, 2, null);
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.catalog.impl.search.eablkybsjg.iobyxmoadg) {
            metgxyhuhe(((ru.myspar.proloyalty.catalog.impl.search.eablkybsjg.iobyxmoadg) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.catalog.impl.search.eablkybsjg.dxjokdxxww) {
            a31.iobyxmoadg.btonecajqb(okpsazkaxt(), ((ru.myspar.proloyalty.catalog.impl.search.eablkybsjg.dxjokdxxww) uiLabel).iobyxmoadg(), null, null, 6, null);
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.catalog.impl.search.eablkybsjg.zoijcleaow) {
            yfnezrywwk(((ru.myspar.proloyalty.catalog.impl.search.eablkybsjg.zoijcleaow) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.catalog.impl.search.eablkybsjg.lqeggnwhkg) {
            ru.myspar.proloyalty.catalog.impl.search.eablkybsjg.lqeggnwhkg lqeggnwhkgVar = (ru.myspar.proloyalty.catalog.impl.search.eablkybsjg.lqeggnwhkg) uiLabel;
            sflfametgt(lqeggnwhkgVar.zoijcleaow(), lqeggnwhkgVar.iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.catalog.impl.search.eablkybsjg.nufgyqmvbu) {
            oipsdeybqn();
            return;
        }
        if (!(uiLabel instanceof ru.myspar.proloyalty.catalog.impl.search.eablkybsjg.wkgbmnqykc)) {
            if (!(uiLabel instanceof ru.myspar.proloyalty.catalog.impl.search.eablkybsjg.gxszxtbevo)) {
                throw new NoWhenBranchMatchedException();
            }
            a31.iobyxmoadg.eablkybsjg(okpsazkaxt(), ((ru.myspar.proloyalty.catalog.impl.search.eablkybsjg.gxszxtbevo) uiLabel).iobyxmoadg());
        } else {
            ru.myspar.proloyalty.catalog.impl.search.eablkybsjg.wkgbmnqykc wkgbmnqykcVar = (ru.myspar.proloyalty.catalog.impl.search.eablkybsjg.wkgbmnqykc) uiLabel;
            HintUiModel hintUiModelZoijcleaow = wkgbmnqykcVar.zoijcleaow();
            HintDialogAnalyticsInfo hintDialogAnalyticsInfoIobyxmoadg = wkgbmnqykcVar.iobyxmoadg();
            oxmwwwfdhm oxmwwwfdhmVarRequireActivity = requireActivity();
            zdlpuopuiu.dxjokdxxww(oxmwwwfdhmVarRequireActivity, "requireActivity(...)");
            ms0.zoijcleaow.iobyxmoadg(hintUiModelZoijcleaow, hintDialogAnalyticsInfoIobyxmoadg, oxmwwwfdhmVarRequireActivity);
        }
    }

    public final z21.iobyxmoadg okpsazkaxt() {
        z21.iobyxmoadg iobyxmoadgVar = this.snackbarManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("snackbarManager");
        return null;
    }

    @Override // ru.myspar.proloyalty.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Dialog dialog = this.ageCheckedDialog;
        if (dialog != null) {
            dialog.dismiss();
        }
        this.ageCheckedDialog = null;
        super.onDestroyView();
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseComposeMviFragment, ru.myspar.proloyalty.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean isHidden) {
        super.onHiddenChanged(isHidden);
        pkzmftpjix().jlmebxxoox(isHidden);
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseComposeMviFragment, ru.myspar.proloyalty.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        pkzmftpjix().ribwqtqdhb(true);
    }

    @Override // ru.myspar.proloyalty.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onStop() {
        pkzmftpjix().ribwqtqdhb(false);
        super.onStop();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseComposeMviFragment
    /* JADX INFO: renamed from: vipkmwdibw, reason: merged with bridge method [inline-methods] */
    public ru.myspar.proloyalty.catalog.impl.search.zoijcleaow pkzmftpjix() {
        return (ru.myspar.proloyalty.catalog.impl.search.zoijcleaow) this.binder.getValue();
    }
}
