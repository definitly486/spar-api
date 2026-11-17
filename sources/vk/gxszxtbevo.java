package vk;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class gxszxtbevo extends Handler {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final gxszxtbevo f117466iobyxmoadg = new gxszxtbevo();

    private gxszxtbevo() {
    }

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }

    @Override // java.util.logging.Handler
    public void publish(LogRecord record) {
        zdlpuopuiu.btonecajqb(record, "record");
        eablkybsjg eablkybsjgVar = eablkybsjg.f117461iobyxmoadg;
        String loggerName = record.getLoggerName();
        zdlpuopuiu.dxjokdxxww(loggerName, "record.loggerName");
        int iZoijcleaow = lqeggnwhkg.zoijcleaow(record);
        String message = record.getMessage();
        zdlpuopuiu.dxjokdxxww(message, "record.message");
        eablkybsjgVar.iobyxmoadg(loggerName, iZoijcleaow, message, record.getThrown());
    }
}
