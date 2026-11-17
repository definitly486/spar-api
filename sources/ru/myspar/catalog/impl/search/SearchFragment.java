package ru.myspar.catalog.impl.search;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.stevsuqkhv;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.ntlheqmsrt;
import androidx.lifecycle.ribwqtqdhb;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.yadqdtsiqt;
import nr.iozdgvuglv;
import ru.myspar.catalog.api.model.SearchPayload;
import ru.myspar.catalog.impl.choosesort.domain.ChooseSortDialogArgs;
import ru.myspar.catalog.impl.choosesort.presentation.ChooseSortDialogFragment;
import ru.myspar.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.core.base.mvi.bottomsheet.BaseComposeMviBottomSheetDialogFragment;
import ru.myspar.core.domain.interactor.product_change.models.ChangeProductParams;
import ru.myspar.core.domain.models.product.ProductListData;
import ru.myspar.purchases.api.model.PurchaseListAddProductDialogArgs;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 V2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001WB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0005J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J%\u0010(\u001a\u00020\n2\u0006\u0010%\u001a\u00020$2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020$0&H\u0002¢\u0006\u0004\b(\u0010)R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00109\u001a\u0002028\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010A\u001a\u00020:8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001b\u0010F\u001a\u00020\u00028TX\u0094\u0084\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001b\u0010L\u001a\u00020G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u001b\u0010Q\u001a\u00020M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u0010C\u001a\u0004\bO\u0010PR\u0018\u0010U\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010T¨\u0006X"}, d2 = {"Lru/myspar/catalog/impl/search/SearchFragment;", "Lru/myspar/core/base/mvvm/BaseMvvmFragment;", "Lru/myspar/catalog/impl/search/zdlpuopuiu;", "Le40/iobyxmoadg;", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lgg/wwaezpbzkn;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "gxszxtbevo", "()Z", "onDestroyView", "Lru/myspar/catalog/impl/search/vdvldrhtss;", "uiLabel", "ikoacuggdj", "(Lru/myspar/catalog/impl/search/vdvldrhtss;)V", "Lru/myspar/core/domain/models/product/ProductListData;", "products", "Lru/myspar/catalog/impl/search/zdlpuopuiu$zoijcleaow;", "params", "jztzpxfvev", "(Lru/myspar/core/domain/models/product/ProductListData;Lru/myspar/catalog/impl/search/zdlpuopuiu$zoijcleaow;)V", "Lru/myspar/purchases/api/model/PurchaseListAddProductDialogArgs;", "args", "yfnezrywwk", "(Lru/myspar/purchases/api/model/PurchaseListAddProductDialogArgs;)V", "Lru/myspar/core/domain/interactor/product_change/models/ChangeProductParams;", "", "message", "czzsidtyhn", "(Lru/myspar/core/domain/interactor/product_change/models/ChangeProductParams;Ljava/lang/String;)V", "Lv00/ppxfxbqfkf;", "selected", "", "supportedTypes", "sflfametgt", "(Lv00/ppxfxbqfkf;Ljava/util/List;)V", "Lru/myspar/catalog/impl/search/iobyxmoadg;", "esjtqupxsv", "Lru/myspar/catalog/impl/search/iobyxmoadg;", "sopmlzcsov", "()Lru/myspar/catalog/impl/search/iobyxmoadg;", "setAssistedFactory", "(Lru/myspar/catalog/impl/search/iobyxmoadg;)V", "assistedFactory", "Llx1/iobyxmoadg;", "lereixgezr", "Llx1/iobyxmoadg;", "ribwqtqdhb", "()Llx1/iobyxmoadg;", "setPurchasesFeatureApi", "(Llx1/iobyxmoadg;)V", "purchasesFeatureApi", "Lq40/iobyxmoadg;", "pmvmpeiblj", "Lq40/iobyxmoadg;", "vipkmwdibw", "()Lq40/iobyxmoadg;", "setSnackbarManager", "(Lq40/iobyxmoadg;)V", "snackbarManager", "zynmafqrjb", "Lgg/gtknphoqwx;", "jhduphickx", "()Lru/myspar/catalog/impl/search/zdlpuopuiu;", "viewModel", "Lb60/iobyxmoadg;", "istkbnxepw", "Lys/ppxfxbqfkf;", "crxdokpmqz", "()Lb60/iobyxmoadg;", "binding", "Lru/myspar/catalog/api/model/SearchPayload;", "cdpycssgdh", "jlmebxxoox", "()Lru/myspar/catalog/api/model/SearchPayload;", "payload", "Landroid/app/Dialog;", "yadqdtsiqt", "Landroid/app/Dialog;", "ageCheckedDialog", "iozdgvuglv", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SearchFragment extends Hilt_SearchFragment<zdlpuopuiu> implements e40.iobyxmoadg {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata */
    private final gg.gtknphoqwx payload;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    public iobyxmoadg assistedFactory;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    private final ys.ppxfxbqfkf binding;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    public lx1.iobyxmoadg purchasesFeatureApi;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    public q40.iobyxmoadg snackbarManager;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata */
    private Dialog ageCheckedDialog;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    private final gg.gtknphoqwx viewModel;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f85383lmojexxdyd = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(SearchFragment.class, "binding", "getBinding()Lru/myspar/core/ui/databinding/ComposeViewBinding;", 0))};

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    public static final int f85384wwaezpbzkn = 8;

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f85392zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f85392zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f85392zdlpuopuiu.invoke();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f85393zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f85393zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f85393zdlpuopuiu).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: ru.myspar.catalog.impl.search.SearchFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final SearchFragment iobyxmoadg(SearchPayload payload) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(payload, "payload");
            SearchFragment searchFragment = new SearchFragment();
            b40.iobyxmoadg.zoijcleaow(searchFragment, payload, false, 2, null);
            return searchFragment;
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f85394yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f85395zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(tg.iobyxmoadg iobyxmoadgVar, gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f85395zdlpuopuiu = iobyxmoadgVar;
            this.f85394yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f85395zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f85394yggfygwlhe);
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
            zdlpuopuiu zdlpuopuiuVarIobyxmoadg = SearchFragment.this.sopmlzcsov().iobyxmoadg(SearchFragment.this.jlmebxxoox());
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(zdlpuopuiuVarIobyxmoadg, "null cannot be cast to non-null type T of ru.myspar.legacy.presentation.ext.ViewModelExtKt.viewModelProviderFactoryOf.<no name provided>.create");
            return zdlpuopuiuVarIobyxmoadg;
        }
    }

    static final class ppxfxbqfkf implements tg.rgvfuqvkyq {

        /* synthetic */ class iobyxmoadg extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
            iobyxmoadg(Object obj) {
                super(1, obj, SearchFragment.class, "handleUiLabel", "handleUiLabel(Lru/myspar/catalog/impl/search/SearchView$UiLabel;)V", 0);
            }

            @Override // tg.draadjrbmk
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                iobyxmoadg((vdvldrhtss) obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg(vdvldrhtss p13) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
                ((SearchFragment) this.receiver).ikoacuggdj(p13);
            }
        }

        static final class zoijcleaow implements tg.vdvldrhtss {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ SearchFragment f85398zdlpuopuiu;

            /* synthetic */ class iobyxmoadg extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
                iobyxmoadg(Object obj) {
                    super(1, obj, zdlpuopuiu.class, "onEvent", "onEvent(Lru/myspar/catalog/impl/search/SearchView$Event;)V", 0);
                }

                @Override // tg.draadjrbmk
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    iobyxmoadg((agtfadlqog) obj);
                    return wwaezpbzkn.f37140iobyxmoadg;
                }

                public final void iobyxmoadg(agtfadlqog p13) {
                    kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
                    ((zdlpuopuiu) this.receiver).h(p13);
                }
            }

            zoijcleaow(SearchFragment searchFragment) {
                this.f85398zdlpuopuiu = searchFragment;
            }

            @Override // tg.vdvldrhtss
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                iobyxmoadg((rgvfuqvkyq) obj, (androidx.compose.runtime.draadjrbmk) obj2, ((Number) obj3).intValue());
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg(rgvfuqvkyq model, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(model, "model");
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1504763598, i13, -1, "ru.myspar.catalog.impl.search.SearchFragment.onViewCreated.<anonymous>.<anonymous> (SearchFragment.kt:106)");
                }
                zdlpuopuiu zdlpuopuiuVarWwaezpbzkn = this.f85398zdlpuopuiu.wwaezpbzkn();
                draadjrbmkVar.sopmlzcsov(2125879892);
                boolean zLmojexxdyd = draadjrbmkVar.lmojexxdyd(zdlpuopuiuVarWwaezpbzkn);
                Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
                if (zLmojexxdyd || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                    objYadqdtsiqt = new iobyxmoadg(zdlpuopuiuVarWwaezpbzkn);
                    draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
                }
                draadjrbmkVar.stevsuqkhv();
                iozdgvuglv.zoijcleaow(model, (tg.draadjrbmk) ((ah.lqeggnwhkg) objYadqdtsiqt), draadjrbmkVar, i13 & 14);
                if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                    androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
                }
            }
        }

        ppxfxbqfkf() {
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
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(233073515, i13, -1, "ru.myspar.catalog.impl.search.SearchFragment.onViewCreated.<anonymous> (SearchFragment.kt:102)");
            }
            zdlpuopuiu zdlpuopuiuVarWwaezpbzkn = SearchFragment.this.wwaezpbzkn();
            SearchFragment searchFragment = SearchFragment.this;
            draadjrbmkVar.sopmlzcsov(273081298);
            boolean zLmojexxdyd = draadjrbmkVar.lmojexxdyd(searchFragment);
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (zLmojexxdyd || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new iobyxmoadg(searchFragment);
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVar.stevsuqkhv();
            vx.ppxfxbqfkf.zoijcleaow(zdlpuopuiuVarWwaezpbzkn, (tg.draadjrbmk) ((ah.lqeggnwhkg) objYadqdtsiqt), ezmngbhpjk.nufgyqmvbu.eablkybsjg(-1504763598, true, new zoijcleaow(SearchFragment.this), draadjrbmkVar, 54), draadjrbmkVar, 384);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f85399zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(Fragment fragment) {
            super(0);
            this.f85399zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f85399zdlpuopuiu;
        }
    }

    /* synthetic */ class zoijcleaow extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f85400zdlpuopuiu = new zoijcleaow();

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

    public SearchFragment() {
        super(s40.dxjokdxxww.compose_view);
        tg.iobyxmoadg iobyxmoadgVar = new tg.iobyxmoadg() { // from class: ru.myspar.catalog.impl.search.nufgyqmvbu
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return SearchFragment.oipsdeybqn(this.f85440zdlpuopuiu);
            }
        };
        gg.gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(gg.ojitshcjhn.NONE, new eablkybsjg(new wkgbmnqykc(this)));
        this.viewModel = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(zdlpuopuiu.class), new gxszxtbevo(gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(null, gtknphoqwxVarIobyxmoadg), iobyxmoadgVar);
        this.binding = ys.iobyxmoadg.zoijcleaow(this, zoijcleaow.f85400zdlpuopuiu);
        this.payload = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: ru.myspar.catalog.impl.search.dxjokdxxww
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return SearchFragment.okpsazkaxt(this.f85431zdlpuopuiu);
            }
        });
    }

    private final b60.iobyxmoadg crxdokpmqz() {
        return (b60.iobyxmoadg) this.binding.iobyxmoadg(this, f85383lmojexxdyd[0]);
    }

    private final void czzsidtyhn(final ChangeProductParams params, String message) {
        ee0.zoijcleaow zoijcleaowVar = ee0.zoijcleaow.f31209iobyxmoadg;
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        zoijcleaowVar.ppxfxbqfkf(contextRequireContext, message, new tg.iobyxmoadg() { // from class: ru.myspar.catalog.impl.search.ppxfxbqfkf
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return SearchFragment.uwvvkdfqfp(this.f85450zdlpuopuiu, params);
            }
        }, null).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ikoacuggdj(vdvldrhtss uiLabel) {
        if (uiLabel instanceof vdvldrhtss.gxszxtbevo) {
            r40.iobyxmoadg.ppxfxbqfkf(vipkmwdibw(), pq.lqeggnwhkg.product_not_available, null, ss.wkgbmnqykc.gxszxtbevo.NonFatal, 2, null);
            return;
        }
        if (uiLabel instanceof vdvldrhtss.wkgbmnqykc) {
            r40.iobyxmoadg.ppxfxbqfkf(vipkmwdibw(), pq.lqeggnwhkg.order_edit_delivery_price_changed, null, ss.wkgbmnqykc.gxszxtbevo.NonFatal, 2, null);
            return;
        }
        if (uiLabel instanceof vdvldrhtss.iobyxmoadg) {
            vdvldrhtss.iobyxmoadg iobyxmoadgVar = (vdvldrhtss.iobyxmoadg) uiLabel;
            jztzpxfvev(iobyxmoadgVar.zoijcleaow(), iobyxmoadgVar.iobyxmoadg());
            return;
        }
        if (uiLabel instanceof vdvldrhtss.dxjokdxxww) {
            r40.iobyxmoadg.btonecajqb(vipkmwdibw(), ((vdvldrhtss.dxjokdxxww) uiLabel).iobyxmoadg(), null, null, 6, null);
            return;
        }
        if (uiLabel instanceof vdvldrhtss.ppxfxbqfkf) {
            yfnezrywwk(((vdvldrhtss.ppxfxbqfkf) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof vdvldrhtss.zoijcleaow) {
            vdvldrhtss.zoijcleaow zoijcleaowVar = (vdvldrhtss.zoijcleaow) uiLabel;
            czzsidtyhn(zoijcleaowVar.zoijcleaow(), zoijcleaowVar.iobyxmoadg());
            return;
        }
        if (uiLabel instanceof vdvldrhtss.nufgyqmvbu) {
            vdvldrhtss.nufgyqmvbu nufgyqmvbuVar = (vdvldrhtss.nufgyqmvbu) uiLabel;
            sflfametgt(nufgyqmvbuVar.zoijcleaow(), nufgyqmvbuVar.iobyxmoadg());
            return;
        }
        if (!(uiLabel instanceof vdvldrhtss.eablkybsjg)) {
            if (!(uiLabel instanceof vdvldrhtss.lqeggnwhkg)) {
                throw new NoWhenBranchMatchedException();
            }
            r40.iobyxmoadg.eablkybsjg(vipkmwdibw(), ((vdvldrhtss.lqeggnwhkg) uiLabel).iobyxmoadg());
        } else {
            vdvldrhtss.eablkybsjg eablkybsjgVar = (vdvldrhtss.eablkybsjg) uiLabel;
            HintUiModel hintUiModelZoijcleaow = eablkybsjgVar.zoijcleaow();
            HintDialogAnalyticsInfo hintDialogAnalyticsInfoIobyxmoadg = eablkybsjgVar.iobyxmoadg();
            androidx.fragment.app.oxmwwwfdhm oxmwwwfdhmVarRequireActivity = requireActivity();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(oxmwwwfdhmVarRequireActivity, "requireActivity(...)");
            st.zoijcleaow.iobyxmoadg(hintUiModelZoijcleaow, hintDialogAnalyticsInfoIobyxmoadg, oxmwwwfdhmVarRequireActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SearchPayload jlmebxxoox() {
        return (SearchPayload) this.payload.getValue();
    }

    private final void jztzpxfvev(final ProductListData products, final zdlpuopuiu.zoijcleaow params) {
        Dialog dialog = this.ageCheckedDialog;
        if (dialog == null || !dialog.isShowing()) {
            ee0.zoijcleaow zoijcleaowVar = ee0.zoijcleaow.f31209iobyxmoadg;
            Context contextRequireContext = requireContext();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
            rx.nufgyqmvbu nufgyqmvbuVarZoijcleaow = ee0.zoijcleaow.zoijcleaow(zoijcleaowVar, contextRequireContext, new tg.iobyxmoadg() { // from class: ru.myspar.catalog.impl.search.wkgbmnqykc
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return SearchFragment.xrmfcynszj(this.f85479zdlpuopuiu, products, params);
                }
            }, new tg.iobyxmoadg() { // from class: ru.myspar.catalog.impl.search.eablkybsjg
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return SearchFragment.metgxyhuhe(this.f85432zdlpuopuiu);
                }
            }, new tg.iobyxmoadg() { // from class: ru.myspar.catalog.impl.search.gxszxtbevo
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return SearchFragment.rlfsiqarku(this.f85433zdlpuopuiu);
                }
            }, null, 16, null);
            this.ageCheckedDialog = nufgyqmvbuVarZoijcleaow;
            if (nufgyqmvbuVarZoijcleaow != null) {
                nufgyqmvbuVarZoijcleaow.show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn metgxyhuhe(SearchFragment searchFragment) {
        searchFragment.wwaezpbzkn().h(agtfadlqog.ppxfxbqfkf.f85419iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final crxdokpmqz.ppxfxbqfkf oipsdeybqn(SearchFragment searchFragment) {
        return searchFragment.new nufgyqmvbu();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchPayload okpsazkaxt(SearchFragment searchFragment) {
        return (SearchPayload) qs.ppxfxbqfkf.wkgbmnqykc(searchFragment, cllcsxoeiz.zoijcleaow(SearchPayload.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn rlfsiqarku(SearchFragment searchFragment) {
        searchFragment.wwaezpbzkn().h(agtfadlqog.ppxfxbqfkf.f85419iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void sflfametgt(v00.ppxfxbqfkf selected, List supportedTypes) {
        ChooseSortDialogFragment chooseSortDialogFragmentIobyxmoadg = ChooseSortDialogFragment.INSTANCE.iobyxmoadg(new ChooseSortDialogArgs(selected, supportedTypes, null, 4, null), new tg.draadjrbmk() { // from class: ru.myspar.catalog.impl.search.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SearchFragment.zfvoamnweg(this.f85671zdlpuopuiu, (v00.ppxfxbqfkf) obj);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(childFragmentManager, "getChildFragmentManager(...)");
        chooseSortDialogFragmentIobyxmoadg.ntlheqmsrt(childFragmentManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn uwvvkdfqfp(SearchFragment searchFragment, ChangeProductParams changeProductParams) {
        searchFragment.wwaezpbzkn().h(new agtfadlqog.wkgbmnqykc(changeProductParams));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn xrmfcynszj(SearchFragment searchFragment, ProductListData productListData, zdlpuopuiu.zoijcleaow zoijcleaowVar) {
        searchFragment.wwaezpbzkn().h(new agtfadlqog.zoijcleaow(productListData, zoijcleaowVar));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ydmasvzmpa(SearchFragment searchFragment) {
        r40.iobyxmoadg.eablkybsjg(searchFragment.vipkmwdibw(), pq.lqeggnwhkg.purchases_list_product_added_to_the_list);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void yfnezrywwk(PurchaseListAddProductDialogArgs args) {
        BaseComposeMviBottomSheetDialogFragment baseComposeMviBottomSheetDialogFragmentNufgyqmvbu = ribwqtqdhb().nufgyqmvbu(args, new tg.iobyxmoadg() { // from class: ru.myspar.catalog.impl.search.lqeggnwhkg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return SearchFragment.ydmasvzmpa(this.f85435zdlpuopuiu);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(childFragmentManager, "getChildFragmentManager(...)");
        baseComposeMviBottomSheetDialogFragmentNufgyqmvbu.ntlheqmsrt(childFragmentManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn zfvoamnweg(SearchFragment searchFragment, v00.ppxfxbqfkf it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        searchFragment.wwaezpbzkn().h(new agtfadlqog.iwizpuwonk(it));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // e40.iobyxmoadg
    public boolean gxszxtbevo() {
        wwaezpbzkn().h(agtfadlqog.eablkybsjg.f85406iobyxmoadg);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.core.base.mvvm.BaseMvvmFragment
    /* JADX INFO: renamed from: jhduphickx, reason: merged with bridge method [inline-methods] */
    public zdlpuopuiu wwaezpbzkn() {
        return (zdlpuopuiu) this.viewModel.getValue();
    }

    @Override // ru.myspar.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Dialog dialog = this.ageCheckedDialog;
        if (dialog != null) {
            dialog.dismiss();
        }
        this.ageCheckedDialog = null;
        super.onDestroyView();
    }

    @Override // ru.myspar.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(view, "view");
        super.onViewCreated(view, savedInstanceState);
        crxdokpmqz().f15357zoijcleaow.setContent(ezmngbhpjk.nufgyqmvbu.ppxfxbqfkf(233073515, true, new ppxfxbqfkf()));
    }

    public final lx1.iobyxmoadg ribwqtqdhb() {
        lx1.iobyxmoadg iobyxmoadgVar = this.purchasesFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("purchasesFeatureApi");
        return null;
    }

    public final iobyxmoadg sopmlzcsov() {
        iobyxmoadg iobyxmoadgVar = this.assistedFactory;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("assistedFactory");
        return null;
    }

    public final q40.iobyxmoadg vipkmwdibw() {
        q40.iobyxmoadg iobyxmoadgVar = this.snackbarManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("snackbarManager");
        return null;
    }
}
