package igdgnonuha;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* JADX INFO: loaded from: classes.dex */
public final class u4 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final u4 f43913iobyxmoadg = new u4();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final int f43914zoijcleaow = 0;

    private u4() {
    }

    public final t4 iobyxmoadg(long j13, long j14, float f13, long j15, long j16, float f14, long j17, long j18, long j19, long j23, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13, int i14, int i15) {
        long jEablkybsjg;
        int i16;
        long jEablkybsjg2;
        long jEablkybsjg3;
        long jEablkybsjg4;
        long jWflxmlrfwp = (i15 & 1) != 0 ? z.f44180iobyxmoadg.iobyxmoadg(draadjrbmkVar, 6).wflxmlrfwp() : j13;
        long j24 = (i15 & 2) != 0 ? jWflxmlrfwp : j14;
        float f15 = (i15 & 4) != 0 ? 0.54f : f13;
        long jAgtfadlqog = (i15 & 8) != 0 ? z.f44180iobyxmoadg.iobyxmoadg(draadjrbmkVar, 6).agtfadlqog() : j15;
        long jDxjokdxxww = (i15 & 16) != 0 ? z.f44180iobyxmoadg.iobyxmoadg(draadjrbmkVar, 6).dxjokdxxww() : j16;
        float f16 = (i15 & 32) != 0 ? 0.38f : f14;
        if ((i15 & 64) != 0) {
            jEablkybsjg = h.bfopjjpdmp.eablkybsjg(h.oipsdeybqn.wflxmlrfwp(jWflxmlrfwp, ulzqkzuiru.f43940iobyxmoadg.zoijcleaow(draadjrbmkVar, 6), 0.0f, 0.0f, 0.0f, 14, null), z.f44180iobyxmoadg.iobyxmoadg(draadjrbmkVar, 6).agtfadlqog());
        } else {
            jEablkybsjg = j17;
        }
        if ((i15 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            i16 = 6;
            jEablkybsjg2 = h.bfopjjpdmp.eablkybsjg(h.oipsdeybqn.wflxmlrfwp(j24, ulzqkzuiru.f43940iobyxmoadg.zoijcleaow(draadjrbmkVar, 6), 0.0f, 0.0f, 0.0f, 14, null), z.f44180iobyxmoadg.iobyxmoadg(draadjrbmkVar, 6).agtfadlqog());
        } else {
            i16 = 6;
            jEablkybsjg2 = j18;
        }
        if ((i15 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
            long jWflxmlrfwp2 = h.oipsdeybqn.wflxmlrfwp(jAgtfadlqog, ulzqkzuiru.f43940iobyxmoadg.zoijcleaow(draadjrbmkVar, i16), 0.0f, 0.0f, 0.0f, 14, null);
            i16 = 6;
            jEablkybsjg3 = h.bfopjjpdmp.eablkybsjg(jWflxmlrfwp2, z.f44180iobyxmoadg.iobyxmoadg(draadjrbmkVar, 6).agtfadlqog());
        } else {
            jEablkybsjg3 = j19;
        }
        if ((i15 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            jEablkybsjg4 = h.bfopjjpdmp.eablkybsjg(h.oipsdeybqn.wflxmlrfwp(jDxjokdxxww, ulzqkzuiru.f43940iobyxmoadg.zoijcleaow(draadjrbmkVar, i16), 0.0f, 0.0f, 0.0f, 14, null), z.f44180iobyxmoadg.iobyxmoadg(draadjrbmkVar, 6).agtfadlqog());
        } else {
            jEablkybsjg4 = j23;
        }
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1032127534, i13, i14, "androidx.compose.material.SwitchDefaults.colors (Switch.kt:341)");
        }
        rlfsiqarku rlfsiqarkuVar = new rlfsiqarku(jWflxmlrfwp, h.oipsdeybqn.wflxmlrfwp(j24, f15, 0.0f, 0.0f, 0.0f, 14, null), jAgtfadlqog, h.oipsdeybqn.wflxmlrfwp(jDxjokdxxww, f16, 0.0f, 0.0f, 0.0f, 14, null), jEablkybsjg, h.oipsdeybqn.wflxmlrfwp(jEablkybsjg2, f15, 0.0f, 0.0f, 0.0f, 14, null), jEablkybsjg3, h.oipsdeybqn.wflxmlrfwp(jEablkybsjg4, f16, 0.0f, 0.0f, 0.0f, 14, null), null);
        if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
            androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
        }
        return rlfsiqarkuVar;
    }
}
