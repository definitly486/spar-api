package npi.spay;

import a6.iobyxmoadg;
import a6.zoijcleaow;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.gtknphoqwx;
import androidx.lifecycle.oxmwwwfdhm;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import kk.bf0;
import kk.dh;
import kk.hh;
import kk.ht;
import kk.j40;
import kk.mr;
import kk.mu;
import kk.qk;
import kk.r80;
import kk.ra;
import kk.vp;
import kk.yd;
import kk.zf;
import kk.zn;
import kk.zq;
import kk.zu;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import sj.dxjokdxxww;
import sj.lqeggnwhkg;
import spay.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnpi/spay/i2;", "Lnpi/spay/S;", "Lkk/bf0;", "Lkk/j40;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i2 extends S<bf0, j40> {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final /* synthetic */ int f70574iwizpuwonk = 0;

    public static final void cllcsxoeiz(i2 this$0, View view) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        ((bf0) this$0.yadqdtsiqt()).draadjrbmk(ht.f56957iobyxmoadg);
    }

    public static final void hcddaimhww(j40 this_with, i2 this$0, CompoundButton compoundButton, boolean z13) {
        zdlpuopuiu.btonecajqb(this_with, "$this_with");
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        this_with.f57142eablkybsjg.setEnabled(z13);
        ((bf0) this$0.yadqdtsiqt()).draadjrbmk(new mu(z13));
    }

    public static final void hkdspvbjdz(i2 this$0, View view) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        ((bf0) this$0.yadqdtsiqt()).draadjrbmk(vp.f59052iobyxmoadg);
    }

    public static final void jpowsppfya(i2 this$0, View view) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        ((bf0) this$0.yadqdtsiqt()).draadjrbmk(zq.f59622iobyxmoadg);
    }

    @Override // npi.spay.S
    public final iobyxmoadg cdpycssgdh() {
        View viewIobyxmoadg;
        View viewInflate = getLayoutInflater().inflate(R.layout.spay_layout_parts_order_bnpl, (ViewGroup) null, false);
        int i13 = R.id.spay_cancel_btn;
        MaterialButton materialButton = (MaterialButton) zoijcleaow.iobyxmoadg(viewInflate, i13);
        if (materialButton != null) {
            i13 = R.id.spay_card_selection_button;
            CardView cardView = (CardView) zoijcleaow.iobyxmoadg(viewInflate, i13);
            if (cardView != null) {
                i13 = R.id.spay_commission;
                AppCompatTextView appCompatTextView = (AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i13);
                if (appCompatTextView != null) {
                    i13 = R.id.spay_pay_parts_btn;
                    MaterialButton materialButton2 = (MaterialButton) zoijcleaow.iobyxmoadg(viewInflate, i13);
                    if (materialButton2 != null) {
                        i13 = R.id.spay_payments_list;
                        RecyclerView recyclerView = (RecyclerView) zoijcleaow.iobyxmoadg(viewInflate, i13);
                        if (recyclerView != null && (viewIobyxmoadg = zoijcleaow.iobyxmoadg(viewInflate, (i13 = R.id.spay_slo_include_compound_wallet))) != null) {
                            zf zfVarIobyxmoadg = zf.iobyxmoadg(viewIobyxmoadg);
                            i13 = R.id.spay_slo_include_selected_card;
                            View viewIobyxmoadg2 = zoijcleaow.iobyxmoadg(viewInflate, i13);
                            if (viewIobyxmoadg2 != null) {
                                dh dhVarIobyxmoadg = dh.iobyxmoadg(viewIobyxmoadg2);
                                i13 = R.id.spay_slo_inlude_no_card_error;
                                View viewIobyxmoadg3 = zoijcleaow.iobyxmoadg(viewInflate, i13);
                                if (viewIobyxmoadg3 != null) {
                                    int i14 = R.id.spay_silnc_iv_alert_image;
                                    if (((AppCompatImageView) zoijcleaow.iobyxmoadg(viewIobyxmoadg3, i14)) != null) {
                                        i14 = R.id.spay_silnc_tv_choose_another_way;
                                        if (((AppCompatTextView) zoijcleaow.iobyxmoadg(viewIobyxmoadg3, i14)) != null) {
                                            i14 = R.id.spay_silnc_tv_no_card_text;
                                            if (((AppCompatTextView) zoijcleaow.iobyxmoadg(viewIobyxmoadg3, i14)) != null) {
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
                                                                        j40 j40Var = new j40((NestedScrollView) viewInflate, materialButton, cardView, appCompatTextView, materialButton2, recyclerView, zfVarIobyxmoadg, dhVarIobyxmoadg, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatCheckBox);
                                                                        zdlpuopuiu.dxjokdxxww(j40Var, "inflate(layoutInflater)");
                                                                        return j40Var;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    throw new NullPointerException("Missing required view with ID: ".concat(viewIobyxmoadg3.getResources().getResourceName(i14)));
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
        return bf0.class;
    }

    @Override // npi.spay.S
    public final void lmojexxdyd() {
        iobyxmoadg iobyxmoadgVar = this.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        final j40 j40Var = (j40) iobyxmoadgVar;
        j40Var.f57142eablkybsjg.setOnClickListener(new View.OnClickListener() { // from class: kk.hx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                npi.spay.i2.jpowsppfya(this.f56966zdlpuopuiu, view);
            }
        });
        j40Var.f57150zoijcleaow.setOnClickListener(new View.OnClickListener() { // from class: kk.ix
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                npi.spay.i2.hkdspvbjdz(this.f57104zdlpuopuiu, view);
            }
        });
        j40Var.f57148ppxfxbqfkf.setOnClickListener(new View.OnClickListener() { // from class: kk.jx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                npi.spay.i2.cllcsxoeiz(this.f57231zdlpuopuiu, view);
            }
        });
        j40Var.f57140draadjrbmk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: kk.kx
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z13) {
                npi.spay.i2.hcddaimhww(j40Var, this, compoundButton, z13);
            }
        });
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
        }
    }

    @Override // npi.spay.S
    public final void ylkuphrtab() {
        iobyxmoadg iobyxmoadgVar = this.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        j40 j40Var = (j40) iobyxmoadgVar;
        lqeggnwhkg lqeggnwhkgVarLereixgezr = dxjokdxxww.lereixgezr(((bf0) yadqdtsiqt()).f55994wflxmlrfwp);
        gtknphoqwx.zoijcleaow zoijcleaowVar = gtknphoqwx.zoijcleaow.STARTED;
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new ra(this, zoijcleaowVar, lqeggnwhkgVarLereixgezr, null, j40Var), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new yd(this, zoijcleaowVar, dxjokdxxww.lereixgezr(((bf0) yadqdtsiqt()).f55993vdvldrhtss), null, j40Var), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new hh(this, zoijcleaowVar, dxjokdxxww.lereixgezr(((bf0) yadqdtsiqt()).f55981agtfadlqog), null, this), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new qk(this, zoijcleaowVar, dxjokdxxww.lereixgezr(((bf0) yadqdtsiqt()).f55991oxmwwwfdhm), null, this), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new zn(this, zoijcleaowVar, dxjokdxxww.lereixgezr(((bf0) yadqdtsiqt()).f55992rgvfuqvkyq), null, j40Var, this), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new mr(this, zoijcleaowVar, ((bf0) yadqdtsiqt()).f55982btonecajqb, null, this), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new zu(this, zoijcleaowVar, ((bf0) yadqdtsiqt()).f55986gtknphoqwx, null, j40Var), 3, null);
    }
}
