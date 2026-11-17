package kk;

import android.content.Context;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class p40 implements sj.nufgyqmvbu {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ Context f58038yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ kj f58039zdlpuopuiu;

    public p40(kj kjVar, Context context) {
        this.f58039zdlpuopuiu = kjVar;
        this.f58038yggfygwlhe = context;
    }

    @Override // sj.nufgyqmvbu
    public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        String strIobyxmoadg;
        vh vhVar = (vh) obj;
        this.f58039zdlpuopuiu.f57329zoijcleaow.setText(zv.iobyxmoadg(vhVar.f59021iobyxmoadg, this.f58038yggfygwlhe));
        AppCompatTextView spaySlcsActvOrderSumOld = this.f58039zdlpuopuiu.f57327ppxfxbqfkf;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(spaySlcsActvOrderSumOld, "spaySlcsActvOrderSumOld");
        ms msVar = vhVar.f59022zoijcleaow;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(spaySlcsActvOrderSumOld, "<this>");
        if (msVar != null) {
            Context context = spaySlcsActvOrderSumOld.getContext();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(context, "context");
            strIobyxmoadg = zv.iobyxmoadg(msVar, context);
        } else {
            strIobyxmoadg = null;
        }
        spaySlcsActvOrderSumOld.setVisibility(strIobyxmoadg != null ? 0 : 8);
        spaySlcsActvOrderSumOld.setText(strIobyxmoadg);
        spaySlcsActvOrderSumOld.setPaintFlags(16);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
