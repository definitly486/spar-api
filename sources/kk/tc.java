package kk;

import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class tc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final gg f58647iobyxmoadg;

    public tc(gg customSharedPreferences) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(customSharedPreferences, "customSharedPreferences");
        this.f58647iobyxmoadg = customSharedPreferences;
    }

    public final String iobyxmoadg() {
        String str = (String) this.f58647iobyxmoadg.b("SPAY_KEY_UUID", "-1");
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, "-1")) {
            return str;
        }
        String string = UUID.randomUUID().toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "randomUUID().toString()");
        this.f58647iobyxmoadg.a("SPAY_KEY_UUID", string);
        return string;
    }
}
