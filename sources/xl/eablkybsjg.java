package xl;

/* JADX INFO: loaded from: classes3.dex */
public class eablkybsjg extends kcexrzcfyt {
    public eablkybsjg(String str) {
        super(str);
    }

    @Override // xl.zdlpuopuiu
    void hcddaimhww(wl.lqeggnwhkg lqeggnwhkgVar, gxszxtbevo.iobyxmoadg iobyxmoadgVar) {
        String strYdmasvzmpa = ydmasvzmpa();
        if (iobyxmoadgVar.agtfadlqog() != gxszxtbevo.iobyxmoadg.EnumC3087iobyxmoadg.xml || strYdmasvzmpa.contains("<![CDATA[")) {
            lqeggnwhkgVar.zoijcleaow(strYdmasvzmpa);
            return;
        }
        if (cllcsxoeiz("script")) {
            lqeggnwhkgVar.zoijcleaow("//<![CDATA[\n").zoijcleaow(strYdmasvzmpa).zoijcleaow("\n//]]>");
        } else if (cllcsxoeiz("style")) {
            lqeggnwhkgVar.zoijcleaow("/*<![CDATA[*/\n").zoijcleaow(strYdmasvzmpa).zoijcleaow("\n/*]]>*/");
        } else {
            lqeggnwhkgVar.zoijcleaow("<![CDATA[").zoijcleaow(strYdmasvzmpa).zoijcleaow("]]>");
        }
    }

    @Override // xl.zdlpuopuiu
    public String istkbnxepw() {
        return "#data";
    }

    public String ydmasvzmpa() {
        return metgxyhuhe();
    }

    @Override // xl.zdlpuopuiu
    /* JADX INFO: renamed from: yfnezrywwk, reason: merged with bridge method [inline-methods] */
    public eablkybsjg clone() {
        return (eablkybsjg) super.clone();
    }
}
