package gr0;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements ir0.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final cq1.iobyxmoadg f38357iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final SharedPreferences f38358zoijcleaow;

    public iobyxmoadg(Context context, cq1.iobyxmoadg idService) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(idService, "idService");
        this.f38357iobyxmoadg = idService;
        this.f38358zoijcleaow = context.getSharedPreferences("DeviceIdSharedPreferences", 0);
    }

    private final String lqeggnwhkg() {
        String string = UUID.randomUUID().toString();
        zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        SharedPreferences preferences = this.f38358zoijcleaow;
        zdlpuopuiu.dxjokdxxww(preferences, "preferences");
        SharedPreferences.Editor editorEdit = preferences.edit();
        editorEdit.putString("DeviceIdSharedPreferencesDeviceId", string);
        editorEdit.apply();
        return string;
    }

    @Override // ir0.iobyxmoadg
    public void eablkybsjg(String str) {
        SharedPreferences preferences = this.f38358zoijcleaow;
        zdlpuopuiu.dxjokdxxww(preferences, "preferences");
        SharedPreferences.Editor editorEdit = preferences.edit();
        editorEdit.putString("DeviceIdSharedPreferencesPushToken", str);
        editorEdit.apply();
    }

    @Override // ir0.iobyxmoadg
    public void gxszxtbevo(String str) {
        SharedPreferences preferences = this.f38358zoijcleaow;
        zdlpuopuiu.dxjokdxxww(preferences, "preferences");
        SharedPreferences.Editor editorEdit = preferences.edit();
        editorEdit.putString("DeviceIdSharedPreferencesInstallationId", str);
        editorEdit.apply();
    }

    @Override // ir0.iobyxmoadg
    public String iobyxmoadg() {
        String string = this.f38358zoijcleaow.getString("DeviceIdSharedPreferencesDeviceId", null);
        return string == null ? lqeggnwhkg() : string;
    }

    @Override // ir0.iobyxmoadg
    public void ppxfxbqfkf(String value) {
        zdlpuopuiu.btonecajqb(value, "value");
        SharedPreferences preferences = this.f38358zoijcleaow;
        zdlpuopuiu.dxjokdxxww(preferences, "preferences");
        SharedPreferences.Editor editorEdit = preferences.edit();
        editorEdit.putString("DeviceIdSharedPreferencesDeviceId", value);
        editorEdit.apply();
    }

    @Override // ir0.iobyxmoadg
    public String wkgbmnqykc() {
        return this.f38358zoijcleaow.getString("DeviceIdSharedPreferencesInstallationId", null);
    }

    @Override // ir0.iobyxmoadg
    public String zoijcleaow() {
        return this.f38358zoijcleaow.getString("DeviceIdSharedPreferencesPushToken", null);
    }
}
