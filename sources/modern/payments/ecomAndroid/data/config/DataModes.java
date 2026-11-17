package modern.payments.ecomAndroid.data.config;

import kotlin.Metadata;
import ng.iobyxmoadg;
import ng.zoijcleaow;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lmodern/payments/ecomAndroid/data/config/DataModes;", "", "key", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "PROD_SERVER", "IFT_SERVER", "PSI_SERVER", "LOCAL_MOCKS", "SANDBOX_SERVER", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum DataModes {
    PROD_SERVER("PROD"),
    IFT_SERVER("IFT"),
    PSI_SERVER("PSI"),
    LOCAL_MOCKS("LOCAL_MOCKS"),
    SANDBOX_SERVER("SANDBOX");

    private static final /* synthetic */ iobyxmoadg $ENTRIES = zoijcleaow.iobyxmoadg(values());
    private final String key;

    DataModes(String str) {
        this.key = str;
    }

    public static iobyxmoadg getEntries() {
        return $ENTRIES;
    }

    public final String getKey() {
        return this.key;
    }
}
