package ru.myspar.proloyalty.catalog.impl.specific_product.presentation;

import android.content.Context;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.b;
import androidx.compose.runtime.f;
import androidx.compose.runtime.lmojexxdyd;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.oxmwwwfdhm;
import androidx.fragment.app.stevsuqkhv;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.dxjokdxxww;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.ribwqtqdhb;
import com.google.android.gms.common.internal.ImagesContract;
import fq0.nufgyqmvbu;
import gg.gtknphoqwx;
import gg.ojitshcjhn;
import gg.wwaezpbzkn;
import gq0.ikoacuggdj;
import h.bfopjjpdmp;
import h.oipsdeybqn;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.catalog.api.model.ProductPayload;
import ru.myspar.proloyalty.catalog.impl.specific_product.presentation.SpecificProductFragment;
import ru.myspar.proloyalty.catalog.impl.specific_product.presentation.dialog.declaration.DeclarationsBottomSheetDialogFragment;
import ru.myspar.proloyalty.catalog.impl.specific_product.presentation.dialog.declaration.model.DeclarationsDialogArgs;
import ru.myspar.proloyalty.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.core.base.api.bottomsheet.GenericTextBottomSheetDialogFragment;
import ru.myspar.proloyalty.core.base.mvi.bottomsheet.BaseComposeMviBottomSheetDialogFragment;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;
import ru.myspar.proloyalty.core.domain.models.comboset.ComboSetProduct;
import ru.myspar.proloyalty.domain.feature.comboset.buildyourcombo.strore.BuildYourComboDialogArgs;
import ru.myspar.proloyalty.legacy.presentation.dialogs.comboset.buildyourcombo.BuildYourComboDialogFragment;
import ru.myspar.proloyalty.purchases.api.model.PurchaseListAddProductDialogArgs;
import ru.myspar.proloyalty.rate.rate_product.api.model.RateProductArgs;
import ru.myspar.proloyalty.rate.rate_product.api.model.RateType;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 Q2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001RB\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\t2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001f\u0010\u0006J\u000f\u0010 \u001a\u00020\tH\u0016¢\u0006\u0004\b \u0010\u0006J\u000f\u0010!\u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010\u0006J\u0017\u0010$\u001a\u00020\t2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\t2\u0006\u0010(\u001a\u00020\u0002H\u0017¢\u0006\u0004\b)\u0010*R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010J\u001a\u00020C8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001b\u0010P\u001a\u00020K8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O¨\u0006S"}, d2 = {"Lru/myspar/proloyalty/catalog/impl/specific_product/presentation/SpecificProductFragment;", "Lru/myspar/proloyalty/core/base/mvi/fragment/BaseComposeMviFragment;", "Lru/myspar/proloyalty/catalog/impl/specific_product/presentation/ppxfxbqfkf;", "Lru/myspar/proloyalty/catalog/impl/specific_product/presentation/iobyxmoadg;", "Lru/myspar/proloyalty/catalog/impl/specific_product/presentation/eablkybsjg;", "<init>", "()V", "Lru/myspar/proloyalty/catalog/impl/specific_product/presentation/eablkybsjg$btonecajqb;", "uiLabel", "Lgg/wwaezpbzkn;", "xrmfcynszj", "(Lru/myspar/proloyalty/catalog/impl/specific_product/presentation/eablkybsjg$btonecajqb;)V", "Lru/myspar/proloyalty/catalog/impl/specific_product/presentation/eablkybsjg$gtknphoqwx;", "czzsidtyhn", "(Lru/myspar/proloyalty/catalog/impl/specific_product/presentation/eablkybsjg$gtknphoqwx;)V", "Lru/myspar/proloyalty/purchases/api/model/PurchaseListAddProductDialogArgs;", "arguments", "metgxyhuhe", "(Lru/myspar/proloyalty/purchases/api/model/PurchaseListAddProductDialogArgs;)V", "", ImagesContract.URL, "ikoacuggdj", "(Ljava/lang/String;)V", "Lru/myspar/proloyalty/domain/feature/comboset/buildyourcombo/strore/BuildYourComboDialogArgs;", "vipkmwdibw", "(Lru/myspar/proloyalty/domain/feature/comboset/buildyourcombo/strore/BuildYourComboDialogArgs;)V", "", "Lru/myspar/proloyalty/core/domain/models/product/ProductDeclarationsItem;", "declarations", "jztzpxfvev", "(Ljava/util/List;)V", "okpsazkaxt", "onStart", "onStop", "", "isHidden", "onHiddenChanged", "(Z)V", "ribwqtqdhb", "(Lru/myspar/proloyalty/catalog/impl/specific_product/presentation/eablkybsjg;)V", CommonUrlParts.MODEL, "tzroggbefp", "(Lru/myspar/proloyalty/catalog/impl/specific_product/presentation/ppxfxbqfkf;Landroidx/compose/runtime/draadjrbmk;I)V", "Lri1/iobyxmoadg;", "esjtqupxsv", "Lri1/iobyxmoadg;", "sopmlzcsov", "()Lri1/iobyxmoadg;", "setPurchasesFeatureApi", "(Lri1/iobyxmoadg;)V", "purchasesFeatureApi", "Lbm1/iobyxmoadg;", "lereixgezr", "Lbm1/iobyxmoadg;", "crxdokpmqz", "()Lbm1/iobyxmoadg;", "setRateProductFeatureApi", "(Lbm1/iobyxmoadg;)V", "rateProductFeatureApi", "Lu51/iobyxmoadg;", "pmvmpeiblj", "Lu51/iobyxmoadg;", "ulzqkzuiru", "()Lu51/iobyxmoadg;", "setDialogManager", "(Lu51/iobyxmoadg;)V", "dialogManager", "Lz21/iobyxmoadg;", "zynmafqrjb", "Lz21/iobyxmoadg;", "jlmebxxoox", "()Lz21/iobyxmoadg;", "setSnackbarManager", "(Lz21/iobyxmoadg;)V", "snackbarManager", "Lru/myspar/proloyalty/catalog/impl/specific_product/presentation/wkgbmnqykc;", "istkbnxepw", "Lgg/gtknphoqwx;", "ntlheqmsrt", "()Lru/myspar/proloyalty/catalog/impl/specific_product/presentation/wkgbmnqykc;", "binder", "cdpycssgdh", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SpecificProductFragment extends ru.myspar.proloyalty.catalog.impl.specific_product.presentation.zoijcleaow {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    public static final int f93635yadqdtsiqt = 8;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    public ri1.iobyxmoadg purchasesFeatureApi;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx binder;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    public bm1.iobyxmoadg rateProductFeatureApi;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    public u51.iobyxmoadg dialogManager;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    public z21.iobyxmoadg snackbarManager;

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f93641zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f93641zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f93641zdlpuopuiu).getViewModelStore();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f93642yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f93643zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(tg.iobyxmoadg iobyxmoadgVar, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f93643zdlpuopuiu = iobyxmoadgVar;
            this.f93642yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f93643zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f93642yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.catalog.impl.specific_product.presentation.SpecificProductFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final SpecificProductFragment iobyxmoadg(ProductPayload payload) {
            zdlpuopuiu.btonecajqb(payload, "payload");
            return (SpecificProductFragment) g21.iobyxmoadg.zoijcleaow(new SpecificProductFragment(), payload, false, 2, null);
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f93644yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f93645zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(Fragment fragment, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f93645zdlpuopuiu = fragment;
            this.f93644yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f93644yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f93645zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f93646zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Fragment fragment) {
            super(0);
            this.f93646zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f93646zdlpuopuiu;
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f93647zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f93647zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f93647zdlpuopuiu.invoke();
        }
    }

    static final class zoijcleaow implements rgvfuqvkyq {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ SpecificProductFragment f93648yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ ru.myspar.proloyalty.catalog.impl.specific_product.presentation.ppxfxbqfkf f93649zdlpuopuiu;

        /* synthetic */ class iobyxmoadg extends vdvldrhtss implements draadjrbmk {
            iobyxmoadg(Object obj) {
                super(1, obj, SpecificProductFragment.class, "dispatch", "dispatch(Ljava/lang/Object;)V", 0);
            }

            @Override // tg.draadjrbmk
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                iobyxmoadg((ru.myspar.proloyalty.catalog.impl.specific_product.presentation.iobyxmoadg) obj);
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg(ru.myspar.proloyalty.catalog.impl.specific_product.presentation.iobyxmoadg p13) {
                zdlpuopuiu.btonecajqb(p13, "p0");
                ((SpecificProductFragment) this.receiver).ylkuphrtab(p13);
            }
        }

        zoijcleaow(ru.myspar.proloyalty.catalog.impl.specific_product.presentation.ppxfxbqfkf ppxfxbqfkfVar, SpecificProductFragment specificProductFragment) {
            this.f93649zdlpuopuiu = ppxfxbqfkfVar;
            this.f93648yggfygwlhe = specificProductFragment;
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
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-280241306, i13, -1, "ru.myspar.proloyalty.catalog.impl.specific_product.presentation.SpecificProductFragment.Render.<anonymous> (SpecificProductFragment.kt:111)");
            }
            ru.myspar.proloyalty.catalog.impl.specific_product.presentation.ppxfxbqfkf ppxfxbqfkfVar = this.f93649zdlpuopuiu;
            SpecificProductFragment specificProductFragment = this.f93648yggfygwlhe;
            draadjrbmkVar.sopmlzcsov(399579957);
            boolean zLmojexxdyd = draadjrbmkVar.lmojexxdyd(specificProductFragment);
            Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
            if (zLmojexxdyd || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new iobyxmoadg(specificProductFragment);
                draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVar.stevsuqkhv();
            ikoacuggdj.zoijcleaow(ppxfxbqfkfVar, (draadjrbmk) ((ah.lqeggnwhkg) objYadqdtsiqt), draadjrbmkVar, 0);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
    }

    public SpecificProductFragment() {
        gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new wkgbmnqykc(new ppxfxbqfkf(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(ru.myspar.proloyalty.catalog.impl.specific_product.presentation.wkgbmnqykc.class), new eablkybsjg(gtknphoqwxVarIobyxmoadg), new gxszxtbevo(null, gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(this, gtknphoqwxVarIobyxmoadg));
    }

    private final void czzsidtyhn(ru.myspar.proloyalty.catalog.impl.specific_product.presentation.eablkybsjg.gtknphoqwx uiLabel) {
        u51.zoijcleaow.zoijcleaow(GenericTextBottomSheetDialogFragment.INSTANCE.iobyxmoadg(new GenericTextBottomSheetDialogFragment.GenericTextBottomSheetArgs(uiLabel.iobyxmoadg().getHeader(), uiLabel.iobyxmoadg().getDescription())), ulzqkzuiru(), v51.eablkybsjg.iobyxmoadg("SPECIFIC_PRODUCT_SCREEN_KEY"));
    }

    private final void ikoacuggdj(String url) {
        oxmwwwfdhm oxmwwwfdhmVarRequireActivity = requireActivity();
        zdlpuopuiu.dxjokdxxww(oxmwwwfdhmVarRequireActivity, "requireActivity(...)");
        u51.zoijcleaow.wkgbmnqykc(new x81.gxszxtbevo(oxmwwwfdhmVarRequireActivity, url), ulzqkzuiru(), v51.eablkybsjg.iobyxmoadg("SPECIFIC_PRODUCT_SCREEN_KEY"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn jhduphickx(SpecificProductFragment specificProductFragment, ComboSetProduct productFirst, ComboSetProduct productSecond) {
        zdlpuopuiu.btonecajqb(productFirst, "productFirst");
        zdlpuopuiu.btonecajqb(productSecond, "productSecond");
        specificProductFragment.ylkuphrtab(new iobyxmoadg.ppxfxbqfkf(productFirst, productSecond));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void jztzpxfvev(List declarations) {
        DeclarationsBottomSheetDialogFragment declarationsBottomSheetDialogFragmentIobyxmoadg = DeclarationsBottomSheetDialogFragment.INSTANCE.iobyxmoadg(new DeclarationsDialogArgs(declarations));
        FragmentManager childFragmentManager = getChildFragmentManager();
        zdlpuopuiu.dxjokdxxww(childFragmentManager, "getChildFragmentManager(...)");
        declarationsBottomSheetDialogFragmentIobyxmoadg.ntlheqmsrt(childFragmentManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn mbcevpiqjq(SpecificProductFragment specificProductFragment, ru.myspar.proloyalty.catalog.impl.specific_product.presentation.ppxfxbqfkf ppxfxbqfkfVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
        specificProductFragment.wwaezpbzkn(ppxfxbqfkfVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void metgxyhuhe(PurchaseListAddProductDialogArgs arguments) {
        BaseComposeMviBottomSheetDialogFragment baseComposeMviBottomSheetDialogFragmentDxjokdxxww = sopmlzcsov().dxjokdxxww(arguments, new tg.iobyxmoadg() { // from class: fq0.lqeggnwhkg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return SpecificProductFragment.rlfsiqarku(this.f34568zdlpuopuiu);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        zdlpuopuiu.dxjokdxxww(childFragmentManager, "getChildFragmentManager(...)");
        baseComposeMviBottomSheetDialogFragmentDxjokdxxww.ntlheqmsrt(childFragmentManager);
    }

    private final void okpsazkaxt() {
        a31.iobyxmoadg.eablkybsjg(jlmebxxoox(), vk0.lqeggnwhkg.proloyalty_purchases_list_product_added_to_the_list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn rlfsiqarku(SpecificProductFragment specificProductFragment) {
        specificProductFragment.okpsazkaxt();
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void vipkmwdibw(BuildYourComboDialogArgs arguments) {
        u51.zoijcleaow.zoijcleaow(BuildYourComboDialogFragment.INSTANCE.iobyxmoadg(arguments).sflfametgt(new rgvfuqvkyq() { // from class: fq0.eablkybsjg
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return SpecificProductFragment.jhduphickx(this.f34563zdlpuopuiu, (ComboSetProduct) obj, (ComboSetProduct) obj2);
            }
        }), ulzqkzuiru(), v51.eablkybsjg.iobyxmoadg("SPECIFIC_PRODUCT_SCREEN_KEY"));
    }

    private final void xrmfcynszj(ru.myspar.proloyalty.catalog.impl.specific_product.presentation.eablkybsjg.btonecajqb uiLabel) {
        u51.zoijcleaow.zoijcleaow(bm1.iobyxmoadg.zoijcleaow(crxdokpmqz(), new RateProductArgs(new RateType.Single("product_card", uiLabel.iobyxmoadg(), uiLabel.zoijcleaow(), null, 8, null)), null, 2, null), ulzqkzuiru(), v51.eablkybsjg.iobyxmoadg("SPECIFIC_PRODUCT_SCREEN_KEY"));
    }

    public final bm1.iobyxmoadg crxdokpmqz() {
        bm1.iobyxmoadg iobyxmoadgVar = this.rateProductFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("rateProductFeatureApi");
        return null;
    }

    public final z21.iobyxmoadg jlmebxxoox() {
        z21.iobyxmoadg iobyxmoadgVar = this.snackbarManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("snackbarManager");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseComposeMviFragment
    /* JADX INFO: renamed from: ntlheqmsrt, reason: merged with bridge method [inline-methods] */
    public ru.myspar.proloyalty.catalog.impl.specific_product.presentation.wkgbmnqykc pkzmftpjix() {
        return (ru.myspar.proloyalty.catalog.impl.specific_product.presentation.wkgbmnqykc) this.binder.getValue();
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseComposeMviFragment, ru.myspar.proloyalty.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean isHidden) {
        super.onHiddenChanged(isHidden);
        ylkuphrtab(new iobyxmoadg.nufgyqmvbu(isHidden));
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseComposeMviFragment, ru.myspar.proloyalty.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        ylkuphrtab(new iobyxmoadg.iwizpuwonk(true));
    }

    @Override // ru.myspar.proloyalty.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onStop() {
        ylkuphrtab(new iobyxmoadg.iwizpuwonk(false));
        super.onStop();
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseComposeMviFragment
    /* JADX INFO: renamed from: ribwqtqdhb, reason: merged with bridge method [inline-methods] */
    public void hcddaimhww(ru.myspar.proloyalty.catalog.impl.specific_product.presentation.eablkybsjg uiLabel) {
        zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
        if (uiLabel instanceof ru.myspar.proloyalty.catalog.impl.specific_product.presentation.eablkybsjg.ppxfxbqfkf) {
            metgxyhuhe(((ru.myspar.proloyalty.catalog.impl.specific_product.presentation.eablkybsjg.ppxfxbqfkf) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.catalog.impl.specific_product.presentation.eablkybsjg.btonecajqb) {
            xrmfcynszj((ru.myspar.proloyalty.catalog.impl.specific_product.presentation.eablkybsjg.btonecajqb) uiLabel);
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.catalog.impl.specific_product.presentation.eablkybsjg.gtknphoqwx) {
            czzsidtyhn((ru.myspar.proloyalty.catalog.impl.specific_product.presentation.eablkybsjg.gtknphoqwx) uiLabel);
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.catalog.impl.specific_product.presentation.eablkybsjg.dxjokdxxww) {
            ikoacuggdj(((ru.myspar.proloyalty.catalog.impl.specific_product.presentation.eablkybsjg.dxjokdxxww) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.catalog.impl.specific_product.presentation.eablkybsjg.zoijcleaow) {
            vipkmwdibw(((ru.myspar.proloyalty.catalog.impl.specific_product.presentation.eablkybsjg.zoijcleaow) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.catalog.impl.specific_product.presentation.eablkybsjg.wkgbmnqykc) {
            lmojexxdyd(((ru.myspar.proloyalty.catalog.impl.specific_product.presentation.eablkybsjg.wkgbmnqykc) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.catalog.impl.specific_product.presentation.eablkybsjg.C2209eablkybsjg) {
            a31.iobyxmoadg.wkgbmnqykc(jlmebxxoox(), ((ru.myspar.proloyalty.catalog.impl.specific_product.presentation.eablkybsjg.C2209eablkybsjg) uiLabel).iobyxmoadg(), null, lr0.eablkybsjg.gxszxtbevo.NonFatal, 2, null);
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.catalog.impl.specific_product.presentation.eablkybsjg.draadjrbmk) {
            a31.iobyxmoadg.btonecajqb(jlmebxxoox(), ((ru.myspar.proloyalty.catalog.impl.specific_product.presentation.eablkybsjg.draadjrbmk) uiLabel).iobyxmoadg(), null, null, 6, null);
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.catalog.impl.specific_product.presentation.eablkybsjg.gxszxtbevo) {
            ru.myspar.proloyalty.catalog.impl.specific_product.presentation.eablkybsjg.gxszxtbevo gxszxtbevoVar = (ru.myspar.proloyalty.catalog.impl.specific_product.presentation.eablkybsjg.gxszxtbevo) uiLabel;
            HintUiModel hintUiModelZoijcleaow = gxszxtbevoVar.zoijcleaow();
            HintDialogAnalyticsInfo hintDialogAnalyticsInfoIobyxmoadg = gxszxtbevoVar.iobyxmoadg();
            oxmwwwfdhm oxmwwwfdhmVarRequireActivity = requireActivity();
            zdlpuopuiu.dxjokdxxww(oxmwwwfdhmVarRequireActivity, "requireActivity(...)");
            ms0.zoijcleaow.iobyxmoadg(hintUiModelZoijcleaow, hintDialogAnalyticsInfoIobyxmoadg, oxmwwwfdhmVarRequireActivity);
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.catalog.impl.specific_product.presentation.eablkybsjg.lqeggnwhkg) {
            a31.iobyxmoadg.gxszxtbevo(jlmebxxoox(), ((ru.myspar.proloyalty.catalog.impl.specific_product.presentation.eablkybsjg.lqeggnwhkg) uiLabel).iobyxmoadg());
        } else if (uiLabel instanceof ru.myspar.proloyalty.catalog.impl.specific_product.presentation.eablkybsjg.nufgyqmvbu) {
            jztzpxfvev(((ru.myspar.proloyalty.catalog.impl.specific_product.presentation.eablkybsjg.nufgyqmvbu) uiLabel).iobyxmoadg());
        } else {
            if (!(uiLabel instanceof ru.myspar.proloyalty.catalog.impl.specific_product.presentation.eablkybsjg.iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            okpsazkaxt();
        }
    }

    public final ri1.iobyxmoadg sopmlzcsov() {
        ri1.iobyxmoadg iobyxmoadgVar = this.purchasesFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("purchasesFeatureApi");
        return null;
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseComposeMviFragment
    /* JADX INFO: renamed from: tzroggbefp, reason: merged with bridge method [inline-methods] */
    public void wwaezpbzkn(final ru.myspar.proloyalty.catalog.impl.specific_product.presentation.ppxfxbqfkf model, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        zdlpuopuiu.btonecajqb(model, "model");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(2024257190);
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
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(2024257190, i14, -1, "ru.myspar.proloyalty.catalog.impl.specific_product.presentation.SpecificProductFragment.Render (SpecificProductFragment.kt:101)");
            }
            Context context = (Context) draadjrbmkVarBtonecajqb.ojitshcjhn(AndroidCompositionLocals_androidKt.lqeggnwhkg());
            ru.myspar.proloyalty.catalog.impl.specific_product.presentation.ppxfxbqfkf.iobyxmoadg iobyxmoadgVarIobyxmoadg = model.iobyxmoadg();
            ColorsUiModel colorsUiModelZoijcleaow = iobyxmoadgVarIobyxmoadg != null ? iobyxmoadgVarIobyxmoadg.zoijcleaow() : null;
            draadjrbmkVarBtonecajqb.sopmlzcsov(17299689);
            boolean zUlzqkzuiru = draadjrbmkVarBtonecajqb.ulzqkzuiru(colorsUiModelZoijcleaow);
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zUlzqkzuiru || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                oipsdeybqn oipsdeybqnVarDxjokdxxww = colorsUiModelZoijcleaow != null ? oipsdeybqn.dxjokdxxww(bfopjjpdmp.zoijcleaow(colorsUiModelZoijcleaow.xrmfcynszj(context, ColorsUiModel.iobyxmoadg.PRIMARY))) : null;
                draadjrbmkVarBtonecajqb.jyumaefscl(oipsdeybqnVarDxjokdxxww);
                objYadqdtsiqt = oipsdeybqnVarDxjokdxxww;
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            lmojexxdyd.ppxfxbqfkf(nufgyqmvbu.iobyxmoadg().wkgbmnqykc((oipsdeybqn) objYadqdtsiqt), ezmngbhpjk.nufgyqmvbu.eablkybsjg(-280241306, true, new zoijcleaow(model, this), draadjrbmkVarBtonecajqb, 54), draadjrbmkVarBtonecajqb, b.f5523dxjokdxxww | 48);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: fq0.gxszxtbevo
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return SpecificProductFragment.mbcevpiqjq(this.f34566zdlpuopuiu, model, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final u51.iobyxmoadg ulzqkzuiru() {
        u51.iobyxmoadg iobyxmoadgVar = this.dialogManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("dialogManager");
        return null;
    }
}
