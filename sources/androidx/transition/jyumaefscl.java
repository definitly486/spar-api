package androidx.transition;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class jyumaefscl extends gtknphoqwx {

    /* JADX INFO: renamed from: yfnezrywwk, reason: collision with root package name */
    int f13533yfnezrywwk;

    /* JADX INFO: renamed from: czzsidtyhn, reason: collision with root package name */
    ArrayList f13529czzsidtyhn = new ArrayList();

    /* JADX INFO: renamed from: uwvvkdfqfp, reason: collision with root package name */
    private boolean f13531uwvvkdfqfp = true;

    /* JADX INFO: renamed from: ydmasvzmpa, reason: collision with root package name */
    boolean f13532ydmasvzmpa = false;

    /* JADX INFO: renamed from: sflfametgt, reason: collision with root package name */
    private int f13530sflfametgt = 0;

    class iobyxmoadg extends oxmwwwfdhm {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f13534iobyxmoadg;

        iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this.f13534iobyxmoadg = gtknphoqwxVar;
        }

        @Override // androidx.transition.oxmwwwfdhm, androidx.transition.gtknphoqwx.nufgyqmvbu
        public void dxjokdxxww(gtknphoqwx gtknphoqwxVar) {
            this.f13534iobyxmoadg.metgxyhuhe();
            gtknphoqwxVar.ikoacuggdj(this);
        }
    }

    static class ppxfxbqfkf extends oxmwwwfdhm {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        jyumaefscl f13536iobyxmoadg;

        ppxfxbqfkf(jyumaefscl jyumaefsclVar) {
            this.f13536iobyxmoadg = jyumaefsclVar;
        }

        @Override // androidx.transition.oxmwwwfdhm, androidx.transition.gtknphoqwx.nufgyqmvbu
        public void dxjokdxxww(gtknphoqwx gtknphoqwxVar) {
            jyumaefscl jyumaefsclVar = this.f13536iobyxmoadg;
            int i13 = jyumaefsclVar.f13533yfnezrywwk - 1;
            jyumaefsclVar.f13533yfnezrywwk = i13;
            if (i13 == 0) {
                jyumaefsclVar.f13532ydmasvzmpa = false;
                jyumaefsclVar.zdlpuopuiu();
            }
            gtknphoqwxVar.ikoacuggdj(this);
        }

        @Override // androidx.transition.oxmwwwfdhm, androidx.transition.gtknphoqwx.nufgyqmvbu
        public void zoijcleaow(gtknphoqwx gtknphoqwxVar) {
            jyumaefscl jyumaefsclVar = this.f13536iobyxmoadg;
            if (jyumaefsclVar.f13532ydmasvzmpa) {
                return;
            }
            jyumaefsclVar.oipsdeybqn();
            this.f13536iobyxmoadg.f13532ydmasvzmpa = true;
        }
    }

    class zoijcleaow extends oxmwwwfdhm {
        zoijcleaow() {
        }

        @Override // androidx.transition.oxmwwwfdhm, androidx.transition.gtknphoqwx.nufgyqmvbu
        public void gtknphoqwx(gtknphoqwx gtknphoqwxVar) {
            jyumaefscl.this.f13529czzsidtyhn.remove(gtknphoqwxVar);
            if (jyumaefscl.this.hkdspvbjdz()) {
                return;
            }
            jyumaefscl.this.jlmebxxoox(gtknphoqwx.dxjokdxxww.f13505ppxfxbqfkf, false);
            jyumaefscl jyumaefsclVar = jyumaefscl.this;
            jyumaefsclVar.f13486ntlheqmsrt = true;
            jyumaefsclVar.jlmebxxoox(gtknphoqwx.dxjokdxxww.f13507zoijcleaow, false);
        }
    }

    private void igdgnonuha() {
        ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(this);
        Iterator it = this.f13529czzsidtyhn.iterator();
        while (it.hasNext()) {
            ((gtknphoqwx) it.next()).ppxfxbqfkf(ppxfxbqfkfVar);
        }
        this.f13533yfnezrywwk = this.f13529czzsidtyhn.size();
    }

    private void lrnfpwlwnk(gtknphoqwx gtknphoqwxVar) {
        this.f13529czzsidtyhn.add(gtknphoqwxVar);
        gtknphoqwxVar.f13472hcddaimhww = this;
    }

    private int tbqsvytpvh(long j13) {
        for (int i13 = 1; i13 < this.f13529czzsidtyhn.size(); i13++) {
            if (((gtknphoqwx) this.f13529czzsidtyhn.get(i13)).f13487okpsazkaxt > j13) {
                return i13 - 1;
            }
        }
        return this.f13529czzsidtyhn.size() - 1;
    }

    @Override // androidx.transition.gtknphoqwx
    /* JADX INFO: renamed from: auzgnhcxok, reason: merged with bridge method [inline-methods] */
    public jyumaefscl czzsidtyhn(long j13) {
        ArrayList arrayList;
        super.czzsidtyhn(j13);
        if (this.f13481jyumaefscl >= 0 && (arrayList = this.f13529czzsidtyhn) != null) {
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                ((gtknphoqwx) this.f13529czzsidtyhn.get(i13)).czzsidtyhn(j13);
            }
        }
        return this;
    }

    @Override // androidx.transition.gtknphoqwx
    String bfopjjpdmp(String str) {
        String strBfopjjpdmp = super.bfopjjpdmp(str);
        for (int i13 = 0; i13 < this.f13529czzsidtyhn.size(); i13++) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(strBfopjjpdmp);
            sb3.append("\n");
            sb3.append(((gtknphoqwx) this.f13529czzsidtyhn.get(i13)).bfopjjpdmp(str + "  "));
            strBfopjjpdmp = sb3.toString();
        }
        return strBfopjjpdmp;
    }

    @Override // androidx.transition.gtknphoqwx
    protected void cancel() {
        super.cancel();
        int size = this.f13529czzsidtyhn.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((gtknphoqwx) this.f13529czzsidtyhn.get(i13)).cancel();
        }
    }

    @Override // androidx.transition.gtknphoqwx
    public boolean cllcsxoeiz() {
        int size = this.f13529czzsidtyhn.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (!((gtknphoqwx) this.f13529czzsidtyhn.get(i13)).cllcsxoeiz()) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.transition.gtknphoqwx
    void draadjrbmk(cqumvgiudr cqumvgiudrVar) {
        super.draadjrbmk(cqumvgiudrVar);
        int size = this.f13529czzsidtyhn.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((gtknphoqwx) this.f13529czzsidtyhn.get(i13)).draadjrbmk(cqumvgiudrVar);
        }
    }

    public jyumaefscl dvvnrvtcbc(int i13) {
        if (i13 == 0) {
            this.f13531uwvvkdfqfp = true;
        } else {
            if (i13 != 1) {
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i13);
            }
            this.f13531uwvvkdfqfp = false;
        }
        return this;
    }

    @Override // androidx.transition.gtknphoqwx
    boolean hkdspvbjdz() {
        for (int i13 = 0; i13 < this.f13529czzsidtyhn.size(); i13++) {
            if (((gtknphoqwx) this.f13529czzsidtyhn.get(i13)).hkdspvbjdz()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.transition.gtknphoqwx
    /* JADX INFO: renamed from: iwxlajgraz, reason: merged with bridge method [inline-methods] */
    public jyumaefscl yfnezrywwk(TimeInterpolator timeInterpolator) {
        this.f13530sflfametgt |= 1;
        ArrayList arrayList = this.f13529czzsidtyhn;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                ((gtknphoqwx) this.f13529czzsidtyhn.get(i13)).yfnezrywwk(timeInterpolator);
            }
        }
        return (jyumaefscl) super.yfnezrywwk(timeInterpolator);
    }

    @Override // androidx.transition.gtknphoqwx
    /* JADX INFO: renamed from: iyctptxqzt, reason: merged with bridge method [inline-methods] */
    public jyumaefscl wkgbmnqykc(View view) {
        for (int i13 = 0; i13 < this.f13529czzsidtyhn.size(); i13++) {
            ((gtknphoqwx) this.f13529czzsidtyhn.get(i13)).wkgbmnqykc(view);
        }
        return (jyumaefscl) super.wkgbmnqykc(view);
    }

    @Override // androidx.transition.gtknphoqwx
    void jhduphickx() {
        this.f13478jhduphickx = 0L;
        zoijcleaow zoijcleaowVar = new zoijcleaow();
        for (int i13 = 0; i13 < this.f13529czzsidtyhn.size(); i13++) {
            gtknphoqwx gtknphoqwxVar = (gtknphoqwx) this.f13529czzsidtyhn.get(i13);
            gtknphoqwxVar.ppxfxbqfkf(zoijcleaowVar);
            gtknphoqwxVar.jhduphickx();
            long jPkzmftpjix = gtknphoqwxVar.pkzmftpjix();
            if (this.f13531uwvvkdfqfp) {
                this.f13478jhduphickx = Math.max(this.f13478jhduphickx, jPkzmftpjix);
            } else {
                long j13 = this.f13478jhduphickx;
                gtknphoqwxVar.f13487okpsazkaxt = j13;
                this.f13478jhduphickx = j13 + jPkzmftpjix;
            }
        }
    }

    @Override // androidx.transition.gtknphoqwx
    public void jztzpxfvev(View view) {
        super.jztzpxfvev(view);
        int size = this.f13529czzsidtyhn.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((gtknphoqwx) this.f13529czzsidtyhn.get(i13)).jztzpxfvev(view);
        }
    }

    @Override // androidx.transition.gtknphoqwx
    protected void metgxyhuhe() {
        if (this.f13529czzsidtyhn.isEmpty()) {
            oipsdeybqn();
            zdlpuopuiu();
            return;
        }
        igdgnonuha();
        if (this.f13531uwvvkdfqfp) {
            Iterator it = this.f13529czzsidtyhn.iterator();
            while (it.hasNext()) {
                ((gtknphoqwx) it.next()).metgxyhuhe();
            }
            return;
        }
        for (int i13 = 1; i13 < this.f13529czzsidtyhn.size(); i13++) {
            ((gtknphoqwx) this.f13529czzsidtyhn.get(i13 - 1)).ppxfxbqfkf(new iobyxmoadg((gtknphoqwx) this.f13529czzsidtyhn.get(i13)));
        }
        gtknphoqwx gtknphoqwxVar = (gtknphoqwx) this.f13529czzsidtyhn.get(0);
        if (gtknphoqwxVar != null) {
            gtknphoqwxVar.metgxyhuhe();
        }
    }

    @Override // androidx.transition.gtknphoqwx
    public void nufgyqmvbu(cqumvgiudr cqumvgiudrVar) {
        if (wypolnanlu(cqumvgiudrVar.f13439zoijcleaow)) {
            for (gtknphoqwx gtknphoqwxVar : this.f13529czzsidtyhn) {
                if (gtknphoqwxVar.wypolnanlu(cqumvgiudrVar.f13439zoijcleaow)) {
                    gtknphoqwxVar.nufgyqmvbu(cqumvgiudrVar);
                    cqumvgiudrVar.f13438ppxfxbqfkf.add(gtknphoqwxVar);
                }
            }
        }
    }

    public int nuxfzjnpeb() {
        return this.f13529czzsidtyhn.size();
    }

    @Override // androidx.transition.gtknphoqwx
    /* JADX INFO: renamed from: opjhrmiecq, reason: merged with bridge method [inline-methods] */
    public jyumaefscl ppxfxbqfkf(gtknphoqwx.nufgyqmvbu nufgyqmvbuVar) {
        return (jyumaefscl) super.ppxfxbqfkf(nufgyqmvbuVar);
    }

    @Override // androidx.transition.gtknphoqwx
    void oxmwwwfdhm(ViewGroup viewGroup, esjtqupxsv esjtqupxsvVar, esjtqupxsv esjtqupxsvVar2, ArrayList arrayList, ArrayList arrayList2) {
        long jCdpycssgdh = cdpycssgdh();
        int size = this.f13529czzsidtyhn.size();
        for (int i13 = 0; i13 < size; i13++) {
            gtknphoqwx gtknphoqwxVar = (gtknphoqwx) this.f13529czzsidtyhn.get(i13);
            if (jCdpycssgdh > 0 && (this.f13531uwvvkdfqfp || i13 == 0)) {
                long jCdpycssgdh2 = gtknphoqwxVar.cdpycssgdh();
                if (jCdpycssgdh2 > 0) {
                    gtknphoqwxVar.zfvoamnweg(jCdpycssgdh2 + jCdpycssgdh);
                } else {
                    gtknphoqwxVar.zfvoamnweg(jCdpycssgdh);
                }
            }
            gtknphoqwxVar.oxmwwwfdhm(viewGroup, esjtqupxsvVar, esjtqupxsvVar2, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.gtknphoqwx
    /* JADX INFO: renamed from: rgvfuqvkyq, reason: merged with bridge method [inline-methods] */
    public gtknphoqwx clone() {
        jyumaefscl jyumaefsclVar = (jyumaefscl) super.clone();
        jyumaefsclVar.f13529czzsidtyhn = new ArrayList();
        int size = this.f13529czzsidtyhn.size();
        for (int i13 = 0; i13 < size; i13++) {
            jyumaefsclVar.lrnfpwlwnk(((gtknphoqwx) this.f13529czzsidtyhn.get(i13)).clone());
        }
        return jyumaefsclVar;
    }

    @Override // androidx.transition.gtknphoqwx
    public void ribwqtqdhb(View view) {
        super.ribwqtqdhb(view);
        int size = this.f13529czzsidtyhn.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((gtknphoqwx) this.f13529czzsidtyhn.get(i13)).ribwqtqdhb(view);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    @Override // androidx.transition.gtknphoqwx
    void rlfsiqarku(long j13, long j14) {
        boolean z13;
        long jPkzmftpjix = pkzmftpjix();
        if (this.f13472hcddaimhww != null) {
            if (j13 < 0 && j14 < 0) {
                return;
            }
            if (j13 > jPkzmftpjix && j14 > jPkzmftpjix) {
                return;
            }
        }
        boolean z14 = j13 < j14;
        if ((j13 >= 0 && j14 < 0) || (j13 <= jPkzmftpjix && j14 > jPkzmftpjix)) {
            this.f13486ntlheqmsrt = false;
            jlmebxxoox(gtknphoqwx.dxjokdxxww.f13504iobyxmoadg, z14);
        }
        if (!this.f13531uwvvkdfqfp) {
            int iTbqsvytpvh = tbqsvytpvh(j14);
            if (j13 >= j14) {
                while (true) {
                    if (iTbqsvytpvh < this.f13529czzsidtyhn.size()) {
                        gtknphoqwx gtknphoqwxVar = (gtknphoqwx) this.f13529czzsidtyhn.get(iTbqsvytpvh);
                        long j15 = gtknphoqwxVar.f13487okpsazkaxt;
                        z13 = z14;
                        long j16 = j13 - j15;
                        if (j16 < 0) {
                            break;
                        }
                        gtknphoqwxVar.rlfsiqarku(j16, j14 - j15);
                        iTbqsvytpvh++;
                        z14 = z13;
                    }
                }
            } else {
                z13 = z14;
                while (iTbqsvytpvh >= 0) {
                    gtknphoqwx gtknphoqwxVar2 = (gtknphoqwx) this.f13529czzsidtyhn.get(iTbqsvytpvh);
                    long j17 = gtknphoqwxVar2.f13487okpsazkaxt;
                    long j18 = j13 - j17;
                    gtknphoqwxVar2.rlfsiqarku(j18, j14 - j17);
                    if (j18 >= 0) {
                        break;
                    } else {
                        iTbqsvytpvh--;
                    }
                }
            }
            if (this.f13472hcddaimhww != null) {
                if ((j13 > jPkzmftpjix || j14 > jPkzmftpjix) && (j13 >= 0 || j14 < 0)) {
                    return;
                }
                if (j13 > jPkzmftpjix) {
                    this.f13486ntlheqmsrt = true;
                }
                jlmebxxoox(gtknphoqwx.dxjokdxxww.f13507zoijcleaow, z13);
            }
        }
        for (int i13 = 0; i13 < this.f13529czzsidtyhn.size(); i13++) {
            ((gtknphoqwx) this.f13529czzsidtyhn.get(i13)).rlfsiqarku(j13, j14);
        }
        z13 = z14;
        if (this.f13472hcddaimhww != null) {
            if (j13 > jPkzmftpjix) {
                return;
            } else {
                return;
            }
            if (j13 > jPkzmftpjix) {
                this.f13486ntlheqmsrt = true;
            }
            jlmebxxoox(gtknphoqwx.dxjokdxxww.f13507zoijcleaow, z13);
        }
    }

    @Override // androidx.transition.gtknphoqwx
    /* JADX INFO: renamed from: roivzttewh, reason: merged with bridge method [inline-methods] */
    public jyumaefscl ikoacuggdj(gtknphoqwx.nufgyqmvbu nufgyqmvbuVar) {
        return (jyumaefscl) super.ikoacuggdj(nufgyqmvbuVar);
    }

    @Override // androidx.transition.gtknphoqwx
    public void sflfametgt(zdlpuopuiu zdlpuopuiuVar) {
        super.sflfametgt(zdlpuopuiuVar);
        this.f13530sflfametgt |= 2;
        int size = this.f13529czzsidtyhn.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((gtknphoqwx) this.f13529czzsidtyhn.get(i13)).sflfametgt(zdlpuopuiuVar);
        }
    }

    @Override // androidx.transition.gtknphoqwx
    /* JADX INFO: renamed from: skhdrjzrfn, reason: merged with bridge method [inline-methods] */
    public jyumaefscl zfvoamnweg(long j13) {
        return (jyumaefscl) super.zfvoamnweg(j13);
    }

    @Override // androidx.transition.gtknphoqwx
    /* JADX INFO: renamed from: uawqvzlxes, reason: merged with bridge method [inline-methods] */
    public jyumaefscl okpsazkaxt(View view) {
        for (int i13 = 0; i13 < this.f13529czzsidtyhn.size(); i13++) {
            ((gtknphoqwx) this.f13529czzsidtyhn.get(i13)).okpsazkaxt(view);
        }
        return (jyumaefscl) super.okpsazkaxt(view);
    }

    @Override // androidx.transition.gtknphoqwx
    public void uwvvkdfqfp(gtknphoqwx.eablkybsjg eablkybsjgVar) {
        super.uwvvkdfqfp(eablkybsjgVar);
        this.f13530sflfametgt |= 8;
        int size = this.f13529czzsidtyhn.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((gtknphoqwx) this.f13529czzsidtyhn.get(i13)).uwvvkdfqfp(eablkybsjgVar);
        }
    }

    public jyumaefscl weqkydbzbr(gtknphoqwx gtknphoqwxVar) {
        lrnfpwlwnk(gtknphoqwxVar);
        long j13 = this.f13481jyumaefscl;
        if (j13 >= 0) {
            gtknphoqwxVar.czzsidtyhn(j13);
        }
        if ((this.f13530sflfametgt & 1) != 0) {
            gtknphoqwxVar.yfnezrywwk(iwizpuwonk());
        }
        if ((this.f13530sflfametgt & 2) != 0) {
            pmvmpeiblj();
            gtknphoqwxVar.sflfametgt(null);
        }
        if ((this.f13530sflfametgt & 4) != 0) {
            gtknphoqwxVar.ydmasvzmpa(lereixgezr());
        }
        if ((this.f13530sflfametgt & 8) != 0) {
            gtknphoqwxVar.uwvvkdfqfp(jyumaefscl());
        }
        return this;
    }

    @Override // androidx.transition.gtknphoqwx
    public void wflxmlrfwp(cqumvgiudr cqumvgiudrVar) {
        if (wypolnanlu(cqumvgiudrVar.f13439zoijcleaow)) {
            for (gtknphoqwx gtknphoqwxVar : this.f13529czzsidtyhn) {
                if (gtknphoqwxVar.wypolnanlu(cqumvgiudrVar.f13439zoijcleaow)) {
                    gtknphoqwxVar.wflxmlrfwp(cqumvgiudrVar);
                    cqumvgiudrVar.f13438ppxfxbqfkf.add(gtknphoqwxVar);
                }
            }
        }
    }

    @Override // androidx.transition.gtknphoqwx
    public void ydmasvzmpa(lqeggnwhkg lqeggnwhkgVar) {
        super.ydmasvzmpa(lqeggnwhkgVar);
        this.f13530sflfametgt |= 4;
        if (this.f13529czzsidtyhn != null) {
            for (int i13 = 0; i13 < this.f13529czzsidtyhn.size(); i13++) {
                ((gtknphoqwx) this.f13529czzsidtyhn.get(i13)).ydmasvzmpa(lqeggnwhkgVar);
            }
        }
    }

    public gtknphoqwx zeieaojujs(int i13) {
        if (i13 < 0 || i13 >= this.f13529czzsidtyhn.size()) {
            return null;
        }
        return (gtknphoqwx) this.f13529czzsidtyhn.get(i13);
    }
}
