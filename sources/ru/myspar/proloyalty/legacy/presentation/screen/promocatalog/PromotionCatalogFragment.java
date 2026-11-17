package ru.myspar.proloyalty.legacy.presentation.screen.promocatalog;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.stevsuqkhv;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.dxjokdxxww;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.ribwqtqdhb;
import gg.gtknphoqwx;
import gg.ojitshcjhn;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.istkbnxepw;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.yadqdtsiqt;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.domain.feature.specificpromotion.store.SpecificPromotionDialogArgs;
import ru.myspar.proloyalty.legacy.presentation.dialogs.specificpromotion.SpecificPromotionDialogFragment;
import ru.myspar.proloyalty.legacy.presentation.screen.promocatalog.PromotionCatalogFragment;
import tg.draadjrbmk;
import z41.esjtqupxsv;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 %2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001&B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001e\u001a\u00020\u00198TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lru/myspar/proloyalty/legacy/presentation/screen/promocatalog/PromotionCatalogFragment;", "Lru/myspar/proloyalty/core/base/mvi/fragment/BaseMviFragment;", "Lpa1/gxszxtbevo;", "Lru/myspar/proloyalty/legacy/presentation/screen/promocatalog/ppxfxbqfkf;", "Lru/myspar/proloyalty/legacy/presentation/screen/promocatalog/wkgbmnqykc;", "<init>", "()V", "", "qrCode", "Lgg/wwaezpbzkn;", "jlmebxxoox", "(Ljava/lang/String;)V", "Lvz0/iobyxmoadg;", "args", "ribwqtqdhb", "(Lvz0/iobyxmoadg;)V", "uiLabel", "crxdokpmqz", "(Lru/myspar/proloyalty/legacy/presentation/screen/promocatalog/wkgbmnqykc;)V", "Lru/myspar/proloyalty/legacy/presentation/screen/promocatalog/iobyxmoadg;", "esjtqupxsv", "Lgg/gtknphoqwx;", "ntlheqmsrt", "()Lru/myspar/proloyalty/legacy/presentation/screen/promocatalog/iobyxmoadg;", "binder", "Lru/myspar/proloyalty/legacy/presentation/screen/promocatalog/eablkybsjg;", "lereixgezr", "Ltr0/ppxfxbqfkf;", "sopmlzcsov", "()Lru/myspar/proloyalty/legacy/presentation/screen/promocatalog/eablkybsjg;", "viewImpl", "Lz41/esjtqupxsv;", "pmvmpeiblj", "Lsr0/ppxfxbqfkf;", "ulzqkzuiru", "()Lz41/esjtqupxsv;", "binding", "zynmafqrjb", "iobyxmoadg", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PromotionCatalogFragment extends Hilt_PromotionCatalogFragment<pa1.gxszxtbevo, ru.myspar.proloyalty.legacy.presentation.screen.promocatalog.ppxfxbqfkf, ru.myspar.proloyalty.legacy.presentation.screen.promocatalog.wkgbmnqykc> {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx binder;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    private final tr0.ppxfxbqfkf viewImpl;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    private final sr0.ppxfxbqfkf binding;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f97065istkbnxepw = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(PromotionCatalogFragment.class, "viewImpl", "getViewImpl()Lru/myspar/proloyalty/legacy/presentation/screen/promocatalog/PromotionCatalogViewImpl;", 0)), cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(PromotionCatalogFragment.class, "binding", "getBinding()Lru/myspar/proloyalty/databinding/FragmentPromotionCatalogProloyaltyBinding;", 0))};

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    public static final int f97064cdpycssgdh = 8;

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f97070zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f97070zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f97070zdlpuopuiu).getViewModelStore();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f97071yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f97072zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(tg.iobyxmoadg iobyxmoadgVar, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f97072zdlpuopuiu = iobyxmoadgVar;
            this.f97071yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f97072zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f97071yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.legacy.presentation.screen.promocatalog.PromotionCatalogFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final PromotionCatalogFragment iobyxmoadg() {
            return new PromotionCatalogFragment();
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f97073yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f97074zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(Fragment fragment, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f97074zdlpuopuiu = fragment;
            this.f97073yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f97073yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f97074zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f97075zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Fragment fragment) {
            super(0);
            this.f97075zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f97075zdlpuopuiu;
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f97076zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f97076zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f97076zdlpuopuiu.invoke();
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f97077zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1, esjtqupxsv.class, "bind", "bind(Landroid/view/View;)Lru/myspar/proloyalty/databinding/FragmentPromotionCatalogProloyaltyBinding;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final esjtqupxsv invoke(View p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return esjtqupxsv.iobyxmoadg(p13);
        }
    }

    public PromotionCatalogFragment() {
        super(vk0.eablkybsjg.fragment_promotion_catalog_proloyalty);
        gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new wkgbmnqykc(new ppxfxbqfkf(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(iobyxmoadg.class), new eablkybsjg(gtknphoqwxVarIobyxmoadg), new gxszxtbevo(null, gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(this, gtknphoqwxVarIobyxmoadg));
        this.viewImpl = tr0.wkgbmnqykc.iobyxmoadg(this, new tg.iobyxmoadg() { // from class: pa1.ppxfxbqfkf
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return PromotionCatalogFragment.vipkmwdibw(this.f76280zdlpuopuiu);
            }
        });
        this.binding = sr0.iobyxmoadg.zoijcleaow(this, zoijcleaow.f97077zdlpuopuiu);
    }

    private final void jlmebxxoox(String qrCode) {
        SpecificPromotionDialogFragment specificPromotionDialogFragmentIobyxmoadg = SpecificPromotionDialogFragment.INSTANCE.iobyxmoadg(new SpecificPromotionDialogArgs(qrCode));
        FragmentManager childFragmentManager = getChildFragmentManager();
        zdlpuopuiu.dxjokdxxww(childFragmentManager, "getChildFragmentManager(...)");
        specificPromotionDialogFragmentIobyxmoadg.ntlheqmsrt(childFragmentManager);
    }

    private final void ribwqtqdhb(vz0.iobyxmoadg args) {
        Context contextRequireContext = requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        new x81.zdlpuopuiu(contextRequireContext, args).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final esjtqupxsv ulzqkzuiru() {
        return (esjtqupxsv) this.binding.iobyxmoadg(this, f97065istkbnxepw[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.proloyalty.legacy.presentation.screen.promocatalog.eablkybsjg vipkmwdibw(PromotionCatalogFragment promotionCatalogFragment) {
        return new ru.myspar.proloyalty.legacy.presentation.screen.promocatalog.eablkybsjg(new istkbnxepw(promotionCatalogFragment) { // from class: ru.myspar.proloyalty.legacy.presentation.screen.promocatalog.PromotionCatalogFragment.nufgyqmvbu
            @Override // ah.draadjrbmk
            public Object get() {
                return ((PromotionCatalogFragment) this.receiver).ulzqkzuiru();
            }
        });
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: crxdokpmqz, reason: merged with bridge method [inline-methods] */
    public void jpowsppfya(ru.myspar.proloyalty.legacy.presentation.screen.promocatalog.wkgbmnqykc uiLabel) {
        zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
        if (uiLabel instanceof ru.myspar.proloyalty.legacy.presentation.screen.promocatalog.wkgbmnqykc.iobyxmoadg) {
            lmojexxdyd(((ru.myspar.proloyalty.legacy.presentation.screen.promocatalog.wkgbmnqykc.iobyxmoadg) uiLabel).iobyxmoadg());
        } else if (uiLabel instanceof ru.myspar.proloyalty.legacy.presentation.screen.promocatalog.wkgbmnqykc.zoijcleaow) {
            ribwqtqdhb(((ru.myspar.proloyalty.legacy.presentation.screen.promocatalog.wkgbmnqykc.zoijcleaow) uiLabel).iobyxmoadg());
        } else {
            if (!(uiLabel instanceof ru.myspar.proloyalty.legacy.presentation.screen.promocatalog.wkgbmnqykc.ppxfxbqfkf)) {
                throw new NoWhenBranchMatchedException();
            }
            jlmebxxoox(((ru.myspar.proloyalty.legacy.presentation.screen.promocatalog.wkgbmnqykc.ppxfxbqfkf) uiLabel).iobyxmoadg());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: ntlheqmsrt, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg pkzmftpjix() {
        return (iobyxmoadg) this.binder.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: sopmlzcsov, reason: merged with bridge method [inline-methods] */
    public ru.myspar.proloyalty.legacy.presentation.screen.promocatalog.eablkybsjg hcddaimhww() {
        return (ru.myspar.proloyalty.legacy.presentation.screen.promocatalog.eablkybsjg) this.viewImpl.iobyxmoadg(this, f97065istkbnxepw[0]);
    }
}
