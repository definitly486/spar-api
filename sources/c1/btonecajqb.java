package c1;

import d1.ojitshcjhn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class btonecajqb extends eablkybsjg implements dxjokdxxww {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public eablkybsjg[] f18228a = new eablkybsjg[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18229b = 0;

    public void B(ArrayList arrayList, int i13, ojitshcjhn ojitshcjhnVar) {
        for (int i14 = 0; i14 < this.f18229b; i14++) {
            ojitshcjhnVar.iobyxmoadg(this.f18228a[i14]);
        }
        for (int i15 = 0; i15 < this.f18229b; i15++) {
            d1.dxjokdxxww.iobyxmoadg(this.f18228a[i15], i13, arrayList, ojitshcjhnVar);
        }
    }

    public int C(int i13) {
        int i14;
        int i15;
        for (int i16 = 0; i16 < this.f18229b; i16++) {
            eablkybsjg eablkybsjgVar = this.f18228a[i16];
            if (i13 == 0 && (i15 = eablkybsjgVar.f18323yzdjzghtvl) != -1) {
                return i15;
            }
            if (i13 == 1 && (i14 = eablkybsjgVar.f18247eslsurpljm) != -1) {
                return i14;
            }
        }
        return -1;
    }

    @Override // c1.eablkybsjg
    public void agtfadlqog(eablkybsjg eablkybsjgVar, HashMap map) {
        super.agtfadlqog(eablkybsjgVar, map);
        btonecajqb btonecajqbVar = (btonecajqb) eablkybsjgVar;
        this.f18229b = 0;
        int i13 = btonecajqbVar.f18229b;
        for (int i14 = 0; i14 < i13; i14++) {
            iobyxmoadg((eablkybsjg) map.get(btonecajqbVar.f18228a[i14]));
        }
    }

    @Override // c1.dxjokdxxww
    public void iobyxmoadg(eablkybsjg eablkybsjgVar) {
        if (eablkybsjgVar == this || eablkybsjgVar == null) {
            return;
        }
        int i13 = this.f18229b + 1;
        eablkybsjg[] eablkybsjgVarArr = this.f18228a;
        if (i13 > eablkybsjgVarArr.length) {
            this.f18228a = (eablkybsjg[]) Arrays.copyOf(eablkybsjgVarArr, eablkybsjgVarArr.length * 2);
        }
        eablkybsjg[] eablkybsjgVarArr2 = this.f18228a;
        int i14 = this.f18229b;
        eablkybsjgVarArr2[i14] = eablkybsjgVar;
        this.f18229b = i14 + 1;
    }

    @Override // c1.dxjokdxxww
    public void ppxfxbqfkf() {
        this.f18229b = 0;
        Arrays.fill(this.f18228a, (Object) null);
    }

    @Override // c1.dxjokdxxww
    public void zoijcleaow(gxszxtbevo gxszxtbevoVar) {
    }
}
