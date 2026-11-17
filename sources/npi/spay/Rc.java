package npi.spay;

import a6.iobyxmoadg;
import a6.zoijcleaow;
import android.content.Context;
import android.media.MediaPlayer;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ulzqkzuiru;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.button.MaterialButton;
import kk.cb;
import kk.cx;
import kk.ec;
import kk.ec0;
import kk.r7;
import kk.r80;
import kk.t8;
import kk.ve;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import npi.spay.Rc;
import pj.gtknphoqwx;
import spay.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnpi/spay/Rc;", "Lnpi/spay/S;", "Lkk/t8;", "Lkk/cx;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Rc extends S<t8, cx> {
    public static final void hcddaimhww(Rc this$0, View view) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        t8 t8Var = (t8) this$0.yadqdtsiqt();
        ec event = ec.f56400iobyxmoadg;
        t8Var.getClass();
        zdlpuopuiu.btonecajqb(event, "event");
        if (zdlpuopuiu.eablkybsjg(event, cb.f56118iobyxmoadg)) {
            ((ve) t8Var.f58629wkgbmnqykc).zoijcleaow(ec0.f56401iobyxmoadg);
        } else if (zdlpuopuiu.eablkybsjg(event, event)) {
            gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(t8Var), null, null, new r7(t8Var, null), 3, null);
        }
    }

    public static final void jpowsppfya(Rc this$0, View view) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        t8 t8Var = (t8) this$0.yadqdtsiqt();
        cb event = cb.f56118iobyxmoadg;
        t8Var.getClass();
        zdlpuopuiu.btonecajqb(event, "event");
        if (zdlpuopuiu.eablkybsjg(event, event)) {
            ((ve) t8Var.f58629wkgbmnqykc).zoijcleaow(ec0.f56401iobyxmoadg);
        } else if (zdlpuopuiu.eablkybsjg(event, ec.f56400iobyxmoadg)) {
            gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(t8Var), null, null, new r7(t8Var, null), 3, null);
        }
    }

    @Override // npi.spay.S
    public final iobyxmoadg cdpycssgdh() {
        View viewInflate = getLayoutInflater().inflate(R.layout.spay_layout_no_internet, (ViewGroup) null, false);
        int i13 = R.id.spaySlniActvSubtitle;
        if (((AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i13)) != null) {
            i13 = R.id.spaySlniActvTitle;
            if (((AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i13)) != null) {
                i13 = R.id.spaySlniLottieFailure;
                if (((LottieAnimationView) zoijcleaow.iobyxmoadg(viewInflate, i13)) != null) {
                    i13 = R.id.spaySlniMbToPaymentMethodsButton;
                    MaterialButton materialButton = (MaterialButton) zoijcleaow.iobyxmoadg(viewInflate, i13);
                    if (materialButton != null) {
                        i13 = R.id.spaySlniMbTryAgainButton;
                        MaterialButton materialButton2 = (MaterialButton) zoijcleaow.iobyxmoadg(viewInflate, i13);
                        if (materialButton2 != null) {
                            cx cxVar = new cx((ConstraintLayout) viewInflate, materialButton, materialButton2);
                            zdlpuopuiu.dxjokdxxww(cxVar, "inflate(layoutInflater)");
                            return cxVar;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i13)));
    }

    @Override // npi.spay.S
    /* JADX INFO: renamed from: iozdgvuglv */
    public final Class getF70578cqumvgiudr() {
        return t8.class;
    }

    @Override // npi.spay.S
    public final void pkzmftpjix() {
        iobyxmoadg iobyxmoadgVar = this.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        ((cx) iobyxmoadgVar).f56196ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: kk.je
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Rc.hcddaimhww(this.f57183zdlpuopuiu, view);
            }
        });
        iobyxmoadg iobyxmoadgVar2 = this.f70570yggfygwlhe;
        if (iobyxmoadgVar2 == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        ((cx) iobyxmoadgVar2).f56197zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: kk.ke
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Rc.jpowsppfya(this.f57293zdlpuopuiu, view);
            }
        });
        Context context = requireContext();
        zdlpuopuiu.dxjokdxxww(context, "requireContext()");
        zdlpuopuiu.btonecajqb(context, "context");
        MediaPlayer.create(context, R.raw.spay_failure_payment_sound).start();
    }

    @Override // npi.spay.S
    public final void wwaezpbzkn() {
        kk.rj rjVar = r80.f58286zoijcleaow;
        if (rjVar != null) {
            this.f70569jyumaefscl = rjVar.f58386iobyxmoadg.ppxfxbqfkf();
        }
    }
}
