package ru.myspar.proloyalty.menu.impl.presentation;

import android.content.Context;
import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.stevsuqkhv;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.dxjokdxxww;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.ribwqtqdhb;
import gg.gtknphoqwx;
import gg.ojitshcjhn;
import gg.wwaezpbzkn;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;
import pd1.nufgyqmvbu;
import ru.myspar.proloyalty.domain.feature.review.store.InAppReviewDialogArgs;
import ru.myspar.proloyalty.legacy.presentation.screen.review.InAppReviewDialogFragment;
import ru.myspar.proloyalty.menu.impl.presentation.MenuFragment;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u001e2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u001fB\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u0006J\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lru/myspar/proloyalty/menu/impl/presentation/MenuFragment;", "Lru/myspar/proloyalty/core/base/mvi/fragment/BaseComposeMviFragment;", "Lpd1/nufgyqmvbu;", "Lru/myspar/proloyalty/menu/impl/presentation/ppxfxbqfkf;", "Lru/myspar/proloyalty/menu/impl/presentation/wkgbmnqykc;", "<init>", "()V", "Lgg/wwaezpbzkn;", "jlmebxxoox", "Lru/myspar/proloyalty/menu/impl/presentation/zoijcleaow$iobyxmoadg;", AdRevenueConstants.SOURCE_KEY, "sopmlzcsov", "(Lru/myspar/proloyalty/menu/impl/presentation/zoijcleaow$iobyxmoadg;)V", "onDestroyView", CommonUrlParts.MODEL, "tzroggbefp", "(Lpd1/nufgyqmvbu;Landroidx/compose/runtime/draadjrbmk;I)V", "uiLabel", "ulzqkzuiru", "(Lru/myspar/proloyalty/menu/impl/presentation/wkgbmnqykc;)V", "Lru/myspar/proloyalty/menu/impl/presentation/zoijcleaow;", "esjtqupxsv", "Lgg/gtknphoqwx;", "ntlheqmsrt", "()Lru/myspar/proloyalty/menu/impl/presentation/zoijcleaow;", "binder", "Landroidx/fragment/app/DialogFragment;", "lereixgezr", "Landroidx/fragment/app/DialogFragment;", "inAppReviewDialogFragment", "pmvmpeiblj", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MenuFragment extends iobyxmoadg {

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    public static final int f98068zynmafqrjb = 8;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx binder;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    private DialogFragment inAppReviewDialogFragment;

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f98071zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f98071zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f98071zdlpuopuiu).getViewModelStore();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f98072yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f98073zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(tg.iobyxmoadg iobyxmoadgVar, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f98073zdlpuopuiu = iobyxmoadgVar;
            this.f98072yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f98073zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f98072yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.menu.impl.presentation.MenuFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final MenuFragment iobyxmoadg() {
            return new MenuFragment();
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f98074yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f98075zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(Fragment fragment, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f98075zdlpuopuiu = fragment;
            this.f98074yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f98074yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f98075zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f98076zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Fragment fragment) {
            super(0);
            this.f98076zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f98076zdlpuopuiu;
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f98077zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f98077zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f98077zdlpuopuiu.invoke();
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements draadjrbmk {
        zoijcleaow(Object obj) {
            super(1, obj, MenuFragment.class, "dispatch", "dispatch(Ljava/lang/Object;)V", 0);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((ru.myspar.proloyalty.menu.impl.presentation.ppxfxbqfkf) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(ru.myspar.proloyalty.menu.impl.presentation.ppxfxbqfkf p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            ((MenuFragment) this.receiver).ylkuphrtab(p13);
        }
    }

    public MenuFragment() {
        gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new wkgbmnqykc(new ppxfxbqfkf(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(ru.myspar.proloyalty.menu.impl.presentation.zoijcleaow.class), new eablkybsjg(gtknphoqwxVarIobyxmoadg), new gxszxtbevo(null, gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(this, gtknphoqwxVarIobyxmoadg));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn crxdokpmqz(MenuFragment menuFragment, ru.myspar.proloyalty.menu.impl.presentation.zoijcleaow.iobyxmoadg iobyxmoadgVar) {
        menuFragment.pkzmftpjix().jyumaefscl(new ru.myspar.proloyalty.menu.impl.presentation.ppxfxbqfkf.iobyxmoadg(iobyxmoadgVar));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void jlmebxxoox() {
        InAppReviewDialogFragment inAppReviewDialogFragmentIyctptxqzt = InAppReviewDialogFragment.INSTANCE.iobyxmoadg(new InAppReviewDialogArgs(null, 1, null)).iyctptxqzt(new draadjrbmk() { // from class: pd1.wkgbmnqykc
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return MenuFragment.ribwqtqdhb(this.f76440zdlpuopuiu, ((Boolean) obj).booleanValue());
            }
        });
        this.inAppReviewDialogFragment = inAppReviewDialogFragmentIyctptxqzt;
        FragmentManager childFragmentManager = getChildFragmentManager();
        zdlpuopuiu.dxjokdxxww(childFragmentManager, "getChildFragmentManager(...)");
        inAppReviewDialogFragmentIyctptxqzt.ntlheqmsrt(childFragmentManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn mbcevpiqjq(MenuFragment menuFragment, nufgyqmvbu nufgyqmvbuVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
        menuFragment.wwaezpbzkn(nufgyqmvbuVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ribwqtqdhb(MenuFragment menuFragment, boolean z13) {
        menuFragment.pkzmftpjix().jyumaefscl(new ru.myspar.proloyalty.menu.impl.presentation.ppxfxbqfkf.wkgbmnqykc(z13));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void sopmlzcsov(final ru.myspar.proloyalty.menu.impl.presentation.zoijcleaow.iobyxmoadg source) {
        ac1.zoijcleaow zoijcleaowVar = ac1.zoijcleaow.f1546iobyxmoadg;
        Context contextRequireContext = requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        ac1.zoijcleaow.zoijcleaow(zoijcleaowVar, contextRequireContext, new tg.iobyxmoadg() { // from class: pd1.gxszxtbevo
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return MenuFragment.crxdokpmqz(this.f76437zdlpuopuiu, source);
            }
        }, null, null, ow0.ppxfxbqfkf.VERTICAL, 12, null).show();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseComposeMviFragment
    /* JADX INFO: renamed from: ntlheqmsrt, reason: merged with bridge method [inline-methods] */
    public ru.myspar.proloyalty.menu.impl.presentation.zoijcleaow pkzmftpjix() {
        return (ru.myspar.proloyalty.menu.impl.presentation.zoijcleaow) this.binder.getValue();
    }

    @Override // ru.myspar.proloyalty.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        DialogFragment dialogFragment = this.inAppReviewDialogFragment;
        if (dialogFragment != null) {
            dialogFragment.dismiss();
        }
        super.onDestroyView();
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseComposeMviFragment
    /* JADX INFO: renamed from: tzroggbefp, reason: merged with bridge method [inline-methods] */
    public void wwaezpbzkn(final nufgyqmvbu model, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        zdlpuopuiu.btonecajqb(model, "model");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(1244623270);
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
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(1244623270, i14, -1, "ru.myspar.proloyalty.menu.impl.presentation.MenuFragment.Render (MenuFragment.kt:29)");
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(-1129317642);
            boolean zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(this);
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zLmojexxdyd || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new zoijcleaow(this);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            qd1.draadjrbmk.ojitshcjhn(model, (draadjrbmk) ((ah.lqeggnwhkg) objYadqdtsiqt), draadjrbmkVarBtonecajqb, i14 & 14);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: pd1.eablkybsjg
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return MenuFragment.mbcevpiqjq(this.f76435zdlpuopuiu, model, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseComposeMviFragment
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public void hcddaimhww(ru.myspar.proloyalty.menu.impl.presentation.wkgbmnqykc uiLabel) {
        zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
        if (uiLabel instanceof ru.myspar.proloyalty.menu.impl.presentation.wkgbmnqykc.ppxfxbqfkf) {
            lmojexxdyd(((ru.myspar.proloyalty.menu.impl.presentation.wkgbmnqykc.ppxfxbqfkf) uiLabel).iobyxmoadg());
        } else if (uiLabel instanceof ru.myspar.proloyalty.menu.impl.presentation.wkgbmnqykc.zoijcleaow) {
            jlmebxxoox();
        } else {
            if (!(uiLabel instanceof ru.myspar.proloyalty.menu.impl.presentation.wkgbmnqykc.iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            sopmlzcsov(((ru.myspar.proloyalty.menu.impl.presentation.wkgbmnqykc.iobyxmoadg) uiLabel).iobyxmoadg());
        }
    }
}
