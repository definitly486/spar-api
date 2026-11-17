package ge;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class agtfadlqog {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final ub.ppxfxbqfkf f36886zoijcleaow = ub.ppxfxbqfkf.ppxfxbqfkf(agtfadlqog.class).zoijcleaow(ub.vdvldrhtss.gtknphoqwx(dxjokdxxww.class)).zoijcleaow(ub.vdvldrhtss.gtknphoqwx(Context.class)).gxszxtbevo(new ub.lqeggnwhkg() { // from class: ge.iozdgvuglv
        @Override // ub.lqeggnwhkg
        public final Object iobyxmoadg(ub.wkgbmnqykc wkgbmnqykcVar) {
            return new agtfadlqog((Context) wkgbmnqykcVar.iobyxmoadg(Context.class));
        }
    }).wkgbmnqykc();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    protected final Context f36887iobyxmoadg;

    public agtfadlqog(Context context) {
        this.f36887iobyxmoadg = context;
    }

    public synchronized String iobyxmoadg() {
        String string = zoijcleaow().getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        zoijcleaow().edit().putString("ml_sdk_instance_id", string2).apply();
        return string2;
    }

    protected final SharedPreferences zoijcleaow() {
        return this.f36887iobyxmoadg.getSharedPreferences("com.google.mlkit.internal", 0);
    }
}
