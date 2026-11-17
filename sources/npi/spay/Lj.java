package npi.spay;

import a6.iobyxmoadg;
import a6.zoijcleaow;
import android.content.Context;
import android.media.MediaPlayer;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.oxmwwwfdhm;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.button.MaterialButton;
import kk.ec0;
import kk.ga;
import kk.r80;
import kk.v6;
import kk.ve;
import kk.z90;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import npi.spay.Lj;
import pj.gtknphoqwx;
import sj.dxjokdxxww;
import sj.lqeggnwhkg;
import spay.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnpi/spay/Lj;", "Lnpi/spay/C6;", "Lkk/ga;", "Lkk/z90;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Lj extends C6<ga, z90> {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final /* synthetic */ int f70554iwizpuwonk = 0;

    public static final void hcddaimhww(Lj this$0, View view) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        ((ve) ((ga) this$0.yadqdtsiqt()).f58736ppxfxbqfkf).zoijcleaow(ec0.f56401iobyxmoadg);
    }

    @Override // npi.spay.S
    public final iobyxmoadg cdpycssgdh() {
        View viewInflate = getLayoutInflater().inflate(R.layout.spay_layout_processing_payment, (ViewGroup) null, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i13 = R.id.spay_slpp_actv_processing_message;
        AppCompatTextView appCompatTextView = (AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i13);
        if (appCompatTextView != null) {
            i13 = R.id.spay_slpp_actv_title;
            if (((AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i13)) != null) {
                i13 = R.id.spay_slpp_lottie_success;
                if (((LottieAnimationView) zoijcleaow.iobyxmoadg(viewInflate, i13)) != null) {
                    i13 = R.id.spay_slpp_mb_btn_close;
                    MaterialButton materialButton = (MaterialButton) zoijcleaow.iobyxmoadg(viewInflate, i13);
                    if (materialButton != null) {
                        z90 z90Var = new z90(constraintLayout, appCompatTextView, materialButton);
                        zdlpuopuiu.dxjokdxxww(z90Var, "inflate(layoutInflater)");
                        return z90Var;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i13)));
    }

    @Override // npi.spay.S
    /* JADX INFO: renamed from: iozdgvuglv */
    public final Class getF70578cqumvgiudr() {
        return ga.class;
    }

    @Override // npi.spay.S
    public final void lmojexxdyd() {
        iobyxmoadg iobyxmoadgVar = this.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        ((z90) iobyxmoadgVar).f59548ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: kk.y7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Lj.hcddaimhww(this.f59392zdlpuopuiu, view);
            }
        });
    }

    @Override // npi.spay.S
    public final void pkzmftpjix() {
        lmojexxdyd();
        Context context = requireContext();
        zdlpuopuiu.dxjokdxxww(context, "requireContext()");
        zdlpuopuiu.btonecajqb(context, "context");
        MediaPlayer.create(context, R.raw.spay_processing_payment_sound).start();
    }

    @Override // npi.spay.S
    public final void wwaezpbzkn() {
        kk.rj rjVar = r80.f58286zoijcleaow;
        if (rjVar != null) {
            this.f70569jyumaefscl = rjVar.f58386iobyxmoadg.ppxfxbqfkf();
        }
    }

    @Override // npi.spay.S
    public final void ylkuphrtab() {
        lqeggnwhkg lqeggnwhkgVarLereixgezr = dxjokdxxww.lereixgezr(((ga) yadqdtsiqt()).f56681gxszxtbevo);
        gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new v6(this, androidx.lifecycle.gtknphoqwx.zoijcleaow.STARTED, lqeggnwhkgVarLereixgezr, null, this), 3, null);
    }
}
