package npi.spay;

import a6.iobyxmoadg;
import a6.zoijcleaow;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.button.MaterialButton;
import kk.ec0;
import kk.ed0;
import kk.f30;
import kk.r80;
import kk.ve;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import spay.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnpi/spay/ud;", "Lnpi/spay/S;", "Lkk/ed0;", "Lkk/f30;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ud extends S<ed0, f30> {
    public static final void hcddaimhww(ud this$0, View view) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        ((ve) ((ed0) this$0.yadqdtsiqt()).f58736ppxfxbqfkf).zoijcleaow(ec0.f56401iobyxmoadg);
    }

    @Override // npi.spay.S
    public final iobyxmoadg cdpycssgdh() {
        View viewInflate = getLayoutInflater().inflate(R.layout.spay_layout_otp_error, (ViewGroup) null, false);
        int i13 = R.id.spay_sloe_actv_subtitle;
        if (((AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i13)) != null) {
            i13 = R.id.spay_sloe_actv_title;
            if (((AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i13)) != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                int i14 = R.id.spay_sloe_lottie_failure;
                if (((LottieAnimationView) zoijcleaow.iobyxmoadg(viewInflate, i14)) != null) {
                    i14 = R.id.spay_sloe_mb_to_payment_methods_button;
                    MaterialButton materialButton = (MaterialButton) zoijcleaow.iobyxmoadg(viewInflate, i14);
                    if (materialButton != null) {
                        f30 f30Var = new f30(constraintLayout, materialButton);
                        zdlpuopuiu.dxjokdxxww(f30Var, "inflate(layoutInflater)");
                        return f30Var;
                    }
                }
                i13 = i14;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i13)));
    }

    @Override // npi.spay.S
    /* JADX INFO: renamed from: iozdgvuglv */
    public final Class getF70578cqumvgiudr() {
        return ed0.class;
    }

    public final void jpowsppfya() {
        iobyxmoadg iobyxmoadgVar = this.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        ((f30) iobyxmoadgVar).f56489zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: kk.vb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                npi.spay.ud.hcddaimhww(this.f58983zdlpuopuiu, view);
            }
        });
    }

    @Override // npi.spay.S
    public final void pkzmftpjix() {
        jpowsppfya();
    }

    @Override // npi.spay.S
    public final void wwaezpbzkn() {
        kk.rj rjVar = r80.f58286zoijcleaow;
        if (rjVar != null) {
            this.f70569jyumaefscl = rjVar.f58386iobyxmoadg.ppxfxbqfkf();
        }
    }
}
