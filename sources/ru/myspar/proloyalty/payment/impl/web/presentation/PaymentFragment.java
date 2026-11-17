package ru.myspar.proloyalty.payment.impl.web.presentation;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.stevsuqkhv;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.dxjokdxxww;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.ribwqtqdhb;
import gg.gtknphoqwx;
import gg.kcexrzcfyt;
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
import ru.myspar.proloyalty.payment.impl.web.presentation.PaymentFragment;
import tg.draadjrbmk;
import yg1.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 H2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001IB\t\b\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u0007J-\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u0007J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u0007J\u000f\u0010\u001b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001b\u0010\u0007J\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b \u0010!R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001b\u00107\u001a\u0002028TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001b\u0010=\u001a\u0002088TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001b\u0010C\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0018\u0010G\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006J"}, d2 = {"Lru/myspar/proloyalty/payment/impl/web/presentation/PaymentFragment;", "Lru/myspar/proloyalty/core/base/mvi/fragment/BaseMviFragment;", "Lyg1/rgvfuqvkyq;", "Lru/myspar/proloyalty/payment/impl/web/presentation/zoijcleaow;", "Lru/myspar/proloyalty/payment/impl/web/presentation/ppxfxbqfkf;", "Lj21/iobyxmoadg;", "<init>", "()V", "event", "Lgg/wwaezpbzkn;", "ribwqtqdhb", "(Lru/myspar/proloyalty/payment/impl/web/presentation/zoijcleaow;)V", "uwvvkdfqfp", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "onPause", "onDestroyView", "", "gxszxtbevo", "()Z", "uiLabel", "xrmfcynszj", "(Lru/myspar/proloyalty/payment/impl/web/presentation/ppxfxbqfkf;)V", "Lys0/wkgbmnqykc;", "esjtqupxsv", "Lys0/wkgbmnqykc;", "ikoacuggdj", "()Lys0/wkgbmnqykc;", "setPaymentWebViewHolder", "(Lys0/wkgbmnqykc;)V", "paymentWebViewHolder", "Lz21/iobyxmoadg;", "lereixgezr", "Lz21/iobyxmoadg;", "okpsazkaxt", "()Lz21/iobyxmoadg;", "setSnackbarManager", "(Lz21/iobyxmoadg;)V", "snackbarManager", "Lru/myspar/proloyalty/payment/impl/web/presentation/iobyxmoadg;", "pmvmpeiblj", "Lgg/gtknphoqwx;", "vipkmwdibw", "()Lru/myspar/proloyalty/payment/impl/web/presentation/iobyxmoadg;", "binder", "Lru/myspar/proloyalty/payment/impl/web/presentation/eablkybsjg;", "zynmafqrjb", "Ltr0/ppxfxbqfkf;", "jztzpxfvev", "()Lru/myspar/proloyalty/payment/impl/web/presentation/eablkybsjg;", "viewImpl", "Ltg1/zoijcleaow;", "istkbnxepw", "Lsr0/ppxfxbqfkf;", "jhduphickx", "()Ltg1/zoijcleaow;", "binding", "Landroid/app/Dialog;", "cdpycssgdh", "Landroid/app/Dialog;", "changePaymentVariantDialog", "yadqdtsiqt", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PaymentFragment extends Hilt_PaymentFragment<rgvfuqvkyq, ru.myspar.proloyalty.payment.impl.web.presentation.zoijcleaow, ru.myspar.proloyalty.payment.impl.web.presentation.ppxfxbqfkf> implements j21.iobyxmoadg {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata */
    private Dialog changePaymentVariantDialog;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    public ys0.wkgbmnqykc paymentWebViewHolder;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    private final sr0.ppxfxbqfkf binding;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    public z21.iobyxmoadg snackbarManager;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx binder;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    private final tr0.ppxfxbqfkf viewImpl;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f99205iozdgvuglv = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(PaymentFragment.class, "viewImpl", "getViewImpl()Lru/myspar/proloyalty/payment/impl/web/presentation/PaymentViewImpl;", 0)), cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(PaymentFragment.class, "binding", "getBinding()Lru/myspar/proloyalty/payment/impl/databinding/FragmentPaymentProloyaltyBinding;", 0))};

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    public static final int f99206lmojexxdyd = 8;

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f99214zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f99214zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f99214zdlpuopuiu).getViewModelStore();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f99215yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f99216zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(tg.iobyxmoadg iobyxmoadgVar, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f99216zdlpuopuiu = iobyxmoadgVar;
            this.f99215yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f99216zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f99215yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    /* JADX INFO: renamed from: ru.myspar.proloyalty.payment.impl.web.presentation.PaymentFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final PaymentFragment iobyxmoadg(PaymentFlowParams args) {
            zdlpuopuiu.btonecajqb(args, "args");
            return (PaymentFragment) g21.iobyxmoadg.zoijcleaow(new PaymentFragment(), args, false, 2, null);
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f99217yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f99218zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(Fragment fragment, gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f99218zdlpuopuiu = fragment;
            this.f99217yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f99217yggfygwlhe);
            dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof dxjokdxxww ? (dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f99218zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class ppxfxbqfkf extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f99219zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(Fragment fragment) {
            super(0);
            this.f99219zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f99219zdlpuopuiu;
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f99220zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f99220zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f99220zdlpuopuiu.invoke();
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f99221zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1, tg1.zoijcleaow.class, "bind", "bind(Landroid/view/View;)Lru/myspar/proloyalty/payment/impl/databinding/FragmentPaymentProloyaltyBinding;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final tg1.zoijcleaow invoke(View p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return tg1.zoijcleaow.iobyxmoadg(p13);
        }
    }

    public PaymentFragment() {
        super(sg1.gxszxtbevo.fragment_payment_proloyalty);
        gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new wkgbmnqykc(new ppxfxbqfkf(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(iobyxmoadg.class), new eablkybsjg(gtknphoqwxVarIobyxmoadg), new gxszxtbevo(null, gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(this, gtknphoqwxVarIobyxmoadg));
        this.viewImpl = tr0.wkgbmnqykc.iobyxmoadg(this, new tg.iobyxmoadg() { // from class: yg1.btonecajqb
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return PaymentFragment.sflfametgt(this.f124966zdlpuopuiu);
            }
        });
        this.binding = sr0.iobyxmoadg.zoijcleaow(this, zoijcleaow.f99221zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn czzsidtyhn(PaymentFragment paymentFragment) {
        paymentFragment.ribwqtqdhb(ru.myspar.proloyalty.payment.impl.web.presentation.zoijcleaow.wkgbmnqykc.f99235iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final tg1.zoijcleaow jhduphickx() {
        return (tg1.zoijcleaow) this.binding.iobyxmoadg(this, f99205iozdgvuglv[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn metgxyhuhe(PaymentFragment paymentFragment) {
        paymentFragment.ribwqtqdhb(ru.myspar.proloyalty.payment.impl.web.presentation.zoijcleaow.eablkybsjg.f99231iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    private final void ribwqtqdhb(ru.myspar.proloyalty.payment.impl.web.presentation.zoijcleaow event) {
        try {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
            pkzmftpjix().jyumaefscl(event);
            kcexrzcfyt.wkgbmnqykc(wwaezpbzkn.f37140iobyxmoadg);
        } catch (Throwable th2) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
            kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn rlfsiqarku(PaymentFragment paymentFragment, String it) {
        zdlpuopuiu.btonecajqb(it, "it");
        paymentFragment.ribwqtqdhb(new ru.myspar.proloyalty.payment.impl.web.presentation.zoijcleaow.gxszxtbevo(it));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ru.myspar.proloyalty.payment.impl.web.presentation.eablkybsjg sflfametgt(PaymentFragment paymentFragment) {
        return new ru.myspar.proloyalty.payment.impl.web.presentation.eablkybsjg(new istkbnxepw(paymentFragment) { // from class: ru.myspar.proloyalty.payment.impl.web.presentation.PaymentFragment.nufgyqmvbu
            @Override // ah.draadjrbmk
            public Object get() {
                return ((PaymentFragment) this.receiver).jhduphickx();
            }
        });
    }

    private final void uwvvkdfqfp() {
        Context contextRequireContext = requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        final yg1.wkgbmnqykc wkgbmnqykcVar = new yg1.wkgbmnqykc(contextRequireContext);
        this.changePaymentVariantDialog = wkgbmnqykcVar;
        wkgbmnqykcVar.ojitshcjhn(new tg.iobyxmoadg() { // from class: yg1.nufgyqmvbu
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return PaymentFragment.yfnezrywwk(this.f124971zdlpuopuiu);
            }
        });
        wkgbmnqykcVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: yg1.dxjokdxxww
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                PaymentFragment.ydmasvzmpa(wkgbmnqykcVar, dialogInterface);
            }
        });
        wkgbmnqykcVar.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ydmasvzmpa(yg1.wkgbmnqykc wkgbmnqykcVar, DialogInterface dialogInterface) {
        wkgbmnqykcVar.agtfadlqog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn yfnezrywwk(PaymentFragment paymentFragment) {
        paymentFragment.ribwqtqdhb(ru.myspar.proloyalty.payment.impl.web.presentation.zoijcleaow.C2373zoijcleaow.f99236iobyxmoadg);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // j21.iobyxmoadg
    public boolean gxszxtbevo() {
        ribwqtqdhb(ru.myspar.proloyalty.payment.impl.web.presentation.zoijcleaow.iobyxmoadg.f99233iobyxmoadg);
        return true;
    }

    public final ys0.wkgbmnqykc ikoacuggdj() {
        ys0.wkgbmnqykc wkgbmnqykcVar = this.paymentWebViewHolder;
        if (wkgbmnqykcVar != null) {
            return wkgbmnqykcVar;
        }
        zdlpuopuiu.pmvmpeiblj("paymentWebViewHolder");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: jztzpxfvev, reason: merged with bridge method [inline-methods] */
    public ru.myspar.proloyalty.payment.impl.web.presentation.eablkybsjg hcddaimhww() {
        return (ru.myspar.proloyalty.payment.impl.web.presentation.eablkybsjg) this.viewImpl.iobyxmoadg(this, f99205iozdgvuglv[0]);
    }

    public final z21.iobyxmoadg okpsazkaxt() {
        z21.iobyxmoadg iobyxmoadgVar = this.snackbarManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("snackbarManager");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        zdlpuopuiu.btonecajqb(inflater, "inflater");
        View viewOnCreateView = super.onCreateView(inflater, container, savedInstanceState);
        if (viewOnCreateView == null) {
            return null;
        }
        ikoacuggdj().wkgbmnqykc(this, viewOnCreateView);
        return viewOnCreateView;
    }

    @Override // ru.myspar.proloyalty.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        ikoacuggdj().lqeggnwhkg();
        Dialog dialog = this.changePaymentVariantDialog;
        if (dialog != null) {
            dialog.dismiss();
        }
        super.onDestroyView();
    }

    @Override // ru.myspar.proloyalty.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        jhduphickx().f110481wkgbmnqykc.onPause();
    }

    @Override // ru.myspar.proloyalty.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        jhduphickx().f110481wkgbmnqykc.onResume();
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseMviFragment, ru.myspar.proloyalty.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        zdlpuopuiu.btonecajqb(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ikoacuggdj().ppxfxbqfkf(new tg.iobyxmoadg() { // from class: yg1.gtknphoqwx
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return PaymentFragment.metgxyhuhe(this.f124969zdlpuopuiu);
            }
        }, new draadjrbmk() { // from class: yg1.draadjrbmk
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return PaymentFragment.rlfsiqarku(this.f124967zdlpuopuiu, (String) obj);
            }
        }, new tg.iobyxmoadg() { // from class: yg1.wflxmlrfwp
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return PaymentFragment.czzsidtyhn(this.f124976zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: vipkmwdibw, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg pkzmftpjix() {
        return (iobyxmoadg) this.binder.getValue();
    }

    @Override // ru.myspar.proloyalty.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: xrmfcynszj, reason: merged with bridge method [inline-methods] */
    public void jpowsppfya(ru.myspar.proloyalty.payment.impl.web.presentation.ppxfxbqfkf uiLabel) {
        zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
        if (uiLabel instanceof ru.myspar.proloyalty.payment.impl.web.presentation.ppxfxbqfkf.C2372ppxfxbqfkf) {
            a31.iobyxmoadg.gxszxtbevo(okpsazkaxt(), String.valueOf(((ru.myspar.proloyalty.payment.impl.web.presentation.ppxfxbqfkf.C2372ppxfxbqfkf) uiLabel).iobyxmoadg()));
        } else if (uiLabel instanceof ru.myspar.proloyalty.payment.impl.web.presentation.ppxfxbqfkf.zoijcleaow) {
            lmojexxdyd(((ru.myspar.proloyalty.payment.impl.web.presentation.ppxfxbqfkf.zoijcleaow) uiLabel).iobyxmoadg());
        } else {
            if (!(uiLabel instanceof ru.myspar.proloyalty.payment.impl.web.presentation.ppxfxbqfkf.iobyxmoadg)) {
                throw new NoWhenBranchMatchedException();
            }
            uwvvkdfqfp();
        }
    }
}
