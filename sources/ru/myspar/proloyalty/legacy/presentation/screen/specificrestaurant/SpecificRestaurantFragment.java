package ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurant;

import ah.gtknphoqwx;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.stevsuqkhv;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.dxjokdxxww;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.ribwqtqdhb;
import gg.ojitshcjhn;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.istkbnxepw;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.yadqdtsiqt;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.domain.feature.restaurantdescriptiondialog.store.RestaurantDescriptionDialogArgs;
import ru.myspar.proloyalty.domain.feature.specificrestaurant.store.SpecificRestaurantArgs;
import ru.myspar.proloyalty.domain.feature.specificrestaurantproduct.store.SpecificRestaurantProductArgs;
import ru.myspar.proloyalty.legacy.presentation.screen.restaurantdescriptiondialog.RestaurantDescriptionDialogFragment;
import ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurant.SpecificRestaurantFragment;
import ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurantproduct.SpecificRestaurantProductDialogFragment;
import tg.draadjrbmk;
import z41.jpowsppfya;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 12\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00012B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001b\u0010$\u001a\u00020\u001f8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010*\u001a\u00020%8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001b\u00100\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00063"}, d2 = {"Lru/myspar/proloyalty/legacy/presentation/screen/specificrestaurant/SpecificRestaurantFragment;", "Lru/myspar/proloyalty/core/base/mvi/fragment/BaseMviFragment;", "Ltb1/lqeggnwhkg;", "Lru/myspar/proloyalty/legacy/presentation/screen/specificrestaurant/ppxfxbqfkf;", "Lru/myspar/proloyalty/legacy/presentation/screen/specificrestaurant/wkgbmnqykc;", "<init>", "()V", "", "article", "partnerCode", "Lgg/wwaezpbzkn;", "vipkmwdibw", "(Ljava/lang/String;Ljava/lang/String;)V", "", "deliveryPrice", "deliveryTime", "workingHours", "address", "ribwqtqdhb", "(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "uiLabel", "jlmebxxoox", "(Lru/myspar/proloyalty/legacy/presentation/screen/specificrestaurant/wkgbmnqykc;)V", "Lz21/iobyxmoadg;", "esjtqupxsv", "Lz21/iobyxmoadg;", "sopmlzcsov", "()Lz21/iobyxmoadg;", "setSnackbarManager", "(Lz21/iobyxmoadg;)V", "snackbarManager", "Lru/myspar/proloyalty/legacy/presentation/screen/specificrestaurant/iobyxmoadg;", "lereixgezr", "Lgg/gtknphoqwx;", "ntlheqmsrt", "()Lru/myspar/proloyalty/legacy/presentation/screen/specificrestaurant/iobyxmoadg;", "binder", "Lru/myspar/proloyalty/legacy/presentation/screen/specificrestaurant/eablkybsjg;", "pmvmpeiblj", "Ltr0/ppxfxbqfkf;", "crxdokpmqz", "()Lru/myspar/proloyalty/legacy/presentation/screen/specificrestaurant/eablkybsjg;", "viewImpl", "Lz41/jpowsppfya;", "zynmafqrjb", "Lsr0/ppxfxbqfkf;", "ulzqkzuiru", "()Lz41/jpowsppfya;", "binding", "istkbnxepw", "iobyxmoadg", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SpecificRestaurantFragment extends Hilt_SpecificRestaurantFragment<tb1.lqeggnwhkg, ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurant.ppxfxbqfkf, ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurant.wkgbmnqykc> {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    static final /* synthetic */ gtknphoqwx[] f97470cdpycssgdh = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(SpecificRestaurantFragment.class, "viewImpl", "getViewImpl()Lru/myspar/proloyalty/legacy/presentation/screen/specificrestaurant/SpecificRestaurantViewImpl;", 0)), cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(SpecificRestaurantFragment.class, "binding", "getBinding()Lru/myspar/proloyalty/databinding/FragmentSpecificRestaurantProloyaltyBinding;", 0))};

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    public static final int f97472yadqdtsiqt = 8;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    public z21.iobyxmoadg snackbarManager;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    private final gg.gtknphoqwx binder;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    private final tr0.ppxfxbqfkf viewImpl;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    private final sr0.ppxfxbqfkf binding;

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f97477zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f97477zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f97477zdlpuopuiu).getViewModelStore();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f97478yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f97479zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(tg.iobyxmoadg iobyxmoadgVar, gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f97479zdlpuopuiu = iobyxmoadgVar;
            this.f97478yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f97479zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f97478yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurant.SpecificRestaurantFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final SpecificRestaurantFragment iobyxmoadg(SpecificRestaurantArgs args) {
            zdlpuopuiu.btonecajqb(args, "args");
            return (SpecificRestaurantFragment) g21.iobyxmoadg.zoijcleaow(new SpecificRestaurantFragment(), args, false, 2, null);
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f97480yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f97481zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(Fragment fragment, gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f97481zdlpuopuiu = fragment;
            this.f97480yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f97480yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f97481zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f97482zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Fragment fragment) {
            super(0);
            this.f97482zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f97482zdlpuopuiu;
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f97483zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f97483zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f97483zdlpuopuiu.invoke();
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f97484zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1, jpowsppfya.class, "bind", "bind(Landroid/view/View;)Lru/myspar/proloyalty/databinding/FragmentSpecificRestaurantProloyaltyBinding;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jpowsppfya invoke(View p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return jpowsppfya.iobyxmoadg(p13);
        }
    }

    public SpecificRestaurantFragment() {
        super(vk0.eablkybsjg.fragment_specific_restaurant_proloyalty);
        gg.gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new wkgbmnqykc(new ppxfxbqfkf(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(iobyxmoadg.class), new eablkybsjg(gtknphoqwxVarIobyxmoadg), new gxszxtbevo(null, gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(this, gtknphoqwxVarIobyxmoadg));
        this.viewImpl = tr0.wkgbmnqykc.iobyxmoadg(this, new tg.iobyxmoadg() { // from class: tb1.ppxfxbqfkf
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return SpecificRestaurantFragment.jhduphickx(this.f110221zdlpuopuiu);
            }
        });
        this.binding = sr0.iobyxmoadg.zoijcleaow(this, zoijcleaow.f97484zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurant.eablkybsjg jhduphickx(SpecificRestaurantFragment specificRestaurantFragment) {
        return new ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurant.eablkybsjg(new istkbnxepw(specificRestaurantFragment) { // from class: ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurant.SpecificRestaurantFragment.nufgyqmvbu
            @Override // ah.draadjrbmk
            public Object get() {
                return ((SpecificRestaurantFragment) this.receiver).ulzqkzuiru();
            }
        });
    }

    private final void ribwqtqdhb(double deliveryPrice, String deliveryTime, String workingHours, String address) {
        RestaurantDescriptionDialogFragment restaurantDescriptionDialogFragmentIobyxmoadg = RestaurantDescriptionDialogFragment.INSTANCE.iobyxmoadg(new RestaurantDescriptionDialogArgs(deliveryPrice, deliveryTime, workingHours, address));
        FragmentManager childFragmentManager = getChildFragmentManager();
        zdlpuopuiu.dxjokdxxww(childFragmentManager, "getChildFragmentManager(...)");
        restaurantDescriptionDialogFragmentIobyxmoadg.ntlheqmsrt(childFragmentManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jpowsppfya ulzqkzuiru() {
        return (jpowsppfya) this.binding.iobyxmoadg(this, f97470cdpycssgdh[1]);
    }

    private final void vipkmwdibw(String article, String partnerCode) {
        SpecificRestaurantProductDialogFragment specificRestaurantProductDialogFragmentIobyxmoadg = SpecificRestaurantProductDialogFragment.INSTANCE.iobyxmoadg(new SpecificRestaurantProductArgs(article, partnerCode));
        FragmentManager childFragmentManager = getChildFragmentManager();
        zdlpuopuiu.dxjokdxxww(childFragmentManager, "getChildFragmentManager(...)");
        specificRestaurantProductDialogFragmentIobyxmoadg.ntlheqmsrt(childFragmentManager);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: crxdokpmqz, reason: merged with bridge method [inline-methods] */
    public ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurant.eablkybsjg hcddaimhww() {
        return (ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurant.eablkybsjg) this.viewImpl.iobyxmoadg(this, f97470cdpycssgdh[0]);
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: jlmebxxoox, reason: merged with bridge method [inline-methods] */
    public void jpowsppfya(ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurant.wkgbmnqykc uiLabel) {
        zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
        if (uiLabel instanceof ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurant.wkgbmnqykc.zoijcleaow) {
            lmojexxdyd(((ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurant.wkgbmnqykc.zoijcleaow) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurant.wkgbmnqykc.iobyxmoadg) {
            ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurant.wkgbmnqykc.iobyxmoadg iobyxmoadgVar = (ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurant.wkgbmnqykc.iobyxmoadg) uiLabel;
            ribwqtqdhb(iobyxmoadgVar.zoijcleaow(), iobyxmoadgVar.ppxfxbqfkf(), iobyxmoadgVar.wkgbmnqykc(), iobyxmoadgVar.iobyxmoadg());
        } else if (uiLabel instanceof ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurant.wkgbmnqykc.ppxfxbqfkf) {
            ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurant.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVar = (ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurant.wkgbmnqykc.ppxfxbqfkf) uiLabel;
            vipkmwdibw(ppxfxbqfkfVar.iobyxmoadg(), ppxfxbqfkfVar.zoijcleaow());
        } else {
            if (!zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.proloyalty.legacy.presentation.screen.specificrestaurant.wkgbmnqykc.C2305wkgbmnqykc.f97514iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            a31.iobyxmoadg.eablkybsjg(sopmlzcsov(), vk0.lqeggnwhkg.proloyalty_msg_product_adding_to_cart);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: ntlheqmsrt, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg pkzmftpjix() {
        return (iobyxmoadg) this.binder.getValue();
    }

    public final z21.iobyxmoadg sopmlzcsov() {
        z21.iobyxmoadg iobyxmoadgVar = this.snackbarManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("snackbarManager");
        return null;
    }
}
