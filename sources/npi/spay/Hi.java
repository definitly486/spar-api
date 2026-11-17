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
import kk.ec0;
import kk.f0;
import kk.h1;
import kk.p4;
import kk.p60;
import kk.r5;
import kk.r80;
import kk.ve;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import npi.spay.Hi;
import pj.gtknphoqwx;
import spay.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnpi/spay/Hi;", "Lnpi/spay/S;", "Lkk/r5;", "Lkk/p60;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Hi extends S<r5, p60> {
    public static final void hcddaimhww(Hi this$0, View view) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        r5 r5Var = (r5) this$0.yadqdtsiqt();
        h1 event = h1.f56815iobyxmoadg;
        r5Var.getClass();
        zdlpuopuiu.btonecajqb(event, "event");
        if (zdlpuopuiu.eablkybsjg(event, f0.f56476iobyxmoadg)) {
            ((ve) r5Var.f58270wkgbmnqykc).zoijcleaow(ec0.f56401iobyxmoadg);
        } else if (zdlpuopuiu.eablkybsjg(event, event)) {
            gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(r5Var), null, null, new p4(r5Var, null), 3, null);
        }
    }

    public static final void jpowsppfya(Hi this$0, View view) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        r5 r5Var = (r5) this$0.yadqdtsiqt();
        f0 event = f0.f56476iobyxmoadg;
        r5Var.getClass();
        zdlpuopuiu.btonecajqb(event, "event");
        if (zdlpuopuiu.eablkybsjg(event, event)) {
            ((ve) r5Var.f58270wkgbmnqykc).zoijcleaow(ec0.f56401iobyxmoadg);
        } else if (zdlpuopuiu.eablkybsjg(event, h1.f56815iobyxmoadg)) {
            gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(r5Var), null, null, new p4(r5Var, null), 3, null);
        }
    }

    @Override // npi.spay.S
    public final iobyxmoadg cdpycssgdh() {
        View viewInflate = getLayoutInflater().inflate(R.layout.spay_layout_pay_bonuses_error, (ViewGroup) null, false);
        int i13 = R.id.spay_slpbe_actv_subtitle;
        if (((AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i13)) != null) {
            i13 = R.id.spay_slpbe_actv_title;
            if (((AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i13)) != null) {
                i13 = R.id.spay_slpbe_lottie_failure;
                if (((LottieAnimationView) zoijcleaow.iobyxmoadg(viewInflate, i13)) != null) {
                    i13 = R.id.spay_slpbe_mb_to_payment_methods_button;
                    MaterialButton materialButton = (MaterialButton) zoijcleaow.iobyxmoadg(viewInflate, i13);
                    if (materialButton != null) {
                        i13 = R.id.spay_slpbe_mb_try_again_button;
                        MaterialButton materialButton2 = (MaterialButton) zoijcleaow.iobyxmoadg(viewInflate, i13);
                        if (materialButton2 != null) {
                            p60 p60Var = new p60((ConstraintLayout) viewInflate, materialButton, materialButton2);
                            zdlpuopuiu.dxjokdxxww(p60Var, "inflate(layoutInflater)");
                            return p60Var;
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
        return r5.class;
    }

    @Override // npi.spay.S
    public final void pkzmftpjix() {
        iobyxmoadg iobyxmoadgVar = this.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        ((p60) iobyxmoadgVar).f58045ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: kk.k3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Hi.hcddaimhww(this.f57256zdlpuopuiu, view);
            }
        });
        iobyxmoadg iobyxmoadgVar2 = this.f70570yggfygwlhe;
        if (iobyxmoadgVar2 == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        ((p60) iobyxmoadgVar2).f58046zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: kk.l3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Hi.jpowsppfya(this.f57384zdlpuopuiu, view);
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
