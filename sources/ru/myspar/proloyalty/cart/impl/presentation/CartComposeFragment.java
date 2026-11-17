package ru.myspar.proloyalty.cart.impl.presentation;

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
import gg.gtknphoqwx;
import gg.ojitshcjhn;
import gg.wwaezpbzkn;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.cart.impl.presentation.CartComposeFragment;
import ru.myspar.proloyalty.common.view.bottomsheet.additional_info.AdditionalInfoComposeFragment;
import ru.myspar.proloyalty.common.view.bottomsheet.additional_info.AdditionalInfoUiModel;
import ru.myspar.proloyalty.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;
import ru.myspar.proloyalty.contacts.api.model.ContactsScreenPayload;
import ru.myspar.proloyalty.core.base.api.bottomsheet.BaseBottomSheetDialogFragment;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 B2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001CB\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0006J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001b\u0010A\u001a\u00020<8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@¨\u0006D"}, d2 = {"Lru/myspar/proloyalty/cart/impl/presentation/CartComposeFragment;", "Lru/myspar/proloyalty/core/base/mvi/fragment/BaseComposeMviFragment;", "Lho0/lqeggnwhkg;", "Lru/myspar/proloyalty/cart/impl/presentation/zoijcleaow;", "Lru/myspar/proloyalty/cart/impl/presentation/ppxfxbqfkf;", "<init>", "()V", "Lru/myspar/proloyalty/cart/impl/presentation/ppxfxbqfkf$ppxfxbqfkf;", "label", "Lgg/wwaezpbzkn;", "crxdokpmqz", "(Lru/myspar/proloyalty/cart/impl/presentation/ppxfxbqfkf$ppxfxbqfkf;)V", "Lru/myspar/proloyalty/common/view/bottomsheet/additional_info/AdditionalInfoUiModel;", "payload", "jlmebxxoox", "(Lru/myspar/proloyalty/common/view/bottomsheet/additional_info/AdditionalInfoUiModel;)V", "onStart", "onStop", "", "isHidden", "onHiddenChanged", "(Z)V", CommonUrlParts.MODEL, "stevsuqkhv", "(Lho0/lqeggnwhkg;Landroidx/compose/runtime/draadjrbmk;I)V", "uiLabel", "sopmlzcsov", "(Lru/myspar/proloyalty/cart/impl/presentation/ppxfxbqfkf;)V", "Lc51/iobyxmoadg;", "esjtqupxsv", "Lc51/iobyxmoadg;", "getDeliveryFeatureApi", "()Lc51/iobyxmoadg;", "setDeliveryFeatureApi", "(Lc51/iobyxmoadg;)V", "deliveryFeatureApi", "Lew0/iobyxmoadg;", "lereixgezr", "Lew0/iobyxmoadg;", "mbcevpiqjq", "()Lew0/iobyxmoadg;", "setContactsFeatureApi", "(Lew0/iobyxmoadg;)V", "contactsFeatureApi", "Lu51/iobyxmoadg;", "pmvmpeiblj", "Lu51/iobyxmoadg;", "ntlheqmsrt", "()Lu51/iobyxmoadg;", "setDialogManager", "(Lu51/iobyxmoadg;)V", "dialogManager", "Lz21/iobyxmoadg;", "zynmafqrjb", "Lz21/iobyxmoadg;", "ulzqkzuiru", "()Lz21/iobyxmoadg;", "setSnackbarManager", "(Lz21/iobyxmoadg;)V", "snackbarManager", "Lru/myspar/proloyalty/cart/impl/presentation/iobyxmoadg;", "istkbnxepw", "Lgg/gtknphoqwx;", "tzroggbefp", "()Lru/myspar/proloyalty/cart/impl/presentation/iobyxmoadg;", "binder", "cdpycssgdh", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CartComposeFragment extends Hilt_CartComposeFragment<ho0.lqeggnwhkg, ru.myspar.proloyalty.cart.impl.presentation.zoijcleaow, ru.myspar.proloyalty.cart.impl.presentation.ppxfxbqfkf> {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    public static final int f92913yadqdtsiqt = 8;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    public c51.iobyxmoadg deliveryFeatureApi;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx binder;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    public ew0.iobyxmoadg contactsFeatureApi;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    public u51.iobyxmoadg dialogManager;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    public z21.iobyxmoadg snackbarManager;

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f92919zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f92919zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f92919zdlpuopuiu).getViewModelStore();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f92920yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f92921zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(tg.iobyxmoadg iobyxmoadgVar, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f92921zdlpuopuiu = iobyxmoadgVar;
            this.f92920yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f92921zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f92920yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.cart.impl.presentation.CartComposeFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final CartComposeFragment iobyxmoadg() {
            return new CartComposeFragment();
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f92922yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f92923zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(Fragment fragment, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f92923zdlpuopuiu = fragment;
            this.f92922yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f92922yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f92923zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f92924zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Fragment fragment) {
            super(0);
            this.f92924zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f92924zdlpuopuiu;
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f92925zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f92925zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f92925zdlpuopuiu.invoke();
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements draadjrbmk {
        zoijcleaow(Object obj) {
            super(1, obj, CartComposeFragment.class, "dispatch", "dispatch(Ljava/lang/Object;)V", 0);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((ru.myspar.proloyalty.cart.impl.presentation.zoijcleaow) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(ru.myspar.proloyalty.cart.impl.presentation.zoijcleaow p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            ((CartComposeFragment) this.receiver).ylkuphrtab(p13);
        }
    }

    public CartComposeFragment() {
        gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new wkgbmnqykc(new ppxfxbqfkf(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(iobyxmoadg.class), new eablkybsjg(gtknphoqwxVarIobyxmoadg), new gxszxtbevo(null, gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(this, gtknphoqwxVarIobyxmoadg));
    }

    private final void crxdokpmqz(ru.myspar.proloyalty.cart.impl.presentation.ppxfxbqfkf.C2177ppxfxbqfkf label) {
        BaseBottomSheetDialogFragment baseBottomSheetDialogFragmentIobyxmoadg = mbcevpiqjq().iobyxmoadg(new ContactsScreenPayload(label.iobyxmoadg(), label.zoijcleaow()));
        FragmentManager childFragmentManager = getChildFragmentManager();
        zdlpuopuiu.dxjokdxxww(childFragmentManager, "getChildFragmentManager(...)");
        baseBottomSheetDialogFragmentIobyxmoadg.ntlheqmsrt(childFragmentManager);
    }

    private final void jlmebxxoox(AdditionalInfoUiModel payload) {
        u51.zoijcleaow.zoijcleaow(AdditionalInfoComposeFragment.INSTANCE.iobyxmoadg(payload, new ru.myspar.proloyalty.common.view.bottomsheet.additional_info.zoijcleaow.iobyxmoadg(8.0f)), ntlheqmsrt(), v51.eablkybsjg.iobyxmoadg("CART_SCREEN_KEY"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn kegysxyocb(CartComposeFragment cartComposeFragment, ho0.lqeggnwhkg lqeggnwhkgVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
        cartComposeFragment.wwaezpbzkn(lqeggnwhkgVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public final ew0.iobyxmoadg mbcevpiqjq() {
        ew0.iobyxmoadg iobyxmoadgVar = this.contactsFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("contactsFeatureApi");
        return null;
    }

    public final u51.iobyxmoadg ntlheqmsrt() {
        u51.iobyxmoadg iobyxmoadgVar = this.dialogManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("dialogManager");
        return null;
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseComposeMviFragment, ru.myspar.proloyalty.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean isHidden) {
        super.onHiddenChanged(isHidden);
        pkzmftpjix().crxdokpmqz(isHidden);
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseComposeMviFragment, ru.myspar.proloyalty.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        pkzmftpjix().jlmebxxoox(true);
    }

    @Override // ru.myspar.proloyalty.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onStop() {
        pkzmftpjix().jlmebxxoox(false);
        super.onStop();
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseComposeMviFragment
    /* JADX INFO: renamed from: sopmlzcsov, reason: merged with bridge method [inline-methods] */
    public void hcddaimhww(ru.myspar.proloyalty.cart.impl.presentation.ppxfxbqfkf uiLabel) {
        zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
        if (uiLabel instanceof ru.myspar.proloyalty.cart.impl.presentation.ppxfxbqfkf.eablkybsjg) {
            lmojexxdyd(((ru.myspar.proloyalty.cart.impl.presentation.ppxfxbqfkf.eablkybsjg) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.cart.impl.presentation.ppxfxbqfkf.iobyxmoadg) {
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.cart.impl.presentation.ppxfxbqfkf.gxszxtbevo) {
            a31.iobyxmoadg.btonecajqb(ulzqkzuiru(), ((ru.myspar.proloyalty.cart.impl.presentation.ppxfxbqfkf.gxszxtbevo) uiLabel).iobyxmoadg(), null, null, 6, null);
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.cart.impl.presentation.ppxfxbqfkf.zoijcleaow) {
            ru.myspar.proloyalty.cart.impl.presentation.ppxfxbqfkf.zoijcleaow zoijcleaowVar = (ru.myspar.proloyalty.cart.impl.presentation.ppxfxbqfkf.zoijcleaow) uiLabel;
            HintUiModel hintUiModelZoijcleaow = zoijcleaowVar.zoijcleaow();
            HintDialogAnalyticsInfo hintDialogAnalyticsInfoIobyxmoadg = zoijcleaowVar.iobyxmoadg();
            oxmwwwfdhm oxmwwwfdhmVarRequireActivity = requireActivity();
            zdlpuopuiu.dxjokdxxww(oxmwwwfdhmVarRequireActivity, "requireActivity(...)");
            ms0.zoijcleaow.iobyxmoadg(hintUiModelZoijcleaow, hintDialogAnalyticsInfoIobyxmoadg, oxmwwwfdhmVarRequireActivity);
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.cart.impl.presentation.ppxfxbqfkf.C2177ppxfxbqfkf) {
            crxdokpmqz((ru.myspar.proloyalty.cart.impl.presentation.ppxfxbqfkf.C2177ppxfxbqfkf) uiLabel);
        } else {
            if (!(uiLabel instanceof ru.myspar.proloyalty.cart.impl.presentation.ppxfxbqfkf.wkgbmnqykc)) {
                throw new NoWhenBranchMatchedException();
            }
            jlmebxxoox(((ru.myspar.proloyalty.cart.impl.presentation.ppxfxbqfkf.wkgbmnqykc) uiLabel).iobyxmoadg());
        }
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseComposeMviFragment
    /* JADX INFO: renamed from: stevsuqkhv, reason: merged with bridge method [inline-methods] */
    public void wwaezpbzkn(final ho0.lqeggnwhkg model, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        zdlpuopuiu.btonecajqb(model, "model");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(662754707);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.ulzqkzuiru(model) ? 4 : 2) | i13;
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
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(662754707, i14, -1, "ru.myspar.proloyalty.cart.impl.presentation.CartComposeFragment.Render (CartComposeFragment.kt:58)");
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(83485044);
            boolean zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(this);
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zLmojexxdyd || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new zoijcleaow(this);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            io0.lqeggnwhkg.lqeggnwhkg(model, (draadjrbmk) ((ah.lqeggnwhkg) objYadqdtsiqt), null, draadjrbmkVarBtonecajqb, i14 & 14, 4);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: ho0.wkgbmnqykc
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return CartComposeFragment.kegysxyocb(this.f40839zdlpuopuiu, model, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseComposeMviFragment
    /* JADX INFO: renamed from: tzroggbefp, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg pkzmftpjix() {
        return (iobyxmoadg) this.binder.getValue();
    }

    public final z21.iobyxmoadg ulzqkzuiru() {
        z21.iobyxmoadg iobyxmoadgVar = this.snackbarManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("snackbarManager");
        return null;
    }
}
