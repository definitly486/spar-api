package fk;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class lmojexxdyd extends iyctptxqzt {

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private final boolean f34199wflxmlrfwp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lmojexxdyd(String name, iozdgvuglv generatedSerializer) {
        super(name, generatedSerializer, 1);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(generatedSerializer, "generatedSerializer");
        this.f34199wflxmlrfwp = true;
    }

    @Override // fk.iyctptxqzt
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lmojexxdyd) {
            dk.gxszxtbevo gxszxtbevoVar = (dk.gxszxtbevo) obj;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(nufgyqmvbu(), gxszxtbevoVar.nufgyqmvbu())) {
                lmojexxdyd lmojexxdydVar = (lmojexxdyd) obj;
                if (lmojexxdydVar.isInline() && Arrays.equals(zdlpuopuiu(), lmojexxdydVar.zdlpuopuiu()) && wkgbmnqykc() == gxszxtbevoVar.wkgbmnqykc()) {
                    int iWkgbmnqykc = wkgbmnqykc();
                    for (int i13 = 0; i13 < iWkgbmnqykc; i13++) {
                        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(lqeggnwhkg(i13).nufgyqmvbu(), gxszxtbevoVar.lqeggnwhkg(i13).nufgyqmvbu()) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(lqeggnwhkg(i13).getKind(), gxszxtbevoVar.lqeggnwhkg(i13).getKind())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // fk.iyctptxqzt
    public int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // fk.iyctptxqzt, dk.gxszxtbevo
    public boolean isInline() {
        return this.f34199wflxmlrfwp;
    }
}
