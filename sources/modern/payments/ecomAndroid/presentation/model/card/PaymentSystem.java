package modern.payments.ecomAndroid.presentation.model.card;

import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import modern.payments.ecomAndroid.util.extension.StringExtensionsKt;
import ng.iobyxmoadg;
import ng.zoijcleaow;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/model/card/PaymentSystem;", "", "iconUrl", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getIconUrl", "()Ljava/lang/String;", "MIR", "VISA", "MASTERCARD", "UNION_PAY", "UNKNOWN", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum PaymentSystem {
    MIR(StringExtensionsKt.decodeBase64("aHR0cHM6Ly9jbXMtcmVzLXdlYi5vbmxpbmUuc2JlcmJhbmsucnUvc2JlcnBheS9DYXJkL2RzX21jXzM2X21pcl9sb2dvLnBuZw==")),
    VISA(StringExtensionsKt.decodeBase64("aHR0cHM6Ly9jbXMtcmVzLXdlYi5vbmxpbmUuc2JlcmJhbmsucnUvc2JlcnBheS9DYXJkL2RzX21jXzM2X3Zpc2FfbG9nby5wbmc=")),
    MASTERCARD(StringExtensionsKt.decodeBase64("aHR0cHM6Ly9jbXMtcmVzLXdlYi5vbmxpbmUuc2JlcmJhbmsucnUvc2JlcnBheS9DYXJkL2RzX21jXzM2X21hc3RlcmNhcmRfbG9nby5wbmc=")),
    UNION_PAY(null, 1, null),
    UNKNOWN(null, 1, null);

    private static final /* synthetic */ iobyxmoadg $ENTRIES = zoijcleaow.iobyxmoadg(values());
    private final String iconUrl;

    PaymentSystem(String str) {
        this.iconUrl = str;
    }

    public static iobyxmoadg getEntries() {
        return $ENTRIES;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* synthetic */ PaymentSystem(String str, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? null : str);
    }
}
