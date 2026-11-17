package hk;

import hg.ikoacuggdj;
import hg.tzroggbefp;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
class esjtqupxsv extends ppxfxbqfkf {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private boolean f40491btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private int f40492dxjokdxxww;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final gk.cdpycssgdh f40493lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final dk.gxszxtbevo f40494nufgyqmvbu;

    public /* synthetic */ esjtqupxsv(gk.zoijcleaow zoijcleaowVar, gk.cdpycssgdh cdpycssgdhVar, String str, dk.gxszxtbevo gxszxtbevoVar, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(zoijcleaowVar, cdpycssgdhVar, (i13 & 4) != 0 ? null : str, (i13 & 8) != 0 ? null : gxszxtbevoVar);
    }

    private final boolean igdgnonuha(dk.gxszxtbevo gxszxtbevoVar, int i13, String str) {
        gk.zoijcleaow zoijcleaowVarWkgbmnqykc = wkgbmnqykc();
        boolean zDxjokdxxww = gxszxtbevoVar.dxjokdxxww(i13);
        dk.gxszxtbevo gxszxtbevoVarLqeggnwhkg = gxszxtbevoVar.lqeggnwhkg(i13);
        if (zDxjokdxxww && !gxszxtbevoVarLqeggnwhkg.zoijcleaow() && (ydmasvzmpa(str) instanceof gk.pmvmpeiblj)) {
            return true;
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(gxszxtbevoVarLqeggnwhkg.getKind(), dk.agtfadlqog.zoijcleaow.f29058iobyxmoadg) && (!gxszxtbevoVarLqeggnwhkg.zoijcleaow() || !(ydmasvzmpa(str) instanceof gk.pmvmpeiblj))) {
            gk.btonecajqb btonecajqbVarYdmasvzmpa = ydmasvzmpa(str);
            gk.iozdgvuglv iozdgvuglvVar = btonecajqbVarYdmasvzmpa instanceof gk.iozdgvuglv ? (gk.iozdgvuglv) btonecajqbVarYdmasvzmpa : null;
            String strGxszxtbevo = iozdgvuglvVar != null ? gk.gtknphoqwx.gxszxtbevo(iozdgvuglvVar) : null;
            if (strGxszxtbevo != null) {
                int iDxjokdxxww = zdlpuopuiu.dxjokdxxww(gxszxtbevoVarLqeggnwhkg, zoijcleaowVarWkgbmnqykc, strGxszxtbevo);
                boolean z13 = !zoijcleaowVarWkgbmnqykc.eablkybsjg().btonecajqb() && gxszxtbevoVarLqeggnwhkg.zoijcleaow();
                if (iDxjokdxxww == -3 && (zDxjokdxxww || z13)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean skhdrjzrfn(dk.gxszxtbevo gxszxtbevoVar, int i13) {
        boolean z13 = (wkgbmnqykc().eablkybsjg().btonecajqb() || gxszxtbevoVar.dxjokdxxww(i13) || !gxszxtbevoVar.lqeggnwhkg(i13).zoijcleaow()) ? false : true;
        this.f40491btonecajqb = z13;
        return z13;
    }

    @Override // hk.ppxfxbqfkf, ek.eablkybsjg
    public boolean cdpycssgdh() {
        return !this.f40491btonecajqb && super.cdpycssgdh();
    }

    @Override // hk.ppxfxbqfkf
    /* JADX INFO: renamed from: lxfrhoxuzk */
    public gk.cdpycssgdh auzgnhcxok() {
        return this.f40493lqeggnwhkg;
    }

    @Override // hk.ppxfxbqfkf, ek.eablkybsjg
    public ek.ppxfxbqfkf ppxfxbqfkf(dk.gxszxtbevo descriptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        if (descriptor != this.f40494nufgyqmvbu) {
            return super.ppxfxbqfkf(descriptor);
        }
        gk.zoijcleaow zoijcleaowVarWkgbmnqykc = wkgbmnqykc();
        gk.btonecajqb btonecajqbVarSflfametgt = sflfametgt();
        String strNufgyqmvbu = this.f40494nufgyqmvbu.nufgyqmvbu();
        if (btonecajqbVarSflfametgt instanceof gk.cdpycssgdh) {
            return new esjtqupxsv(zoijcleaowVarWkgbmnqykc, (gk.cdpycssgdh) btonecajqbVarSflfametgt, uawqvzlxes(), this.f40494nufgyqmvbu);
        }
        throw oxmwwwfdhm.eablkybsjg(-1, "Expected " + kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(gk.cdpycssgdh.class).jyumaefscl() + ", but had " + kotlin.jvm.internal.cllcsxoeiz.zoijcleaow(btonecajqbVarSflfametgt.getClass()).jyumaefscl() + " as the serialized body of " + strNufgyqmvbu + " at element: " + czzsidtyhn(), btonecajqbVarSflfametgt.toString());
    }

    @Override // fk.vipkmwdibw
    protected String xrmfcynszj(dk.gxszxtbevo descriptor, int i13) {
        Object next;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        zdlpuopuiu.wflxmlrfwp(descriptor, wkgbmnqykc());
        String strEablkybsjg = descriptor.eablkybsjg(i13);
        if (!this.f40541gxszxtbevo.ojitshcjhn() || auzgnhcxok().keySet().contains(strEablkybsjg)) {
            return strEablkybsjg;
        }
        Map mapEablkybsjg = zdlpuopuiu.eablkybsjg(wkgbmnqykc(), descriptor);
        Iterator<T> it = auzgnhcxok().keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Integer num = (Integer) mapEablkybsjg.get((String) next);
            if (num != null && num.intValue() == i13) {
                break;
            }
        }
        String str = (String) next;
        return str != null ? str : strEablkybsjg;
    }

    @Override // ek.ppxfxbqfkf
    public int yadqdtsiqt(dk.gxszxtbevo descriptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        while (this.f40492dxjokdxxww < descriptor.wkgbmnqykc()) {
            int i13 = this.f40492dxjokdxxww;
            this.f40492dxjokdxxww = i13 + 1;
            String strRibwqtqdhb = ribwqtqdhb(descriptor, i13);
            int i14 = this.f40492dxjokdxxww - 1;
            this.f40491btonecajqb = false;
            if (auzgnhcxok().containsKey(strRibwqtqdhb) || skhdrjzrfn(descriptor, i14)) {
                if (!this.f40541gxszxtbevo.lqeggnwhkg() || !igdgnonuha(descriptor, i14, strRibwqtqdhb)) {
                    return i14;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // hk.ppxfxbqfkf
    public gk.btonecajqb ydmasvzmpa(String tag) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tag, "tag");
        return (gk.btonecajqb) tzroggbefp.btonecajqb(auzgnhcxok(), tag);
    }

    @Override // hk.ppxfxbqfkf, ek.ppxfxbqfkf
    public void zoijcleaow(dk.gxszxtbevo descriptor) {
        Set setDraadjrbmk;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        if (this.f40541gxszxtbevo.gtknphoqwx() || (descriptor.getKind() instanceof dk.wkgbmnqykc)) {
            return;
        }
        zdlpuopuiu.wflxmlrfwp(descriptor, wkgbmnqykc());
        if (this.f40541gxszxtbevo.ojitshcjhn()) {
            Set setIobyxmoadg = fk.jpowsppfya.iobyxmoadg(descriptor);
            Map map = (Map) gk.wwaezpbzkn.iobyxmoadg(wkgbmnqykc()).iobyxmoadg(descriptor, zdlpuopuiu.lqeggnwhkg());
            Set setKeySet = map != null ? map.keySet() : null;
            if (setKeySet == null) {
                setKeySet = ikoacuggdj.eablkybsjg();
            }
            setDraadjrbmk = ikoacuggdj.draadjrbmk(setIobyxmoadg, setKeySet);
        } else {
            setDraadjrbmk = fk.jpowsppfya.iobyxmoadg(descriptor);
        }
        for (String str : auzgnhcxok().keySet()) {
            if (!setDraadjrbmk.contains(str) && !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, uawqvzlxes())) {
                throw oxmwwwfdhm.gxszxtbevo(str, auzgnhcxok().toString());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public esjtqupxsv(gk.zoijcleaow json, gk.cdpycssgdh value, String str, dk.gxszxtbevo gxszxtbevoVar) {
        super(json, value, str, null);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(json, "json");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        this.f40493lqeggnwhkg = value;
        this.f40494nufgyqmvbu = gxszxtbevoVar;
    }
}
