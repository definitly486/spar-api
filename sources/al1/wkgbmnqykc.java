package al1;

import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.proloyalty.qr.domain.model.QrStatusAction;
import yj.lqeggnwhkg;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final yj.iobyxmoadg f2198ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final zk1.iobyxmoadg f2199zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f2201esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f2202iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f2203jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f2204yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f2205zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f2202iwizpuwonk = obj;
            this.f2201esjtqupxsv |= Integer.MIN_VALUE;
            return wkgbmnqykc.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(zk1.iobyxmoadg qrStatusesRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(qrStatusesRepository, "qrStatusesRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f2199zoijcleaow = qrStatusesRepository;
        this.f2198ppxfxbqfkf = lqeggnwhkg.zoijcleaow(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:42:0x00a4 A[Catch: all -> 0x00aa, TRY_LEAVE, TryCatch #3 {all -> 0x00aa, blocks: (B:66:0x0137, B:40:0x009c, B:42:0x00a4, B:47:0x00b0, B:48:0x00bb, B:50:0x00c1, B:52:0x00d2, B:53:0x00da, B:54:0x00e0, B:55:0x00ed, B:57:0x00f3, B:59:0x0105, B:62:0x0122, B:60:0x0113, B:63:0x0126, B:36:0x008c), top: B:81:0x008c }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00b0 A[Catch: all -> 0x00aa, TRY_ENTER, TryCatch #3 {all -> 0x00aa, blocks: (B:66:0x0137, B:40:0x009c, B:42:0x00a4, B:47:0x00b0, B:48:0x00bb, B:50:0x00c1, B:52:0x00d2, B:53:0x00da, B:54:0x00e0, B:55:0x00ed, B:57:0x00f3, B:59:0x0105, B:62:0x0122, B:60:0x0113, B:63:0x0126, B:36:0x008c), top: B:81:0x008c }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c1 A[Catch: all -> 0x00aa, TryCatch #3 {all -> 0x00aa, blocks: (B:66:0x0137, B:40:0x009c, B:42:0x00a4, B:47:0x00b0, B:48:0x00bb, B:50:0x00c1, B:52:0x00d2, B:53:0x00da, B:54:0x00e0, B:55:0x00ed, B:57:0x00f3, B:59:0x0105, B:62:0x0122, B:60:0x0113, B:63:0x0126, B:36:0x008c), top: B:81:0x008c }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00d2 A[Catch: all -> 0x00aa, TryCatch #3 {all -> 0x00aa, blocks: (B:66:0x0137, B:40:0x009c, B:42:0x00a4, B:47:0x00b0, B:48:0x00bb, B:50:0x00c1, B:52:0x00d2, B:53:0x00da, B:54:0x00e0, B:55:0x00ed, B:57:0x00f3, B:59:0x0105, B:62:0x0122, B:60:0x0113, B:63:0x0126, B:36:0x008c), top: B:81:0x008c }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00f3 A[Catch: all -> 0x00aa, TryCatch #3 {all -> 0x00aa, blocks: (B:66:0x0137, B:40:0x009c, B:42:0x00a4, B:47:0x00b0, B:48:0x00bb, B:50:0x00c1, B:52:0x00d2, B:53:0x00da, B:54:0x00e0, B:55:0x00ed, B:57:0x00f3, B:59:0x0105, B:62:0x0122, B:60:0x0113, B:63:0x0126, B:36:0x008c), top: B:81:0x008c }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0105 A[Catch: all -> 0x00aa, TryCatch #3 {all -> 0x00aa, blocks: (B:66:0x0137, B:40:0x009c, B:42:0x00a4, B:47:0x00b0, B:48:0x00bb, B:50:0x00c1, B:52:0x00d2, B:53:0x00da, B:54:0x00e0, B:55:0x00ed, B:57:0x00f3, B:59:0x0105, B:62:0x0122, B:60:0x0113, B:63:0x0126, B:36:0x008c), top: B:81:0x008c }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0113 A[Catch: all -> 0x00aa, TryCatch #3 {all -> 0x00aa, blocks: (B:66:0x0137, B:40:0x009c, B:42:0x00a4, B:47:0x00b0, B:48:0x00bb, B:50:0x00c1, B:52:0x00d2, B:53:0x00da, B:54:0x00e0, B:55:0x00ed, B:57:0x00f3, B:59:0x0105, B:62:0x0122, B:60:0x0113, B:63:0x0126, B:36:0x008c), top: B:81:0x008c }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0136 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:68:0x0147 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:69:0x0148  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:84:0x00da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00ed A[SYNTHETIC] */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(wwaezpbzkn wwaezpbzknVar, lg.gxszxtbevo gxszxtbevoVar) throws Throwable {
        iobyxmoadg iobyxmoadgVar;
        yj.iobyxmoadg iobyxmoadgVar2;
        wkgbmnqykc wkgbmnqykcVar;
        Throwable th2;
        yj.iobyxmoadg iobyxmoadgVar3;
        Object objZoijcleaow;
        wkgbmnqykc wkgbmnqykcVar2;
        Collection collection;
        List list;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList;
        zk1.iobyxmoadg iobyxmoadgVar4;
        QrStatusAction qrStatusAction;
        String qrcodeId;
        Object arrayList2;
        zk1.iobyxmoadg iobyxmoadgVar5;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f2201esjtqupxsv;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f2201esjtqupxsv = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object obj = iobyxmoadgVar.f2202iwizpuwonk;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f2201esjtqupxsv;
        try {
            if (i14 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadgVar2 = this.f2198ppxfxbqfkf;
                iobyxmoadgVar.f2205zdlpuopuiu = this;
                iobyxmoadgVar.f2204yggfygwlhe = iobyxmoadgVar2;
                iobyxmoadgVar.f2201esjtqupxsv = 1;
                if (iobyxmoadgVar2.iobyxmoadg(null, iobyxmoadgVar) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                wkgbmnqykcVar = this;
            } else {
                if (i14 != 1) {
                    if (i14 == 2) {
                        yj.iobyxmoadg iobyxmoadgVar6 = (yj.iobyxmoadg) iobyxmoadgVar.f2204yggfygwlhe;
                        wkgbmnqykcVar2 = (wkgbmnqykc) iobyxmoadgVar.f2205zdlpuopuiu;
                        try {
                            gg.zdlpuopuiu.zoijcleaow(obj);
                            objZoijcleaow = obj;
                            iobyxmoadgVar2 = iobyxmoadgVar6;
                            collection = (Collection) objZoijcleaow;
                            if (collection.isEmpty()) {
                                wwaezpbzkn wwaezpbzknVar2 = wwaezpbzkn.f37140iobyxmoadg;
                                iobyxmoadgVar2.eablkybsjg(null);
                                return wwaezpbzknVar2;
                            }
                            list = (List) collection;
                            linkedHashMap = new LinkedHashMap();
                            for (Object obj2 : list) {
                                qrcodeId = ((QrStatusAction) obj2).getQrcodeId();
                                arrayList2 = linkedHashMap.get(qrcodeId);
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                    linkedHashMap.put(qrcodeId, arrayList2);
                                }
                                ((List) arrayList2).add(obj2);
                            }
                            arrayList = new ArrayList();
                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                if (((List) entry.getValue()).size() > 1) {
                                    qrStatusAction = new QrStatusAction((String) entry.getKey(), xk1.iobyxmoadg.ARCHIVED);
                                } else {
                                    qrStatusAction = (QrStatusAction) jyumaefscl.weqkydbzbr((List) entry.getValue());
                                }
                                if (qrStatusAction != null) {
                                    arrayList.add(qrStatusAction);
                                }
                            }
                            iobyxmoadgVar4 = wkgbmnqykcVar2.f2199zoijcleaow;
                            iobyxmoadgVar.f2205zdlpuopuiu = wkgbmnqykcVar2;
                            iobyxmoadgVar.f2204yggfygwlhe = iobyxmoadgVar2;
                            iobyxmoadgVar.f2203jyumaefscl = list;
                            iobyxmoadgVar.f2201esjtqupxsv = 3;
                            if (iobyxmoadgVar4.gxszxtbevo(arrayList, iobyxmoadgVar) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            iobyxmoadgVar5 = wkgbmnqykcVar2.f2199zoijcleaow;
                            iobyxmoadgVar.f2205zdlpuopuiu = iobyxmoadgVar2;
                            iobyxmoadgVar.f2204yggfygwlhe = null;
                            iobyxmoadgVar.f2203jyumaefscl = null;
                            iobyxmoadgVar.f2201esjtqupxsv = 4;
                            if (iobyxmoadgVar5.eablkybsjg(list, iobyxmoadgVar) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            iobyxmoadgVar3 = iobyxmoadgVar2;
                            wwaezpbzkn wwaezpbzknVar3 = wwaezpbzkn.f37140iobyxmoadg;
                            iobyxmoadgVar3.eablkybsjg(null);
                            return wwaezpbzknVar3;
                        } catch (Throwable th3) {
                            th2 = th3;
                            iobyxmoadgVar3 = iobyxmoadgVar6;
                        }
                    } else if (i14 == 3) {
                        list = (List) iobyxmoadgVar.f2203jyumaefscl;
                        yj.iobyxmoadg iobyxmoadgVar7 = (yj.iobyxmoadg) iobyxmoadgVar.f2204yggfygwlhe;
                        wkgbmnqykcVar2 = (wkgbmnqykc) iobyxmoadgVar.f2205zdlpuopuiu;
                        try {
                            gg.zdlpuopuiu.zoijcleaow(obj);
                            iobyxmoadgVar2 = iobyxmoadgVar7;
                            iobyxmoadgVar5 = wkgbmnqykcVar2.f2199zoijcleaow;
                            iobyxmoadgVar.f2205zdlpuopuiu = iobyxmoadgVar2;
                            iobyxmoadgVar.f2204yggfygwlhe = null;
                            iobyxmoadgVar.f2203jyumaefscl = null;
                            iobyxmoadgVar.f2201esjtqupxsv = 4;
                            if (iobyxmoadgVar5.eablkybsjg(list, iobyxmoadgVar) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                            iobyxmoadgVar3 = iobyxmoadgVar2;
                            wwaezpbzkn wwaezpbzknVar4 = wwaezpbzkn.f37140iobyxmoadg;
                            iobyxmoadgVar3.eablkybsjg(null);
                            return wwaezpbzknVar4;
                        } catch (Throwable th4) {
                            th2 = th4;
                            iobyxmoadgVar3 = iobyxmoadgVar7;
                        }
                    } else {
                        if (i14 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        iobyxmoadgVar3 = (yj.iobyxmoadg) iobyxmoadgVar.f2205zdlpuopuiu;
                        try {
                            gg.zdlpuopuiu.zoijcleaow(obj);
                            wwaezpbzkn wwaezpbzknVar5 = wwaezpbzkn.f37140iobyxmoadg;
                            iobyxmoadgVar3.eablkybsjg(null);
                            return wwaezpbzknVar5;
                        } catch (Throwable th5) {
                            th2 = th5;
                        }
                    }
                    iobyxmoadgVar3.eablkybsjg(null);
                    throw th2;
                }
                yj.iobyxmoadg iobyxmoadgVar8 = (yj.iobyxmoadg) iobyxmoadgVar.f2204yggfygwlhe;
                wkgbmnqykcVar = (wkgbmnqykc) iobyxmoadgVar.f2205zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj);
                iobyxmoadgVar2 = iobyxmoadgVar8;
            }
            zk1.iobyxmoadg iobyxmoadgVar9 = wkgbmnqykcVar.f2199zoijcleaow;
            iobyxmoadgVar.f2205zdlpuopuiu = wkgbmnqykcVar;
            iobyxmoadgVar.f2204yggfygwlhe = iobyxmoadgVar2;
            iobyxmoadgVar.f2201esjtqupxsv = 2;
            objZoijcleaow = iobyxmoadgVar9.zoijcleaow(iobyxmoadgVar);
            if (objZoijcleaow == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            wkgbmnqykcVar2 = wkgbmnqykcVar;
            collection = (Collection) objZoijcleaow;
            if (collection.isEmpty()) {
                wwaezpbzkn wwaezpbzknVar6 = wwaezpbzkn.f37140iobyxmoadg;
                iobyxmoadgVar2.eablkybsjg(null);
                return wwaezpbzknVar6;
            }
            list = (List) collection;
            linkedHashMap = new LinkedHashMap();
            while (r8.hasNext()) {
                qrcodeId = ((QrStatusAction) obj2).getQrcodeId();
                arrayList2 = linkedHashMap.get(qrcodeId);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(qrcodeId, arrayList2);
                }
                ((List) arrayList2).add(obj2);
            }
            arrayList = new ArrayList();
            while (r7.hasNext()) {
                if (((List) entry.getValue()).size() > 1) {
                    qrStatusAction = new QrStatusAction((String) entry.getKey(), xk1.iobyxmoadg.ARCHIVED);
                } else {
                    qrStatusAction = (QrStatusAction) jyumaefscl.weqkydbzbr((List) entry.getValue());
                }
                if (qrStatusAction != null) {
                    arrayList.add(qrStatusAction);
                }
            }
            iobyxmoadgVar4 = wkgbmnqykcVar2.f2199zoijcleaow;
            iobyxmoadgVar.f2205zdlpuopuiu = wkgbmnqykcVar2;
            iobyxmoadgVar.f2204yggfygwlhe = iobyxmoadgVar2;
            iobyxmoadgVar.f2203jyumaefscl = list;
            iobyxmoadgVar.f2201esjtqupxsv = 3;
            if (iobyxmoadgVar4.gxszxtbevo(arrayList, iobyxmoadgVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar5 = wkgbmnqykcVar2.f2199zoijcleaow;
            iobyxmoadgVar.f2205zdlpuopuiu = iobyxmoadgVar2;
            iobyxmoadgVar.f2204yggfygwlhe = null;
            iobyxmoadgVar.f2203jyumaefscl = null;
            iobyxmoadgVar.f2201esjtqupxsv = 4;
            if (iobyxmoadgVar5.eablkybsjg(list, iobyxmoadgVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            iobyxmoadgVar3 = iobyxmoadgVar2;
            wwaezpbzkn wwaezpbzknVar7 = wwaezpbzkn.f37140iobyxmoadg;
            iobyxmoadgVar3.eablkybsjg(null);
            return wwaezpbzknVar7;
        } catch (Throwable th6) {
            yj.iobyxmoadg iobyxmoadgVar10 = iobyxmoadgVar2;
            th2 = th6;
            iobyxmoadgVar3 = iobyxmoadgVar10;
        }
    }
}
