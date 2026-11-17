package ru.myspar.scango.impl.screens.cart.presentation;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.stevsuqkhv;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.ribwqtqdhb;
import com.google.android.material.button.MaterialButton;
import gg.gtknphoqwx;
import gg.ojitshcjhn;
import gg.wwaezpbzkn;
import hg.agtfadlqog;
import java.util.List;
import k22.wflxmlrfwp;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.istkbnxepw;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.yadqdtsiqt;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.scango.api.model.ScanGoAmountProductDialogArgs;
import ru.myspar.scango.api.model.ScanGoWeightProductDialogArgs;
import ru.myspar.scango.impl.screens.amountproduct.dialog.presentation.ScanGoAmountProductDialogFragment;
import ru.myspar.scango.impl.screens.cart.presentation.ScanGoCartFragment;
import ru.myspar.scango.impl.screens.cart.presentation.adapter.ScanGoCartContentLayoutManager;
import ru.myspar.scango.impl.screens.weightproduct.dialog.presentation.ScanGoWeightProductDialogFragment;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 [2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\\B\t\b\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u0007J\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u0007J\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0007J\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0007J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\n2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\"\u0010!J\u0017\u0010#\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b#\u0010!J#\u0010'\u001a\u00020\n2\u0012\u0010&\u001a\n\u0012\u0006\b\u0001\u0012\u00020%0$\"\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\n2\u0006\u0010,\u001a\u00020\u0004H\u0016¢\u0006\u0004\b-\u0010.R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001b\u0010D\u001a\u00020?8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001b\u0010J\u001a\u00020E8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u001b\u0010P\u001a\u00020K8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u001b\u0010U\u001a\u00020Q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010A\u001a\u0004\bS\u0010TR\u001b\u0010Z\u001a\u00020V8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010A\u001a\u0004\bX\u0010Y¨\u0006]"}, d2 = {"Lru/myspar/scango/impl/screens/cart/presentation/ScanGoCartFragment;", "Lru/myspar/core/base/mvi/fragment/BaseMviFragment;", "Lru/myspar/scango/impl/screens/cart/presentation/wkgbmnqykc;", "Lru/myspar/scango/impl/screens/cart/presentation/ppxfxbqfkf;", "Lru/myspar/scango/impl/screens/cart/presentation/eablkybsjg;", "Le40/iobyxmoadg;", "<init>", "()V", "", "message", "Lgg/wwaezpbzkn;", "nuxfzjnpeb", "(Ljava/lang/String;)V", "lrnfpwlwnk", "opjhrmiecq", "ikoacuggdj", "oipsdeybqn", "", "productId", "sflfametgt", "(I)V", "roivzttewh", "", "Lo22/iobyxmoadg;", "options", "tbqsvytpvh", "(Ljava/util/List;)V", "option", "Lru/myspar/scango/impl/screens/cart/presentation/adapter/ScanGoCartContentLayoutManager$iobyxmoadg;", "productItem", "ydmasvzmpa", "(Lo22/iobyxmoadg;Lru/myspar/scango/impl/screens/cart/presentation/adapter/ScanGoCartContentLayoutManager$iobyxmoadg;)V", "zfvoamnweg", "(Lru/myspar/scango/impl/screens/cart/presentation/adapter/ScanGoCartContentLayoutManager$iobyxmoadg;)V", "weqkydbzbr", "zeieaojujs", "", "Landroid/view/View;", "views", "vipkmwdibw", "([Landroid/view/View;)V", "", "gxszxtbevo", "()Z", "uiLabel", "yfnezrywwk", "(Lru/myspar/scango/impl/screens/cart/presentation/eablkybsjg;)V", "Llx1/iobyxmoadg;", "esjtqupxsv", "Llx1/iobyxmoadg;", "xrmfcynszj", "()Llx1/iobyxmoadg;", "setPurchasesFeatureApi", "(Llx1/iobyxmoadg;)V", "purchasesFeatureApi", "Ld60/iobyxmoadg;", "lereixgezr", "Ld60/iobyxmoadg;", "metgxyhuhe", "()Ld60/iobyxmoadg;", "setResourcesManager", "(Ld60/iobyxmoadg;)V", "resourcesManager", "Lru/myspar/scango/impl/screens/cart/presentation/iobyxmoadg;", "pmvmpeiblj", "Lgg/gtknphoqwx;", "okpsazkaxt", "()Lru/myspar/scango/impl/screens/cart/presentation/iobyxmoadg;", "binder", "Lru/myspar/scango/impl/screens/cart/presentation/gxszxtbevo;", "zynmafqrjb", "Lzs/ppxfxbqfkf;", "uwvvkdfqfp", "()Lru/myspar/scango/impl/screens/cart/presentation/gxszxtbevo;", "viewImpl", "Lk22/lqeggnwhkg;", "istkbnxepw", "Lys/ppxfxbqfkf;", "jztzpxfvev", "()Lk22/lqeggnwhkg;", "binding", "Lm22/draadjrbmk;", "cdpycssgdh", "czzsidtyhn", "()Lm22/draadjrbmk;", "tutorialPopup", "Lm22/dxjokdxxww;", "yadqdtsiqt", "rlfsiqarku", "()Lm22/dxjokdxxww;", "tutorialOptionPopup", "iozdgvuglv", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScanGoCartFragment extends Hilt_ScanGoCartFragment<ru.myspar.scango.impl.screens.cart.presentation.wkgbmnqykc, ru.myspar.scango.impl.screens.cart.presentation.ppxfxbqfkf, ru.myspar.scango.impl.screens.cart.presentation.eablkybsjg> implements e40.iobyxmoadg {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx tutorialPopup;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    public lx1.iobyxmoadg purchasesFeatureApi;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    private final ys.ppxfxbqfkf binding;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    public d60.iobyxmoadg resourcesManager;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx binder;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx tutorialOptionPopup;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    private final zs.ppxfxbqfkf viewImpl;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f103365lmojexxdyd = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(ScanGoCartFragment.class, "viewImpl", "getViewImpl()Lru/myspar/scango/impl/screens/cart/presentation/ScanGoCartViewImpl;", 0)), cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(ScanGoCartFragment.class, "binding", "getBinding()Lru/myspar/scango/impl/databinding/FragmentScanGoCartBinding;", 0))};

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    public static final int f103366wwaezpbzkn = 8;

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f103374zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f103374zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f103374zdlpuopuiu.invoke();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f103375zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f103375zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f103375zdlpuopuiu).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: ru.myspar.scango.impl.screens.cart.presentation.ScanGoCartFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final ScanGoCartFragment iobyxmoadg() {
            return new ScanGoCartFragment();
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f103376yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f103377zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(tg.iobyxmoadg iobyxmoadgVar, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f103377zdlpuopuiu = iobyxmoadgVar;
            this.f103376yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f103377zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f103376yggfygwlhe);
            androidx.lifecycle.dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof androidx.lifecycle.dxjokdxxww ? (androidx.lifecycle.dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    public static final class nufgyqmvbu extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f103378yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f103379zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public nufgyqmvbu(Fragment fragment, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f103379zdlpuopuiu = fragment;
            this.f103378yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f103378yggfygwlhe);
            androidx.lifecycle.dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof androidx.lifecycle.dxjokdxxww ? (androidx.lifecycle.dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f103379zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* synthetic */ class ppxfxbqfkf extends vdvldrhtss implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final ppxfxbqfkf f103380zdlpuopuiu = new ppxfxbqfkf();

        ppxfxbqfkf() {
            super(1, k22.lqeggnwhkg.class, "bind", "bind(Landroid/view/View;)Lru/myspar/scango/impl/databinding/FragmentScanGoCartBinding;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final k22.lqeggnwhkg invoke(View p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return k22.lqeggnwhkg.iobyxmoadg(p13);
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f103381zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(Fragment fragment) {
            super(0);
            this.f103381zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f103381zdlpuopuiu;
        }
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f103382iobyxmoadg;

        static {
            int[] iArr = new int[o22.iobyxmoadg.values().length];
            try {
                iArr[o22.iobyxmoadg.CHANGE_PRODUCT_QUANTITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o22.iobyxmoadg.DELETE_PRODUCT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o22.iobyxmoadg.ORDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f103382iobyxmoadg = iArr;
        }
    }

    public ScanGoCartFragment() {
        super(s12.ppxfxbqfkf.fragment_scan_go_cart);
        gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new eablkybsjg(new wkgbmnqykc(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(iobyxmoadg.class), new gxszxtbevo(gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(null, gtknphoqwxVarIobyxmoadg), new nufgyqmvbu(this, gtknphoqwxVarIobyxmoadg));
        this.viewImpl = zs.wkgbmnqykc.iobyxmoadg(this, new tg.iobyxmoadg() { // from class: x22.wkgbmnqykc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanGoCartFragment.igdgnonuha(this.f121072zdlpuopuiu);
            }
        });
        this.binding = ys.iobyxmoadg.zoijcleaow(this, ppxfxbqfkf.f103380zdlpuopuiu);
        this.tutorialPopup = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: x22.eablkybsjg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanGoCartFragment.iwxlajgraz(this.f121058zdlpuopuiu);
            }
        });
        this.tutorialOptionPopup = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: x22.gxszxtbevo
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanGoCartFragment.uawqvzlxes(this.f121061zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn auzgnhcxok(ScanGoCartFragment scanGoCartFragment) {
        scanGoCartFragment.pkzmftpjix().jyumaefscl(ru.myspar.scango.impl.screens.cart.presentation.ppxfxbqfkf.wflxmlrfwp.f103419iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn bfopjjpdmp(ScanGoCartFragment scanGoCartFragment) {
        scanGoCartFragment.pkzmftpjix().jyumaefscl(ru.myspar.scango.impl.screens.cart.presentation.ppxfxbqfkf.wkgbmnqykc.f103420iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final m22.draadjrbmk czzsidtyhn() {
        return (m22.draadjrbmk) this.tutorialPopup.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn dvvnrvtcbc(ScanGoCartFragment scanGoCartFragment, o22.iobyxmoadg it) {
        zdlpuopuiu.btonecajqb(it, "it");
        scanGoCartFragment.pkzmftpjix().jyumaefscl(new ru.myspar.scango.impl.screens.cart.presentation.ppxfxbqfkf.draadjrbmk(it));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.scango.impl.screens.cart.presentation.gxszxtbevo igdgnonuha(ScanGoCartFragment scanGoCartFragment) {
        return new ru.myspar.scango.impl.screens.cart.presentation.gxszxtbevo(new istkbnxepw(scanGoCartFragment) { // from class: ru.myspar.scango.impl.screens.cart.presentation.ScanGoCartFragment.dxjokdxxww
            @Override // ah.draadjrbmk
            public Object get() {
                return ((ScanGoCartFragment) this.receiver).jztzpxfvev();
            }
        }, scanGoCartFragment.metgxyhuhe());
    }

    private final void ikoacuggdj() {
        jztzpxfvev().f53601nufgyqmvbu.iobyxmoadg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m22.draadjrbmk iwxlajgraz(final ScanGoCartFragment scanGoCartFragment) {
        Context contextRequireContext = scanGoCartFragment.requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        return new m22.draadjrbmk(contextRequireContext, new draadjrbmk() { // from class: x22.dxjokdxxww
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ScanGoCartFragment.dvvnrvtcbc(this.f121057zdlpuopuiu, (o22.iobyxmoadg) obj);
            }
        }, new tg.iobyxmoadg() { // from class: x22.btonecajqb
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanGoCartFragment.skhdrjzrfn(this.f121054zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn iyctptxqzt(ScanGoCartFragment scanGoCartFragment) {
        scanGoCartFragment.pkzmftpjix().jyumaefscl(ru.myspar.scango.impl.screens.cart.presentation.ppxfxbqfkf.zoijcleaow.f103421iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k22.lqeggnwhkg jztzpxfvev() {
        return (k22.lqeggnwhkg) this.binding.iobyxmoadg(this, f103365lmojexxdyd[1]);
    }

    private final void lrnfpwlwnk() {
        String string = getString(s12.wkgbmnqykc.scan_go_product_not_supported);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        nuxfzjnpeb(string);
    }

    private final void nuxfzjnpeb(String message) {
        Context contextRequireContext = requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        ((m22.lqeggnwhkg.iobyxmoadg) r12.iobyxmoadg.zoijcleaow(new m22.lqeggnwhkg.iobyxmoadg(contextRequireContext).dxjokdxxww(s12.wkgbmnqykc.scan_and_go_popup_warning_title).eablkybsjg(message), s12.wkgbmnqykc.scan_and_go_popup_positive_button_text, null, 2, null)).ppxfxbqfkf().show();
    }

    private final void oipsdeybqn() {
        lx1.iobyxmoadg iobyxmoadgVarXrmfcynszj = xrmfcynszj();
        Context contextRequireContext = requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        iobyxmoadgVarXrmfcynszj.iobyxmoadg(contextRequireContext, new tg.iobyxmoadg() { // from class: x22.nufgyqmvbu
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanGoCartFragment.bfopjjpdmp(this.f121066zdlpuopuiu);
            }
        }).show();
    }

    private final void opjhrmiecq() {
        Context contextRequireContext = requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        ((m22.lqeggnwhkg.iobyxmoadg) r12.iobyxmoadg.zoijcleaow(new m22.lqeggnwhkg.iobyxmoadg(contextRequireContext).dxjokdxxww(s12.wkgbmnqykc.scan_and_go_continue_session_dialog_title).wkgbmnqykc(s12.wkgbmnqykc.scan_and_go_continue_session_dialog_message), s12.wkgbmnqykc.scan_and_go_continue_session_dialog_positive_button_text, null, 2, null)).gxszxtbevo(s12.wkgbmnqykc.scan_and_go_continue_session_dialog_negative_button_text, new tg.iobyxmoadg() { // from class: x22.lqeggnwhkg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanGoCartFragment.iyctptxqzt(this.f121065zdlpuopuiu);
            }
        }).ppxfxbqfkf().show();
    }

    private final m22.dxjokdxxww rlfsiqarku() {
        return (m22.dxjokdxxww) this.tutorialOptionPopup.getValue();
    }

    private final void roivzttewh(int productId) {
        ScanGoWeightProductDialogFragment scanGoWeightProductDialogFragmentIobyxmoadg = ScanGoWeightProductDialogFragment.INSTANCE.iobyxmoadg(new ScanGoWeightProductDialogArgs(productId));
        FragmentManager childFragmentManager = getChildFragmentManager();
        zdlpuopuiu.dxjokdxxww(childFragmentManager, "getChildFragmentManager(...)");
        scanGoWeightProductDialogFragmentIobyxmoadg.ntlheqmsrt(childFragmentManager);
    }

    private final void sflfametgt(int productId) {
        ScanGoAmountProductDialogFragment scanGoAmountProductDialogFragmentIobyxmoadg = ScanGoAmountProductDialogFragment.INSTANCE.iobyxmoadg(new ScanGoAmountProductDialogArgs(productId));
        FragmentManager childFragmentManager = getChildFragmentManager();
        zdlpuopuiu.dxjokdxxww(childFragmentManager, "getChildFragmentManager(...)");
        scanGoAmountProductDialogFragmentIobyxmoadg.ntlheqmsrt(childFragmentManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn skhdrjzrfn(ScanGoCartFragment scanGoCartFragment) {
        scanGoCartFragment.ikoacuggdj();
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void tbqsvytpvh(List options) {
        czzsidtyhn().oxmwwwfdhm(options);
        m22.draadjrbmk draadjrbmkVarCzzsidtyhn = czzsidtyhn();
        MaterialButton btnScan = jztzpxfvev().f53604wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(btnScan, "btnScan");
        androidx.lifecycle.vdvldrhtss viewLifecycleOwner = getViewLifecycleOwner();
        zdlpuopuiu.dxjokdxxww(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        m22.zoijcleaow.gtknphoqwx(draadjrbmkVarCzzsidtyhn, btnScan, viewLifecycleOwner, null, 0, 12, null);
        jztzpxfvev().f53601nufgyqmvbu.gxszxtbevo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m22.dxjokdxxww uawqvzlxes(final ScanGoCartFragment scanGoCartFragment) {
        Context contextRequireContext = scanGoCartFragment.requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        return new m22.dxjokdxxww(contextRequireContext, new tg.iobyxmoadg() { // from class: x22.gtknphoqwx
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanGoCartFragment.auzgnhcxok(this.f121060zdlpuopuiu);
            }
        });
    }

    private final void vipkmwdibw(View... views) {
        jztzpxfvev().f53601nufgyqmvbu.setAccentViews(agtfadlqog.i(views));
    }

    private final void weqkydbzbr(ScanGoCartContentLayoutManager.iobyxmoadg productItem) {
        wflxmlrfwp wflxmlrfwpVarIobyxmoadg = productItem.iobyxmoadg();
        if (wflxmlrfwpVarIobyxmoadg != null) {
            rlfsiqarku().ojitshcjhn(o22.iobyxmoadg.DELETE_PRODUCT);
            m22.dxjokdxxww dxjokdxxwwVarRlfsiqarku = rlfsiqarku();
            ConstraintLayout root = wflxmlrfwpVarIobyxmoadg.getRoot();
            zdlpuopuiu.dxjokdxxww(root, "getRoot(...)");
            androidx.lifecycle.vdvldrhtss viewLifecycleOwner = getViewLifecycleOwner();
            zdlpuopuiu.dxjokdxxww(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            ConstraintLayout root2 = jztzpxfvev().getRoot();
            zdlpuopuiu.dxjokdxxww(root2, "getRoot(...)");
            dxjokdxxwwVarRlfsiqarku.draadjrbmk(root, viewLifecycleOwner, root2, s40.eablkybsjg.scan_and_go_tutorial_popup_default_top_margin);
            vipkmwdibw(wflxmlrfwpVarIobyxmoadg.getRoot());
        }
    }

    private final void ydmasvzmpa(o22.iobyxmoadg option, ScanGoCartContentLayoutManager.iobyxmoadg productItem) {
        int i13 = zoijcleaow.f103382iobyxmoadg[option.ordinal()];
        if (i13 == 1) {
            zfvoamnweg(productItem);
        } else if (i13 == 2) {
            weqkydbzbr(productItem);
        } else {
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            zeieaojujs(productItem);
        }
    }

    private final void zeieaojujs(ScanGoCartContentLayoutManager.iobyxmoadg productItem) {
        wflxmlrfwp wflxmlrfwpVarIobyxmoadg = productItem.iobyxmoadg();
        if (wflxmlrfwpVarIobyxmoadg != null) {
            rlfsiqarku().ojitshcjhn(o22.iobyxmoadg.ORDER);
            m22.dxjokdxxww dxjokdxxwwVarRlfsiqarku = rlfsiqarku();
            MaterialButton btnScan = jztzpxfvev().f53604wkgbmnqykc;
            zdlpuopuiu.dxjokdxxww(btnScan, "btnScan");
            androidx.lifecycle.vdvldrhtss viewLifecycleOwner = getViewLifecycleOwner();
            zdlpuopuiu.dxjokdxxww(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            m22.zoijcleaow.gtknphoqwx(dxjokdxxwwVarRlfsiqarku, btnScan, viewLifecycleOwner, null, s40.eablkybsjg.scan_and_go_tutorial_popup_order_option_bottom_margin, 4, null);
            vipkmwdibw(wflxmlrfwpVarIobyxmoadg.getRoot());
        }
    }

    private final void zfvoamnweg(ScanGoCartContentLayoutManager.iobyxmoadg productItem) {
        wflxmlrfwp wflxmlrfwpVarIobyxmoadg = productItem.iobyxmoadg();
        if (wflxmlrfwpVarIobyxmoadg != null) {
            rlfsiqarku().ojitshcjhn(o22.iobyxmoadg.CHANGE_PRODUCT_QUANTITY);
            m22.dxjokdxxww dxjokdxxwwVarRlfsiqarku = rlfsiqarku();
            ConstraintLayout root = wflxmlrfwpVarIobyxmoadg.getRoot();
            zdlpuopuiu.dxjokdxxww(root, "getRoot(...)");
            androidx.lifecycle.vdvldrhtss viewLifecycleOwner = getViewLifecycleOwner();
            zdlpuopuiu.dxjokdxxww(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            ConstraintLayout root2 = jztzpxfvev().getRoot();
            zdlpuopuiu.dxjokdxxww(root2, "getRoot(...)");
            dxjokdxxwwVarRlfsiqarku.draadjrbmk(root, viewLifecycleOwner, root2, s40.eablkybsjg.scan_and_go_tutorial_popup_default_top_margin);
            vipkmwdibw(wflxmlrfwpVarIobyxmoadg.getRoot());
        }
    }

    @Override // e40.iobyxmoadg
    public boolean gxszxtbevo() {
        if (rlfsiqarku().isShowing()) {
            rlfsiqarku().dismiss();
            return true;
        }
        if (czzsidtyhn().isShowing()) {
            czzsidtyhn().dismiss();
            return true;
        }
        pkzmftpjix().jyumaefscl(ru.myspar.scango.impl.screens.cart.presentation.ppxfxbqfkf.iobyxmoadg.f103415iobyxmoadg);
        return true;
    }

    public final d60.iobyxmoadg metgxyhuhe() {
        d60.iobyxmoadg iobyxmoadgVar = this.resourcesManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("resourcesManager");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: okpsazkaxt, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg pkzmftpjix() {
        return (iobyxmoadg) this.binder.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: uwvvkdfqfp, reason: merged with bridge method [inline-methods] */
    public ru.myspar.scango.impl.screens.cart.presentation.gxszxtbevo hcddaimhww() {
        return (ru.myspar.scango.impl.screens.cart.presentation.gxszxtbevo) this.viewImpl.iobyxmoadg(this, f103365lmojexxdyd[0]);
    }

    public final lx1.iobyxmoadg xrmfcynszj() {
        lx1.iobyxmoadg iobyxmoadgVar = this.purchasesFeatureApi;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("purchasesFeatureApi");
        return null;
    }

    @Override // ru.myspar.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: yfnezrywwk, reason: merged with bridge method [inline-methods] */
    public void jpowsppfya(ru.myspar.scango.impl.screens.cart.presentation.eablkybsjg uiLabel) {
        zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
        if (uiLabel instanceof ru.myspar.scango.impl.screens.cart.presentation.eablkybsjg.gxszxtbevo) {
            lmojexxdyd(((ru.myspar.scango.impl.screens.cart.presentation.eablkybsjg.gxszxtbevo) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.scango.impl.screens.cart.presentation.eablkybsjg.lqeggnwhkg) {
            lrnfpwlwnk();
            return;
        }
        if (uiLabel instanceof ru.myspar.scango.impl.screens.cart.presentation.eablkybsjg.C2506eablkybsjg) {
            opjhrmiecq();
            return;
        }
        if (uiLabel instanceof ru.myspar.scango.impl.screens.cart.presentation.eablkybsjg.iobyxmoadg) {
            ikoacuggdj();
            return;
        }
        if (uiLabel instanceof ru.myspar.scango.impl.screens.cart.presentation.eablkybsjg.nufgyqmvbu) {
            nuxfzjnpeb(((ru.myspar.scango.impl.screens.cart.presentation.eablkybsjg.nufgyqmvbu) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.scango.impl.screens.cart.presentation.eablkybsjg.wkgbmnqykc) {
            oipsdeybqn();
            return;
        }
        if (uiLabel instanceof ru.myspar.scango.impl.screens.cart.presentation.eablkybsjg.ppxfxbqfkf) {
            sflfametgt(((ru.myspar.scango.impl.screens.cart.presentation.eablkybsjg.ppxfxbqfkf) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.scango.impl.screens.cart.presentation.eablkybsjg.btonecajqb) {
            roivzttewh(((ru.myspar.scango.impl.screens.cart.presentation.eablkybsjg.btonecajqb) uiLabel).iobyxmoadg());
        } else if (uiLabel instanceof ru.myspar.scango.impl.screens.cart.presentation.eablkybsjg.dxjokdxxww) {
            tbqsvytpvh(((ru.myspar.scango.impl.screens.cart.presentation.eablkybsjg.dxjokdxxww) uiLabel).iobyxmoadg());
        } else {
            if (!(uiLabel instanceof ru.myspar.scango.impl.screens.cart.presentation.eablkybsjg.zoijcleaow)) {
                throw new NoWhenBranchMatchedException();
            }
            ydmasvzmpa(((ru.myspar.scango.impl.screens.cart.presentation.eablkybsjg.zoijcleaow) uiLabel).iobyxmoadg(), hcddaimhww().zdlpuopuiu());
        }
    }
}
