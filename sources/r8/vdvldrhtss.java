package r8;

import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class vdvldrhtss implements agtfadlqog {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f82100iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final u1.eablkybsjg f82101zoijcleaow;

    static class iobyxmoadg implements com.bumptech.glide.load.data.wkgbmnqykc, com.bumptech.glide.load.data.wkgbmnqykc.iobyxmoadg {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private com.bumptech.glide.load.data.wkgbmnqykc.iobyxmoadg f82102cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private List f82103esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private com.bumptech.glide.btonecajqb f82104iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private int f82105jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        private boolean f82106lereixgezr;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final u1.eablkybsjg f82107yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final List f82108zdlpuopuiu;

        iobyxmoadg(List list, u1.eablkybsjg eablkybsjgVar) {
            this.f82107yggfygwlhe = eablkybsjgVar;
            g9.gtknphoqwx.wkgbmnqykc(list);
            this.f82108zdlpuopuiu = list;
            this.f82105jyumaefscl = 0;
        }

        private void lqeggnwhkg() {
            if (this.f82106lereixgezr) {
                return;
            }
            if (this.f82105jyumaefscl < this.f82108zdlpuopuiu.size() - 1) {
                this.f82105jyumaefscl++;
                eablkybsjg(this.f82104iwizpuwonk, this.f82102cqumvgiudr);
            } else {
                g9.gtknphoqwx.eablkybsjg(this.f82103esjtqupxsv);
                this.f82102cqumvgiudr.ppxfxbqfkf(new GlideException("Fetch failed", new ArrayList(this.f82103esjtqupxsv)));
            }
        }

        @Override // com.bumptech.glide.load.data.wkgbmnqykc
        public void cancel() {
            this.f82106lereixgezr = true;
            Iterator it = this.f82108zdlpuopuiu.iterator();
            while (it.hasNext()) {
                ((com.bumptech.glide.load.data.wkgbmnqykc) it.next()).cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.wkgbmnqykc
        public void eablkybsjg(com.bumptech.glide.btonecajqb btonecajqbVar, com.bumptech.glide.load.data.wkgbmnqykc.iobyxmoadg iobyxmoadgVar) {
            this.f82104iwizpuwonk = btonecajqbVar;
            this.f82102cqumvgiudr = iobyxmoadgVar;
            this.f82103esjtqupxsv = (List) this.f82107yggfygwlhe.zoijcleaow();
            ((com.bumptech.glide.load.data.wkgbmnqykc) this.f82108zdlpuopuiu.get(this.f82105jyumaefscl)).eablkybsjg(btonecajqbVar, this);
            if (this.f82106lereixgezr) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.wkgbmnqykc.iobyxmoadg
        public void gxszxtbevo(Object obj) {
            if (obj != null) {
                this.f82102cqumvgiudr.gxszxtbevo(obj);
            } else {
                lqeggnwhkg();
            }
        }

        @Override // com.bumptech.glide.load.data.wkgbmnqykc
        public Class iobyxmoadg() {
            return ((com.bumptech.glide.load.data.wkgbmnqykc) this.f82108zdlpuopuiu.get(0)).iobyxmoadg();
        }

        @Override // com.bumptech.glide.load.data.wkgbmnqykc.iobyxmoadg
        public void ppxfxbqfkf(Exception exc) {
            ((List) g9.gtknphoqwx.eablkybsjg(this.f82103esjtqupxsv)).add(exc);
            lqeggnwhkg();
        }

        @Override // com.bumptech.glide.load.data.wkgbmnqykc
        public l8.iobyxmoadg wkgbmnqykc() {
            return ((com.bumptech.glide.load.data.wkgbmnqykc) this.f82108zdlpuopuiu.get(0)).wkgbmnqykc();
        }

        @Override // com.bumptech.glide.load.data.wkgbmnqykc
        public void zoijcleaow() {
            List list = this.f82103esjtqupxsv;
            if (list != null) {
                this.f82107yggfygwlhe.iobyxmoadg(list);
            }
            this.f82103esjtqupxsv = null;
            Iterator it = this.f82108zdlpuopuiu.iterator();
            while (it.hasNext()) {
                ((com.bumptech.glide.load.data.wkgbmnqykc) it.next()).zoijcleaow();
            }
        }
    }

    vdvldrhtss(List list, u1.eablkybsjg eablkybsjgVar) {
        this.f82100iobyxmoadg = list;
        this.f82101zoijcleaow = eablkybsjgVar;
    }

    @Override // r8.agtfadlqog
    public boolean iobyxmoadg(Object obj) {
        Iterator it = this.f82100iobyxmoadg.iterator();
        while (it.hasNext()) {
            if (((agtfadlqog) it.next()).iobyxmoadg(obj)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f82100iobyxmoadg.toArray()) + '}';
    }

    @Override // r8.agtfadlqog
    public agtfadlqog.iobyxmoadg zoijcleaow(Object obj, int i13, int i14, l8.lqeggnwhkg lqeggnwhkgVar) {
        agtfadlqog.iobyxmoadg iobyxmoadgVarZoijcleaow;
        int size = this.f82100iobyxmoadg.size();
        ArrayList arrayList = new ArrayList(size);
        l8.eablkybsjg eablkybsjgVar = null;
        for (int i15 = 0; i15 < size; i15++) {
            agtfadlqog agtfadlqogVar = (agtfadlqog) this.f82100iobyxmoadg.get(i15);
            if (agtfadlqogVar.iobyxmoadg(obj) && (iobyxmoadgVarZoijcleaow = agtfadlqogVar.zoijcleaow(obj, i13, i14, lqeggnwhkgVar)) != null) {
                eablkybsjgVar = iobyxmoadgVarZoijcleaow.f82020iobyxmoadg;
                arrayList.add(iobyxmoadgVarZoijcleaow.f82021ppxfxbqfkf);
            }
        }
        if (arrayList.isEmpty() || eablkybsjgVar == null) {
            return null;
        }
        return new agtfadlqog.iobyxmoadg(eablkybsjgVar, new iobyxmoadg(arrayList, this.f82101zoijcleaow));
    }
}
