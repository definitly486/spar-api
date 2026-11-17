package g0;

import androidx.collection.jpowsppfya;

/* JADX INFO: loaded from: classes.dex */
public abstract class rgvfuqvkyq {
    public static final wflxmlrfwp iobyxmoadg(ojitshcjhn ojitshcjhnVar) {
        wflxmlrfwp wflxmlrfwpVarWkgbmnqykc = ojitshcjhnVar.wkgbmnqykc();
        if (wflxmlrfwpVarWkgbmnqykc != null && wflxmlrfwpVarWkgbmnqykc.agtfadlqog() && !wflxmlrfwpVarWkgbmnqykc.wflxmlrfwp()) {
            wflxmlrfwpVarWkgbmnqykc = wflxmlrfwpVarWkgbmnqykc.eablkybsjg();
            jpowsppfya jpowsppfyaVar = new jpowsppfya(ojitshcjhnVar.ojitshcjhn().size());
            jpowsppfyaVar.oxmwwwfdhm(ojitshcjhnVar.ojitshcjhn());
            while (jpowsppfyaVar.nufgyqmvbu()) {
                ojitshcjhn ojitshcjhnVar2 = (ojitshcjhn) jpowsppfyaVar.zynmafqrjb(jpowsppfyaVar.f4344zoijcleaow - 1);
                wflxmlrfwp wflxmlrfwpVarWkgbmnqykc2 = ojitshcjhnVar2.wkgbmnqykc();
                if (wflxmlrfwpVarWkgbmnqykc2 != null && !wflxmlrfwpVarWkgbmnqykc2.agtfadlqog()) {
                    wflxmlrfwpVarWkgbmnqykc.ojitshcjhn(wflxmlrfwpVarWkgbmnqykc2);
                    if (!wflxmlrfwpVarWkgbmnqykc2.wflxmlrfwp()) {
                        jpowsppfyaVar.oxmwwwfdhm(ojitshcjhnVar2.ojitshcjhn());
                    }
                }
            }
        }
        return wflxmlrfwpVarWkgbmnqykc;
    }
}
