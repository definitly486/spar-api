package androidx.media3.datasource;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class DataSourceException extends IOException {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final int f9860zdlpuopuiu;

    public DataSourceException(int i13) {
        this.f9860zdlpuopuiu = i13;
    }

    public static boolean iobyxmoadg(IOException iOException) {
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof DataSourceException) && ((DataSourceException) cause).f9860zdlpuopuiu == 2008) {
                return true;
            }
        }
        return false;
    }

    public DataSourceException(Throwable th2, int i13) {
        super(th2);
        this.f9860zdlpuopuiu = i13;
    }

    public DataSourceException(String str, int i13) {
        super(str);
        this.f9860zdlpuopuiu = i13;
    }

    public DataSourceException(String str, Throwable th2, int i13) {
        super(str, th2);
        this.f9860zdlpuopuiu = i13;
    }
}
