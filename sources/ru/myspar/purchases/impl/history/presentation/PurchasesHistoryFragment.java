package ru.myspar.purchases.impl.history.presentation;

import androidx.compose.runtime.a0;
import androidx.compose.runtime.f;
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
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;
import nx1.nufgyqmvbu;
import ru.myspar.core.base.api.bottomsheet.BaseBottomSheetDialogFragment;
import ru.myspar.purchases.api.model.PurchasesHistoryArgs;
import ru.myspar.purchases.impl.history.presentation.PurchasesHistoryFragment;
import ru.myspar.rate.rate_product.api.model.RateProductArgs;
import ru.myspar.rate.rate_product.api.model.RateType;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 )2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001*B\t\b\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001b\u0010(\u001a\u00020#8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lru/myspar/purchases/impl/history/presentation/PurchasesHistoryFragment;", "Lru/myspar/core/base/mvi/fragment/BaseComposeMviFragment;", "Lux1/lqeggnwhkg;", "Lru/myspar/purchases/impl/history/presentation/zoijcleaow;", "Lru/myspar/purchases/impl/history/presentation/ppxfxbqfkf;", "Le40/iobyxmoadg;", "<init>", "()V", "Lgg/wwaezpbzkn;", "crxdokpmqz", "", "gxszxtbevo", "()Z", CommonUrlParts.MODEL, "kegysxyocb", "(Lux1/lqeggnwhkg;Landroidx/compose/runtime/draadjrbmk;I)V", "uiLabel", "sopmlzcsov", "(Lru/myspar/purchases/impl/history/presentation/ppxfxbqfkf;)V", "Lk02/iobyxmoadg;", "esjtqupxsv", "Lk02/iobyxmoadg;", "ntlheqmsrt", "()Lk02/iobyxmoadg;", "setRateProductFeatureApi", "(Lk02/iobyxmoadg;)V", "rateProductFeatureApi", "Lq40/iobyxmoadg;", "lereixgezr", "Lq40/iobyxmoadg;", "ulzqkzuiru", "()Lq40/iobyxmoadg;", "setSnackbarManager", "(Lq40/iobyxmoadg;)V", "snackbarManager", "Lru/myspar/purchases/impl/history/presentation/iobyxmoadg;", "pmvmpeiblj", "Lgg/gtknphoqwx;", "mbcevpiqjq", "()Lru/myspar/purchases/impl/history/presentation/iobyxmoadg;", "binder", "zynmafqrjb", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PurchasesHistoryFragment extends Hilt_PurchasesHistoryFragment<ux1.lqeggnwhkg, ru.myspar.purchases.impl.history.presentation.zoijcleaow, ru.myspar.purchases.impl.history.presentation.ppxfxbqfkf> implements e40.iobyxmoadg {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    public k02.iobyxmoadg rateProductFeatureApi;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    public q40.iobyxmoadg snackbarManager;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx binder;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    public static final int f102297istkbnxepw = 8;

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f102302zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f102302zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f102302zdlpuopuiu).getViewModelStore();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f102303yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f102304zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(tg.iobyxmoadg iobyxmoadgVar, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f102304zdlpuopuiu = iobyxmoadgVar;
            this.f102303yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f102304zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f102303yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.purchases.impl.history.presentation.PurchasesHistoryFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final PurchasesHistoryFragment iobyxmoadg(PurchasesHistoryArgs args) {
            zdlpuopuiu.btonecajqb(args, "args");
            return (PurchasesHistoryFragment) b40.iobyxmoadg.zoijcleaow(new PurchasesHistoryFragment(), args, false, 2, null);
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f102305yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f102306zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(Fragment fragment, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f102306zdlpuopuiu = fragment;
            this.f102305yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f102305yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f102306zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f102307zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Fragment fragment) {
            super(0);
            this.f102307zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f102307zdlpuopuiu;
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f102308zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f102308zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f102308zdlpuopuiu.invoke();
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements draadjrbmk {
        zoijcleaow(Object obj) {
            super(1, obj, PurchasesHistoryFragment.class, "dispatch", "dispatch(Ljava/lang/Object;)V", 0);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((ru.myspar.purchases.impl.history.presentation.zoijcleaow) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(ru.myspar.purchases.impl.history.presentation.zoijcleaow p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            ((PurchasesHistoryFragment) this.receiver).ylkuphrtab(p13);
        }
    }

    public PurchasesHistoryFragment() {
        gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new wkgbmnqykc(new ppxfxbqfkf(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(iobyxmoadg.class), new eablkybsjg(gtknphoqwxVarIobyxmoadg), new gxszxtbevo(null, gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(this, gtknphoqwxVarIobyxmoadg));
    }

    private final void crxdokpmqz() {
        BaseBottomSheetDialogFragment baseBottomSheetDialogFragmentIobyxmoadg = ntlheqmsrt().iobyxmoadg(new RateProductArgs(new RateType.List("my_purchases")), new tg.iobyxmoadg() { // from class: ux1.ppxfxbqfkf
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return PurchasesHistoryFragment.jlmebxxoox(this.f114655zdlpuopuiu);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        zdlpuopuiu.dxjokdxxww(childFragmentManager, "getChildFragmentManager(...)");
        baseBottomSheetDialogFragmentIobyxmoadg.ntlheqmsrt(childFragmentManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn jlmebxxoox(PurchasesHistoryFragment purchasesHistoryFragment) {
        purchasesHistoryFragment.ylkuphrtab(ru.myspar.purchases.impl.history.presentation.zoijcleaow.wkgbmnqykc.f102331iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn tzroggbefp(PurchasesHistoryFragment purchasesHistoryFragment, ux1.lqeggnwhkg lqeggnwhkgVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
        purchasesHistoryFragment.wwaezpbzkn(lqeggnwhkgVar, draadjrbmkVar, f.iobyxmoadg(i13 | 1));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // e40.iobyxmoadg
    public boolean gxszxtbevo() {
        ylkuphrtab(ru.myspar.purchases.impl.history.presentation.zoijcleaow.iobyxmoadg.f102327iobyxmoadg);
        return true;
    }

    @Override // ru.myspar.core.base.mvi.fragment.BaseComposeMviFragment
    /* JADX INFO: renamed from: kegysxyocb, reason: merged with bridge method [inline-methods] */
    public void wwaezpbzkn(final ux1.lqeggnwhkg model, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        zdlpuopuiu.btonecajqb(model, "model");
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(698378728);
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
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(698378728, i14, -1, "ru.myspar.purchases.impl.history.presentation.PurchasesHistoryFragment.Render (PurchasesHistoryFragment.kt:40)");
            }
            draadjrbmkVarBtonecajqb.sopmlzcsov(1971328075);
            boolean zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(this);
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zLmojexxdyd || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = new zoijcleaow(this);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            draadjrbmkVarBtonecajqb.stevsuqkhv();
            vx1.wkgbmnqykc.ppxfxbqfkf(model, (draadjrbmk) ((ah.lqeggnwhkg) objYadqdtsiqt), draadjrbmkVarBtonecajqb, i14 & 14, 0);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new rgvfuqvkyq() { // from class: ux1.wkgbmnqykc
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return PurchasesHistoryFragment.tzroggbefp(this.f114658zdlpuopuiu, model, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
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

    public final k02.iobyxmoadg ntlheqmsrt() {
        k02.iobyxmoadg iobyxmoadgVar = this.rateProductFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("rateProductFeatureApi");
        return null;
    }

    @Override // ru.myspar.core.base.mvi.fragment.BaseComposeMviFragment
    /* JADX INFO: renamed from: sopmlzcsov, reason: merged with bridge method [inline-methods] */
    public void hcddaimhww(ru.myspar.purchases.impl.history.presentation.ppxfxbqfkf uiLabel) {
        zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
        if (uiLabel instanceof ru.myspar.purchases.impl.history.presentation.ppxfxbqfkf.iobyxmoadg) {
            lmojexxdyd(((ru.myspar.purchases.impl.history.presentation.ppxfxbqfkf.iobyxmoadg) uiLabel).iobyxmoadg());
        } else if (uiLabel instanceof ru.myspar.purchases.impl.history.presentation.ppxfxbqfkf.C2468ppxfxbqfkf) {
            r40.iobyxmoadg.dxjokdxxww(ulzqkzuiru(), nufgyqmvbu.no_purchases_yet_message, null, null, 6, null);
        } else {
            if (!zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.purchases.impl.history.presentation.ppxfxbqfkf.zoijcleaow.f102324iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            crxdokpmqz();
        }
    }

    public final q40.iobyxmoadg ulzqkzuiru() {
        q40.iobyxmoadg iobyxmoadgVar = this.snackbarManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("snackbarManager");
        return null;
    }
}
