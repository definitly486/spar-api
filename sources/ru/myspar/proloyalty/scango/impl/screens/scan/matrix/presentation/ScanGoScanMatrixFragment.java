package ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.camera.view.PreviewView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.stevsuqkhv;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.lmojexxdyd;
import androidx.lifecycle.ntlheqmsrt;
import androidx.lifecycle.oxmwwwfdhm;
import androidx.lifecycle.ribwqtqdhb;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import gg.cqumvgiudr;
import gg.ojitshcjhn;
import gg.wwaezpbzkn;
import hp1.vdvldrhtss;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.jpowsppfya;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.yadqdtsiqt;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.legacy.presentation.view.ScanWindowView;
import ru.myspar.proloyalty.scango.impl.component.domain.model.product.ScanGoScanMatrixPayload;
import ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.ScanGoScanMatrixFragment;
import sj.wypolnanlu;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 c2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001dB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0005J\u000f\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0005J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001b\u0010\u0005J\u000f\u0010\u001c\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001c\u0010\u0005J\u000f\u0010\u001d\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001d\u0010\u0005J\u000f\u0010\u001e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001e\u0010\u0005J\u000f\u0010\u001f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001f\u0010\u0005J\u0017\u0010 \u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b \u0010\u000eJ\u000f\u0010!\u001a\u00020\bH\u0002¢\u0006\u0004\b!\u0010\u0005J\u000f\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J!\u0010)\u001a\u00020\b2\u0006\u0010&\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\bH\u0016¢\u0006\u0004\b+\u0010\u0005J\u000f\u0010,\u001a\u00020\u0015H\u0016¢\u0006\u0004\b,\u0010-R\"\u00105\u001a\u00020.8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010=\u001a\u0002068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010E\u001a\u00020>8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001b\u0010J\u001a\u00020\u00028TX\u0094\u0084\u0002¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u001b\u0010P\u001a\u00020K8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u001b\u0010U\u001a\u00020Q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010G\u001a\u0004\bS\u0010TR\u0016\u0010X\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u001b\u0010]\u001a\u00020Y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010G\u001a\u0004\b[\u0010\\R\u001b\u0010b\u001a\u00020^8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b_\u0010G\u001a\u0004\b`\u0010a¨\u0006e"}, d2 = {"Lru/myspar/proloyalty/scango/impl/screens/scan/matrix/presentation/ScanGoScanMatrixFragment;", "Lru/myspar/proloyalty/scango/impl/component/presentation/BaseScanGoMvvmFragment;", "Lru/myspar/proloyalty/scango/impl/screens/scan/matrix/presentation/wkgbmnqykc;", "Lj21/iobyxmoadg;", "<init>", "()V", "Lru/myspar/proloyalty/scango/impl/screens/scan/matrix/presentation/ppxfxbqfkf;", "uiLabel", "Lgg/wwaezpbzkn;", "oipsdeybqn", "(Lru/myspar/proloyalty/scango/impl/screens/scan/matrix/presentation/ppxfxbqfkf;)V", "", "message", "fyldjkxazc", "(Ljava/lang/String;)V", "Lhp1/vdvldrhtss;", "uiState", "zfvoamnweg", "(Lhp1/vdvldrhtss;)V", "grlcpdaxtj", "lrnfpwlwnk", "", "isVisible", "skhdrjzrfn", "(Z)V", "isEnabled", "dvvnrvtcbc", "lxfrhoxuzk", "igdgnonuha", "wizcaqwiak", "ixidwrxhsl", "hszhottldk", "fiwbwshyhd", "ipoelvxyzq", "", "jztzpxfvev", "()I", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "gxszxtbevo", "()Z", "Lwp1/zoijcleaow;", "lereixgezr", "Lwp1/zoijcleaow;", "metgxyhuhe", "()Lwp1/zoijcleaow;", "setBarcodeAnalyzerFactory", "(Lwp1/zoijcleaow;)V", "barcodeAnalyzerFactory", "Lhp1/iobyxmoadg;", "pmvmpeiblj", "Lhp1/iobyxmoadg;", "xrmfcynszj", "()Lhp1/iobyxmoadg;", "setAssistedFactory", "(Lhp1/iobyxmoadg;)V", "assistedFactory", "Lz21/iobyxmoadg;", "zynmafqrjb", "Lz21/iobyxmoadg;", "ydmasvzmpa", "()Lz21/iobyxmoadg;", "setSnackbarManager", "(Lz21/iobyxmoadg;)V", "snackbarManager", "istkbnxepw", "Lgg/gtknphoqwx;", "sflfametgt", "()Lru/myspar/proloyalty/scango/impl/screens/scan/matrix/presentation/wkgbmnqykc;", "viewModel", "Lgo1/nufgyqmvbu;", "cdpycssgdh", "Lsr0/ppxfxbqfkf;", "rlfsiqarku", "()Lgo1/nufgyqmvbu;", "binding", "Lru/myspar/proloyalty/scango/impl/component/domain/model/product/ScanGoScanMatrixPayload;", "yadqdtsiqt", "czzsidtyhn", "()Lru/myspar/proloyalty/scango/impl/component/domain/model/product/ScanGoScanMatrixPayload;", "payload", "iozdgvuglv", "Z", "sessionInitialized", "Lwp1/ojitshcjhn;", "lmojexxdyd", "yfnezrywwk", "()Lwp1/ojitshcjhn;", "scanSession", "Lwp1/rgvfuqvkyq;", "wwaezpbzkn", "uwvvkdfqfp", "()Lwp1/rgvfuqvkyq;", "scanBindingArea", "ylkuphrtab", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScanGoScanMatrixFragment extends Hilt_ScanGoScanMatrixFragment<ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.wkgbmnqykc> implements j21.iobyxmoadg {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata */
    private final sr0.ppxfxbqfkf binding;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata */
    private boolean sessionInitialized;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    private final gg.gtknphoqwx viewModel;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    public wp1.zoijcleaow barcodeAnalyzerFactory;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata */
    private final gg.gtknphoqwx scanSession;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    public hp1.iobyxmoadg assistedFactory;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata */
    private final gg.gtknphoqwx scanBindingArea;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata */
    private final gg.gtknphoqwx payload;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    public z21.iobyxmoadg snackbarManager;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f100830pkzmftpjix = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(ScanGoScanMatrixFragment.class, "binding", "getBinding()Lru/myspar/proloyalty/scango/impl/databinding/FragmentScanGoScanMatrixProloyaltyBinding;", 0))};

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    public static final int f100829hcddaimhww = 8;

    public static final class agtfadlqog implements crxdokpmqz.ppxfxbqfkf {
        public agtfadlqog() {
        }

        @Override // androidx.lifecycle.crxdokpmqz.ppxfxbqfkf
        public ntlheqmsrt create(Class modelClass) {
            zdlpuopuiu.btonecajqb(modelClass, "modelClass");
            ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.wkgbmnqykc wkgbmnqykcVarIobyxmoadg = ScanGoScanMatrixFragment.this.xrmfcynszj().iobyxmoadg(ScanGoScanMatrixFragment.this.czzsidtyhn());
            zdlpuopuiu.nufgyqmvbu(wkgbmnqykcVarIobyxmoadg, "null cannot be cast to non-null type T of ru.myspar.proloyalty.legacy.presentation.ext.ViewModelExtKt.viewModelProviderFactoryOf.<no name provided>.create");
            return wkgbmnqykcVarIobyxmoadg;
        }
    }

    public static final class btonecajqb extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f100842zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public btonecajqb(Fragment fragment) {
            super(0);
            this.f100842zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f100842zdlpuopuiu;
        }
    }

    public static final class draadjrbmk extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f100843zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public draadjrbmk(gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f100843zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f100843zdlpuopuiu).getViewModelStore();
        }
    }

    public static final class dxjokdxxww implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ScanGoScanMatrixFragment f100844jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f100845yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f100846zdlpuopuiu;

        public dxjokdxxww(jpowsppfya jpowsppfyaVar, long j13, ScanGoScanMatrixFragment scanGoScanMatrixFragment) {
            this.f100846zdlpuopuiu = jpowsppfyaVar;
            this.f100845yggfygwlhe = j13;
            this.f100844jyumaefscl = scanGoScanMatrixFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f100846zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f100845yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f100844jyumaefscl.wwaezpbzkn().okpsazkaxt(ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.zoijcleaow.iobyxmoadg.f100911iobyxmoadg);
        }
    }

    public static final class eablkybsjg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ ScanGoScanMatrixFragment f100847iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.gtknphoqwx.zoijcleaow f100848jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ Fragment f100849yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f100850zdlpuopuiu;

        public static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ ScanGoScanMatrixFragment f100851jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private /* synthetic */ Object f100852yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f100853zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar, ScanGoScanMatrixFragment scanGoScanMatrixFragment) {
                super(2, gxszxtbevoVar);
                this.f100851jyumaefscl = scanGoScanMatrixFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar, this.f100851jyumaefscl);
                iobyxmoadgVar.f100852yggfygwlhe = obj;
                return iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f100853zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    sj.lqeggnwhkg lqeggnwhkgVarDraadjrbmk = this.f100851jyumaefscl.wwaezpbzkn().draadjrbmk();
                    lqeggnwhkg lqeggnwhkgVar = this.f100851jyumaefscl.new lqeggnwhkg();
                    this.f100853zdlpuopuiu = 1;
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
        public eablkybsjg(Fragment fragment, androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar, ScanGoScanMatrixFragment scanGoScanMatrixFragment) {
            super(2, gxszxtbevoVar);
            this.f100849yggfygwlhe = fragment;
            this.f100848jyumaefscl = zoijcleaowVar;
            this.f100847iwizpuwonk = scanGoScanMatrixFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new eablkybsjg(this.f100849yggfygwlhe, this.f100848jyumaefscl, gxszxtbevoVar, this.f100847iwizpuwonk);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f100850zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                androidx.lifecycle.gtknphoqwx lifecycle = this.f100849yggfygwlhe.getViewLifecycleOwner().getLifecycle();
                androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = this.f100848jyumaefscl;
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(null, this.f100847iwizpuwonk);
                this.f100850zdlpuopuiu = 1;
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

    public static final class gtknphoqwx extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f100854zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gtknphoqwx(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f100854zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f100854zdlpuopuiu.invoke();
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
        public final Object emit(vdvldrhtss vdvldrhtssVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objOpjhrmiecq = ScanGoScanMatrixFragment.opjhrmiecq(ScanGoScanMatrixFragment.this, vdvldrhtssVar, gxszxtbevoVar);
            return objOpjhrmiecq == mg.zoijcleaow.gxszxtbevo() ? objOpjhrmiecq : wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // kotlin.jvm.internal.agtfadlqog
        public final gg.dxjokdxxww zoijcleaow() {
            return new kotlin.jvm.internal.iobyxmoadg(2, ScanGoScanMatrixFragment.this, ScanGoScanMatrixFragment.class, "handleState", "handleState(Lru/myspar/proloyalty/scango/impl/screens/scan/matrix/presentation/ScanGoScanMatrixView$Model;)V", 4);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.ScanGoScanMatrixFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final ScanGoScanMatrixFragment iobyxmoadg(ScanGoScanMatrixPayload payload) {
            zdlpuopuiu.btonecajqb(payload, "payload");
            ScanGoScanMatrixFragment scanGoScanMatrixFragment = new ScanGoScanMatrixFragment();
            scanGoScanMatrixFragment.setArguments(q1.ppxfxbqfkf.zoijcleaow(cqumvgiudr.iobyxmoadg("payload", payload)));
            return scanGoScanMatrixFragment;
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
        public final Object emit(ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.ppxfxbqfkf ppxfxbqfkfVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objIyctptxqzt = ScanGoScanMatrixFragment.iyctptxqzt(ScanGoScanMatrixFragment.this, ppxfxbqfkfVar, gxszxtbevoVar);
            return objIyctptxqzt == mg.zoijcleaow.gxszxtbevo() ? objIyctptxqzt : wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // kotlin.jvm.internal.agtfadlqog
        public final gg.dxjokdxxww zoijcleaow() {
            return new kotlin.jvm.internal.iobyxmoadg(2, ScanGoScanMatrixFragment.this, ScanGoScanMatrixFragment.class, "handleUiLabel", "handleUiLabel(Lru/myspar/proloyalty/scango/impl/screens/scan/matrix/presentation/ScanGoScanMatrixView$UiLabel;)V", 4);
        }
    }

    public static final class nufgyqmvbu implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ScanGoScanMatrixFragment f100857jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f100858yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f100859zdlpuopuiu;

        public nufgyqmvbu(jpowsppfya jpowsppfyaVar, long j13, ScanGoScanMatrixFragment scanGoScanMatrixFragment) {
            this.f100859zdlpuopuiu = jpowsppfyaVar;
            this.f100858yggfygwlhe = j13;
            this.f100857jyumaefscl = scanGoScanMatrixFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f100859zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f100858yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            ScanGoScanMatrixFragment scanGoScanMatrixFragment = this.f100857jyumaefscl;
            String string = scanGoScanMatrixFragment.getString(on1.wkgbmnqykc.proloyalty_scan_go_matrix_scan_title);
            zdlpuopuiu.dxjokdxxww(string, "getString(...)");
            scanGoScanMatrixFragment.fyldjkxazc(string);
        }
    }

    /* synthetic */ class ppxfxbqfkf extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final ppxfxbqfkf f100860zdlpuopuiu = new ppxfxbqfkf();

        ppxfxbqfkf() {
            super(1, go1.nufgyqmvbu.class, "bind", "bind(Landroid/view/View;)Lru/myspar/proloyalty/scango/impl/databinding/FragmentScanGoScanMatrixProloyaltyBinding;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final go1.nufgyqmvbu invoke(View p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return go1.nufgyqmvbu.iobyxmoadg(p13);
        }
    }

    public static final class wflxmlrfwp extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f100861yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f100862zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wflxmlrfwp(tg.iobyxmoadg iobyxmoadgVar, gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f100862zdlpuopuiu = iobyxmoadgVar;
            this.f100861yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f100862zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f100861yggfygwlhe);
            androidx.lifecycle.dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof androidx.lifecycle.dxjokdxxww ? (androidx.lifecycle.dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    public static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ ScanGoScanMatrixFragment f100863iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.gtknphoqwx.zoijcleaow f100864jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ Fragment f100865yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f100866zdlpuopuiu;

        public static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ ScanGoScanMatrixFragment f100867jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private /* synthetic */ Object f100868yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f100869zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar, ScanGoScanMatrixFragment scanGoScanMatrixFragment) {
                super(2, gxszxtbevoVar);
                this.f100867jyumaefscl = scanGoScanMatrixFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar, this.f100867jyumaefscl);
                iobyxmoadgVar.f100868yggfygwlhe = obj;
                return iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f100869zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    wypolnanlu state = this.f100867jyumaefscl.wwaezpbzkn().getState();
                    gxszxtbevo gxszxtbevoVar = this.f100867jyumaefscl.new gxszxtbevo();
                    this.f100869zdlpuopuiu = 1;
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
        public wkgbmnqykc(Fragment fragment, androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar, ScanGoScanMatrixFragment scanGoScanMatrixFragment) {
            super(2, gxszxtbevoVar);
            this.f100865yggfygwlhe = fragment;
            this.f100864jyumaefscl = zoijcleaowVar;
            this.f100863iwizpuwonk = scanGoScanMatrixFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new wkgbmnqykc(this.f100865yggfygwlhe, this.f100864jyumaefscl, gxszxtbevoVar, this.f100863iwizpuwonk);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f100866zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                androidx.lifecycle.gtknphoqwx lifecycle = this.f100865yggfygwlhe.getViewLifecycleOwner().getLifecycle();
                androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = this.f100864jyumaefscl;
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(null, this.f100863iwizpuwonk);
                this.f100866zdlpuopuiu = 1;
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
        public static final /* synthetic */ int[] f100870iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final /* synthetic */ int[] f100871zoijcleaow;

        static {
            int[] iArr = new int[bo1.ppxfxbqfkf.values().length];
            try {
                iArr[bo1.ppxfxbqfkf.AMOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[bo1.ppxfxbqfkf.WEIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f100870iobyxmoadg = iArr;
            int[] iArr2 = new int[bo1.iobyxmoadg.values().length];
            try {
                iArr2[bo1.iobyxmoadg.DECREASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[bo1.iobyxmoadg.INCREASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f100871zoijcleaow = iArr2;
        }
    }

    public ScanGoScanMatrixFragment() {
        super(on1.ppxfxbqfkf.fragment_scan_go_scan_matrix_proloyalty);
        tg.iobyxmoadg iobyxmoadgVar = new tg.iobyxmoadg() { // from class: hp1.zoijcleaow
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanGoScanMatrixFragment.jrbgnlbqoe(this.f40878zdlpuopuiu);
            }
        };
        gg.gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new gtknphoqwx(new btonecajqb(this)));
        this.viewModel = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.wkgbmnqykc.class), new draadjrbmk(gtknphoqwxVarIobyxmoadg), new wflxmlrfwp(null, gtknphoqwxVarIobyxmoadg), iobyxmoadgVar);
        this.binding = sr0.iobyxmoadg.zoijcleaow(this, ppxfxbqfkf.f100860zdlpuopuiu);
        this.payload = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: hp1.eablkybsjg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanGoScanMatrixFragment.weqkydbzbr(this.f40865zdlpuopuiu);
            }
        });
        this.scanSession = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: hp1.gxszxtbevo
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanGoScanMatrixFragment.nuxfzjnpeb(this.f40867zdlpuopuiu);
            }
        });
        this.scanBindingArea = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: hp1.lqeggnwhkg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanGoScanMatrixFragment.zeieaojujs(this.f40868zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ageimvtcrz(ScanGoScanMatrixFragment scanGoScanMatrixFragment) {
        scanGoScanMatrixFragment.wwaezpbzkn().okpsazkaxt(ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.zoijcleaow.lqeggnwhkg.f100912iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn auzgnhcxok(ScanGoScanMatrixFragment scanGoScanMatrixFragment, boolean z13) {
        scanGoScanMatrixFragment.wwaezpbzkn().okpsazkaxt(new ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.zoijcleaow.C2431zoijcleaow(z13));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bfopjjpdmp(ScanGoScanMatrixFragment scanGoScanMatrixFragment, View view) {
        scanGoScanMatrixFragment.wwaezpbzkn().okpsazkaxt(ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.zoijcleaow.nufgyqmvbu.f100913iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ScanGoScanMatrixPayload czzsidtyhn() {
        return (ScanGoScanMatrixPayload) this.payload.getValue();
    }

    private final void dvvnrvtcbc(boolean isEnabled) {
        rlfsiqarku().f38083wkgbmnqykc.setImageResource(isEnabled ? b31.gxszxtbevo.ic_flash_on : b31.gxszxtbevo.ic_flash_off);
    }

    private final void fiwbwshyhd(String message) {
        Context contextRequireContext = requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        new io1.lqeggnwhkg.iobyxmoadg(contextRequireContext).dxjokdxxww(on1.wkgbmnqykc.proloyalty_scan_and_go_popup_warning_title).eablkybsjg(message).iobyxmoadg(on1.wkgbmnqykc.proloyalty_scan_and_go_popup_positive_button_text, new tg.iobyxmoadg() { // from class: hp1.btonecajqb
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanGoScanMatrixFragment.ageimvtcrz(this.f40862zdlpuopuiu);
            }
        }).ppxfxbqfkf().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fyldjkxazc(String message) {
        MaterialTextView tvScanMatrixError = rlfsiqarku().f38074draadjrbmk;
        zdlpuopuiu.dxjokdxxww(tvScanMatrixError, "tvScanMatrixError");
        tvScanMatrixError.setVisibility(0);
        rlfsiqarku().f38074draadjrbmk.setText(message);
    }

    private final void grlcpdaxtj() {
        rlfsiqarku().getRoot().post(new Runnable() { // from class: hp1.dxjokdxxww
            @Override // java.lang.Runnable
            public final void run() {
                ScanGoScanMatrixFragment.mhtqkkgtqm(this.f40864zdlpuopuiu);
            }
        });
    }

    private final void hszhottldk() {
        String string = getString(on1.wkgbmnqykc.proloyalty_scan_and_go_error_on_request);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        fiwbwshyhd(string);
    }

    private final void igdgnonuha() {
        a31.iobyxmoadg.ppxfxbqfkf(ydmasvzmpa(), on1.wkgbmnqykc.proloyalty_camera_initialization_error, null, lr0.eablkybsjg.gxszxtbevo.NonFatal, 2, null);
    }

    private final void ipoelvxyzq() {
        if (this.sessionInitialized) {
            yfnezrywwk().hcddaimhww();
            this.sessionInitialized = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn iwxlajgraz(ScanGoScanMatrixFragment scanGoScanMatrixFragment, boolean z13) {
        scanGoScanMatrixFragment.wwaezpbzkn().okpsazkaxt(new ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.zoijcleaow.eablkybsjg(z13));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void ixidwrxhsl() {
        yfnezrywwk().cllcsxoeiz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object iyctptxqzt(ScanGoScanMatrixFragment scanGoScanMatrixFragment, ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.ppxfxbqfkf ppxfxbqfkfVar, lg.gxszxtbevo gxszxtbevoVar) {
        scanGoScanMatrixFragment.oipsdeybqn(ppxfxbqfkfVar);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final crxdokpmqz.ppxfxbqfkf jrbgnlbqoe(ScanGoScanMatrixFragment scanGoScanMatrixFragment) {
        return scanGoScanMatrixFragment.new agtfadlqog();
    }

    private final int jztzpxfvev() {
        int i13 = zoijcleaow.f100871zoijcleaow[czzsidtyhn().getScanGoAmountMode().ordinal()];
        if (i13 == 1) {
            return on1.wkgbmnqykc.proloyalty_scan_go_matrix_scan_skip_removing;
        }
        if (i13 == 2) {
            return on1.wkgbmnqykc.proloyalty_scan_go_matrix_scan_skip_adding;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void lrnfpwlwnk() {
        wp1.ojitshcjhn.pkzmftpjix(yfnezrywwk(), false, 1, null);
    }

    private final void lxfrhoxuzk() {
        a31.iobyxmoadg.ppxfxbqfkf(ydmasvzmpa(), on1.wkgbmnqykc.proloyalty_camera_not_found, null, lr0.eablkybsjg.gxszxtbevo.NonFatal, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mhtqkkgtqm(ScanGoScanMatrixFragment scanGoScanMatrixFragment) {
        scanGoScanMatrixFragment.yfnezrywwk().jpowsppfya();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wp1.ojitshcjhn nuxfzjnpeb(final ScanGoScanMatrixFragment scanGoScanMatrixFragment) {
        scanGoScanMatrixFragment.sessionInitialized = true;
        PreviewView previewView = scanGoScanMatrixFragment.rlfsiqarku().f38075dxjokdxxww;
        zdlpuopuiu.dxjokdxxww(previewView, "previewView");
        return new wp1.ojitshcjhn(previewView, scanGoScanMatrixFragment, scanGoScanMatrixFragment.metgxyhuhe(), scanGoScanMatrixFragment.uwvvkdfqfp(), null, wp1.wkgbmnqykc.iobyxmoadg.zoijcleaow.f120438iobyxmoadg, new tg.draadjrbmk() { // from class: hp1.gtknphoqwx
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ScanGoScanMatrixFragment.tbqsvytpvh(this.f40866zdlpuopuiu, (String) obj);
            }
        }, new tg.iobyxmoadg() { // from class: hp1.draadjrbmk
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanGoScanMatrixFragment.roivzttewh(this.f40863zdlpuopuiu);
            }
        }, new tg.iobyxmoadg() { // from class: hp1.wflxmlrfwp
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanGoScanMatrixFragment.uawqvzlxes(this.f40876zdlpuopuiu);
            }
        }, new tg.draadjrbmk() { // from class: hp1.ppxfxbqfkf
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ScanGoScanMatrixFragment.auzgnhcxok(this.f40870zdlpuopuiu, ((Boolean) obj).booleanValue());
            }
        }, new tg.draadjrbmk() { // from class: hp1.wkgbmnqykc
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ScanGoScanMatrixFragment.iwxlajgraz(this.f40877zdlpuopuiu, ((Boolean) obj).booleanValue());
            }
        }, 16, null);
    }

    private final void oipsdeybqn(ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.ppxfxbqfkf uiLabel) {
        if (uiLabel instanceof ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.ppxfxbqfkf.btonecajqb) {
            grlcpdaxtj();
            return;
        }
        if (zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.ppxfxbqfkf.iobyxmoadg.f100877iobyxmoadg)) {
            lrnfpwlwnk();
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.ppxfxbqfkf.gtknphoqwx) {
            ixidwrxhsl();
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.ppxfxbqfkf.C2429ppxfxbqfkf) {
            lxfrhoxuzk();
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.ppxfxbqfkf.zoijcleaow) {
            igdgnonuha();
            return;
        }
        if (uiLabel instanceof ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.ppxfxbqfkf.wkgbmnqykc) {
            wizcaqwiak();
            return;
        }
        if (zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.ppxfxbqfkf.gxszxtbevo.f100876iobyxmoadg)) {
            String string = getString(on1.wkgbmnqykc.proloyalty_scan_go_matrix_delete_scan_wrong_title);
            zdlpuopuiu.dxjokdxxww(string, "getString(...)");
            fyldjkxazc(string);
        } else {
            if (zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.ppxfxbqfkf.eablkybsjg.f100874iobyxmoadg)) {
                hszhottldk();
                return;
            }
            if (uiLabel instanceof ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.ppxfxbqfkf.lqeggnwhkg) {
                fyldjkxazc(((ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.ppxfxbqfkf.lqeggnwhkg) uiLabel).iobyxmoadg());
                return;
            }
            if (uiLabel instanceof ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.ppxfxbqfkf.nufgyqmvbu) {
                fiwbwshyhd(((ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.ppxfxbqfkf.nufgyqmvbu) uiLabel).iobyxmoadg());
            } else {
                if (!zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.ppxfxbqfkf.dxjokdxxww.f100873iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                String string2 = getString(on1.wkgbmnqykc.proloyalty_scan_and_go_error_product_not_found);
                zdlpuopuiu.dxjokdxxww(string2, "getString(...)");
                fyldjkxazc(string2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object opjhrmiecq(ScanGoScanMatrixFragment scanGoScanMatrixFragment, vdvldrhtss vdvldrhtssVar, lg.gxszxtbevo gxszxtbevoVar) {
        scanGoScanMatrixFragment.zfvoamnweg(vdvldrhtssVar);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final go1.nufgyqmvbu rlfsiqarku() {
        return (go1.nufgyqmvbu) this.binding.iobyxmoadg(this, f100830pkzmftpjix[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn roivzttewh(ScanGoScanMatrixFragment scanGoScanMatrixFragment) {
        scanGoScanMatrixFragment.wwaezpbzkn().okpsazkaxt(ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.zoijcleaow.wkgbmnqykc.f100915iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void skhdrjzrfn(boolean isVisible) {
        AppCompatImageButton btnToggleFlash = rlfsiqarku().f38083wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(btnToggleFlash, "btnToggleFlash");
        btnToggleFlash.setVisibility(!isVisible ? 4 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn tbqsvytpvh(ScanGoScanMatrixFragment scanGoScanMatrixFragment, String it) {
        zdlpuopuiu.btonecajqb(it, "it");
        scanGoScanMatrixFragment.wwaezpbzkn().okpsazkaxt(new ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.zoijcleaow.gxszxtbevo(it));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn uawqvzlxes(ScanGoScanMatrixFragment scanGoScanMatrixFragment) {
        scanGoScanMatrixFragment.wwaezpbzkn().okpsazkaxt(ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.zoijcleaow.ppxfxbqfkf.f100914iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final wp1.rgvfuqvkyq uwvvkdfqfp() {
        return (wp1.rgvfuqvkyq) this.scanBindingArea.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScanGoScanMatrixPayload weqkydbzbr(ScanGoScanMatrixFragment scanGoScanMatrixFragment) {
        Parcelable parcelable = scanGoScanMatrixFragment.requireArguments().getParcelable("payload");
        zdlpuopuiu.lqeggnwhkg(parcelable);
        return (ScanGoScanMatrixPayload) parcelable;
    }

    private final void wizcaqwiak() {
        a31.iobyxmoadg.ppxfxbqfkf(ydmasvzmpa(), on1.wkgbmnqykc.proloyalty_camera_permission_denied, null, lr0.eablkybsjg.gxszxtbevo.NonFatal, 2, null);
    }

    private final wp1.ojitshcjhn yfnezrywwk() {
        return (wp1.ojitshcjhn) this.scanSession.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wp1.rgvfuqvkyq zeieaojujs(ScanGoScanMatrixFragment scanGoScanMatrixFragment) {
        ScanWindowView scanWindowView = scanGoScanMatrixFragment.rlfsiqarku().f38073btonecajqb;
        zdlpuopuiu.lqeggnwhkg(scanWindowView);
        return new wp1.rgvfuqvkyq(p41.dxjokdxxww.ppxfxbqfkf(scanWindowView), scanWindowView.getWidth(), scanWindowView.getHeight());
    }

    private final void zfvoamnweg(vdvldrhtss uiState) {
        skhdrjzrfn(uiState.wkgbmnqykc());
        dvvnrvtcbc(uiState.ppxfxbqfkf());
    }

    @Override // j21.iobyxmoadg
    public boolean gxszxtbevo() {
        wwaezpbzkn().okpsazkaxt(ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.zoijcleaow.iobyxmoadg.f100911iobyxmoadg);
        return true;
    }

    public final wp1.zoijcleaow metgxyhuhe() {
        wp1.zoijcleaow zoijcleaowVar = this.barcodeAnalyzerFactory;
        if (zoijcleaowVar != null) {
            return zoijcleaowVar;
        }
        zdlpuopuiu.pmvmpeiblj("barcodeAnalyzerFactory");
        return null;
    }

    @Override // ru.myspar.proloyalty.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        ipoelvxyzq();
        super.onDestroyView();
    }

    @Override // ru.myspar.proloyalty.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        String string;
        int iJztzpxfvev;
        zdlpuopuiu.btonecajqb(view, "view");
        super.onViewCreated(view, savedInstanceState);
        go1.nufgyqmvbu nufgyqmvbuVarRlfsiqarku = rlfsiqarku();
        AppCompatEditText etProductBarcode = nufgyqmvbuVarRlfsiqarku.f38076eablkybsjg;
        zdlpuopuiu.dxjokdxxww(etProductBarcode, "etProductBarcode");
        etProductBarcode.setOnClickListener(new nufgyqmvbu(new jpowsppfya(), 400L, this));
        MaterialButton btnCancel = nufgyqmvbuVarRlfsiqarku.f38082ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(btnCancel, "btnCancel");
        btnCancel.setOnClickListener(new dxjokdxxww(new jpowsppfya(), 400L, this));
        MaterialButton materialButton = nufgyqmvbuVarRlfsiqarku.f38082ppxfxbqfkf;
        Context context = getContext();
        if (context != null) {
            int i13 = zoijcleaow.f100870iobyxmoadg[czzsidtyhn().getScanGoProductType().ordinal()];
            if (i13 == 1) {
                iJztzpxfvev = jztzpxfvev();
            } else {
                if (i13 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                iJztzpxfvev = on1.wkgbmnqykc.proloyalty_scan_go_matrix_cancel_scan_weight_product;
            }
            string = context.getString(iJztzpxfvev);
        } else {
            string = null;
        }
        materialButton.setText(string);
        nufgyqmvbuVarRlfsiqarku.f38083wkgbmnqykc.setOnClickListener(new View.OnClickListener() { // from class: hp1.nufgyqmvbu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ScanGoScanMatrixFragment.bfopjjpdmp(this.f40869zdlpuopuiu, view2);
            }
        });
        androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = androidx.lifecycle.gtknphoqwx.zoijcleaow.STARTED;
        androidx.lifecycle.vdvldrhtss viewLifecycleOwner = getViewLifecycleOwner();
        zdlpuopuiu.dxjokdxxww(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(viewLifecycleOwner), null, null, new wkgbmnqykc(this, zoijcleaowVar, null, this), 3, null);
        androidx.lifecycle.vdvldrhtss viewLifecycleOwner2 = getViewLifecycleOwner();
        zdlpuopuiu.dxjokdxxww(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(viewLifecycleOwner2), null, null, new eablkybsjg(this, zoijcleaowVar, null, this), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvvm.BaseMvvmFragment
    /* JADX INFO: renamed from: sflfametgt, reason: merged with bridge method [inline-methods] */
    public ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.wkgbmnqykc wwaezpbzkn() {
        return (ru.myspar.proloyalty.scango.impl.screens.scan.matrix.presentation.wkgbmnqykc) this.viewModel.getValue();
    }

    public final hp1.iobyxmoadg xrmfcynszj() {
        hp1.iobyxmoadg iobyxmoadgVar = this.assistedFactory;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("assistedFactory");
        return null;
    }

    public final z21.iobyxmoadg ydmasvzmpa() {
        z21.iobyxmoadg iobyxmoadgVar = this.snackbarManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("snackbarManager");
        return null;
    }
}
