package rl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zoijcleaow {
    public static String iobyxmoadg(Throwable th2) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(th2);
        while (th2.getCause() != null) {
            th2 = th2.getCause();
            sb3.append("; caused by: ");
            sb3.append(th2);
        }
        return sb3.toString();
    }

    public static String zoijcleaow(Throwable th2, Class cls) {
        StringBuilder sb3 = new StringBuilder();
        boolean z13 = true;
        while (th2 != null) {
            if (!z13) {
                sb3.append("; caused by: ");
            }
            sb3.append(th2);
            sb3.append(" at ");
            for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                if (stackTraceElement.getClassName().equals(cls.getName())) {
                    sb3.append("...omitted...");
                    break;
                }
                sb3.append(stackTraceElement);
                sb3.append("; ");
            }
            th2 = th2.getCause();
            z13 = false;
        }
        return sb3.toString();
    }
}
