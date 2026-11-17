package rk;

import hg.tzroggbefp;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.agtfadlqog;
import lk.cdpycssgdh;
import lk.jyumaefscl;
import lk.wflxmlrfwp;
import lk.yggfygwlhe;
import mj.kcexrzcfyt;
import mk.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
public abstract class eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final bl.gxszxtbevo f82948iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final bl.gxszxtbevo f82949zoijcleaow;

    static {
        bl.gxszxtbevo.iobyxmoadg iobyxmoadgVar = bl.gxszxtbevo.f16674iwizpuwonk;
        f82948iobyxmoadg = iobyxmoadgVar.wkgbmnqykc("\"\\");
        f82949zoijcleaow = iobyxmoadgVar.wkgbmnqykc("\t ,=");
    }

    private static final String eablkybsjg(bl.ppxfxbqfkf ppxfxbqfkfVar) {
        long jQ = ppxfxbqfkfVar.Q(f82949zoijcleaow);
        if (jQ == -1) {
            jQ = ppxfxbqfkfVar.dsvhmnatus();
        }
        if (jQ != 0) {
            return ppxfxbqfkfVar.yzdjzghtvl(jQ);
        }
        return null;
    }

    public static final void gxszxtbevo(agtfadlqog agtfadlqogVar, jyumaefscl url, yggfygwlhe headers) {
        zdlpuopuiu.btonecajqb(agtfadlqogVar, "<this>");
        zdlpuopuiu.btonecajqb(url, "url");
        zdlpuopuiu.btonecajqb(headers, "headers");
        if (agtfadlqogVar == agtfadlqog.f62852zoijcleaow) {
            return;
        }
        List listEablkybsjg = wflxmlrfwp.f63201btonecajqb.eablkybsjg(url, headers);
        if (listEablkybsjg.isEmpty()) {
            return;
        }
        agtfadlqogVar.zoijcleaow(url, listEablkybsjg);
    }

    public static final List iobyxmoadg(yggfygwlhe yggfygwlheVar, String headerName) {
        zdlpuopuiu.btonecajqb(yggfygwlheVar, "<this>");
        zdlpuopuiu.btonecajqb(headerName, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = yggfygwlheVar.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (kcexrzcfyt.istkbnxepw(headerName, yggfygwlheVar.wkgbmnqykc(i13), true)) {
                try {
                    ppxfxbqfkf(new bl.ppxfxbqfkf().metgxyhuhe(yggfygwlheVar.btonecajqb(i13)), arrayList);
                } catch (EOFException e13) {
                    uk.agtfadlqog.f113749iobyxmoadg.lqeggnwhkg().btonecajqb("Unable to parse challenge", 5, e13);
                }
            }
        }
        return arrayList;
    }

    private static final boolean lqeggnwhkg(bl.ppxfxbqfkf ppxfxbqfkfVar) {
        boolean z13 = false;
        while (!ppxfxbqfkfVar.n()) {
            byte bAgtfadlqog = ppxfxbqfkfVar.agtfadlqog(0L);
            if (bAgtfadlqog == ((byte) 44)) {
                ppxfxbqfkfVar.readByte();
                z13 = true;
            } else {
                if (bAgtfadlqog != ((byte) 32) && bAgtfadlqog != ((byte) 9)) {
                    break;
                }
                ppxfxbqfkfVar.readByte();
            }
        }
        return z13;
    }

    private static final boolean nufgyqmvbu(bl.ppxfxbqfkf ppxfxbqfkfVar, byte b13) {
        return !ppxfxbqfkfVar.n() && ppxfxbqfkfVar.agtfadlqog(0L) == b13;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0084  */
    /* JADX WARN: Code duplicated, block: B:35:0x0098  */
    /* JADX WARN: Code duplicated, block: B:36:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bc A[EDGE_INSN: B:59:0x00bc->B:48:0x00bc BREAK  A[LOOP:2: B:22:0x0072->B:47:0x00ba], SYNTHETIC] */
    private static final void ppxfxbqfkf(bl.ppxfxbqfkf ppxfxbqfkfVar, List list) {
        String strEablkybsjg;
        while (true) {
            String strEablkybsjg2 = null;
            while (true) {
                if (strEablkybsjg2 == null) {
                    lqeggnwhkg(ppxfxbqfkfVar);
                    strEablkybsjg2 = eablkybsjg(ppxfxbqfkfVar);
                    if (strEablkybsjg2 == null) {
                        return;
                    }
                }
                boolean zLqeggnwhkg = lqeggnwhkg(ppxfxbqfkfVar);
                String strEablkybsjg3 = eablkybsjg(ppxfxbqfkfVar);
                if (strEablkybsjg3 == null) {
                    if (ppxfxbqfkfVar.n()) {
                        list.add(new lk.nufgyqmvbu(strEablkybsjg2, tzroggbefp.dxjokdxxww()));
                        return;
                    }
                    return;
                }
                byte b13 = (byte) 61;
                int iIstkbnxepw = mk.wflxmlrfwp.istkbnxepw(ppxfxbqfkfVar, b13);
                boolean zLqeggnwhkg2 = lqeggnwhkg(ppxfxbqfkfVar);
                if (zLqeggnwhkg || !(zLqeggnwhkg2 || ppxfxbqfkfVar.n())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int iIstkbnxepw2 = iIstkbnxepw + mk.wflxmlrfwp.istkbnxepw(ppxfxbqfkfVar, b13);
                    while (true) {
                        if (strEablkybsjg3 != null) {
                            if (iIstkbnxepw2 != 0) {
                                break;
                                break;
                            }
                            if (iIstkbnxepw2 <= 1) {
                                return;
                            }
                            if (nufgyqmvbu(ppxfxbqfkfVar, (byte) 34)) {
                                strEablkybsjg = wkgbmnqykc(ppxfxbqfkfVar);
                            } else {
                                strEablkybsjg = eablkybsjg(ppxfxbqfkfVar);
                            }
                            if (strEablkybsjg != null) {
                                return;
                            }
                            if (lqeggnwhkg(ppxfxbqfkfVar)) {
                            }
                            strEablkybsjg3 = null;
                        } else {
                            strEablkybsjg3 = eablkybsjg(ppxfxbqfkfVar);
                            if (!lqeggnwhkg(ppxfxbqfkfVar)) {
                                iIstkbnxepw2 = mk.wflxmlrfwp.istkbnxepw(ppxfxbqfkfVar, b13);
                                if (iIstkbnxepw2 != 0) {
                                    break;
                                }
                                if (iIstkbnxepw2 <= 1 || lqeggnwhkg(ppxfxbqfkfVar)) {
                                    return;
                                }
                                if (nufgyqmvbu(ppxfxbqfkfVar, (byte) 34)) {
                                    strEablkybsjg = wkgbmnqykc(ppxfxbqfkfVar);
                                } else {
                                    strEablkybsjg = eablkybsjg(ppxfxbqfkfVar);
                                }
                                if (strEablkybsjg != null || ((String) linkedHashMap.put(strEablkybsjg3, strEablkybsjg)) != null) {
                                    return;
                                }
                                if (lqeggnwhkg(ppxfxbqfkfVar) && !ppxfxbqfkfVar.n()) {
                                    return;
                                } else {
                                    strEablkybsjg3 = null;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    list.add(new lk.nufgyqmvbu(strEablkybsjg2, linkedHashMap));
                    strEablkybsjg2 = strEablkybsjg3;
                } else {
                    Map mapSingletonMap = Collections.singletonMap(null, strEablkybsjg3 + kcexrzcfyt.lmojexxdyd("=", iIstkbnxepw));
                    zdlpuopuiu.dxjokdxxww(mapSingletonMap, "singletonMap<String, Str…ek + \"=\".repeat(eqCount))");
                    list.add(new lk.nufgyqmvbu(strEablkybsjg2, mapSingletonMap));
                }
            }
        }
    }

    private static final String wkgbmnqykc(bl.ppxfxbqfkf ppxfxbqfkfVar) {
        byte b13 = (byte) 34;
        if (ppxfxbqfkfVar.readByte() != b13) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        bl.ppxfxbqfkf ppxfxbqfkfVar2 = new bl.ppxfxbqfkf();
        while (true) {
            long jQ = ppxfxbqfkfVar.Q(f82948iobyxmoadg);
            if (jQ == -1) {
                return null;
            }
            if (ppxfxbqfkfVar.agtfadlqog(jQ) == b13) {
                ppxfxbqfkfVar2.zeieaojujs(ppxfxbqfkfVar, jQ);
                ppxfxbqfkfVar.readByte();
                return ppxfxbqfkfVar2.istkbnxepw();
            }
            if (ppxfxbqfkfVar.dsvhmnatus() == jQ + 1) {
                return null;
            }
            ppxfxbqfkfVar2.zeieaojujs(ppxfxbqfkfVar, jQ);
            ppxfxbqfkfVar.readByte();
            ppxfxbqfkfVar2.zeieaojujs(ppxfxbqfkfVar, 1L);
        }
    }

    public static final boolean zoijcleaow(cdpycssgdh cdpycssgdhVar) {
        zdlpuopuiu.btonecajqb(cdpycssgdhVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(cdpycssgdhVar.cdpycssgdh().lqeggnwhkg(), "HEAD")) {
            return false;
        }
        int iBtonecajqb = cdpycssgdhVar.btonecajqb();
        return (((iBtonecajqb >= 100 && iBtonecajqb < 200) || iBtonecajqb == 204 || iBtonecajqb == 304) && rgvfuqvkyq.btonecajqb(cdpycssgdhVar) == -1 && !kcexrzcfyt.istkbnxepw("chunked", cdpycssgdh.vdvldrhtss(cdpycssgdhVar, "Transfer-Encoding", null, 2, null), true)) ? false : true;
    }
}
