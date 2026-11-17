package bz;

/* JADX INFO: loaded from: classes2.dex */
abstract class fyldjkxazc {
    static void iobyxmoadg(Process process) {
        if (process != null) {
            try {
                try {
                    process.exitValue();
                } catch (Throwable unused) {
                }
            } catch (IllegalThreadStateException unused2) {
                process.destroy();
            }
        }
    }
}
