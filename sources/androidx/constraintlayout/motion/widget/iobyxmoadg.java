package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.Log;
import android.view.View;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.CharBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class iobyxmoadg {
    public static String eablkybsjg(MotionLayout motionLayout, int i13) {
        return gxszxtbevo(motionLayout, i13, -1);
    }

    public static String gxszxtbevo(MotionLayout motionLayout, int i13, int i14) {
        int length;
        if (i13 == -1) {
            return "UNDEFINED";
        }
        String resourceEntryName = motionLayout.getContext().getResources().getResourceEntryName(i13);
        if (i14 == -1) {
            return resourceEntryName;
        }
        if (resourceEntryName.length() > i14) {
            resourceEntryName = resourceEntryName.replaceAll("([^_])[aeiou]+", "$1");
        }
        if (resourceEntryName.length() <= i14 || (length = resourceEntryName.replaceAll("[^_]", "").length()) <= 0) {
            return resourceEntryName;
        }
        return resourceEntryName.replaceAll(CharBuffer.allocate((resourceEntryName.length() - i14) / length).toString().replace((char) 0, '.') + "_", "_");
    }

    public static String iobyxmoadg() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + StringUtils.PROCESS_POSTFIX_DELIMITER + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "()";
    }

    public static void lqeggnwhkg(String str, String str2, int i13) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int iMin = Math.min(i13, stackTrace.length - 1);
        String str3 = " ";
        for (int i14 = 1; i14 <= iMin; i14++) {
            StackTraceElement stackTraceElement = stackTrace[i14];
            str3 = str3 + " ";
            Log.v(str, str2 + str3 + (".(" + stackTrace[i14].getFileName() + StringUtils.PROCESS_POSTFIX_DELIMITER + stackTrace[i14].getLineNumber() + ") " + stackTrace[i14].getMethodName()) + str3);
        }
    }

    public static String ppxfxbqfkf(Context context, int i13) {
        if (i13 == -1) {
            return "UNKNOWN";
        }
        try {
            return context.getResources().getResourceEntryName(i13);
        } catch (Exception unused) {
            return "?" + i13;
        }
    }

    public static String wkgbmnqykc(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    public static String zoijcleaow() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + StringUtils.PROCESS_POSTFIX_DELIMITER + stackTraceElement.getLineNumber() + ")";
    }
}
