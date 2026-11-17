package v7;

import android.util.Log;
import com.airbnb.lottie.cllcsxoeiz;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class ppxfxbqfkf implements cllcsxoeiz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Set f116275iobyxmoadg = new HashSet();

    public void eablkybsjg(String str, Throwable th2) {
        if (com.airbnb.lottie.eablkybsjg.f20401iobyxmoadg) {
            Log.d("LOTTIE", str, th2);
        }
    }

    @Override // com.airbnb.lottie.cllcsxoeiz
    public void iobyxmoadg(String str, Throwable th2) {
        if (com.airbnb.lottie.eablkybsjg.f20401iobyxmoadg) {
            Log.d("LOTTIE", str, th2);
        }
    }

    @Override // com.airbnb.lottie.cllcsxoeiz
    public void ppxfxbqfkf(String str, Throwable th2) {
        Set set = f116275iobyxmoadg;
        if (set.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th2);
        set.add(str);
    }

    @Override // com.airbnb.lottie.cllcsxoeiz
    public void wkgbmnqykc(String str) {
        eablkybsjg(str, null);
    }

    @Override // com.airbnb.lottie.cllcsxoeiz
    public void zoijcleaow(String str) {
        ppxfxbqfkf(str, null);
    }
}
