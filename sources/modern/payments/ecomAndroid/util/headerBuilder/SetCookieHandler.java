package modern.payments.ecomAndroid.util.headerBuilder;

import gg.wwaezpbzkn;
import kotlin.Metadata;
import lg.gxszxtbevo;
import lk.cdpycssgdh;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001:\u0001\u000eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004H¦@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lmodern/payments/ecomAndroid/util/headerBuilder/SetCookieHandler;", "", "Llk/cdpycssgdh;", "response", "Lgg/wwaezpbzkn;", "saveSetCookieData", "(Llk/cdpycssgdh;)V", "", "useRefresh", "", "getSetCookieData", "(Z)Ljava/lang/String;", "clearSetCookieData", "(Llg/gxszxtbevo;)Ljava/lang/Object;", "CookieType", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface SetCookieHandler {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lmodern/payments/ecomAndroid/util/headerBuilder/SetCookieHandler$CookieType;", "", "NonRequired", "Required", "Lmodern/payments/ecomAndroid/util/headerBuilder/SetCookieHandler$CookieType$NonRequired;", "Lmodern/payments/ecomAndroid/util/headerBuilder/SetCookieHandler$CookieType$Required;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface CookieType {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lmodern/payments/ecomAndroid/util/headerBuilder/SetCookieHandler$CookieType$NonRequired;", "Lmodern/payments/ecomAndroid/util/headerBuilder/SetCookieHandler$CookieType;", "GeoSticky", "Lmodern/payments/ecomAndroid/util/headerBuilder/SetCookieHandler$CookieType$NonRequired$GeoSticky;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface NonRequired extends CookieType {

            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/util/headerBuilder/SetCookieHandler$CookieType$NonRequired$GeoSticky;", "Lmodern/payments/ecomAndroid/util/headerBuilder/SetCookieHandler$CookieType$NonRequired;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class GeoSticky implements NonRequired {
                public static final GeoSticky INSTANCE = new GeoSticky();

                private GeoSticky() {
                }

                public boolean equals(Object other) {
                    return this == other || (other instanceof GeoSticky);
                }

                public int hashCode() {
                    return 230791731;
                }

                public String toString() {
                    return "GeoSticky";
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lmodern/payments/ecomAndroid/util/headerBuilder/SetCookieHandler$CookieType$Required;", "Lmodern/payments/ecomAndroid/util/headerBuilder/SetCookieHandler$CookieType;", "SPDM", "Lmodern/payments/ecomAndroid/util/headerBuilder/SetCookieHandler$CookieType$Required$SPDM;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface Required extends CookieType {

            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/util/headerBuilder/SetCookieHandler$CookieType$Required$SPDM;", "Lmodern/payments/ecomAndroid/util/headerBuilder/SetCookieHandler$CookieType$Required;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class SPDM implements Required {
                public static final SPDM INSTANCE = new SPDM();

                private SPDM() {
                }

                public boolean equals(Object other) {
                    return this == other || (other instanceof SPDM);
                }

                public int hashCode() {
                    return -1073967312;
                }

                public String toString() {
                    return "SPDM";
                }
            }
        }
    }

    Object clearSetCookieData(gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar);

    String getSetCookieData(boolean useRefresh);

    void saveSetCookieData(cdpycssgdh response);
}
