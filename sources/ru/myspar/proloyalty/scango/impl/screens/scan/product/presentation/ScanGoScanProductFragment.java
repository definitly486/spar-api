package ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.jpowsppfya;
import androidx.fragment.app.stevsuqkhv;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.lmojexxdyd;
import androidx.lifecycle.ntlheqmsrt;
import androidx.lifecycle.oxmwwwfdhm;
import androidx.lifecycle.ribwqtqdhb;
import com.google.android.material.textview.MaterialTextView;
import gg.wwaezpbzkn;
import jp1.cqumvgiudr;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.yadqdtsiqt;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.legacy.presentation.view.ScanWindowView;
import ru.myspar.proloyalty.scango.api.model.ScanGoAmountProductPartialArgs;
import ru.myspar.proloyalty.scango.api.model.ScanGoWeightProductPartialArgs;
import ru.myspar.proloyalty.scango.impl.component.domain.model.product.ScanGoScanProductPayload;
import ru.myspar.proloyalty.scango.impl.screens.amountproduct.partial.presentation.ScanGoAmountProductPartialFragment;
import ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.ScanGoScanProductFragment;
import ru.myspar.proloyalty.scango.impl.screens.weightproduct.partial.presentation.ScanGoWeightProductPartialFragment;
import sj.wypolnanlu;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u007f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0080\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u0004J\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0018\u001a\u00020\t2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u0004J\u000f\u0010\u001b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001b\u0010\u0004J\u000f\u0010\u001c\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001c\u0010\u0004J\u0017\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010%\u001a\u00020\t2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\tH\u0002¢\u0006\u0004\b'\u0010\u0004J\u000f\u0010(\u001a\u00020\tH\u0002¢\u0006\u0004\b(\u0010\u0004J\u000f\u0010)\u001a\u00020\tH\u0002¢\u0006\u0004\b)\u0010\u0004J\u0017\u0010,\u001a\u00020\t2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\t2\u0006\u0010.\u001a\u00020*H\u0002¢\u0006\u0004\b/\u0010-J\u000f\u00100\u001a\u00020\tH\u0002¢\u0006\u0004\b0\u0010\u0004J\u000f\u00101\u001a\u00020\tH\u0002¢\u0006\u0004\b1\u0010\u0004J\u000f\u00102\u001a\u00020\tH\u0002¢\u0006\u0004\b2\u0010\u0004J\u000f\u00103\u001a\u00020\tH\u0002¢\u0006\u0004\b3\u0010\u0004J\u0017\u00104\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b4\u0010\u0019J\u000f\u00105\u001a\u00020\tH\u0002¢\u0006\u0004\b5\u0010\u0004J\u000f\u00106\u001a\u00020\tH\u0002¢\u0006\u0004\b6\u0010\u0004J\u000f\u00107\u001a\u00020\tH\u0002¢\u0006\u0004\b7\u0010\u0004J\u0017\u00108\u001a\u00020\t2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\t2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b:\u00109J\u000f\u0010;\u001a\u00020\tH\u0002¢\u0006\u0004\b;\u0010\u0004J\u0017\u0010<\u001a\u00020\t2\u0006\u0010.\u001a\u00020*H\u0002¢\u0006\u0004\b<\u0010-J\u000f\u0010=\u001a\u00020\tH\u0002¢\u0006\u0004\b=\u0010\u0004J'\u0010B\u001a\u00020\t2\u0006\u0010?\u001a\u00020>2\u0006\u0010@\u001a\u00020\u00162\u0006\u0010A\u001a\u00020*H\u0002¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020*H\u0002¢\u0006\u0004\bD\u0010ER\"\u0010M\u001a\u00020F8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010U\u001a\u00020N8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010]\u001a\u00020V8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u001b\u0010b\u001a\u00020\u00028TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u001b\u0010h\u001a\u00020c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR\u001b\u0010m\u001a\u00020i8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bj\u0010_\u001a\u0004\bk\u0010lR\u0014\u0010q\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u001a\u0010u\u001a\b\u0012\u0004\u0012\u00020\u00130r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u001b\u0010z\u001a\u00020v8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bw\u0010_\u001a\u0004\bx\u0010yR\u001b\u0010~\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b{\u0010\u0015*\u0004\b|\u0010}¨\u0006\u0081\u0001"}, d2 = {"Lru/myspar/proloyalty/scango/impl/screens/scan/product/presentation/ScanGoScanProductFragment;", "Lru/myspar/proloyalty/scango/impl/component/presentation/BaseScanGoMvvmFragment;", "Lru/myspar/proloyalty/scango/impl/screens/scan/product/presentation/wkgbmnqykc;", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lgg/wwaezpbzkn;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onPause", "onResume", "onDestroyView", "Lru/myspar/proloyalty/scango/impl/screens/scan/product/presentation/ppxfxbqfkf;", "uiLabel", "roivzttewh", "(Lru/myspar/proloyalty/scango/impl/screens/scan/product/presentation/ppxfxbqfkf;)V", "Lwp1/ojitshcjhn;", "uawqvzlxes", "()Lwp1/ojitshcjhn;", "", "message", "l", "(Ljava/lang/String;)V", "zfvoamnweg", "sflfametgt", "ydmasvzmpa", "Ljp1/cqumvgiudr;", "uiState", "tbqsvytpvh", "(Ljp1/cqumvgiudr;)V", "Lco1/zoijcleaow;", "cartState", "", "productId", "ezmngbhpjk", "(Lco1/zoijcleaow;I)V", "s", "jrbgnlbqoe", "mhtqkkgtqm", "", "isVisible", "yzdjzghtvl", "(Z)V", "isEnabled", "rhgxfdycjh", "d", "c", "e", "i", "j", "h", "g", "f", "krqnebusok", "(I)V", "o", "u", "eslsurpljm", "r", "Lbo1/ppxfxbqfkf;", "scanGoProductType", "productBarcode", "isRemove", "n", "(Lbo1/ppxfxbqfkf;Ljava/lang/String;Z)V", "lxfrhoxuzk", "()Z", "Lwp1/zoijcleaow;", "lereixgezr", "Lwp1/zoijcleaow;", "bfopjjpdmp", "()Lwp1/zoijcleaow;", "setBarcodeAnalyzerFactory", "(Lwp1/zoijcleaow;)V", "barcodeAnalyzerFactory", "Ljp1/iobyxmoadg;", "pmvmpeiblj", "Ljp1/iobyxmoadg;", "oipsdeybqn", "()Ljp1/iobyxmoadg;", "setAssistedFactory", "(Ljp1/iobyxmoadg;)V", "assistedFactory", "Lz21/iobyxmoadg;", "zynmafqrjb", "Lz21/iobyxmoadg;", "zeieaojujs", "()Lz21/iobyxmoadg;", "setSnackbarManager", "(Lz21/iobyxmoadg;)V", "snackbarManager", "istkbnxepw", "Lgg/gtknphoqwx;", "nuxfzjnpeb", "()Lru/myspar/proloyalty/scango/impl/screens/scan/product/presentation/wkgbmnqykc;", "viewModel", "Lgo1/dxjokdxxww;", "cdpycssgdh", "Lsr0/ppxfxbqfkf;", "opjhrmiecq", "()Lgo1/dxjokdxxww;", "binding", "Lru/myspar/proloyalty/scango/impl/component/domain/model/product/ScanGoScanProductPayload;", "yadqdtsiqt", "iyctptxqzt", "()Lru/myspar/proloyalty/scango/impl/component/domain/model/product/ScanGoScanProductPayload;", "payload", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "iozdgvuglv", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onChangeKeyboardCallback", "Lac1/wkgbmnqykc;", "lmojexxdyd", "Lac1/wkgbmnqykc;", "scanSessionDelegate", "Lwp1/rgvfuqvkyq;", "wwaezpbzkn", "weqkydbzbr", "()Lwp1/rgvfuqvkyq;", "scanBindingArea", "lrnfpwlwnk", "getScanSession$delegate", "(Lru/myspar/proloyalty/scango/impl/screens/scan/product/presentation/ScanGoScanProductFragment;)Ljava/lang/Object;", "scanSession", "ylkuphrtab", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScanGoScanProductFragment extends Hilt_ScanGoScanProductFragment<ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.wkgbmnqykc> {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata */
    private final sr0.ppxfxbqfkf binding;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata */
    private final ViewTreeObserver.OnGlobalLayoutListener onChangeKeyboardCallback;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    private final gg.gtknphoqwx viewModel;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    public wp1.zoijcleaow barcodeAnalyzerFactory;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata */
    private final ac1.wkgbmnqykc scanSessionDelegate;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    public jp1.iobyxmoadg assistedFactory;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata */
    private final gg.gtknphoqwx scanBindingArea;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata */
    private final gg.gtknphoqwx payload;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    public z21.iobyxmoadg snackbarManager;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f100923pkzmftpjix = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(ScanGoScanProductFragment.class, "binding", "getBinding()Lru/myspar/proloyalty/scango/impl/databinding/FragmentScanGoScanProductProloyaltyBinding;", 0))};

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    public static final int f100922hcddaimhww = 8;

    public static final class agtfadlqog extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f100934zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public agtfadlqog(gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f100934zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f100934zdlpuopuiu).getViewModelStore();
        }
    }

    /* synthetic */ class btonecajqb extends vdvldrhtss implements tg.iobyxmoadg {
        btonecajqb(Object obj) {
            super(0, obj, ScanGoScanProductFragment.class, "initScanSession", "initScanSession()Lru/myspar/proloyalty/services/barcode_analyzer/api/ScanSession;", 0);
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final wp1.ojitshcjhn invoke() {
            return ((ScanGoScanProductFragment) this.receiver).uawqvzlxes();
        }
    }

    public static final class draadjrbmk extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f100935zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public draadjrbmk(Fragment fragment) {
            super(0);
            this.f100935zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f100935zdlpuopuiu;
        }
    }

    public static final class dxjokdxxww implements TextWatcher {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ go1.dxjokdxxww f100936zdlpuopuiu;

        public dxjokdxxww(go1.dxjokdxxww dxjokdxxwwVar) {
            this.f100936zdlpuopuiu = dxjokdxxwwVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
            MaterialTextView tvQrErrorMessage = this.f100936zdlpuopuiu.f38014draadjrbmk;
            zdlpuopuiu.dxjokdxxww(tvQrErrorMessage, "tvQrErrorMessage");
            tvQrErrorMessage.setVisibility(8);
        }
    }

    public static final class eablkybsjg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ ScanGoScanProductFragment f100937iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.gtknphoqwx.zoijcleaow f100938jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ Fragment f100939yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f100940zdlpuopuiu;

        public static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ ScanGoScanProductFragment f100941jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private /* synthetic */ Object f100942yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f100943zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar, ScanGoScanProductFragment scanGoScanProductFragment) {
                super(2, gxszxtbevoVar);
                this.f100941jyumaefscl = scanGoScanProductFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar, this.f100941jyumaefscl);
                iobyxmoadgVar.f100942yggfygwlhe = obj;
                return iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f100943zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    sj.lqeggnwhkg lqeggnwhkgVarDraadjrbmk = this.f100941jyumaefscl.wwaezpbzkn().draadjrbmk();
                    lqeggnwhkg lqeggnwhkgVar = this.f100941jyumaefscl.new lqeggnwhkg();
                    this.f100943zdlpuopuiu = 1;
                    if (lqeggnwhkgVarDraadjrbmk.collect(lqeggnwhkgVar, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(Fragment fragment, androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar, ScanGoScanProductFragment scanGoScanProductFragment) {
            super(2, gxszxtbevoVar);
            this.f100939yggfygwlhe = fragment;
            this.f100938jyumaefscl = zoijcleaowVar;
            this.f100937iwizpuwonk = scanGoScanProductFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new eablkybsjg(this.f100939yggfygwlhe, this.f100938jyumaefscl, gxszxtbevoVar, this.f100937iwizpuwonk);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f100940zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                androidx.lifecycle.gtknphoqwx lifecycle = this.f100939yggfygwlhe.getViewLifecycleOwner().getLifecycle();
                androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = this.f100938jyumaefscl;
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(null, this.f100937iwizpuwonk);
                this.f100940zdlpuopuiu = 1;
                if (lmojexxdyd.iobyxmoadg(lifecycle, zoijcleaowVar, iobyxmoadgVar, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((eablkybsjg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class gtknphoqwx implements yo1.wkgbmnqykc.zoijcleaow {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ bo1.ppxfxbqfkf f100945ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ String f100946zoijcleaow;

        gtknphoqwx(String str, bo1.ppxfxbqfkf ppxfxbqfkfVar) {
            this.f100946zoijcleaow = str;
            this.f100945ppxfxbqfkf = ppxfxbqfkfVar;
        }

        @Override // yo1.wkgbmnqykc.zoijcleaow
        public void iobyxmoadg() {
            ScanGoScanProductFragment.this.wwaezpbzkn().vipkmwdibw(new ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.zoijcleaow.iobyxmoadg(this.f100946zoijcleaow, this.f100945ppxfxbqfkf));
        }

        @Override // yo1.wkgbmnqykc.zoijcleaow
        public void zoijcleaow() {
            ScanGoScanProductFragment.this.wwaezpbzkn().vipkmwdibw(new ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.zoijcleaow.nufgyqmvbu(this.f100945ppxfxbqfkf, this.f100946zoijcleaow));
        }
    }

    /* synthetic */ class gxszxtbevo implements sj.nufgyqmvbu, kotlin.jvm.internal.agtfadlqog {
        gxszxtbevo() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof sj.nufgyqmvbu) && (obj instanceof kotlin.jvm.internal.agtfadlqog)) {
                return zdlpuopuiu.eablkybsjg(zoijcleaow(), ((kotlin.jvm.internal.agtfadlqog) obj).zoijcleaow());
            }
            return false;
        }

        public final int hashCode() {
            return zoijcleaow().hashCode();
        }

        @Override // sj.nufgyqmvbu
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public final Object emit(cqumvgiudr cqumvgiudrVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objIpoelvxyzq = ScanGoScanProductFragment.ipoelvxyzq(ScanGoScanProductFragment.this, cqumvgiudrVar, gxszxtbevoVar);
            return objIpoelvxyzq == mg.zoijcleaow.gxszxtbevo() ? objIpoelvxyzq : wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // kotlin.jvm.internal.agtfadlqog
        public final gg.dxjokdxxww zoijcleaow() {
            return new kotlin.jvm.internal.iobyxmoadg(2, ScanGoScanProductFragment.this, ScanGoScanProductFragment.class, "handleState", "handleState(Lru/myspar/proloyalty/scango/impl/screens/scan/product/presentation/ScanGoScanProductView$Model;)V", 4);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.ScanGoScanProductFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final ScanGoScanProductFragment iobyxmoadg(ScanGoScanProductPayload payload) {
            zdlpuopuiu.btonecajqb(payload, "payload");
            ScanGoScanProductFragment scanGoScanProductFragment = new ScanGoScanProductFragment();
            scanGoScanProductFragment.setArguments(q1.ppxfxbqfkf.zoijcleaow(gg.cqumvgiudr.iobyxmoadg("payload", payload)));
            return scanGoScanProductFragment;
        }

        private Companion() {
        }
    }

    /* synthetic */ class lqeggnwhkg implements sj.nufgyqmvbu, kotlin.jvm.internal.agtfadlqog {
        lqeggnwhkg() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof sj.nufgyqmvbu) && (obj instanceof kotlin.jvm.internal.agtfadlqog)) {
                return zdlpuopuiu.eablkybsjg(zoijcleaow(), ((kotlin.jvm.internal.agtfadlqog) obj).zoijcleaow());
            }
            return false;
        }

        public final int hashCode() {
            return zoijcleaow().hashCode();
        }

        @Override // sj.nufgyqmvbu
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public final Object emit(ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.ppxfxbqfkf ppxfxbqfkfVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objGrlcpdaxtj = ScanGoScanProductFragment.grlcpdaxtj(ScanGoScanProductFragment.this, ppxfxbqfkfVar, gxszxtbevoVar);
            return objGrlcpdaxtj == mg.zoijcleaow.gxszxtbevo() ? objGrlcpdaxtj : wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // kotlin.jvm.internal.agtfadlqog
        public final gg.dxjokdxxww zoijcleaow() {
            return new kotlin.jvm.internal.iobyxmoadg(2, ScanGoScanProductFragment.this, ScanGoScanProductFragment.class, "handleUiLabel", "handleUiLabel(Lru/myspar/proloyalty/scango/impl/screens/scan/product/presentation/ScanGoScanProductView$UiLabel;)V", 4);
        }
    }

    public static final class nufgyqmvbu implements TextWatcher {
        public nufgyqmvbu() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.wkgbmnqykc wkgbmnqykcVarWwaezpbzkn = ScanGoScanProductFragment.this.wwaezpbzkn();
            String string = editable != null ? editable.toString() : null;
            if (string == null) {
                string = "";
            }
            wkgbmnqykcVarWwaezpbzkn.vipkmwdibw(new ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.zoijcleaow.C2434zoijcleaow(string));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
        }
    }

    public static final class ojitshcjhn extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f100950yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f100951zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ojitshcjhn(tg.iobyxmoadg iobyxmoadgVar, gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f100951zdlpuopuiu = iobyxmoadgVar;
            this.f100950yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f100951zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f100950yggfygwlhe);
            androidx.lifecycle.dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof androidx.lifecycle.dxjokdxxww ? (androidx.lifecycle.dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    /* synthetic */ class ppxfxbqfkf extends vdvldrhtss implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final ppxfxbqfkf f100952zdlpuopuiu = new ppxfxbqfkf();

        ppxfxbqfkf() {
            super(1, go1.dxjokdxxww.class, "bind", "bind(Landroid/view/View;)Lru/myspar/proloyalty/scango/impl/databinding/FragmentScanGoScanProductProloyaltyBinding;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final go1.dxjokdxxww invoke(View p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return go1.dxjokdxxww.iobyxmoadg(p13);
        }
    }

    public static final class rgvfuqvkyq implements crxdokpmqz.ppxfxbqfkf {
        public rgvfuqvkyq() {
        }

        @Override // androidx.lifecycle.crxdokpmqz.ppxfxbqfkf
        public ntlheqmsrt create(Class modelClass) {
            zdlpuopuiu.btonecajqb(modelClass, "modelClass");
            ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.wkgbmnqykc wkgbmnqykcVarIobyxmoadg = ScanGoScanProductFragment.this.oipsdeybqn().iobyxmoadg(ScanGoScanProductFragment.this.iyctptxqzt());
            zdlpuopuiu.nufgyqmvbu(wkgbmnqykcVarIobyxmoadg, "null cannot be cast to non-null type T of ru.myspar.proloyalty.legacy.presentation.ext.ViewModelExtKt.viewModelProviderFactoryOf.<no name provided>.create");
            return wkgbmnqykcVarIobyxmoadg;
        }
    }

    public static final class wflxmlrfwp extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f100954zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wflxmlrfwp(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f100954zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f100954zdlpuopuiu.invoke();
        }
    }

    public static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ ScanGoScanProductFragment f100955iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.gtknphoqwx.zoijcleaow f100956jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ Fragment f100957yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f100958zdlpuopuiu;

        public static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ ScanGoScanProductFragment f100959jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private /* synthetic */ Object f100960yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f100961zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar, ScanGoScanProductFragment scanGoScanProductFragment) {
                super(2, gxszxtbevoVar);
                this.f100959jyumaefscl = scanGoScanProductFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar, this.f100959jyumaefscl);
                iobyxmoadgVar.f100960yggfygwlhe = obj;
                return iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f100961zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    wypolnanlu state = this.f100959jyumaefscl.wwaezpbzkn().getState();
                    gxszxtbevo gxszxtbevoVar = this.f100959jyumaefscl.new gxszxtbevo();
                    this.f100961zdlpuopuiu = 1;
                    if (state.collect(gxszxtbevoVar, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                throw new KotlinNothingValueException();
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(Fragment fragment, androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar, ScanGoScanProductFragment scanGoScanProductFragment) {
            super(2, gxszxtbevoVar);
            this.f100957yggfygwlhe = fragment;
            this.f100956jyumaefscl = zoijcleaowVar;
            this.f100955iwizpuwonk = scanGoScanProductFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new wkgbmnqykc(this.f100957yggfygwlhe, this.f100956jyumaefscl, gxszxtbevoVar, this.f100955iwizpuwonk);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f100958zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                androidx.lifecycle.gtknphoqwx lifecycle = this.f100957yggfygwlhe.getViewLifecycleOwner().getLifecycle();
                androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = this.f100956jyumaefscl;
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(null, this.f100955iwizpuwonk);
                this.f100958zdlpuopuiu = 1;
                if (lmojexxdyd.iobyxmoadg(lifecycle, zoijcleaowVar, iobyxmoadgVar, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((wkgbmnqykc) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f100962iobyxmoadg;

        static {
            int[] iArr = new int[co1.zoijcleaow.values().length];
            try {
                iArr[co1.zoijcleaow.EMPTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[co1.zoijcleaow.AMOUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[co1.zoijcleaow.WEIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[co1.zoijcleaow.CONTINUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f100962iobyxmoadg = iArr;
        }
    }

    public ScanGoScanProductFragment() {
        super(on1.ppxfxbqfkf.fragment_scan_go_scan_product_proloyalty);
        tg.iobyxmoadg iobyxmoadgVar = new tg.iobyxmoadg() { // from class: jp1.zoijcleaow
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanGoScanProductFragment.v(this.f51938zdlpuopuiu);
            }
        };
        gg.gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(gg.ojitshcjhn.NONE, new wflxmlrfwp(new draadjrbmk(this)));
        this.viewModel = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.wkgbmnqykc.class), new agtfadlqog(gtknphoqwxVarIobyxmoadg), new ojitshcjhn(null, gtknphoqwxVarIobyxmoadg), iobyxmoadgVar);
        this.binding = sr0.iobyxmoadg.zoijcleaow(this, ppxfxbqfkf.f100952zdlpuopuiu);
        this.payload = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: jp1.draadjrbmk
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanGoScanProductFragment.ixidwrxhsl(this.f51920zdlpuopuiu);
            }
        });
        this.onChangeKeyboardCallback = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: jp1.wflxmlrfwp
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                ScanGoScanProductFragment.wizcaqwiak(this.f51935zdlpuopuiu);
            }
        };
        this.scanSessionDelegate = ac1.wkgbmnqykc.f1543jyumaefscl.iobyxmoadg(new btonecajqb(this));
        this.scanBindingArea = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: jp1.agtfadlqog
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanGoScanProductFragment.fmlbqenlif(this.f51910zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn a(ScanGoScanProductFragment scanGoScanProductFragment) {
        scanGoScanProductFragment.wwaezpbzkn().vipkmwdibw(ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.zoijcleaow.lqeggnwhkg.f101005iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ageimvtcrz(ScanGoScanProductFragment scanGoScanProductFragment, View view) {
        scanGoScanProductFragment.wwaezpbzkn().vipkmwdibw(ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.zoijcleaow.lqeggnwhkg.f101005iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn auzgnhcxok(ScanGoScanProductFragment scanGoScanProductFragment, String it) {
        zdlpuopuiu.btonecajqb(it, "it");
        scanGoScanProductFragment.wwaezpbzkn().vipkmwdibw(new ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.zoijcleaow.ppxfxbqfkf(it));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn b(ScanGoScanProductFragment scanGoScanProductFragment) {
        scanGoScanProductFragment.wwaezpbzkn().vipkmwdibw(ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.zoijcleaow.agtfadlqog.f100996iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void c() {
        a31.iobyxmoadg.ppxfxbqfkf(zeieaojujs(), on1.wkgbmnqykc.proloyalty_camera_initialization_error, null, lr0.eablkybsjg.gxszxtbevo.NonFatal, 2, null);
    }

    private final void d() {
        a31.iobyxmoadg.ppxfxbqfkf(zeieaojujs(), on1.wkgbmnqykc.proloyalty_camera_not_found, null, lr0.eablkybsjg.gxszxtbevo.NonFatal, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn dvvnrvtcbc(ScanGoScanProductFragment scanGoScanProductFragment) {
        scanGoScanProductFragment.wwaezpbzkn().vipkmwdibw(ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.zoijcleaow.eablkybsjg.f101000iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void e() {
        a31.iobyxmoadg.ppxfxbqfkf(zeieaojujs(), on1.wkgbmnqykc.proloyalty_camera_permission_denied, null, lr0.eablkybsjg.gxszxtbevo.NonFatal, 2, null);
    }

    private final void eslsurpljm(boolean isEnabled) {
        AppCompatImageView appCompatImageView = opjhrmiecq().f38015dxjokdxxww;
        appCompatImageView.setEnabled(isEnabled);
        appCompatImageView.setClickable(isEnabled);
        appCompatImageView.setFocusable(isEnabled);
        appCompatImageView.setColorFilter(isEnabled ? -1 : -7829368);
    }

    private final void ezmngbhpjk(co1.zoijcleaow cartState, int productId) {
        ConstraintLayout root = opjhrmiecq().f38016eablkybsjg.getRoot();
        zdlpuopuiu.dxjokdxxww(root, "getRoot(...)");
        root.setVisibility(8);
        ConstraintLayout root2 = opjhrmiecq().f38022ppxfxbqfkf.getRoot();
        zdlpuopuiu.dxjokdxxww(root2, "getRoot(...)");
        root2.setVisibility(8);
        int i13 = zoijcleaow.f100962iobyxmoadg[cartState.ordinal()];
        if (i13 == 1) {
            g();
            return;
        }
        if (i13 == 2) {
            krqnebusok(productId);
        } else if (i13 == 3) {
            o(productId);
        } else {
            if (i13 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            f();
        }
    }

    private final void f() {
        FragmentContainerView flBottomFragmentContainer = opjhrmiecq().f38020lqeggnwhkg;
        zdlpuopuiu.dxjokdxxww(flBottomFragmentContainer, "flBottomFragmentContainer");
        flBottomFragmentContainer.setVisibility(4);
        ConstraintLayout root = opjhrmiecq().f38016eablkybsjg.getRoot();
        zdlpuopuiu.dxjokdxxww(root, "getRoot(...)");
        root.setVisibility(0);
        ConstraintLayout root2 = opjhrmiecq().f38022ppxfxbqfkf.getRoot();
        zdlpuopuiu.dxjokdxxww(root2, "getRoot(...)");
        root2.setVisibility(0);
        opjhrmiecq().f38016eablkybsjg.f38099zoijcleaow.setText(getString(on1.wkgbmnqykc.proloyalty_scan_go_continue_scan));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fiwbwshyhd(go1.dxjokdxxww dxjokdxxwwVar, ScanGoScanProductFragment scanGoScanProductFragment, View view) {
        Editable editableText = dxjokdxxwwVar.f38018gxszxtbevo.getEditableText();
        if (editableText != null) {
            editableText.clear();
        }
        scanGoScanProductFragment.sflfametgt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wp1.rgvfuqvkyq fmlbqenlif(ScanGoScanProductFragment scanGoScanProductFragment) {
        ScanWindowView scanWindowView = scanGoScanProductFragment.opjhrmiecq().f38017gtknphoqwx;
        zdlpuopuiu.lqeggnwhkg(scanWindowView);
        return new wp1.rgvfuqvkyq(p41.dxjokdxxww.ppxfxbqfkf(scanWindowView), scanWindowView.getWidth(), scanWindowView.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fyldjkxazc(ScanGoScanProductFragment scanGoScanProductFragment, View view) {
        scanGoScanProductFragment.wwaezpbzkn().vipkmwdibw(ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.zoijcleaow.ojitshcjhn.f101008iobyxmoadg);
    }

    private final void g() {
        FragmentContainerView flBottomFragmentContainer = opjhrmiecq().f38020lqeggnwhkg;
        zdlpuopuiu.dxjokdxxww(flBottomFragmentContainer, "flBottomFragmentContainer");
        flBottomFragmentContainer.setVisibility(4);
        ConstraintLayout root = opjhrmiecq().f38016eablkybsjg.getRoot();
        zdlpuopuiu.dxjokdxxww(root, "getRoot(...)");
        root.setVisibility(0);
        ConstraintLayout root2 = opjhrmiecq().f38022ppxfxbqfkf.getRoot();
        zdlpuopuiu.dxjokdxxww(root2, "getRoot(...)");
        root2.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object grlcpdaxtj(ScanGoScanProductFragment scanGoScanProductFragment, ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.ppxfxbqfkf ppxfxbqfkfVar, lg.gxszxtbevo gxszxtbevoVar) {
        scanGoScanProductFragment.roivzttewh(ppxfxbqfkfVar);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void h() {
        String string = getString(on1.wkgbmnqykc.proloyalty_scan_and_go_error_on_request);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        j(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hszhottldk(ScanGoScanProductFragment scanGoScanProductFragment, View view) {
        scanGoScanProductFragment.wwaezpbzkn().vipkmwdibw(ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.zoijcleaow.dxjokdxxww.f100999iobyxmoadg);
    }

    private final void i() {
        String string = getString(on1.wkgbmnqykc.proloyalty_scan_go_product_not_supported);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        j(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn igdgnonuha(ScanGoScanProductFragment scanGoScanProductFragment, boolean z13) {
        scanGoScanProductFragment.wwaezpbzkn().vipkmwdibw(new ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.zoijcleaow.btonecajqb(z13));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object ipoelvxyzq(ScanGoScanProductFragment scanGoScanProductFragment, cqumvgiudr cqumvgiudrVar, lg.gxszxtbevo gxszxtbevoVar) {
        scanGoScanProductFragment.tbqsvytpvh(cqumvgiudrVar);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn iwxlajgraz(ScanGoScanProductFragment scanGoScanProductFragment) {
        scanGoScanProductFragment.wwaezpbzkn().vipkmwdibw(ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.zoijcleaow.gxszxtbevo.f101002iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScanGoScanProductPayload ixidwrxhsl(ScanGoScanProductFragment scanGoScanProductFragment) {
        Parcelable parcelable = scanGoScanProductFragment.requireArguments().getParcelable("payload");
        zdlpuopuiu.lqeggnwhkg(parcelable);
        return (ScanGoScanProductPayload) parcelable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ScanGoScanProductPayload iyctptxqzt() {
        return (ScanGoScanProductPayload) this.payload.getValue();
    }

    private final void j(String message) {
        Context contextRequireContext = requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        new io1.lqeggnwhkg.iobyxmoadg(contextRequireContext).dxjokdxxww(on1.wkgbmnqykc.proloyalty_scan_and_go_popup_warning_title).eablkybsjg(message).iobyxmoadg(on1.wkgbmnqykc.proloyalty_scan_and_go_popup_positive_button_text, new tg.iobyxmoadg() { // from class: jp1.gxszxtbevo
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanGoScanProductFragment.k(this.f51924zdlpuopuiu);
            }
        }).ppxfxbqfkf().show();
    }

    private final void jrbgnlbqoe() {
        wp1.ojitshcjhn.pkzmftpjix(lrnfpwlwnk(), false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn k(ScanGoScanProductFragment scanGoScanProductFragment) {
        scanGoScanProductFragment.wwaezpbzkn().vipkmwdibw(ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.zoijcleaow.wflxmlrfwp.f101010iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void krqnebusok(int productId) {
        FragmentContainerView flBottomFragmentContainer = opjhrmiecq().f38020lqeggnwhkg;
        zdlpuopuiu.dxjokdxxww(flBottomFragmentContainer, "flBottomFragmentContainer");
        flBottomFragmentContainer.setVisibility(0);
        ScanGoAmountProductPartialFragment scanGoAmountProductPartialFragmentIobyxmoadg = ScanGoAmountProductPartialFragment.INSTANCE.iobyxmoadg(new ScanGoAmountProductPartialArgs(productId), new tg.iobyxmoadg() { // from class: jp1.zdlpuopuiu
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanGoScanProductFragment.a(this.f51937zdlpuopuiu);
            }
        }, new tg.iobyxmoadg() { // from class: jp1.ppxfxbqfkf
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanGoScanProductFragment.b(this.f51932zdlpuopuiu);
            }
        });
        jpowsppfya jpowsppfyaVarKcexrzcfyt = getChildFragmentManager().kcexrzcfyt();
        zdlpuopuiu.dxjokdxxww(jpowsppfyaVarKcexrzcfyt, "beginTransaction(...)");
        jpowsppfyaVarKcexrzcfyt.vdvldrhtss(on1.zoijcleaow.flBottomFragmentContainer, scanGoAmountProductPartialFragmentIobyxmoadg).dxjokdxxww();
    }

    private final void l(String message) {
        MaterialTextView materialTextView = opjhrmiecq().f38014draadjrbmk;
        if (message == null) {
            message = getString(on1.wkgbmnqykc.proloyalty_scan_and_go_error_product_not_found);
            zdlpuopuiu.dxjokdxxww(message, "getString(...)");
        }
        materialTextView.setText(message);
        MaterialTextView tvQrErrorMessage = opjhrmiecq().f38014draadjrbmk;
        zdlpuopuiu.dxjokdxxww(tvQrErrorMessage, "tvQrErrorMessage");
        tvQrErrorMessage.setVisibility(0);
    }

    private final wp1.ojitshcjhn lrnfpwlwnk() {
        return (wp1.ojitshcjhn) this.scanSessionDelegate.getValue();
    }

    private final boolean lxfrhoxuzk() {
        try {
            Object systemService = requireContext().getSystemService("input_method");
            zdlpuopuiu.nufgyqmvbu(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            Object objInvoke = InputMethodManager.class.getMethod("getInputMethodWindowVisibleHeight", null).invoke((InputMethodManager) systemService, null);
            zdlpuopuiu.nufgyqmvbu(objInvoke, "null cannot be cast to non-null type kotlin.Int");
            return ((Integer) objInvoke).intValue() > 0;
        } catch (Exception unused) {
            return false;
        }
    }

    static /* synthetic */ void m(ScanGoScanProductFragment scanGoScanProductFragment, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = null;
        }
        scanGoScanProductFragment.l(str);
    }

    private final void mhtqkkgtqm() {
        lrnfpwlwnk().lmojexxdyd();
    }

    private final void n(bo1.ppxfxbqfkf scanGoProductType, String productBarcode, boolean isRemove) {
        Context contextRequireContext = requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        new yo1.wkgbmnqykc(contextRequireContext, scanGoProductType, new gtknphoqwx(productBarcode, scanGoProductType), isRemove).show();
    }

    private final void o(int productId) {
        FragmentContainerView flBottomFragmentContainer = opjhrmiecq().f38020lqeggnwhkg;
        zdlpuopuiu.dxjokdxxww(flBottomFragmentContainer, "flBottomFragmentContainer");
        flBottomFragmentContainer.setVisibility(0);
        ScanGoWeightProductPartialFragment scanGoWeightProductPartialFragmentIobyxmoadg = ScanGoWeightProductPartialFragment.INSTANCE.iobyxmoadg(new ScanGoWeightProductPartialArgs(productId), new tg.iobyxmoadg() { // from class: jp1.wkgbmnqykc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanGoScanProductFragment.p(this.f51936zdlpuopuiu);
            }
        }, new tg.iobyxmoadg() { // from class: jp1.eablkybsjg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanGoScanProductFragment.q(this.f51922zdlpuopuiu);
            }
        });
        jpowsppfya jpowsppfyaVarKcexrzcfyt = getChildFragmentManager().kcexrzcfyt();
        zdlpuopuiu.dxjokdxxww(jpowsppfyaVarKcexrzcfyt, "beginTransaction(...)");
        jpowsppfyaVarKcexrzcfyt.vdvldrhtss(on1.zoijcleaow.flBottomFragmentContainer, scanGoWeightProductPartialFragmentIobyxmoadg).dxjokdxxww();
    }

    private final go1.dxjokdxxww opjhrmiecq() {
        return (go1.dxjokdxxww) this.binding.iobyxmoadg(this, f100923pkzmftpjix[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn p(ScanGoScanProductFragment scanGoScanProductFragment) {
        scanGoScanProductFragment.wwaezpbzkn().vipkmwdibw(ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.zoijcleaow.lqeggnwhkg.f101005iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn q(ScanGoScanProductFragment scanGoScanProductFragment) {
        scanGoScanProductFragment.wwaezpbzkn().vipkmwdibw(ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.zoijcleaow.agtfadlqog.f100996iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void r() {
        if (this.scanSessionDelegate.isInitialized()) {
            lrnfpwlwnk().hcddaimhww();
            this.scanSessionDelegate.iobyxmoadg();
        }
    }

    private final void rhgxfdycjh(boolean isEnabled) {
        opjhrmiecq().f38024wkgbmnqykc.setImageResource(isEnabled ? b31.gxszxtbevo.ic_flash_on : b31.gxszxtbevo.ic_flash_off);
    }

    private final void roivzttewh(ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.ppxfxbqfkf uiLabel) {
        if (uiLabel instanceof ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.agtfadlqog) {
            s();
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.C2432ppxfxbqfkf) {
            mhtqkkgtqm();
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.wkgbmnqykc) {
            jrbgnlbqoe();
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.ojitshcjhn) {
            u();
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.gxszxtbevo) {
            d();
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.eablkybsjg) {
            c();
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.lqeggnwhkg) {
            e();
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.btonecajqb) {
            i();
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.nufgyqmvbu) {
            h();
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.zoijcleaow) {
            zfvoamnweg();
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.gtknphoqwx) {
            j(((ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.gtknphoqwx) uiLabel).iobyxmoadg());
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.draadjrbmk) {
            m(this, null, 1, null);
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.dxjokdxxww) {
            l(((ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.dxjokdxxww) uiLabel).iobyxmoadg());
            return;
        }
        if (zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.iobyxmoadg.f100970iobyxmoadg)) {
            ydmasvzmpa();
        } else {
            if (!(uiLabel instanceof ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.wflxmlrfwp)) {
                throw new NoWhenBranchMatchedException();
            }
            ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.wflxmlrfwp wflxmlrfwpVar = (ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.ppxfxbqfkf.wflxmlrfwp) uiLabel;
            n(wflxmlrfwpVar.zoijcleaow(), wflxmlrfwpVar.iobyxmoadg(), wflxmlrfwpVar.ppxfxbqfkf());
        }
    }

    private final void s() {
        opjhrmiecq().getRoot().post(new Runnable() { // from class: jp1.kcexrzcfyt
            @Override // java.lang.Runnable
            public final void run() {
                ScanGoScanProductFragment.t(this.f51926zdlpuopuiu);
            }
        });
    }

    private final void sflfametgt() {
        AppCompatImageView ivClearField = opjhrmiecq().f38021nufgyqmvbu;
        zdlpuopuiu.dxjokdxxww(ivClearField, "ivClearField");
        ivClearField.setVisibility(8);
        AppCompatImageView ivSearchIcon = opjhrmiecq().f38015dxjokdxxww;
        zdlpuopuiu.dxjokdxxww(ivSearchIcon, "ivSearchIcon");
        ivSearchIcon.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn skhdrjzrfn(ScanGoScanProductFragment scanGoScanProductFragment, boolean z13) {
        scanGoScanProductFragment.wwaezpbzkn().vipkmwdibw(new ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.zoijcleaow.wkgbmnqykc(z13));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(ScanGoScanProductFragment scanGoScanProductFragment) {
        scanGoScanProductFragment.lrnfpwlwnk().jpowsppfya();
    }

    private final void tbqsvytpvh(cqumvgiudr uiState) {
        yzdjzghtvl(uiState.gxszxtbevo());
        rhgxfdycjh(uiState.eablkybsjg());
        eslsurpljm(uiState.wkgbmnqykc());
        ezmngbhpjk(uiState.nufgyqmvbu(), uiState.lqeggnwhkg());
    }

    private final void u() {
        lrnfpwlwnk().cllcsxoeiz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final wp1.ojitshcjhn uawqvzlxes() {
        PreviewView previewView = opjhrmiecq().f38013btonecajqb;
        zdlpuopuiu.dxjokdxxww(previewView, "previewView");
        return new wp1.ojitshcjhn(previewView, this, bfopjjpdmp(), weqkydbzbr(), null, wp1.wkgbmnqykc.iobyxmoadg.C3025iobyxmoadg.f120436iobyxmoadg, new tg.draadjrbmk() { // from class: jp1.lqeggnwhkg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ScanGoScanProductFragment.auzgnhcxok(this.f51927zdlpuopuiu, (String) obj);
            }
        }, new tg.iobyxmoadg() { // from class: jp1.nufgyqmvbu
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanGoScanProductFragment.iwxlajgraz(this.f51928zdlpuopuiu);
            }
        }, new tg.iobyxmoadg() { // from class: jp1.dxjokdxxww
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanGoScanProductFragment.dvvnrvtcbc(this.f51921zdlpuopuiu);
            }
        }, new tg.draadjrbmk() { // from class: jp1.btonecajqb
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ScanGoScanProductFragment.skhdrjzrfn(this.f51911zdlpuopuiu, ((Boolean) obj).booleanValue());
            }
        }, new tg.draadjrbmk() { // from class: jp1.gtknphoqwx
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ScanGoScanProductFragment.igdgnonuha(this.f51923zdlpuopuiu, ((Boolean) obj).booleanValue());
            }
        }, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final crxdokpmqz.ppxfxbqfkf v(ScanGoScanProductFragment scanGoScanProductFragment) {
        return scanGoScanProductFragment.new rgvfuqvkyq();
    }

    private final wp1.rgvfuqvkyq weqkydbzbr() {
        return (wp1.rgvfuqvkyq) this.scanBindingArea.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wizcaqwiak(ScanGoScanProductFragment scanGoScanProductFragment) {
        if (scanGoScanProductFragment.lxfrhoxuzk()) {
            scanGoScanProductFragment.wwaezpbzkn().vipkmwdibw(ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.zoijcleaow.draadjrbmk.f100998iobyxmoadg);
        } else {
            scanGoScanProductFragment.wwaezpbzkn().vipkmwdibw(ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.zoijcleaow.gtknphoqwx.f101001iobyxmoadg);
        }
    }

    private final void ydmasvzmpa() {
        Editable text = opjhrmiecq().f38018gxszxtbevo.getText();
        if (text != null) {
            text.clear();
        }
        MaterialTextView tvQrErrorMessage = opjhrmiecq().f38014draadjrbmk;
        zdlpuopuiu.dxjokdxxww(tvQrErrorMessage, "tvQrErrorMessage");
        tvQrErrorMessage.setVisibility(8);
        sflfametgt();
    }

    private final void yzdjzghtvl(boolean isVisible) {
        AppCompatImageButton btnToggleFlash = opjhrmiecq().f38024wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(btnToggleFlash, "btnToggleFlash");
        btnToggleFlash.setVisibility(!isVisible ? 4 : 0);
    }

    private final void zfvoamnweg() {
        AppCompatImageView ivClearField = opjhrmiecq().f38021nufgyqmvbu;
        zdlpuopuiu.dxjokdxxww(ivClearField, "ivClearField");
        ivClearField.setVisibility(0);
        AppCompatImageView ivSearchIcon = opjhrmiecq().f38015dxjokdxxww;
        zdlpuopuiu.dxjokdxxww(ivSearchIcon, "ivSearchIcon");
        ivSearchIcon.setVisibility(8);
    }

    public final wp1.zoijcleaow bfopjjpdmp() {
        wp1.zoijcleaow zoijcleaowVar = this.barcodeAnalyzerFactory;
        if (zoijcleaowVar != null) {
            return zoijcleaowVar;
        }
        zdlpuopuiu.pmvmpeiblj("barcodeAnalyzerFactory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvvm.BaseMvvmFragment
    /* JADX INFO: renamed from: nuxfzjnpeb, reason: merged with bridge method [inline-methods] */
    public ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.wkgbmnqykc wwaezpbzkn() {
        return (ru.myspar.proloyalty.scango.impl.screens.scan.product.presentation.wkgbmnqykc) this.viewModel.getValue();
    }

    public final jp1.iobyxmoadg oipsdeybqn() {
        jp1.iobyxmoadg iobyxmoadgVar = this.assistedFactory;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("assistedFactory");
        return null;
    }

    @Override // ru.myspar.proloyalty.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        r();
        super.onDestroyView();
    }

    @Override // ru.myspar.proloyalty.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        View view = getView();
        zdlpuopuiu.nufgyqmvbu(view, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) view).getViewTreeObserver().removeOnGlobalLayoutListener(this.onChangeKeyboardCallback);
    }

    @Override // ru.myspar.proloyalty.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        View view = getView();
        zdlpuopuiu.nufgyqmvbu(view, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) view).getViewTreeObserver().addOnGlobalLayoutListener(this.onChangeKeyboardCallback);
    }

    @Override // ru.myspar.proloyalty.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        zdlpuopuiu.btonecajqb(view, "view");
        super.onViewCreated(view, savedInstanceState);
        final go1.dxjokdxxww dxjokdxxwwVarOpjhrmiecq = opjhrmiecq();
        dxjokdxxwwVarOpjhrmiecq.f38022ppxfxbqfkf.f38086zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: jp1.ojitshcjhn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ScanGoScanProductFragment.ageimvtcrz(this.f51929zdlpuopuiu, view2);
            }
        });
        dxjokdxxwwVarOpjhrmiecq.f38024wkgbmnqykc.setOnClickListener(new View.OnClickListener() { // from class: jp1.rgvfuqvkyq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ScanGoScanProductFragment.fyldjkxazc(this.f51933zdlpuopuiu, view2);
            }
        });
        AppCompatEditText etProductBarcode = dxjokdxxwwVarOpjhrmiecq.f38018gxszxtbevo;
        zdlpuopuiu.dxjokdxxww(etProductBarcode, "etProductBarcode");
        etProductBarcode.addTextChangedListener(new nufgyqmvbu());
        AppCompatEditText etProductBarcode2 = dxjokdxxwwVarOpjhrmiecq.f38018gxszxtbevo;
        zdlpuopuiu.dxjokdxxww(etProductBarcode2, "etProductBarcode");
        etProductBarcode2.addTextChangedListener(new dxjokdxxww(dxjokdxxwwVarOpjhrmiecq));
        dxjokdxxwwVarOpjhrmiecq.f38015dxjokdxxww.setOnClickListener(new View.OnClickListener() { // from class: jp1.vdvldrhtss
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ScanGoScanProductFragment.hszhottldk(this.f51934zdlpuopuiu, view2);
            }
        });
        dxjokdxxwwVarOpjhrmiecq.f38021nufgyqmvbu.setOnClickListener(new View.OnClickListener() { // from class: jp1.oxmwwwfdhm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ScanGoScanProductFragment.fiwbwshyhd(dxjokdxxwwVarOpjhrmiecq, this, view2);
            }
        });
        g();
        androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = androidx.lifecycle.gtknphoqwx.zoijcleaow.STARTED;
        androidx.lifecycle.vdvldrhtss viewLifecycleOwner = getViewLifecycleOwner();
        zdlpuopuiu.dxjokdxxww(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(viewLifecycleOwner), null, null, new wkgbmnqykc(this, zoijcleaowVar, null, this), 3, null);
        androidx.lifecycle.vdvldrhtss viewLifecycleOwner2 = getViewLifecycleOwner();
        zdlpuopuiu.dxjokdxxww(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(viewLifecycleOwner2), null, null, new eablkybsjg(this, zoijcleaowVar, null, this), 3, null);
    }

    public final z21.iobyxmoadg zeieaojujs() {
        z21.iobyxmoadg iobyxmoadgVar = this.snackbarManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("snackbarManager");
        return null;
    }
}
