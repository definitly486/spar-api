package ru.myspar.specialbanner.impl.presentation;

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
import ru.myspar.analytics.api.model.AnalyticElement;
import ru.myspar.analytics.api.model.AnalyticsLocation;
import ru.myspar.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.common.view.hint.model.HintUiModel;
import ru.myspar.common.view.product.model.product.ProductUiModel;
import ru.myspar.core.base.api.dialog.BaseDialogFragment;
import ru.myspar.core.base.mvi.bottomsheet.BaseComposeMviBottomSheetDialogFragment;
import ru.myspar.core.domain.interactor.product_change.models.ChangeProductParams;
import ru.myspar.core.domain.models.ColorsUiModel;
import ru.myspar.core.domain.models.ProductCardEvent;
import ru.myspar.core.domain.models.comboset.ComboSetProduct;
import ru.myspar.core.models.delivery.DeliveryCode;
import ru.myspar.domain.feature.comboset.buildyourcombo.strore.BuildYourComboDialogArgs;
import ru.myspar.domain.feature.qrcode.store.QrCodeArgs;
import ru.myspar.dynamic_qr.api.model.DynamicQrCodeArgs;
import ru.myspar.evropolis.api.model.EvropolisGift;
import ru.myspar.legacy.presentation.dialogs.comboset.buildyourcombo.BuildYourComboDialogFragment;
import ru.myspar.legacy.presentation.dialogs.iqos.IqosAgreementsDialogFragment;
import ru.myspar.legacy.presentation.dialogs.qrcode.QrCodeDialogFragment;
import ru.myspar.purchases.api.model.PurchaseListAddProductDialogArgs;
import ru.myspar.specialbanner.api.models.SpecialBannerPayload;
import ru.myspar.specialbanner.impl.presentation.views.RegistrationFormView;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0093\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001c\b\u0007\u0018\u0000 ³\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002´\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\f\u0010\nJ!\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0005J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001dH\u0002¢\u0006\u0004\b\"\u0010#JC\u0010*\u001a&\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00110&2\u0006\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020\u001dH\u0002¢\u0006\u0004\b*\u0010+J\u0013\u0010,\u001a\u00020\u001d*\u00020\u001dH\u0002¢\u0006\u0004\b,\u0010-J\u001f\u00102\u001a\u00020\b2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b2\u00103J\u001f\u00104\u001a\u00020\b2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b4\u00103J\u000f\u00105\u001a\u00020\bH\u0002¢\u0006\u0004\b5\u0010\u0005J\u001f\u00109\u001a\u00020\b2\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u00020.H\u0002¢\u0006\u0004\b9\u0010:J!\u0010?\u001a\u00020\b2\u0006\u0010<\u001a\u00020;2\b\u0010>\u001a\u0004\u0018\u00010=H\u0002¢\u0006\u0004\b?\u0010@J\u0017\u0010C\u001a\u00020\b2\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020\b2\u0006\u0010B\u001a\u00020EH\u0002¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\bH\u0002¢\u0006\u0004\bH\u0010\u0005J\u000f\u0010I\u001a\u00020\bH\u0002¢\u0006\u0004\bI\u0010\u0005J\u000f\u0010J\u001a\u00020\bH\u0002¢\u0006\u0004\bJ\u0010\u0005J\u000f\u0010K\u001a\u00020\bH\u0002¢\u0006\u0004\bK\u0010\u0005J\u0017\u0010L\u001a\u00020\b2\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\bL\u0010MJ\u0017\u0010P\u001a\u00020\b2\u0006\u0010O\u001a\u00020NH\u0002¢\u0006\u0004\bP\u0010QJ\u0017\u0010T\u001a\u00020\b2\u0006\u0010S\u001a\u00020RH\u0002¢\u0006\u0004\bT\u0010UJ\u000f\u0010V\u001a\u00020\bH\u0002¢\u0006\u0004\bV\u0010\u0005J\u000f\u0010W\u001a\u00020\bH\u0002¢\u0006\u0004\bW\u0010\u0005J\u000f\u0010X\u001a\u00020\bH\u0002¢\u0006\u0004\bX\u0010\u0005J\u0017\u0010Z\u001a\u00020\b2\u0006\u0010S\u001a\u00020YH\u0002¢\u0006\u0004\bZ\u0010[J\u000f\u0010\\\u001a\u00020\bH\u0002¢\u0006\u0004\b\\\u0010\u0005J3\u0010d\u001a\u00020c2\u0006\u0010^\u001a\u00020]2\u0006\u0010`\u001a\u00020_2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u00062\u0006\u0010b\u001a\u00020aH\u0002¢\u0006\u0004\bd\u0010eR\"\u0010^\u001a\u00020]8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\"\u0010s\u001a\u00020l8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\"\u0010{\u001a\u00020t8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR&\u0010\u0083\u0001\u001a\u00020|8\u0006@\u0006X\u0087.¢\u0006\u0015\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R*\u0010\u008b\u0001\u001a\u00030\u0084\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0006\b\u0089\u0001\u0010\u008a\u0001R*\u0010\u0093\u0001\u001a\u00030\u008c\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R*\u0010\u009b\u0001\u001a\u00030\u0094\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R \u0010 \u0001\u001a\u00020\u00028TX\u0094\u0084\u0002¢\u0006\u0010\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R\u001f\u0010B\u001a\u00020a8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¡\u0001\u0010\u009d\u0001\u001a\u0006\b¢\u0001\u0010£\u0001R!\u0010©\u0001\u001a\u00030¤\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¥\u0001\u0010¦\u0001\u001a\u0006\b§\u0001\u0010¨\u0001R!\u0010®\u0001\u001a\u00030ª\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b«\u0001\u0010\u009d\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\u001c\u0010²\u0001\u001a\u0005\u0018\u00010¯\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001¨\u0006µ\u0001"}, d2 = {"Lru/myspar/specialbanner/impl/presentation/SpecialBannerFragment;", "Lru/myspar/core/base/mvvm/BaseMvvmFragment;", "Lru/myspar/specialbanner/impl/presentation/SpecialBannerViewModel;", "Le40/iobyxmoadg;", "<init>", "()V", "Landroid/os/Bundle;", "outState", "Lgg/wwaezpbzkn;", "onSaveInstanceState", "(Landroid/os/Bundle;)V", "savedInstanceState", "onCreate", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "gxszxtbevo", "()Z", "onDestroyView", "Lru/myspar/specialbanner/impl/presentation/czzsidtyhn;", "state", "Y", "(Lru/myspar/specialbanner/impl/presentation/czzsidtyhn;)V", "Lru/myspar/specialbanner/impl/presentation/uwvvkdfqfp;", "uiLabel", "a0", "(Lru/myspar/specialbanner/impl/presentation/uwvvkdfqfp;)V", "", "S", "()I", "offSetSize", "Lt40/nufgyqmvbu;", "T", "(I)Lt40/nufgyqmvbu;", "decoration", "offsetSize", "Lkotlin/Function5;", "Landroid/graphics/Rect;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/recyclerview/widget/RecyclerView$zynmafqrjb;", "N", "(Lt40/nufgyqmvbu;I)Ltg/kcexrzcfyt;", "rhgxfdycjh", "(I)I", "", "itemId", "Ljava/util/Date;", "selectedDate", "o0", "(Ljava/lang/String;Ljava/util/Date;)V", "G0", "h0", "Lru/myspar/core/domain/interactor/product_change/models/ChangeProductParams;", "params", "message", "l0", "(Lru/myspar/core/domain/interactor/product_change/models/ChangeProductParams;Ljava/lang/String;)V", "Lru/myspar/evropolis/api/model/EvropolisGift;", "gift", "Lru/myspar/core/models/delivery/DeliveryCode;", "deliveryCode", "x0", "(Lru/myspar/evropolis/api/model/EvropolisGift;Lru/myspar/core/models/delivery/DeliveryCode;)V", "Lru/myspar/purchases/api/model/PurchaseListAddProductDialogArgs;", "args", "q0", "(Lru/myspar/purchases/api/model/PurchaseListAddProductDialogArgs;)V", "Lru/myspar/domain/feature/qrcode/store/QrCodeArgs;", "C0", "(Lru/myspar/domain/feature/qrcode/store/QrCodeArgs;)V", "E0", "d0", "y0", "B0", "z0", "(Lru/myspar/core/domain/interactor/product_change/models/ChangeProductParams;)V", "Lk62/ppxfxbqfkf;", "shop", "F0", "(Lk62/ppxfxbqfkf;)V", "Lru/myspar/domain/feature/comboset/buildyourcombo/strore/BuildYourComboDialogArgs;", "dialogArgs", "u0", "(Lru/myspar/domain/feature/comboset/buildyourcombo/strore/BuildYourComboDialogArgs;)V", "s0", "g0", "n0", "Lru/myspar/specialbanner/impl/presentation/uwvvkdfqfp$kcexrzcfyt;", "D0", "(Lru/myspar/specialbanner/impl/presentation/uwvvkdfqfp$kcexrzcfyt;)V", "w0", "Lru/myspar/specialbanner/impl/presentation/iobyxmoadg;", "assistedFactory", "Lq5/dxjokdxxww;", "owner", "Lru/myspar/specialbanner/api/models/SpecialBannerPayload;", "payload", "ru/myspar/specialbanner/impl/presentation/SpecialBannerFragment$lqeggnwhkg", "f0", "(Lru/myspar/specialbanner/impl/presentation/iobyxmoadg;Lq5/dxjokdxxww;Landroid/os/Bundle;Lru/myspar/specialbanner/api/models/SpecialBannerPayload;)Lru/myspar/specialbanner/impl/presentation/SpecialBannerFragment$lqeggnwhkg;", "esjtqupxsv", "Lru/myspar/specialbanner/impl/presentation/iobyxmoadg;", "K", "()Lru/myspar/specialbanner/impl/presentation/iobyxmoadg;", "setAssistedFactory", "(Lru/myspar/specialbanner/impl/presentation/iobyxmoadg;)V", "Ln90/iobyxmoadg;", "lereixgezr", "Ln90/iobyxmoadg;", "R", "()Ln90/iobyxmoadg;", "setEvropolisFeatureApi", "(Ln90/iobyxmoadg;)V", "evropolisFeatureApi", "Llx1/iobyxmoadg;", "pmvmpeiblj", "Llx1/iobyxmoadg;", "V", "()Llx1/iobyxmoadg;", "setPurchasesFeatureApi", "(Llx1/iobyxmoadg;)V", "purchasesFeatureApi", "Lp80/iobyxmoadg;", "zynmafqrjb", "Lp80/iobyxmoadg;", "Q", "()Lp80/iobyxmoadg;", "setDynamicQrFeatureApi", "(Lp80/iobyxmoadg;)V", "dynamicQrFeatureApi", "Lfx1/iobyxmoadg;", "istkbnxepw", "Lfx1/iobyxmoadg;", "U", "()Lfx1/iobyxmoadg;", "setPromoCollectionFeatureApi", "(Lfx1/iobyxmoadg;)V", "promoCollectionFeatureApi", "Lf70/iobyxmoadg;", "cdpycssgdh", "Lf70/iobyxmoadg;", "P", "()Lf70/iobyxmoadg;", "setDialogManager", "(Lf70/iobyxmoadg;)V", "dialogManager", "Lq40/iobyxmoadg;", "yadqdtsiqt", "Lq40/iobyxmoadg;", "W", "()Lq40/iobyxmoadg;", "setSnackbarManager", "(Lq40/iobyxmoadg;)V", "snackbarManager", "iozdgvuglv", "Lgg/gtknphoqwx;", "X", "()Lru/myspar/specialbanner/impl/presentation/SpecialBannerViewModel;", "viewModel", "lmojexxdyd", "J", "()Lru/myspar/specialbanner/api/models/SpecialBannerPayload;", "Lm60/stevsuqkhv;", "wwaezpbzkn", "Lys/ppxfxbqfkf;", "M", "()Lm60/stevsuqkhv;", "binding", "Lf52/iobyxmoadg;", "ylkuphrtab", "L", "()Lf52/iobyxmoadg;", "bannerAdapter", "Landroid/app/Dialog;", "pkzmftpjix", "Landroid/app/Dialog;", "ageCheckedDialog", "hcddaimhww", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SpecialBannerFragment extends Hilt_SpecialBannerFragment<SpecialBannerViewModel> implements e40.iobyxmoadg {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata */
    public f70.iobyxmoadg dialogManager;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    public iobyxmoadg assistedFactory;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata */
    private final gg.gtknphoqwx viewModel;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    public fx1.iobyxmoadg promoCollectionFeatureApi;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    public n90.iobyxmoadg evropolisFeatureApi;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata */
    private final gg.gtknphoqwx args;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name and from kotlin metadata */
    private Dialog ageCheckedDialog;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    public lx1.iobyxmoadg purchasesFeatureApi;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata */
    private final ys.ppxfxbqfkf binding;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata */
    public q40.iobyxmoadg snackbarManager;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name and from kotlin metadata */
    private final gg.gtknphoqwx bannerAdapter;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    public p80.iobyxmoadg dynamicQrFeatureApi;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f103839jpowsppfya = {kotlin.jvm.internal.cllcsxoeiz.lqeggnwhkg(new kotlin.jvm.internal.yadqdtsiqt(SpecialBannerFragment.class, "binding", "getBinding()Lru/myspar/databinding/FragmentSpecialBannerBinding;", 0))};

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    public static final int f103838hkdspvbjdz = 8;

    public static final class btonecajqb extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f103852zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public btonecajqb(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f103852zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.ribwqtqdhb invoke() {
            return (androidx.lifecycle.ribwqtqdhb) this.f103852zdlpuopuiu.invoke();
        }
    }

    public static final class draadjrbmk extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f103853yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f103854zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public draadjrbmk(tg.iobyxmoadg iobyxmoadgVar, gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f103854zdlpuopuiu = iobyxmoadgVar;
            this.f103853yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f103854zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            androidx.lifecycle.ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = androidx.fragment.app.stevsuqkhv.ppxfxbqfkf(this.f103853yggfygwlhe);
            androidx.lifecycle.dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof androidx.lifecycle.dxjokdxxww ? (androidx.lifecycle.dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    public static final class dxjokdxxww extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f103855zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public dxjokdxxww(Fragment fragment) {
            super(0);
            this.f103855zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f103855zdlpuopuiu;
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
        public final Object emit(czzsidtyhn czzsidtyhnVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objB0 = SpecialBannerFragment.b0(SpecialBannerFragment.this, czzsidtyhnVar, gxszxtbevoVar);
            return objB0 == mg.zoijcleaow.gxszxtbevo() ? objB0 : gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // kotlin.jvm.internal.agtfadlqog
        public final gg.dxjokdxxww zoijcleaow() {
            return new kotlin.jvm.internal.iobyxmoadg(2, SpecialBannerFragment.this, SpecialBannerFragment.class, "handleState", "handleState(Lru/myspar/specialbanner/impl/presentation/SpecialBannerView$Model;)V", 4);
        }
    }

    public static final class gtknphoqwx extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f103857zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gtknphoqwx(gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f103857zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.jlmebxxoox invoke() {
            return androidx.fragment.app.stevsuqkhv.ppxfxbqfkf(this.f103857zdlpuopuiu).getViewModelStore();
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
        public final Object emit(uwvvkdfqfp uwvvkdfqfpVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objC0 = SpecialBannerFragment.c0(SpecialBannerFragment.this, uwvvkdfqfpVar, gxszxtbevoVar);
            return objC0 == mg.zoijcleaow.gxszxtbevo() ? objC0 : gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // kotlin.jvm.internal.agtfadlqog
        public final gg.dxjokdxxww zoijcleaow() {
            return new kotlin.jvm.internal.iobyxmoadg(2, SpecialBannerFragment.this, SpecialBannerFragment.class, "handleUiLabel", "handleUiLabel(Lru/myspar/specialbanner/impl/presentation/SpecialBannerView$UiLabel;)V", 4);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.specialbanner.impl.presentation.SpecialBannerFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final SpecialBannerFragment iobyxmoadg(SpecialBannerPayload payload) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(payload, "payload");
            return (SpecialBannerFragment) b40.iobyxmoadg.zoijcleaow(new SpecialBannerFragment(), payload, false, 2, null);
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends androidx.lifecycle.iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f103859eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        final /* synthetic */ SpecialBannerPayload f103860gxszxtbevo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        lqeggnwhkg(q5.dxjokdxxww dxjokdxxwwVar, Bundle bundle, iobyxmoadg iobyxmoadgVar, SpecialBannerPayload specialBannerPayload) {
            super(dxjokdxxwwVar, bundle);
            this.f103859eablkybsjg = iobyxmoadgVar;
            this.f103860gxszxtbevo = specialBannerPayload;
        }

        @Override // androidx.lifecycle.iobyxmoadg
        protected androidx.lifecycle.ntlheqmsrt ppxfxbqfkf(String key, Class modelClass, androidx.lifecycle.pkzmftpjix handle) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(modelClass, "modelClass");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(handle, "handle");
            SpecialBannerViewModel specialBannerViewModelIobyxmoadg = this.f103859eablkybsjg.iobyxmoadg(this.f103860gxszxtbevo, handle);
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(specialBannerViewModelIobyxmoadg, "null cannot be cast to non-null type T of ru.myspar.specialbanner.impl.presentation.SpecialBannerFragment.provideViewModelFactory.<no name provided>.create");
            return specialBannerViewModelIobyxmoadg;
        }
    }

    public static final class nufgyqmvbu implements u52.dxjokdxxww.zoijcleaow {
        nufgyqmvbu() {
        }

        @Override // u52.dxjokdxxww.zoijcleaow
        public void iobyxmoadg() {
            SpecialBannerFragment.this.wwaezpbzkn().I(metgxyhuhe.draadjrbmk.f104097iobyxmoadg);
        }

        @Override // u52.dxjokdxxww.zoijcleaow
        public void ppxfxbqfkf(k62.ppxfxbqfkf shop) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(shop, "shop");
            SpecialBannerFragment.this.wwaezpbzkn().I(new metgxyhuhe.hkdspvbjdz(shop.wkgbmnqykc()));
        }

        @Override // u52.dxjokdxxww.zoijcleaow
        public void zoijcleaow(k62.ppxfxbqfkf shop) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(shop, "shop");
            SpecialBannerFragment.this.wwaezpbzkn().I(new metgxyhuhe.cqumvgiudr(shop.iobyxmoadg()));
        }
    }

    public static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ SpecialBannerFragment f103862iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.gtknphoqwx.zoijcleaow f103863jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ Fragment f103864yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f103865zdlpuopuiu;

        public static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ SpecialBannerFragment f103866jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private /* synthetic */ Object f103867yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f103868zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar, SpecialBannerFragment specialBannerFragment) {
                super(2, gxszxtbevoVar);
                this.f103866jyumaefscl = specialBannerFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar, this.f103866jyumaefscl);
                iobyxmoadgVar.f103867yggfygwlhe = obj;
                return iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f103868zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    sj.wypolnanlu state = this.f103866jyumaefscl.wwaezpbzkn().getState();
                    eablkybsjg eablkybsjgVar = this.f103866jyumaefscl.new eablkybsjg();
                    this.f103868zdlpuopuiu = 1;
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
            this.f103864yggfygwlhe = fragment;
            this.f103863jyumaefscl = zoijcleaowVar;
            this.f103862iwizpuwonk = specialBannerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new ppxfxbqfkf(this.f103864yggfygwlhe, this.f103863jyumaefscl, gxszxtbevoVar, this.f103862iwizpuwonk);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f103865zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                androidx.lifecycle.gtknphoqwx lifecycle = this.f103864yggfygwlhe.getViewLifecycleOwner().getLifecycle();
                androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = this.f103863jyumaefscl;
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(null, this.f103862iwizpuwonk);
                this.f103865zdlpuopuiu = 1;
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
        final /* synthetic */ SpecialBannerFragment f103869iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.gtknphoqwx.zoijcleaow f103870jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ Fragment f103871yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f103872zdlpuopuiu;

        public static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ SpecialBannerFragment f103873jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private /* synthetic */ Object f103874yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f103875zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar, SpecialBannerFragment specialBannerFragment) {
                super(2, gxszxtbevoVar);
                this.f103873jyumaefscl = specialBannerFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar, this.f103873jyumaefscl);
                iobyxmoadgVar.f103874yggfygwlhe = obj;
                return iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f103875zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    sj.lqeggnwhkg lqeggnwhkgVarDraadjrbmk = this.f103873jyumaefscl.wwaezpbzkn().draadjrbmk();
                    gxszxtbevo gxszxtbevoVar = this.f103873jyumaefscl.new gxszxtbevo();
                    this.f103875zdlpuopuiu = 1;
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
            this.f103871yggfygwlhe = fragment;
            this.f103870jyumaefscl = zoijcleaowVar;
            this.f103869iwizpuwonk = specialBannerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new wkgbmnqykc(this.f103871yggfygwlhe, this.f103870jyumaefscl, gxszxtbevoVar, this.f103869iwizpuwonk);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f103872zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                androidx.lifecycle.gtknphoqwx lifecycle = this.f103871yggfygwlhe.getViewLifecycleOwner().getLifecycle();
                androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = this.f103870jyumaefscl;
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(null, this.f103869iwizpuwonk);
                this.f103872zdlpuopuiu = 1;
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
        public static final zoijcleaow f103876zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1, m60.stevsuqkhv.class, "bind", "bind(Landroid/view/View;)Lru/myspar/databinding/FragmentSpecialBannerBinding;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final m60.stevsuqkhv invoke(View p13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
            return m60.stevsuqkhv.iobyxmoadg(p13);
        }
    }

    public SpecialBannerFragment() {
        super(pm.gxszxtbevo.fragment_special_banner);
        tg.iobyxmoadg iobyxmoadgVar = new tg.iobyxmoadg() { // from class: ru.myspar.specialbanner.impl.presentation.ppxfxbqfkf
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return SpecialBannerFragment.J0(this.f104158zdlpuopuiu);
            }
        };
        gg.gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(gg.ojitshcjhn.NONE, new btonecajqb(new dxjokdxxww(this)));
        this.viewModel = androidx.fragment.app.stevsuqkhv.zoijcleaow(this, kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(SpecialBannerViewModel.class), new gtknphoqwx(gtknphoqwxVarIobyxmoadg), new draadjrbmk(null, gtknphoqwxVarIobyxmoadg), iobyxmoadgVar);
        this.args = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: ru.myspar.specialbanner.impl.presentation.wkgbmnqykc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return SpecialBannerFragment.ezmngbhpjk(this.f104261zdlpuopuiu);
            }
        });
        this.binding = ys.iobyxmoadg.zoijcleaow(this, zoijcleaow.f103876zdlpuopuiu);
        this.bannerAdapter = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: ru.myspar.specialbanner.impl.presentation.eablkybsjg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return SpecialBannerFragment.yzdjzghtvl(this.f104067zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn A(SpecialBannerFragment specialBannerFragment, String collectionId, String specialPromoBannerId) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(collectionId, "collectionId");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(specialPromoBannerId, "specialPromoBannerId");
        specialBannerFragment.wwaezpbzkn().I(new metgxyhuhe.stevsuqkhv(collectionId, specialPromoBannerId));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn A0(SpecialBannerFragment specialBannerFragment, ChangeProductParams changeProductParams) {
        specialBannerFragment.wwaezpbzkn().I(new metgxyhuhe.gtknphoqwx(changeProductParams));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn B(SpecialBannerFragment specialBannerFragment, String collectionId, String itemId) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(collectionId, "collectionId");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(itemId, "itemId");
        specialBannerFragment.wwaezpbzkn().I(new metgxyhuhe.kegysxyocb(collectionId, itemId));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void B0() {
        r40.iobyxmoadg.eablkybsjg(W(), pm.dxjokdxxww.product_not_available);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn C(SpecialBannerFragment specialBannerFragment, String collectionId) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(collectionId, "collectionId");
        specialBannerFragment.wwaezpbzkn().I(new metgxyhuhe.tzroggbefp(collectionId));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void C0(QrCodeArgs args) {
        QrCodeDialogFragment qrCodeDialogFragmentIobyxmoadg = QrCodeDialogFragment.INSTANCE.iobyxmoadg(args);
        FragmentManager childFragmentManager = getChildFragmentManager();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(childFragmentManager, "getChildFragmentManager(...)");
        qrCodeDialogFragmentIobyxmoadg.ntlheqmsrt(childFragmentManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn D(SpecialBannerFragment specialBannerFragment, o90.wkgbmnqykc it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        specialBannerFragment.wwaezpbzkn().I(new metgxyhuhe.zdlpuopuiu(it));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void D0(uwvvkdfqfp.kcexrzcfyt dialogArgs) {
        fx1.iobyxmoadg iobyxmoadgVarU = U();
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        f70.zoijcleaow.zoijcleaow(iobyxmoadgVarU.iobyxmoadg(contextRequireContext, dialogArgs.ppxfxbqfkf(), dialogArgs.iobyxmoadg(), dialogArgs.zoijcleaow()), P(), g70.eablkybsjg.iobyxmoadg("SPECIAL_BANNER_SCREEN_KEY"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pj.cllcsxoeiz E(SpecialBannerFragment specialBannerFragment) {
        androidx.lifecycle.vdvldrhtss viewLifecycleOwner = specialBannerFragment.getViewLifecycleOwner();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        return androidx.lifecycle.oxmwwwfdhm.iobyxmoadg(viewLifecycleOwner);
    }

    private final void E0() {
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        new u52.ppxfxbqfkf(contextRequireContext).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn F(SpecialBannerFragment specialBannerFragment, b62.zoijcleaow it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        specialBannerFragment.wwaezpbzkn().I(new metgxyhuhe.btonecajqb(it));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void F0(k62.ppxfxbqfkf shop) {
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        new u52.dxjokdxxww(contextRequireContext, shop, new nufgyqmvbu()).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn G(SpecialBannerFragment specialBannerFragment, e62.zoijcleaow it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        specialBannerFragment.wwaezpbzkn().I(new metgxyhuhe.oxmwwwfdhm(it));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void G0(final String itemId, Date selectedDate) {
        final Calendar calendar = Calendar.getInstance();
        calendar.setTime(selectedDate);
        xa0.yggfygwlhe.iobyxmoadg iobyxmoadgVar = new xa0.yggfygwlhe.iobyxmoadg(calendar.get(11), calendar.get(12));
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        new xa0.yggfygwlhe(contextRequireContext, Boolean.FALSE, null, new tg.rgvfuqvkyq() { // from class: ru.myspar.specialbanner.impl.presentation.cqumvgiudr
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return SpecialBannerFragment.H0(this.f104054zdlpuopuiu, itemId, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
            }
        }, iobyxmoadgVar, getString(pm.dxjokdxxww.receipt_time_dialog_title), getString(pm.dxjokdxxww.set_time_is_future), new tg.rgvfuqvkyq() { // from class: ru.myspar.specialbanner.impl.presentation.ylkuphrtab
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(SpecialBannerFragment.I0(calendar, ((Integer) obj).intValue(), ((Integer) obj2).intValue()));
            }
        }, 4, null).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn H(SpecialBannerFragment specialBannerFragment, t62.iobyxmoadg it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        specialBannerFragment.wwaezpbzkn().I(new metgxyhuhe.wypolnanlu(it));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn H0(SpecialBannerFragment specialBannerFragment, String str, int i13, int i14) {
        specialBannerFragment.wwaezpbzkn().d0(str, i13, i14);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn I(SpecialBannerFragment specialBannerFragment, String blockId) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(blockId, "blockId");
        specialBannerFragment.wwaezpbzkn().I(new metgxyhuhe.cllcsxoeiz(blockId));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean I0(Calendar calendar, int i13, int i14) {
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(13, 1);
        calendar.set(11, i13);
        calendar.set(12, i14);
        calendar.set(13, 0);
        return calendar.before(calendar2);
    }

    private final SpecialBannerPayload J() {
        return (SpecialBannerPayload) this.args.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.lifecycle.crxdokpmqz.ppxfxbqfkf J0(SpecialBannerFragment specialBannerFragment) {
        return specialBannerFragment.f0(specialBannerFragment.K(), specialBannerFragment, specialBannerFragment.getArguments(), specialBannerFragment.J());
    }

    private final f52.iobyxmoadg L() {
        return (f52.iobyxmoadg) this.bannerAdapter.getValue();
    }

    private final m60.stevsuqkhv M() {
        return (m60.stevsuqkhv) this.binding.iobyxmoadg(this, f103839jpowsppfya[0]);
    }

    private final tg.kcexrzcfyt N(final t40.nufgyqmvbu decoration, final int offsetSize) {
        return new tg.kcexrzcfyt() { // from class: ru.myspar.specialbanner.impl.presentation.ikoacuggdj
            @Override // tg.kcexrzcfyt
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return Boolean.valueOf(SpecialBannerFragment.O(this.f104076zdlpuopuiu, offsetSize, decoration, (Rect) obj, (View) obj2, (RecyclerView) obj3, (RecyclerView.zynmafqrjb) obj4, ((Integer) obj5).intValue()));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean O(SpecialBannerFragment specialBannerFragment, int i13, t40.nufgyqmvbu nufgyqmvbuVar, Rect outRect, View view, RecyclerView parent, RecyclerView.zynmafqrjb zynmafqrjbVar, int i14) {
        o00.iobyxmoadg iobyxmoadgVar;
        o00.iobyxmoadg iobyxmoadgVar2;
        int i15;
        List listPpxfxbqfkf;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(outRect, "outRect");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(view, "view");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(parent, "parent");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(zynmafqrjbVar, "<unused var>");
        kotlin.jvm.internal.wkgbmnqykc wkgbmnqykcVar = kotlin.jvm.internal.wkgbmnqykc.f60036iobyxmoadg;
        int iRhgxfdycjh = specialBannerFragment.J().dxjokdxxww() ? specialBannerFragment.rhgxfdycjh(s40.eablkybsjg.content_margin_32) - i13 : i13;
        RecyclerView.nufgyqmvbu adapter = parent.getAdapter();
        o00.iobyxmoadg iobyxmoadgVar3 = null;
        df.wkgbmnqykc wkgbmnqykcVar2 = adapter instanceof df.wkgbmnqykc ? (df.wkgbmnqykc) adapter : null;
        if (wkgbmnqykcVar2 == null || (listPpxfxbqfkf = wkgbmnqykcVar2.ppxfxbqfkf()) == null) {
            iobyxmoadgVar = null;
            iobyxmoadgVar2 = null;
        } else {
            Object objLrnfpwlwnk = hg.jyumaefscl.lrnfpwlwnk(listPpxfxbqfkf, i14 - 1);
            iobyxmoadgVar2 = objLrnfpwlwnk instanceof o00.iobyxmoadg ? (o00.iobyxmoadg) objLrnfpwlwnk : null;
            Object objLrnfpwlwnk2 = hg.jyumaefscl.lrnfpwlwnk(listPpxfxbqfkf, i14);
            o00.iobyxmoadg iobyxmoadgVar4 = objLrnfpwlwnk2 instanceof o00.iobyxmoadg ? (o00.iobyxmoadg) objLrnfpwlwnk2 : null;
            Object objLrnfpwlwnk3 = hg.jyumaefscl.lrnfpwlwnk(listPpxfxbqfkf, i14 + 1);
            iobyxmoadgVar = objLrnfpwlwnk3 instanceof o00.iobyxmoadg ? (o00.iobyxmoadg) objLrnfpwlwnk3 : null;
            iobyxmoadgVar3 = iobyxmoadgVar4;
        }
        if ((iobyxmoadgVar3 instanceof z52.iobyxmoadg) && i14 == 0) {
            if ((iobyxmoadgVar instanceof z52.wflxmlrfwp) || (iobyxmoadgVar instanceof o90.wkgbmnqykc)) {
                return true;
            }
            outRect.top = -nufgyqmvbuVar.ojitshcjhn();
        } else {
            if (iobyxmoadgVar3 instanceof d62.iobyxmoadg) {
                if (iobyxmoadgVar2 instanceof o62.iobyxmoadg) {
                    i15 = -specialBannerFragment.rhgxfdycjh(s40.eablkybsjg.content_margin_8);
                } else {
                    if (iobyxmoadgVar2 instanceof z52.iobyxmoadg) {
                        i13 += specialBannerFragment.rhgxfdycjh(s40.eablkybsjg.content_margin_16);
                    }
                    i15 = -i13;
                }
                outRect.top = i15;
                return true;
            }
            if (((iobyxmoadgVar3 instanceof z52.wflxmlrfwp) || (iobyxmoadgVar3 instanceof o90.wkgbmnqykc)) && (iobyxmoadgVar2 instanceof z52.iobyxmoadg)) {
                outRect.top = -specialBannerFragment.rhgxfdycjh(s40.eablkybsjg.content_margin_60);
                outRect.bottom = i13;
                return true;
            }
            if (iobyxmoadgVar3 instanceof g62.iobyxmoadg) {
                outRect.top = iRhgxfdycjh;
                outRect.bottom = i13;
                return true;
            }
            if (iobyxmoadgVar3 instanceof g62.ppxfxbqfkf) {
                outRect.bottom = specialBannerFragment.rhgxfdycjh(s40.eablkybsjg.content_margin_8);
                return true;
            }
        }
        return false;
    }

    private final int S() {
        return rhgxfdycjh(J().getIs16dpMargin() ? s40.eablkybsjg.content_margin_16 : s40.eablkybsjg.content_margin_24);
    }

    private final t40.nufgyqmvbu T(int offSetSize) {
        t40.nufgyqmvbu nufgyqmvbuVar = new t40.nufgyqmvbu(0, 0, 0, offSetSize, offSetSize, offSetSize, false, false, 199, null);
        nufgyqmvbuVar.vdvldrhtss(N(nufgyqmvbuVar, offSetSize));
        return nufgyqmvbuVar;
    }

    private final void Y(czzsidtyhn state) {
        L().wkgbmnqykc(state.eablkybsjg());
        ColorsUiModel colorsUiModelPpxfxbqfkf = state.ppxfxbqfkf();
        h.oipsdeybqn oipsdeybqnVarDxjokdxxww = null;
        if (colorsUiModelPpxfxbqfkf != null) {
            if (!state.dxjokdxxww()) {
                colorsUiModelPpxfxbqfkf = null;
            }
            if (colorsUiModelPpxfxbqfkf != null) {
                Context contextRequireContext = requireContext();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
                M().getRoot().setBackgroundColor(Integer.valueOf(colorsUiModelPpxfxbqfkf.wypolnanlu(contextRequireContext, ColorsUiModel.iobyxmoadg.PRIMARY)).intValue());
            }
        }
        ComposeView cvActionBar = M().f65984ppxfxbqfkf;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(cvActionBar, "cvActionBar");
        String strLqeggnwhkg = state.lqeggnwhkg();
        tg.iobyxmoadg iobyxmoadgVar = new tg.iobyxmoadg() { // from class: ru.myspar.specialbanner.impl.presentation.lqeggnwhkg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return SpecialBannerFragment.Z(this.f104088zdlpuopuiu);
            }
        };
        ColorsUiModel colorsUiModelPpxfxbqfkf2 = state.ppxfxbqfkf();
        if (colorsUiModelPpxfxbqfkf2 != null) {
            Context contextRequireContext2 = requireContext();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(contextRequireContext2, "requireContext(...)");
            oipsdeybqnVarDxjokdxxww = h.oipsdeybqn.dxjokdxxww(h.bfopjjpdmp.zoijcleaow(colorsUiModelPpxfxbqfkf2.wypolnanlu(contextRequireContext2, ColorsUiModel.iobyxmoadg.PRIMARY)));
        }
        gt.iobyxmoadg.zoijcleaow(cvActionBar, null, strLqeggnwhkg, null, false, iobyxmoadgVar, oipsdeybqnVarDxjokdxxww, null, 77, null);
        ComposeView clLoading = M().f65986zoijcleaow;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(clLoading, "clLoading");
        e50.wkgbmnqykc.nufgyqmvbu(clLoading, state.nufgyqmvbu());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn Z(SpecialBannerFragment specialBannerFragment) {
        specialBannerFragment.wwaezpbzkn().I(metgxyhuhe.lqeggnwhkg.f104123iobyxmoadg);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn a(SpecialBannerFragment specialBannerFragment, ProductUiModel productModel, AnalyticsLocation.ItemFeed analyticLocation) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productModel, "productModel");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticLocation, "analyticLocation");
        specialBannerFragment.wwaezpbzkn().I(new metgxyhuhe.wwaezpbzkn(productModel, analyticLocation));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void a0(uwvvkdfqfp uiLabel) {
        if (uiLabel instanceof uwvvkdfqfp.yggfygwlhe) {
            F0(((uwvvkdfqfp.yggfygwlhe) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof uwvvkdfqfp.eablkybsjg) {
            r40.iobyxmoadg.ppxfxbqfkf(W(), pm.dxjokdxxww.unauthorized_error_message, null, ss.wkgbmnqykc.gxszxtbevo.NonFatal, 2, null);
            return;
        }
        if (uiLabel instanceof uwvvkdfqfp.ojitshcjhn) {
            r40.iobyxmoadg.btonecajqb(W(), ((uwvvkdfqfp.ojitshcjhn) uiLabel).iobyxmoadg(), null, null, 6, null);
            return;
        }
        if (uiLabel instanceof uwvvkdfqfp.vdvldrhtss) {
            B0();
            return;
        }
        if (uiLabel instanceof uwvvkdfqfp.agtfadlqog) {
            z0(((uwvvkdfqfp.agtfadlqog) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof uwvvkdfqfp.iobyxmoadg) {
            d0();
            return;
        }
        if (uiLabel instanceof uwvvkdfqfp.wflxmlrfwp) {
            y0();
            return;
        }
        if (uiLabel instanceof uwvvkdfqfp.zdlpuopuiu) {
            E0();
            return;
        }
        if (uiLabel instanceof uwvvkdfqfp.zoijcleaow) {
            uwvvkdfqfp.zoijcleaow zoijcleaowVar = (uwvvkdfqfp.zoijcleaow) uiLabel;
            G0(zoijcleaowVar.iobyxmoadg(), zoijcleaowVar.zoijcleaow());
            return;
        }
        if (uiLabel instanceof uwvvkdfqfp.dxjokdxxww) {
            u0(((uwvvkdfqfp.dxjokdxxww) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof uwvvkdfqfp.nufgyqmvbu) {
            s0();
            return;
        }
        if (uiLabel instanceof uwvvkdfqfp.oxmwwwfdhm) {
            C0(((uwvvkdfqfp.oxmwwwfdhm) uiLabel).iobyxmoadg());
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(uiLabel, uwvvkdfqfp.wkgbmnqykc.f104196iobyxmoadg)) {
            h0();
            return;
        }
        if (uiLabel instanceof uwvvkdfqfp.gxszxtbevo) {
            uwvvkdfqfp.gxszxtbevo gxszxtbevoVar = (uwvvkdfqfp.gxszxtbevo) uiLabel;
            l0(gxszxtbevoVar.zoijcleaow(), gxszxtbevoVar.iobyxmoadg());
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(uiLabel, uwvvkdfqfp.ppxfxbqfkf.f104190iobyxmoadg)) {
            g0();
            return;
        }
        if (uiLabel instanceof uwvvkdfqfp.draadjrbmk) {
            uwvvkdfqfp.draadjrbmk draadjrbmkVar = (uwvvkdfqfp.draadjrbmk) uiLabel;
            x0(draadjrbmkVar.zoijcleaow(), draadjrbmkVar.iobyxmoadg());
            return;
        }
        if (uiLabel instanceof uwvvkdfqfp.btonecajqb) {
            q0(((uwvvkdfqfp.btonecajqb) uiLabel).iobyxmoadg());
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(uiLabel, uwvvkdfqfp.lqeggnwhkg.f104185iobyxmoadg)) {
            n0();
            return;
        }
        if (uiLabel instanceof uwvvkdfqfp.kcexrzcfyt) {
            D0((uwvvkdfqfp.kcexrzcfyt) uiLabel);
            return;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(uiLabel, uwvvkdfqfp.gtknphoqwx.f104176iobyxmoadg)) {
            w0();
            return;
        }
        if (uiLabel instanceof uwvvkdfqfp.jyumaefscl) {
            r40.iobyxmoadg.eablkybsjg(W(), ((uwvvkdfqfp.jyumaefscl) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof uwvvkdfqfp.iwizpuwonk) {
            r40.iobyxmoadg.btonecajqb(W(), ((uwvvkdfqfp.iwizpuwonk) uiLabel).iobyxmoadg(), null, null, 6, null);
            return;
        }
        if (!(uiLabel instanceof uwvvkdfqfp.rgvfuqvkyq)) {
            throw new NoWhenBranchMatchedException();
        }
        uwvvkdfqfp.rgvfuqvkyq rgvfuqvkyqVar = (uwvvkdfqfp.rgvfuqvkyq) uiLabel;
        HintUiModel hintUiModelZoijcleaow = rgvfuqvkyqVar.zoijcleaow();
        HintDialogAnalyticsInfo hintDialogAnalyticsInfoIobyxmoadg = rgvfuqvkyqVar.iobyxmoadg();
        androidx.fragment.app.oxmwwwfdhm oxmwwwfdhmVarRequireActivity = requireActivity();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(oxmwwwfdhmVarRequireActivity, "requireActivity(...)");
        st.zoijcleaow.iobyxmoadg(hintUiModelZoijcleaow, hintDialogAnalyticsInfoIobyxmoadg, oxmwwwfdhmVarRequireActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn b(SpecialBannerFragment specialBannerFragment, HintUiModel hint, AnalyticElement.ProductItemElement element, AnalyticsLocation.ItemFeed location) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(hint, "hint");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(element, "element");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(location, "location");
        specialBannerFragment.wwaezpbzkn().I(new metgxyhuhe.ylkuphrtab(hint, element, location));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object b0(SpecialBannerFragment specialBannerFragment, czzsidtyhn czzsidtyhnVar, lg.gxszxtbevo gxszxtbevoVar) {
        specialBannerFragment.Y(czzsidtyhnVar);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn c(SpecialBannerFragment specialBannerFragment, o62.iobyxmoadg it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        specialBannerFragment.wwaezpbzkn().I(new metgxyhuhe.pkzmftpjix(it));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object c0(SpecialBannerFragment specialBannerFragment, uwvvkdfqfp uwvvkdfqfpVar, lg.gxszxtbevo gxszxtbevoVar) {
        specialBannerFragment.a0(uwvvkdfqfpVar);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn d(SpecialBannerFragment specialBannerFragment, g62.iobyxmoadg it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        specialBannerFragment.wwaezpbzkn().I(new metgxyhuhe.istkbnxepw(it));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void d0() {
        eablkybsjg.ppxfxbqfkf activityResultRegistry = requireActivity().getActivityResultRegistry();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(activityResultRegistry, "<get-activityResultRegistry>(...)");
        new u40.gxszxtbevo(activityResultRegistry, new tg.draadjrbmk() { // from class: ru.myspar.specialbanner.impl.presentation.vipkmwdibw
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerFragment.e0(this.f104256zdlpuopuiu, (Uri) obj);
            }
        }, null, 4, null).zoijcleaow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn e(SpecialBannerFragment specialBannerFragment, ProductUiModel product, ProductCardEvent productCardEvent, AnalyticsLocation.ItemFeed location) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productCardEvent, "productCardEvent");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(location, "location");
        specialBannerFragment.wwaezpbzkn().I(new metgxyhuhe.lmojexxdyd(product, productCardEvent, location));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn e0(SpecialBannerFragment specialBannerFragment, Uri uri) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(uri, "uri");
        SpecialBannerViewModel specialBannerViewModelWwaezpbzkn = specialBannerFragment.wwaezpbzkn();
        String string = uri.toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        specialBannerViewModelWwaezpbzkn.I(new metgxyhuhe.esjtqupxsv(string));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn eslsurpljm(SpecialBannerFragment specialBannerFragment, k62.ppxfxbqfkf it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        specialBannerFragment.wwaezpbzkn().I(new metgxyhuhe.iozdgvuglv(it));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SpecialBannerPayload ezmngbhpjk(SpecialBannerFragment specialBannerFragment) {
        return (SpecialBannerPayload) qs.ppxfxbqfkf.wkgbmnqykc(specialBannerFragment, kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(SpecialBannerPayload.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn f(SpecialBannerFragment specialBannerFragment, ProductUiModel product) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
        specialBannerFragment.wwaezpbzkn().I(new metgxyhuhe.zoijcleaow(product));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final lqeggnwhkg f0(iobyxmoadg assistedFactory, q5.dxjokdxxww owner, Bundle args, SpecialBannerPayload payload) {
        return new lqeggnwhkg(owner, args, assistedFactory, payload);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn g(SpecialBannerFragment specialBannerFragment, ProductUiModel product, AnalyticsLocation.ItemFeed location) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(location, "location");
        specialBannerFragment.wwaezpbzkn().I(new metgxyhuhe.iwizpuwonk(product, location));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void g0() {
        getParentFragmentManager().Q("special_banner_evropolis_shown_request_key", new Bundle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn h(SpecialBannerFragment specialBannerFragment, String itemId) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(itemId, "itemId");
        specialBannerFragment.wwaezpbzkn().I(new metgxyhuhe.eablkybsjg(itemId));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void h0() {
        Dialog dialog = this.ageCheckedDialog;
        if (dialog == null || !dialog.isShowing()) {
            ee0.zoijcleaow zoijcleaowVar = ee0.zoijcleaow.f31209iobyxmoadg;
            Context contextRequireContext = requireContext();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
            rx.nufgyqmvbu nufgyqmvbuVarIobyxmoadg = zoijcleaowVar.iobyxmoadg(contextRequireContext, new tg.iobyxmoadg() { // from class: ru.myspar.specialbanner.impl.presentation.mbcevpiqjq
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return SpecialBannerFragment.i0(this.f104090zdlpuopuiu);
                }
            }, new tg.iobyxmoadg() { // from class: ru.myspar.specialbanner.impl.presentation.jlmebxxoox
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return SpecialBannerFragment.j0(this.f104081zdlpuopuiu);
                }
            }, new tg.iobyxmoadg() { // from class: ru.myspar.specialbanner.impl.presentation.ribwqtqdhb
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return SpecialBannerFragment.k0(this.f104160zdlpuopuiu);
                }
            }, rx.ppxfxbqfkf.VERTICAL);
            this.ageCheckedDialog = nufgyqmvbuVarIobyxmoadg;
            if (nufgyqmvbuVarIobyxmoadg != null) {
                nufgyqmvbuVarIobyxmoadg.show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn i(SpecialBannerFragment specialBannerFragment, o90.wkgbmnqykc it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        specialBannerFragment.wwaezpbzkn().I(new metgxyhuhe.kcexrzcfyt(it));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn i0(SpecialBannerFragment specialBannerFragment) {
        specialBannerFragment.wwaezpbzkn().I(metgxyhuhe.wkgbmnqykc.f104138iobyxmoadg);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn j(SpecialBannerFragment specialBannerFragment, String itemId) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(itemId, "itemId");
        specialBannerFragment.wwaezpbzkn().I(new metgxyhuhe.vdvldrhtss(itemId));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn j0(SpecialBannerFragment specialBannerFragment) {
        specialBannerFragment.wwaezpbzkn().I(metgxyhuhe.ppxfxbqfkf.f104130iobyxmoadg);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn k(SpecialBannerFragment specialBannerFragment, String itemId, RegistrationFormView.zoijcleaow change) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(itemId, "itemId");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(change, "change");
        specialBannerFragment.wwaezpbzkn().I(new metgxyhuhe.lereixgezr(itemId, change));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn k0(SpecialBannerFragment specialBannerFragment) {
        specialBannerFragment.wwaezpbzkn().I(metgxyhuhe.ppxfxbqfkf.f104130iobyxmoadg);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn krqnebusok(SpecialBannerFragment specialBannerFragment, String itemId, q62.iobyxmoadg question) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(itemId, "itemId");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(question, "question");
        specialBannerFragment.wwaezpbzkn().I(new metgxyhuhe.hcddaimhww(itemId, question));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn l(SpecialBannerFragment specialBannerFragment, f62.iobyxmoadg it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        specialBannerFragment.wwaezpbzkn().I(new metgxyhuhe.pmvmpeiblj(it));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void l0(final ChangeProductParams params, String message) {
        ee0.zoijcleaow zoijcleaowVar = ee0.zoijcleaow.f31209iobyxmoadg;
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        zoijcleaowVar.ppxfxbqfkf(contextRequireContext, message, new tg.iobyxmoadg() { // from class: ru.myspar.specialbanner.impl.presentation.gxszxtbevo
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return SpecialBannerFragment.m0(this.f104071zdlpuopuiu, params);
            }
        }, null).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn m(SpecialBannerFragment specialBannerFragment) {
        specialBannerFragment.wwaezpbzkn().I(metgxyhuhe.zynmafqrjb.f104149iobyxmoadg);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn m0(SpecialBannerFragment specialBannerFragment, ChangeProductParams changeProductParams) {
        specialBannerFragment.wwaezpbzkn().I(new metgxyhuhe.gxszxtbevo(changeProductParams));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn n(SpecialBannerFragment specialBannerFragment, ComboSetProduct product, mo.zoijcleaow analyticsData) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(product, "product");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(analyticsData, "analyticsData");
        specialBannerFragment.wwaezpbzkn().I(new metgxyhuhe.wflxmlrfwp(product, analyticsData));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void n0() {
        f70.zoijcleaow.ppxfxbqfkf(Q().iobyxmoadg(new DynamicQrCodeArgs(false)), P(), g70.eablkybsjg.iobyxmoadg("SPECIAL_BANNER_SCREEN_KEY"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn o(SpecialBannerFragment specialBannerFragment, qu.iobyxmoadg it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        specialBannerFragment.wwaezpbzkn().I(new metgxyhuhe.ojitshcjhn(it));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void o0(final String itemId, Date selectedDate) {
        Calendar calendar = Calendar.getInstance();
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        new xa0.vdvldrhtss(contextRequireContext, Boolean.FALSE, null, new tg.draadjrbmk() { // from class: ru.myspar.specialbanner.impl.presentation.crxdokpmqz
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerFragment.p0(this.f104056zdlpuopuiu, itemId, (Date) obj);
            }
        }, getString(pm.dxjokdxxww.receipt_date_dialog_title), selectedDate, null, calendar.getTime(), 68, null).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn p(SpecialBannerFragment specialBannerFragment, qu.iobyxmoadg comboSet) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(comboSet, "comboSet");
        specialBannerFragment.wwaezpbzkn().I(new metgxyhuhe.agtfadlqog(comboSet.dxjokdxxww().iobyxmoadg(), comboSet.dxjokdxxww().zoijcleaow()));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn p0(SpecialBannerFragment specialBannerFragment, String str, Date it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        specialBannerFragment.wwaezpbzkn().G(str, it);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn q(SpecialBannerFragment specialBannerFragment, p62.ppxfxbqfkf it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        specialBannerFragment.wwaezpbzkn().I(new metgxyhuhe.rgvfuqvkyq(it));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void q0(PurchaseListAddProductDialogArgs args) {
        BaseComposeMviBottomSheetDialogFragment baseComposeMviBottomSheetDialogFragmentNufgyqmvbu = V().nufgyqmvbu(args, new tg.iobyxmoadg() { // from class: ru.myspar.specialbanner.impl.presentation.nufgyqmvbu
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return SpecialBannerFragment.r0(this.f104151zdlpuopuiu);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(childFragmentManager, "getChildFragmentManager(...)");
        baseComposeMviBottomSheetDialogFragmentNufgyqmvbu.ntlheqmsrt(childFragmentManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn r(SpecialBannerFragment specialBannerFragment, String groupId, z52.zoijcleaow banner) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(groupId, "groupId");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(banner, "banner");
        specialBannerFragment.wwaezpbzkn().I(new metgxyhuhe.nufgyqmvbu(groupId, banner));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn r0(SpecialBannerFragment specialBannerFragment) {
        r40.iobyxmoadg.eablkybsjg(specialBannerFragment.W(), pm.dxjokdxxww.purchases_list_product_added_to_the_list);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final int rhgxfdycjh(int i13) {
        return getResources().getDimensionPixelSize(i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn s(SpecialBannerFragment specialBannerFragment, z52.draadjrbmk it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        specialBannerFragment.wwaezpbzkn().I(new metgxyhuhe.cdpycssgdh(it));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void s0() {
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        new ya0.wkgbmnqykc(contextRequireContext, new tg.iobyxmoadg() { // from class: ru.myspar.specialbanner.impl.presentation.jhduphickx
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return SpecialBannerFragment.t0(this.f104080zdlpuopuiu);
            }
        }, null, 4, null).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn t(SpecialBannerFragment specialBannerFragment, o90.wkgbmnqykc it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        specialBannerFragment.wwaezpbzkn().I(new metgxyhuhe.yggfygwlhe(it));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn t0(SpecialBannerFragment specialBannerFragment) {
        specialBannerFragment.wwaezpbzkn().I(metgxyhuhe.yadqdtsiqt.f104142iobyxmoadg);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn u(SpecialBannerFragment specialBannerFragment, String it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        specialBannerFragment.o0(it, specialBannerFragment.wwaezpbzkn().i());
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void u0(BuildYourComboDialogArgs dialogArgs) {
        BuildYourComboDialogFragment buildYourComboDialogFragmentBfopjjpdmp = BuildYourComboDialogFragment.INSTANCE.iobyxmoadg(dialogArgs).bfopjjpdmp(new tg.rgvfuqvkyq() { // from class: ru.myspar.specialbanner.impl.presentation.zoijcleaow
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return SpecialBannerFragment.v0(this.f104280zdlpuopuiu, (ComboSetProduct) obj, (ComboSetProduct) obj2);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(childFragmentManager, "getChildFragmentManager(...)");
        buildYourComboDialogFragmentBfopjjpdmp.ntlheqmsrt(childFragmentManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn v(SpecialBannerFragment specialBannerFragment, String it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        specialBannerFragment.wwaezpbzkn().I(new metgxyhuhe.jpowsppfya(it));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn v0(SpecialBannerFragment specialBannerFragment, ComboSetProduct productFirst, ComboSetProduct productSecond) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productFirst, "productFirst");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(productSecond, "productSecond");
        specialBannerFragment.wwaezpbzkn().I(new metgxyhuhe.agtfadlqog(productFirst, productSecond));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn w(SpecialBannerFragment specialBannerFragment, r62.iobyxmoadg it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        specialBannerFragment.wwaezpbzkn().I(new metgxyhuhe.dsvhmnatus(it));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void w0() {
        fx1.iobyxmoadg iobyxmoadgVarU = U();
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        f70.zoijcleaow.zoijcleaow(iobyxmoadgVarU.zoijcleaow(contextRequireContext), P(), g70.eablkybsjg.iobyxmoadg("SPECIAL_BANNER_SCREEN_KEY"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn x(SpecialBannerFragment specialBannerFragment) {
        specialBannerFragment.wwaezpbzkn().I(metgxyhuhe.jyumaefscl.f104114iobyxmoadg);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void x0(EvropolisGift gift, DeliveryCode deliveryCode) {
        n90.iobyxmoadg iobyxmoadgVarR = R();
        FragmentManager childFragmentManager = getChildFragmentManager();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(childFragmentManager, "getChildFragmentManager(...)");
        iobyxmoadgVarR.zoijcleaow(gift, deliveryCode, childFragmentManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn y(SpecialBannerFragment specialBannerFragment) {
        specialBannerFragment.wwaezpbzkn().I(metgxyhuhe.dxjokdxxww.f104099iobyxmoadg);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void y0() {
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        rx.nufgyqmvbu.iobyxmoadg.wflxmlrfwp(new rx.nufgyqmvbu.iobyxmoadg(contextRequireContext, Boolean.TRUE, null, 4, null).lqeggnwhkg(pm.dxjokdxxww.file_size_exceeded), pm.dxjokdxxww.f76951ok, null, 2, null).zoijcleaow().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f52.iobyxmoadg yzdjzghtvl(final SpecialBannerFragment specialBannerFragment) {
        f52.iobyxmoadg iobyxmoadgVar = new f52.iobyxmoadg(new tg.iobyxmoadg() { // from class: ru.myspar.specialbanner.impl.presentation.wypolnanlu
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return SpecialBannerFragment.E(this.f104263zdlpuopuiu);
            }
        }, new tg.draadjrbmk() { // from class: ru.myspar.specialbanner.impl.presentation.stevsuqkhv
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerFragment.F(this.f104166zdlpuopuiu, (b62.zoijcleaow) obj);
            }
        }, new tg.draadjrbmk() { // from class: ru.myspar.specialbanner.impl.presentation.kegysxyocb
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerFragment.G(this.f104085zdlpuopuiu, (e62.zoijcleaow) obj);
            }
        }, new tg.draadjrbmk() { // from class: ru.myspar.specialbanner.impl.presentation.tzroggbefp
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerFragment.H(this.f104167zdlpuopuiu, (t62.iobyxmoadg) obj);
            }
        }, new tg.draadjrbmk() { // from class: ru.myspar.specialbanner.impl.presentation.ntlheqmsrt
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerFragment.I(this.f104150zdlpuopuiu, (String) obj);
            }
        }, new tg.draadjrbmk() { // from class: ru.myspar.specialbanner.impl.presentation.ulzqkzuiru
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerFragment.eslsurpljm(this.f104168zdlpuopuiu, (k62.ppxfxbqfkf) obj);
            }
        }, new tg.rgvfuqvkyq() { // from class: ru.myspar.specialbanner.impl.presentation.sopmlzcsov
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return SpecialBannerFragment.krqnebusok(this.f104165zdlpuopuiu, (String) obj, (q62.iobyxmoadg) obj2);
            }
        }, new tg.rgvfuqvkyq() { // from class: ru.myspar.specialbanner.impl.presentation.btonecajqb
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return SpecialBannerFragment.a(this.f104050zdlpuopuiu, (ProductUiModel) obj, (AnalyticsLocation.ItemFeed) obj2);
            }
        }, new tg.vdvldrhtss() { // from class: ru.myspar.specialbanner.impl.presentation.gtknphoqwx
            @Override // tg.vdvldrhtss
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return SpecialBannerFragment.b(this.f104069zdlpuopuiu, (HintUiModel) obj, (AnalyticElement.ProductItemElement) obj2, (AnalyticsLocation.ItemFeed) obj3);
            }
        }, new tg.draadjrbmk() { // from class: ru.myspar.specialbanner.impl.presentation.draadjrbmk
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerFragment.c(this.f104064zdlpuopuiu, (o62.iobyxmoadg) obj);
            }
        }, new tg.draadjrbmk() { // from class: ru.myspar.specialbanner.impl.presentation.agtfadlqog
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerFragment.d(this.f104048zdlpuopuiu, (g62.iobyxmoadg) obj);
            }
        }, new tg.vdvldrhtss() { // from class: ru.myspar.specialbanner.impl.presentation.ojitshcjhn
            @Override // tg.vdvldrhtss
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return SpecialBannerFragment.e(this.f104153zdlpuopuiu, (ProductUiModel) obj, (ProductCardEvent) obj2, (AnalyticsLocation.ItemFeed) obj3);
            }
        }, new tg.draadjrbmk() { // from class: ru.myspar.specialbanner.impl.presentation.rgvfuqvkyq
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerFragment.f(this.f104159zdlpuopuiu, (ProductUiModel) obj);
            }
        }, new tg.rgvfuqvkyq() { // from class: ru.myspar.specialbanner.impl.presentation.vdvldrhtss
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return SpecialBannerFragment.g(this.f104201zdlpuopuiu, (ProductUiModel) obj, (AnalyticsLocation.ItemFeed) obj2);
            }
        }, new tg.draadjrbmk() { // from class: ru.myspar.specialbanner.impl.presentation.oxmwwwfdhm
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerFragment.h(this.f104155zdlpuopuiu, (String) obj);
            }
        }, new tg.draadjrbmk() { // from class: ru.myspar.specialbanner.impl.presentation.kcexrzcfyt
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerFragment.j(this.f104084zdlpuopuiu, (String) obj);
            }
        }, new tg.rgvfuqvkyq() { // from class: ru.myspar.specialbanner.impl.presentation.zdlpuopuiu
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return SpecialBannerFragment.k(this.f104277zdlpuopuiu, (String) obj, (RegistrationFormView.zoijcleaow) obj2);
            }
        }, new tg.draadjrbmk() { // from class: ru.myspar.specialbanner.impl.presentation.jyumaefscl
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerFragment.l(this.f104083zdlpuopuiu, (f62.iobyxmoadg) obj);
            }
        }, new tg.iobyxmoadg() { // from class: ru.myspar.specialbanner.impl.presentation.iwizpuwonk
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return SpecialBannerFragment.m(this.f104079zdlpuopuiu);
            }
        }, new tg.rgvfuqvkyq() { // from class: ru.myspar.specialbanner.impl.presentation.esjtqupxsv
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return SpecialBannerFragment.n(this.f104068zdlpuopuiu, (ComboSetProduct) obj, (mo.zoijcleaow) obj2);
            }
        }, new tg.draadjrbmk() { // from class: ru.myspar.specialbanner.impl.presentation.lereixgezr
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerFragment.o(this.f104086zdlpuopuiu, (qu.iobyxmoadg) obj);
            }
        }, new tg.draadjrbmk() { // from class: ru.myspar.specialbanner.impl.presentation.pmvmpeiblj
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerFragment.p(this.f104157zdlpuopuiu, (qu.iobyxmoadg) obj);
            }
        }, new tg.draadjrbmk() { // from class: ru.myspar.specialbanner.impl.presentation.zynmafqrjb
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerFragment.q(this.f104281zdlpuopuiu, (p62.ppxfxbqfkf) obj);
            }
        }, new tg.rgvfuqvkyq() { // from class: ru.myspar.specialbanner.impl.presentation.istkbnxepw
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return SpecialBannerFragment.r(this.f104078zdlpuopuiu, (String) obj, (z52.zoijcleaow) obj2);
            }
        }, new tg.draadjrbmk() { // from class: ru.myspar.specialbanner.impl.presentation.cdpycssgdh
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerFragment.s(this.f104051zdlpuopuiu, (z52.draadjrbmk) obj);
            }
        }, new tg.draadjrbmk() { // from class: ru.myspar.specialbanner.impl.presentation.yadqdtsiqt
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerFragment.u(this.f104272zdlpuopuiu, (String) obj);
            }
        }, new tg.draadjrbmk() { // from class: ru.myspar.specialbanner.impl.presentation.iozdgvuglv
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerFragment.v(this.f104077zdlpuopuiu, (String) obj);
            }
        }, new tg.draadjrbmk() { // from class: ru.myspar.specialbanner.impl.presentation.wwaezpbzkn
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerFragment.w(this.f104262zdlpuopuiu, (r62.iobyxmoadg) obj);
            }
        }, new tg.iobyxmoadg() { // from class: ru.myspar.specialbanner.impl.presentation.pkzmftpjix
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return SpecialBannerFragment.x(this.f104156zdlpuopuiu);
            }
        }, new tg.iobyxmoadg() { // from class: ru.myspar.specialbanner.impl.presentation.hcddaimhww
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return SpecialBannerFragment.y(this.f104072zdlpuopuiu);
            }
        }, new tg.rgvfuqvkyq() { // from class: ru.myspar.specialbanner.impl.presentation.jpowsppfya
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return SpecialBannerFragment.z(this.f104082zdlpuopuiu, (f40.zoijcleaow) obj, (String) obj2);
            }
        }, new tg.rgvfuqvkyq() { // from class: ru.myspar.specialbanner.impl.presentation.hkdspvbjdz
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return SpecialBannerFragment.A(this.f104073zdlpuopuiu, (String) obj, (String) obj2);
            }
        }, new tg.rgvfuqvkyq() { // from class: ru.myspar.specialbanner.impl.presentation.cllcsxoeiz
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return SpecialBannerFragment.B(this.f104052zdlpuopuiu, (String) obj, (String) obj2);
            }
        }, new tg.draadjrbmk() { // from class: ru.myspar.specialbanner.impl.presentation.dsvhmnatus
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerFragment.C(this.f104065zdlpuopuiu, (String) obj);
            }
        }, specialBannerFragment.J().dxjokdxxww(), specialBannerFragment.J().btonecajqb() ? 3 : 2, specialBannerFragment.R().iobyxmoadg(new tg.draadjrbmk() { // from class: ru.myspar.specialbanner.impl.presentation.dxjokdxxww
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerFragment.i(this.f104066zdlpuopuiu, (o90.wkgbmnqykc) obj);
            }
        }, new tg.draadjrbmk() { // from class: ru.myspar.specialbanner.impl.presentation.yggfygwlhe
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerFragment.t(this.f104275zdlpuopuiu, (o90.wkgbmnqykc) obj);
            }
        }, new tg.draadjrbmk() { // from class: ru.myspar.specialbanner.impl.presentation.lmojexxdyd
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecialBannerFragment.D(this.f104087zdlpuopuiu, (o90.wkgbmnqykc) obj);
            }
        }));
        iobyxmoadgVar.setStateRestorationPolicy(RecyclerView.nufgyqmvbu.iobyxmoadg.PREVENT_WHEN_EMPTY);
        return iobyxmoadgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn z(SpecialBannerFragment specialBannerFragment, f40.zoijcleaow navLink, String str) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(navLink, "navLink");
        specialBannerFragment.wwaezpbzkn().I(new metgxyhuhe.iobyxmoadg(navLink, str));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void z0(final ChangeProductParams params) {
        BaseDialogFragment baseDialogFragmentLmojexxdyd = IqosAgreementsDialogFragment.INSTANCE.iobyxmoadg().lmojexxdyd(new tg.iobyxmoadg() { // from class: ru.myspar.specialbanner.impl.presentation.wflxmlrfwp
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return SpecialBannerFragment.A0(this.f104260zdlpuopuiu, params);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(childFragmentManager, "getChildFragmentManager(...)");
        baseDialogFragmentLmojexxdyd.wwaezpbzkn(childFragmentManager);
    }

    public final iobyxmoadg K() {
        iobyxmoadg iobyxmoadgVar = this.assistedFactory;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("assistedFactory");
        return null;
    }

    public final f70.iobyxmoadg P() {
        f70.iobyxmoadg iobyxmoadgVar = this.dialogManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("dialogManager");
        return null;
    }

    public final p80.iobyxmoadg Q() {
        p80.iobyxmoadg iobyxmoadgVar = this.dynamicQrFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("dynamicQrFeatureApi");
        return null;
    }

    public final n90.iobyxmoadg R() {
        n90.iobyxmoadg iobyxmoadgVar = this.evropolisFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("evropolisFeatureApi");
        return null;
    }

    public final fx1.iobyxmoadg U() {
        fx1.iobyxmoadg iobyxmoadgVar = this.promoCollectionFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("promoCollectionFeatureApi");
        return null;
    }

    public final lx1.iobyxmoadg V() {
        lx1.iobyxmoadg iobyxmoadgVar = this.purchasesFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("purchasesFeatureApi");
        return null;
    }

    public final q40.iobyxmoadg W() {
        q40.iobyxmoadg iobyxmoadgVar = this.snackbarManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("snackbarManager");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.core.base.mvvm.BaseMvvmFragment
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public SpecialBannerViewModel wwaezpbzkn() {
        return (SpecialBannerViewModel) this.viewModel.getValue();
    }

    @Override // e40.iobyxmoadg
    public boolean gxszxtbevo() {
        wwaezpbzkn().I(metgxyhuhe.lqeggnwhkg.f104123iobyxmoadg);
        return true;
    }

    @Override // ru.myspar.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SpecialBannerViewModel.RegistrationFormState registrationFormState = savedInstanceState != null ? (SpecialBannerViewModel.RegistrationFormState) savedInstanceState.getParcelable("KEY_FORM_STATE") : null;
        SpecialBannerViewModel.RegistrationFormState registrationFormState2 = registrationFormState != null ? registrationFormState : null;
        if (registrationFormState2 != null) {
            wwaezpbzkn().x0(registrationFormState2);
        }
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

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(outState, "outState");
        SpecialBannerViewModel.RegistrationFormState registrationFormStateG = wwaezpbzkn().g();
        if (registrationFormStateG != null) {
            outState.putParcelable("KEY_FORM_STATE", registrationFormStateG);
        }
        super.onSaveInstanceState(outState);
    }

    @Override // ru.myspar.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = M().f65985wkgbmnqykc;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setItemAnimator(null);
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(recyclerView);
        e60.zoijcleaow.ppxfxbqfkf(recyclerView, L(), M());
        recyclerView.btonecajqb(T(S()));
        androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = androidx.lifecycle.gtknphoqwx.zoijcleaow.STARTED;
        androidx.lifecycle.vdvldrhtss viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        pj.gtknphoqwx.wkgbmnqykc(androidx.lifecycle.oxmwwwfdhm.iobyxmoadg(viewLifecycleOwner), null, null, new ppxfxbqfkf(this, zoijcleaowVar, null, this), 3, null);
        androidx.lifecycle.vdvldrhtss viewLifecycleOwner2 = getViewLifecycleOwner();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        pj.gtknphoqwx.wkgbmnqykc(androidx.lifecycle.oxmwwwfdhm.iobyxmoadg(viewLifecycleOwner2), null, null, new wkgbmnqykc(this, zoijcleaowVar, null, this), 3, null);
    }
}
