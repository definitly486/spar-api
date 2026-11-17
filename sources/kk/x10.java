package kk;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import spay.seamlessAuth.core.data.model.entity.AppTokenEntity;

/* JADX INFO: loaded from: classes3.dex */
public final class x10 implements mc0 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final Context f59237iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final SharedPreferences f59238ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final gg.gtknphoqwx f59239wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final Object f59240zoijcleaow;

    public x10(Context context) {
        Object objWkgbmnqykc;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        this.f59237iobyxmoadg = context;
        try {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(new t5.ppxfxbqfkf.iobyxmoadg(context).ppxfxbqfkf(t5.ppxfxbqfkf.zoijcleaow.AES256_GCM).iobyxmoadg());
        } catch (Throwable th2) {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = gg.kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
        this.f59240zoijcleaow = objWkgbmnqykc;
        this.f59238ppxfxbqfkf = iobyxmoadg(this.f59237iobyxmoadg, 0, new t00(this));
        this.f59239wkgbmnqykc = gg.draadjrbmk.zoijcleaow(mz.f57701zdlpuopuiu);
    }

    @Override // kk.mc0
    public final String a() {
        return "session_store";
    }

    @Override // kk.mc0
    public final SharedPreferences iobyxmoadg(Context context, int i13, tg.iobyxmoadg iobyxmoadgVar) {
        return cb0.iobyxmoadg(this, context, i13, iobyxmoadgVar);
    }

    public final AppTokenEntity zoijcleaow() {
        Object objWkgbmnqykc;
        ReentrantReadWriteLock.ReadLock lock = ((ReentrantReadWriteLock) this.f59239wkgbmnqykc.getValue()).readLock();
        lock.lock();
        try {
            SharedPreferences sharedPreferences = this.f59238ppxfxbqfkf;
            String string = sharedPreferences != null ? sharedPreferences.getString(ir.ppxfxbqfkf("63324a6c636c39705a46396863484266644739725a57343d"), null) : null;
            lock.unlock();
            if (string == null) {
                return null;
            }
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
            return (AppTokenEntity) obj;
        } catch (Throwable th3) {
            lock.unlock();
            throw th3;
        }
    }
}
