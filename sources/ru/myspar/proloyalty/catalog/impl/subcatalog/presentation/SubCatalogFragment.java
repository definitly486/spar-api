package ru.myspar.proloyalty.catalog.impl.subcatalog.presentation;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.oxmwwwfdhm;
import androidx.fragment.app.stevsuqkhv;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.ribwqtqdhb;
import gg.ojitshcjhn;
import gg.wwaezpbzkn;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.catalog.api.model.SubCatalogArgs;
import ru.myspar.proloyalty.catalog.impl.subcatalog.presentation.SubCatalogFragment;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 :2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001;B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0006J\u000f\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0006J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001b\u00109\u001a\u0002048TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u0006<"}, d2 = {"Lru/myspar/proloyalty/catalog/impl/subcatalog/presentation/SubCatalogFragment;", "Lru/myspar/proloyalty/core/base/mvi/fragment/BaseComposeMviFragment;", "Lsq0/btonecajqb;", "Lru/myspar/proloyalty/catalog/impl/subcatalog/presentation/btonecajqb;", "Lru/myspar/proloyalty/catalog/impl/subcatalog/presentation/gtknphoqwx;", "<init>", "()V", "Luq0/iobyxmoadg$zoijcleaow;", "item", "Lgg/wwaezpbzkn;", "ribwqtqdhb", "(Luq0/iobyxmoadg$zoijcleaow;)V", CommonUrlParts.MODEL, "tzroggbefp", "(Lsq0/btonecajqb;Landroidx/compose/runtime/draadjrbmk;I)V", "uiLabel", "jlmebxxoox", "(Lru/myspar/proloyalty/catalog/impl/subcatalog/presentation/gtknphoqwx;)V", "onStart", "onStop", "", "isHidden", "onHiddenChanged", "(Z)V", "Lz21/iobyxmoadg;", "esjtqupxsv", "Lz21/iobyxmoadg;", "sopmlzcsov", "()Lz21/iobyxmoadg;", "setSnackbarManager", "(Lz21/iobyxmoadg;)V", "snackbarManager", "Lkt1/iobyxmoadg;", "lereixgezr", "Lkt1/iobyxmoadg;", "crxdokpmqz", "()Lkt1/iobyxmoadg;", "setStoryFeatureApi", "(Lkt1/iobyxmoadg;)V", "storyFeatureApi", "Lu51/iobyxmoadg;", "pmvmpeiblj", "Lu51/iobyxmoadg;", "ulzqkzuiru", "()Lu51/iobyxmoadg;", "setDialogManager", "(Lu51/iobyxmoadg;)V", "dialogManager", "Low0/nufgyqmvbu;", "zynmafqrjb", "Low0/nufgyqmvbu;", "ageCheckedDialog", "Lru/myspar/proloyalty/catalog/impl/subcatalog/presentation/iobyxmoadg;", "istkbnxepw", "Lgg/gtknphoqwx;", "ntlheqmsrt", "()Lru/myspar/proloyalty/catalog/impl/subcatalog/presentation/iobyxmoadg;", "binder", "cdpycssgdh", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SubCatalogFragment extends Hilt_SubCatalogFragment<sq0.btonecajqb, btonecajqb, gtknphoqwx> {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    public static final int f93750yadqdtsiqt = 8;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    public z21.iobyxmoadg snackbarManager;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    private final gg.gtknphoqwx binder;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    public kt1.iobyxmoadg storyFeatureApi;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    public u51.iobyxmoadg dialogManager;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    private ow0.nufgyqmvbu ageCheckedDialog;

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f93756zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f93756zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f93756zdlpuopuiu).getViewModelStore();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f93757yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f93758zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(tg.iobyxmoadg iobyxmoadgVar, gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f93758zdlpuopuiu = iobyxmoadgVar;
            this.f93757yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f93758zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f93757yggfygwlhe);
            androidx.lifecycle.dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof androidx.lifecycle.dxjokdxxww ? (androidx.lifecycle.dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.catalog.impl.subcatalog.presentation.SubCatalogFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final SubCatalogFragment iobyxmoadg(SubCatalogArgs args, boolean z13) {
            zdlpuopuiu.btonecajqb(args, "args");
            return (SubCatalogFragment) g21.iobyxmoadg.iobyxmoadg(new SubCatalogFragment(), args, z13);
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f93759yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f93760zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(Fragment fragment, gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f93760zdlpuopuiu = fragment;
            this.f93759yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f93759yggfygwlhe);
            androidx.lifecycle.dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof androidx.lifecycle.dxjokdxxww ? (androidx.lifecycle.dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f93760zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f93761zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Fragment fragment) {
            super(0);
            this.f93761zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f93761zdlpuopuiu;
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f93762zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f93762zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f93762zdlpuopuiu.invoke();
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements draadjrbmk {
        zoijcleaow(Object obj) {
            super(1, obj, SubCatalogFragment.class, "dispatch", "dispatch(Ljava/lang/Object;)V", 0);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((btonecajqb) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(btonecajqb p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            ((SubCatalogFragment) this.receiver).ylkuphrtab(p13);
        }
    }

    public SubCatalogFragment() {
        gg.gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new wkgbmnqykc(new ppxfxbqfkf(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(iobyxmoadg.class), new eablkybsjg(gtknphoqwxVarIobyxmoadg), new gxszxtbevo(null, gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(this, gtknphoqwxVarIobyxmoadg));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn jhduphickx(SubCatalogFragment subCatalogFragment, uq0.iobyxmoadg.zoijcleaow zoijcleaowVar) {
        subCatalogFragment.pkzmftpjix().jyumaefscl(new btonecajqb.iobyxmoadg(false, zoijcleaowVar));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn mbcevpiqjq(SubCatalogFragment subCatalogFragment, sq0.btonecajqb btonecajqbVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
        subCatalogFragment.wwaezpbzkn(btonecajqbVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void ribwqtqdhb(final uq0.iobyxmoadg.zoijcleaow item) {
        ow0.nufgyqmvbu nufgyqmvbuVar = this.ageCheckedDialog;
        if (nufgyqmvbuVar == null || !nufgyqmvbuVar.isShowing()) {
            ac1.zoijcleaow zoijcleaowVar = ac1.zoijcleaow.f1546iobyxmoadg;
            oxmwwwfdhm oxmwwwfdhmVarRequireActivity = requireActivity();
            zdlpuopuiu.dxjokdxxww(oxmwwwfdhmVarRequireActivity, "requireActivity(...)");
            ow0.nufgyqmvbu nufgyqmvbuVarZoijcleaow = ac1.zoijcleaow.zoijcleaow(zoijcleaowVar, oxmwwwfdhmVarRequireActivity, new tg.iobyxmoadg() { // from class: sq0.eablkybsjg
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return SubCatalogFragment.vipkmwdibw(this.f107928zdlpuopuiu, item);
                }
            }, new tg.iobyxmoadg() { // from class: sq0.gxszxtbevo
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return SubCatalogFragment.jhduphickx(this.f107930zdlpuopuiu, item);
                }
            }, null, null, 24, null);
            this.ageCheckedDialog = nufgyqmvbuVarZoijcleaow;
            if (nufgyqmvbuVarZoijcleaow != null) {
                u51.zoijcleaow.wkgbmnqykc(nufgyqmvbuVarZoijcleaow, ulzqkzuiru(), v51.eablkybsjg.iobyxmoadg("SUB_CATALOG_PAGER_SCREEN_KEY"));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn vipkmwdibw(SubCatalogFragment subCatalogFragment, uq0.iobyxmoadg.zoijcleaow zoijcleaowVar) {
        subCatalogFragment.pkzmftpjix().jyumaefscl(new btonecajqb.iobyxmoadg(true, zoijcleaowVar));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public final kt1.iobyxmoadg crxdokpmqz() {
        kt1.iobyxmoadg iobyxmoadgVar = this.storyFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("storyFeatureApi");
        return null;
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseComposeMviFragment
    /* JADX INFO: renamed from: jlmebxxoox, reason: merged with bridge method [inline-methods] */
    public void hcddaimhww(gtknphoqwx uiLabel) {
        zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
        if (uiLabel instanceof gtknphoqwx.ppxfxbqfkf) {
            a31.iobyxmoadg.gxszxtbevo(sopmlzcsov(), String.valueOf(((gtknphoqwx.ppxfxbqfkf) uiLabel).iobyxmoadg()));
            return;
        }
        if (uiLabel instanceof gtknphoqwx.eablkybsjg) {
            a31.iobyxmoadg.btonecajqb(sopmlzcsov(), ((gtknphoqwx.eablkybsjg) uiLabel).iobyxmoadg(), null, null, 6, null);
            return;
        }
        if (uiLabel instanceof gtknphoqwx.zoijcleaow) {
            lmojexxdyd(((gtknphoqwx.zoijcleaow) uiLabel).iobyxmoadg());
        } else if (uiLabel instanceof gtknphoqwx.wkgbmnqykc) {
            u51.zoijcleaow.ppxfxbqfkf(crxdokpmqz().iobyxmoadg(((gtknphoqwx.wkgbmnqykc) uiLabel).iobyxmoadg()), ulzqkzuiru(), v51.eablkybsjg.iobyxmoadg("SUB_CATALOG_PAGER_SCREEN_KEY"));
        } else {
            if (!(uiLabel instanceof gtknphoqwx.iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            ribwqtqdhb(((gtknphoqwx.iobyxmoadg) uiLabel).iobyxmoadg());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseComposeMviFragment
    /* JADX INFO: renamed from: ntlheqmsrt, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg pkzmftpjix() {
        return (iobyxmoadg) this.binder.getValue();
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

    public final z21.iobyxmoadg sopmlzcsov() {
        z21.iobyxmoadg iobyxmoadgVar = this.snackbarManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("snackbarManager");
        return null;
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseComposeMviFragment
    /* JADX INFO: renamed from: tzroggbefp, reason: merged with bridge method [inline-methods] */
    public void wwaezpbzkn(final sq0.btonecajqb model, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        zdlpuopuiu.btonecajqb(model, "model");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-239221515);
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
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-239221515, i14, -1, "ru.myspar.proloyalty.catalog.impl.subcatalog.presentation.SubCatalogFragment.Render (SubCatalogFragment.kt:41)");
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(444867193);
            boolean zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(this);
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zLmojexxdyd || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new zoijcleaow(this);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            ru.myspar.proloyalty.catalog.impl.subcatalog.presentation.eablkybsjg.zoijcleaow(model, (draadjrbmk) ((ah.lqeggnwhkg) objYadqdtsiqt), draadjrbmkVarBtonecajqb, i14 & 14);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: sq0.wkgbmnqykc
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return SubCatalogFragment.mbcevpiqjq(this.f107933zdlpuopuiu, model, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
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
