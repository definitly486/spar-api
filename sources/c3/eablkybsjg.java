package c3;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f18631iobyxmoadg = new HashMap();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f18632zoijcleaow = new ArrayList();

    private eablkybsjg iobyxmoadg(String str, Object obj) {
        this.f18631iobyxmoadg.put((String) y2.iobyxmoadg.eablkybsjg(str), y2.iobyxmoadg.eablkybsjg(obj));
        this.f18632zoijcleaow.remove(str);
        return this;
    }

    public static eablkybsjg lqeggnwhkg(eablkybsjg eablkybsjgVar, long j13) {
        return eablkybsjgVar.eablkybsjg("exo_len", j13);
    }

    public static eablkybsjg nufgyqmvbu(eablkybsjg eablkybsjgVar, Uri uri) {
        return uri == null ? eablkybsjgVar.wkgbmnqykc("exo_redir") : eablkybsjgVar.gxszxtbevo("exo_redir", uri.toString());
    }

    public eablkybsjg eablkybsjg(String str, long j13) {
        return iobyxmoadg(str, Long.valueOf(j13));
    }

    public eablkybsjg gxszxtbevo(String str, String str2) {
        return iobyxmoadg(str, str2);
    }

    public List ppxfxbqfkf() {
        return Collections.unmodifiableList(new ArrayList(this.f18632zoijcleaow));
    }

    public eablkybsjg wkgbmnqykc(String str) {
        this.f18632zoijcleaow.add(str);
        this.f18631iobyxmoadg.remove(str);
        return this;
    }

    public Map zoijcleaow() {
        HashMap map = new HashMap(this.f18631iobyxmoadg);
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return Collections.unmodifiableMap(map);
    }
}
