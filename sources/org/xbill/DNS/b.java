package org.xbill.DNS;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class b implements Serializable {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private long f74239iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private short f74240jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final ArrayList f74241yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final ArrayList f74242zdlpuopuiu;

    public b() {
        this.f74242zdlpuopuiu = new ArrayList(1);
        this.f74241yggfygwlhe = new ArrayList(0);
    }

    private void agtfadlqog(e eVar, List list) {
        if (!list.isEmpty() && !eVar.hkdspvbjdz((e) list.get(0))) {
            throw new IllegalArgumentException("record does not match rrset");
        }
    }

    private void btonecajqb(Iterator it, StringBuilder sb3) {
        while (it.hasNext()) {
            e eVar = (e) it.next();
            sb3.append("[");
            sb3.append(eVar.lmojexxdyd());
            sb3.append("]");
            if (it.hasNext()) {
                sb3.append(" ");
            }
        }
    }

    private void dxjokdxxww(long j13, List list) {
        for (int i13 = 0; i13 < list.size(); i13++) {
            e eVarAgtfadlqog = ((e) list.get(i13)).agtfadlqog();
            eVarAgtfadlqog.cllcsxoeiz(j13);
            list.set(i13, eVarAgtfadlqog);
        }
    }

    private void nufgyqmvbu(e eVar, List list) {
        if (this.f74241yggfygwlhe.isEmpty() && this.f74242zdlpuopuiu.isEmpty()) {
            list.add(eVar);
            this.f74239iwizpuwonk = eVar.pmvmpeiblj();
            return;
        }
        agtfadlqog(eVar, this.f74242zdlpuopuiu);
        agtfadlqog(eVar, this.f74241yggfygwlhe);
        if (eVar.pmvmpeiblj() > this.f74239iwizpuwonk) {
            eVar = eVar.agtfadlqog();
            eVar.cllcsxoeiz(this.f74239iwizpuwonk);
        } else if (eVar.pmvmpeiblj() < this.f74239iwizpuwonk) {
            this.f74239iwizpuwonk = eVar.pmvmpeiblj();
            dxjokdxxww(eVar.pmvmpeiblj(), this.f74242zdlpuopuiu);
            dxjokdxxww(eVar.pmvmpeiblj(), this.f74241yggfygwlhe);
        }
        if (list.contains(eVar)) {
            return;
        }
        list.add(eVar);
    }

    protected boolean draadjrbmk(Object obj) {
        return obj instanceof b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!bVar.draadjrbmk(this)) {
            return false;
        }
        ArrayList arrayList = this.f74242zdlpuopuiu;
        ArrayList arrayList2 = bVar.f74242zdlpuopuiu;
        if (arrayList != null ? !arrayList.equals(arrayList2) : arrayList2 != null) {
            return false;
        }
        ArrayList arrayList3 = this.f74241yggfygwlhe;
        ArrayList arrayList4 = bVar.f74241yggfygwlhe;
        return arrayList3 != null ? arrayList3.equals(arrayList4) : arrayList4 == null;
    }

    public int getType() {
        return ojitshcjhn().lereixgezr();
    }

    public int hashCode() {
        ArrayList arrayList = this.f74242zdlpuopuiu;
        int iHashCode = arrayList == null ? 43 : arrayList.hashCode();
        ArrayList arrayList2 = this.f74241yggfygwlhe;
        return ((iHashCode + 59) * 59) + (arrayList2 != null ? arrayList2.hashCode() : 43);
    }

    public long kcexrzcfyt() {
        return ojitshcjhn().pmvmpeiblj();
    }

    public void lqeggnwhkg(e eVar) {
        if (eVar instanceof a) {
            nufgyqmvbu((a) eVar, this.f74241yggfygwlhe);
        } else {
            nufgyqmvbu(eVar, this.f74242zdlpuopuiu);
        }
    }

    public e ojitshcjhn() {
        if (!this.f74242zdlpuopuiu.isEmpty()) {
            return (e) this.f74242zdlpuopuiu.get(0);
        }
        if (this.f74241yggfygwlhe.isEmpty()) {
            throw new IllegalStateException("rrset is empty");
        }
        return (e) this.f74241yggfygwlhe.get(0);
    }

    public int rgvfuqvkyq() {
        return ojitshcjhn().zdlpuopuiu();
    }

    public String toString() {
        if (this.f74242zdlpuopuiu.isEmpty() && this.f74241yggfygwlhe.isEmpty()) {
            return "{empty}";
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("{ ");
        sb3.append(vdvldrhtss());
        sb3.append(" ");
        sb3.append(kcexrzcfyt());
        sb3.append(" ");
        sb3.append(rgvfuqvkyq.zoijcleaow(rgvfuqvkyq()));
        sb3.append(" ");
        sb3.append(x2.wkgbmnqykc(getType()));
        sb3.append(" ");
        btonecajqb(this.f74242zdlpuopuiu.iterator(), sb3);
        if (!this.f74241yggfygwlhe.isEmpty()) {
            sb3.append(" sigs: ");
            btonecajqb(this.f74241yggfygwlhe.iterator(), sb3);
        }
        sb3.append(" }");
        return sb3.toString();
    }

    public auzgnhcxok vdvldrhtss() {
        return ojitshcjhn().cqumvgiudr();
    }

    public List yggfygwlhe(boolean z13) {
        if (!z13 || this.f74242zdlpuopuiu.size() <= 1) {
            return Collections.unmodifiableList(this.f74242zdlpuopuiu);
        }
        ArrayList arrayList = new ArrayList(this.f74242zdlpuopuiu.size());
        if (this.f74240jyumaefscl == Short.MAX_VALUE) {
            this.f74240jyumaefscl = (short) 0;
        }
        short s13 = this.f74240jyumaefscl;
        this.f74240jyumaefscl = (short) (s13 + 1);
        int size = s13 % this.f74242zdlpuopuiu.size();
        ArrayList arrayList2 = this.f74242zdlpuopuiu;
        arrayList.addAll(arrayList2.subList(size, arrayList2.size()));
        arrayList.addAll(this.f74242zdlpuopuiu.subList(0, size));
        return arrayList;
    }

    public List zdlpuopuiu() {
        return yggfygwlhe(true);
    }

    public b(e eVar) {
        this();
        lqeggnwhkg(eVar);
    }

    public b(b bVar) {
        this.f74242zdlpuopuiu = new ArrayList(bVar.f74242zdlpuopuiu);
        this.f74241yggfygwlhe = new ArrayList(bVar.f74241yggfygwlhe);
        this.f74240jyumaefscl = bVar.f74240jyumaefscl;
        this.f74239iwizpuwonk = bVar.f74239iwizpuwonk;
    }
}
