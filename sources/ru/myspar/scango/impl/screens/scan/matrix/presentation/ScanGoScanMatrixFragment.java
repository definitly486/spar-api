package ru.myspar.scango.impl.screens.scan.matrix.presentation;

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
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.jpowsppfya;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.yadqdtsiqt;
import kotlin.jvm.internal.zdlpuopuiu;
import l32.vdvldrhtss;
import ru.myspar.legacy.presentation.view.ScanWindowView;
import ru.myspar.scango.impl.component.domain.model.product.ScanGoScanMatrixPayload;
import ru.myspar.scango.impl.screens.scan.matrix.presentation.ScanGoScanMatrixFragment;
import sj.wypolnanlu;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 c2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001dB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0005J\u000f\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0005J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001b\u0010\u0005J\u000f\u0010\u001c\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001c\u0010\u0005J\u000f\u0010\u001d\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001d\u0010\u0005J\u000f\u0010\u001e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001e\u0010\u0005J\u000f\u0010\u001f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001f\u0010\u0005J\u0017\u0010 \u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b \u0010\u000eJ\u000f\u0010!\u001a\u00020\bH\u0002¢\u0006\u0004\b!\u0010\u0005J\u000f\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J!\u0010)\u001a\u00020\b2\u0006\u0010&\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\bH\u0016¢\u0006\u0004\b+\u0010\u0005J\u000f\u0010,\u001a\u00020\u0015H\u0016¢\u0006\u0004\b,\u0010-R\"\u00105\u001a\u00020.8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010=\u001a\u0002068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010E\u001a\u00020>8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001b\u0010J\u001a\u00020\u00028TX\u0094\u0084\u0002¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u001b\u0010P\u001a\u00020K8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u001b\u0010U\u001a\u00020Q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010G\u001a\u0004\bS\u0010TR\u0016\u0010X\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u001b\u0010]\u001a\u00020Y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010G\u001a\u0004\b[\u0010\\R\u001b\u0010b\u001a\u00020^8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b_\u0010G\u001a\u0004\b`\u0010a¨\u0006e"}, d2 = {"Lru/myspar/scango/impl/screens/scan/matrix/presentation/ScanGoScanMatrixFragment;", "Lru/myspar/scango/impl/component/presentation/BaseScanGoMvvmFragment;", "Lru/myspar/scango/impl/screens/scan/matrix/presentation/wkgbmnqykc;", "Le40/iobyxmoadg;", "<init>", "()V", "Lru/myspar/scango/impl/screens/scan/matrix/presentation/ppxfxbqfkf;", "uiLabel", "Lgg/wwaezpbzkn;", "oipsdeybqn", "(Lru/myspar/scango/impl/screens/scan/matrix/presentation/ppxfxbqfkf;)V", "", "message", "fyldjkxazc", "(Ljava/lang/String;)V", "Ll32/vdvldrhtss;", "uiState", "zfvoamnweg", "(Ll32/vdvldrhtss;)V", "grlcpdaxtj", "lrnfpwlwnk", "", "isVisible", "skhdrjzrfn", "(Z)V", "isEnabled", "dvvnrvtcbc", "lxfrhoxuzk", "igdgnonuha", "wizcaqwiak", "ixidwrxhsl", "hszhottldk", "fiwbwshyhd", "ipoelvxyzq", "", "jztzpxfvev", "()I", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "gxszxtbevo", "()Z", "La42/zoijcleaow;", "lereixgezr", "La42/zoijcleaow;", "metgxyhuhe", "()La42/zoijcleaow;", "setBarcodeAnalyzerFactory", "(La42/zoijcleaow;)V", "barcodeAnalyzerFactory", "Ll32/iobyxmoadg;", "pmvmpeiblj", "Ll32/iobyxmoadg;", "xrmfcynszj", "()Ll32/iobyxmoadg;", "setAssistedFactory", "(Ll32/iobyxmoadg;)V", "assistedFactory", "Lq40/iobyxmoadg;", "zynmafqrjb", "Lq40/iobyxmoadg;", "ydmasvzmpa", "()Lq40/iobyxmoadg;", "setSnackbarManager", "(Lq40/iobyxmoadg;)V", "snackbarManager", "istkbnxepw", "Lgg/gtknphoqwx;", "sflfametgt", "()Lru/myspar/scango/impl/screens/scan/matrix/presentation/wkgbmnqykc;", "viewModel", "Lk22/nufgyqmvbu;", "cdpycssgdh", "Lys/ppxfxbqfkf;", "rlfsiqarku", "()Lk22/nufgyqmvbu;", "binding", "Lru/myspar/scango/impl/component/domain/model/product/ScanGoScanMatrixPayload;", "yadqdtsiqt", "czzsidtyhn", "()Lru/myspar/scango/impl/component/domain/model/product/ScanGoScanMatrixPayload;", "payload", "iozdgvuglv", "Z", "sessionInitialized", "La42/ojitshcjhn;", "lmojexxdyd", "yfnezrywwk", "()La42/ojitshcjhn;", "scanSession", "La42/rgvfuqvkyq;", "wwaezpbzkn", "uwvvkdfqfp", "()La42/rgvfuqvkyq;", "scanBindingArea", "ylkuphrtab", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScanGoScanMatrixFragment extends Hilt_ScanGoScanMatrixFragment<ru.myspar.scango.impl.screens.scan.matrix.presentation.wkgbmnqykc> implements e40.iobyxmoadg {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata */
    private final ys.ppxfxbqfkf binding;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata */
    private boolean sessionInitialized;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    private final gg.gtknphoqwx viewModel;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    public a42.zoijcleaow barcodeAnalyzerFactory;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata */
    private final gg.gtknphoqwx scanSession;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    public l32.iobyxmoadg assistedFactory;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata */
    private final gg.gtknphoqwx scanBindingArea;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata */
    private final gg.gtknphoqwx payload;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    public q40.iobyxmoadg snackbarManager;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f103487pkzmftpjix = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(ScanGoScanMatrixFragment.class, "binding", "getBinding()Lru/myspar/scango/impl/databinding/FragmentScanGoScanMatrixBinding;", 0))};

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    public static final int f103486hcddaimhww = 8;

    public static final class agtfadlqog implements crxdokpmqz.ppxfxbqfkf {
        public agtfadlqog() {
        }

        @Override // androidx.lifecycle.crxdokpmqz.ppxfxbqfkf
        public ntlheqmsrt create(Class modelClass) {
            zdlpuopuiu.btonecajqb(modelClass, "modelClass");
            ru.myspar.scango.impl.screens.scan.matrix.presentation.wkgbmnqykc wkgbmnqykcVarIobyxmoadg = ScanGoScanMatrixFragment.this.xrmfcynszj().iobyxmoadg(ScanGoScanMatrixFragment.this.czzsidtyhn());
            zdlpuopuiu.nufgyqmvbu(wkgbmnqykcVarIobyxmoadg, "null cannot be cast to non-null type T of ru.myspar.legacy.presentation.ext.ViewModelExtKt.viewModelProviderFactoryOf.<no name provided>.create");
            return wkgbmnqykcVarIobyxmoadg;
        }
    }

    public static final class btonecajqb extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f103499zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public btonecajqb(Fragment fragment) {
            super(0);
            this.f103499zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f103499zdlpuopuiu;
        }
    }

    public static final class draadjrbmk extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f103500zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public draadjrbmk(gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f103500zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f103500zdlpuopuiu).getViewModelStore();
        }
    }

    public static final class dxjokdxxww implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ScanGoScanMatrixFragment f103501jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f103502yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f103503zdlpuopuiu;

        public dxjokdxxww(jpowsppfya jpowsppfyaVar, long j13, ScanGoScanMatrixFragment scanGoScanMatrixFragment) {
            this.f103503zdlpuopuiu = jpowsppfyaVar;
            this.f103502yggfygwlhe = j13;
            this.f103501jyumaefscl = scanGoScanMatrixFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f103503zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f103502yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            this.f103501jyumaefscl.wwaezpbzkn().okpsazkaxt(ru.myspar.scango.impl.screens.scan.matrix.presentation.zoijcleaow.iobyxmoadg.f103568iobyxmoadg);
        }
    }

    public static final class eablkybsjg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ ScanGoScanMatrixFragment f103504iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.gtknphoqwx.zoijcleaow f103505jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ Fragment f103506yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f103507zdlpuopuiu;

        public static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ ScanGoScanMatrixFragment f103508jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private /* synthetic */ Object f103509yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f103510zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar, ScanGoScanMatrixFragment scanGoScanMatrixFragment) {
                super(2, gxszxtbevoVar);
                this.f103508jyumaefscl = scanGoScanMatrixFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar, this.f103508jyumaefscl);
                iobyxmoadgVar.f103509yggfygwlhe = obj;
                return iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f103510zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    sj.lqeggnwhkg lqeggnwhkgVarDraadjrbmk = this.f103508jyumaefscl.wwaezpbzkn().draadjrbmk();
                    lqeggnwhkg lqeggnwhkgVar = this.f103508jyumaefscl.new lqeggnwhkg();
                    this.f103510zdlpuopuiu = 1;
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
            this.f103506yggfygwlhe = fragment;
            this.f103505jyumaefscl = zoijcleaowVar;
            this.f103504iwizpuwonk = scanGoScanMatrixFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new eablkybsjg(this.f103506yggfygwlhe, this.f103505jyumaefscl, gxszxtbevoVar, this.f103504iwizpuwonk);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f103507zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                androidx.lifecycle.gtknphoqwx lifecycle = this.f103506yggfygwlhe.getViewLifecycleOwner().getLifecycle();
                androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = this.f103505jyumaefscl;
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(null, this.f103504iwizpuwonk);
                this.f103507zdlpuopuiu = 1;
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
        final /* synthetic */ tg.iobyxmoadg f103511zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gtknphoqwx(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f103511zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f103511zdlpuopuiu.invoke();
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
            return new kotlin.jvm.internal.iobyxmoadg(2, ScanGoScanMatrixFragment.this, ScanGoScanMatrixFragment.class, "handleState", "handleState(Lru/myspar/scango/impl/screens/scan/matrix/presentation/ScanGoScanMatrixView$Model;)V", 4);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.scango.impl.screens.scan.matrix.presentation.ScanGoScanMatrixFragment$iobyxmoadg, reason: from kotlin metadata */
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
        public final Object emit(ru.myspar.scango.impl.screens.scan.matrix.presentation.ppxfxbqfkf ppxfxbqfkfVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objIyctptxqzt = ScanGoScanMatrixFragment.iyctptxqzt(ScanGoScanMatrixFragment.this, ppxfxbqfkfVar, gxszxtbevoVar);
            return objIyctptxqzt == mg.zoijcleaow.gxszxtbevo() ? objIyctptxqzt : wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // kotlin.jvm.internal.agtfadlqog
        public final gg.dxjokdxxww zoijcleaow() {
            return new kotlin.jvm.internal.iobyxmoadg(2, ScanGoScanMatrixFragment.this, ScanGoScanMatrixFragment.class, "handleUiLabel", "handleUiLabel(Lru/myspar/scango/impl/screens/scan/matrix/presentation/ScanGoScanMatrixView$UiLabel;)V", 4);
        }
    }

    public static final class nufgyqmvbu implements View.OnClickListener {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ ScanGoScanMatrixFragment f103514jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f103515yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f103516zdlpuopuiu;

        public nufgyqmvbu(jpowsppfya jpowsppfyaVar, long j13, ScanGoScanMatrixFragment scanGoScanMatrixFragment) {
            this.f103516zdlpuopuiu = jpowsppfyaVar;
            this.f103515yggfygwlhe = j13;
            this.f103514jyumaefscl = scanGoScanMatrixFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            jpowsppfya jpowsppfyaVar = this.f103516zdlpuopuiu;
            if (jElapsedRealtime - jpowsppfyaVar.f60024zdlpuopuiu < this.f103515yggfygwlhe) {
                return;
            }
            jpowsppfyaVar.f60024zdlpuopuiu = SystemClock.elapsedRealtime();
            zdlpuopuiu.lqeggnwhkg(view);
            ScanGoScanMatrixFragment scanGoScanMatrixFragment = this.f103514jyumaefscl;
            String string = scanGoScanMatrixFragment.getString(s12.wkgbmnqykc.scan_go_matrix_scan_title);
            zdlpuopuiu.dxjokdxxww(string, "getString(...)");
            scanGoScanMatrixFragment.fyldjkxazc(string);
        }
    }

    /* synthetic */ class ppxfxbqfkf extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final ppxfxbqfkf f103517zdlpuopuiu = new ppxfxbqfkf();

        ppxfxbqfkf() {
            super(1, k22.nufgyqmvbu.class, "bind", "bind(Landroid/view/View;)Lru/myspar/scango/impl/databinding/FragmentScanGoScanMatrixBinding;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final k22.nufgyqmvbu invoke(View p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return k22.nufgyqmvbu.iobyxmoadg(p13);
        }
    }

    public static final class wflxmlrfwp extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f103518yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f103519zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wflxmlrfwp(tg.iobyxmoadg iobyxmoadgVar, gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f103519zdlpuopuiu = iobyxmoadgVar;
            this.f103518yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f103519zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f103518yggfygwlhe);
            androidx.lifecycle.dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof androidx.lifecycle.dxjokdxxww ? (androidx.lifecycle.dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    public static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ ScanGoScanMatrixFragment f103520iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.gtknphoqwx.zoijcleaow f103521jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ Fragment f103522yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f103523zdlpuopuiu;

        public static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ ScanGoScanMatrixFragment f103524jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            private /* synthetic */ Object f103525yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f103526zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar, ScanGoScanMatrixFragment scanGoScanMatrixFragment) {
                super(2, gxszxtbevoVar);
                this.f103524jyumaefscl = scanGoScanMatrixFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar, this.f103524jyumaefscl);
                iobyxmoadgVar.f103525yggfygwlhe = obj;
                return iobyxmoadgVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f103526zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    wypolnanlu state = this.f103524jyumaefscl.wwaezpbzkn().getState();
                    gxszxtbevo gxszxtbevoVar = this.f103524jyumaefscl.new gxszxtbevo();
                    this.f103526zdlpuopuiu = 1;
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
            this.f103522yggfygwlhe = fragment;
            this.f103521jyumaefscl = zoijcleaowVar;
            this.f103520iwizpuwonk = scanGoScanMatrixFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new wkgbmnqykc(this.f103522yggfygwlhe, this.f103521jyumaefscl, gxszxtbevoVar, this.f103520iwizpuwonk);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f103523zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                androidx.lifecycle.gtknphoqwx lifecycle = this.f103522yggfygwlhe.getViewLifecycleOwner().getLifecycle();
                androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = this.f103521jyumaefscl;
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(null, this.f103520iwizpuwonk);
                this.f103523zdlpuopuiu = 1;
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
        public static final /* synthetic */ int[] f103527iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final /* synthetic */ int[] f103528zoijcleaow;

        static {
            int[] iArr = new int[f22.ppxfxbqfkf.values().length];
            try {
                iArr[f22.ppxfxbqfkf.AMOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f22.ppxfxbqfkf.WEIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f103527iobyxmoadg = iArr;
            int[] iArr2 = new int[f22.iobyxmoadg.values().length];
            try {
                iArr2[f22.iobyxmoadg.DECREASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[f22.iobyxmoadg.INCREASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f103528zoijcleaow = iArr2;
        }
    }

    public ScanGoScanMatrixFragment() {
        super(s12.ppxfxbqfkf.fragment_scan_go_scan_matrix);
        tg.iobyxmoadg iobyxmoadgVar = new tg.iobyxmoadg() { // from class: l32.zoijcleaow
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanGoScanMatrixFragment.jrbgnlbqoe(this.f61434zdlpuopuiu);
            }
        };
        gg.gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new gtknphoqwx(new btonecajqb(this)));
        this.viewModel = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(ru.myspar.scango.impl.screens.scan.matrix.presentation.wkgbmnqykc.class), new draadjrbmk(gtknphoqwxVarIobyxmoadg), new wflxmlrfwp(null, gtknphoqwxVarIobyxmoadg), iobyxmoadgVar);
        this.binding = ys.iobyxmoadg.zoijcleaow(this, ppxfxbqfkf.f103517zdlpuopuiu);
        this.payload = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: l32.eablkybsjg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanGoScanMatrixFragment.weqkydbzbr(this.f61421zdlpuopuiu);
            }
        });
        this.scanSession = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: l32.gxszxtbevo
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanGoScanMatrixFragment.nuxfzjnpeb(this.f61423zdlpuopuiu);
            }
        });
        this.scanBindingArea = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: l32.lqeggnwhkg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanGoScanMatrixFragment.zeieaojujs(this.f61424zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn ageimvtcrz(ScanGoScanMatrixFragment scanGoScanMatrixFragment) {
        scanGoScanMatrixFragment.wwaezpbzkn().okpsazkaxt(ru.myspar.scango.impl.screens.scan.matrix.presentation.zoijcleaow.lqeggnwhkg.f103569iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn auzgnhcxok(ScanGoScanMatrixFragment scanGoScanMatrixFragment, boolean z13) {
        scanGoScanMatrixFragment.wwaezpbzkn().okpsazkaxt(new ru.myspar.scango.impl.screens.scan.matrix.presentation.zoijcleaow.C2510zoijcleaow(z13));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bfopjjpdmp(ScanGoScanMatrixFragment scanGoScanMatrixFragment, View view) {
        scanGoScanMatrixFragment.wwaezpbzkn().okpsazkaxt(ru.myspar.scango.impl.screens.scan.matrix.presentation.zoijcleaow.nufgyqmvbu.f103570iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ScanGoScanMatrixPayload czzsidtyhn() {
        return (ScanGoScanMatrixPayload) this.payload.getValue();
    }

    private final void dvvnrvtcbc(boolean isEnabled) {
        rlfsiqarku().f53616wkgbmnqykc.setImageResource(isEnabled ? s40.gxszxtbevo.ic_flash_on : s40.gxszxtbevo.ic_flash_off);
    }

    private final void fiwbwshyhd(String message) {
        Context contextRequireContext = requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        new m22.lqeggnwhkg.iobyxmoadg(contextRequireContext).dxjokdxxww(s12.wkgbmnqykc.scan_and_go_popup_warning_title).eablkybsjg(message).iobyxmoadg(s12.wkgbmnqykc.scan_and_go_popup_positive_button_text, new tg.iobyxmoadg() { // from class: l32.dxjokdxxww
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanGoScanMatrixFragment.ageimvtcrz(this.f61420zdlpuopuiu);
            }
        }).ppxfxbqfkf().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fyldjkxazc(String message) {
        MaterialTextView tvScanMatrixError = rlfsiqarku().f53607draadjrbmk;
        zdlpuopuiu.dxjokdxxww(tvScanMatrixError, "tvScanMatrixError");
        tvScanMatrixError.setVisibility(0);
        rlfsiqarku().f53607draadjrbmk.setText(message);
    }

    private final void grlcpdaxtj() {
        rlfsiqarku().getRoot().post(new Runnable() { // from class: l32.wkgbmnqykc
            @Override // java.lang.Runnable
            public final void run() {
                ScanGoScanMatrixFragment.mhtqkkgtqm(this.f61433zdlpuopuiu);
            }
        });
    }

    private final void hszhottldk() {
        String string = getString(s12.wkgbmnqykc.scan_and_go_error_on_request);
        zdlpuopuiu.dxjokdxxww(string, "getString(...)");
        fiwbwshyhd(string);
    }

    private final void igdgnonuha() {
        r40.iobyxmoadg.ppxfxbqfkf(ydmasvzmpa(), s12.wkgbmnqykc.camera_initialization_error, null, ss.wkgbmnqykc.gxszxtbevo.NonFatal, 2, null);
    }

    private final void ipoelvxyzq() {
        if (this.sessionInitialized) {
            yfnezrywwk().hcddaimhww();
            this.sessionInitialized = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn iwxlajgraz(ScanGoScanMatrixFragment scanGoScanMatrixFragment, boolean z13) {
        scanGoScanMatrixFragment.wwaezpbzkn().okpsazkaxt(new ru.myspar.scango.impl.screens.scan.matrix.presentation.zoijcleaow.eablkybsjg(z13));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void ixidwrxhsl() {
        yfnezrywwk().cllcsxoeiz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object iyctptxqzt(ScanGoScanMatrixFragment scanGoScanMatrixFragment, ru.myspar.scango.impl.screens.scan.matrix.presentation.ppxfxbqfkf ppxfxbqfkfVar, lg.gxszxtbevo gxszxtbevoVar) {
        scanGoScanMatrixFragment.oipsdeybqn(ppxfxbqfkfVar);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final crxdokpmqz.ppxfxbqfkf jrbgnlbqoe(ScanGoScanMatrixFragment scanGoScanMatrixFragment) {
        return scanGoScanMatrixFragment.new agtfadlqog();
    }

    private final int jztzpxfvev() {
        int i13 = zoijcleaow.f103528zoijcleaow[czzsidtyhn().getScanGoAmountMode().ordinal()];
        if (i13 == 1) {
            return s12.wkgbmnqykc.scan_go_matrix_scan_skip_removing;
        }
        if (i13 == 2) {
            return s12.wkgbmnqykc.scan_go_matrix_scan_skip_adding;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void lrnfpwlwnk() {
        a42.ojitshcjhn.pkzmftpjix(yfnezrywwk(), false, 1, null);
    }

    private final void lxfrhoxuzk() {
        r40.iobyxmoadg.ppxfxbqfkf(ydmasvzmpa(), s12.wkgbmnqykc.camera_not_found, null, ss.wkgbmnqykc.gxszxtbevo.NonFatal, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mhtqkkgtqm(ScanGoScanMatrixFragment scanGoScanMatrixFragment) {
        scanGoScanMatrixFragment.yfnezrywwk().jpowsppfya();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a42.ojitshcjhn nuxfzjnpeb(final ScanGoScanMatrixFragment scanGoScanMatrixFragment) {
        scanGoScanMatrixFragment.sessionInitialized = true;
        PreviewView previewView = scanGoScanMatrixFragment.rlfsiqarku().f53608dxjokdxxww;
        zdlpuopuiu.dxjokdxxww(previewView, "previewView");
        return new a42.ojitshcjhn(previewView, scanGoScanMatrixFragment, scanGoScanMatrixFragment.metgxyhuhe(), scanGoScanMatrixFragment.uwvvkdfqfp(), null, a42.ppxfxbqfkf.MATRIX, new tg.draadjrbmk() { // from class: l32.btonecajqb
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ScanGoScanMatrixFragment.tbqsvytpvh(this.f61418zdlpuopuiu, (String) obj);
            }
        }, new tg.iobyxmoadg() { // from class: l32.gtknphoqwx
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanGoScanMatrixFragment.roivzttewh(this.f61422zdlpuopuiu);
            }
        }, new tg.iobyxmoadg() { // from class: l32.draadjrbmk
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ScanGoScanMatrixFragment.uawqvzlxes(this.f61419zdlpuopuiu);
            }
        }, new tg.draadjrbmk() { // from class: l32.wflxmlrfwp
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ScanGoScanMatrixFragment.auzgnhcxok(this.f61432zdlpuopuiu, ((Boolean) obj).booleanValue());
            }
        }, new tg.draadjrbmk() { // from class: l32.ppxfxbqfkf
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ScanGoScanMatrixFragment.iwxlajgraz(this.f61426zdlpuopuiu, ((Boolean) obj).booleanValue());
            }
        }, 16, null);
    }

    private final void oipsdeybqn(ru.myspar.scango.impl.screens.scan.matrix.presentation.ppxfxbqfkf uiLabel) {
        if (uiLabel instanceof ru.myspar.scango.impl.screens.scan.matrix.presentation.ppxfxbqfkf.btonecajqb) {
            grlcpdaxtj();
            return;
        }
        if (zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.scango.impl.screens.scan.matrix.presentation.ppxfxbqfkf.iobyxmoadg.f103534iobyxmoadg)) {
            lrnfpwlwnk();
            return;
        }
        if (uiLabel instanceof ru.myspar.scango.impl.screens.scan.matrix.presentation.ppxfxbqfkf.gtknphoqwx) {
            ixidwrxhsl();
            return;
        }
        if (uiLabel instanceof ru.myspar.scango.impl.screens.scan.matrix.presentation.ppxfxbqfkf.C2508ppxfxbqfkf) {
            lxfrhoxuzk();
            return;
        }
        if (uiLabel instanceof ru.myspar.scango.impl.screens.scan.matrix.presentation.ppxfxbqfkf.zoijcleaow) {
            igdgnonuha();
            return;
        }
        if (uiLabel instanceof ru.myspar.scango.impl.screens.scan.matrix.presentation.ppxfxbqfkf.wkgbmnqykc) {
            wizcaqwiak();
            return;
        }
        if (zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.scango.impl.screens.scan.matrix.presentation.ppxfxbqfkf.gxszxtbevo.f103533iobyxmoadg)) {
            String string = getString(s12.wkgbmnqykc.scan_go_matrix_delete_scan_wrong_title);
            zdlpuopuiu.dxjokdxxww(string, "getString(...)");
            fyldjkxazc(string);
        } else {
            if (zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.scango.impl.screens.scan.matrix.presentation.ppxfxbqfkf.eablkybsjg.f103531iobyxmoadg)) {
                hszhottldk();
                return;
            }
            if (uiLabel instanceof ru.myspar.scango.impl.screens.scan.matrix.presentation.ppxfxbqfkf.lqeggnwhkg) {
                fyldjkxazc(((ru.myspar.scango.impl.screens.scan.matrix.presentation.ppxfxbqfkf.lqeggnwhkg) uiLabel).iobyxmoadg());
                return;
            }
            if (uiLabel instanceof ru.myspar.scango.impl.screens.scan.matrix.presentation.ppxfxbqfkf.nufgyqmvbu) {
                fiwbwshyhd(((ru.myspar.scango.impl.screens.scan.matrix.presentation.ppxfxbqfkf.nufgyqmvbu) uiLabel).iobyxmoadg());
            } else {
                if (!zdlpuopuiu.eablkybsjg(uiLabel, ru.myspar.scango.impl.screens.scan.matrix.presentation.ppxfxbqfkf.dxjokdxxww.f103530iobyxmoadg)) {
                    throw new NoWhenBranchMatchedException();
                }
                String string2 = getString(s12.wkgbmnqykc.scan_and_go_error_product_not_found);
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

    private final k22.nufgyqmvbu rlfsiqarku() {
        return (k22.nufgyqmvbu) this.binding.iobyxmoadg(this, f103487pkzmftpjix[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn roivzttewh(ScanGoScanMatrixFragment scanGoScanMatrixFragment) {
        scanGoScanMatrixFragment.wwaezpbzkn().okpsazkaxt(ru.myspar.scango.impl.screens.scan.matrix.presentation.zoijcleaow.wkgbmnqykc.f103572iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void skhdrjzrfn(boolean isVisible) {
        AppCompatImageButton btnToggleFlash = rlfsiqarku().f53616wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(btnToggleFlash, "btnToggleFlash");
        btnToggleFlash.setVisibility(!isVisible ? 4 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn tbqsvytpvh(ScanGoScanMatrixFragment scanGoScanMatrixFragment, String it) {
        zdlpuopuiu.btonecajqb(it, "it");
        scanGoScanMatrixFragment.wwaezpbzkn().okpsazkaxt(new ru.myspar.scango.impl.screens.scan.matrix.presentation.zoijcleaow.gxszxtbevo(it));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn uawqvzlxes(ScanGoScanMatrixFragment scanGoScanMatrixFragment) {
        scanGoScanMatrixFragment.wwaezpbzkn().okpsazkaxt(ru.myspar.scango.impl.screens.scan.matrix.presentation.zoijcleaow.ppxfxbqfkf.f103571iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final a42.rgvfuqvkyq uwvvkdfqfp() {
        return (a42.rgvfuqvkyq) this.scanBindingArea.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScanGoScanMatrixPayload weqkydbzbr(ScanGoScanMatrixFragment scanGoScanMatrixFragment) {
        Parcelable parcelable = scanGoScanMatrixFragment.requireArguments().getParcelable("payload");
        zdlpuopuiu.lqeggnwhkg(parcelable);
        return (ScanGoScanMatrixPayload) parcelable;
    }

    private final void wizcaqwiak() {
        r40.iobyxmoadg.ppxfxbqfkf(ydmasvzmpa(), s12.wkgbmnqykc.camera_permission_denied, null, ss.wkgbmnqykc.gxszxtbevo.NonFatal, 2, null);
    }

    private final a42.ojitshcjhn yfnezrywwk() {
        return (a42.ojitshcjhn) this.scanSession.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a42.rgvfuqvkyq zeieaojujs(ScanGoScanMatrixFragment scanGoScanMatrixFragment) {
        ScanWindowView scanWindowView = scanGoScanMatrixFragment.rlfsiqarku().f53606btonecajqb;
        zdlpuopuiu.lqeggnwhkg(scanWindowView);
        return new a42.rgvfuqvkyq(c60.nufgyqmvbu.ppxfxbqfkf(scanWindowView), scanWindowView.getWidth(), scanWindowView.getHeight());
    }

    private final void zfvoamnweg(vdvldrhtss uiState) {
        skhdrjzrfn(uiState.wkgbmnqykc());
        dvvnrvtcbc(uiState.ppxfxbqfkf());
    }

    @Override // e40.iobyxmoadg
    public boolean gxszxtbevo() {
        wwaezpbzkn().okpsazkaxt(ru.myspar.scango.impl.screens.scan.matrix.presentation.zoijcleaow.iobyxmoadg.f103568iobyxmoadg);
        return true;
    }

    public final a42.zoijcleaow metgxyhuhe() {
        a42.zoijcleaow zoijcleaowVar = this.barcodeAnalyzerFactory;
        if (zoijcleaowVar != null) {
            return zoijcleaowVar;
        }
        zdlpuopuiu.pmvmpeiblj("barcodeAnalyzerFactory");
        return null;
    }

    @Override // ru.myspar.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        ipoelvxyzq();
        super.onDestroyView();
    }

    @Override // ru.myspar.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        String string;
        int iJztzpxfvev;
        zdlpuopuiu.btonecajqb(view, "view");
        super.onViewCreated(view, savedInstanceState);
        k22.nufgyqmvbu nufgyqmvbuVarRlfsiqarku = rlfsiqarku();
        AppCompatEditText etProductBarcode = nufgyqmvbuVarRlfsiqarku.f53609eablkybsjg;
        zdlpuopuiu.dxjokdxxww(etProductBarcode, "etProductBarcode");
        etProductBarcode.setOnClickListener(new nufgyqmvbu(new jpowsppfya(), 400L, this));
        MaterialButton btnCancel = nufgyqmvbuVarRlfsiqarku.f53615ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(btnCancel, "btnCancel");
        btnCancel.setOnClickListener(new dxjokdxxww(new jpowsppfya(), 400L, this));
        MaterialButton materialButton = nufgyqmvbuVarRlfsiqarku.f53615ppxfxbqfkf;
        Context context = getContext();
        if (context != null) {
            int i13 = zoijcleaow.f103527iobyxmoadg[czzsidtyhn().getScanGoProductType().ordinal()];
            if (i13 == 1) {
                iJztzpxfvev = jztzpxfvev();
            } else {
                if (i13 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                iJztzpxfvev = s12.wkgbmnqykc.scan_go_matrix_cancel_scan_weight_product;
            }
            string = context.getString(iJztzpxfvev);
        } else {
            string = null;
        }
        materialButton.setText(string);
        nufgyqmvbuVarRlfsiqarku.f53616wkgbmnqykc.setOnClickListener(new View.OnClickListener() { // from class: l32.nufgyqmvbu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ScanGoScanMatrixFragment.bfopjjpdmp(this.f61425zdlpuopuiu, view2);
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
    @Override // ru.myspar.core.base.mvvm.BaseMvvmFragment
    /* JADX INFO: renamed from: sflfametgt, reason: merged with bridge method [inline-methods] */
    public ru.myspar.scango.impl.screens.scan.matrix.presentation.wkgbmnqykc wwaezpbzkn() {
        return (ru.myspar.scango.impl.screens.scan.matrix.presentation.wkgbmnqykc) this.viewModel.getValue();
    }

    public final l32.iobyxmoadg xrmfcynszj() {
        l32.iobyxmoadg iobyxmoadgVar = this.assistedFactory;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("assistedFactory");
        return null;
    }

    public final q40.iobyxmoadg ydmasvzmpa() {
        q40.iobyxmoadg iobyxmoadgVar = this.snackbarManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("snackbarManager");
        return null;
    }
}
