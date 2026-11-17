package npi.spay;

import a6.iobyxmoadg;
import a6.zoijcleaow;
import android.content.Context;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.oxmwwwfdhm;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.button.MaterialButton;
import kk.ff0;
import kk.pl;
import kk.qr;
import kk.r80;
import kk.zt;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.gtknphoqwx;
import sj.wypolnanlu;
import spay.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnpi/spay/e6;", "Lnpi/spay/C6;", "Lkk/zt;", "Lkk/pl;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e6 extends C6<zt, pl> {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final /* synthetic */ int f70573iwizpuwonk = 0;

    public static final void hcddaimhww(e6 this$0, View view) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        ((zt) this$0.yadqdtsiqt()).draadjrbmk(ff0.f56548iobyxmoadg);
    }

    @Override // npi.spay.S
    public final iobyxmoadg cdpycssgdh() {
        View viewInflate = getLayoutInflater().inflate(R.layout.spay_layout_failure_payment, (ViewGroup) null, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i13 = R.id.spay_slfp_actv_local_session_id;
        AppCompatTextView appCompatTextView = (AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i13);
        if (appCompatTextView != null) {
            i13 = R.id.spay_slfp_actv_subtitle;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i13);
            if (appCompatTextView2 != null) {
                i13 = R.id.spay_slfp_actv_title;
                AppCompatTextView appCompatTextView3 = (AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i13);
                if (appCompatTextView3 != null) {
                    i13 = R.id.spay_slfp_lottie_failure;
                    if (((LottieAnimationView) zoijcleaow.iobyxmoadg(viewInflate, i13)) != null) {
                        i13 = R.id.spay_slfp_mb_to_payment_methods;
                        MaterialButton materialButton = (MaterialButton) zoijcleaow.iobyxmoadg(viewInflate, i13);
                        if (materialButton != null) {
                            pl plVar = new pl(constraintLayout, appCompatTextView, appCompatTextView2, appCompatTextView3, materialButton);
                            zdlpuopuiu.dxjokdxxww(plVar, "inflate(layoutInflater)");
                            return plVar;
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
        return zt.class;
    }

    @Override // npi.spay.S
    public final void lmojexxdyd() {
        iobyxmoadg iobyxmoadgVar = this.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        ((pl) iobyxmoadgVar).f58095eablkybsjg.setOnClickListener(new View.OnClickListener() { // from class: kk.us
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                npi.spay.e6.hcddaimhww(this.f58885zdlpuopuiu, view);
            }
        });
    }

    @Override // npi.spay.S
    public final void pkzmftpjix() {
        String string;
        iobyxmoadg iobyxmoadgVar = this.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        AppCompatTextView appCompatTextView = ((pl) iobyxmoadgVar).f58098wkgbmnqykc;
        Resources resources = getResources();
        Bundle arguments = getArguments();
        appCompatTextView.setText(resources.getString(arguments != null ? arguments.getInt("title") : R.string.spay_default_client_exception_message_error_title_text));
        iobyxmoadg iobyxmoadgVar2 = this.f70570yggfygwlhe;
        if (iobyxmoadgVar2 == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        AppCompatTextView appCompatTextView2 = ((pl) iobyxmoadgVar2).f58097ppxfxbqfkf;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string = arguments2.getString("subTitleMsg")) == null) {
            Resources resources2 = getResources();
            Bundle arguments3 = getArguments();
            string = resources2.getString(arguments3 != null ? arguments3.getInt("subTitle") : R.string.spay_default_client_exception_message_error_subtitle_text);
        }
        appCompatTextView2.setText(string);
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
        wypolnanlu wypolnanluVar = ((zt) yadqdtsiqt()).f56731eablkybsjg;
        gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new qr(this, androidx.lifecycle.gtknphoqwx.zoijcleaow.STARTED, wypolnanluVar, null, this), 3, null);
    }
}
