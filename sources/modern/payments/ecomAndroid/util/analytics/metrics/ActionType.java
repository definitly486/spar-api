package modern.payments.ecomAndroid.util.analytics.metrics;

import kotlin.Metadata;
import ng.iobyxmoadg;
import ng.zoijcleaow;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lmodern/payments/ecomAndroid/util/analytics/metrics/ActionType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "NONE", "TOUCH", "RQ", "LC", "MA", "MAC", "SC", "EX", "RS", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum ActionType {
    NONE("None"),
    TOUCH("Touch"),
    RQ("RQ"),
    LC("LC"),
    MA("MA"),
    MAC("MAC"),
    SC("SC"),
    EX("EX"),
    RS("RS");

    private static final /* synthetic */ iobyxmoadg $ENTRIES = zoijcleaow.iobyxmoadg(values());
    private final String value;

    ActionType(String str) {
        this.value = str;
    }

    public static iobyxmoadg getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }
}
