package istkbnxepw;

import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class esjtqupxsv {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Object f49316iobyxmoadg = new Object();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Map f49318zoijcleaow = new LinkedHashMap();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Set f49317ppxfxbqfkf = new HashSet();

    public LinkedHashSet iobyxmoadg() {
        LinkedHashSet linkedHashSet;
        synchronized (this.f49316iobyxmoadg) {
            linkedHashSet = new LinkedHashSet(this.f49318zoijcleaow.values());
        }
        return linkedHashSet;
    }

    public void zoijcleaow(yggfygwlhe yggfygwlheVar) {
        synchronized (this.f49316iobyxmoadg) {
            try {
                for (String str : yggfygwlheVar.zoijcleaow()) {
                    lereixgezr.sopmlzcsov.iobyxmoadg("CameraRepository", "Added camera: " + str);
                    this.f49318zoijcleaow.put(str, yggfygwlheVar.iobyxmoadg(str));
                }
            } catch (CameraUnavailableException e13) {
                throw new InitializationException(e13);
            }
        }
    }
}
