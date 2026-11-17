package kk;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import spay.seamlessAuth.core.data.model.entity.AppTokenEntity;

/* JADX INFO: loaded from: classes3.dex */
public final class rb0 implements mc0, f80 {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final gg.gtknphoqwx f58300eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final Context f58301iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final Object f58302ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final SharedPreferences f58303wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final x10 f58304zoijcleaow;

    public rb0(Context context, x10 sessionStoreSP) {
        Object objWkgbmnqykc;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sessionStoreSP, "sessionStoreSP");
        this.f58301iobyxmoadg = context;
        this.f58304zoijcleaow = sessionStoreSP;
        try {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(new t5.ppxfxbqfkf.iobyxmoadg(context).ppxfxbqfkf(t5.ppxfxbqfkf.zoijcleaow.AES256_GCM).iobyxmoadg());
        } catch (Throwable th2) {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
        this.f58302ppxfxbqfkf = objWkgbmnqykc;
        this.f58303wkgbmnqykc = iobyxmoadg(this.f58301iobyxmoadg, 0, new ma0(this));
        this.f58300eablkybsjg = gg.draadjrbmk.zoijcleaow(i90.f57014zdlpuopuiu);
    }

    @Override // kk.mc0
    public final String a() {
        return "at_store";
    }

    @Override // kk.mc0
    public final SharedPreferences iobyxmoadg(Context context, int i13, tg.iobyxmoadg iobyxmoadgVar) {
        return cb0.iobyxmoadg(this, context, i13, iobyxmoadgVar);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007d  */
    public final w40 zoijcleaow() {
        Object objWkgbmnqykc;
        AppTokenEntity appTokenEntityZoijcleaow;
        ReentrantReadWriteLock.ReadLock lock = ((ReentrantReadWriteLock) this.f58300eablkybsjg.getValue()).readLock();
        lock.lock();
        try {
            SharedPreferences sharedPreferences = this.f58303wkgbmnqykc;
            String string = sharedPreferences != null ? sharedPreferences.getString("sid_app_token", null) : null;
            lock.unlock();
            if (string != null) {
                try {
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
                    objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(eo.f56445iobyxmoadg.gtknphoqwx(string, AppTokenEntity.class));
                } catch (Throwable th2) {
                    gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
                    objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
                }
                Object obj = gg.kcexrzcfyt.draadjrbmk(objWkgbmnqykc) ? null : objWkgbmnqykc;
                if (gg.kcexrzcfyt.draadjrbmk(objWkgbmnqykc) || obj == null) {
                    Log.w("PARSER", "Gson couldn't deserialize " + AppTokenEntity.class + " - " + string + " \nCause: " + gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc));
                }
                appTokenEntityZoijcleaow = (AppTokenEntity) obj;
                if (appTokenEntityZoijcleaow == null) {
                    appTokenEntityZoijcleaow = this.f58304zoijcleaow.zoijcleaow();
                }
            } else {
                appTokenEntityZoijcleaow = this.f58304zoijcleaow.zoijcleaow();
            }
            if (appTokenEntityZoijcleaow == null) {
                return null;
            }
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(appTokenEntityZoijcleaow, "<this>");
            return new w40(appTokenEntityZoijcleaow.getToken(), appTokenEntityZoijcleaow.getExpiresTime(), appTokenEntityZoijcleaow.getTypeAuth());
        } catch (Throwable th3) {
            lock.unlock();
            throw th3;
        }
    }
}
