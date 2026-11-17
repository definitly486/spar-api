package npi.spay;

import a6.iobyxmoadg;
import a6.zoijcleaow;
import android.content.Context;
import android.media.MediaPlayer;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.gtknphoqwx;
import androidx.lifecycle.oxmwwwfdhm;
import com.airbnb.lottie.LottieAnimationView;
import kk.aa0;
import kk.ff0;
import kk.g30;
import kk.gh0;
import kk.oz;
import kk.q60;
import kk.r80;
import kk.rd0;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import sj.dxjokdxxww;
import sj.lqeggnwhkg;
import spay.sdk.R;
import spay.sdk.view.SpayBonusOverallCompositeView;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnpi/spay/tr;", "Lnpi/spay/C6;", "Lkk/gh0;", "Lkk/rd0;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class tr extends C6<gh0, rd0> {
    public static final void hcddaimhww(tr this$0, View view) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        ((gh0) this$0.yadqdtsiqt()).draadjrbmk(ff0.f56548iobyxmoadg);
    }

    @Override // npi.spay.S
    public final iobyxmoadg cdpycssgdh() {
        View viewInflate = getLayoutInflater().inflate(R.layout.spay_layout_success_payment, (ViewGroup) null, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i13 = R.id.spay_slsp_actv_local_session_id;
        AppCompatTextView appCompatTextView = (AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i13);
        if (appCompatTextView != null) {
            i13 = R.id.spay_slsp_actv_order_sum;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i13);
            if (appCompatTextView2 != null) {
                i13 = R.id.spay_slsp_actv_shop_name;
                AppCompatTextView appCompatTextView3 = (AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i13);
                if (appCompatTextView3 != null) {
                    i13 = R.id.spay_slsp_lottie_success;
                    if (((LottieAnimationView) zoijcleaow.iobyxmoadg(viewInflate, i13)) != null) {
                        i13 = R.id.spay_slsp_sbocv_bonus;
                        SpayBonusOverallCompositeView spayBonusOverallCompositeView = (SpayBonusOverallCompositeView) zoijcleaow.iobyxmoadg(viewInflate, i13);
                        if (spayBonusOverallCompositeView != null) {
                            i13 = R.id.spay_slsp_tv_close;
                            if (((AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i13)) != null) {
                                i13 = R.id.f5spay_slsp_v_btn_close;
                                CardView cardView = (CardView) zoijcleaow.iobyxmoadg(viewInflate, i13);
                                if (cardView != null) {
                                    rd0 rd0Var = new rd0(constraintLayout, appCompatTextView, appCompatTextView2, appCompatTextView3, spayBonusOverallCompositeView, cardView);
                                    zdlpuopuiu.dxjokdxxww(rd0Var, "inflate(layoutInflater)");
                                    return rd0Var;
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
        return gh0.class;
    }

    @Override // npi.spay.S
    public final void lmojexxdyd() {
        iobyxmoadg iobyxmoadgVar = this.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        ((rd0) iobyxmoadgVar).f58314gxszxtbevo.setOnClickListener(new View.OnClickListener() { // from class: kk.eb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                npi.spay.tr.hcddaimhww(this.f56399zdlpuopuiu, view);
            }
        });
    }

    @Override // npi.spay.S
    public final void pkzmftpjix() {
        Context context = requireContext();
        zdlpuopuiu.dxjokdxxww(context, "requireContext()");
        zdlpuopuiu.btonecajqb(context, "context");
        MediaPlayer.create(context, R.raw.spay_success_payment_sound).start();
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
        iobyxmoadg iobyxmoadgVar = this.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        rd0 rd0Var = (rd0) iobyxmoadgVar;
        Context contextRequireContext = requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext()");
        lqeggnwhkg lqeggnwhkgVarLereixgezr = dxjokdxxww.lereixgezr(((gh0) yadqdtsiqt()).f56704gxszxtbevo);
        gtknphoqwx.zoijcleaow zoijcleaowVar = gtknphoqwx.zoijcleaow.STARTED;
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new oz(this, zoijcleaowVar, lqeggnwhkgVarLereixgezr, null, rd0Var, contextRequireContext), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new g30(this, zoijcleaowVar, dxjokdxxww.lereixgezr(((gh0) yadqdtsiqt()).f56705lqeggnwhkg), null, rd0Var, contextRequireContext), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new q60(this, zoijcleaowVar, ((gh0) yadqdtsiqt()).f56706nufgyqmvbu, null, rd0Var), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new aa0(this, zoijcleaowVar, ((gh0) yadqdtsiqt()).f56731eablkybsjg, null, rd0Var), 3, null);
    }
}
