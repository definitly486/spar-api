package kk;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import spay.sdk.view.otpTextView.SpayOtpTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class x9 implements sj.nufgyqmvbu {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ Context f59274yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ nz f59275zdlpuopuiu;

    public x9(nz nzVar, Context context) {
        this.f59275zdlpuopuiu = nzVar;
        this.f59274yggfygwlhe = context;
    }

    @Override // sj.nufgyqmvbu
    public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        vu vuVar = (vu) obj;
        TextView observeViewModel$lambda$17$lambda$10$lambda$9 = this.f59275zdlpuopuiu.f57862eablkybsjg;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(observeViewModel$lambda$17$lambda$10$lambda$9, "observeViewModel$lambda$17$lambda$10$lambda$9");
        observeViewModel$lambda$17$lambda$10$lambda$9.setVisibility(vuVar == null ? 4 : 0);
        observeViewModel$lambda$17$lambda$10$lambda$9.setText(vuVar != null ? zv.iobyxmoadg(vuVar, this.f59274yggfygwlhe) : null);
        if (vuVar != null) {
            SpayOtpTextView spayOtpTextView = this.f59275zdlpuopuiu.f57867wkgbmnqykc;
            spayOtpTextView.f107894d = true;
            ArrayList arrayList = spayOtpTextView.f107891a;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i13 = 0; i13 < size; i13++) {
                    fh0.ppxfxbqfkf((fh0) arrayList.get(i13), "", false, spayOtpTextView.f107894d, false, 10);
                    ((fh0) arrayList.get(i13)).setViewState(-1);
                }
            }
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
