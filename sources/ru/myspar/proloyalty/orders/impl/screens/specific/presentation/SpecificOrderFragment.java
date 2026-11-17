package ru.myspar.proloyalty.orders.impl.screens.specific.presentation;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.oxmwwwfdhm;
import androidx.fragment.app.stevsuqkhv;
import androidx.fragment.app.ylkuphrtab;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.ribwqtqdhb;
import fg1.vdvldrhtss;
import gg.gtknphoqwx;
import gg.kcexrzcfyt;
import gg.ojitshcjhn;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.istkbnxepw;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.yadqdtsiqt;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.EcomSdk;
import modern.payments.ecomAndroid.api.EcomSdkMerchantOptionsConfig;
import ru.myspar.proloyalty.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment;
import ru.myspar.proloyalty.domain.feature.review.store.InAppReviewDialogArgs;
import ru.myspar.proloyalty.legacy.presentation.screen.choosepickupplace.ChoosePickupPlaceDialog;
import ru.myspar.proloyalty.legacy.presentation.screen.review.InAppReviewDialogFragment;
import ru.myspar.proloyalty.orders.api.model.SpecificOrderArgs;
import ru.myspar.proloyalty.orders.impl.screens.specific.presentation.SpecificOrderFragment;
import ru.myspar.proloyalty.sbp_recurring.api.model.SbpSelectBankAppDialogArgs;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 _2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001`B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\fJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0006J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0006J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0013J\u001d\u0010\u001b\u001a\u00020\n2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J!\u0010)\u001a\u00020\n2\u0006\u0010&\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b+\u0010,R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001b\u0010:\u001a\u0002058TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010J\u001a\u00020C8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001b\u0010P\u001a\u00020K8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u001b\u0010V\u001a\u00020Q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u0018\u0010Z\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0018\u0010^\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]¨\u0006a"}, d2 = {"Lru/myspar/proloyalty/orders/impl/screens/specific/presentation/SpecificOrderFragment;", "Lru/myspar/proloyalty/core/base/mvi/fragment/BaseMviFragment;", "Lfg1/vdvldrhtss;", "Lru/myspar/proloyalty/orders/impl/screens/specific/presentation/ppxfxbqfkf;", "Lru/myspar/proloyalty/orders/impl/screens/specific/presentation/wkgbmnqykc;", "<init>", "()V", "", "title", "message", "Lgg/wwaezpbzkn;", "roivzttewh", "(II)V", "auzgnhcxok", "bfopjjpdmp", "zfvoamnweg", "", "phone", "zeieaojujs", "(Ljava/lang/String;)V", "weqkydbzbr", "tbqsvytpvh", "orderNumber", "okpsazkaxt", "", "Lru/myspar/proloyalty/sbp_recurring/api/model/BankModel;", "sbpBanks", "dvvnrvtcbc", "(Ljava/util/List;)V", "Lru/myspar/proloyalty/orders/impl/screens/specific/presentation/wkgbmnqykc$nufgyqmvbu;", "uiLabel", "iyctptxqzt", "(Lru/myspar/proloyalty/orders/impl/screens/specific/presentation/wkgbmnqykc$nufgyqmvbu;)V", "Lmodern/payments/ecomAndroid/api/EcomSdkMerchantOptionsConfig$EcomSdkResult;", "paymentResult", "jztzpxfvev", "(Lmodern/payments/ecomAndroid/api/EcomSdkMerchantOptionsConfig$EcomSdkResult;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "ydmasvzmpa", "(Lru/myspar/proloyalty/orders/impl/screens/specific/presentation/wkgbmnqykc;)V", "Lac1/ppxfxbqfkf;", "esjtqupxsv", "Lac1/ppxfxbqfkf;", "rlfsiqarku", "()Lac1/ppxfxbqfkf;", "setImageUtils", "(Lac1/ppxfxbqfkf;)V", "imageUtils", "Lru/myspar/proloyalty/orders/impl/screens/specific/presentation/iobyxmoadg;", "lereixgezr", "Lgg/gtknphoqwx;", "xrmfcynszj", "()Lru/myspar/proloyalty/orders/impl/screens/specific/presentation/iobyxmoadg;", "binder", "Lzm1/iobyxmoadg;", "pmvmpeiblj", "Lzm1/iobyxmoadg;", "czzsidtyhn", "()Lzm1/iobyxmoadg;", "setSbpRecurringFeatureApi", "(Lzm1/iobyxmoadg;)V", "sbpRecurringFeatureApi", "Lz21/iobyxmoadg;", "zynmafqrjb", "Lz21/iobyxmoadg;", "uwvvkdfqfp", "()Lz21/iobyxmoadg;", "setSnackbarManager", "(Lz21/iobyxmoadg;)V", "snackbarManager", "Lru/myspar/proloyalty/orders/impl/screens/specific/presentation/eablkybsjg;", "istkbnxepw", "Ltr0/ppxfxbqfkf;", "yfnezrywwk", "()Lru/myspar/proloyalty/orders/impl/screens/specific/presentation/eablkybsjg;", "viewImpl", "Lyf1/iobyxmoadg;", "cdpycssgdh", "Lsr0/ppxfxbqfkf;", "metgxyhuhe", "()Lyf1/iobyxmoadg;", "binding", "Lig1/lqeggnwhkg;", "yadqdtsiqt", "Lig1/lqeggnwhkg;", "notificationDialog", "Lig1/wkgbmnqykc;", "iozdgvuglv", "Lig1/wkgbmnqykc;", "deleteProductDialog", "lmojexxdyd", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SpecificOrderFragment extends Hilt_SpecificOrderFragment<vdvldrhtss, ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf, ru.myspar.proloyalty.orders.impl.screens.specific.presentation.wkgbmnqykc> {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata */
    private final sr0.ppxfxbqfkf binding;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    public ac1.ppxfxbqfkf imageUtils;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata */
    private ig1.wkgbmnqykc deleteProductDialog;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    private final tr0.ppxfxbqfkf viewImpl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx binder;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    public zm1.iobyxmoadg sbpRecurringFeatureApi;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata */
    private ig1.lqeggnwhkg notificationDialog;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    public z21.iobyxmoadg snackbarManager;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f98957wwaezpbzkn = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(SpecificOrderFragment.class, "viewImpl", "getViewImpl()Lru/myspar/proloyalty/orders/impl/screens/specific/presentation/SpecificOrderViewImpl;", 0)), cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(SpecificOrderFragment.class, "binding", "getBinding()Lru/myspar/proloyalty/orders/impl/databinding/FragmentSpecificOrderProloyaltyBinding;", 0))};

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    public static final int f98958ylkuphrtab = 8;

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f98967zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f98967zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f98967zdlpuopuiu.invoke();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f98968zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f98968zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f98968zdlpuopuiu).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.orders.impl.screens.specific.presentation.SpecificOrderFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final SpecificOrderFragment iobyxmoadg(SpecificOrderArgs args) {
            zdlpuopuiu.btonecajqb(args, "args");
            return (SpecificOrderFragment) g21.iobyxmoadg.zoijcleaow(new SpecificOrderFragment(), args, false, 2, null);
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f98969yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f98970zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(tg.iobyxmoadg iobyxmoadgVar, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f98970zdlpuopuiu = iobyxmoadgVar;
            this.f98969yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f98970zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f98969yggfygwlhe);
            androidx.lifecycle.dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof androidx.lifecycle.dxjokdxxww ? (androidx.lifecycle.dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    public static final class nufgyqmvbu extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f98971yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f98972zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public nufgyqmvbu(Fragment fragment, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f98972zdlpuopuiu = fragment;
            this.f98971yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f98971yggfygwlhe);
            androidx.lifecycle.dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof androidx.lifecycle.dxjokdxxww ? (androidx.lifecycle.dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f98972zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* synthetic */ class ppxfxbqfkf extends kotlin.jvm.internal.vdvldrhtss implements draadjrbmk {
        ppxfxbqfkf(Object obj) {
            super(1, obj, SpecificOrderFragment.class, "ecomPaymentCallback", "ecomPaymentCallback(Lmodern/payments/ecomAndroid/api/EcomSdkMerchantOptionsConfig$EcomSdkResult;)V", 0);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((EcomSdkMerchantOptionsConfig.EcomSdkResult) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(EcomSdkMerchantOptionsConfig.EcomSdkResult p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            ((SpecificOrderFragment) this.receiver).jztzpxfvev(p13);
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f98973zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(Fragment fragment) {
            super(0);
            this.f98973zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f98973zdlpuopuiu;
        }
    }

    /* synthetic */ class zoijcleaow extends kotlin.jvm.internal.vdvldrhtss implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f98974zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1, yf1.iobyxmoadg.class, "bind", "bind(Landroid/view/View;)Lru/myspar/proloyalty/orders/impl/databinding/FragmentSpecificOrderProloyaltyBinding;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final yf1.iobyxmoadg invoke(View p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return yf1.iobyxmoadg.iobyxmoadg(p13);
        }
    }

    public SpecificOrderFragment() {
        super(xf1.eablkybsjg.fragment_specific_order_proloyalty);
        gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new eablkybsjg(new wkgbmnqykc(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(iobyxmoadg.class), new gxszxtbevo(gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(null, gtknphoqwxVarIobyxmoadg), new nufgyqmvbu(this, gtknphoqwxVarIobyxmoadg));
        this.viewImpl = tr0.wkgbmnqykc.iobyxmoadg(this, new tg.iobyxmoadg() { // from class: fg1.gtknphoqwx
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return SpecificOrderFragment.igdgnonuha(this.f33750zdlpuopuiu);
            }
        });
        this.binding = sr0.iobyxmoadg.zoijcleaow(this, zoijcleaow.f98974zdlpuopuiu);
    }

    private final void auzgnhcxok(int title, int message) {
        ig1.lqeggnwhkg lqeggnwhkgVar = this.notificationDialog;
        if (lqeggnwhkgVar != null) {
            lqeggnwhkgVar.dismiss();
        }
        Context contextRequireContext = requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        ig1.lqeggnwhkg lqeggnwhkgVar2 = new ig1.lqeggnwhkg(contextRequireContext, new tg.iobyxmoadg() { // from class: fg1.dxjokdxxww
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return SpecificOrderFragment.iwxlajgraz(this.f33748zdlpuopuiu);
            }
        }, title, message);
        this.notificationDialog = lqeggnwhkgVar2;
        lqeggnwhkgVar2.show();
    }

    private final void bfopjjpdmp(int title, int message) {
        ig1.wkgbmnqykc wkgbmnqykcVar = this.deleteProductDialog;
        if (wkgbmnqykcVar != null) {
            wkgbmnqykcVar.dismiss();
        }
        Context contextRequireContext = requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        ig1.wkgbmnqykc wkgbmnqykcVar2 = new ig1.wkgbmnqykc(contextRequireContext, new tg.iobyxmoadg() { // from class: fg1.eablkybsjg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return SpecificOrderFragment.opjhrmiecq(this.f33749zdlpuopuiu);
            }
        }, title, message);
        this.deleteProductDialog = wkgbmnqykcVar2;
        wkgbmnqykcVar2.show();
    }

    private final void dvvnrvtcbc(List sbpBanks) {
        BaseMviBottomSheetDialogFragment baseMviBottomSheetDialogFragmentIobyxmoadg = czzsidtyhn().iobyxmoadg(new SbpSelectBankAppDialogArgs(sbpBanks), new draadjrbmk() { // from class: fg1.draadjrbmk
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecificOrderFragment.skhdrjzrfn((an1.iobyxmoadg) obj);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        zdlpuopuiu.dxjokdxxww(childFragmentManager, "getChildFragmentManager(...)");
        baseMviBottomSheetDialogFragmentIobyxmoadg.ntlheqmsrt(childFragmentManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.proloyalty.orders.impl.screens.specific.presentation.eablkybsjg igdgnonuha(SpecificOrderFragment specificOrderFragment) {
        return new ru.myspar.proloyalty.orders.impl.screens.specific.presentation.eablkybsjg(specificOrderFragment.rlfsiqarku(), new istkbnxepw(specificOrderFragment) { // from class: ru.myspar.proloyalty.orders.impl.screens.specific.presentation.SpecificOrderFragment.dxjokdxxww
            @Override // ah.draadjrbmk
            public Object get() {
                return ((SpecificOrderFragment) this.receiver).metgxyhuhe();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn iwxlajgraz(SpecificOrderFragment specificOrderFragment) {
        specificOrderFragment.pkzmftpjix().jyumaefscl(ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.yggfygwlhe.f99097iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void iyctptxqzt(ru.myspar.proloyalty.orders.impl.screens.specific.presentation.wkgbmnqykc.nufgyqmvbu uiLabel) {
        Context contextRequireContext = requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        EcomSdk.INSTANCE.getInstance().pay(new EcomSdkMerchantOptionsConfig(contextRequireContext, uiLabel.zoijcleaow(), uiLabel.iobyxmoadg(), uiLabel.ppxfxbqfkf(), uiLabel.wkgbmnqykc(), uw0.ppxfxbqfkf.f114521iobyxmoadg.gtknphoqwx(), null, new ppxfxbqfkf(this), 64, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void jztzpxfvev(EcomSdkMerchantOptionsConfig.EcomSdkResult paymentResult) {
        xz0.iobyxmoadg zoijcleaowVar;
        if (paymentResult instanceof EcomSdkMerchantOptionsConfig.EcomSdkResult.Success) {
            zoijcleaowVar = xz0.iobyxmoadg.ppxfxbqfkf.f123478iobyxmoadg;
        } else if (paymentResult instanceof EcomSdkMerchantOptionsConfig.EcomSdkResult.Waiting) {
            zoijcleaowVar = xz0.iobyxmoadg.wkgbmnqykc.f123479iobyxmoadg;
        } else if (paymentResult instanceof EcomSdkMerchantOptionsConfig.EcomSdkResult.Cancel) {
            zoijcleaowVar = xz0.iobyxmoadg.C3118iobyxmoadg.f123477iobyxmoadg;
        } else {
            if (!(paymentResult instanceof EcomSdkMerchantOptionsConfig.EcomSdkResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            EcomSdkMerchantOptionsConfig.EcomSdkResult.Error error = (EcomSdkMerchantOptionsConfig.EcomSdkResult.Error) paymentResult;
            zoijcleaowVar = new xz0.iobyxmoadg.zoijcleaow(error.getHttpCode(), error.getErrorCode(), error.getDescription());
        }
        try {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
            pkzmftpjix().jyumaefscl(new ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.gtknphoqwx(zoijcleaowVar));
            kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
        } catch (Throwable th2) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
            kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lrnfpwlwnk(SpecificOrderFragment specificOrderFragment, String str, DialogInterface dialogInterface, int i13) {
        specificOrderFragment.pkzmftpjix().jyumaefscl(new ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.iobyxmoadg(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final yf1.iobyxmoadg metgxyhuhe() {
        return (yf1.iobyxmoadg) this.binding.iobyxmoadg(this, f98957wwaezpbzkn[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nuxfzjnpeb(SpecificOrderFragment specificOrderFragment, String str, DialogInterface dialogInterface, int i13) {
        specificOrderFragment.pkzmftpjix().jyumaefscl(new ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.iobyxmoadg(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn oipsdeybqn(SpecificOrderFragment specificOrderFragment, boolean z13) {
        specificOrderFragment.pkzmftpjix().jyumaefscl(new ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.zdlpuopuiu(z13));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void okpsazkaxt(String orderNumber) {
        Context contextRequireContext = requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        p41.ppxfxbqfkf.zoijcleaow(contextRequireContext, null, orderNumber, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn opjhrmiecq(SpecificOrderFragment specificOrderFragment) {
        specificOrderFragment.pkzmftpjix().jyumaefscl(ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.dxjokdxxww.f99076iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void roivzttewh(int title, int message) {
        ig1.lqeggnwhkg lqeggnwhkgVar = this.notificationDialog;
        if (lqeggnwhkgVar != null) {
            lqeggnwhkgVar.dismiss();
        }
        Context contextRequireContext = requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        ig1.lqeggnwhkg lqeggnwhkgVar2 = new ig1.lqeggnwhkg(contextRequireContext, new tg.iobyxmoadg() { // from class: fg1.lqeggnwhkg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return SpecificOrderFragment.uawqvzlxes();
            }
        }, title, message);
        this.notificationDialog = lqeggnwhkgVar2;
        lqeggnwhkgVar2.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sflfametgt(SpecificOrderFragment specificOrderFragment, String str, Bundle bundle) {
        zdlpuopuiu.btonecajqb(str, "<unused var>");
        zdlpuopuiu.btonecajqb(bundle, "bundle");
        Object obj = bundle.get("RESULT_KEY");
        zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type ru.myspar.proloyalty.legacy.presentation.screen.choosepickupplace.ChoosePickupPlaceDialog.Result");
        ChoosePickupPlaceDialog.Result result = (ChoosePickupPlaceDialog.Result) obj;
        if (zdlpuopuiu.eablkybsjg(result, ChoosePickupPlaceDialog.Result.Supermarket.f96637zdlpuopuiu)) {
            specificOrderFragment.pkzmftpjix().jyumaefscl(ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.agtfadlqog.f99072iobyxmoadg);
        } else {
            if (!zdlpuopuiu.eablkybsjg(result, ChoosePickupPlaceDialog.Result.Car.f96636zdlpuopuiu)) {
                throw new NoWhenBranchMatchedException();
            }
            specificOrderFragment.pkzmftpjix().jyumaefscl(ru.myspar.proloyalty.orders.impl.screens.specific.presentation.ppxfxbqfkf.eablkybsjg.f99077iobyxmoadg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn skhdrjzrfn(an1.iobyxmoadg result) {
        zdlpuopuiu.btonecajqb(result, "result");
        i21.iobyxmoadg.f41720iobyxmoadg.oxmwwwfdhm().nufgyqmvbu(m21.dxjokdxxww.f64969iobyxmoadg.wflxmlrfwp(result.iobyxmoadg()));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void tbqsvytpvh() {
        ChoosePickupPlaceDialog choosePickupPlaceDialog = new ChoosePickupPlaceDialog();
        FragmentManager childFragmentManager = getChildFragmentManager();
        zdlpuopuiu.dxjokdxxww(childFragmentManager, "getChildFragmentManager(...)");
        choosePickupPlaceDialog.ntlheqmsrt(childFragmentManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn uawqvzlxes() {
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void weqkydbzbr(final String phone) {
        new androidx.appcompat.app.ppxfxbqfkf.iobyxmoadg(requireContext()).setTitle(getString(xf1.lqeggnwhkg.proloyalty_title_in_car_pickup)).wkgbmnqykc(getString(xf1.lqeggnwhkg.proloyalty_pickup_message, phone)).setPositiveButton(xf1.lqeggnwhkg.proloyalty_call_caption, new DialogInterface.OnClickListener() { // from class: fg1.nufgyqmvbu
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i13) {
                SpecificOrderFragment.lrnfpwlwnk(this.f33757zdlpuopuiu, phone, dialogInterface, i13);
            }
        }).setNegativeButton(xf1.lqeggnwhkg.proloyalty_thanks, null).create().show();
    }

    private final void zeieaojujs(final String phone) {
        new androidx.appcompat.app.ppxfxbqfkf.iobyxmoadg(requireContext()).setTitle(getString(xf1.lqeggnwhkg.proloyalty_title_in_market_pickup)).wkgbmnqykc(getString(xf1.lqeggnwhkg.proloyalty_pickup_message, phone)).setPositiveButton(xf1.lqeggnwhkg.proloyalty_call_caption, new DialogInterface.OnClickListener() { // from class: fg1.gxszxtbevo
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i13) {
                SpecificOrderFragment.nuxfzjnpeb(this.f33752zdlpuopuiu, phone, dialogInterface, i13);
            }
        }).setNegativeButton(xf1.lqeggnwhkg.proloyalty_thanks, null).create().show();
    }

    private final void zfvoamnweg() {
        InAppReviewDialogFragment inAppReviewDialogFragmentIyctptxqzt = InAppReviewDialogFragment.INSTANCE.iobyxmoadg(new InAppReviewDialogArgs(null, 1, null)).iyctptxqzt(new draadjrbmk() { // from class: fg1.btonecajqb
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return SpecificOrderFragment.oipsdeybqn(this.f33746zdlpuopuiu, ((Boolean) obj).booleanValue());
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        zdlpuopuiu.dxjokdxxww(childFragmentManager, "getChildFragmentManager(...)");
        inAppReviewDialogFragmentIyctptxqzt.ntlheqmsrt(childFragmentManager);
    }

    public final zm1.iobyxmoadg czzsidtyhn() {
        zm1.iobyxmoadg iobyxmoadgVar = this.sbpRecurringFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("sbpRecurringFeatureApi");
        return null;
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseMviFragment, ru.myspar.proloyalty.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        zdlpuopuiu.btonecajqb(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getChildFragmentManager().R("REQUEST_KEY", getViewLifecycleOwner(), new ylkuphrtab() { // from class: fg1.wflxmlrfwp
            @Override // androidx.fragment.app.ylkuphrtab
            public final void iobyxmoadg(String str, Bundle bundle) {
                SpecificOrderFragment.sflfametgt(this.f33808iobyxmoadg, str, bundle);
            }
        });
    }

    public final ac1.ppxfxbqfkf rlfsiqarku() {
        ac1.ppxfxbqfkf ppxfxbqfkfVar = this.imageUtils;
        if (ppxfxbqfkfVar != null) {
            return ppxfxbqfkfVar;
        }
        zdlpuopuiu.pmvmpeiblj("imageUtils");
        return null;
    }

    public final z21.iobyxmoadg uwvvkdfqfp() {
        z21.iobyxmoadg iobyxmoadgVar = this.snackbarManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("snackbarManager");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: xrmfcynszj, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg pkzmftpjix() {
        return (iobyxmoadg) this.binder.getValue();
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: ydmasvzmpa, reason: merged with bridge method [inline-methods] */
    public void jpowsppfya(ru.myspar.proloyalty.orders.impl.screens.specific.presentation.wkgbmnqykc uiLabel) {
        zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
        if (uiLabel instanceof ru.myspar.proloyalty.orders.impl.screens.specific.presentation.wkgbmnqykc.gtknphoqwx) {
            a31.iobyxmoadg.gxszxtbevo(uwvvkdfqfp(), String.valueOf(((ru.myspar.proloyalty.orders.impl.screens.specific.presentation.wkgbmnqykc.gtknphoqwx) uiLabel).iobyxmoadg()));
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.orders.impl.screens.specific.presentation.wkgbmnqykc.dxjokdxxww) {
            lmojexxdyd(((ru.myspar.proloyalty.orders.impl.screens.specific.presentation.wkgbmnqykc.dxjokdxxww) uiLabel).iobyxmoadg());
            return;
        }
        if (zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.proloyalty.orders.impl.screens.specific.presentation.wkgbmnqykc.btonecajqb.f99101iobyxmoadg)) {
            tbqsvytpvh();
            return;
        }
        if (zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.proloyalty.orders.impl.screens.specific.presentation.wkgbmnqykc.eablkybsjg.f99105iobyxmoadg)) {
            a31.iobyxmoadg.eablkybsjg(uwvvkdfqfp(), xf1.lqeggnwhkg.proloyalty_on_my_way_complete);
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.orders.impl.screens.specific.presentation.wkgbmnqykc.zoijcleaow) {
            weqkydbzbr(((ru.myspar.proloyalty.orders.impl.screens.specific.presentation.wkgbmnqykc.zoijcleaow) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.orders.impl.screens.specific.presentation.wkgbmnqykc.ppxfxbqfkf) {
            zeieaojujs(((ru.myspar.proloyalty.orders.impl.screens.specific.presentation.wkgbmnqykc.ppxfxbqfkf) uiLabel).iobyxmoadg());
            return;
        }
        if (zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.proloyalty.orders.impl.screens.specific.presentation.wkgbmnqykc.gxszxtbevo.f99107iobyxmoadg)) {
            zfvoamnweg();
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.orders.impl.screens.specific.presentation.wkgbmnqykc.agtfadlqog) {
            a31.iobyxmoadg.btonecajqb(uwvvkdfqfp(), ((ru.myspar.proloyalty.orders.impl.screens.specific.presentation.wkgbmnqykc.agtfadlqog) uiLabel).iobyxmoadg(), null, null, 6, null);
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.orders.impl.screens.specific.presentation.wkgbmnqykc.draadjrbmk) {
            ru.myspar.proloyalty.orders.impl.screens.specific.presentation.wkgbmnqykc.draadjrbmk draadjrbmkVar = (ru.myspar.proloyalty.orders.impl.screens.specific.presentation.wkgbmnqykc.draadjrbmk) uiLabel;
            roivzttewh(draadjrbmkVar.zoijcleaow(), draadjrbmkVar.iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.orders.impl.screens.specific.presentation.wkgbmnqykc.lqeggnwhkg) {
            ru.myspar.proloyalty.orders.impl.screens.specific.presentation.wkgbmnqykc.lqeggnwhkg lqeggnwhkgVar = (ru.myspar.proloyalty.orders.impl.screens.specific.presentation.wkgbmnqykc.lqeggnwhkg) uiLabel;
            bfopjjpdmp(lqeggnwhkgVar.zoijcleaow(), lqeggnwhkgVar.iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.orders.impl.screens.specific.presentation.wkgbmnqykc.wflxmlrfwp) {
            ru.myspar.proloyalty.orders.impl.screens.specific.presentation.wkgbmnqykc.wflxmlrfwp wflxmlrfwpVar = (ru.myspar.proloyalty.orders.impl.screens.specific.presentation.wkgbmnqykc.wflxmlrfwp) uiLabel;
            auzgnhcxok(wflxmlrfwpVar.zoijcleaow(), wflxmlrfwpVar.iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.orders.impl.screens.specific.presentation.wkgbmnqykc.iobyxmoadg) {
            okpsazkaxt(((ru.myspar.proloyalty.orders.impl.screens.specific.presentation.wkgbmnqykc.iobyxmoadg) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.orders.impl.screens.specific.presentation.wkgbmnqykc.C2370wkgbmnqykc) {
            ru.myspar.proloyalty.orders.impl.screens.specific.presentation.wkgbmnqykc.C2370wkgbmnqykc c2370wkgbmnqykc = (ru.myspar.proloyalty.orders.impl.screens.specific.presentation.wkgbmnqykc.C2370wkgbmnqykc) uiLabel;
            HintUiModel hintUiModelZoijcleaow = c2370wkgbmnqykc.zoijcleaow();
            HintDialogAnalyticsInfo hintDialogAnalyticsInfoIobyxmoadg = c2370wkgbmnqykc.iobyxmoadg();
            oxmwwwfdhm oxmwwwfdhmVarRequireActivity = requireActivity();
            zdlpuopuiu.dxjokdxxww(oxmwwwfdhmVarRequireActivity, "requireActivity(...)");
            ms0.zoijcleaow.iobyxmoadg(hintUiModelZoijcleaow, hintDialogAnalyticsInfoIobyxmoadg, oxmwwwfdhmVarRequireActivity);
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.orders.impl.screens.specific.presentation.wkgbmnqykc.ojitshcjhn) {
            dvvnrvtcbc(((ru.myspar.proloyalty.orders.impl.screens.specific.presentation.wkgbmnqykc.ojitshcjhn) uiLabel).iobyxmoadg());
        } else {
            if (!(uiLabel instanceof ru.myspar.proloyalty.orders.impl.screens.specific.presentation.wkgbmnqykc.nufgyqmvbu)) {
                throw new NoWhenBranchMatchedException();
            }
            iyctptxqzt((ru.myspar.proloyalty.orders.impl.screens.specific.presentation.wkgbmnqykc.nufgyqmvbu) uiLabel);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: yfnezrywwk, reason: merged with bridge method [inline-methods] */
    public ru.myspar.proloyalty.orders.impl.screens.specific.presentation.eablkybsjg hcddaimhww() {
        return (ru.myspar.proloyalty.orders.impl.screens.specific.presentation.eablkybsjg) this.viewImpl.iobyxmoadg(this, f98957wwaezpbzkn[0]);
    }
}
