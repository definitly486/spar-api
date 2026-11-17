package kk;

import android.content.Context;
import androidx.constraintlayout.widget.Group;
import com.airbnb.lottie.LottieAnimationView;
import npi.spay.Da;
import npi.spay.Ln;

/* JADX INFO: loaded from: classes3.dex */
public final class kf0 implements sj.nufgyqmvbu {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ Context f57307yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ Da f57308zdlpuopuiu;

    public kf0(Da da3, Context context) {
        this.f57308zdlpuopuiu = da3;
        this.f57307yggfygwlhe = context;
    }

    @Override // sj.nufgyqmvbu
    public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        vu vuVar = (vu) obj;
        Da da3 = this.f57308zdlpuopuiu;
        int i13 = Da.f70542iwizpuwonk;
        a6.iobyxmoadg iobyxmoadgVar = da3.f70570yggfygwlhe;
        if (iobyxmoadgVar == null) {
            throw Ln.f70555zdlpuopuiu;
        }
        qt qtVar = (qt) iobyxmoadgVar;
        Group spaySllGroupSpinner = qtVar.f58236ppxfxbqfkf;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(spaySllGroupSpinner, "spaySllGroupSpinner");
        spaySllGroupSpinner.setVisibility(!mj.kcexrzcfyt.zfvoamnweg(zv.iobyxmoadg(vuVar, this.f57307yggfygwlhe)) ? 0 : 8);
        LottieAnimationView spaySllLottieSpayLogo = qtVar.f58237wkgbmnqykc;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(spaySllLottieSpayLogo, "spaySllLottieSpayLogo");
        spaySllLottieSpayLogo.setVisibility(mj.kcexrzcfyt.zfvoamnweg(zv.iobyxmoadg(vuVar, this.f57307yggfygwlhe)) ? 0 : 8);
        qtVar.f58234eablkybsjg.setLineSpacing(0.0f, 1.25f);
        qtVar.f58234eablkybsjg.setText(zv.iobyxmoadg(vuVar, this.f57307yggfygwlhe));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
