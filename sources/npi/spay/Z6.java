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
import kk.gf;
import kk.ig;
import kk.mh;
import kk.nq;
import kk.r80;
import kk.un;
import kk.yl;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import npi.spay.Z6;
import sj.dxjokdxxww;
import sj.lqeggnwhkg;
import spay.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnpi/spay/Z6;", "Lnpi/spay/S;", "Lkk/nq;", "Lkk/un;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Z6 extends S<nq, un> {
    public static final void hcddaimhww(Z6 this$0, View view) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        ((nq) this$0.yadqdtsiqt()).agtfadlqog(gf.f56700iobyxmoadg);
    }

    @Override // npi.spay.S
    public final iobyxmoadg cdpycssgdh() {
        View viewInflate = getLayoutInflater().inflate(R.layout.spay_layout_fraud_deny, (ViewGroup) null, false);
        int i13 = R.id.spay_fd_actv_message;
        AppCompatTextView appCompatTextView = (AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i13);
        if (appCompatTextView != null) {
            i13 = R.id.spay_fd_actv_title;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i13);
            if (appCompatTextView2 != null) {
                i13 = R.id.spay_fd_llc_container;
                if (((LinearLayoutCompat) zoijcleaow.iobyxmoadg(viewInflate, i13)) != null) {
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) viewInflate;
                    int i14 = R.id.spay_fdb_mb_to_payment_methods;
                    MaterialButton materialButton = (MaterialButton) zoijcleaow.iobyxmoadg(viewInflate, i14);
                    if (materialButton != null) {
                        un unVar = new un(linearLayoutCompat, appCompatTextView, appCompatTextView2, materialButton);
                        zdlpuopuiu.dxjokdxxww(unVar, "inflate(layoutInflater)");
                        return unVar;
                    }
                    i13 = i14;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i13)));
    }

    @Override // npi.spay.S
    /* JADX INFO: renamed from: iozdgvuglv */
    public final Class getF70578cqumvgiudr() {
        return nq.class;
    }

    @Override // npi.spay.S
    public final void lmojexxdyd() {
        iobyxmoadg iobyxmoadgVar = this.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        ((un) iobyxmoadgVar).f58874wkgbmnqykc.setOnClickListener(new View.OnClickListener() { // from class: kk.an
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Z6.hcddaimhww(this.f55830zdlpuopuiu, view);
            }
        });
    }

    @Override // npi.spay.S, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        ((nq) yadqdtsiqt()).agtfadlqog(ig.f57039iobyxmoadg);
    }

    @Override // npi.spay.S, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        ((nq) yadqdtsiqt()).agtfadlqog(mh.f57648iobyxmoadg);
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
        lqeggnwhkg lqeggnwhkgVarLereixgezr = dxjokdxxww.lereixgezr(((nq) yadqdtsiqt()).f57841lqeggnwhkg);
        gtknphoqwx.zoijcleaow zoijcleaowVar = gtknphoqwx.zoijcleaow.STARTED;
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new yl(this, zoijcleaowVar, lqeggnwhkgVarLereixgezr, null, (un) iobyxmoadgVar), 3, null);
    }
}
