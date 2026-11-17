package hm;

import cm.vdvldrhtss;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes3.dex */
final class zoijcleaow extends gxszxtbevo implements Serializable {
    private static final long serialVersionUID = 3044319355680032515L;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final vdvldrhtss[] f40795cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final eablkybsjg[] f40796esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final cm.gxszxtbevo[] f40797iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final long[] f40798jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final ConcurrentMap f40799lereixgezr = new ConcurrentHashMap();

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final vdvldrhtss[] f40800yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final long[] f40801zdlpuopuiu;

    private zoijcleaow(long[] jArr, vdvldrhtss[] vdvldrhtssVarArr, long[] jArr2, vdvldrhtss[] vdvldrhtssVarArr2, eablkybsjg[] eablkybsjgVarArr) {
        this.f40801zdlpuopuiu = jArr;
        this.f40800yggfygwlhe = vdvldrhtssVarArr;
        this.f40798jyumaefscl = jArr2;
        this.f40795cqumvgiudr = vdvldrhtssVarArr2;
        this.f40796esjtqupxsv = eablkybsjgVarArr;
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        while (i13 < jArr2.length) {
            int i14 = i13 + 1;
            wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(jArr2[i13], vdvldrhtssVarArr2[i13], vdvldrhtssVarArr2[i14]);
            if (wkgbmnqykcVar.rgvfuqvkyq()) {
                arrayList.add(wkgbmnqykcVar.lqeggnwhkg());
                arrayList.add(wkgbmnqykcVar.wkgbmnqykc());
            } else {
                arrayList.add(wkgbmnqykcVar.wkgbmnqykc());
                arrayList.add(wkgbmnqykcVar.lqeggnwhkg());
            }
            i13 = i14;
        }
        this.f40797iwizpuwonk = (cm.gxszxtbevo[]) arrayList.toArray(new cm.gxszxtbevo[arrayList.size()]);
    }

    private Object agtfadlqog(cm.gxszxtbevo gxszxtbevoVar, wkgbmnqykc wkgbmnqykcVar) {
        cm.gxszxtbevo gxszxtbevoVarLqeggnwhkg = wkgbmnqykcVar.lqeggnwhkg();
        if (wkgbmnqykcVar.rgvfuqvkyq()) {
            if (gxszxtbevoVar.cqumvgiudr(gxszxtbevoVarLqeggnwhkg)) {
                return wkgbmnqykcVar.agtfadlqog();
            }
            return gxszxtbevoVar.cqumvgiudr(wkgbmnqykcVar.wkgbmnqykc()) ? wkgbmnqykcVar : wkgbmnqykcVar.draadjrbmk();
        }
        if (gxszxtbevoVar.cqumvgiudr(gxszxtbevoVarLqeggnwhkg)) {
            return gxszxtbevoVar.cqumvgiudr(wkgbmnqykcVar.wkgbmnqykc()) ? wkgbmnqykcVar.agtfadlqog() : wkgbmnqykcVar;
        }
        return wkgbmnqykcVar.draadjrbmk();
    }

    private wkgbmnqykc[] ojitshcjhn(int i13) {
        Integer numValueOf = Integer.valueOf(i13);
        wkgbmnqykc[] wkgbmnqykcVarArr = (wkgbmnqykc[]) this.f40799lereixgezr.get(numValueOf);
        if (wkgbmnqykcVarArr != null) {
            return wkgbmnqykcVarArr;
        }
        eablkybsjg[] eablkybsjgVarArr = this.f40796esjtqupxsv;
        wkgbmnqykc[] wkgbmnqykcVarArr2 = new wkgbmnqykc[eablkybsjgVarArr.length];
        for (int i14 = 0; i14 < eablkybsjgVarArr.length; i14++) {
            wkgbmnqykcVarArr2[i14] = eablkybsjgVarArr[i14].wkgbmnqykc(i13);
        }
        if (i13 < 2100) {
            this.f40799lereixgezr.putIfAbsent(numValueOf, wkgbmnqykcVarArr2);
        }
        return wkgbmnqykcVarArr2;
    }

    private int rgvfuqvkyq(long j13, vdvldrhtss vdvldrhtssVar) {
        return cm.eablkybsjg.kegysxyocb(fm.ppxfxbqfkf.eablkybsjg(j13 + ((long) vdvldrhtssVar.lmojexxdyd()), 86400L)).pkzmftpjix();
    }

