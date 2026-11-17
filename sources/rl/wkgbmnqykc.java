package rl;

import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;
import java.util.List;
import java.util.Map;
import org.jose4j.lang.JoseException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wkgbmnqykc {
    public static String eablkybsjg(Object obj) {
        if (obj instanceof Number) {
            return "Number";
        }
        if (obj instanceof Boolean) {
            return "Boolean";
        }
        if (obj instanceof List) {
            return "Array";
        }
        if (obj instanceof Map) {
            return "Object";
        }
        return obj instanceof String ? "String" : CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE;
    }

    public static Long iobyxmoadg(Map map, String str) {
        Object obj = map.get(str);
        if (obj != null) {
            return Long.valueOf(((Number) obj).longValue());
        }
        return null;
    }

    public static List ppxfxbqfkf(Map map, String str) {
        return (List) map.get(str);
    }

    public static String wkgbmnqykc(Map map, String str) throws JoseException {
        Object obj = map.get(str);
        try {
            return (String) obj;
        } catch (ClassCastException unused) {
            throw new JoseException("'" + str + "' parameter was " + eablkybsjg(obj) + " type but is required to be a String.");
        }
    }

    public static String zoijcleaow(Map map, String str) {
        return (String) map.get(str);
    }
}
