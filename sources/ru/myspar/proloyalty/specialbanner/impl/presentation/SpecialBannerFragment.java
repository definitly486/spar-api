package ru.myspar.proloyalty.specialbanner.impl.presentation;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ru.myspar.proloyalty.analytics.api.model.AnalyticElement;
import ru.myspar.proloyalty.analytics.api.model.AnalyticsLocation;
import ru.myspar.proloyalty.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.common.view.product.model.product.ProductUiModel;
import ru.myspar.proloyalty.core.base.api.dialog.BaseDialogFragment;
import ru.myspar.proloyalty.core.base.mvi.bottomsheet.BaseComposeMviBottomSheetDialogFragment;
import ru.myspar.proloyalty.core.domain.interactor.product_change.models.ChangeProductParams;
import ru.myspar.proloyalty.core.domain.models.ColorsUiModel;
import ru.myspar.proloyalty.core.domain.models.ProductCardEvent;
import ru.myspar.proloyalty.core.domain.models.comboset.ComboSetProduct;
import ru.myspar.proloyalty.core.models.delivery.DeliveryCode;
import ru.myspar.proloyalty.domain.feature.comboset.buildyourcombo.strore.BuildYourComboDialogArgs;
import ru.myspar.proloyalty.domain.feature.qrcode.store.QrCodeArgs;
import ru.myspar.proloyalty.evropolis.api.model.EvropolisGift;
import ru.myspar.proloyalty.legacy.presentation.dialogs.comboset.buildyourcombo.BuildYourComboDialogFragment;
import ru.myspar.proloyalty.legacy.presentation.dialogs.iqos.IqosAgreementsDialogFragment;
import ru.myspar.proloyalty.legacy.presentation.dialogs.qrcode.QrCodeDialogFragment;
import ru.myspar.proloyalty.purchases.api.model.PurchaseListAddProductDialogArgs;
import ru.myspar.proloyalty.specialbanner.api.models.SpecialBannerPayload;
import ru.myspar.proloyalty.specialbanner.impl.presentation.views.RegistrationFormView;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0093\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001`\b\u0007\u0018\u0000 °\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002±\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\f\u0010\nJ!\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0005J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001dH\u0002¢\u0006\u0004\b\"\u0010#JC\u0010*\u001a&\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00110&2\u0006\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020\u001dH\u0002¢\u0006\u0004\b*\u0010+J\u0013\u0010,\u001a\u00020\u001d*\u00020\u001dH\u0002¢\u0006\u0004\b,\u0010-J\u001f\u00102\u001a\u00020\b2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b2\u00103J\u001f\u00104\u001a\u00020\b2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b4\u00103J\u000f\u00105\u001a\u00020\bH\u0002¢\u0006\u0004\b5\u0010\u0005J!\u0010:\u001a\u00020\b2\u0006\u00107\u001a\u0002062\b\u00109\u001a\u0004\u0018\u000108H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010>\u001a\u00020\b2\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b>\u0010?J\u0017\u0010A\u001a\u00020\b2\u0006\u0010=\u001a\u00020@H\u0002¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\bH\u0002¢\u0006\u0004\bC\u0010\u0005J\u000f\u0010D\u001a\u00020\bH\u0002¢\u0006\u0004\bD\u0010\u0005J\u000f\u0010E\u001a\u00020\bH\u0002¢\u0006\u0004\bE\u0010\u0005J\u000f\u0010F\u001a\u00020\bH\u0002¢\u0006\u0004\bF\u0010\u0005J\u0017\u0010I\u001a\u00020\b2\u0006\u0010H\u001a\u00020GH\u0002¢\u0006\u0004\bI\u0010JJ\u0017\u0010M\u001a\u00020\b2\u0006\u0010L\u001a\u00020KH\u0002¢\u0006\u0004\bM\u0010NJ\u0017\u0010Q\u001a\u00020\b2\u0006\u0010P\u001a\u00020OH\u0002¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020\bH\u0002¢\u0006\u0004\bS\u0010\u0005J\u000f\u0010T\u001a\u00020\bH\u0002¢\u0006\u0004\bT\u0010\u0005J\u000f\u0010U\u001a\u00020\bH\u0002¢\u0006\u0004\bU\u0010\u0005J\u0017\u0010W\u001a\u00020\b2\u0006\u0010P\u001a\u00020VH\u0002¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020\bH\u0002¢\u0006\u0004\bY\u0010\u0005J3\u0010a\u001a\u00020`2\u0006\u0010[\u001a\u00020Z2\u0006\u0010]\u001a\u00020\\2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u00062\u0006\u0010_\u001a\u00020^H\u0002¢\u0006\u0004\ba\u0010bR\"\u0010[\u001a\u00020Z8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010p\u001a\u00020i8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\"\u0010x\u001a\u00020q8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR#\u0010\u0080\u0001\u001a\u00020y8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR*\u0010\u0088\u0001\u001a\u00030\u0081\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R*\u0010\u0090\u0001\u001a\u00030\u0089\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R*\u0010\u0098\u0001\u001a\u00030\u0091\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R \u0010\u009d\u0001\u001a\u00020\u00028TX\u0094\u0084\u0002¢\u0006\u0010\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001f\u0010=\u001a\u00020^8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009e\u0001\u0010\u009a\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001R!\u0010¦\u0001\u001a\u00030¡\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001R!\u0010«\u0001\u001a\u00030§\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¨\u0001\u0010\u009a\u0001\u001a\u0006\b©\u0001\u0010ª\u0001R\u001c\u0010¯\u0001\u001a\u0005\u0018\u00010¬\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ad\u0001\u0010®\u0001¨\u0006²\u0001"}, d2 = {"Lru/myspar/proloyalty/specialbanner/impl/presentation/SpecialBannerFragment;", "Lru/myspar/proloyalty/core/base/mvvm/BaseMvvmFragment;", "Lru/myspar/proloyalty/specialbanner/impl/presentation/SpecialBannerViewModel;", "Lj21/iobyxmoadg;", "<init>", "()V", "Landroid/os/Bundle;", "outState", "Lgg/wwaezpbzkn;", "onSaveInstanceState", "(Landroid/os/Bundle;)V", "savedInstanceState", "onCreate", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "gxszxtbevo", "()Z", "onDestroyView", "Lru/myspar/proloyalty/specialbanner/impl/presentation/rlfsiqarku;", "state", "X", "(Lru/myspar/proloyalty/specialbanner/impl/presentation/rlfsiqarku;)V", "Lru/myspar/proloyalty/specialbanner/impl/presentation/czzsidtyhn;", "uiLabel", "Z", "(Lru/myspar/proloyalty/specialbanner/impl/presentation/czzsidtyhn;)V", "", "R", "()I", "offSetSize", "Lc31/nufgyqmvbu;", "S", "(I)Lc31/nufgyqmvbu;", "decoration", "offsetSize", "Lkotlin/Function5;", "Landroid/graphics/Rect;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/recyclerview/widget/RecyclerView$zynmafqrjb;", "M", "(Lc31/nufgyqmvbu;I)Ltg/kcexrzcfyt;", "ezmngbhpjk", "(I)I", "", "itemId", "Ljava/util/Date;", "selectedDate", "l0", "(Ljava/lang/String;Ljava/util/Date;)V", "D0", "g0", "Lru/myspar/proloyalty/evropolis/api/model/EvropolisGift;", "gift", "Lru/myspar/proloyalty/core/models/delivery/DeliveryCode;", "deliveryCode", "u0", "(Lru/myspar/proloyalty/evropolis/api/model/EvropolisGift;Lru/myspar/proloyalty/core/models/delivery/DeliveryCode;)V", "Lru/myspar/proloyalty/purchases/api/model/PurchaseListAddProductDialogArgs;", "args", "n0", "(Lru/myspar/proloyalty/purchases/api/model/PurchaseListAddProductDialogArgs;)V", "Lru/myspar/proloyalty/domain/feature/qrcode/store/QrCodeArgs;", "z0", "(Lru/myspar/proloyalty/domain/feature/qrcode/store/QrCodeArgs;)V", "B0", "c0", "v0", "y0", "Lru/myspar/proloyalty/core/domain/interactor/product_change/models/ChangeProductParams;", "params", "w0", "(Lru/myspar/proloyalty/core/domain/interactor/product_change/models/ChangeProductParams;)V", "Lds1/ppxfxbqfkf;", "shop", "C0", "(Lds1/ppxfxbqfkf;)V", "Lru/myspar/proloyalty/domain/feature/comboset/buildyourcombo/strore/BuildYourComboDialogArgs;", "dialogArgs", "r0", "(Lru/myspar/proloyalty/domain/feature/comboset/buildyourcombo/strore/BuildYourComboDialogArgs;)V", "p0", "f0", "k0", "Lru/myspar/proloyalty/specialbanner/impl/presentation/czzsidtyhn$oxmwwwfdhm;", "A0", "(Lru/myspar/proloyalty/specialbanner/impl/presentation/czzsidtyhn$oxmwwwfdhm;)V", "t0", "Lru/myspar/proloyalty/specialbanner/impl/presentation/iobyxmoadg;", "assistedFactory", "Lq5/dxjokdxxww;", "owner", "Lru/myspar/proloyalty/specialbanner/api/models/SpecialBannerPayload;", "payload", "ru/myspar/proloyalty/specialbanner/impl/presentation/SpecialBannerFragment$lqeggnwhkg", "e0", "(Lru/myspar/proloyalty/specialbanner/impl/presentation/iobyxmoadg;Lq5/dxjokdxxww;Landroid/os/Bundle;Lru/myspar/proloyalty/specialbanner/api/models/SpecialBannerPayload;)Lru/myspar/proloyalty/specialbanner/impl/presentation/SpecialBannerFragment$lqeggnwhkg;", "esjtqupxsv", "Lru/myspar/proloyalty/specialbanner/impl/presentation/iobyxmoadg;", "J", "()Lru/myspar/proloyalty/specialbanner/impl/presentation/iobyxmoadg;", "setAssistedFactory", "(Lru/myspar/proloyalty/specialbanner/impl/presentation/iobyxmoadg;)V", "Lr71/iobyxmoadg;", "lereixgezr", "Lr71/iobyxmoadg;", "Q", "()Lr71/iobyxmoadg;", "setEvropolisFeatureApi", "(Lr71/iobyxmoadg;)V", "evropolisFeatureApi", "Lri1/iobyxmoadg;", "pmvmpeiblj", "Lri1/iobyxmoadg;", "U", "()Lri1/iobyxmoadg;", "setPurchasesFeatureApi", "(Lri1/iobyxmoadg;)V", "purchasesFeatureApi", "Ly61/iobyxmoadg;", "zynmafqrjb", "Ly61/iobyxmoadg;", "P", "()Ly61/iobyxmoadg;", "setDynamicQrFeatureApi", "(Ly61/iobyxmoadg;)V", "dynamicQrFeatureApi", "Lli1/iobyxmoadg;", "istkbnxepw", "Lli1/iobyxmoadg;", "T", "()Lli1/iobyxmoadg;", "setPromoCollectionFeatureApi", "(Lli1/iobyxmoadg;)V", "promoCollectionFeatureApi", "Lu51/iobyxmoadg;", "cdpycssgdh", "Lu51/iobyxmoadg;", "O", "()Lu51/iobyxmoadg;", "setDialogManager", "(Lu51/iobyxmoadg;)V", "dialogManager", "Lz21/iobyxmoadg;", "yadqdtsiqt", "Lz21/iobyxmoadg;", "V", "()Lz21/iobyxmoadg;", "setSnackbarManager", "(Lz21/iobyxmoadg;)V", "snackbarManager", "iozdgvuglv", "Lgg/gtknphoqwx;", "W", "()Lru/myspar/proloyalty/specialbanner/impl/presentation/SpecialBannerViewModel;", "viewModel", "lmojexxdyd", "I", "()Lru/myspar/proloyalty/specialbanner/api/models/SpecialBannerPayload;", "Lz41/pkzmftpjix;", "wwaezpbzkn", "Lsr0/ppxfxbqfkf;", "L", "()Lz41/pkzmftpjix;", "binding", "Lyq1/iobyxmoadg;", "ylkuphrtab", "K", "()Lyq1/iobyxmoadg;", "bannerAdapter", "Landroid/app/Dialog;", "pkzmftpjix", "Landroid/app/Dialog;", "ageCheckedDialog", "hcddaimhww", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SpecialBannerFragment extends Hilt_SpecialBannerFragment<SpecialBannerViewModel> implements j21.iobyxmoadg {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata */
    public u51.iobyxmoadg dialogManager;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    public iobyxmoadg assistedFactory;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata */
    private final gg.gtknphoqwx viewModel;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    public li1.iobyxmoadg promoCollectionFeatureApi;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    public r71.iobyxmoadg evropolisFeatureApi;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata */
    private final gg.gtknphoqwx args;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name and from kotlin metadata */
    private Dialog ageCheckedDialog;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    public ri1.iobyxmoadg purchasesFeatureApi;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata */
    private final sr0.ppxfxbqfkf binding;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata */
    public z21.iobyxmoadg snackbarManager;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name and from kotlin metadata */
    private final gg.gtknphoqwx bannerAdapter;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    public y61.iobyxmoadg dynamicQrFeatureApi;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f101178jpowsppfya = {kotlin.jvm.internal.cllcsxoeiz.lqeggnwhkg(new kotlin.jvm.internal.yadqdtsiqt(SpecialBannerFragment.class, "binding", "getBinding()Lru/myspar/proloyalty/databinding/FragmentSpecialBannerProloyaltyBinding;", 0))};

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    public static final int f101177hkdspvbjdz = 8;

    public static final class btonecajqb extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f101191zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public btonecajqb(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f101191zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.ribwqtqdhb invoke() {
            return (androidx.lifecycle.ribwqtqdhb) this.f101191zdlpuopuiu.invoke();
        }
    }

    public static final class draadjrbmk extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f101192yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f101193zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public draadjrbmk(tg.iobyxmoadg iobyxmoadgVar, gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f101193zdlpuopuiu = iobyxmoadgVar;
            this.f101192yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f101193zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            androidx.lifecycle.ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = androidx.fragment.app.stevsuqkhv.ppxfxbqfkf(this.f101192yggfygwlhe);
            androidx.lifecycle.dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof androidx.lifecycle.dxjokdxxww ? (androidx.lifecycle.dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    public static final class dxjokdxxww extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f101194zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public dxjokdxxww(Fragment fragment) {
            super(0);
            this.f101194zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f101194zdlpuopuiu;
        }
    }

    /* synthetic */ class eablkybsjg implements sj.nufgyqmvbu, kotlin.jvm.internal.agtfadlqog {
        eablkybsjg() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof sj.nufgyqmvbu) && (obj instanceof kotlin.jvm.internal.agtfadlqog)) {
                return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaow(), ((kotlin.jvm.internal.agtfadlqog) obj).zoijcleaow());
            }
            return false;
        }

        public final int hashCode() {
            return zoijcleaow().hashCode();
        }

        @Override // sj.nufgyqmvbu
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public final Object emit(rlfsiqarku rlfsiqarkuVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objA0 = SpecialBannerFragment.a0(SpecialBannerFragment.this, rlfsiqarkuVar, gxszxtbevoVar);
            return objA0 == mg.zoijcleaow.gxszxtbevo() ? objA0 : gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // kotlin.jvm.internal.agtfadlqog
        public final gg.dxjokdxxww zoijcleaow() {
            return new kotlin.jvm.internal.iobyxmoadg(2, SpecialBannerFragment.this, SpecialBannerFragment.class, "handleState", "handleState(Lru/myspar/proloyalty/specialbanner/impl/presentation/SpecialBannerView$Model;)V", 4);
        }
    }

    public static final class gtknphoqwx extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f101196zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gtknphoqwx(gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f101196zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.jlmebxxoox invoke() {
            return androidx.fragment.app.stevsuqkhv.ppxfxbqfkf(this.f101196zdlpuopuiu).getViewModelStore();
        }
    }

    /* synthetic */ class gxszxtbevo implements sj.nufgyqmvbu, kotlin.jvm.internal.agtfadlqog {
        gxszxtbevo() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof sj.nufgyqmvbu) && (obj instanceof kotlin.jvm.internal.agtfadlqog)) {
                return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaow(), ((kotlin.jvm.internal.agtfadlqog) obj).zoijcleaow());
            }
            return false;
        }

        public final int hashCode() {
            return zoijcleaow().hashCode();
        }

        @Override // sj.nufgyqmvbu
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public final Object emit(czzsidtyhn czzsidtyhnVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objB0 = SpecialBannerFragment.b0(SpecialBannerFragment.this, czzsidtyhnVar, gxszxtbevoVar);
            return objB0 == mg.zoijcleaow.gxszxtbevo() ? objB0 : gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // kotlin.jvm.internal.agtfadlqog
        public final gg.dxjokdxxww zoijcleaow() {
            return new kotlin.jvm.internal.iobyxmoadg(2, SpecialBannerFragment.this, SpecialBannerFragment.class, "handleUiLabel", "handleUiLabel(Lru/myspar/proloyalty/specialbanner/impl/presentation/SpecialBannerView$UiLabel;)V", 4);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.specialbanner.impl.presentation.SpecialBannerFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final SpecialBannerFragment iobyxmoadg(SpecialBannerPayload payload) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(payload, "payload");
            return (SpecialBannerFragment) g21.iobyxmoadg.zoijcleaow(new SpecialBannerFragment(), payload, false, 2, null);
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends androidx.lifecycle.iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f101198eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        final /* synthetic */ SpecialBannerPayload f101199gxszxtbevo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        lqeggnwhkg(q5.dxjokdxxww dxjokdxxwwVar, Bundle bundle, iobyxmoadg iobyxmoadgVar, SpecialBannerPayload specialBannerPayload) {
            super(dxjokdxxwwVar, bundle);
            this.f101198eablkybsjg = iobyxmoadgVar;
            this.f101199gxszxtbevo = specialBannerPayload;
        }

        @Override // androidx.lifecycle.iobyxmoadg
        protected androidx.lifecycle.ntlheqmsrt ppxfxbqfkf(String key, Class modelClass, androidx.lifecycle.pkzmftpjix handle) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(modelClass, "modelClass");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(handle, "handle");
            SpecialBannerViewModel specialBannerViewModelIobyxmoadg = this.f101198eablkybsjg.iobyxmoadg(this.f101199gxszxtbevo, handle);
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(specialBannerViewModelIobyxmoadg, "null cannot be cast to non-null type T of ru.myspar.proloyalty.specialbanner.impl.presentation.SpecialBannerFragment.provideViewModelFactory.<no name provided>.create");
            return specialBannerViewModelIobyxmoadg;
        }
    }

    public static final class nufgyqmvbu implements nr1.dxjokdxxww.zoijcleaow {
        nufgyqmvbu() {
        }

        @Override // nr1.dxjokdxxww.zoijcleaow
        public void iobyxmoadg() {
            SpecialBannerFragment.this.wwaezpbzkn().J(xrmfcynszj.gtknphoqwx.f101567iobyxmoadg);
        }

        @Override // nr1.dxjokdxxww.zoijcleaow
        public void ppxfxbqfkf(ds1.ppxfxbqfkf shop) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(shop, "shop");
            SpecialBannerFragment.this.wwaezpbzkn().J(new xrmfcynszj.jpowsppfya(shop.wkgbmnqykc()));
        }

        @Override // nr1.dxjokdxxww.zoijcleaow
        public void zoijcleaow(ds1.ppxfxbqfkf shop) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(shop, "shop");
            SpecialBannerFragment.this.wwaezpbzkn().J(new xrmfcynszj.iwizpuwonk(shop.iobyxmoadg()));
        }
    }

    public static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ SpecialBannerFragment f101201iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.gtknphoqwx.zoijcleaow f101202jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ Fragment f101203yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f101204zdlpuopuiu;

        public static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ SpecialBannerFragment f101205jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private /* synthetic */ Object f101206yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f101207zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar, SpecialBannerFragment specialBannerFragment) {
                super(2, gxszxtbevoVar);
                this.f101205jyumaefscl = specialBannerFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar, this.f101205jyumaefscl);
                iobyxmoadgVar.f101206yggfygwlhe = obj;
                return iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f101207zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    sj.wypolnanlu state = this.f101205jyumaefscl.wwaezpbzkn().getState();
                    eablkybsjg eablkybsjgVar = this.f101205jyumaefscl.new eablkybsjg();
                    this.f101207zdlpuopuiu = 1;
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
                return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Fragment fragment, androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar, SpecialBannerFragment specialBannerFragment) {
            super(2, gxszxtbevoVar);
            this.f101203yggfygwlhe = fragment;
            this.f101202jyumaefscl = zoijcleaowVar;
            this.f101201iwizpuwonk = specialBannerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new ppxfxbqfkf(this.f101203yggfygwlhe, this.f101202jyumaefscl, gxszxtbevoVar, this.f101201iwizpuwonk);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f101204zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                androidx.lifecycle.gtknphoqwx lifecycle = this.f101203yggfygwlhe.getViewLifecycleOwner().getLifecycle();
                androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = this.f101202jyumaefscl;
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(null, this.f101201iwizpuwonk);
                this.f101204zdlpuopuiu = 1;
                if (androidx.lifecycle.lmojexxdyd.iobyxmoadg(lifecycle, zoijcleaowVar, iobyxmoadgVar, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ SpecialBannerFragment f101208iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.gtknphoqwx.zoijcleaow f101209jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ Fragment f101210yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f101211zdlpuopuiu;

        public static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ SpecialBannerFragment f101212jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private /* synthetic */ Object f101213yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f101214zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar, SpecialBannerFragment specialBannerFragment) {
                super(2, gxszxtbevoVar);
                this.f101212jyumaefscl = specialBannerFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar, this.f101212jyumaefscl);
                iobyxmoadgVar.f101213yggfygwlhe = obj;
                return iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f101214zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    sj.lqeggnwhkg lqeggnwhkgVarDraadjrbmk = this.f101212jyumaefscl.wwaezpbzkn().draadjrbmk();
                    gxszxtbevo gxszxtbevoVar = this.f101212jyumaefscl.new gxszxtbevo();
                    this.f101214zdlpuopuiu = 1;
                    if (lqeggnwhkgVarDraadjrbmk.collect(gxszxtbevoVar, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(Fragment fragment, androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar, SpecialBannerFragment specialBannerFragment) {
            super(2, gxszxtbevoVar);
            this.f101210yggfygwlhe = fragment;
            this.f101209jyumaefscl = zoijcleaowVar;
            this.f101208iwizpuwonk = specialBannerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new wkgbmnqykc(this.f101210yggfygwlhe, this.f101209jyumaefscl, gxszxtbevoVar, this.f101208iwizpuwonk);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f101211zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                androidx.lifecycle.gtknphoqwx lifecycle = this.f101210yggfygwlhe.getViewLifecycleOwner().getLifecycle();
                androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = this.f101209jyumaefscl;
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(null, this.f101208iwizpuwonk);
                this.f101211zdlpuopuiu = 1;
                if (androidx.lifecycle.lmojexxdyd.iobyxmoadg(lifecycle, zoijcleaowVar, iobyxmoadgVar, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((wkgbmnqykc) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* synthetic */ class zoijcleaow extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f101215zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1, z41.pkzmftpjix.class, "bind", "bind(Landroid/view/View;)Lru/myspar/proloyalty/databinding/FragmentSpecialBannerProloyaltyBinding;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final z41.pkzmftpjix invoke(View p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return z41.pkzmftpjix.iobyxmoadg(p13);
        }
    }

    public SpecialBannerFragment() {
        super(vk0.eablkybsjg.fragment_special_banner_proloyalty);
        tg.iobyxmoadg iobyxmoadgVar = new tg.iobyxmoadg() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.jhduphickx
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return SpecialBannerFragment.G0(this.f101446zdlpuopuiu);
            }
        };
        gg.gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(gg.ojitshcjhn.NONE, new btonecajqb(new dxjokdxxww(this)));
        this.viewModel = androidx.fragment.app.stevsuqkhv.zoijcleaow(this, kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(SpecialBannerViewModel.class), new gtknphoqwx(gtknphoqwxVarIobyxmoadg), new draadjrbmk(null, gtknphoqwxVarIobyxmoadg), iobyxmoadgVar);
        this.args = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.ppxfxbqfkf
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return SpecialBannerFragment.fmlbqenlif(this.f101476zdlpuopuiu);
            }
        });
        this.binding = sr0.iobyxmoadg.zoijcleaow(this, zoijcleaow.f101215zdlpuopuiu);
        this.bannerAdapter = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.wkgbmnqykc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return SpecialBannerFragment.rhgxfdycjh(this.f101552zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn A(SpecialBannerFragment specialBannerFragment, String collectionId, String itemId) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(collectionId, "collectionId");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(itemId, "itemId");
        specialBannerFragment.wwaezpbzkn().J(new xrmfcynszj.stevsuqkhv(collectionId, itemId));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void A0(czzsidtyhn.oxmwwwfdhm dialogArgs) {
        li1.iobyxmoadg iobyxmoadgVarT = T();
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        u51.zoijcleaow.wkgbmnqykc(iobyxmoadgVarT.iobyxmoadg(contextRequireContext, dialogArgs.ppxfxbqfkf(), dialogArgs.iobyxmoadg(), dialogArgs.zoijcleaow()), O(), v51.eablkybsjg.iobyxmoadg("SPECIAL_BANNER_SCREEN_KEY"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn B(SpecialBannerFragment specialBannerFragment, String collectionId) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(collectionId, "collectionId");
        specialBannerFragment.wwaezpbzkn().J(new xrmfcynszj.kegysxyocb(collectionId));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void B0() {
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        new nr1.ppxfxbqfkf(contextRequireContext).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn C(SpecialBannerFragment specialBannerFragment, s71.wkgbmnqykc it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        specialBannerFragment.wwaezpbzkn().J(new xrmfcynszj.kcexrzcfyt(it));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void C0(ds1.ppxfxbqfkf shop) {
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        new nr1.dxjokdxxww(contextRequireContext, shop, new nufgyqmvbu()).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pj.cllcsxoeiz D(SpecialBannerFragment specialBannerFragment) {
        androidx.lifecycle.vdvldrhtss viewLifecycleOwner = specialBannerFragment.getViewLifecycleOwner();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        return androidx.lifecycle.oxmwwwfdhm.iobyxmoadg(viewLifecycleOwner);
    }

    private final void D0(final String itemId, Date selectedDate) {
        final Calendar calendar = Calendar.getInstance();
        calendar.setTime(selectedDate);
        x81.vdvldrhtss.iobyxmoadg iobyxmoadgVar = new x81.vdvldrhtss.iobyxmoadg(calendar.get(11), calendar.get(12));
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        new x81.vdvldrhtss(contextRequireContext, Boolean.FALSE, null, new tg.rgvfuqvkyq() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.wflxmlrfwp
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return SpecialBannerFragment.E0(this.f101551zdlpuopuiu, itemId, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
            }
        }, iobyxmoadgVar, getString(vk0.lqeggnwhkg.proloyalty_receipt_time_dialog_title), getString(vk0.lqeggnwhkg.proloyalty_set_time_is_future), new tg.rgvfuqvkyq() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.cqumvgiudr
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(SpecialBannerFragment.F0(calendar, ((Integer) obj).intValue(), ((Integer) obj2).intValue()));
            }
        }, 4, null).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn E(SpecialBannerFragment specialBannerFragment, ur1.zoijcleaow it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        specialBannerFragment.wwaezpbzkn().J(new xrmfcynszj.dxjokdxxww(it));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn E0(SpecialBannerFragment specialBannerFragment, String str, int i13, int i14) {
        specialBannerFragment.wwaezpbzkn().e0(str, i13, i14);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn F(SpecialBannerFragment specialBannerFragment, xr1.zoijcleaow it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        specialBannerFragment.wwaezpbzkn().J(new xrmfcynszj.vdvldrhtss(it));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean F0(Calendar calendar, int i13, int i14) {
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(13, 1);
        calendar.set(11, i13);
        calendar.set(12, i14);
        calendar.set(13, 0);
        return calendar.before(calendar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn G(SpecialBannerFragment specialBannerFragment, ms1.iobyxmoadg it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        specialBannerFragment.wwaezpbzkn().J(new xrmfcynszj.dsvhmnatus(it));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.lifecycle.crxdokpmqz.ppxfxbqfkf G0(SpecialBannerFragment specialBannerFragment) {
        return specialBannerFragment.e0(specialBannerFragment.J(), specialBannerFragment, specialBannerFragment.getArguments(), specialBannerFragment.I());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn H(SpecialBannerFragment specialBannerFragment, String blockId) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(blockId, "blockId");
        specialBannerFragment.wwaezpbzkn().J(new xrmfcynszj.hkdspvbjdz(blockId));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final SpecialBannerPayload I() {
        return (SpecialBannerPayload) this.args.getValue();
    }

    private final yq1.iobyxmoadg K() {
        return (yq1.iobyxmoadg) this.bannerAdapter.getValue();
    }

    private final z41.pkzmftpjix L() {
        return (z41.pkzmftpjix) this.binding.iobyxmoadg(this, f101178jpowsppfya[0]);
    }

    private final tg.kcexrzcfyt M(final c31.nufgyqmvbu decoration, final int offsetSize) {
        return new tg.kcexrzcfyt() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.gxszxtbevo
            @Override // tg.kcexrzcfyt
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return Boolean.valueOf(SpecialBannerFragment.N(this.f101438zdlpuopuiu, offsetSize, decoration, (Rect) obj, (View) obj2, (RecyclerView) obj3, (RecyclerView.zynmafqrjb) obj4, ((Integer) obj5).intValue()));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean N(SpecialBannerFragment specialBannerFragment, int i13, c31.nufgyqmvbu nufgyqmvbuVar, Rect outRect, View view, RecyclerView parent, RecyclerView.zynmafqrjb zynmafqrjbVar, int i14) {
        gz0.iobyxmoadg iobyxmoadgVar;
        gz0.iobyxmoadg iobyxmoadgVar2;
        int i15;
        List listPpxfxbqfkf;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(outRect, "outRect");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(view, "view");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(parent, "parent");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(zynmafqrjbVar, "<unused var>");
        kotlin.jvm.internal.wkgbmnqykc wkgbmnqykcVar = kotlin.jvm.internal.wkgbmnqykc.f60036iobyxmoadg;
        int iEzmngbhpjk = specialBannerFragment.I().dxjokdxxww() ? specialBannerFragment.ezmngbhpjk(b31.eablkybsjg.content_margin_32) - i13 : i13;
        RecyclerView.nufgyqmvbu adapter = parent.getAdapter();
        gz0.iobyxmoadg iobyxmoadgVar3 = null;
        df.wkgbmnqykc wkgbmnqykcVar2 = adapter instanceof df.wkgbmnqykc ? (df.wkgbmnqykc) adapter : null;
        if (wkgbmnqykcVar2 == null || (listPpxfxbqfkf = wkgbmnqykcVar2.ppxfxbqfkf()) == null) {
            iobyxmoadgVar = null;
            iobyxmoadgVar2 = null;
        } else {
            Object objLrnfpwlwnk = hg.jyumaefscl.lrnfpwlwnk(listPpxfxbqfkf, i14 - 1);
            iobyxmoadgVar2 = objLrnfpwlwnk instanceof gz0.iobyxmoadg ? (gz0.iobyxmoadg) objLrnfpwlwnk : null;
            Object objLrnfpwlwnk2 = hg.jyumaefscl.lrnfpwlwnk(listPpxfxbqfkf, i14);
            gz0.iobyxmoadg iobyxmoadgVar4 = objLrnfpwlwnk2 instanceof gz0.iobyxmoadg ? (gz0.iobyxmoadg) objLrnfpwlwnk2 : null;
            Object objLrnfpwlwnk3 = hg.jyumaefscl.lrnfpwlwnk(listPpxfxbqfkf, i14 + 1);
            iobyxmoadgVar = objLrnfpwlwnk3 instanceof gz0.iobyxmoadg ? (gz0.iobyxmoadg) objLrnfpwlwnk3 : null;
            iobyxmoadgVar3 = iobyxmoadgVar4;
        }
        if ((iobyxmoadgVar3 instanceof sr1.iobyxmoadg) && i14 == 0) {
            if ((iobyxmoadgVar instanceof sr1.wflxmlrfwp) || (iobyxmoadgVar instanceof s71.wkgbmnqykc)) {
                return true;
            }
            outRect.top = -nufgyqmvbuVar.ojitshcjhn();
        } else {
            if (iobyxmoadgVar3 instanceof wr1.iobyxmoadg) {
                if (iobyxmoadgVar2 instanceof hs1.iobyxmoadg) {
                    i15 = -specialBannerFragment.ezmngbhpjk(b31.eablkybsjg.content_margin_8);
                } else {
                    if (iobyxmoadgVar2 instanceof sr1.iobyxmoadg) {
                        i13 += specialBannerFragment.ezmngbhpjk(b31.eablkybsjg.content_margin_16);
                    }
                    i15 = -i13;
                }
                outRect.top = i15;
                return true;
            }
            if (((iobyxmoadgVar3 instanceof sr1.wflxmlrfwp) || (iobyxmoadgVar3 instanceof s71.wkgbmnqykc)) && (iobyxmoadgVar2 instanceof sr1.iobyxmoadg)) {
                outRect.top = -specialBannerFragment.ezmngbhpjk(b31.eablkybsjg.content_margin_60);
                outRect.bottom = i13;
                return true;
            }
            if (iobyxmoadgVar3 instanceof zr1.iobyxmoadg) {
                outRect.top = iEzmngbhpjk;
                outRect.bottom = i13;
                return true;
            }
            if (iobyxmoadgVar3 instanceof zr1.ppxfxbqfkf) {
                outRect.bottom = specialBannerFragment.ezmngbhpjk(b31.eablkybsjg.content_margin_8);
                return true;
            }
        }
        return false;
    }

    private final int R() {
        return ezmngbhpjk(I().getIs16dpMargin() ? b31.eablkybsjg.content_margin_16 : b31.eablkybsjg.content_margin_24);
    }

    private final c31.nufgyqmvbu S(int offSetSize) {
        c31.nufgyqmvbu nufgyqmvbuVar = new c31.nufgyqmvbu(0, 0, 0, offSetSize, offSetSize, offSetSize, false, false, 199, null);
        nufgyqmvbuVar.vdvldrhtss(M(nufgyqmvbuVar, offSetSize));
        return nufgyqmvbuVar;
    }

    private final void X(rlfsiqarku state) {
        K().wkgbmnqykc(state.eablkybsjg());
        ColorsUiModel colorsUiModelPpxfxbqfkf = state.ppxfxbqfkf();
        h.oipsdeybqn oipsdeybqnVarDxjokdxxww = null;
        if (colorsUiModelPpxfxbqfkf != null) {
            if (!state.dxjokdxxww()) {
                colorsUiModelPpxfxbqfkf = null;
            }
            if (colorsUiModelPpxfxbqfkf != null) {
                Context contextRequireContext = requireContext();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
                L().getRoot().setBackgroundColor(Integer.valueOf(colorsUiModelPpxfxbqfkf.xrmfcynszj(contextRequireContext, ColorsUiModel.iobyxmoadg.PRIMARY)).intValue());
            }
        }
        ComposeView cvActionBar = L().f128326ppxfxbqfkf;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(cvActionBar, "cvActionBar");
        String strLqeggnwhkg = state.lqeggnwhkg();
        tg.iobyxmoadg iobyxmoadgVar = new tg.iobyxmoadg() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.eablkybsjg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return SpecialBannerFragment.Y(this.f101433zdlpuopuiu);
            }
        };
        ColorsUiModel colorsUiModelPpxfxbqfkf2 = state.ppxfxbqfkf();
        if (colorsUiModelPpxfxbqfkf2 != null) {
            Context contextRequireContext2 = requireContext();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(contextRequireContext2, "requireContext(...)");
            oipsdeybqnVarDxjokdxxww = h.oipsdeybqn.dxjokdxxww(h.bfopjjpdmp.zoijcleaow(colorsUiModelPpxfxbqfkf2.xrmfcynszj(contextRequireContext2, ColorsUiModel.iobyxmoadg.PRIMARY)));
        }
        as0.iobyxmoadg.zoijcleaow(cvActionBar, null, strLqeggnwhkg, null, false, iobyxmoadgVar, oipsdeybqnVarDxjokdxxww, null, 77, null);
        ComposeView clLoading = L().f128328zoijcleaow;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(clLoading, "clLoading");
        o31.wkgbmnqykc.nufgyqmvbu(clLoading, state.nufgyqmvbu());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn Y(SpecialBannerFragment specialBannerFragment) {
        specialBannerFragment.wwaezpbzkn().J(xrmfcynszj.gxszxtbevo.f101568iobyxmoadg);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void Z(czzsidtyhn uiLabel) {
        if (uiLabel instanceof czzsidtyhn.zdlpuopuiu) {
            C0(((czzsidtyhn.zdlpuopuiu) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof czzsidtyhn.eablkybsjg) {
            a31.iobyxmoadg.ppxfxbqfkf(V(), vk0.lqeggnwhkg.proloyalty_unauthorized_error_message, null, lr0.eablkybsjg.gxszxtbevo.NonFatal, 2, null);
            return;
        }
        if (uiLabel instanceof czzsidtyhn.agtfadlqog) {
            a31.iobyxmoadg.btonecajqb(V(), ((czzsidtyhn.agtfadlqog) uiLabel).iobyxmoadg(), null, null, 6, null);
            return;
        }
        if (uiLabel instanceof czzsidtyhn.rgvfuqvkyq) {
            y0();
            return;
        }
        if (uiLabel instanceof czzsidtyhn.wflxmlrfwp) {
            w0(((czzsidtyhn.wflxmlrfwp) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof czzsidtyhn.iobyxmoadg) {
            c0();
            return;
        }
        if (uiLabel instanceof czzsidtyhn.draadjrbmk) {
            v0();
            return;
        }
        if (uiLabel instanceof czzsidtyhn.kcexrzcfyt) {
            B0();
            return;
        }
        if (uiLabel instanceof czzsidtyhn.zoijcleaow) {
            czzsidtyhn.zoijcleaow zoijcleaowVar = (czzsidtyhn.zoijcleaow) uiLabel;
            D0(zoijcleaowVar.iobyxmoadg(), zoijcleaowVar.zoijcleaow());
            return;
        }
        if (uiLabel instanceof czzsidtyhn.nufgyqmvbu) {
            r0(((czzsidtyhn.nufgyqmvbu) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof czzsidtyhn.lqeggnwhkg) {
            p0();
            return;
        }
        if (uiLabel instanceof czzsidtyhn.vdvldrhtss) {
            z0(((czzsidtyhn.vdvldrhtss) uiLabel).iobyxmoadg());
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(uiLabel, czzsidtyhn.wkgbmnqykc.f101425iobyxmoadg)) {
            g0();
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(uiLabel, czzsidtyhn.ppxfxbqfkf.f101420iobyxmoadg)) {
            f0();
            return;
        }
        if (uiLabel instanceof czzsidtyhn.gtknphoqwx) {
            czzsidtyhn.gtknphoqwx gtknphoqwxVar = (czzsidtyhn.gtknphoqwx) uiLabel;
            u0(gtknphoqwxVar.zoijcleaow(), gtknphoqwxVar.iobyxmoadg());
            return;
        }
        if (uiLabel instanceof czzsidtyhn.dxjokdxxww) {
            n0(((czzsidtyhn.dxjokdxxww) uiLabel).iobyxmoadg());
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(uiLabel, czzsidtyhn.gxszxtbevo.f101407iobyxmoadg)) {
            k0();
            return;
        }
        if (uiLabel instanceof czzsidtyhn.oxmwwwfdhm) {
            A0((czzsidtyhn.oxmwwwfdhm) uiLabel);
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(uiLabel, czzsidtyhn.btonecajqb.f101401iobyxmoadg)) {
            t0();
            return;
        }
        if (uiLabel instanceof czzsidtyhn.yggfygwlhe) {
            a31.iobyxmoadg.eablkybsjg(V(), ((czzsidtyhn.yggfygwlhe) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof czzsidtyhn.jyumaefscl) {
            a31.iobyxmoadg.btonecajqb(V(), ((czzsidtyhn.jyumaefscl) uiLabel).iobyxmoadg(), null, null, 6, null);
            return;
        }
        if (!(uiLabel instanceof czzsidtyhn.ojitshcjhn)) {
            throw new NoWhenBranchMatchedException();
        }
        czzsidtyhn.ojitshcjhn ojitshcjhnVar = (czzsidtyhn.ojitshcjhn) uiLabel;
        HintUiModel hintUiModelZoijcleaow = ojitshcjhnVar.zoijcleaow();
        HintDialogAnalyticsInfo hintDialogAnalyticsInfoIobyxmoadg = ojitshcjhnVar.iobyxmoadg();
        androidx.fragment.app.oxmwwwfdhm oxmwwwfdhmVarRequireActivity = requireActivity();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(oxmwwwfdhmVarRequireActivity, "requireActivity(...)");
        ms0.zoijcleaow.iobyxmoadg(hintUiModelZoijcleaow, hintDialogAnalyticsInfoIobyxmoadg, oxmwwwfdhmVarRequireActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn a(SpecialBannerFragment specialBannerFragment, HintUiModel hint, AnalyticElement.ProductItemElement element, AnalyticsLocation.ItemFeed location) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(hint, "hint");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(element, "element");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(location, "location");
        specialBannerFragment.wwaezpbzkn().J(new xrmfcynszj.wwaezpbzkn(hint, element, location));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object a0(SpecialBannerFragment specialBannerFragment, rlfsiqarku rlfsiqarkuVar, lg.gxszxtbevo gxszxtbevoVar) {
        specialBannerFragment.X(rlfsiqarkuVar);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn b(SpecialBannerFragment specialBannerFragment, hs1.iobyxmoadg it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        specialBannerFragment.wwaezpbzkn().J(new xrmfcynszj.ylkuphrtab(it));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object b0(SpecialBannerFragment specialBannerFragment, czzsidtyhn czzsidtyhnVar, lg.gxszxtbevo gxszxtbevoVar) {
        specialBannerFragment.Z(czzsidtyhnVar);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn c(SpecialBannerFragment specialBannerFragment, zr1.iobyxmoadg it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        specialBannerFragment.wwaezpbzkn().J(new xrmfcynszj.zynmafqrjb(it));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void c0() {
        eablkybsjg.ppxfxbqfkf activityResultRegistry = requireActivity().getActivityResultRegistry();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(activityResultRegistry, "<get-activityResultRegistry>(...)");
        new d31.gxszxtbevo(activityResultRegistry, new tg.draadjrbmk() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.jlmebxxoox
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerFragment.d0(this.f101447zdlpuopuiu, (Uri) obj);
            }
        }, null, 4, null).zoijcleaow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn d(SpecialBannerFragment specialBannerFragment, ProductUiModel product, ProductCardEvent productCardEvent, AnalyticsLocation.ItemFeed location) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productCardEvent, "productCardEvent");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(location, "location");
        specialBannerFragment.wwaezpbzkn().J(new xrmfcynszj.iozdgvuglv(product, productCardEvent, location));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn d0(SpecialBannerFragment specialBannerFragment, Uri uri) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(uri, "uri");
        SpecialBannerViewModel specialBannerViewModelWwaezpbzkn = specialBannerFragment.wwaezpbzkn();
        String string = uri.toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        specialBannerViewModelWwaezpbzkn.J(new xrmfcynszj.cqumvgiudr(string));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn e(SpecialBannerFragment specialBannerFragment, ProductUiModel product) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
        specialBannerFragment.wwaezpbzkn().J(new xrmfcynszj.zoijcleaow(product));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final lqeggnwhkg e0(iobyxmoadg assistedFactory, q5.dxjokdxxww owner, Bundle args, SpecialBannerPayload payload) {
        return new lqeggnwhkg(owner, args, assistedFactory, payload);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn eslsurpljm(SpecialBannerFragment specialBannerFragment, String itemId, js1.iobyxmoadg question) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(itemId, "itemId");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(question, "question");
        specialBannerFragment.wwaezpbzkn().J(new xrmfcynszj.pkzmftpjix(itemId, question));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final int ezmngbhpjk(int i13) {
        return getResources().getDimensionPixelSize(i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn f(SpecialBannerFragment specialBannerFragment, ProductUiModel product, AnalyticsLocation.ItemFeed location) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(location, "location");
        specialBannerFragment.wwaezpbzkn().J(new xrmfcynszj.jyumaefscl(product, location));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void f0() {
        getParentFragmentManager().Q("special_banner_evropolis_shown_request_key", new Bundle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SpecialBannerPayload fmlbqenlif(SpecialBannerFragment specialBannerFragment) {
        return (SpecialBannerPayload) jr0.zoijcleaow.wkgbmnqykc(specialBannerFragment, kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(SpecialBannerPayload.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn g(SpecialBannerFragment specialBannerFragment, String itemId) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(itemId, "itemId");
        specialBannerFragment.wwaezpbzkn().J(new xrmfcynszj.eablkybsjg(itemId));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void g0() {
        Dialog dialog = this.ageCheckedDialog;
        if (dialog == null || !dialog.isShowing()) {
            ac1.zoijcleaow zoijcleaowVar = ac1.zoijcleaow.f1546iobyxmoadg;
            Context contextRequireContext = requireContext();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
            ow0.nufgyqmvbu nufgyqmvbuVarIobyxmoadg = zoijcleaowVar.iobyxmoadg(contextRequireContext, new tg.iobyxmoadg() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.ylkuphrtab
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return SpecialBannerFragment.h0(this.f101617zdlpuopuiu);
                }
            }, new tg.iobyxmoadg() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.mbcevpiqjq
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return SpecialBannerFragment.i0(this.f101464zdlpuopuiu);
                }
            }, new tg.iobyxmoadg() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.crxdokpmqz
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return SpecialBannerFragment.j0(this.f101399zdlpuopuiu);
                }
            }, ow0.ppxfxbqfkf.VERTICAL);
            this.ageCheckedDialog = nufgyqmvbuVarIobyxmoadg;
            if (nufgyqmvbuVarIobyxmoadg != null) {
                nufgyqmvbuVarIobyxmoadg.show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn h(SpecialBannerFragment specialBannerFragment, s71.wkgbmnqykc it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        specialBannerFragment.wwaezpbzkn().J(new xrmfcynszj.oxmwwwfdhm(it));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn h0(SpecialBannerFragment specialBannerFragment) {
        specialBannerFragment.wwaezpbzkn().J(xrmfcynszj.wkgbmnqykc.f101601iobyxmoadg);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn i(SpecialBannerFragment specialBannerFragment, String itemId) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(itemId, "itemId");
        specialBannerFragment.wwaezpbzkn().J(new xrmfcynszj.rgvfuqvkyq(itemId));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn i0(SpecialBannerFragment specialBannerFragment) {
        specialBannerFragment.wwaezpbzkn().J(xrmfcynszj.ppxfxbqfkf.f101594iobyxmoadg);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn j(SpecialBannerFragment specialBannerFragment, String itemId, RegistrationFormView.zoijcleaow change) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(itemId, "itemId");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(change, "change");
        specialBannerFragment.wwaezpbzkn().J(new xrmfcynszj.esjtqupxsv(itemId, change));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn j0(SpecialBannerFragment specialBannerFragment) {
        specialBannerFragment.wwaezpbzkn().J(xrmfcynszj.ppxfxbqfkf.f101594iobyxmoadg);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn k(SpecialBannerFragment specialBannerFragment, yr1.iobyxmoadg it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        specialBannerFragment.wwaezpbzkn().J(new xrmfcynszj.lereixgezr(it));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void k0() {
        u51.zoijcleaow.zoijcleaow(P().iobyxmoadg(), O(), v51.eablkybsjg.iobyxmoadg("SPECIAL_BANNER_SCREEN_KEY"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn krqnebusok(SpecialBannerFragment specialBannerFragment, ProductUiModel productModel, AnalyticsLocation.ItemFeed analyticLocation) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productModel, "productModel");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticLocation, "analyticLocation");
        specialBannerFragment.wwaezpbzkn().J(new xrmfcynszj.lmojexxdyd(productModel, analyticLocation));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn l(SpecialBannerFragment specialBannerFragment) {
        specialBannerFragment.wwaezpbzkn().J(xrmfcynszj.pmvmpeiblj.f101593iobyxmoadg);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void l0(final String itemId, Date selectedDate) {
        Calendar calendar = Calendar.getInstance();
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        new ls0.wkgbmnqykc(contextRequireContext, Boolean.FALSE, null, new tg.draadjrbmk() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.sopmlzcsov
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerFragment.m0(this.f101489zdlpuopuiu, itemId, (Date) obj);
            }
        }, getString(vk0.lqeggnwhkg.proloyalty_receipt_date_dialog_title), selectedDate, null, calendar.getTime(), 68, null).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn m(SpecialBannerFragment specialBannerFragment, ComboSetProduct product, wm0.zoijcleaow analyticsData) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsData, "analyticsData");
        specialBannerFragment.wwaezpbzkn().J(new xrmfcynszj.draadjrbmk(product, analyticsData));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn m0(SpecialBannerFragment specialBannerFragment, String str, Date it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        specialBannerFragment.wwaezpbzkn().H(str, it);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn n(SpecialBannerFragment specialBannerFragment, kt0.iobyxmoadg it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        specialBannerFragment.wwaezpbzkn().J(new xrmfcynszj.agtfadlqog(it));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void n0(PurchaseListAddProductDialogArgs args) {
        BaseComposeMviBottomSheetDialogFragment baseComposeMviBottomSheetDialogFragmentDxjokdxxww = U().dxjokdxxww(args, new tg.iobyxmoadg() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.vipkmwdibw
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return SpecialBannerFragment.o0(this.f101548zdlpuopuiu);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(childFragmentManager, "getChildFragmentManager(...)");
        baseComposeMviBottomSheetDialogFragmentDxjokdxxww.ntlheqmsrt(childFragmentManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn o(SpecialBannerFragment specialBannerFragment, kt0.iobyxmoadg comboSet) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(comboSet, "comboSet");
        specialBannerFragment.wwaezpbzkn().J(new xrmfcynszj.wflxmlrfwp(comboSet.wflxmlrfwp().iobyxmoadg(), comboSet.wflxmlrfwp().zoijcleaow()));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn o0(SpecialBannerFragment specialBannerFragment) {
        a31.iobyxmoadg.eablkybsjg(specialBannerFragment.V(), vk0.lqeggnwhkg.proloyalty_purchases_list_product_added_to_the_list);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn p(SpecialBannerFragment specialBannerFragment, is1.ppxfxbqfkf it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        specialBannerFragment.wwaezpbzkn().J(new xrmfcynszj.ojitshcjhn(it));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void p0() {
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        new y81.wkgbmnqykc(contextRequireContext, new tg.iobyxmoadg() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.zoijcleaow
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return SpecialBannerFragment.q0(this.f101621zdlpuopuiu);
            }
        }, null, 4, null).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn q(SpecialBannerFragment specialBannerFragment, String groupId, sr1.zoijcleaow banner) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(groupId, "groupId");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(banner, "banner");
        specialBannerFragment.wwaezpbzkn().J(new xrmfcynszj.lqeggnwhkg(groupId, banner));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn q0(SpecialBannerFragment specialBannerFragment) {
        specialBannerFragment.wwaezpbzkn().J(xrmfcynszj.cdpycssgdh.f101557iobyxmoadg);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn r(SpecialBannerFragment specialBannerFragment, sr1.draadjrbmk it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        specialBannerFragment.wwaezpbzkn().J(new xrmfcynszj.istkbnxepw(it));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void r0(BuildYourComboDialogArgs dialogArgs) {
        BuildYourComboDialogFragment buildYourComboDialogFragmentSflfametgt = BuildYourComboDialogFragment.INSTANCE.iobyxmoadg(dialogArgs).sflfametgt(new tg.rgvfuqvkyq() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.lqeggnwhkg
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return SpecialBannerFragment.s0(this.f101462zdlpuopuiu, (ComboSetProduct) obj, (ComboSetProduct) obj2);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(childFragmentManager, "getChildFragmentManager(...)");
        buildYourComboDialogFragmentSflfametgt.ntlheqmsrt(childFragmentManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yq1.iobyxmoadg rhgxfdycjh(final SpecialBannerFragment specialBannerFragment) {
        yq1.iobyxmoadg iobyxmoadgVar = new yq1.iobyxmoadg(new tg.iobyxmoadg() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.dsvhmnatus
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return SpecialBannerFragment.D(this.f101431zdlpuopuiu);
            }
        }, new tg.draadjrbmk() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.wypolnanlu
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerFragment.E(this.f101554zdlpuopuiu, (ur1.zoijcleaow) obj);
            }
        }, new tg.draadjrbmk() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.stevsuqkhv
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerFragment.F(this.f101490zdlpuopuiu, (xr1.zoijcleaow) obj);
            }
        }, new tg.draadjrbmk() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.kegysxyocb
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerFragment.G(this.f101459zdlpuopuiu, (ms1.iobyxmoadg) obj);
            }
        }, new tg.draadjrbmk() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.tzroggbefp
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerFragment.H(this.f101491zdlpuopuiu, (String) obj);
            }
        }, new tg.draadjrbmk() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.ntlheqmsrt
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerFragment.yzdjzghtvl(this.f101468zdlpuopuiu, (ds1.ppxfxbqfkf) obj);
            }
        }, new tg.rgvfuqvkyq() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.ulzqkzuiru
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return SpecialBannerFragment.eslsurpljm(this.f101492zdlpuopuiu, (String) obj, (js1.iobyxmoadg) obj2);
            }
        }, new tg.rgvfuqvkyq() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.dxjokdxxww
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return SpecialBannerFragment.krqnebusok(this.f101432zdlpuopuiu, (ProductUiModel) obj, (AnalyticsLocation.ItemFeed) obj2);
            }
        }, new tg.vdvldrhtss() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.btonecajqb
            @Override // tg.vdvldrhtss
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return SpecialBannerFragment.a(this.f101395zdlpuopuiu, (HintUiModel) obj, (AnalyticElement.ProductItemElement) obj2, (AnalyticsLocation.ItemFeed) obj3);
            }
        }, new tg.draadjrbmk() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.gtknphoqwx
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerFragment.b(this.f101435zdlpuopuiu, (hs1.iobyxmoadg) obj);
            }
        }, new tg.draadjrbmk() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.draadjrbmk
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerFragment.c(this.f101430zdlpuopuiu, (zr1.iobyxmoadg) obj);
            }
        }, new tg.vdvldrhtss() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.agtfadlqog
            @Override // tg.vdvldrhtss
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return SpecialBannerFragment.d(this.f101394zdlpuopuiu, (ProductUiModel) obj, (ProductCardEvent) obj2, (AnalyticsLocation.ItemFeed) obj3);
            }
        }, new tg.draadjrbmk() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.ojitshcjhn
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerFragment.e(this.f101471zdlpuopuiu, (ProductUiModel) obj);
            }
        }, new tg.rgvfuqvkyq() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.rgvfuqvkyq
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return SpecialBannerFragment.f(this.f101477zdlpuopuiu, (ProductUiModel) obj, (AnalyticsLocation.ItemFeed) obj2);
            }
        }, new tg.draadjrbmk() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.vdvldrhtss
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerFragment.g(this.f101493zdlpuopuiu, (String) obj);
            }
        }, new tg.draadjrbmk() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.oxmwwwfdhm
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerFragment.i(this.f101473zdlpuopuiu, (String) obj);
            }
        }, new tg.rgvfuqvkyq() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.kcexrzcfyt
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return SpecialBannerFragment.j(this.f101458zdlpuopuiu, (String) obj, (RegistrationFormView.zoijcleaow) obj2);
            }
        }, new tg.draadjrbmk() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.yggfygwlhe
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerFragment.k(this.f101616zdlpuopuiu, (yr1.iobyxmoadg) obj);
            }
        }, new tg.iobyxmoadg() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.jyumaefscl
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return SpecialBannerFragment.l(this.f101449zdlpuopuiu);
            }
        }, new tg.rgvfuqvkyq() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.iwizpuwonk
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return SpecialBannerFragment.m(this.f101443zdlpuopuiu, (ComboSetProduct) obj, (wm0.zoijcleaow) obj2);
            }
        }, new tg.draadjrbmk() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.esjtqupxsv
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerFragment.n(this.f101434zdlpuopuiu, (kt0.iobyxmoadg) obj);
            }
        }, new tg.draadjrbmk() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.lereixgezr
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerFragment.o(this.f101460zdlpuopuiu, (kt0.iobyxmoadg) obj);
            }
        }, new tg.draadjrbmk() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.pmvmpeiblj
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerFragment.p(this.f101475zdlpuopuiu, (is1.ppxfxbqfkf) obj);
            }
        }, new tg.rgvfuqvkyq() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.zynmafqrjb
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return SpecialBannerFragment.q(this.f101622zdlpuopuiu, (String) obj, (sr1.zoijcleaow) obj2);
            }
        }, new tg.draadjrbmk() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.istkbnxepw
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerFragment.r(this.f101442zdlpuopuiu, (sr1.draadjrbmk) obj);
            }
        }, new tg.draadjrbmk() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.cdpycssgdh
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerFragment.t(this.f101396zdlpuopuiu, (String) obj);
            }
        }, new tg.draadjrbmk() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.yadqdtsiqt
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerFragment.u(this.f101613zdlpuopuiu, (String) obj);
            }
        }, new tg.draadjrbmk() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.lmojexxdyd
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerFragment.v(this.f101461zdlpuopuiu, (ks1.iobyxmoadg) obj);
            }
        }, new tg.iobyxmoadg() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.wwaezpbzkn
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return SpecialBannerFragment.w(this.f101553zdlpuopuiu);
            }
        }, new tg.iobyxmoadg() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.pkzmftpjix
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return SpecialBannerFragment.x(this.f101474zdlpuopuiu);
            }
        }, new tg.rgvfuqvkyq() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.hcddaimhww
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return SpecialBannerFragment.y(this.f101439zdlpuopuiu, (k21.ojitshcjhn) obj, (String) obj2);
            }
        }, new tg.rgvfuqvkyq() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.jpowsppfya
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return SpecialBannerFragment.z(this.f101448zdlpuopuiu, (String) obj, (String) obj2);
            }
        }, new tg.rgvfuqvkyq() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.hkdspvbjdz
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return SpecialBannerFragment.A(this.f101440zdlpuopuiu, (String) obj, (String) obj2);
            }
        }, new tg.draadjrbmk() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.cllcsxoeiz
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerFragment.B(this.f101397zdlpuopuiu, (String) obj);
            }
        }, specialBannerFragment.I().dxjokdxxww(), specialBannerFragment.I().btonecajqb() ? 3 : 2, specialBannerFragment.Q().iobyxmoadg(new tg.draadjrbmk() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.nufgyqmvbu
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerFragment.h(this.f101469zdlpuopuiu, (s71.wkgbmnqykc) obj);
            }
        }, new tg.draadjrbmk() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.zdlpuopuiu
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerFragment.s(this.f101618zdlpuopuiu, (s71.wkgbmnqykc) obj);
            }
        }, new tg.draadjrbmk() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.iozdgvuglv
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerFragment.C(this.f101441zdlpuopuiu, (s71.wkgbmnqykc) obj);
            }
        }));
        iobyxmoadgVar.setStateRestorationPolicy(RecyclerView.nufgyqmvbu.iobyxmoadg.PREVENT_WHEN_EMPTY);
        return iobyxmoadgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn s(SpecialBannerFragment specialBannerFragment, s71.wkgbmnqykc it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        specialBannerFragment.wwaezpbzkn().J(new xrmfcynszj.zdlpuopuiu(it));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn s0(SpecialBannerFragment specialBannerFragment, ComboSetProduct productFirst, ComboSetProduct productSecond) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productFirst, "productFirst");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productSecond, "productSecond");
        specialBannerFragment.wwaezpbzkn().J(new xrmfcynszj.wflxmlrfwp(productFirst, productSecond));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn t(SpecialBannerFragment specialBannerFragment, String it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        specialBannerFragment.l0(it, specialBannerFragment.wwaezpbzkn().j());
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void t0() {
        V().iobyxmoadg(lr0.eablkybsjg.zoijcleaow.ppxfxbqfkf(lr0.eablkybsjg.f63889zoijcleaow, b31.wflxmlrfwp.proloyalty_unlock_promo_product_error_message, null, new lr0.eablkybsjg.nufgyqmvbu.iobyxmoadg(vk0.lqeggnwhkg.proloyalty_error), lr0.eablkybsjg.gxszxtbevo.NonFatal, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn u(SpecialBannerFragment specialBannerFragment, String it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        specialBannerFragment.wwaezpbzkn().J(new xrmfcynszj.hcddaimhww(it));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void u0(EvropolisGift gift, DeliveryCode deliveryCode) {
        r71.iobyxmoadg iobyxmoadgVarQ = Q();
        FragmentManager childFragmentManager = getChildFragmentManager();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(childFragmentManager, "getChildFragmentManager(...)");
        iobyxmoadgVarQ.ppxfxbqfkf(gift, deliveryCode, childFragmentManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn v(SpecialBannerFragment specialBannerFragment, ks1.iobyxmoadg it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        specialBannerFragment.wwaezpbzkn().J(new xrmfcynszj.cllcsxoeiz(it));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void v0() {
        V().iobyxmoadg(lr0.eablkybsjg.zoijcleaow.ppxfxbqfkf(lr0.eablkybsjg.f63889zoijcleaow, vk0.lqeggnwhkg.proloyalty_file_size_exceeded, null, new lr0.eablkybsjg.nufgyqmvbu.iobyxmoadg(vk0.lqeggnwhkg.proloyalty_error), lr0.eablkybsjg.gxszxtbevo.NonFatal, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn w(SpecialBannerFragment specialBannerFragment) {
        specialBannerFragment.wwaezpbzkn().J(xrmfcynszj.yggfygwlhe.f101608iobyxmoadg);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void w0(final ChangeProductParams params) {
        BaseDialogFragment baseDialogFragmentLmojexxdyd = IqosAgreementsDialogFragment.INSTANCE.iobyxmoadg().lmojexxdyd(new tg.iobyxmoadg() { // from class: ru.myspar.proloyalty.specialbanner.impl.presentation.ribwqtqdhb
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return SpecialBannerFragment.x0(this.f101479zdlpuopuiu, params);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(childFragmentManager, "getChildFragmentManager(...)");
        baseDialogFragmentLmojexxdyd.wwaezpbzkn(childFragmentManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn x(SpecialBannerFragment specialBannerFragment) {
        specialBannerFragment.wwaezpbzkn().J(xrmfcynszj.nufgyqmvbu.f101588iobyxmoadg);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn x0(SpecialBannerFragment specialBannerFragment, ChangeProductParams changeProductParams) {
        specialBannerFragment.wwaezpbzkn().J(new xrmfcynszj.btonecajqb(changeProductParams));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn y(SpecialBannerFragment specialBannerFragment, k21.ojitshcjhn navLink, String str) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(navLink, "navLink");
        specialBannerFragment.wwaezpbzkn().J(new xrmfcynszj.iobyxmoadg(navLink, str));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void y0() {
        a31.iobyxmoadg.eablkybsjg(V(), vk0.lqeggnwhkg.proloyalty_product_not_available);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn yzdjzghtvl(SpecialBannerFragment specialBannerFragment, ds1.ppxfxbqfkf it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        specialBannerFragment.wwaezpbzkn().J(new xrmfcynszj.yadqdtsiqt(it));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn z(SpecialBannerFragment specialBannerFragment, String collectionId, String specialPromoBannerId) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(collectionId, "collectionId");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(specialPromoBannerId, "specialPromoBannerId");
        specialBannerFragment.wwaezpbzkn().J(new xrmfcynszj.wypolnanlu(collectionId, specialPromoBannerId));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void z0(QrCodeArgs args) {
        QrCodeDialogFragment qrCodeDialogFragmentIobyxmoadg = QrCodeDialogFragment.INSTANCE.iobyxmoadg(args);
        FragmentManager childFragmentManager = getChildFragmentManager();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(childFragmentManager, "getChildFragmentManager(...)");
        qrCodeDialogFragmentIobyxmoadg.ntlheqmsrt(childFragmentManager);
    }

    public final iobyxmoadg J() {
        iobyxmoadg iobyxmoadgVar = this.assistedFactory;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("assistedFactory");
        return null;
    }

    public final u51.iobyxmoadg O() {
        u51.iobyxmoadg iobyxmoadgVar = this.dialogManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("dialogManager");
        return null;
    }

    public final y61.iobyxmoadg P() {
        y61.iobyxmoadg iobyxmoadgVar = this.dynamicQrFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("dynamicQrFeatureApi");
        return null;
    }

    public final r71.iobyxmoadg Q() {
        r71.iobyxmoadg iobyxmoadgVar = this.evropolisFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("evropolisFeatureApi");
        return null;
    }

    public final li1.iobyxmoadg T() {
        li1.iobyxmoadg iobyxmoadgVar = this.promoCollectionFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("promoCollectionFeatureApi");
        return null;
    }

    public final ri1.iobyxmoadg U() {
        ri1.iobyxmoadg iobyxmoadgVar = this.purchasesFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("purchasesFeatureApi");
        return null;
    }

    public final z21.iobyxmoadg V() {
        z21.iobyxmoadg iobyxmoadgVar = this.snackbarManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("snackbarManager");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvvm.BaseMvvmFragment
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public SpecialBannerViewModel wwaezpbzkn() {
        return (SpecialBannerViewModel) this.viewModel.getValue();
    }

    @Override // j21.iobyxmoadg
    public boolean gxszxtbevo() {
        wwaezpbzkn().J(xrmfcynszj.gxszxtbevo.f101568iobyxmoadg);
        return true;
    }

    @Override // ru.myspar.proloyalty.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SpecialBannerViewModel.RegistrationFormState registrationFormState = savedInstanceState != null ? (SpecialBannerViewModel.RegistrationFormState) savedInstanceState.getParcelable("KEY_FORM_STATE") : null;
        SpecialBannerViewModel.RegistrationFormState registrationFormState2 = registrationFormState != null ? registrationFormState : null;
        if (registrationFormState2 != null) {
            wwaezpbzkn().y0(registrationFormState2);
        }
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

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(outState, "outState");
        SpecialBannerViewModel.RegistrationFormState registrationFormStateH = wwaezpbzkn().h();
        if (registrationFormStateH != null) {
            outState.putParcelable("KEY_FORM_STATE", registrationFormStateH);
        }
        super.onSaveInstanceState(outState);
    }

    @Override // ru.myspar.proloyalty.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = L().f128327wkgbmnqykc;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setItemAnimator(null);
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(recyclerView);
        r41.zoijcleaow.ppxfxbqfkf(recyclerView, K(), L());
        recyclerView.btonecajqb(S(R()));
        androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = androidx.lifecycle.gtknphoqwx.zoijcleaow.STARTED;
        androidx.lifecycle.vdvldrhtss viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        pj.gtknphoqwx.wkgbmnqykc(androidx.lifecycle.oxmwwwfdhm.iobyxmoadg(viewLifecycleOwner), null, null, new ppxfxbqfkf(this, zoijcleaowVar, null, this), 3, null);
        androidx.lifecycle.vdvldrhtss viewLifecycleOwner2 = getViewLifecycleOwner();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        pj.gtknphoqwx.wkgbmnqykc(androidx.lifecycle.oxmwwwfdhm.iobyxmoadg(viewLifecycleOwner2), null, null, new wkgbmnqykc(this, zoijcleaowVar, null, this), 3, null);
    }
}
