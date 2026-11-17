package kl;

import java.security.Security;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static am.iobyxmoadg f59746iobyxmoadg = am.zoijcleaow.dxjokdxxww(zoijcleaow.class);

    public static boolean iobyxmoadg(String str, String str2) {
        Set<String> algorithms = Security.getAlgorithms(str);
        Iterator<String> it = algorithms.iterator();
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(str2)) {
                return true;
            }
        }
        f59746iobyxmoadg.agtfadlqog("{} is NOT available for {}. Algorithms available from underlying JCE: {}", str2, str, algorithms);
        return false;
    }
}
