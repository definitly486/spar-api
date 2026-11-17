package ru.myspar.catalog.impl.subcatalog.presentation;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.oxmwwwfdhm;
import androidx.fragment.app.stevsuqkhv;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.dxjokdxxww;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.ribwqtqdhb;
import ds.btonecajqb;
import gg.gtknphoqwx;
import gg.ojitshcjhn;
import gg.wwaezpbzkn;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.istkbnxepw;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.yadqdtsiqt;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.mbcevpiqjq;
import ru.myspar.catalog.api.model.SubCatalogArgs;
import ru.myspar.catalog.impl.subcatalog.presentation.SubCatalogFragment;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 H2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001IB\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0006J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u001b\u00106\u001a\u0002018TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001b\u0010;\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00103\u001a\u0004\b9\u0010:R\u001b\u0010A\u001a\u00020<8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001b\u0010G\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F¨\u0006J"}, d2 = {"Lru/myspar/catalog/impl/subcatalog/presentation/SubCatalogFragment;", "Lru/myspar/core/base/mvi/fragment/BaseMviFragment;", "Lds/btonecajqb;", "Lru/myspar/catalog/impl/subcatalog/presentation/zoijcleaow;", "Lru/myspar/catalog/impl/subcatalog/presentation/ppxfxbqfkf;", "<init>", "()V", "Les/draadjrbmk$ppxfxbqfkf;", "item", "Lgg/wwaezpbzkn;", "metgxyhuhe", "(Les/draadjrbmk$ppxfxbqfkf;)V", "uiLabel", "xrmfcynszj", "(Lru/myspar/catalog/impl/subcatalog/presentation/ppxfxbqfkf;)V", "onStart", "onStop", "", "isHidden", "onHiddenChanged", "(Z)V", "Lq40/iobyxmoadg;", "esjtqupxsv", "Lq40/iobyxmoadg;", "ikoacuggdj", "()Lq40/iobyxmoadg;", "setSnackbarManager", "(Lq40/iobyxmoadg;)V", "snackbarManager", "Lr72/iobyxmoadg;", "lereixgezr", "Lr72/iobyxmoadg;", "okpsazkaxt", "()Lr72/iobyxmoadg;", "setStoryFeatureApi", "(Lr72/iobyxmoadg;)V", "storyFeatureApi", "Lf70/iobyxmoadg;", "pmvmpeiblj", "Lf70/iobyxmoadg;", "jhduphickx", "()Lf70/iobyxmoadg;", "setDialogManager", "(Lf70/iobyxmoadg;)V", "dialogManager", "Lrx/nufgyqmvbu;", "zynmafqrjb", "Lrx/nufgyqmvbu;", "ageCheckedDialog", "Lru/myspar/catalog/impl/subcatalog/presentation/iobyxmoadg;", "istkbnxepw", "Lgg/gtknphoqwx;", "ribwqtqdhb", "()Lru/myspar/catalog/impl/subcatalog/presentation/iobyxmoadg;", "binder", "Lru/myspar/catalog/api/model/SubCatalogArgs;", "cdpycssgdh", "jlmebxxoox", "()Lru/myspar/catalog/api/model/SubCatalogArgs;", "args", "Lru/myspar/catalog/impl/subcatalog/presentation/wkgbmnqykc;", "yadqdtsiqt", "Lzs/ppxfxbqfkf;", "jztzpxfvev", "()Lru/myspar/catalog/impl/subcatalog/presentation/wkgbmnqykc;", "viewImpl", "Lm60/mbcevpiqjq;", "iozdgvuglv", "Lys/ppxfxbqfkf;", "vipkmwdibw", "()Lm60/mbcevpiqjq;", "binding", "lmojexxdyd", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SubCatalogFragment extends Hilt_SubCatalogFragment<btonecajqb, ru.myspar.catalog.impl.subcatalog.presentation.zoijcleaow, ru.myspar.catalog.impl.subcatalog.presentation.ppxfxbqfkf> {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx args;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    public q40.iobyxmoadg snackbarManager;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata */
    private final ys.ppxfxbqfkf binding;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx binder;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    public r72.iobyxmoadg storyFeatureApi;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    public f70.iobyxmoadg dialogManager;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata */
    private final zs.ppxfxbqfkf viewImpl;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    private rx.nufgyqmvbu ageCheckedDialog;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f86011wwaezpbzkn = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(SubCatalogFragment.class, "viewImpl", "getViewImpl()Lru/myspar/catalog/impl/subcatalog/presentation/SubCatalogViewImpl;", 0)), cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(SubCatalogFragment.class, "binding", "getBinding()Lru/myspar/databinding/FragmentSubcatalogBinding;", 0))};

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    public static final int f86012ylkuphrtab = 8;

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f86021zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f86021zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f86021zdlpuopuiu).getViewModelStore();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f86022yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f86023zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(tg.iobyxmoadg iobyxmoadgVar, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f86023zdlpuopuiu = iobyxmoadgVar;
            this.f86022yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f86023zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f86022yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.catalog.impl.subcatalog.presentation.SubCatalogFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final SubCatalogFragment iobyxmoadg(SubCatalogArgs args, boolean z13) {
            zdlpuopuiu.btonecajqb(args, "args");
            return (SubCatalogFragment) b40.iobyxmoadg.iobyxmoadg(new SubCatalogFragment(), args, z13);
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f86024yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f86025zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(Fragment fragment, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f86025zdlpuopuiu = fragment;
            this.f86024yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f86024yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f86025zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f86026zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Fragment fragment) {
            super(0);
            this.f86026zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f86026zdlpuopuiu;
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f86027zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f86027zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f86027zdlpuopuiu.invoke();
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f86028zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1, mbcevpiqjq.class, "bind", "bind(Landroid/view/View;)Lru/myspar/databinding/FragmentSubcatalogBinding;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final mbcevpiqjq invoke(View p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return mbcevpiqjq.iobyxmoadg(p13);
        }
    }

    public SubCatalogFragment() {
        super(pm.gxszxtbevo.fragment_subcatalog);
        gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new wkgbmnqykc(new ppxfxbqfkf(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(iobyxmoadg.class), new eablkybsjg(gtknphoqwxVarIobyxmoadg), new gxszxtbevo(null, gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(this, gtknphoqwxVarIobyxmoadg));
        this.args = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: ds.wkgbmnqykc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return SubCatalogFragment.crxdokpmqz(this.f29421zdlpuopuiu);
            }
        });
        this.viewImpl = zs.wkgbmnqykc.iobyxmoadg(this, new tg.iobyxmoadg() { // from class: ds.eablkybsjg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return SubCatalogFragment.uwvvkdfqfp(this.f29412zdlpuopuiu);
            }
        });
        this.binding = ys.iobyxmoadg.zoijcleaow(this, zoijcleaow.f86028zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SubCatalogArgs crxdokpmqz(SubCatalogFragment subCatalogFragment) {
        return (SubCatalogArgs) qs.ppxfxbqfkf.wkgbmnqykc(subCatalogFragment, cllcsxoeiz.zoijcleaow(SubCatalogArgs.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn czzsidtyhn(SubCatalogFragment subCatalogFragment, es.draadjrbmk.ppxfxbqfkf ppxfxbqfkfVar) {
        subCatalogFragment.pkzmftpjix().jyumaefscl(new ru.myspar.catalog.impl.subcatalog.presentation.zoijcleaow.iobyxmoadg(false, ppxfxbqfkfVar));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final SubCatalogArgs jlmebxxoox() {
        return (SubCatalogArgs) this.args.getValue();
    }

    private final void metgxyhuhe(final es.draadjrbmk.ppxfxbqfkf item) {
        rx.nufgyqmvbu nufgyqmvbuVar = this.ageCheckedDialog;
        if (nufgyqmvbuVar == null || !nufgyqmvbuVar.isShowing()) {
            ee0.zoijcleaow zoijcleaowVar = ee0.zoijcleaow.f31209iobyxmoadg;
            oxmwwwfdhm oxmwwwfdhmVarRequireActivity = requireActivity();
            zdlpuopuiu.dxjokdxxww(oxmwwwfdhmVarRequireActivity, "requireActivity(...)");
            rx.nufgyqmvbu nufgyqmvbuVarZoijcleaow = ee0.zoijcleaow.zoijcleaow(zoijcleaowVar, oxmwwwfdhmVarRequireActivity, new tg.iobyxmoadg() { // from class: ds.gxszxtbevo
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return SubCatalogFragment.rlfsiqarku(this.f29415zdlpuopuiu, item);
                }
            }, new tg.iobyxmoadg() { // from class: ds.lqeggnwhkg
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return SubCatalogFragment.czzsidtyhn(this.f29418zdlpuopuiu, item);
                }
            }, null, null, 24, null);
            this.ageCheckedDialog = nufgyqmvbuVarZoijcleaow;
            if (nufgyqmvbuVarZoijcleaow != null) {
                f70.zoijcleaow.zoijcleaow(nufgyqmvbuVarZoijcleaow, jhduphickx(), g70.eablkybsjg.iobyxmoadg("SUB_CATALOG_PAGER_SCREEN_KEY"));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn rlfsiqarku(SubCatalogFragment subCatalogFragment, es.draadjrbmk.ppxfxbqfkf ppxfxbqfkfVar) {
        subCatalogFragment.pkzmftpjix().jyumaefscl(new ru.myspar.catalog.impl.subcatalog.presentation.zoijcleaow.iobyxmoadg(true, ppxfxbqfkfVar));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.catalog.impl.subcatalog.presentation.wkgbmnqykc uwvvkdfqfp(SubCatalogFragment subCatalogFragment) {
        return new ru.myspar.catalog.impl.subcatalog.presentation.wkgbmnqykc(new istkbnxepw(subCatalogFragment) { // from class: ru.myspar.catalog.impl.subcatalog.presentation.SubCatalogFragment.nufgyqmvbu
            @Override // ah.draadjrbmk
            public Object get() {
                return ((SubCatalogFragment) this.receiver).vipkmwdibw();
            }
        }, subCatalogFragment.jlmebxxoox());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final mbcevpiqjq vipkmwdibw() {
        return (mbcevpiqjq) this.binding.iobyxmoadg(this, f86011wwaezpbzkn[1]);
    }

    public final q40.iobyxmoadg ikoacuggdj() {
        q40.iobyxmoadg iobyxmoadgVar = this.snackbarManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("snackbarManager");
        return null;
    }

    public final f70.iobyxmoadg jhduphickx() {
        f70.iobyxmoadg iobyxmoadgVar = this.dialogManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("dialogManager");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: jztzpxfvev, reason: merged with bridge method [inline-methods] */
    public ru.myspar.catalog.impl.subcatalog.presentation.wkgbmnqykc hcddaimhww() {
        return (ru.myspar.catalog.impl.subcatalog.presentation.wkgbmnqykc) this.viewImpl.iobyxmoadg(this, f86011wwaezpbzkn[0]);
    }

    public final r72.iobyxmoadg okpsazkaxt() {
        r72.iobyxmoadg iobyxmoadgVar = this.storyFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("storyFeatureApi");
        return null;
    }

    @Override // ru.myspar.core.base.mvi.fragment.BaseMviFragment, ru.myspar.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean isHidden) {
        super.onHiddenChanged(isHidden);
        pkzmftpjix().jlmebxxoox(isHidden);
    }

    @Override // ru.myspar.core.base.mvi.fragment.BaseMviFragment, ru.myspar.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        pkzmftpjix().ribwqtqdhb(true);
    }

    @Override // ru.myspar.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onStop() {
        pkzmftpjix().ribwqtqdhb(false);
        super.onStop();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: ribwqtqdhb, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg pkzmftpjix() {
        return (iobyxmoadg) this.binder.getValue();
    }

    @Override // ru.myspar.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: xrmfcynszj, reason: merged with bridge method [inline-methods] */
    public void jpowsppfya(ru.myspar.catalog.impl.subcatalog.presentation.ppxfxbqfkf uiLabel) {
        zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
        if (uiLabel instanceof ru.myspar.catalog.impl.subcatalog.presentation.ppxfxbqfkf.C1975ppxfxbqfkf) {
            r40.iobyxmoadg.gxszxtbevo(ikoacuggdj(), String.valueOf(((ru.myspar.catalog.impl.subcatalog.presentation.ppxfxbqfkf.C1975ppxfxbqfkf) uiLabel).iobyxmoadg()));
            return;
        }
        if (uiLabel instanceof ru.myspar.catalog.impl.subcatalog.presentation.ppxfxbqfkf.eablkybsjg) {
            r40.iobyxmoadg.btonecajqb(ikoacuggdj(), ((ru.myspar.catalog.impl.subcatalog.presentation.ppxfxbqfkf.eablkybsjg) uiLabel).iobyxmoadg(), null, null, 6, null);
            return;
        }
        if (uiLabel instanceof ru.myspar.catalog.impl.subcatalog.presentation.ppxfxbqfkf.zoijcleaow) {
            lmojexxdyd(((ru.myspar.catalog.impl.subcatalog.presentation.ppxfxbqfkf.zoijcleaow) uiLabel).iobyxmoadg());
        } else if (uiLabel instanceof ru.myspar.catalog.impl.subcatalog.presentation.ppxfxbqfkf.wkgbmnqykc) {
            f70.zoijcleaow.wkgbmnqykc(okpsazkaxt().iobyxmoadg(((ru.myspar.catalog.impl.subcatalog.presentation.ppxfxbqfkf.wkgbmnqykc) uiLabel).iobyxmoadg()), jhduphickx(), g70.eablkybsjg.iobyxmoadg("SUB_CATALOG_PAGER_SCREEN_KEY"));
        } else {
            if (!(uiLabel instanceof ru.myspar.catalog.impl.subcatalog.presentation.ppxfxbqfkf.iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            metgxyhuhe(((ru.myspar.catalog.impl.subcatalog.presentation.ppxfxbqfkf.iobyxmoadg) uiLabel).iobyxmoadg());
        }
    }
}
