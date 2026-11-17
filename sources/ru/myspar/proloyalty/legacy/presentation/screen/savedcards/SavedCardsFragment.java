package ru.myspar.proloyalty.legacy.presentation.screen.savedcards;

import ah.gtknphoqwx;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.stevsuqkhv;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.dxjokdxxww;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.ribwqtqdhb;
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
import ru.myspar.proloyalty.legacy.presentation.screen.savedcards.SavedCardsFragment;
import tg.draadjrbmk;
import z41.cdpycssgdh;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 )2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001*B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001c\u001a\u00020\u00178TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\"\u001a\u00020\u001d8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lru/myspar/proloyalty/legacy/presentation/screen/savedcards/SavedCardsFragment;", "Lru/myspar/proloyalty/core/base/mvi/fragment/BaseMviFragment;", "Lfb1/nufgyqmvbu;", "Lru/myspar/proloyalty/legacy/presentation/screen/savedcards/ppxfxbqfkf;", "Lru/myspar/proloyalty/legacy/presentation/screen/savedcards/wkgbmnqykc;", "<init>", "()V", "", "cardId", "Lgg/wwaezpbzkn;", "vipkmwdibw", "(Ljava/lang/String;)V", "uiLabel", "ribwqtqdhb", "(Lru/myspar/proloyalty/legacy/presentation/screen/savedcards/wkgbmnqykc;)V", "Lz21/iobyxmoadg;", "esjtqupxsv", "Lz21/iobyxmoadg;", "crxdokpmqz", "()Lz21/iobyxmoadg;", "setSnackbarManager", "(Lz21/iobyxmoadg;)V", "snackbarManager", "Lru/myspar/proloyalty/legacy/presentation/screen/savedcards/iobyxmoadg;", "lereixgezr", "Lgg/gtknphoqwx;", "ulzqkzuiru", "()Lru/myspar/proloyalty/legacy/presentation/screen/savedcards/iobyxmoadg;", "binder", "Lru/myspar/proloyalty/legacy/presentation/screen/savedcards/eablkybsjg;", "pmvmpeiblj", "Ltr0/ppxfxbqfkf;", "jlmebxxoox", "()Lru/myspar/proloyalty/legacy/presentation/screen/savedcards/eablkybsjg;", "viewImpl", "Lz41/cdpycssgdh;", "zynmafqrjb", "Lsr0/ppxfxbqfkf;", "sopmlzcsov", "()Lz41/cdpycssgdh;", "binding", "istkbnxepw", "iobyxmoadg", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SavedCardsFragment extends Hilt_SavedCardsFragment<fb1.nufgyqmvbu, ru.myspar.proloyalty.legacy.presentation.screen.savedcards.ppxfxbqfkf, ru.myspar.proloyalty.legacy.presentation.screen.savedcards.wkgbmnqykc> {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    static final /* synthetic */ gtknphoqwx[] f97276cdpycssgdh = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(SavedCardsFragment.class, "viewImpl", "getViewImpl()Lru/myspar/proloyalty/legacy/presentation/screen/savedcards/SavedCardsViewImpl;", 0)), cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(SavedCardsFragment.class, "binding", "getBinding()Lru/myspar/proloyalty/databinding/FragmentSavedCardsProloyaltyBinding;", 0))};

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    public static final int f97278yadqdtsiqt = 8;

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
        final /* synthetic */ gg.gtknphoqwx f97283zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f97283zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f97283zdlpuopuiu).getViewModelStore();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f97284yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f97285zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(tg.iobyxmoadg iobyxmoadgVar, gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f97285zdlpuopuiu = iobyxmoadgVar;
            this.f97284yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f97285zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f97284yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.legacy.presentation.screen.savedcards.SavedCardsFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final SavedCardsFragment iobyxmoadg() {
            return new SavedCardsFragment();
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f97286yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f97287zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(Fragment fragment, gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f97287zdlpuopuiu = fragment;
            this.f97286yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f97286yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f97287zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f97288zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Fragment fragment) {
            super(0);
            this.f97288zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f97288zdlpuopuiu;
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f97289zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f97289zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f97289zdlpuopuiu.invoke();
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f97290zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1, cdpycssgdh.class, "bind", "bind(Landroid/view/View;)Lru/myspar/proloyalty/databinding/FragmentSavedCardsProloyaltyBinding;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final cdpycssgdh invoke(View p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return cdpycssgdh.iobyxmoadg(p13);
        }
    }

    public SavedCardsFragment() {
        super(vk0.eablkybsjg.fragment_saved_cards_proloyalty);
        gg.gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new wkgbmnqykc(new ppxfxbqfkf(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(iobyxmoadg.class), new eablkybsjg(gtknphoqwxVarIobyxmoadg), new gxszxtbevo(null, gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(this, gtknphoqwxVarIobyxmoadg));
        this.viewImpl = tr0.wkgbmnqykc.iobyxmoadg(this, new tg.iobyxmoadg() { // from class: fb1.wkgbmnqykc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return SavedCardsFragment.ikoacuggdj(this.f33395zdlpuopuiu);
            }
        });
        this.binding = sr0.iobyxmoadg.zoijcleaow(this, zoijcleaow.f97290zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.proloyalty.legacy.presentation.screen.savedcards.eablkybsjg ikoacuggdj(SavedCardsFragment savedCardsFragment) {
        return new ru.myspar.proloyalty.legacy.presentation.screen.savedcards.eablkybsjg(new istkbnxepw(savedCardsFragment) { // from class: ru.myspar.proloyalty.legacy.presentation.screen.savedcards.SavedCardsFragment.nufgyqmvbu
            @Override // ah.draadjrbmk
            public Object get() {
                return ((SavedCardsFragment) this.receiver).sopmlzcsov();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn jhduphickx(SavedCardsFragment savedCardsFragment, String str) {
        savedCardsFragment.pkzmftpjix().jyumaefscl(new ru.myspar.proloyalty.legacy.presentation.screen.savedcards.ppxfxbqfkf.zoijcleaow(str));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final cdpycssgdh sopmlzcsov() {
        return (cdpycssgdh) this.binding.iobyxmoadg(this, f97276cdpycssgdh[1]);
    }

    private final void vipkmwdibw(final String cardId) {
        Context contextRequireContext = requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        ow0.nufgyqmvbu.iobyxmoadg.gtknphoqwx(new ow0.nufgyqmvbu.iobyxmoadg(contextRequireContext, null, null, 6, null).agtfadlqog(vk0.lqeggnwhkg.proloyalty_saved_cards_remove_card).draadjrbmk(vk0.lqeggnwhkg.proloyalty_ok, new tg.iobyxmoadg() { // from class: fb1.ppxfxbqfkf
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return SavedCardsFragment.jhduphickx(this.f33394zdlpuopuiu, cardId);
            }
        }), vk0.lqeggnwhkg.proloyalty_cancel, null, 2, null).zoijcleaow().show();
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
    public ru.myspar.proloyalty.legacy.presentation.screen.savedcards.eablkybsjg hcddaimhww() {
        return (ru.myspar.proloyalty.legacy.presentation.screen.savedcards.eablkybsjg) this.viewImpl.iobyxmoadg(this, f97276cdpycssgdh[0]);
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: ribwqtqdhb, reason: merged with bridge method [inline-methods] */
    public void jpowsppfya(ru.myspar.proloyalty.legacy.presentation.screen.savedcards.wkgbmnqykc uiLabel) {
        zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
        if (uiLabel instanceof ru.myspar.proloyalty.legacy.presentation.screen.savedcards.wkgbmnqykc.ppxfxbqfkf) {
            lmojexxdyd(((ru.myspar.proloyalty.legacy.presentation.screen.savedcards.wkgbmnqykc.ppxfxbqfkf) uiLabel).iobyxmoadg());
        } else if (uiLabel instanceof ru.myspar.proloyalty.legacy.presentation.screen.savedcards.wkgbmnqykc.iobyxmoadg) {
            vipkmwdibw(((ru.myspar.proloyalty.legacy.presentation.screen.savedcards.wkgbmnqykc.iobyxmoadg) uiLabel).iobyxmoadg());
        } else {
            if (!(uiLabel instanceof ru.myspar.proloyalty.legacy.presentation.screen.savedcards.wkgbmnqykc.zoijcleaow)) {
                throw new NoWhenBranchMatchedException();
            }
            a31.iobyxmoadg.eablkybsjg(crxdokpmqz(), vk0.lqeggnwhkg.proloyalty_saved_cards_remove_card_success);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg pkzmftpjix() {
        return (iobyxmoadg) this.binder.getValue();
    }
}
