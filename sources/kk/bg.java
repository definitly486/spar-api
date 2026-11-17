package kk;

import android.content.Context;
import android.widget.TextView;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: loaded from: classes3.dex */
public final class bg implements sj.nufgyqmvbu {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ Context f56001yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ ue0 f56002zdlpuopuiu;

    public bg(ue0 ue0Var, Context context) {
        this.f56002zdlpuopuiu = ue0Var;
        this.f56001yggfygwlhe = context;
    }

    @Override // sj.nufgyqmvbu
    public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        st stVar = (st) obj;
        this.f56002zdlpuopuiu.f58842gxszxtbevo.setText(zv.iobyxmoadg(stVar.f58577iobyxmoadg, this.f56001yggfygwlhe));
        ShapeableImageView observeViewModel$lambda$7$lambda$5$lambda$2 = this.f56002zdlpuopuiu.f58841eablkybsjg;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(observeViewModel$lambda$7$lambda$5$lambda$2, "observeViewModel$lambda$7$lambda$5$lambda$2");
        int i13 = stVar.f58579zoijcleaow;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(observeViewModel$lambda$7$lambda$5$lambda$2, "<this>");
        observeViewModel$lambda$7$lambda$5$lambda$2.setImageDrawable(i1.nufgyqmvbu.gxszxtbevo(observeViewModel$lambda$7$lambda$5$lambda$2.getResources(), i13, null));
        observeViewModel$lambda$7$lambda$5$lambda$2.invalidate();
        String str = stVar.f58578ppxfxbqfkf;
        if (str != null) {
            this.f56002zdlpuopuiu.f58844lqeggnwhkg.setText(str);
            TextView spaySlupTvUserPhone = this.f56002zdlpuopuiu.f58844lqeggnwhkg;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(spaySlupTvUserPhone, "spaySlupTvUserPhone");
            spaySlupTvUserPhone.setVisibility(!mj.kcexrzcfyt.zfvoamnweg(str) ? 0 : 8);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
