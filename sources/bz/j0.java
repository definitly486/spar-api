package bz;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
class j0 extends metgxyhuhe {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final List f17484eablkybsjg;

    j0(Set set, i iVar, m0 m0Var, weqkydbzbr weqkydbzbrVar, mbcevpiqjq mbcevpiqjqVar) {
        super(kc2.lqeggnwhkg.WiFiNetworksData);
        ArrayList arrayList = new ArrayList();
        this.f17484eablkybsjg = arrayList;
        if (set.contains(kc2.lqeggnwhkg.BSSID)) {
            arrayList.add(iVar);
        }
        if (set.contains(kc2.lqeggnwhkg.SignalStrength)) {
            arrayList.add(m0Var);
        }
        if (set.contains(kc2.lqeggnwhkg.Channel)) {
            arrayList.add(weqkydbzbrVar);
        }
        if (set.contains(kc2.lqeggnwhkg.SSID)) {
            arrayList.add(mbcevpiqjqVar);
        }
    }

    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public oc2.iobyxmoadg zynmafqrjb() {
        oc2.iobyxmoadg iobyxmoadgVar = (oc2.iobyxmoadg) super.zynmafqrjb();
        if (iobyxmoadgVar == null) {
            return null;
        }
        for (metgxyhuhe metgxyhuheVar : this.f17484eablkybsjg) {
            kc2.lqeggnwhkg lqeggnwhkgVarIwizpuwonk = metgxyhuheVar.iwizpuwonk();
            String strName = lqeggnwhkgVarIwizpuwonk.name();
            try {
                Serializable serializableZynmafqrjb = metgxyhuheVar.zynmafqrjb();
                if (serializableZynmafqrjb != null) {
                    iobyxmoadgVar.put(strName, serializableZynmafqrjb);
                } else {
                    iobyxmoadgVar.remove(strName);
                }
            } catch (n0 e13) {
                if (lqeggnwhkgVarIwizpuwonk.dxjokdxxww()) {
                    iobyxmoadgVar.put(strName, e13.iobyxmoadg(lqeggnwhkgVarIwizpuwonk));
                } else {
                    iobyxmoadgVar.remove(strName);
                }
            }
        }
        return iobyxmoadgVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: yadqdtsiqt, reason: merged with bridge method [inline-methods] */
    public oc2.iobyxmoadg lereixgezr() {
        return new oc2.iobyxmoadg();
    }
}
