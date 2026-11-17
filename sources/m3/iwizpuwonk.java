package m3;

import com.google.common.collect.lereixgezr;
import v2.yadqdtsiqt;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class iwizpuwonk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final int f65036iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f65037ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final com.google.common.collect.zdlpuopuiu f65038zoijcleaow;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final iwizpuwonk f65035wkgbmnqykc = new iwizpuwonk(new yadqdtsiqt[0]);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final String f65034eablkybsjg = stevsuqkhv.uawqvzlxes(0);

    public iwizpuwonk(yadqdtsiqt... yadqdtsiqtVarArr) {
        this.f65038zoijcleaow = com.google.common.collect.zdlpuopuiu.cqumvgiudr(yadqdtsiqtVarArr);
        this.f65036iobyxmoadg = yadqdtsiqtVarArr.length;
        gxszxtbevo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer eablkybsjg(yadqdtsiqt yadqdtsiqtVar) {
        return Integer.valueOf(yadqdtsiqtVar.f115706ppxfxbqfkf);
    }

    private void gxszxtbevo() {
        int i13 = 0;
        while (i13 < this.f65038zoijcleaow.size()) {
            int i14 = i13 + 1;
            for (int i15 = i14; i15 < this.f65038zoijcleaow.size(); i15++) {
                if (((yadqdtsiqt) this.f65038zoijcleaow.get(i13)).equals(this.f65038zoijcleaow.get(i15))) {
                    y2.kcexrzcfyt.wkgbmnqykc("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i13 = i14;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || iwizpuwonk.class != obj.getClass()) {
            return false;
        }
        iwizpuwonk iwizpuwonkVar = (iwizpuwonk) obj;
        return this.f65036iobyxmoadg == iwizpuwonkVar.f65036iobyxmoadg && this.f65038zoijcleaow.equals(iwizpuwonkVar.f65038zoijcleaow);
    }

    public int hashCode() {
        if (this.f65037ppxfxbqfkf == 0) {
            this.f65037ppxfxbqfkf = this.f65038zoijcleaow.hashCode();
        }
        return this.f65037ppxfxbqfkf;
    }

    public com.google.common.collect.zdlpuopuiu ppxfxbqfkf() {
        return com.google.common.collect.zdlpuopuiu.jyumaefscl(lereixgezr.nufgyqmvbu(this.f65038zoijcleaow, new xa.eablkybsjg() { // from class: m3.jyumaefscl
            @Override // xa.eablkybsjg
            public final Object apply(Object obj) {
                return iwizpuwonk.eablkybsjg((yadqdtsiqt) obj);
            }
        }));
    }

    public String toString() {
        return this.f65038zoijcleaow.toString();
    }

    public int wkgbmnqykc(yadqdtsiqt yadqdtsiqtVar) {
        int iIndexOf = this.f65038zoijcleaow.indexOf(yadqdtsiqtVar);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public yadqdtsiqt zoijcleaow(int i13) {
        return (yadqdtsiqt) this.f65038zoijcleaow.get(i13);
    }
}
