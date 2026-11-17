package npi.spay;

import a6.iobyxmoadg;
import a6.zoijcleaow;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.gtknphoqwx;
import androidx.lifecycle.oxmwwwfdhm;
import com.google.android.material.button.MaterialButton;
import kk.ak;
import kk.az;
import kk.cl;
import kk.df;
import kk.fm;
import kk.hu;
import kk.jy;
import kk.r80;
import kk.rg;
import kk.uq;
import kk.xi;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import sj.dxjokdxxww;
import sj.lqeggnwhkg;
import spay.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnpi/spay/kd;", "Lnpi/spay/S;", "Lkk/rg;", "Lkk/jy;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class kd extends S<rg, jy> {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public df f70576iwizpuwonk;

    public static final void hcddaimhww(kd this$0, View view) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        ((rg) this$0.yadqdtsiqt()).draadjrbmk(ak.f55827iobyxmoadg);
    }

    public static final void jpowsppfya(kd this$0, View view) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        ((rg) this$0.yadqdtsiqt()).draadjrbmk(xi.f59308iobyxmoadg);
    }

    @Override // npi.spay.S
    public final iobyxmoadg cdpycssgdh() {
        View viewInflate = getLayoutInflater().inflate(R.layout.spay_layout_no_matching_cards, (ViewGroup) null, false);
        int i13 = R.id.spay_lnmc_aciv_image;
        AppCompatImageView appCompatImageView = (AppCompatImageView) zoijcleaow.iobyxmoadg(viewInflate, i13);
        if (appCompatImageView != null) {
            i13 = R.id.spay_lnmc_actv_content;
            AppCompatTextView appCompatTextView = (AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i13);
            if (appCompatTextView != null) {
                i13 = R.id.spay_lnmc_actv_header;
                if (((AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i13)) != null) {
                    i13 = R.id.spay_lnmc_fl_container;
                    if (((LinearLayoutCompat) zoijcleaow.iobyxmoadg(viewInflate, i13)) != null) {
                        i13 = R.id.spay_lnmc_mb_cancel;
                        MaterialButton materialButton = (MaterialButton) zoijcleaow.iobyxmoadg(viewInflate, i13);
                        if (materialButton != null) {
                            i13 = R.id.spay_lnmc_mb_issue_card;
                            MaterialButton materialButton2 = (MaterialButton) zoijcleaow.iobyxmoadg(viewInflate, i13);
                            if (materialButton2 != null) {
                                jy jyVar = new jy((ConstraintLayout) viewInflate, appCompatImageView, appCompatTextView, materialButton, materialButton2);
                                zdlpuopuiu.dxjokdxxww(jyVar, "inflate(layoutInflater)");
                                return jyVar;
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
        return rg.class;
    }

    @Override // npi.spay.S
    public final void lmojexxdyd() {
        iobyxmoadg iobyxmoadgVar = this.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        jy jyVar = (jy) iobyxmoadgVar;
        jyVar.f57232eablkybsjg.setOnClickListener(new View.OnClickListener() { // from class: kk.f00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                npi.spay.kd.hcddaimhww(this.f56477zdlpuopuiu, view);
            }
        });
        jyVar.f57235wkgbmnqykc.setOnClickListener(new View.OnClickListener() { // from class: kk.g00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                npi.spay.kd.jpowsppfya(this.f56606zdlpuopuiu, view);
            }
        });
    }

    @Override // npi.spay.S, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        ((rg) yadqdtsiqt()).draadjrbmk(cl.f56170iobyxmoadg);
    }

    @Override // npi.spay.S, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        ((rg) yadqdtsiqt()).draadjrbmk(fm.f56576iobyxmoadg);
    }

    @Override // npi.spay.S
    public final void wwaezpbzkn() {
        kk.rj rjVar = r80.f58286zoijcleaow;
        if (rjVar != null) {
            this.f70569jyumaefscl = rjVar.f58386iobyxmoadg.ppxfxbqfkf();
            this.f70576iwizpuwonk = rjVar.f58386iobyxmoadg.iobyxmoadg();
        }
    }

    @Override // npi.spay.S
    public final void ylkuphrtab() {
        iobyxmoadg iobyxmoadgVar = this.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        jy jyVar = (jy) iobyxmoadgVar;
        lqeggnwhkg lqeggnwhkgVarLereixgezr = dxjokdxxww.lereixgezr(((rg) yadqdtsiqt()).f58331lqeggnwhkg);
        gtknphoqwx.zoijcleaow zoijcleaowVar = gtknphoqwx.zoijcleaow.STARTED;
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new uq(this, zoijcleaowVar, lqeggnwhkgVarLereixgezr, null, jyVar), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new hu(this, zoijcleaowVar, dxjokdxxww.lereixgezr(((rg) yadqdtsiqt()).f58332nufgyqmvbu), null, jyVar, this), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new az(this, zoijcleaowVar, dxjokdxxww.lereixgezr(((rg) yadqdtsiqt()).f58327btonecajqb), null, this), 3, null);
    }
}
