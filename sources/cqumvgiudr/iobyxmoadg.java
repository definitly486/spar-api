package cqumvgiudr;

import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.InitializationException;
import esjtqupxsv.nufgyqmvbu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kcexrzcfyt.xrmfcynszj;
import lereixgezr.agtfadlqog;
import lereixgezr.sopmlzcsov;
import zdlpuopuiu.cllcsxoeiz;

/* JADX INFO: loaded from: classes.dex */
public class iobyxmoadg implements pmvmpeiblj.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final cllcsxoeiz f25514iobyxmoadg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private int f25513gxszxtbevo = 0;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Map f25515ppxfxbqfkf = new HashMap();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private Set f25512eablkybsjg = new HashSet();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f25517zoijcleaow = new ArrayList();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private List f25516wkgbmnqykc = new ArrayList();

    public iobyxmoadg(cllcsxoeiz cllcsxoeizVar) {
        this.f25514iobyxmoadg = cllcsxoeizVar;
        eablkybsjg();
    }

    private void eablkybsjg() {
        Set hashSet = new HashSet();
        try {
            hashSet = this.f25514iobyxmoadg.eablkybsjg();
        } catch (CameraAccessExceptionCompat unused) {
            sopmlzcsov.ppxfxbqfkf("Camera2CameraCoordinator", "Failed to get concurrent camera ids");
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ArrayList arrayList = new ArrayList((Set) it.next());
            if (arrayList.size() >= 2) {
                String str = (String) arrayList.get(0);
                String str2 = (String) arrayList.get(1);
                try {
                    if (xrmfcynszj.iobyxmoadg(this.f25514iobyxmoadg, str) && xrmfcynszj.iobyxmoadg(this.f25514iobyxmoadg, str2)) {
                        this.f25512eablkybsjg.add(new HashSet(Arrays.asList(str, str2)));
                        if (!this.f25515ppxfxbqfkf.containsKey(str)) {
                            this.f25515ppxfxbqfkf.put(str, new ArrayList());
                        }
                        if (!this.f25515ppxfxbqfkf.containsKey(str2)) {
                            this.f25515ppxfxbqfkf.put(str2, new ArrayList());
                        }
                        ((List) this.f25515ppxfxbqfkf.get(str)).add((String) arrayList.get(1));
                        ((List) this.f25515ppxfxbqfkf.get(str2)).add((String) arrayList.get(0));
                    }
                } catch (InitializationException unused2) {
                    sopmlzcsov.iobyxmoadg("Camera2CameraCoordinator", "Concurrent camera id pair: (" + str + ", " + str2 + ") is not backward compatible");
                }
            }
        }
    }

    @Override // pmvmpeiblj.iobyxmoadg
    public String iobyxmoadg(String str) {
        if (!this.f25515ppxfxbqfkf.containsKey(str)) {
            return null;
        }
        for (String str2 : (List) this.f25515ppxfxbqfkf.get(str)) {
            Iterator it = this.f25516wkgbmnqykc.iterator();
            while (it.hasNext()) {
                if (str2.equals(nufgyqmvbu.iobyxmoadg((agtfadlqog) it.next()).zoijcleaow())) {
                    return str2;
                }
            }
        }
        return null;
    }

    @Override // pmvmpeiblj.iobyxmoadg
    public int ppxfxbqfkf() {
        return this.f25513gxszxtbevo;
    }

    @Override // pmvmpeiblj.iobyxmoadg
    public void wkgbmnqykc(int i13) {
        if (i13 != this.f25513gxszxtbevo) {
            Iterator it = this.f25517zoijcleaow.iterator();
            while (it.hasNext()) {
                ((pmvmpeiblj.iobyxmoadg.InterfaceC1704iobyxmoadg) it.next()).iobyxmoadg(this.f25513gxszxtbevo, i13);
            }
        }
        if (this.f25513gxszxtbevo == 2 && i13 != 2) {
            this.f25516wkgbmnqykc.clear();
        }
        this.f25513gxszxtbevo = i13;
    }

    @Override // pmvmpeiblj.iobyxmoadg
    public void zoijcleaow(pmvmpeiblj.iobyxmoadg.InterfaceC1704iobyxmoadg interfaceC1704iobyxmoadg) {
        this.f25517zoijcleaow.add(interfaceC1704iobyxmoadg);
    }
}
