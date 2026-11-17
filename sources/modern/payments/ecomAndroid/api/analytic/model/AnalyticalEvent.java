package modern.payments.ecomAndroid.api.analytic.model;

import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J<\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lmodern/payments/ecomAndroid/api/analytic/model/AnalyticalEvent;", "", "action", "", "httpCode", "", "errorCode", "description", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "getDescription", "getErrorCode", "getHttpCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lmodern/payments/ecomAndroid/api/analytic/model/AnalyticalEvent;", "equals", "", "other", "hashCode", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AnalyticalEvent {
    private final String action;
    private final String description;
    private final String errorCode;
    private final Integer httpCode;

    public AnalyticalEvent(String action, Integer num, String str, String str2) {
        zdlpuopuiu.btonecajqb(action, "action");
        this.action = action;
        this.httpCode = num;
        this.errorCode = str;
        this.description = str2;
    }

    public static /* synthetic */ AnalyticalEvent copy$default(AnalyticalEvent analyticalEvent, String str, Integer num, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = analyticalEvent.action;
        }
        if ((i13 & 2) != 0) {
            num = analyticalEvent.httpCode;
        }
        if ((i13 & 4) != 0) {
            str2 = analyticalEvent.errorCode;
        }
        if ((i13 & 8) != 0) {
            str3 = analyticalEvent.description;
        }
        return analyticalEvent.copy(str, num, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getHttpCode() {
        return this.httpCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final AnalyticalEvent copy(String action, Integer httpCode, String errorCode, String description) {
        zdlpuopuiu.btonecajqb(action, "action");
        return new AnalyticalEvent(action, httpCode, errorCode, description);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyticalEvent)) {
            return false;
        }
        AnalyticalEvent analyticalEvent = (AnalyticalEvent) other;
        return zdlpuopuiu.eablkybsjg(this.action, analyticalEvent.action) && zdlpuopuiu.eablkybsjg(this.httpCode, analyticalEvent.httpCode) && zdlpuopuiu.eablkybsjg(this.errorCode, analyticalEvent.errorCode) && zdlpuopuiu.eablkybsjg(this.description, analyticalEvent.description);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final Integer getHttpCode() {
        return this.httpCode;
    }

    public int hashCode() {
        int iHashCode = this.action.hashCode() * 31;
        Integer num = this.httpCode;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.errorCode;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "AnalyticalEvent(action=" + this.action + ", httpCode=" + this.httpCode + ", errorCode=" + this.errorCode + ", description=" + this.description + ')';
    }

    public /* synthetic */ AnalyticalEvent(String str, Integer num, String str2, String str3, int i13, gtknphoqwx gtknphoqwxVar) {
        this(str, (i13 & 2) != 0 ? null : num, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : str3);
    }
}
