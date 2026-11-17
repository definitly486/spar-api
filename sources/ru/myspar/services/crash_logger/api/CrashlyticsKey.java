package ru.myspar.services.crash_logger.api;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b¨\u0006\u0019"}, d2 = {"Lru/myspar/services/crash_logger/api/CrashlyticsKey;", "", "", "code", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lru/myspar/services/crash_logger/api/CrashlyticsKey;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCode", "getValue", "Companion", "iobyxmoadg", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CrashlyticsKey {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String code;
    private final String value;

    /* JADX INFO: renamed from: ru.myspar.services.crash_logger.api.CrashlyticsKey$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final CrashlyticsKey iobyxmoadg(String value) {
            zdlpuopuiu.btonecajqb(value, "value");
            return new CrashlyticsKey("errorId", value);
        }

        public final CrashlyticsKey zoijcleaow(String value) {
            zdlpuopuiu.btonecajqb(value, "value");
            return new CrashlyticsKey("userPhone", value);
        }

        private Companion() {
        }
    }

    public CrashlyticsKey(String code, String value) {
        zdlpuopuiu.btonecajqb(code, "code");
        zdlpuopuiu.btonecajqb(value, "value");
        this.code = code;
        this.value = value;
    }

    public static /* synthetic */ CrashlyticsKey copy$default(CrashlyticsKey crashlyticsKey, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = crashlyticsKey.code;
        }
        if ((i13 & 2) != 0) {
            str2 = crashlyticsKey.value;
        }
        return crashlyticsKey.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final CrashlyticsKey copy(String code, String value) {
        zdlpuopuiu.btonecajqb(code, "code");
        zdlpuopuiu.btonecajqb(value, "value");
        return new CrashlyticsKey(code, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CrashlyticsKey)) {
            return false;
        }
        CrashlyticsKey crashlyticsKey = (CrashlyticsKey) other;
        return zdlpuopuiu.eablkybsjg(this.code, crashlyticsKey.code) && zdlpuopuiu.eablkybsjg(this.value, crashlyticsKey.value);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (this.code.hashCode() * 31) + this.value.hashCode();
    }

    public String toString() {
        return "CrashlyticsKey(code=" + this.code + ", value=" + this.value + ")";
    }
}
