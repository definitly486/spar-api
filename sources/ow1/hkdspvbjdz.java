package ow1;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes6.dex */
public final class hkdspvbjdz extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ir0.iobyxmoadg f74913ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Context f74914zoijcleaow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hkdspvbjdz(Context context, ir0.iobyxmoadg deviceIdManager, pj.pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(deviceIdManager, "deviceIdManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f74914zoijcleaow = context;
        this.f74913ppxfxbqfkf = deviceIdManager;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(gg.wwaezpbzkn wwaezpbzknVar, lg.gxszxtbevo gxszxtbevoVar) {
        SharedPreferences sharedPreferences = this.f74914zoijcleaow.getSharedPreferences("credentials", 0);
        String strZoijcleaow = this.f74913ppxfxbqfkf.zoijcleaow();
        String strIobyxmoadg = this.f74913ppxfxbqfkf.iobyxmoadg();
        String strWkgbmnqykc = this.f74913ppxfxbqfkf.wkgbmnqykc();
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(sharedPreferences);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString("push_token", strZoijcleaow);
        editorEdit.putString("device_id", strIobyxmoadg);
        editorEdit.putString("instance_id", strWkgbmnqykc);
        editorEdit.apply();
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
