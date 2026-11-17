package npi.spay;

import a6.iobyxmoadg;
import a6.zoijcleaow;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.lifecycle.gtknphoqwx;
import androidx.lifecycle.oxmwwwfdhm;
import com.airbnb.lottie.LottieAnimationView;
import kk.cc;
import kk.qt;
import kk.r80;
import kk.th0;
import kk.zfvoamnweg;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import sj.dxjokdxxww;
import sj.lqeggnwhkg;
import spay.sdk.R;
import spay.sdk.view.SpayDotsLoaderView;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnpi/spay/Da;", "Lnpi/spay/S;", "Lkk/cc;", "Lkk/qt;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Da extends S<cc, qt> {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final /* synthetic */ int f70542iwizpuwonk = 0;

    @Override // npi.spay.S
    public final iobyxmoadg cdpycssgdh() {
        View viewInflate = getLayoutInflater().inflate(R.layout.spay_layout_loading, (ViewGroup) null, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i13 = R.id.spay_sll_actv_local_session_id;
        AppCompatTextView appCompatTextView = (AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i13);
        if (appCompatTextView != null) {
            i13 = R.id.spay_sll_gl_vertical_middle;
            if (((Guideline) zoijcleaow.iobyxmoadg(viewInflate, i13)) != null) {
                i13 = R.id.spay_sll_group_spinner;
                Group group = (Group) zoijcleaow.iobyxmoadg(viewInflate, i13);
                if (group != null) {
                    i13 = R.id.spay_sll_lottie_spay_logo;
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) zoijcleaow.iobyxmoadg(viewInflate, i13);
                    if (lottieAnimationView != null) {
                        i13 = R.id.spay_sll_sdlv_progress;
                        if (((SpayDotsLoaderView) zoijcleaow.iobyxmoadg(viewInflate, i13)) != null) {
                            i13 = R.id.spay_sll_tv_loading_text;
                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) zoijcleaow.iobyxmoadg(viewInflate, i13);
                            if (appCompatTextView2 != null) {
                                qt qtVar = new qt(constraintLayout, appCompatTextView, group, lottieAnimationView, appCompatTextView2);
                                zdlpuopuiu.dxjokdxxww(qtVar, "inflate(layoutInflater)");
                                return qtVar;
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
        return cc.class;
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
        Context contextRequireContext = requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext()");
        lqeggnwhkg lqeggnwhkgVarLereixgezr = dxjokdxxww.lereixgezr(((cc) yadqdtsiqt()).f56122gtknphoqwx);
        gtknphoqwx.zoijcleaow zoijcleaowVar = gtknphoqwx.zoijcleaow.STARTED;
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new th0(this, zoijcleaowVar, lqeggnwhkgVarLereixgezr, null, this, contextRequireContext), 3, null);
        pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new zfvoamnweg(this, zoijcleaowVar, ((cc) yadqdtsiqt()).f56120dxjokdxxww, null, this), 3, null);
    }
}
