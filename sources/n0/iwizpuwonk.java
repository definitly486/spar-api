package n0;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class iwizpuwonk {
    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.vdvldrhtss zoijcleaow(List list, ribwqtqdhb ribwqtqdhbVar, dxjokdxxww dxjokdxxwwVar, jpowsppfya jpowsppfyaVar, tg.draadjrbmk draadjrbmkVar) {
        Object objInvoke;
        Object objWkgbmnqykc;
        int size = list.size();
        List listKcexrzcfyt = null;
        for (int i13 = 0; i13 < size; i13++) {
            draadjrbmk draadjrbmkVar2 = (draadjrbmk) list.get(i13);
            int iIobyxmoadg = draadjrbmkVar2.iobyxmoadg();
            cqumvgiudr.iobyxmoadg iobyxmoadgVar = cqumvgiudr.f68240iobyxmoadg;
            if (cqumvgiudr.eablkybsjg(iIobyxmoadg, iobyxmoadgVar.zoijcleaow())) {
                synchronized (dxjokdxxwwVar.f68251wkgbmnqykc) {
                    try {
                        dxjokdxxww.zoijcleaow zoijcleaowVar = new dxjokdxxww.zoijcleaow(draadjrbmkVar2, jpowsppfyaVar.iobyxmoadg());
                        dxjokdxxww.iobyxmoadg iobyxmoadgVar2 = (dxjokdxxww.iobyxmoadg) dxjokdxxwwVar.f68252zoijcleaow.get(zoijcleaowVar);
                        if (iobyxmoadgVar2 == null) {
                            iobyxmoadgVar2 = (dxjokdxxww.iobyxmoadg) dxjokdxxwwVar.f68250ppxfxbqfkf.eablkybsjg(zoijcleaowVar);
                        }
                        if (iobyxmoadgVar2 != null) {
                            objInvoke = iobyxmoadgVar2.lqeggnwhkg();
                        } else {
                            gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                            try {
                                objInvoke = jpowsppfyaVar.zoijcleaow(draadjrbmkVar2);
                            } catch (Exception unused) {
                                objInvoke = draadjrbmkVar.invoke(ribwqtqdhbVar);
                            }
                            dxjokdxxww.gxszxtbevo(dxjokdxxwwVar, draadjrbmkVar2, jpowsppfyaVar, objInvoke, false, 8, null);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (objInvoke == null) {
                    objInvoke = draadjrbmkVar.invoke(ribwqtqdhbVar);
                }
                return gg.cqumvgiudr.iobyxmoadg(listKcexrzcfyt, zynmafqrjb.iobyxmoadg(ribwqtqdhbVar.eablkybsjg(), objInvoke, draadjrbmkVar2, ribwqtqdhbVar.gxszxtbevo(), ribwqtqdhbVar.wkgbmnqykc()));
            }
            if (cqumvgiudr.eablkybsjg(iIobyxmoadg, iobyxmoadgVar.ppxfxbqfkf())) {
                synchronized (dxjokdxxwwVar.f68251wkgbmnqykc) {
                    try {
                        dxjokdxxww.zoijcleaow zoijcleaowVar2 = new dxjokdxxww.zoijcleaow(draadjrbmkVar2, jpowsppfyaVar.iobyxmoadg());
                        dxjokdxxww.iobyxmoadg iobyxmoadgVar3 = (dxjokdxxww.iobyxmoadg) dxjokdxxwwVar.f68252zoijcleaow.get(zoijcleaowVar2);
                        if (iobyxmoadgVar3 == null) {
                            iobyxmoadgVar3 = (dxjokdxxww.iobyxmoadg) dxjokdxxwwVar.f68250ppxfxbqfkf.eablkybsjg(zoijcleaowVar2);
                        }
                        if (iobyxmoadgVar3 != null) {
                            objWkgbmnqykc = iobyxmoadgVar3.lqeggnwhkg();
                        } else {
                            gg.wwaezpbzkn wwaezpbzknVar2 = gg.wwaezpbzkn.f37140iobyxmoadg;
                            try {
                                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = gg.kcexrzcfyt.f37117yggfygwlhe;
                                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(jpowsppfyaVar.zoijcleaow(draadjrbmkVar2));
                            } catch (Throwable th3) {
                                gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = gg.kcexrzcfyt.f37117yggfygwlhe;
                                objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th3));
                            }
                            if (gg.kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
                                objWkgbmnqykc = null;
                            }
                            dxjokdxxww.gxszxtbevo(dxjokdxxwwVar, draadjrbmkVar2, jpowsppfyaVar, objWkgbmnqykc, false, 8, null);
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                if (objWkgbmnqykc != null) {
                    return gg.cqumvgiudr.iobyxmoadg(listKcexrzcfyt, zynmafqrjb.iobyxmoadg(ribwqtqdhbVar.eablkybsjg(), objWkgbmnqykc, draadjrbmkVar2, ribwqtqdhbVar.gxszxtbevo(), ribwqtqdhbVar.wkgbmnqykc()));
                }
            } else {
                listKcexrzcfyt = listKcexrzcfyt;
                if (!cqumvgiudr.eablkybsjg(iIobyxmoadg, iobyxmoadgVar.iobyxmoadg())) {
                    throw new IllegalStateException("Unknown font type " + draadjrbmkVar2);
                }
                dxjokdxxww.iobyxmoadg iobyxmoadgVarWkgbmnqykc = dxjokdxxwwVar.wkgbmnqykc(draadjrbmkVar2, jpowsppfyaVar);
                if (iobyxmoadgVarWkgbmnqykc == null) {
                    if (listKcexrzcfyt == null) {
                        listKcexrzcfyt = hg.jyumaefscl.kcexrzcfyt(draadjrbmkVar2);
                    } else {
                        listKcexrzcfyt.add(draadjrbmkVar2);
                    }
                } else if (!dxjokdxxww.iobyxmoadg.eablkybsjg(iobyxmoadgVarWkgbmnqykc.lqeggnwhkg()) && iobyxmoadgVarWkgbmnqykc.lqeggnwhkg() != null) {
                    return gg.cqumvgiudr.iobyxmoadg(listKcexrzcfyt, zynmafqrjb.iobyxmoadg(ribwqtqdhbVar.eablkybsjg(), iobyxmoadgVarWkgbmnqykc.lqeggnwhkg(), draadjrbmkVar2, ribwqtqdhbVar.gxszxtbevo(), ribwqtqdhbVar.wkgbmnqykc()));
                }
            }
            listKcexrzcfyt = listKcexrzcfyt;
        }
        return gg.cqumvgiudr.iobyxmoadg(listKcexrzcfyt, draadjrbmkVar.invoke(ribwqtqdhbVar));
    }
}
