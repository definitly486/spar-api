package modern.payments.tracker.util.logging.logWriter;

import gg.wwaezpbzkn;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import rj.lqeggnwhkg;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\nJ\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lmodern/payments/tracker/util/logging/logWriter/LogWriter;", "", "Lgg/wwaezpbzkn;", "start", "(Llg/gxszxtbevo;)Ljava/lang/Object;", "Lrj/lqeggnwhkg;", "Lmodern/payments/tracker/util/logging/logWriter/LogWriter$LogData;", "getLocalChannel", "()Lrj/lqeggnwhkg;", "localChannel", "LogData", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface LogWriter {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, d2 = {"Lmodern/payments/tracker/util/logging/logWriter/LogWriter$LogData;", "", "priority", "", "tag", "", "message", "(ILjava/lang/String;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getPriority", "()I", "getTag", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LogData {
        private final String message;
        private final int priority;
        private final String tag;

        public LogData(int i13, String str, String message) {
            zdlpuopuiu.btonecajqb(message, "message");
            this.priority = i13;
            this.tag = str;
            this.message = message;
        }

        public static /* synthetic */ LogData copy$default(LogData logData, int i13, String str, String str2, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i13 = logData.priority;
            }
            if ((i14 & 2) != 0) {
                str = logData.tag;
            }
            if ((i14 & 4) != 0) {
                str2 = logData.message;
            }
            return logData.copy(i13, str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getPriority() {
            return this.priority;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final LogData copy(int priority, String tag, String message) {
            zdlpuopuiu.btonecajqb(message, "message");
            return new LogData(priority, tag, message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LogData)) {
                return false;
            }
            LogData logData = (LogData) other;
            return this.priority == logData.priority && zdlpuopuiu.eablkybsjg(this.tag, logData.tag) && zdlpuopuiu.eablkybsjg(this.message, logData.message);
        }

        public final String getMessage() {
            return this.message;
        }

        public final int getPriority() {
            return this.priority;
        }

        public final String getTag() {
            return this.tag;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.priority) * 31;
            String str = this.tag;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.message.hashCode();
        }

        public String toString() {
            return "LogData(priority=" + this.priority + ", tag=" + this.tag + ", message=" + this.message + ')';
        }
    }

    lqeggnwhkg getLocalChannel();

    Object start(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar);
}
