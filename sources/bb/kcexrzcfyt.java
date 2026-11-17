package bb;

import java.security.GeneralSecurityException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kcexrzcfyt {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final CopyOnWriteArrayList f15665iobyxmoadg = new CopyOnWriteArrayList();

    public static oxmwwwfdhm iobyxmoadg(String str) throws GeneralSecurityException {
        for (oxmwwwfdhm oxmwwwfdhmVar : f15665iobyxmoadg) {
            if (oxmwwwfdhmVar.iobyxmoadg(str)) {
                return oxmwwwfdhmVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: " + str);
    }
}
