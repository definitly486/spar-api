package kk;

import android.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class mc extends jc2.iobyxmoadg.C1098iobyxmoadg {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final List f57630gxszxtbevo = hg.jyumaefscl.rgvfuqvkyq("authCode", "clientId", "dynatraceApplicationId", "client_id");

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final Map f57631eablkybsjg = hg.tzroggbefp.draadjrbmk(gg.cqumvgiudr.iobyxmoadg(2, "VERBOSE"), gg.cqumvgiudr.iobyxmoadg(3, "DEBUG"), gg.cqumvgiudr.iobyxmoadg(4, "INFO"), gg.cqumvgiudr.iobyxmoadg(5, "WARN"), gg.cqumvgiudr.iobyxmoadg(6, "ERROR"), gg.cqumvgiudr.iobyxmoadg(7, "ASSERT"));

    public static String rgvfuqvkyq(String str) {
        for (String str2 : f57630gxszxtbevo) {
            str = new mj.rgvfuqvkyq("\"?" + str2 + "\"?.*?[&,]").rgvfuqvkyq(str, "\"" + str2 + "\":\"***\"");
        }
        return str;
    }

    @Override // jc2.iobyxmoadg.C1098iobyxmoadg, jc2.iobyxmoadg.ppxfxbqfkf
    public final void wflxmlrfwp(int i13, String str, String message, Throwable th2) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(message, "message");
        Iterator it = m3.zoijcleaow(str, message, th2).iterator();
        while (it.hasNext()) {
            String strRgvfuqvkyq = rgvfuqvkyq((String) it.next());
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f57631eablkybsjg.get(Integer.valueOf(i13)), this.f57631eablkybsjg.get(3))) {
                Log.println(i13, "SPaySdk", strRgvfuqvkyq);
            }
        }
    }
}
