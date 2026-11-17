package kk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m3 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final String f57581iobyxmoadg;

    static {
        String strLineSeparator = System.lineSeparator();
        if (strLineSeparator == null) {
            strLineSeparator = "\n";
        }
        f57581iobyxmoadg = strLineSeparator;
    }

    public static ArrayList iobyxmoadg(String str) {
        List listKcexrzcfyt = new mj.rgvfuqvkyq(f57581iobyxmoadg).kcexrzcfyt(str, 0);
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(listKcexrzcfyt, 10));
        Iterator it = listKcexrzcfyt.iterator();
        while (it.hasNext()) {
            String str2 = "│ " + ((String) it.next());
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(str2, "StringBuilder().append(H….append(value).toString()");
            arrayList.add(str2);
        }
        return arrayList;
    }

    public static List zoijcleaow(String str, String message, Throwable th2) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(message, "message");
        ArrayList arrayList = new ArrayList();
        arrayList.add("┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        if (str != null) {
            String strConcat = "│ ".concat(str);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strConcat, "StringBuilder().append(H….append(value).toString()");
            arrayList.add(strConcat);
            String strKcexrzcfyt = cm.gxszxtbevo.dsvhmnatus(cm.rgvfuqvkyq.pmvmpeiblj()).kcexrzcfyt(em.iobyxmoadg.lqeggnwhkg("HH:mm:ss.SSS │ dd.MM.YYYY"));
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strKcexrzcfyt, "run {\n        val localD…ime.format(pattern)\n    }");
            String str2 = "│ " + strKcexrzcfyt;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(str2, "StringBuilder().append(H….append(value).toString()");
            arrayList.add(str2);
            arrayList.add("├┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄");
        }
        byte[] bytes = message.getBytes(mj.wkgbmnqykc.f67326zoijcleaow);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(bytes, "this as java.lang.String).getBytes(charset)");
        int length = bytes.length;
        if (length <= 4000) {
            arrayList.addAll(iobyxmoadg(message));
        } else {
            for (int i13 = 0; i13 < length; i13 += 4000) {
                arrayList.addAll(iobyxmoadg(new String(bytes, i13, zg.gtknphoqwx.btonecajqb(length - i13, 4000), mj.wkgbmnqykc.f67326zoijcleaow)));
            }
        }
        if (th2 != null) {
            arrayList.add("├┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄");
            String localizedMessage = th2.getLocalizedMessage();
            if (localizedMessage == null && (localizedMessage = th2.getMessage()) == null) {
                localizedMessage = "";
            }
            String strConcat2 = "│ ".concat(localizedMessage);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strConcat2, "StringBuilder().append(H….append(value).toString()");
            arrayList.add(strConcat2);
            arrayList.addAll(iobyxmoadg(gg.lqeggnwhkg.ppxfxbqfkf(th2)));
        }
        arrayList.add("└────────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        return hg.jyumaefscl.m(arrayList);
    }
}
