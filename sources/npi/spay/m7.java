package npi.spay;

import a6.iobyxmoadg;
import a6.zoijcleaow;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.lifecycle.oxmwwwfdhm;
import com.google.android.material.button.MaterialButton;
import kk.au;
import kk.e10;
import kk.ev;
import kk.hr;
import kk.iw;
import kk.r80;
import kk.vs;
import kk.w50;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.gtknphoqwx;
import sj.dxjokdxxww;
import sj.lqeggnwhkg;
import spay.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnpi/spay/m7;", "Lnpi/spay/S;", "Lkk/w50;", "Lkk/hr;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class m7 extends S<w50, hr> {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final /* synthetic */ int f70580iwizpuwonk = 0;

    public static final void hcddaimhww(m7 this$0, View view) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        ((w50) this$0.yadqdtsiqt()).agtfadlqog(vs.f59058iobyxmoadg);
    }

    public static final void jpowsppfya(m7 this$0, View view) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        ((w50) this$0.yadqdtsiqt()).agtfadlqog(au.f55841iobyxmoadg);
    }

    @Override // npi.spay.S
    public final iobyxmoadg cdpycssgdh() {
        View viewInflate = getLayoutInflater().inflate(R.layout.spay_layout_fraud_review_otp, (ViewGroup) null, false);
        int i13 = R.id.spay_fro_actv_message;
        AppCompatTextView appCompatTextView = (AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i13);
        if (appCompatTextView != null) {
            i13 = R.id.spay_fro_actv_title;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i13);
            if (appCompatTextView2 != null) {
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) viewInflate;
                i13 = R.id.spay_fro_mb_cancel;
                MaterialButton materialButton = (MaterialButton) zoijcleaow.iobyxmoadg(viewInflate, i13);
                if (materialButton != null) {
                    i13 = R.id.spay_fro_mb_confirm;
                    MaterialButton materialButton2 = (MaterialButton) zoijcleaow.iobyxmoadg(viewInflate, i13);
                    if (materialButton2 != null) {
                        hr hrVar = new hr(linearLayoutCompat, appCompatTextView, appCompatTextView2, materialButton, materialButton2);
                        zdlpuopuiu.dxjokdxxww(hrVar, "inflate(layoutInflater)");
                        return hrVar;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i13)));
    }

    @Override // npi.spay.S
    /* JADX INFO: renamed from: iozdgvuglv */
    public final Class getF70578cqumvgiudr() {
        return w50.class;
    }

    @Override // npi.spay.S
    public final void lmojexxdyd() {
        iobyxmoadg iobyxmoadgVar = this.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        hr hrVar = (hr) iobyxmoadgVar;
        hrVar.f56950eablkybsjg.setOnClickListener(new View.OnClickListener() { // from class: kk.j20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                npi.spay.m7.hcddaimhww(this.f57134zdlpuopuiu, view);
            }
        });
        hrVar.f56953wkgbmnqykc.setOnClickListener(new View.OnClickListener() { // from class: kk.k20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                npi.spay.m7.jpowsppfya(this.f57255zdlpuopuiu, view);
            }
        });
    }

    @Override // npi.spay.S, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        ((w50) yadqdtsiqt()).agtfadlqog(ev.f56470iobyxmoadg);
    }

    @Override // npi.spay.S, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        ((w50) yadqdtsiqt()).agtfadlqog(iw.f57099iobyxmoadg);
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
        lqeggnwhkg lqeggnwhkgVarLereixgezr = dxjokdxxww.lereixgezr(((w50) yadqdtsiqt()).f59096lqeggnwhkg);
        gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new e10(this, androidx.lifecycle.gtknphoqwx.zoijcleaow.STARTED, lqeggnwhkgVarLereixgezr, null, this), 3, null);
    }
}
