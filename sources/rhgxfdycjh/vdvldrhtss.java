package rhgxfdycjh;

import androidx.collection.dsvhmnatus;
import androidx.collection.ribwqtqdhb;
import hg.tzroggbefp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class vdvldrhtss implements rgvfuqvkyq {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private dsvhmnatus f82673jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final dsvhmnatus f82674yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final tg.draadjrbmk f82675zdlpuopuiu;

    public static final class iobyxmoadg implements rgvfuqvkyq.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ dsvhmnatus f82676iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f82677ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ String f82678zoijcleaow;

        iobyxmoadg(dsvhmnatus dsvhmnatusVar, String str, tg.iobyxmoadg iobyxmoadgVar) {
            this.f82676iobyxmoadg = dsvhmnatusVar;
            this.f82678zoijcleaow = str;
            this.f82677ppxfxbqfkf = iobyxmoadgVar;
        }

        @Override // rhgxfdycjh.rgvfuqvkyq.iobyxmoadg
        public void iobyxmoadg() {
            List list = (List) this.f82676iobyxmoadg.yggfygwlhe(this.f82678zoijcleaow);
            if (list != null) {
                list.remove(this.f82677ppxfxbqfkf);
            }
            if (list == null || list.isEmpty()) {
                return;
            }
            this.f82676iobyxmoadg.cqumvgiudr(this.f82678zoijcleaow, list);
        }
    }

    public vdvldrhtss(Map map, tg.draadjrbmk draadjrbmkVar) {
        this.f82675zdlpuopuiu = draadjrbmkVar;
        this.f82674yggfygwlhe = (map == null || map.isEmpty()) ? null : kcexrzcfyt.nufgyqmvbu(map);
    }

    @Override // rhgxfdycjh.rgvfuqvkyq
    public Object eablkybsjg(String str) {
        dsvhmnatus dsvhmnatusVar;
        dsvhmnatus dsvhmnatusVar2 = this.f82674yggfygwlhe;
        List list = dsvhmnatusVar2 != null ? (List) dsvhmnatusVar2.yggfygwlhe(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && (dsvhmnatusVar = this.f82674yggfygwlhe) != null) {
        }
        return list.get(0);
    }

    @Override // rhgxfdycjh.rgvfuqvkyq
    public boolean iobyxmoadg(Object obj) {
        return ((Boolean) this.f82675zdlpuopuiu.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0099  */
    @Override // rhgxfdycjh.rgvfuqvkyq
    public Map wkgbmnqykc() {
        HashMap map;
        long[] jArr;
        int i13;
        long[] jArr2;
        int i14;
        HashMap map2;
        dsvhmnatus dsvhmnatusVar = this.f82674yggfygwlhe;
        if (dsvhmnatusVar == null && this.f82673jyumaefscl == null) {
            return tzroggbefp.dxjokdxxww();
        }
        int iLqeggnwhkg = dsvhmnatusVar != null ? dsvhmnatusVar.lqeggnwhkg() : 0;
        dsvhmnatus dsvhmnatusVar2 = this.f82673jyumaefscl;
        HashMap map3 = new HashMap(iLqeggnwhkg + (dsvhmnatusVar2 != null ? dsvhmnatusVar2.lqeggnwhkg() : 0));
        dsvhmnatus dsvhmnatusVar3 = this.f82674yggfygwlhe;
        long j13 = 255;
        char c13 = 7;
        long j14 = -9187201950435737472L;
        int i15 = 8;
        if (dsvhmnatusVar3 != null) {
            Object[] objArr = dsvhmnatusVar3.f4302zoijcleaow;
            Object[] objArr2 = dsvhmnatusVar3.f4300ppxfxbqfkf;
            long[] jArr3 = dsvhmnatusVar3.f4299iobyxmoadg;
            int length = jArr3.length - 2;
            if (length >= 0) {
                HashMap map4 = map3;
                int i16 = 0;
                while (true) {
                    long j15 = jArr3[i16];
                    if ((((~j15) << 7) & j15 & j14) != j14) {
                        int i17 = 8 - ((~(i16 - length)) >>> 31);
                        int i18 = 0;
                        while (i18 < i17) {
                            if ((j15 & j13) < 128) {
                                int i19 = (i16 << 3) + i18;
                                map2 = map4;
                                map2.put((String) objArr[i19], (List) objArr2[i19]);
                            } else {
                                map2 = map4;
                            }
                            j15 >>= 8;
                            i18++;
                            map4 = map2;
                            j13 = 255;
                        }
                        map = map4;
                        if (i17 != 8) {
                            break;
                        }
                    } else {
                        map = map4;
                    }
                    if (i16 == length) {
                        break;
                    }
                    i16++;
                    map4 = map;
                    j13 = 255;
                    j14 = -9187201950435737472L;
                }
            } else {
                map = map3;
            }
        } else {
            map = map3;
        }
        dsvhmnatus dsvhmnatusVar4 = this.f82673jyumaefscl;
        if (dsvhmnatusVar4 != null) {
            Object[] objArr3 = dsvhmnatusVar4.f4302zoijcleaow;
            Object[] objArr4 = dsvhmnatusVar4.f4300ppxfxbqfkf;
            long[] jArr4 = dsvhmnatusVar4.f4299iobyxmoadg;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i23 = 0;
                while (true) {
                    long j16 = jArr4[i23];
                    if ((((~j16) << c13) & j16 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i24 = 8 - ((~(i23 - length2)) >>> 31);
                        int i25 = 0;
                        while (i25 < i24) {
                            if ((j16 & 255) < 128) {
                                int i26 = (i23 << 3) + i25;
                                Object obj = objArr3[i26];
                                List list = (List) objArr4[i26];
                                String str = (String) obj;
                                if (list.size() == 1) {
                                    Object objInvoke = ((tg.iobyxmoadg) list.get(0)).invoke();
                                    if (objInvoke != null) {
                                        if (!iobyxmoadg(objInvoke)) {
                                            throw new IllegalStateException(wkgbmnqykc.ppxfxbqfkf(objInvoke).toString());
                                        }
                                        map.put(str, hg.jyumaefscl.lqeggnwhkg(objInvoke));
                                    }
                                    jArr2 = jArr4;
                                } else {
                                    int size = list.size();
                                    ArrayList arrayList = new ArrayList(size);
                                    int i27 = 0;
                                    while (i27 < size) {
                                        long[] jArr5 = jArr4;
                                        Object objInvoke2 = ((tg.iobyxmoadg) list.get(i27)).invoke();
                                        if (objInvoke2 != null && !iobyxmoadg(objInvoke2)) {
                                            throw new IllegalStateException(wkgbmnqykc.ppxfxbqfkf(objInvoke2).toString());
                                        }
                                        arrayList.add(objInvoke2);
                                        i27++;
                                        jArr4 = jArr5;
                                    }
                                    jArr2 = jArr4;
                                    map.put(str, arrayList);
                                }
                                i14 = 8;
                            } else {
                                jArr2 = jArr4;
                                i14 = i15;
                            }
                            j16 >>= i14;
                            i25++;
                            i15 = i14;
                            jArr4 = jArr2;
                        }
                        jArr = jArr4;
                        i13 = i15;
                        if (i24 != i13) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        i13 = i15;
                    }
                    if (i23 == length2) {
                        break;
                    }
                    i23++;
                    i15 = i13;
                    jArr4 = jArr;
                    c13 = 7;
                }
            }
        }
        return map;
    }

    @Override // rhgxfdycjh.rgvfuqvkyq
    public rgvfuqvkyq.iobyxmoadg zoijcleaow(String str, tg.iobyxmoadg iobyxmoadgVar) {
        if (kcexrzcfyt.gxszxtbevo(str)) {
            throw new IllegalArgumentException("Registered key is empty or blank");
        }
        dsvhmnatus dsvhmnatusVarZoijcleaow = this.f82673jyumaefscl;
        if (dsvhmnatusVarZoijcleaow == null) {
            dsvhmnatusVarZoijcleaow = ribwqtqdhb.zoijcleaow();
            this.f82673jyumaefscl = dsvhmnatusVarZoijcleaow;
        }
        Object objEablkybsjg = dsvhmnatusVarZoijcleaow.eablkybsjg(str);
        if (objEablkybsjg == null) {
            objEablkybsjg = new ArrayList();
            dsvhmnatusVarZoijcleaow.cqumvgiudr(str, objEablkybsjg);
        }
        ((List) objEablkybsjg).add(iobyxmoadgVar);
        return new iobyxmoadg(dsvhmnatusVarZoijcleaow, str, iobyxmoadgVar);
    }
}
