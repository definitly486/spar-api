package npi.spay;

import a6.iobyxmoadg;
import a6.zoijcleaow;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.gtknphoqwx;
import androidx.lifecycle.oxmwwwfdhm;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import kk.fq;
import kk.ii;
import kk.jr;
import kk.ly;
import kk.r80;
import kk.rl;
import kk.ue0;
import kk.wd;
import kk.ze;
import kotlin.Metadata;
import kotlin.jvm.internal.jpowsppfya;
import kotlin.jvm.internal.zdlpuopuiu;
import sj.dxjokdxxww;
import sj.lqeggnwhkg;
import spay.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnpi/spay/Yr;", "Lnpi/spay/S;", "Lkk/ly;", "Lkk/ue0;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Yr extends S<ly, ue0> {
    @Override // npi.spay.S
    public final iobyxmoadg cdpycssgdh() {
        View viewInflate = getLayoutInflater().inflate(R.layout.spay_layout_user_profile, (ViewGroup) null, false);
        int i13 = R.id.spay_slup_aciv_info;
        if (((AppCompatImageView) zoijcleaow.iobyxmoadg(viewInflate, i13)) != null) {
            i13 = R.id.spay_slup_actv_info;
            AppCompatTextView appCompatTextView = (AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i13);
            if (appCompatTextView != null) {
                i13 = R.id.spay_slup_cv_info;
                if (((MaterialCardView) zoijcleaow.iobyxmoadg(viewInflate, i13)) != null) {
                    i13 = R.id.spay_slup_mb_btn_pay;
                    MaterialButton materialButton = (MaterialButton) zoijcleaow.iobyxmoadg(viewInflate, i13);
                    if (materialButton != null) {
                        i13 = R.id.spay_slup_mb_btn_quit;
                        MaterialButton materialButton2 = (MaterialButton) zoijcleaow.iobyxmoadg(viewInflate, i13);
                        if (materialButton2 != null) {
                            i13 = R.id.spay_slup_siv_user_icon;
                            ShapeableImageView shapeableImageView = (ShapeableImageView) zoijcleaow.iobyxmoadg(viewInflate, i13);
                            if (shapeableImageView != null) {
                                i13 = R.id.spay_slup_tv_user_mail;
                                TextView textView = (TextView) zoijcleaow.iobyxmoadg(viewInflate, i13);
                                if (textView != null) {
                                    i13 = R.id.spay_slup_tv_user_name;
                                    TextView textView2 = (TextView) zoijcleaow.iobyxmoadg(viewInflate, i13);
                                    if (textView2 != null) {
                                        i13 = R.id.spay_slup_tv_user_phone;
                                        TextView textView3 = (TextView) zoijcleaow.iobyxmoadg(viewInflate, i13);
                                        if (textView3 != null) {
                                            ue0 ue0Var = new ue0((ConstraintLayout) viewInflate, appCompatTextView, materialButton, materialButton2, shapeableImageView, textView, textView2, textView3);
                                            zdlpuopuiu.dxjokdxxww(ue0Var, "inflate(layoutInflater)");
                                            return ue0Var;
                                        }
                                    }
                                }
                            }
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
        return ly.class;
    }

    @Override // npi.spay.S
    public final void lmojexxdyd() {
        iobyxmoadg iobyxmoadgVar = this.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        MaterialButton materialButton = ((ue0) iobyxmoadgVar).f58846wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(materialButton, "binding.spaySlupMbBtnQuit");
        materialButton.setOnClickListener(new wd(new jpowsppfya(), this));
        iobyxmoadg iobyxmoadgVar2 = this.f70570yggfygwlhe;
        if (iobyxmoadgVar2 == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        MaterialButton materialButton2 = ((ue0) iobyxmoadgVar2).f58845ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(materialButton2, "binding.spaySlupMbBtnPay");
        materialButton2.setOnClickListener(new ze(new jpowsppfya(), this));
    }

    @Override // npi.spay.S, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        ((ly) yadqdtsiqt()).draadjrbmk(fq.f56583iobyxmoadg);
    }

    @Override // npi.spay.S, androidx.fragment.app.Fragment
    public final void onStop() {
        ((ly) yadqdtsiqt()).draadjrbmk(jr.f57218iobyxmoadg);
        super.onStop();
    }

    @Override // npi.spay.S
    public final void pkzmftpjix() {
        lmojexxdyd();
    }

    @Override // npi.spay.S
    public final void wwaezpbzkn() {
        kk.rj rjVar = r80.f58286zoijcleaow;
        if (rjVar != null) {
            this.f70569jyumaefscl = rjVar.f58386iobyxmoadg.ppxfxbqfkf();
            rjVar.f58386iobyxmoadg.iobyxmoadg();
        }
    }

    @Override // npi.spay.S
    public final void ylkuphrtab() {
        Context contextRequireContext = requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext()");
        iobyxmoadg iobyxmoadgVar = this.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        ue0 ue0Var = (ue0) iobyxmoadgVar;
        lqeggnwhkg lqeggnwhkgVarLereixgezr = dxjokdxxww.lereixgezr(((ly) yadqdtsiqt()).f57551lqeggnwhkg);
        gtknphoqwx.zoijcleaow zoijcleaowVar = gtknphoqwx.zoijcleaow.STARTED;
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new ii(this, zoijcleaowVar, lqeggnwhkgVarLereixgezr, null, ue0Var, contextRequireContext), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new rl(this, zoijcleaowVar, dxjokdxxww.lereixgezr(((ly) yadqdtsiqt()).f57552nufgyqmvbu), null, ue0Var), 3, null);
    }
}
