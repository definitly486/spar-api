package ru.myspar.catalog.impl.pager.presentation;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.fragment.app.Fragment;
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
import ru.myspar.catalog.api.model.CatalogArgs;
import ru.myspar.catalog.impl.pager.presentation.CatalogPagerFragment;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;
import zq.nufgyqmvbu;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 ;2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001<B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u0006J\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u001b\u0010:\u001a\u0002058TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109¨\u0006="}, d2 = {"Lru/myspar/catalog/impl/pager/presentation/CatalogPagerFragment;", "Lru/myspar/core/base/mvi/fragment/BaseComposeMviFragment;", "Lzq/nufgyqmvbu;", "Lru/myspar/catalog/impl/pager/presentation/zoijcleaow;", "Lru/myspar/catalog/impl/pager/presentation/ppxfxbqfkf;", "<init>", "()V", "", "id", "Lgg/wwaezpbzkn;", "jlmebxxoox", "(Ljava/lang/String;)V", "onDestroyView", "onStart", "onStop", "", "isHidden", "onHiddenChanged", "(Z)V", "uiLabel", "crxdokpmqz", "(Lru/myspar/catalog/impl/pager/presentation/ppxfxbqfkf;)V", CommonUrlParts.MODEL, "kegysxyocb", "(Lzq/nufgyqmvbu;Landroidx/compose/runtime/draadjrbmk;I)V", "Lf70/iobyxmoadg;", "esjtqupxsv", "Lf70/iobyxmoadg;", "ulzqkzuiru", "()Lf70/iobyxmoadg;", "setDialogManager", "(Lf70/iobyxmoadg;)V", "dialogManager", "Lq40/iobyxmoadg;", "lereixgezr", "Lq40/iobyxmoadg;", "sopmlzcsov", "()Lq40/iobyxmoadg;", "setSnackbarManager", "(Lq40/iobyxmoadg;)V", "snackbarManager", "Lfs/iobyxmoadg;", "pmvmpeiblj", "Lfs/iobyxmoadg;", "ntlheqmsrt", "()Lfs/iobyxmoadg;", "setCitiesFeatureApi", "(Lfs/iobyxmoadg;)V", "citiesFeatureApi", "Lrx/nufgyqmvbu;", "zynmafqrjb", "Lrx/nufgyqmvbu;", "ageCheckedDialog", "Lru/myspar/catalog/impl/pager/presentation/iobyxmoadg;", "istkbnxepw", "Lgg/gtknphoqwx;", "mbcevpiqjq", "()Lru/myspar/catalog/impl/pager/presentation/iobyxmoadg;", "binder", "cdpycssgdh", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CatalogPagerFragment extends Hilt_CatalogPagerFragment<nufgyqmvbu, ru.myspar.catalog.impl.pager.presentation.zoijcleaow, ru.myspar.catalog.impl.pager.presentation.ppxfxbqfkf> {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    public static final int f85202yadqdtsiqt = 8;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    public f70.iobyxmoadg dialogManager;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx binder;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    public q40.iobyxmoadg snackbarManager;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    public fs.iobyxmoadg citiesFeatureApi;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    private rx.nufgyqmvbu ageCheckedDialog;

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f85208zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f85208zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f85208zdlpuopuiu).getViewModelStore();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f85209yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f85210zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(tg.iobyxmoadg iobyxmoadgVar, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f85210zdlpuopuiu = iobyxmoadgVar;
            this.f85209yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f85210zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f85209yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.catalog.impl.pager.presentation.CatalogPagerFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final CatalogPagerFragment iobyxmoadg(CatalogArgs args) {
            zdlpuopuiu.btonecajqb(args, "args");
            return (CatalogPagerFragment) b40.iobyxmoadg.iobyxmoadg(new CatalogPagerFragment(), args, false);
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f85211yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f85212zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(Fragment fragment, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f85212zdlpuopuiu = fragment;
            this.f85211yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f85211yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f85212zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f85213zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Fragment fragment) {
            super(0);
            this.f85213zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f85213zdlpuopuiu;
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f85214zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f85214zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f85214zdlpuopuiu.invoke();
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements draadjrbmk {
        zoijcleaow(Object obj) {
            super(1, obj, CatalogPagerFragment.class, "dispatch", "dispatch(Ljava/lang/Object;)V", 0);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((ru.myspar.catalog.impl.pager.presentation.zoijcleaow) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(ru.myspar.catalog.impl.pager.presentation.zoijcleaow p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            ((CatalogPagerFragment) this.receiver).ylkuphrtab(p13);
        }
    }

    public CatalogPagerFragment() {
        gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new wkgbmnqykc(new ppxfxbqfkf(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(iobyxmoadg.class), new eablkybsjg(gtknphoqwxVarIobyxmoadg), new gxszxtbevo(null, gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(this, gtknphoqwxVarIobyxmoadg));
    }

    private final void jlmebxxoox(final String id2) {
        rx.nufgyqmvbu nufgyqmvbuVar = this.ageCheckedDialog;
        if (nufgyqmvbuVar == null || !nufgyqmvbuVar.isShowing()) {
            ee0.zoijcleaow zoijcleaowVar = ee0.zoijcleaow.f31209iobyxmoadg;
            oxmwwwfdhm oxmwwwfdhmVarRequireActivity = requireActivity();
            zdlpuopuiu.dxjokdxxww(oxmwwwfdhmVarRequireActivity, "requireActivity(...)");
            rx.nufgyqmvbu nufgyqmvbuVarZoijcleaow = ee0.zoijcleaow.zoijcleaow(zoijcleaowVar, oxmwwwfdhmVarRequireActivity, new tg.iobyxmoadg() { // from class: zq.wkgbmnqykc
                @Override // tg.iobyxmoadg
                public final Object invoke() {
                    return CatalogPagerFragment.ribwqtqdhb(this.f130930zdlpuopuiu, id2);
                }
            }, null, null, null, 28, null);
            this.ageCheckedDialog = nufgyqmvbuVarZoijcleaow;
            if (nufgyqmvbuVarZoijcleaow != null) {
                f70.zoijcleaow.zoijcleaow(nufgyqmvbuVarZoijcleaow, ulzqkzuiru(), g70.eablkybsjg.iobyxmoadg("CATALOG_PAGER_SCREEN_KEY"));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ribwqtqdhb(CatalogPagerFragment catalogPagerFragment, String str) {
        catalogPagerFragment.ylkuphrtab(new ru.myspar.catalog.impl.pager.presentation.zoijcleaow.C1941zoijcleaow(str));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn tzroggbefp(CatalogPagerFragment catalogPagerFragment, nufgyqmvbu nufgyqmvbuVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
        catalogPagerFragment.wwaezpbzkn(nufgyqmvbuVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // ru.myspar.core.base.mvi.fragment.BaseComposeMviFragment
    /* JADX INFO: renamed from: crxdokpmqz, reason: merged with bridge method [inline-methods] */
    public void hcddaimhww(ru.myspar.catalog.impl.pager.presentation.ppxfxbqfkf uiLabel) {
        zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
        if (uiLabel instanceof ru.myspar.catalog.impl.pager.presentation.ppxfxbqfkf.C1940ppxfxbqfkf) {
            lmojexxdyd(((ru.myspar.catalog.impl.pager.presentation.ppxfxbqfkf.C1940ppxfxbqfkf) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.catalog.impl.pager.presentation.ppxfxbqfkf.wkgbmnqykc) {
            r40.iobyxmoadg.gxszxtbevo(sopmlzcsov(), ((ru.myspar.catalog.impl.pager.presentation.ppxfxbqfkf.wkgbmnqykc) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.catalog.impl.pager.presentation.ppxfxbqfkf.eablkybsjg) {
            r40.iobyxmoadg.btonecajqb(sopmlzcsov(), ((ru.myspar.catalog.impl.pager.presentation.ppxfxbqfkf.eablkybsjg) uiLabel).iobyxmoadg(), null, null, 6, null);
        } else if (uiLabel instanceof ru.myspar.catalog.impl.pager.presentation.ppxfxbqfkf.iobyxmoadg) {
            jlmebxxoox(((ru.myspar.catalog.impl.pager.presentation.ppxfxbqfkf.iobyxmoadg) uiLabel).iobyxmoadg());
        } else {
            if (!(uiLabel instanceof ru.myspar.catalog.impl.pager.presentation.ppxfxbqfkf.zoijcleaow)) {
                throw new NoWhenBranchMatchedException();
            }
            f70.zoijcleaow.ppxfxbqfkf(ntlheqmsrt().iobyxmoadg(), ulzqkzuiru(), g70.eablkybsjg.iobyxmoadg("CATALOG_PAGER_SCREEN_KEY"));
        }
    }

    @Override // ru.myspar.core.base.mvi.fragment.BaseComposeMviFragment
    /* JADX INFO: renamed from: kegysxyocb, reason: merged with bridge method [inline-methods] */
    public void wwaezpbzkn(final nufgyqmvbu model, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        zdlpuopuiu.btonecajqb(model, "model");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(1323213216);
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
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1323213216, i14, -1, "ru.myspar.catalog.impl.pager.presentation.CatalogPagerFragment.Render (CatalogPagerFragment.kt:75)");
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(171237787);
            boolean zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(this);
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zLmojexxdyd || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new zoijcleaow(this);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            ar.vdvldrhtss.dxjokdxxww(model, (draadjrbmk) ((ah.lqeggnwhkg) objYadqdtsiqt), draadjrbmkVarBtonecajqb, i14 & 14, 0);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: zq.eablkybsjg
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return CatalogPagerFragment.tzroggbefp(this.f130919zdlpuopuiu, model, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.core.base.mvi.fragment.BaseComposeMviFragment
    /* JADX INFO: renamed from: mbcevpiqjq, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg pkzmftpjix() {
        return (iobyxmoadg) this.binder.getValue();
    }

    public final fs.iobyxmoadg ntlheqmsrt() {
        fs.iobyxmoadg iobyxmoadgVar = this.citiesFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("citiesFeatureApi");
        return null;
    }

    @Override // ru.myspar.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        rx.nufgyqmvbu nufgyqmvbuVar = this.ageCheckedDialog;
        if (nufgyqmvbuVar != null) {
            nufgyqmvbuVar.dismiss();
        }
        this.ageCheckedDialog = null;
        super.onDestroyView();
    }

    @Override // ru.myspar.core.base.mvi.fragment.BaseComposeMviFragment, ru.myspar.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean isHidden) {
        super.onHiddenChanged(isHidden);
        ylkuphrtab(new ru.myspar.catalog.impl.pager.presentation.zoijcleaow.eablkybsjg(isHidden));
    }

    @Override // ru.myspar.core.base.mvi.fragment.BaseComposeMviFragment, ru.myspar.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        ylkuphrtab(new ru.myspar.catalog.impl.pager.presentation.zoijcleaow.dxjokdxxww(true));
    }

    @Override // ru.myspar.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onStop() {
        ylkuphrtab(new ru.myspar.catalog.impl.pager.presentation.zoijcleaow.dxjokdxxww(false));
        super.onStop();
    }

    public final q40.iobyxmoadg sopmlzcsov() {
        q40.iobyxmoadg iobyxmoadgVar = this.snackbarManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("snackbarManager");
        return null;
    }

    public final f70.iobyxmoadg ulzqkzuiru() {
        f70.iobyxmoadg iobyxmoadgVar = this.dialogManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("dialogManager");
        return null;
    }
}
