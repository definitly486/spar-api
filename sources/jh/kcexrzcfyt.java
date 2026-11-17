package jh;

/* JADX INFO: loaded from: classes3.dex */
public abstract class kcexrzcfyt {
    public static final nufgyqmvbu iobyxmoadg(wflxmlrfwp wflxmlrfwpVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(wflxmlrfwpVar, "<this>");
        wflxmlrfwp wflxmlrfwpVarZoijcleaow = wflxmlrfwpVar.zoijcleaow();
        if (wflxmlrfwpVarZoijcleaow == null || (wflxmlrfwpVar instanceof hkdspvbjdz)) {
            return null;
        }
        if (!zoijcleaow(wflxmlrfwpVarZoijcleaow)) {
            return iobyxmoadg(wflxmlrfwpVarZoijcleaow);
        }
        if (wflxmlrfwpVarZoijcleaow instanceof nufgyqmvbu) {
            return (nufgyqmvbu) wflxmlrfwpVarZoijcleaow;
        }
        return null;
    }

    public static final boolean ppxfxbqfkf(lereixgezr lereixgezrVar) {
        zi.ikoacuggdj ikoacuggdjVarOjitshcjhn;
        zi.kegysxyocb kegysxyocbVarCdpycssgdh;
        zi.kegysxyocb returnType;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(lereixgezrVar, "<this>");
        wflxmlrfwp wflxmlrfwpVarZoijcleaow = lereixgezrVar.zoijcleaow();
        eablkybsjg eablkybsjgVar = wflxmlrfwpVarZoijcleaow instanceof eablkybsjg ? (eablkybsjg) wflxmlrfwpVarZoijcleaow : null;
        if (eablkybsjgVar == null) {
            return false;
        }
        eablkybsjg eablkybsjgVar2 = li.gtknphoqwx.lqeggnwhkg(eablkybsjgVar) ? eablkybsjgVar : null;
        if (eablkybsjgVar2 == null || (ikoacuggdjVarOjitshcjhn = eablkybsjgVar2.ojitshcjhn()) == null || (kegysxyocbVarCdpycssgdh = ej.wkgbmnqykc.cdpycssgdh(ikoacuggdjVarOjitshcjhn)) == null || (returnType = lereixgezrVar.getReturnType()) == null || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(lereixgezrVar.getName(), gj.zdlpuopuiu.f37602eablkybsjg)) {
            return false;
        }
        if ((!ej.wkgbmnqykc.kcexrzcfyt(returnType) && !ej.wkgbmnqykc.zdlpuopuiu(returnType)) || lereixgezrVar.dxjokdxxww().size() != 1) {
            return false;
        }
        zi.kegysxyocb type = ((iyctptxqzt) lereixgezrVar.dxjokdxxww().get(0)).getType();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(type, "getType(...)");
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ej.wkgbmnqykc.cdpycssgdh(type), kegysxyocbVarCdpycssgdh) && lereixgezrVar.zeieaojujs().isEmpty() && lereixgezrVar.hkdspvbjdz() == null;
    }

    public static final eablkybsjg wkgbmnqykc(lmojexxdyd lmojexxdydVar, ii.ppxfxbqfkf fqName, rh.zoijcleaow lookupLocation) {
        nufgyqmvbu nufgyqmvbuVarEablkybsjg;
        si.gtknphoqwx gtknphoqwxVarKegysxyocb;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(lmojexxdydVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fqName, "fqName");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(lookupLocation, "lookupLocation");
        if (fqName.wkgbmnqykc()) {
            return null;
        }
        ii.ppxfxbqfkf ppxfxbqfkfVarEablkybsjg = fqName.eablkybsjg();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ppxfxbqfkfVarEablkybsjg, "parent(...)");
        si.gtknphoqwx gtknphoqwxVarAgtfadlqog = lmojexxdydVar.wwaezpbzkn(ppxfxbqfkfVarEablkybsjg).agtfadlqog();
        ii.gxszxtbevo gxszxtbevoVarLqeggnwhkg = fqName.lqeggnwhkg();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(gxszxtbevoVarLqeggnwhkg, "shortName(...)");
        nufgyqmvbu nufgyqmvbuVarEablkybsjg2 = gtknphoqwxVarAgtfadlqog.eablkybsjg(gxszxtbevoVarLqeggnwhkg, lookupLocation);
        eablkybsjg eablkybsjgVar = nufgyqmvbuVarEablkybsjg2 instanceof eablkybsjg ? (eablkybsjg) nufgyqmvbuVarEablkybsjg2 : null;
        if (eablkybsjgVar != null) {
            return eablkybsjgVar;
        }
        ii.ppxfxbqfkf ppxfxbqfkfVarEablkybsjg2 = fqName.eablkybsjg();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(ppxfxbqfkfVarEablkybsjg2, "parent(...)");
        eablkybsjg eablkybsjgVarWkgbmnqykc = wkgbmnqykc(lmojexxdydVar, ppxfxbqfkfVarEablkybsjg2, lookupLocation);
        if (eablkybsjgVarWkgbmnqykc == null || (gtknphoqwxVarKegysxyocb = eablkybsjgVarWkgbmnqykc.kegysxyocb()) == null) {
            nufgyqmvbuVarEablkybsjg = null;
        } else {
            ii.gxszxtbevo gxszxtbevoVarLqeggnwhkg2 = fqName.lqeggnwhkg();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(gxszxtbevoVarLqeggnwhkg2, "shortName(...)");
            nufgyqmvbuVarEablkybsjg = gtknphoqwxVarKegysxyocb.eablkybsjg(gxszxtbevoVarLqeggnwhkg2, lookupLocation);
        }
        if (nufgyqmvbuVarEablkybsjg instanceof eablkybsjg) {
            return (eablkybsjg) nufgyqmvbuVarEablkybsjg;
        }
        return null;
    }

    public static final boolean zoijcleaow(wflxmlrfwp wflxmlrfwpVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(wflxmlrfwpVar, "<this>");
        return wflxmlrfwpVar.zoijcleaow() instanceof hkdspvbjdz;
    }
}
