package ru.myspar.evropolis.impl.gift.presentation;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.stevsuqkhv;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.dxjokdxxww;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.ribwqtqdhb;
import ca0.gtknphoqwx;
import gg.ojitshcjhn;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.istkbnxepw;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.yadqdtsiqt;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.evropolis.api.model.EvropolisGiftArgs;
import ru.myspar.evropolis.impl.gift.presentation.EvropolisDialogFragment;
import ru.myspar.legacy.presentation.model.AddProductParams;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 ?2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001@B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001b\u0010-\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001b\u00103\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001b\u00108\u001a\u0002048TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b5\u00100\u001a\u0004\b6\u00107R\u001b\u0010>\u001a\u0002098TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=¨\u0006A"}, d2 = {"Lru/myspar/evropolis/impl/gift/presentation/EvropolisDialogFragment;", "Lru/myspar/core/base/mvi/bottomsheet/BaseMviBottomSheetDialogFragment;", "Lca0/gtknphoqwx;", "Lru/myspar/evropolis/impl/gift/presentation/zoijcleaow;", "Lru/myspar/evropolis/impl/gift/presentation/ppxfxbqfkf;", "<init>", "()V", "Lgg/wwaezpbzkn;", "uawqvzlxes", "roivzttewh", "Lru/myspar/legacy/presentation/model/AddProductParams;", "params", "", "message", "nuxfzjnpeb", "(Lru/myspar/legacy/presentation/model/AddProductParams;Ljava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "label", "lrnfpwlwnk", "(Lru/myspar/evropolis/impl/gift/presentation/ppxfxbqfkf;)V", "Lq40/iobyxmoadg;", "yadqdtsiqt", "Lq40/iobyxmoadg;", "iyctptxqzt", "()Lq40/iobyxmoadg;", "setSnackbarManager", "(Lq40/iobyxmoadg;)V", "snackbarManager", "Lee0/ppxfxbqfkf;", "iozdgvuglv", "Lee0/ppxfxbqfkf;", "opjhrmiecq", "()Lee0/ppxfxbqfkf;", "setImageUtils", "(Lee0/ppxfxbqfkf;)V", "imageUtils", "Ly90/iobyxmoadg;", "lmojexxdyd", "Lys/ppxfxbqfkf;", "bfopjjpdmp", "()Ly90/iobyxmoadg;", "binding", "Lru/myspar/evropolis/api/model/EvropolisGiftArgs;", "wwaezpbzkn", "Lgg/gtknphoqwx;", "zfvoamnweg", "()Lru/myspar/evropolis/api/model/EvropolisGiftArgs;", "args", "Lru/myspar/evropolis/impl/gift/presentation/iobyxmoadg;", "ylkuphrtab", "oipsdeybqn", "()Lru/myspar/evropolis/impl/gift/presentation/iobyxmoadg;", "binder", "Lru/myspar/evropolis/impl/gift/presentation/wkgbmnqykc;", "pkzmftpjix", "Lzs/ppxfxbqfkf;", "weqkydbzbr", "()Lru/myspar/evropolis/impl/gift/presentation/wkgbmnqykc;", "viewImpl", "hcddaimhww", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EvropolisDialogFragment extends Hilt_EvropolisDialogFragment<gtknphoqwx, ru.myspar.evropolis.impl.gift.presentation.zoijcleaow, ru.myspar.evropolis.impl.gift.presentation.ppxfxbqfkf> {

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata */
    public ee0.ppxfxbqfkf imageUtils;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata */
    private final ys.ppxfxbqfkf binding;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name and from kotlin metadata */
    private final zs.ppxfxbqfkf viewImpl;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata */
    private final gg.gtknphoqwx args;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata */
    public q40.iobyxmoadg snackbarManager;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name and from kotlin metadata */
    private final gg.gtknphoqwx binder;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f88304jpowsppfya = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(EvropolisDialogFragment.class, "binding", "getBinding()Lru/myspar/evropolis/impl/databinding/DialogFragmentEvropolisProductBinding;", 0)), cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(EvropolisDialogFragment.class, "viewImpl", "getViewImpl()Lru/myspar/evropolis/impl/gift/presentation/EvropolisDialogViewImpl;", 0))};

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f88311zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f88311zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f88311zdlpuopuiu).getViewModelStore();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f88312yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f88313zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(tg.iobyxmoadg iobyxmoadgVar, gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f88313zdlpuopuiu = iobyxmoadgVar;
            this.f88312yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f88313zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f88312yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.evropolis.impl.gift.presentation.EvropolisDialogFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final EvropolisDialogFragment iobyxmoadg(EvropolisGiftArgs args) {
            zdlpuopuiu.btonecajqb(args, "args");
            return (EvropolisDialogFragment) b40.iobyxmoadg.zoijcleaow(new EvropolisDialogFragment(), args, false, 2, null);
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f88314yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f88315zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(Fragment fragment, gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f88315zdlpuopuiu = fragment;
            this.f88314yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f88314yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f88315zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f88316zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Fragment fragment) {
            super(0);
            this.f88316zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f88316zdlpuopuiu;
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f88317zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f88317zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f88317zdlpuopuiu.invoke();
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f88318zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1, y90.iobyxmoadg.class, "bind", "bind(Landroid/view/View;)Lru/myspar/evropolis/impl/databinding/DialogFragmentEvropolisProductBinding;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final y90.iobyxmoadg invoke(View p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return y90.iobyxmoadg.iobyxmoadg(p13);
        }
    }

    public EvropolisDialogFragment() {
        super(q90.eablkybsjg.dialog_fragment_evropolis_product);
        this.binding = ys.iobyxmoadg.ppxfxbqfkf(this, zoijcleaow.f88318zdlpuopuiu);
        this.args = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: ca0.eablkybsjg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return EvropolisDialogFragment.sflfametgt(this.f19373zdlpuopuiu);
            }
        });
        gg.gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new wkgbmnqykc(new ppxfxbqfkf(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(iobyxmoadg.class), new eablkybsjg(gtknphoqwxVarIobyxmoadg), new gxszxtbevo(null, gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(this, gtknphoqwxVarIobyxmoadg));
        this.viewImpl = zs.wkgbmnqykc.iobyxmoadg(this, new tg.iobyxmoadg() { // from class: ca0.gxszxtbevo
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return EvropolisDialogFragment.auzgnhcxok(this.f19379zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.evropolis.impl.gift.presentation.wkgbmnqykc auzgnhcxok(EvropolisDialogFragment evropolisDialogFragment) {
        return new ru.myspar.evropolis.impl.gift.presentation.wkgbmnqykc(new istkbnxepw(evropolisDialogFragment) { // from class: ru.myspar.evropolis.impl.gift.presentation.EvropolisDialogFragment.nufgyqmvbu
            @Override // ah.draadjrbmk
            public Object get() {
                return ((EvropolisDialogFragment) this.receiver).bfopjjpdmp();
            }
        }, evropolisDialogFragment.opjhrmiecq());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y90.iobyxmoadg bfopjjpdmp() {
        return (y90.iobyxmoadg) this.binding.iobyxmoadg(this, f88304jpowsppfya[0]);
    }

    private final void nuxfzjnpeb(final AddProductParams params, String message) {
        ee0.zoijcleaow zoijcleaowVar = ee0.zoijcleaow.f31209iobyxmoadg;
        Context contextRequireContext = requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        zoijcleaowVar.ppxfxbqfkf(contextRequireContext, message, new tg.iobyxmoadg() { // from class: ca0.ppxfxbqfkf
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return EvropolisDialogFragment.tbqsvytpvh(this.f19382zdlpuopuiu, params);
            }
        }, null).show();
    }

    private final void roivzttewh() {
        r40.iobyxmoadg.eablkybsjg(iyctptxqzt(), pm.dxjokdxxww.product_not_available);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EvropolisGiftArgs sflfametgt(EvropolisDialogFragment evropolisDialogFragment) {
        return (EvropolisGiftArgs) qs.ppxfxbqfkf.wkgbmnqykc(evropolisDialogFragment, cllcsxoeiz.zoijcleaow(EvropolisGiftArgs.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn tbqsvytpvh(EvropolisDialogFragment evropolisDialogFragment, AddProductParams addProductParams) {
        evropolisDialogFragment.ribwqtqdhb().jyumaefscl(new ru.myspar.evropolis.impl.gift.presentation.zoijcleaow.iobyxmoadg(addProductParams));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void uawqvzlxes() {
        r40.iobyxmoadg.eablkybsjg(iyctptxqzt(), pm.dxjokdxxww.msg_product_adding_to_cart);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zeieaojujs(com.google.android.material.bottomsheet.ppxfxbqfkf ppxfxbqfkfVar, EvropolisDialogFragment evropolisDialogFragment, DialogInterface dialogInterface) {
        View viewFindViewById = ppxfxbqfkfVar.findViewById(da.gxszxtbevo.design_bottom_sheet);
        if (viewFindViewById != null) {
            viewFindViewById.setBackgroundResource(s40.gxszxtbevo.bottom_sheet_background);
            List tabs = evropolisDialogFragment.zfvoamnweg().getGift().getTabs();
            if (tabs == null || tabs.isEmpty()) {
                return;
            }
            evropolisDialogFragment.mbcevpiqjq(viewFindViewById);
        }
    }

    private final EvropolisGiftArgs zfvoamnweg() {
        return (EvropolisGiftArgs) this.args.getValue();
    }

    public final q40.iobyxmoadg iyctptxqzt() {
        q40.iobyxmoadg iobyxmoadgVar = this.snackbarManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("snackbarManager");
        return null;
    }

    @Override // ru.myspar.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment
    /* JADX INFO: renamed from: lrnfpwlwnk, reason: merged with bridge method [inline-methods] */
    public void jhduphickx(ru.myspar.evropolis.impl.gift.presentation.ppxfxbqfkf label) {
        zdlpuopuiu.btonecajqb(label, "label");
        if (label instanceof ru.myspar.evropolis.impl.gift.presentation.ppxfxbqfkf.iobyxmoadg) {
            Context contextRequireContext = requireContext();
            zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
            c60.zoijcleaow.zoijcleaow(contextRequireContext, null, ((ru.myspar.evropolis.impl.gift.presentation.ppxfxbqfkf.iobyxmoadg) label).iobyxmoadg(), 1, null);
            return;
        }
        if (label instanceof ru.myspar.evropolis.impl.gift.presentation.ppxfxbqfkf.zoijcleaow) {
            dismiss();
            return;
        }
        if (label instanceof ru.myspar.evropolis.impl.gift.presentation.ppxfxbqfkf.wkgbmnqykc) {
            sopmlzcsov(((ru.myspar.evropolis.impl.gift.presentation.ppxfxbqfkf.wkgbmnqykc) label).iobyxmoadg());
            return;
        }
        if (label instanceof ru.myspar.evropolis.impl.gift.presentation.ppxfxbqfkf.C2025ppxfxbqfkf) {
            ru.myspar.evropolis.impl.gift.presentation.ppxfxbqfkf.C2025ppxfxbqfkf c2025ppxfxbqfkf = (ru.myspar.evropolis.impl.gift.presentation.ppxfxbqfkf.C2025ppxfxbqfkf) label;
            nuxfzjnpeb(c2025ppxfxbqfkf.zoijcleaow(), c2025ppxfxbqfkf.iobyxmoadg());
        } else if (label instanceof ru.myspar.evropolis.impl.gift.presentation.ppxfxbqfkf.eablkybsjg) {
            r40.iobyxmoadg.wkgbmnqykc(iyctptxqzt(), ((ru.myspar.evropolis.impl.gift.presentation.ppxfxbqfkf.eablkybsjg) label).iobyxmoadg(), null, ss.wkgbmnqykc.gxszxtbevo.NonFatal, 2, null);
        } else if (zdlpuopuiu.eablkybsjg(label, ru.myspar.evropolis.impl.gift.presentation.ppxfxbqfkf.gxszxtbevo.f88330iobyxmoadg)) {
            roivzttewh();
        } else {
            if (!zdlpuopuiu.eablkybsjg(label, ru.myspar.evropolis.impl.gift.presentation.ppxfxbqfkf.lqeggnwhkg.f88332iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            uawqvzlxes();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment
    /* JADX INFO: renamed from: oipsdeybqn, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg ribwqtqdhb() {
        return (iobyxmoadg) this.binder.getValue();
    }

    @Override // ru.myspar.core.base.api.bottomsheet.FixedBottomSheetFragment, com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(savedInstanceState);
        zdlpuopuiu.nufgyqmvbu(dialogOnCreateDialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        final com.google.android.material.bottomsheet.ppxfxbqfkf ppxfxbqfkfVar = (com.google.android.material.bottomsheet.ppxfxbqfkf) dialogOnCreateDialog;
        ppxfxbqfkfVar.setOnShowListener(new DialogInterface.OnShowListener() { // from class: ca0.wkgbmnqykc
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                EvropolisDialogFragment.zeieaojujs(ppxfxbqfkfVar, this, dialogInterface);
            }
        });
        return ppxfxbqfkfVar;
    }

    public final ee0.ppxfxbqfkf opjhrmiecq() {
        ee0.ppxfxbqfkf ppxfxbqfkfVar = this.imageUtils;
        if (ppxfxbqfkfVar != null) {
            return ppxfxbqfkfVar;
        }
        zdlpuopuiu.pmvmpeiblj("imageUtils");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.core.base.mvi.bottomsheet.BaseMviBottomSheetDialogFragment
    /* JADX INFO: renamed from: weqkydbzbr, reason: merged with bridge method [inline-methods] */
    public ru.myspar.evropolis.impl.gift.presentation.wkgbmnqykc vipkmwdibw() {
        return (ru.myspar.evropolis.impl.gift.presentation.wkgbmnqykc) this.viewImpl.iobyxmoadg(this, f88304jpowsppfya[1]);
    }
}
