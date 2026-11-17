package npi.spay;

import a6.iobyxmoadg;
import a6.zoijcleaow;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.lifecycle.gtknphoqwx;
import androidx.lifecycle.oxmwwwfdhm;
import com.google.android.material.button.MaterialButton;
import kk.d4;
import kk.dq;
import kk.f5;
import kk.hf;
import kk.i6;
import kk.l7;
import kk.r80;
import kk.uj;
import kk.y2;
import kk.yb;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import npi.spay.T7;
import sj.dxjokdxxww;
import sj.lqeggnwhkg;
import spay.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnpi/spay/T7;", "Lnpi/spay/S;", "Lkk/uj;", "Lkk/dq;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class T7 extends S<uj, dq> {
    public static final void hcddaimhww(T7 this$0, View view) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        ((uj) this$0.yadqdtsiqt()).agtfadlqog(y2.f59373iobyxmoadg);
    }

    public static final void hkdspvbjdz(T7 this$0, View view) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        ((uj) this$0.yadqdtsiqt()).agtfadlqog(f5.f56494iobyxmoadg);
    }

    public static final void jpowsppfya(T7 this$0, View view) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        ((uj) this$0.yadqdtsiqt()).agtfadlqog(d4.f56225iobyxmoadg);
    }

    @Override // npi.spay.S
    public final iobyxmoadg cdpycssgdh() {
        View viewInflate = getLayoutInflater().inflate(R.layout.spay_layout_fraud_review_hint, (ViewGroup) null, false);
        int i13 = R.id.spay_frh_actv_hyperlink;
        AppCompatTextView appCompatTextView = (AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i13);
        if (appCompatTextView != null) {
            i13 = R.id.spay_frh_actv_message;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i13);
            if (appCompatTextView2 != null) {
                i13 = R.id.spay_frh_actv_title;
                AppCompatTextView appCompatTextView3 = (AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i13);
                if (appCompatTextView3 != null) {
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) viewInflate;
                    i13 = R.id.spay_frh_mb_cancel;
                    MaterialButton materialButton = (MaterialButton) zoijcleaow.iobyxmoadg(viewInflate, i13);
                    if (materialButton != null) {
                        i13 = R.id.spay_frh_mb_confirm;
                        MaterialButton materialButton2 = (MaterialButton) zoijcleaow.iobyxmoadg(viewInflate, i13);
                        if (materialButton2 != null) {
                            dq dqVar = new dq(linearLayoutCompat, appCompatTextView, appCompatTextView2, appCompatTextView3, materialButton, materialButton2);
                            zdlpuopuiu.dxjokdxxww(dqVar, "inflate(layoutInflater)");
                            return dqVar;
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
        return uj.class;
    }

    @Override // npi.spay.S
    public final void lmojexxdyd() {
        iobyxmoadg iobyxmoadgVar = this.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        dq dqVar = (dq) iobyxmoadgVar;
        dqVar.f56309gxszxtbevo.setOnClickListener(new View.OnClickListener() { // from class: kk.jg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                T7.hcddaimhww(this.f57193zdlpuopuiu, view);
            }
        });
        dqVar.f56308eablkybsjg.setOnClickListener(new View.OnClickListener() { // from class: kk.kg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                T7.jpowsppfya(this.f57309zdlpuopuiu, view);
            }
        });
        dqVar.f56313zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: kk.lg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                T7.hkdspvbjdz(this.f57470zdlpuopuiu, view);
            }
        });
    }

    @Override // npi.spay.S, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        ((uj) yadqdtsiqt()).agtfadlqog(i6.f57002iobyxmoadg);
    }

    @Override // npi.spay.S, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        ((uj) yadqdtsiqt()).agtfadlqog(l7.f57411iobyxmoadg);
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
        lqeggnwhkg lqeggnwhkgVarLereixgezr = dxjokdxxww.lereixgezr(((uj) yadqdtsiqt()).f58864lqeggnwhkg);
        gtknphoqwx.zoijcleaow zoijcleaowVar = gtknphoqwx.zoijcleaow.STARTED;
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new hf(this, zoijcleaowVar, lqeggnwhkgVarLereixgezr, null, (dq) iobyxmoadgVar), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new yb(this, zoijcleaowVar, dxjokdxxww.lereixgezr(((uj) yadqdtsiqt()).f58860btonecajqb), null, this), 3, null);
    }
}
