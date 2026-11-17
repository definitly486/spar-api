package kk;

import android.content.Context;
import android.content.res.Resources;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public final class id implements sj.nufgyqmvbu {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ Context f57028jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ npi.spay.ke f57029yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ nz f57030zdlpuopuiu;

    public id(nz nzVar, npi.spay.ke keVar, Context context) {
        this.f57030zdlpuopuiu = nzVar;
        this.f57029yggfygwlhe = keVar;
        this.f57028jyumaefscl = context;
    }

    @Override // sj.nufgyqmvbu
    public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        String string;
        Long l13;
        m10 m10Var = (m10) obj;
        TextView observeViewModel$lambda$17$lambda$12$lambda$11 = this.f57030zdlpuopuiu.f57865lqeggnwhkg;
        observeViewModel$lambda$17$lambda$12$lambda$11.setClickable(m10Var.f57570eablkybsjg);
        observeViewModel$lambda$17$lambda$12$lambda$11.setFocusable(m10Var.f57570eablkybsjg);
        npi.spay.ke keVar = this.f57029yggfygwlhe;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(observeViewModel$lambda$17$lambda$12$lambda$11, "observeViewModel$lambda$17$lambda$12$lambda$11");
        int i13 = npi.spay.ke.f70577esjtqupxsv;
        keVar.getClass();
        if (m10Var.f57574zoijcleaow == null || (l13 = m10Var.f57573wkgbmnqykc) == null) {
            string = keVar.getString(m10Var.f57571iobyxmoadg);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "{\n            getString(…nState.textRes)\n        }");
        } else {
            int iLongValue = (int) (l13.longValue() / 1000);
            Resources resources = observeViewModel$lambda$17$lambda$12$lambda$11.getResources();
            Integer num = m10Var.f57574zoijcleaow;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(num);
            String quantityString = resources.getQuantityString(num.intValue(), iLongValue, Integer.valueOf(iLongValue));
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(quantityString, "resources.getQuantityStr…sRes!!, seconds, seconds)");
            string = keVar.getString(m10Var.f57571iobyxmoadg, quantityString);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "{\n            val second…xtRes, plurals)\n        }");
        }
        observeViewModel$lambda$17$lambda$12$lambda$11.setText(string);
        observeViewModel$lambda$17$lambda$12$lambda$11.setTextColor(androidx.core.content.iobyxmoadg.getColor(this.f57028jyumaefscl, m10Var.f57572ppxfxbqfkf));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
