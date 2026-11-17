package fk;

/* JADX INFO: loaded from: classes3.dex */
public final class esjtqupxsv extends iyctptxqzt {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private final gg.gtknphoqwx f34129agtfadlqog;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final dk.agtfadlqog f34130wflxmlrfwp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public esjtqupxsv(final String name, final int i13) {
        super(name, null, i13, 2, null);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        this.f34130wflxmlrfwp = dk.agtfadlqog.zoijcleaow.f29058iobyxmoadg;
        this.f34129agtfadlqog = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: fk.cqumvgiudr
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return esjtqupxsv.pmvmpeiblj(i13, name, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dk.gxszxtbevo[] pmvmpeiblj(int i13, String str, esjtqupxsv esjtqupxsvVar) {
        dk.gxszxtbevo[] gxszxtbevoVarArr = new dk.gxszxtbevo[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            gxszxtbevoVarArr[i14] = dk.wflxmlrfwp.nufgyqmvbu(str + '.' + esjtqupxsvVar.eablkybsjg(i14), dk.ojitshcjhn.wkgbmnqykc.f29097iobyxmoadg, new dk.gxszxtbevo[0], null, 8, null);
        }
        return gxszxtbevoVarArr;
    }

    private final dk.gxszxtbevo[] zynmafqrjb() {
        return (dk.gxszxtbevo[]) this.f34129agtfadlqog.getValue();
    }

    @Override // fk.iyctptxqzt
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof dk.gxszxtbevo)) {
            return false;
        }
        dk.gxszxtbevo gxszxtbevoVar = (dk.gxszxtbevo) obj;
        return gxszxtbevoVar.getKind() == dk.agtfadlqog.zoijcleaow.f29058iobyxmoadg && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(nufgyqmvbu(), gxszxtbevoVar.nufgyqmvbu()) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ydmasvzmpa.iobyxmoadg(this), ydmasvzmpa.iobyxmoadg(gxszxtbevoVar));
    }

    @Override // fk.iyctptxqzt, dk.gxszxtbevo
    public dk.agtfadlqog getKind() {
        return this.f34130wflxmlrfwp;
    }

    @Override // fk.iyctptxqzt
    public int hashCode() {
        int iHashCode = nufgyqmvbu().hashCode();
        int iHashCode2 = 1;
        for (String str : dk.btonecajqb.zoijcleaow(this)) {
            int i13 = iHashCode2 * 31;
            iHashCode2 = i13 + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // fk.iyctptxqzt, dk.gxszxtbevo
    public dk.gxszxtbevo lqeggnwhkg(int i13) {
        return zynmafqrjb()[i13];
    }

    @Override // fk.iyctptxqzt
    public String toString() {
        return hg.jyumaefscl.iwxlajgraz(dk.btonecajqb.zoijcleaow(this), ", ", nufgyqmvbu() + '(', ")", 0, null, null, 56, null);
    }
}
