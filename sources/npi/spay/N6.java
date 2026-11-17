package npi.spay;

import a6.iobyxmoadg;
import a6.zoijcleaow;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.lifecycle.gtknphoqwx;
import androidx.lifecycle.oxmwwwfdhm;
import com.google.android.material.button.MaterialButton;
import kk.ad;
import kk.c4;
import kk.m8;
import kk.r80;
import kk.w1;
import kk.x2;
import kk.zo;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import npi.spay.N6;
import sj.dxjokdxxww;
import sj.lqeggnwhkg;
import spay.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnpi/spay/N6;", "Lnpi/spay/S;", "Lkk/ad;", "Lkk/zo;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class N6 extends S<ad, zo> {
    public static final void hcddaimhww(N6 this$0, View view) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        ((ad) this$0.yadqdtsiqt()).agtfadlqog(w1.f59082iobyxmoadg);
    }

    @Override // npi.spay.S
    public final iobyxmoadg cdpycssgdh() {
        View viewInflate = getLayoutInflater().inflate(R.layout.spay_layout_fraud_deny_block, (ViewGroup) null, false);
        int i13 = R.id.spay_fdb_actv_message;
        AppCompatTextView appCompatTextView = (AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i13);
        if (appCompatTextView != null) {
            i13 = R.id.spay_fdb_actv_title;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i13);
            if (appCompatTextView2 != null) {
                i13 = R.id.spay_fdb_llc_container;
                if (((LinearLayoutCompat) zoijcleaow.iobyxmoadg(viewInflate, i13)) != null) {
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) viewInflate;
                    int i14 = R.id.spay_fdb_mb_return_to_shop;
                    MaterialButton materialButton = (MaterialButton) zoijcleaow.iobyxmoadg(viewInflate, i14);
                    if (materialButton != null) {
                        zo zoVar = new zo(linearLayoutCompat, appCompatTextView, appCompatTextView2, materialButton);
                        zdlpuopuiu.dxjokdxxww(zoVar, "inflate(layoutInflater)");
                        return zoVar;
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
        return ad.class;
    }

    @Override // npi.spay.S
    public final void lmojexxdyd() {
        iobyxmoadg iobyxmoadgVar = this.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        ((zo) iobyxmoadgVar).f59614wkgbmnqykc.setOnClickListener(new View.OnClickListener() { // from class: kk.p9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                N6.hcddaimhww(this.f58058zdlpuopuiu, view);
            }
        });
    }

    @Override // npi.spay.S, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        ((ad) yadqdtsiqt()).agtfadlqog(x2.f59241iobyxmoadg);
    }

    @Override // npi.spay.S, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        ((ad) yadqdtsiqt()).agtfadlqog(c4.f56088iobyxmoadg);
    }

    @Override // npi.spay.S, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        zdlpuopuiu.btonecajqb(view, "view");
        super.onViewCreated(view, bundle);
        lmojexxdyd();
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
        lqeggnwhkg lqeggnwhkgVarLereixgezr = dxjokdxxww.lereixgezr(((ad) yadqdtsiqt()).f55807lqeggnwhkg);
        gtknphoqwx.zoijcleaow zoijcleaowVar = gtknphoqwx.zoijcleaow.STARTED;
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new m8(this, zoijcleaowVar, lqeggnwhkgVarLereixgezr, null, (zo) iobyxmoadgVar), 3, null);
    }
}
