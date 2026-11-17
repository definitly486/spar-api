package kk;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes3.dex */
public final class ma0 extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ rb0 f57617zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma0(rb0 rb0Var) {
        super(0);
        this.f57617zdlpuopuiu = rb0Var;
    }

    @Override // tg.iobyxmoadg
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public final SharedPreferences invoke() {
        Context context = this.f57617zdlpuopuiu.f58301iobyxmoadg;
        String packageName = context.getPackageName();
        this.f57617zdlpuopuiu.getClass();
        Object obj = this.f57617zdlpuopuiu.f58302ppxfxbqfkf;
        gg.zdlpuopuiu.zoijcleaow(obj);
        SharedPreferences sharedPreferencesIobyxmoadg = t5.iobyxmoadg.iobyxmoadg(context, packageName + "at_store", (t5.ppxfxbqfkf) obj, t5.iobyxmoadg.ppxfxbqfkf.AES256_SIV, t5.iobyxmoadg.wkgbmnqykc.AES256_GCM);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(sharedPreferencesIobyxmoadg, "create(\n            /* c…heme.AES256_GCM\n        )");
        return sharedPreferencesIobyxmoadg;
    }
}
