package kk;

import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class y1 extends zk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final pc f59363iobyxmoadg;

    public y1(pc reducer) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(reducer, "reducer");
        this.f59363iobyxmoadg = reducer;
    }

    public final Object iobyxmoadg(pj.pkzmftpjix pkzmftpjixVar, z20 z20Var) {
        String string = UUID.randomUUID().toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "randomUUID().toString()");
        StringBuilder sb3 = new StringBuilder();
        for (int i13 = 0; i13 < string.length(); i13++) {
            char cCharAt = string.charAt(i13);
            if (cCharAt != '-') {
                sb3.append(cCharAt);
            }
        }
        String string2 = sb3.toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string2, "filterNotTo(StringBuilder(), predicate).toString()");
        String upperCase = mj.kcexrzcfyt.y(string2, 12).toUpperCase(Locale.ROOT);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        ((ve) this.f59363iobyxmoadg).zoijcleaow(new rd(upperCase));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
