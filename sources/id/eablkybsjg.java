package id;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import nd.dxjokdxxww;

/* JADX INFO: loaded from: classes2.dex */
public abstract class eablkybsjg {
    public static String eablkybsjg(String str) {
        if (str == null) {
            return "Metric name must not be null";
        }
        if (str.length() > 100) {
            return String.format(Locale.US, "Metric name must not exceed %d characters", 100);
        }
        if (!str.startsWith("_")) {
            return null;
        }
        for (md.zoijcleaow zoijcleaowVar : md.zoijcleaow.values()) {
            if (zoijcleaowVar.toString().equals(str)) {
                return null;
            }
        }
        return "Metric name must not start with '_'";
    }

    public static String gxszxtbevo(String str) {
        if (str == null) {
            return "Trace name must not be null";
        }
        if (str.length() > 100) {
            return String.format(Locale.US, "Trace name must not exceed %d characters", 100);
        }
        if (!str.startsWith("_")) {
            return null;
        }
        for (md.ppxfxbqfkf ppxfxbqfkfVar : md.ppxfxbqfkf.values()) {
            if (ppxfxbqfkfVar.toString().equals(str)) {
                return null;
            }
        }
        if (str.startsWith("_st_")) {
            return null;
        }
        return "Trace name must not start with '_'";
    }

    private static List iobyxmoadg(dxjokdxxww dxjokdxxwwVar, Context context) {
        ArrayList arrayList = new ArrayList();
        if (dxjokdxxwwVar.wkgbmnqykc()) {
            arrayList.add(new wkgbmnqykc(dxjokdxxwwVar.eablkybsjg()));
        }
        if (dxjokdxxwwVar.zoijcleaow()) {
            arrayList.add(new ppxfxbqfkf(dxjokdxxwwVar.ppxfxbqfkf(), context));
        }
        if (dxjokdxxwwVar.wflxmlrfwp()) {
            arrayList.add(new iobyxmoadg(dxjokdxxwwVar.draadjrbmk()));
        }
        if (dxjokdxxwwVar.iobyxmoadg()) {
            arrayList.add(new zoijcleaow(dxjokdxxwwVar.gxszxtbevo()));
        }
        return arrayList;
    }

    public static void wkgbmnqykc(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Attribute key must not be null or empty");
        }
        if (str2 == null || str2.length() == 0) {
            throw new IllegalArgumentException("Attribute value must not be null or empty");
        }
        if (str.length() > 40) {
            throw new IllegalArgumentException(String.format(Locale.US, "Attribute key length must not exceed %d characters", 40));
        }
        if (str2.length() > 100) {
            throw new IllegalArgumentException(String.format(Locale.US, "Attribute value length must not exceed %d characters", 100));
        }
        if (!str.matches("^(?!(firebase_|google_|ga_))[A-Za-z][A-Za-z_0-9]*")) {
            throw new IllegalArgumentException("Attribute key must start with letter, must only contain alphanumeric characters and underscore and must not start with \"firebase_\", \"google_\" and \"ga_");
        }
    }

    public static boolean zoijcleaow(dxjokdxxww dxjokdxxwwVar, Context context) {
        List listIobyxmoadg = iobyxmoadg(dxjokdxxwwVar, context);
        if (listIobyxmoadg.isEmpty()) {
            gd.iobyxmoadg.eablkybsjg().iobyxmoadg("No validators found for PerfMetric.");
            return false;
        }
        Iterator it = listIobyxmoadg.iterator();
        while (it.hasNext()) {
            if (!((eablkybsjg) it.next()).ppxfxbqfkf()) {
                return false;
            }
        }
        return true;
    }

    public abstract boolean ppxfxbqfkf();
}
