package ib;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import bb.vdvldrhtss;
import java.io.IOException;
import nb.istkbnxepw;
import nb.zdlpuopuiu;
import ob.gtknphoqwx;

/* JADX INFO: loaded from: classes2.dex */
public final class wkgbmnqykc implements vdvldrhtss {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final SharedPreferences.Editor f42322iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f42323zoijcleaow;

    public wkgbmnqykc(Context context, String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        this.f42323zoijcleaow = str;
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.f42322iobyxmoadg = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            this.f42322iobyxmoadg = applicationContext.getSharedPreferences(str2, 0).edit();
        }
    }

    @Override // bb.vdvldrhtss
    public void iobyxmoadg(istkbnxepw istkbnxepwVar) throws IOException {
        if (!this.f42322iobyxmoadg.putString(this.f42323zoijcleaow, gtknphoqwx.zoijcleaow(istkbnxepwVar.toByteArray())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    @Override // bb.vdvldrhtss
    public void zoijcleaow(zdlpuopuiu zdlpuopuiuVar) throws IOException {
        if (!this.f42322iobyxmoadg.putString(this.f42323zoijcleaow, gtknphoqwx.zoijcleaow(zdlpuopuiuVar.toByteArray())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}
