package ru.myspar.proloyalty.legacy.presentation.screen.shops;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.stevsuqkhv;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.ribwqtqdhb;
import gg.gtknphoqwx;
import gg.ojitshcjhn;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.istkbnxepw;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.yadqdtsiqt;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.domain.feature.shops.store.ShopsArgs;
import ru.myspar.proloyalty.legacy.presentation.screen.shops.ShopsFragment;
import tg.draadjrbmk;
import z41.wwaezpbzkn;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 @2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001AB\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0006J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0006J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0006J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001b\u0010/\u001a\u00020*8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001b\u00105\u001a\u0002008TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001b\u0010;\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0018\u0010?\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006B"}, d2 = {"Lru/myspar/proloyalty/legacy/presentation/screen/shops/ShopsFragment;", "Lru/myspar/proloyalty/core/base/mvi/fragment/BaseMviFragment;", "Lru/myspar/proloyalty/legacy/presentation/screen/shops/wkgbmnqykc;", "Lru/myspar/proloyalty/legacy/presentation/screen/shops/ppxfxbqfkf;", "Lru/myspar/proloyalty/legacy/presentation/screen/shops/eablkybsjg;", "<init>", "()V", "Ll91/wkgbmnqykc;", "shop", "", "Lq91/zoijcleaow;", "services", "", "isList", "Lgg/wwaezpbzkn;", "vipkmwdibw", "(Ll91/wkgbmnqykc;Ljava/util/List;Z)V", "onStart", "onStop", "onDestroyView", "isHidden", "onHiddenChanged", "(Z)V", "uiLabel", "ribwqtqdhb", "(Lru/myspar/proloyalty/legacy/presentation/screen/shops/eablkybsjg;)V", "Lq11/iobyxmoadg;", "esjtqupxsv", "Lq11/iobyxmoadg;", "sopmlzcsov", "()Lq11/iobyxmoadg;", "setDistanceUtils", "(Lq11/iobyxmoadg;)V", "distanceUtils", "Lz21/iobyxmoadg;", "lereixgezr", "Lz21/iobyxmoadg;", "crxdokpmqz", "()Lz21/iobyxmoadg;", "setSnackbarManager", "(Lz21/iobyxmoadg;)V", "snackbarManager", "Lru/myspar/proloyalty/legacy/presentation/screen/shops/iobyxmoadg;", "pmvmpeiblj", "Lgg/gtknphoqwx;", "ntlheqmsrt", "()Lru/myspar/proloyalty/legacy/presentation/screen/shops/iobyxmoadg;", "binder", "Lru/myspar/proloyalty/legacy/presentation/screen/shops/gxszxtbevo;", "zynmafqrjb", "Ltr0/ppxfxbqfkf;", "jlmebxxoox", "()Lru/myspar/proloyalty/legacy/presentation/screen/shops/gxszxtbevo;", "viewImpl", "Lz41/wwaezpbzkn;", "istkbnxepw", "Lsr0/ppxfxbqfkf;", "ulzqkzuiru", "()Lz41/wwaezpbzkn;", "binding", "Landroid/app/Dialog;", "cdpycssgdh", "Landroid/app/Dialog;", "shopDetailsDialog", "yadqdtsiqt", "iobyxmoadg", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ShopsFragment extends Hilt_ShopsFragment<ru.myspar.proloyalty.legacy.presentation.screen.shops.wkgbmnqykc, ru.myspar.proloyalty.legacy.presentation.screen.shops.ppxfxbqfkf, ru.myspar.proloyalty.legacy.presentation.screen.shops.eablkybsjg> {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata */
    private Dialog shopDetailsDialog;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    public q11.iobyxmoadg distanceUtils;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    private final sr0.ppxfxbqfkf binding;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    public z21.iobyxmoadg snackbarManager;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx binder;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    private final tr0.ppxfxbqfkf viewImpl;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f97364iozdgvuglv = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(ShopsFragment.class, "viewImpl", "getViewImpl()Lru/myspar/proloyalty/legacy/presentation/screen/shops/ShopsViewImpl;", 0)), cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(ShopsFragment.class, "binding", "getBinding()Lru/myspar/proloyalty/databinding/FragmentShopsProloyaltyBinding;", 0))};

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    public static final int f97365lmojexxdyd = 8;

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f97373zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f97373zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f97373zdlpuopuiu.invoke();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f97374zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f97374zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f97374zdlpuopuiu).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.legacy.presentation.screen.shops.ShopsFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final ShopsFragment iobyxmoadg(ShopsArgs args) {
            zdlpuopuiu.btonecajqb(args, "args");
            return (ShopsFragment) g21.iobyxmoadg.zoijcleaow(new ShopsFragment(), args, false, 2, null);
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f97375yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f97376zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(tg.iobyxmoadg iobyxmoadgVar, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f97376zdlpuopuiu = iobyxmoadgVar;
            this.f97375yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f97376zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f97375yggfygwlhe);
            androidx.lifecycle.dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof androidx.lifecycle.dxjokdxxww ? (androidx.lifecycle.dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    public static final class nufgyqmvbu extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f97377yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f97378zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public nufgyqmvbu(Fragment fragment, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f97378zdlpuopuiu = fragment;
            this.f97377yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f97377yggfygwlhe);
            androidx.lifecycle.dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof androidx.lifecycle.dxjokdxxww ? (androidx.lifecycle.dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f97378zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class ppxfxbqfkf implements ob1.lqeggnwhkg.zoijcleaow {
        ppxfxbqfkf() {
        }

        @Override // ob1.lqeggnwhkg.zoijcleaow
        public void iobyxmoadg() {
            ShopsFragment.this.hcddaimhww().ylkuphrtab();
        }

        @Override // ob1.lqeggnwhkg.zoijcleaow
        public void ppxfxbqfkf(l91.wkgbmnqykc shop, boolean z13) {
            zdlpuopuiu.btonecajqb(shop, "shop");
            ShopsFragment.this.hcddaimhww().pkzmftpjix(z13 ? null : ShopsFragment.this.ulzqkzuiru().f128457dxjokdxxww.getMapWindow().getFocusRegion(), shop, z13);
        }

        @Override // ob1.lqeggnwhkg.zoijcleaow
        public void zoijcleaow(l91.wkgbmnqykc shop) {
            zdlpuopuiu.btonecajqb(shop, "shop");
            ShopsFragment.this.hcddaimhww().hcddaimhww(shop.eablkybsjg());
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f97380zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(Fragment fragment) {
            super(0);
            this.f97380zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f97380zdlpuopuiu;
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f97381zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1, wwaezpbzkn.class, "bind", "bind(Landroid/view/View;)Lru/myspar/proloyalty/databinding/FragmentShopsProloyaltyBinding;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final wwaezpbzkn invoke(View p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return wwaezpbzkn.iobyxmoadg(p13);
        }
    }

    public ShopsFragment() {
        super(vk0.eablkybsjg.fragment_shops_proloyalty);
        gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new eablkybsjg(new wkgbmnqykc(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(iobyxmoadg.class), new gxszxtbevo(gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(null, gtknphoqwxVarIobyxmoadg), new nufgyqmvbu(this, gtknphoqwxVarIobyxmoadg));
        this.viewImpl = tr0.wkgbmnqykc.iobyxmoadg(this, new tg.iobyxmoadg() { // from class: mb1.wkgbmnqykc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ShopsFragment.jhduphickx(this.f66772zdlpuopuiu);
            }
        });
        this.binding = sr0.iobyxmoadg.zoijcleaow(this, zoijcleaow.f97381zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.proloyalty.legacy.presentation.screen.shops.gxszxtbevo jhduphickx(ShopsFragment shopsFragment) {
        return new ru.myspar.proloyalty.legacy.presentation.screen.shops.gxszxtbevo(new istkbnxepw(shopsFragment) { // from class: ru.myspar.proloyalty.legacy.presentation.screen.shops.ShopsFragment.dxjokdxxww
            @Override // ah.draadjrbmk
            public Object get() {
                return ((ShopsFragment) this.receiver).ulzqkzuiru();
            }
        }, shopsFragment.sopmlzcsov());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final wwaezpbzkn ulzqkzuiru() {
        return (wwaezpbzkn) this.binding.iobyxmoadg(this, f97364iozdgvuglv[1]);
    }

    private final void vipkmwdibw(l91.wkgbmnqykc shop, List services, boolean isList) {
        Context contextRequireContext = requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        ob1.lqeggnwhkg lqeggnwhkgVar = new ob1.lqeggnwhkg(contextRequireContext, shop, services, isList, new ppxfxbqfkf());
        this.shopDetailsDialog = lqeggnwhkgVar;
        lqeggnwhkgVar.show();
    }

    public final z21.iobyxmoadg crxdokpmqz() {
        z21.iobyxmoadg iobyxmoadgVar = this.snackbarManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("snackbarManager");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: jlmebxxoox, reason: merged with bridge method [inline-methods] */
    public ru.myspar.proloyalty.legacy.presentation.screen.shops.gxszxtbevo hcddaimhww() {
        return (ru.myspar.proloyalty.legacy.presentation.screen.shops.gxszxtbevo) this.viewImpl.iobyxmoadg(this, f97364iozdgvuglv[0]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: ntlheqmsrt, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg pkzmftpjix() {
        return (iobyxmoadg) this.binder.getValue();
    }

    @Override // ru.myspar.proloyalty.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Dialog dialog = this.shopDetailsDialog;
        if (dialog != null) {
            dialog.dismiss();
        }
        super.onDestroyView();
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseMviFragment, ru.myspar.proloyalty.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean isHidden) {
        super.onHiddenChanged(isHidden);
        pkzmftpjix().crxdokpmqz(isHidden);
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseMviFragment, ru.myspar.proloyalty.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        hcddaimhww().jpowsppfya(ulzqkzuiru());
        pkzmftpjix().jlmebxxoox(true);
    }

    @Override // ru.myspar.proloyalty.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onStop() {
        pkzmftpjix().jlmebxxoox(false);
        hcddaimhww().hkdspvbjdz(ulzqkzuiru());
        super.onStop();
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: ribwqtqdhb, reason: merged with bridge method [inline-methods] */
    public void jpowsppfya(ru.myspar.proloyalty.legacy.presentation.screen.shops.eablkybsjg uiLabel) {
        zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
        if (uiLabel instanceof ru.myspar.proloyalty.legacy.presentation.screen.shops.eablkybsjg.C2300eablkybsjg) {
            a31.iobyxmoadg.gxszxtbevo(crxdokpmqz(), String.valueOf(((ru.myspar.proloyalty.legacy.presentation.screen.shops.eablkybsjg.C2300eablkybsjg) uiLabel).iobyxmoadg()));
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.legacy.presentation.screen.shops.eablkybsjg.wkgbmnqykc) {
            lmojexxdyd(((ru.myspar.proloyalty.legacy.presentation.screen.shops.eablkybsjg.wkgbmnqykc) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.legacy.presentation.screen.shops.eablkybsjg.zoijcleaow) {
            ru.myspar.proloyalty.legacy.presentation.screen.shops.eablkybsjg.zoijcleaow zoijcleaowVar = (ru.myspar.proloyalty.legacy.presentation.screen.shops.eablkybsjg.zoijcleaow) uiLabel;
            hcddaimhww().wwaezpbzkn(ulzqkzuiru(), zoijcleaowVar.zoijcleaow(), zoijcleaowVar.iobyxmoadg(), zoijcleaowVar.ppxfxbqfkf());
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.legacy.presentation.screen.shops.eablkybsjg.ppxfxbqfkf) {
            hcddaimhww().lmojexxdyd(ulzqkzuiru(), ((ru.myspar.proloyalty.legacy.presentation.screen.shops.eablkybsjg.ppxfxbqfkf) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.legacy.presentation.screen.shops.eablkybsjg.iobyxmoadg) {
            hcddaimhww().yggfygwlhe(ulzqkzuiru(), ((ru.myspar.proloyalty.legacy.presentation.screen.shops.eablkybsjg.iobyxmoadg) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.legacy.presentation.screen.shops.eablkybsjg.gxszxtbevo) {
            ru.myspar.proloyalty.legacy.presentation.screen.shops.eablkybsjg.gxszxtbevo gxszxtbevoVar = (ru.myspar.proloyalty.legacy.presentation.screen.shops.eablkybsjg.gxszxtbevo) uiLabel;
            vipkmwdibw(gxszxtbevoVar.zoijcleaow(), gxszxtbevoVar.iobyxmoadg(), gxszxtbevoVar.ppxfxbqfkf());
        } else {
            if (!(uiLabel instanceof ru.myspar.proloyalty.legacy.presentation.screen.shops.eablkybsjg.lqeggnwhkg)) {
                throw new NoWhenBranchMatchedException();
            }
            hcddaimhww().mbcevpiqjq(ulzqkzuiru(), ((ru.myspar.proloyalty.legacy.presentation.screen.shops.eablkybsjg.lqeggnwhkg) uiLabel).iobyxmoadg());
        }
    }

    public final q11.iobyxmoadg sopmlzcsov() {
        q11.iobyxmoadg iobyxmoadgVar = this.distanceUtils;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("distanceUtils");
        return null;
    }
}
