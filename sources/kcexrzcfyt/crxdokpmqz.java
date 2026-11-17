package kcexrzcfyt;

import android.content.Context;
import android.media.CamcorderProfile;
import android.util.Pair;
import android.util.Size;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class crxdokpmqz implements istkbnxepw.zdlpuopuiu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f54623iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final gxszxtbevo f54624zoijcleaow;

    class iobyxmoadg implements gxszxtbevo {
        iobyxmoadg() {
        }

        @Override // kcexrzcfyt.gxszxtbevo
        public CamcorderProfile iobyxmoadg(int i13, int i14) {
            return CamcorderProfile.get(i13, i14);
        }

        @Override // kcexrzcfyt.gxszxtbevo
        public boolean zoijcleaow(int i13, int i14) {
            return CamcorderProfile.hasProfile(i13, i14);
        }
    }

    public crxdokpmqz(Context context, Object obj, Set set) {
        this(context, new iobyxmoadg(), obj, set);
    }

    private void ppxfxbqfkf(Context context, zdlpuopuiu.cllcsxoeiz cllcsxoeizVar, Set set) {
        u1.nufgyqmvbu.gxszxtbevo(context);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            this.f54623iobyxmoadg.put(str, new d(context, str, cllcsxoeizVar, this.f54624zoijcleaow));
        }
    }

    @Override // istkbnxepw.zdlpuopuiu
    public Pair iobyxmoadg(int i13, String str, List list, Map map, boolean z13, boolean z14) {
        u1.nufgyqmvbu.zoijcleaow(!map.isEmpty(), "No new use cases to be bound.");
        d dVar = (d) this.f54623iobyxmoadg.get(str);
        if (dVar != null) {
            return dVar.pmvmpeiblj(i13, list, map, z13, z14);
        }
        throw new IllegalArgumentException("No such camera id in supported combination list: " + str);
    }

    @Override // istkbnxepw.zdlpuopuiu
    public istkbnxepw.oipsdeybqn zoijcleaow(int i13, String str, int i14, Size size) {
        d dVar = (d) this.f54623iobyxmoadg.get(str);
        if (dVar != null) {
            return dVar.hkdspvbjdz(i13, i14, size);
        }
        return null;
    }

    crxdokpmqz(Context context, gxszxtbevo gxszxtbevoVar, Object obj, Set set) {
        this.f54623iobyxmoadg = new HashMap();
        u1.nufgyqmvbu.gxszxtbevo(gxszxtbevoVar);
        this.f54624zoijcleaow = gxszxtbevoVar;
        ppxfxbqfkf(context, obj instanceof zdlpuopuiu.cllcsxoeiz ? (zdlpuopuiu.cllcsxoeiz) obj : zdlpuopuiu.cllcsxoeiz.iobyxmoadg(context), set);
    }
}
