package kk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class okpsazkaxt {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public boolean f57969iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public Method f57970zoijcleaow;

    public final String iobyxmoadg() {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb("ro.kernel.qemu", "propName");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb("", "defaultResult");
        Process processExec = null;
        if (this.f57969iobyxmoadg) {
            processExec = Runtime.getRuntime().exec("getprop \"ro.kernel.qemu\" \"\"");
            String line = new BufferedReader(new InputStreamReader(processExec.getInputStream())).readLine();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(line, "reader.readLine()");
            processExec.destroy();
            return line;
        }
        try {
            if (this.f57970zoijcleaow == null) {
                this.f57970zoijcleaow = Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class);
            }
            Method method = this.f57970zoijcleaow;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(method);
            String str = (String) method.invoke(null, "ro.kernel.qemu", "");
            if (str != null) {
                return str;
            }
        } catch (Exception e13) {
            jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("GET PROPERTIES EXCEPTION").zoijcleaow(e13.toString(), new Object[0]);
            this.f57970zoijcleaow = null;
            this.f57969iobyxmoadg = true;
            try {
                try {
                    processExec = Runtime.getRuntime().exec("getprop \"ro.kernel.qemu\" \"\"");
                    String line2 = new BufferedReader(new InputStreamReader(processExec.getInputStream())).readLine();
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(line2, "reader.readLine()");
                    processExec.destroy();
                    return line2;
                } catch (IOException e14) {
                    jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("GET PROPERTIES EXCEPTION").zoijcleaow(e14.toString(), new Object[0]);
                    if (processExec != null) {
                        processExec.destroy();
                    }
                    return "";
                }
            } catch (Throwable th2) {
                if (processExec != null) {
                    processExec.destroy();
                }
                throw th2;
            }
        }
        return "";
    }
}
