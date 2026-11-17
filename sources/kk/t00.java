package kk;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes3.dex */
public final class t00 extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ x10 f58601zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t00(x10 x10Var) {
        super(0);
        this.f58601zdlpuopuiu = x10Var;
    }

    @Override // tg.iobyxmoadg
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public final SharedPreferences invoke() {
        Context context = this.f58601zdlpuopuiu.f59237iobyxmoadg;
        String packageName = context.getPackageName();
        this.f58601zdlpuopuiu.getClass();
        Object obj = this.f58601zdlpuopuiu.f59240zoijcleaow;
        gg.zdlpuopuiu.zoijcleaow(obj);
        SharedPreferences sharedPreferencesIobyxmoadg = t5.iobyxmoadg.iobyxmoadg(context, packageName + "session_store", (t5.ppxfxbqfkf) obj, t5.iobyxmoadg.ppxfxbqfkf.AES256_SIV, t5.iobyxmoadg.wkgbmnqykc.AES256_GCM);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(sharedPreferencesIobyxmoadg, "create(\n            /* c…heme.AES256_GCM\n        )");
        return sharedPreferencesIobyxmoadg;
    }
}
