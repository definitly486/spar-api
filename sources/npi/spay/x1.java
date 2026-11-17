package npi.spay;

import a6.iobyxmoadg;
import a6.zoijcleaow;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.gtknphoqwx;
import androidx.lifecycle.oxmwwwfdhm;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import kk.c6;
import kk.d20;
import kk.gh;
import kk.ji;
import kk.lr;
import kk.nj;
import kk.ny;
import kk.pk;
import kk.r50;
import kk.r80;
import kk.rc0;
import kk.um;
import kk.y10;
import kk.yu;
import kk.z80;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import sj.dxjokdxxww;
import sj.lqeggnwhkg;
import spay.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnpi/spay/x1;", "Lnpi/spay/S;", "Lkk/c6;", "Lkk/y10;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class x1 extends S<c6, y10> {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final /* synthetic */ int f70592iwizpuwonk = 0;

    public static final void hcddaimhww(x1 this$0, View view) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        ((c6) this$0.yadqdtsiqt()).draadjrbmk(gh.f56703iobyxmoadg);
    }

    public static final void hkdspvbjdz(x1 this$0, View view) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        ((c6) this$0.yadqdtsiqt()).draadjrbmk(ji.f57199iobyxmoadg);
    }

    public static final void jpowsppfya(x1 this$0, CompoundButton compoundButton, boolean z13) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        ((c6) this$0.yadqdtsiqt()).draadjrbmk(new um(z13));
        iobyxmoadg iobyxmoadgVar = this$0.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        ((y10) iobyxmoadgVar).f59370ppxfxbqfkf.setEnabled(z13);
    }

    @Override // npi.spay.S
    public final iobyxmoadg cdpycssgdh() {
        View viewInflate = getLayoutInflater().inflate(R.layout.spay_layout_order_bnpl, (ViewGroup) null, false);
        int i13 = R.id.spay_commission;
        AppCompatTextView appCompatTextView = (AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i13);
        if (appCompatTextView != null) {
            i13 = R.id.spay_lob_mb_apply_payment_in_installments;
            MaterialButton materialButton = (MaterialButton) zoijcleaow.iobyxmoadg(viewInflate, i13);
            if (materialButton != null) {
                i13 = R.id.spay_lob_mb_decline_payment_in_installments;
                MaterialButton materialButton2 = (MaterialButton) zoijcleaow.iobyxmoadg(viewInflate, i13);
                if (materialButton2 != null) {
                    i13 = R.id.spay_slob_actv_agreement_conditions;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i13);
                    if (appCompatTextView2 != null) {
                        i13 = R.id.spay_slob_actv_header;
                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i13);
                        if (appCompatTextView3 != null) {
                            i13 = R.id.spay_slob_actv_total;
                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i13);
                            if (appCompatTextView4 != null) {
                                i13 = R.id.spay_slob_chck_agreement_conditions;
                                AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) zoijcleaow.iobyxmoadg(viewInflate, i13);
                                if (appCompatCheckBox != null) {
                                    i13 = R.id.spay_slob_fl_total;
                                    if (((FrameLayout) zoijcleaow.iobyxmoadg(viewInflate, i13)) != null) {
                                        i13 = R.id.spay_slob_root;
                                        if (((ConstraintLayout) zoijcleaow.iobyxmoadg(viewInflate, i13)) != null) {
                                            i13 = R.id.spay_slob_rv_bnpl_payment_count;
                                            RecyclerView recyclerView = (RecyclerView) zoijcleaow.iobyxmoadg(viewInflate, i13);
                                            if (recyclerView != null) {
                                                y10 y10Var = new y10((NestedScrollView) viewInflate, appCompatTextView, materialButton, materialButton2, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatCheckBox, recyclerView);
                                                zdlpuopuiu.dxjokdxxww(y10Var, "inflate(layoutInflater)");
                                                return y10Var;
                                            }
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

    public final void cllcsxoeiz() {
        iobyxmoadg iobyxmoadgVar = this.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        ((y10) iobyxmoadgVar).f59369nufgyqmvbu.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: kk.ye0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z13) {
                npi.spay.x1.jpowsppfya(this.f59434iobyxmoadg, compoundButton, z13);
            }
        });
    }

    @Override // npi.spay.S
    /* JADX INFO: renamed from: iozdgvuglv */
    public final Class getF70578cqumvgiudr() {
        return c6.class;
    }

    @Override // npi.spay.S
    public final void lmojexxdyd() {
        iobyxmoadg iobyxmoadgVar = this.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        ((y10) iobyxmoadgVar).f59370ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: kk.ze0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                npi.spay.x1.hcddaimhww(this.f59571zdlpuopuiu, view);
            }
        });
        iobyxmoadg iobyxmoadgVar2 = this.f70570yggfygwlhe;
        if (iobyxmoadgVar2 == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        ((y10) iobyxmoadgVar2).f59371wkgbmnqykc.setOnClickListener(new View.OnClickListener() { // from class: kk.af0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                npi.spay.x1.hkdspvbjdz(this.f55812zdlpuopuiu, view);
            }
        });
    }

    @Override // npi.spay.S, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        ((c6) yadqdtsiqt()).draadjrbmk(nj.f57833iobyxmoadg);
    }

    @Override // npi.spay.S, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        ((c6) yadqdtsiqt()).draadjrbmk(pk.f58089iobyxmoadg);
    }

    @Override // npi.spay.S
    public final void pkzmftpjix() {
        cllcsxoeiz();
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
        lqeggnwhkg lqeggnwhkgVarLereixgezr = dxjokdxxww.lereixgezr(((c6) yadqdtsiqt()).f56104nufgyqmvbu);
        gtknphoqwx.zoijcleaow zoijcleaowVar = gtknphoqwx.zoijcleaow.STARTED;
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new lr(this, zoijcleaowVar, lqeggnwhkgVarLereixgezr, null, this), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new yu(this, zoijcleaowVar, dxjokdxxww.lereixgezr(((c6) yadqdtsiqt()).f56101gtknphoqwx), null, this), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new ny(this, zoijcleaowVar, dxjokdxxww.lereixgezr(((c6) yadqdtsiqt()).f56099dxjokdxxww), null, this), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new d20(this, zoijcleaowVar, dxjokdxxww.lereixgezr(((c6) yadqdtsiqt()).f56097btonecajqb), null, this), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new r50(this, zoijcleaowVar, ((c6) yadqdtsiqt()).f56103lqeggnwhkg, null, this), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new z80(this, zoijcleaowVar, ((c6) yadqdtsiqt()).f56098draadjrbmk, null, this), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new rc0(this, zoijcleaowVar, ((c6) yadqdtsiqt()).f56105wflxmlrfwp, null, this), 3, null);
    }
}
