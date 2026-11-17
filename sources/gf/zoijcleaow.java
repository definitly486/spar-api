package gf;

import android.content.Context;
import hm.lqeggnwhkg;
import hm.nufgyqmvbu;
import hm.ppxfxbqfkf;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
final class zoijcleaow extends lqeggnwhkg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f37088eablkybsjg;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Context f37089wkgbmnqykc;

    zoijcleaow(Context context, String str) {
        this.f37089wkgbmnqykc = context;
        this.f37088eablkybsjg = str;
    }

    @Override // hm.lqeggnwhkg
    protected void zoijcleaow() {
        InputStream inputStreamOpen = null;
        try {
            try {
                inputStreamOpen = this.f37089wkgbmnqykc.getAssets().open(this.f37088eablkybsjg);
                ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(inputStreamOpen);
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (IOException unused) {
                    }
                }
                nufgyqmvbu.eablkybsjg(ppxfxbqfkfVar);
            } catch (IOException e13) {
                throw new IllegalStateException(this.f37088eablkybsjg + " missing from assets", e13);
            }
        } catch (Throwable th2) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (IOException unused2) {
                }
            }
            throw th2;
        }
    }
}
