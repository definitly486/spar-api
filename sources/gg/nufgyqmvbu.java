package gg;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class nufgyqmvbu {
    public static void iobyxmoadg(Throwable th2, Throwable exception) throws IllegalAccessException, InvocationTargetException {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(th2, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(exception, "exception");
        if (th2 != exception) {
            og.zoijcleaow.f72829iobyxmoadg.iobyxmoadg(th2, exception);
        }
    }

    public static String ppxfxbqfkf(Throwable th2) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(th2, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th2.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        return string;
    }

    public static List zoijcleaow(Throwable th2) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(th2, "<this>");
        return og.zoijcleaow.f72829iobyxmoadg.ppxfxbqfkf(th2);
    }
}
