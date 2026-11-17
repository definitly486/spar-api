package npi.spay;

import a6.iobyxmoadg;
import a6.zoijcleaow;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.oxmwwwfdhm;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.button.MaterialButton;
import kk.b40;
import kk.cy;
import kk.ec0;
import kk.fz;
import kk.n50;
import kk.r80;
import kk.ve;
import kk.wf0;
import kk.wg0;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.gtknphoqwx;
import sj.wypolnanlu;
import spay.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnpi/spay/oi;", "Lnpi/spay/S;", "Lkk/wg0;", "Lkk/n50;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class oi extends S<wg0, n50> {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final /* synthetic */ int f70581iwizpuwonk = 0;

    public static final void hcddaimhww(oi this$0, View view) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        wg0 wg0Var = (wg0) this$0.yadqdtsiqt();
        fz event = fz.f56603iobyxmoadg;
        wg0Var.getClass();
        zdlpuopuiu.btonecajqb(event, "event");
        if (zdlpuopuiu.eablkybsjg(event, cy.f56198iobyxmoadg)) {
            ((ve) wg0Var.f59165wkgbmnqykc).zoijcleaow(ec0.f56401iobyxmoadg);
        } else if (zdlpuopuiu.eablkybsjg(event, event)) {
            ((ve) wg0Var.f59165wkgbmnqykc).zoijcleaow(wf0.f59160iobyxmoadg);
        }
    }

    public static final void jpowsppfya(oi this$0, View view) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        wg0 wg0Var = (wg0) this$0.yadqdtsiqt();
        cy event = cy.f56198iobyxmoadg;
        wg0Var.getClass();
        zdlpuopuiu.btonecajqb(event, "event");
        if (zdlpuopuiu.eablkybsjg(event, event)) {
            ((ve) wg0Var.f59165wkgbmnqykc).zoijcleaow(ec0.f56401iobyxmoadg);
        } else if (zdlpuopuiu.eablkybsjg(event, fz.f56603iobyxmoadg)) {
            ((ve) wg0Var.f59165wkgbmnqykc).zoijcleaow(wf0.f59160iobyxmoadg);
        }
    }

    @Override // npi.spay.S
    public final iobyxmoadg cdpycssgdh() {
        View viewInflate = getLayoutInflater().inflate(R.layout.spay_layout_pay_binding_error, (ViewGroup) null, false);
        int i13 = R.id.spay_slpbine_actv_subtitle;
        AppCompatTextView appCompatTextView = (AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i13);
        if (appCompatTextView != null) {
            i13 = R.id.spay_slpbine_actv_title;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i13);
            if (appCompatTextView2 != null) {
                i13 = R.id.spay_slpbine_lottie_failure;
                if (((LottieAnimationView) zoijcleaow.iobyxmoadg(viewInflate, i13)) != null) {
                    i13 = R.id.spay_slpbine_mb_close_button;
                    MaterialButton materialButton = (MaterialButton) zoijcleaow.iobyxmoadg(viewInflate, i13);
                    if (materialButton != null) {
                        i13 = R.id.spay_slpbine_mb_pay_other_button;
                        MaterialButton materialButton2 = (MaterialButton) zoijcleaow.iobyxmoadg(viewInflate, i13);
                        if (materialButton2 != null) {
                            n50 n50Var = new n50((ConstraintLayout) viewInflate, appCompatTextView, appCompatTextView2, materialButton, materialButton2);
                            zdlpuopuiu.dxjokdxxww(n50Var, "inflate(layoutInflater)");
                            return n50Var;
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
        return wg0.class;
    }

    @Override // npi.spay.S
    public final void lmojexxdyd() {
        iobyxmoadg iobyxmoadgVar = this.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        ((n50) iobyxmoadgVar).f57734eablkybsjg.setOnClickListener(new View.OnClickListener() { // from class: kk.e50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                npi.spay.oi.hcddaimhww(this.f56383zdlpuopuiu, view);
            }
        });
        iobyxmoadg iobyxmoadgVar2 = this.f70570yggfygwlhe;
        if (iobyxmoadgVar2 == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        ((n50) iobyxmoadgVar2).f57737wkgbmnqykc.setOnClickListener(new View.OnClickListener() { // from class: kk.f50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                npi.spay.oi.jpowsppfya(this.f56495zdlpuopuiu, view);
            }
        });
    }

    @Override // npi.spay.S
    public final void pkzmftpjix() {
        iobyxmoadg iobyxmoadgVar = this.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        AppCompatTextView appCompatTextView = ((n50) iobyxmoadgVar).f57738zoijcleaow;
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("subTitle") : null;
        if (string == null) {
            string = "";
        }
        appCompatTextView.setText(string);
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

    @Override // npi.spay.S
    public final void ylkuphrtab() {
        wypolnanlu wypolnanluVar = ((wg0) yadqdtsiqt()).f59164gxszxtbevo;
        gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new b40(this, androidx.lifecycle.gtknphoqwx.zoijcleaow.STARTED, wypolnanluVar, null, this), 3, null);
    }
}
