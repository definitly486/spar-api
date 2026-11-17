package npi.spay;

import a6.iobyxmoadg;
import a6.zoijcleaow;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ulzqkzuiru;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.button.MaterialButton;
import kk.db0;
import kk.ek;
import kk.hi;
import kk.lt;
import kk.mp;
import kk.ow;
import kk.pm;
import kk.pu;
import kk.r80;
import kk.ve;
import kk.we0;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.gtknphoqwx;
import spay.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnpi/spay/dl;", "Lnpi/spay/S;", "Lkk/pu;", "Lkk/db0;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class dl extends S<pu, db0> {
    public static final void hcddaimhww(dl this$0, View view) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        pu puVar = (pu) this$0.yadqdtsiqt();
        puVar.getClass();
        ow event = new ow(hi.TOUCH_TOP_BUTTON, we0.STATUS_VIEW, mp.TOUCH, null, null, null, null, 120);
        zdlpuopuiu.btonecajqb(event, "event");
        puVar.f56062iobyxmoadg.iobyxmoadg(event);
        gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(puVar), null, null, new lt(puVar, null), 3, null);
    }

    public static final void jpowsppfya(dl this$0, View view) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        pu puVar = (pu) this$0.yadqdtsiqt();
        puVar.getClass();
        ow event = new ow(hi.TOUCH_BOTTOM_BUTTON, we0.STATUS_VIEW, mp.TOUCH, null, null, null, null, 120);
        zdlpuopuiu.btonecajqb(event, "event");
        puVar.f56062iobyxmoadg.iobyxmoadg(event);
        ((ve) puVar.f58118wkgbmnqykc).zoijcleaow(new pm(ek.f56434iobyxmoadg, false));
    }

    @Override // npi.spay.S
    public final iobyxmoadg cdpycssgdh() {
        View viewInflate = getLayoutInflater().inflate(R.layout.spay_layout_retry_without_bnpl, (ViewGroup) null, false);
        int i13 = R.id.spay_lrwb_actv_subtitle;
        if (((AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i13)) != null) {
            i13 = R.id.spay_lrwb_actv_title;
            if (((AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i13)) != null) {
                i13 = R.id.spay_lrwb_lottie_failure;
                if (((LottieAnimationView) zoijcleaow.iobyxmoadg(viewInflate, i13)) != null) {
                    i13 = R.id.spay_lrwb_mb_leave;
                    MaterialButton materialButton = (MaterialButton) zoijcleaow.iobyxmoadg(viewInflate, i13);
                    if (materialButton != null) {
                        i13 = R.id.spay_lrwb_mb_pay;
                        MaterialButton materialButton2 = (MaterialButton) zoijcleaow.iobyxmoadg(viewInflate, i13);
                        if (materialButton2 != null) {
                            db0 db0Var = new db0((ConstraintLayout) viewInflate, materialButton, materialButton2);
                            zdlpuopuiu.dxjokdxxww(db0Var, "inflate(layoutInflater)");
                            return db0Var;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i13)));
    }

    public final void hkdspvbjdz() {
        iobyxmoadg iobyxmoadgVar = this.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        ((db0) iobyxmoadgVar).f56254ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: kk.gs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                npi.spay.dl.hcddaimhww(this.f56733zdlpuopuiu, view);
            }
        });
        iobyxmoadg iobyxmoadgVar2 = this.f70570yggfygwlhe;
        if (iobyxmoadgVar2 == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        ((db0) iobyxmoadgVar2).f56255zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: kk.hs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                npi.spay.dl.jpowsppfya(this.f56955zdlpuopuiu, view);
            }
        });
    }

    @Override // npi.spay.S
    /* JADX INFO: renamed from: iozdgvuglv */
    public final Class getF70578cqumvgiudr() {
        return pu.class;
    }

    @Override // npi.spay.S
    public final void pkzmftpjix() {
        hkdspvbjdz();
    }

    @Override // npi.spay.S
    public final void wwaezpbzkn() {
        kk.rj rjVar = r80.f58286zoijcleaow;
        if (rjVar != null) {
            this.f70569jyumaefscl = rjVar.f58386iobyxmoadg.ppxfxbqfkf();
        }
    }
}