    private Object vdvldrhtss(cm.gxszxtbevo gxszxtbevoVar) {
        int i13 = 0;
        if (this.f40796esjtqupxsv.length > 0) {
            cm.gxszxtbevo[] gxszxtbevoVarArr = this.f40797iwizpuwonk;
            if (gxszxtbevoVarArr.length == 0 || gxszxtbevoVar.jyumaefscl(gxszxtbevoVarArr[gxszxtbevoVarArr.length - 1])) {
                wkgbmnqykc[] wkgbmnqykcVarArrOjitshcjhn = ojitshcjhn(gxszxtbevoVar.hcddaimhww());
                int length = wkgbmnqykcVarArrOjitshcjhn.length;
                Object obj = null;
                while (i13 < length) {
                    wkgbmnqykc wkgbmnqykcVar = wkgbmnqykcVarArrOjitshcjhn[i13];
                    Object objAgtfadlqog = agtfadlqog(gxszxtbevoVar, wkgbmnqykcVar);
                    if ((objAgtfadlqog instanceof wkgbmnqykc) || objAgtfadlqog.equals(wkgbmnqykcVar.agtfadlqog())) {
                        return objAgtfadlqog;
                    }
                    i13++;
                    obj = objAgtfadlqog;
                }
                return obj;
            }
        }
        int iBinarySearch = Arrays.binarySearch(this.f40797iwizpuwonk, gxszxtbevoVar);
        if (iBinarySearch == -1) {
            return this.f40795cqumvgiudr[0];
        }
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        } else {
            Object[] objArr = this.f40797iwizpuwonk;
            if (iBinarySearch < objArr.length - 1) {
                int i14 = iBinarySearch + 1;
                if (objArr[iBinarySearch].equals(objArr[i14])) {
                    iBinarySearch = i14;
                }
            }
        }
        if ((iBinarySearch & 1) != 0) {
            return this.f40795cqumvgiudr[(iBinarySearch / 2) + 1];
        }
        cm.gxszxtbevo[] gxszxtbevoVarArr2 = this.f40797iwizpuwonk;
        cm.gxszxtbevo gxszxtbevoVar2 = gxszxtbevoVarArr2[iBinarySearch];
        cm.gxszxtbevo gxszxtbevoVar3 = gxszxtbevoVarArr2[iBinarySearch + 1];
        vdvldrhtss[] vdvldrhtssVarArr = this.f40795cqumvgiudr;
        int i15 = iBinarySearch / 2;
        vdvldrhtss vdvldrhtssVar = vdvldrhtssVarArr[i15];
        vdvldrhtss vdvldrhtssVar2 = vdvldrhtssVarArr[i15 + 1];
        return vdvldrhtssVar2.lmojexxdyd() > vdvldrhtssVar.lmojexxdyd() ? new wkgbmnqykc(gxszxtbevoVar2, vdvldrhtssVar, vdvldrhtssVar2) : new wkgbmnqykc(gxszxtbevoVar3, vdvldrhtssVar, vdvldrhtssVar2);
    }

    private Object writeReplace() {
        return new iobyxmoadg((byte) 1, this);
    }

    static zoijcleaow zdlpuopuiu(DataInput dataInput) throws IOException {
        int i13 = dataInput.readInt();
        long[] jArr = new long[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            jArr[i14] = iobyxmoadg.wkgbmnqykc(dataInput);
        }
        int i15 = i13 + 1;
        vdvldrhtss[] vdvldrhtssVarArr = new vdvldrhtss[i15];
        for (int i16 = 0; i16 < i15; i16++) {
            vdvldrhtssVarArr[i16] = iobyxmoadg.nufgyqmvbu(dataInput);
        }
        int i17 = dataInput.readInt();
        long[] jArr2 = new long[i17];
        for (int i18 = 0; i18 < i17; i18++) {
            jArr2[i18] = iobyxmoadg.wkgbmnqykc(dataInput);
        }
        int i19 = i17 + 1;
        vdvldrhtss[] vdvldrhtssVarArr2 = new vdvldrhtss[i19];
        for (int i23 = 0; i23 < i19; i23++) {
            vdvldrhtssVarArr2[i23] = iobyxmoadg.nufgyqmvbu(dataInput);
        }
        int i24 = dataInput.readByte();
        eablkybsjg[] eablkybsjgVarArr = new eablkybsjg[i24];
        for (int i25 = 0; i25 < i24; i25++) {
            eablkybsjgVarArr[i25] = eablkybsjg.lqeggnwhkg(dataInput);
        }
        return new zoijcleaow(jArr, vdvldrhtssVarArr, jArr2, vdvldrhtssVarArr2, eablkybsjgVarArr);
    }

    @Override // hm.gxszxtbevo
    public boolean btonecajqb(cm.gxszxtbevo gxszxtbevoVar, vdvldrhtss vdvldrhtssVar) {
        return lqeggnwhkg(gxszxtbevoVar).contains(vdvldrhtssVar);
    }

    @Override // hm.gxszxtbevo
    public boolean dxjokdxxww() {
        return this.f40798jyumaefscl.length == 0 && this.f40796esjtqupxsv.length == 0 && this.f40795cqumvgiudr[0].equals(this.f40800yggfygwlhe[0]);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zoijcleaow) {
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return Arrays.equals(this.f40801zdlpuopuiu, zoijcleaowVar.f40801zdlpuopuiu) && Arrays.equals(this.f40800yggfygwlhe, zoijcleaowVar.f40800yggfygwlhe) && Arrays.equals(this.f40798jyumaefscl, zoijcleaowVar.f40798jyumaefscl) && Arrays.equals(this.f40795cqumvgiudr, zoijcleaowVar.f40795cqumvgiudr) && Arrays.equals(this.f40796esjtqupxsv, zoijcleaowVar.f40796esjtqupxsv);
        }
        if (!(obj instanceof gxszxtbevo.iobyxmoadg)) {
            return false;
        }
        if (dxjokdxxww()) {
            cm.wkgbmnqykc wkgbmnqykcVar = cm.wkgbmnqykc.f20164jyumaefscl;
            if (iobyxmoadg(wkgbmnqykcVar).equals(((gxszxtbevo.iobyxmoadg) obj).iobyxmoadg(wkgbmnqykcVar))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((Arrays.hashCode(this.f40801zdlpuopuiu) ^ Arrays.hashCode(this.f40800yggfygwlhe)) ^ Arrays.hashCode(this.f40798jyumaefscl)) ^ Arrays.hashCode(this.f40795cqumvgiudr)) ^ Arrays.hashCode(this.f40796esjtqupxsv);
    }

    @Override // hm.gxszxtbevo
    public vdvldrhtss iobyxmoadg(cm.wkgbmnqykc wkgbmnqykcVar) {
        long jJyumaefscl = wkgbmnqykcVar.jyumaefscl();
        if (this.f40796esjtqupxsv.length > 0) {
            long[] jArr = this.f40798jyumaefscl;
            if (jArr.length == 0 || jJyumaefscl > jArr[jArr.length - 1]) {
                vdvldrhtss[] vdvldrhtssVarArr = this.f40795cqumvgiudr;
                wkgbmnqykc[] wkgbmnqykcVarArrOjitshcjhn = ojitshcjhn(rgvfuqvkyq(jJyumaefscl, vdvldrhtssVarArr[vdvldrhtssVarArr.length - 1]));
                wkgbmnqykc wkgbmnqykcVar2 = null;
                for (int i13 = 0; i13 < wkgbmnqykcVarArrOjitshcjhn.length; i13++) {
                    wkgbmnqykcVar2 = wkgbmnqykcVarArrOjitshcjhn[i13];
                    if (jJyumaefscl < wkgbmnqykcVar2.kcexrzcfyt()) {
                        return wkgbmnqykcVar2.agtfadlqog();
                    }
                }
                return wkgbmnqykcVar2.draadjrbmk();
            }
        }
        int iBinarySearch = Arrays.binarySearch(this.f40798jyumaefscl, jJyumaefscl);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        }
        return this.f40795cqumvgiudr[iBinarySearch + 1];
    }

    public vdvldrhtss kcexrzcfyt(cm.wkgbmnqykc wkgbmnqykcVar) {
        int iBinarySearch = Arrays.binarySearch(this.f40801zdlpuopuiu, wkgbmnqykcVar.jyumaefscl());
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        }
        return this.f40800yggfygwlhe[iBinarySearch + 1];
    }

    @Override // hm.gxszxtbevo
    public List lqeggnwhkg(cm.gxszxtbevo gxszxtbevoVar) {
        Object objVdvldrhtss = vdvldrhtss(gxszxtbevoVar);
        return objVdvldrhtss instanceof wkgbmnqykc ? ((wkgbmnqykc) objVdvldrhtss).ojitshcjhn() : Collections.singletonList((vdvldrhtss) objVdvldrhtss);
    }

    @Override // hm.gxszxtbevo
    public boolean nufgyqmvbu(cm.wkgbmnqykc wkgbmnqykcVar) {
        return !kcexrzcfyt(wkgbmnqykcVar).equals(iobyxmoadg(wkgbmnqykcVar));
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append("StandardZoneRules[currentStandardOffset=");
        vdvldrhtss[] vdvldrhtssVarArr = this.f40800yggfygwlhe;
        sb3.append(vdvldrhtssVarArr[vdvldrhtssVarArr.length - 1]);
        sb3.append("]");
        return sb3.toString();
    }

    @Override // hm.gxszxtbevo
    public wkgbmnqykc wkgbmnqykc(cm.gxszxtbevo gxszxtbevoVar) {
        Object objVdvldrhtss = vdvldrhtss(gxszxtbevoVar);
        if (objVdvldrhtss instanceof wkgbmnqykc) {
            return (wkgbmnqykc) objVdvldrhtss;
        }
        return null;
    }

    void yggfygwlhe(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.f40801zdlpuopuiu.length);
        for (long j13 : this.f40801zdlpuopuiu) {
            iobyxmoadg.dxjokdxxww(j13, dataOutput);
        }
        for (vdvldrhtss vdvldrhtssVar : this.f40800yggfygwlhe) {
            iobyxmoadg.draadjrbmk(vdvldrhtssVar, dataOutput);
        }
        dataOutput.writeInt(this.f40798jyumaefscl.length);
        for (long j14 : this.f40798jyumaefscl) {
            iobyxmoadg.dxjokdxxww(j14, dataOutput);
        }
        for (vdvldrhtss vdvldrhtssVar2 : this.f40795cqumvgiudr) {
            iobyxmoadg.draadjrbmk(vdvldrhtssVar2, dataOutput);
        }
        dataOutput.writeByte(this.f40796esjtqupxsv.length);
        for (eablkybsjg eablkybsjgVar : this.f40796esjtqupxsv) {
            eablkybsjgVar.nufgyqmvbu(dataOutput);
        }
    }
}
