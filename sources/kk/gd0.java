package kk;

import androidx.cardview.widget.CardView;

/* JADX INFO: loaded from: classes3.dex */
public final class gd0 implements sj.nufgyqmvbu {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ u00 f56697zdlpuopuiu;

    public gd0(u00 u00Var) {
        this.f56697zdlpuopuiu = u00Var;
    }

    @Override // sj.nufgyqmvbu
    public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        int iOrdinal = ((po) obj).ordinal();
        if (iOrdinal == 0) {
            CardView cardView = this.f56697zdlpuopuiu.f58749wkgbmnqykc;
            cardView.setClickable(false);
            cardView.setFocusable(false);
        } else if (iOrdinal == 1) {
            CardView cardView2 = this.f56697zdlpuopuiu.f58749wkgbmnqykc;
            cardView2.setClickable(true);
            cardView2.setFocusable(true);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
