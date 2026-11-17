package b4;

import t3.dsvhmnatus;
import t3.hcddaimhww;
import t3.oxmwwwfdhm;
import t3.pkzmftpjix;
import t3.pmvmpeiblj;

/* JADX INFO: loaded from: classes.dex */
public final class eablkybsjg implements oxmwwwfdhm {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final oxmwwwfdhm f15094yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final long f15095zdlpuopuiu;

    class iobyxmoadg extends pmvmpeiblj {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ pkzmftpjix f15097zoijcleaow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(pkzmftpjix pkzmftpjixVar, pkzmftpjix pkzmftpjixVar2) {
            super(pkzmftpjixVar);
            this.f15097zoijcleaow = pkzmftpjixVar2;
        }

        @Override // t3.pmvmpeiblj, t3.pkzmftpjix
        public pkzmftpjix.iobyxmoadg wkgbmnqykc(long j13) {
            pkzmftpjix.iobyxmoadg iobyxmoadgVarWkgbmnqykc = this.f15097zoijcleaow.wkgbmnqykc(j13);
            hcddaimhww hcddaimhwwVar = iobyxmoadgVarWkgbmnqykc.f109526iobyxmoadg;
            hcddaimhww hcddaimhwwVar2 = new hcddaimhww(hcddaimhwwVar.f109432iobyxmoadg, hcddaimhwwVar.f109433zoijcleaow + eablkybsjg.this.f15095zdlpuopuiu);
            hcddaimhww hcddaimhwwVar3 = iobyxmoadgVarWkgbmnqykc.f109527zoijcleaow;
            return new pkzmftpjix.iobyxmoadg(hcddaimhwwVar2, new hcddaimhww(hcddaimhwwVar3.f109432iobyxmoadg, hcddaimhwwVar3.f109433zoijcleaow + eablkybsjg.this.f15095zdlpuopuiu));
        }
    }

    public eablkybsjg(long j13, oxmwwwfdhm oxmwwwfdhmVar) {
        this.f15095zdlpuopuiu = j13;
        this.f15094yggfygwlhe = oxmwwwfdhmVar;
    }

    @Override // t3.oxmwwwfdhm
    public void agtfadlqog() {
        this.f15094yggfygwlhe.agtfadlqog();
    }

    @Override // t3.oxmwwwfdhm
    public void gxszxtbevo(pkzmftpjix pkzmftpjixVar) {
        this.f15094yggfygwlhe.gxszxtbevo(new iobyxmoadg(pkzmftpjixVar, pkzmftpjixVar));
    }

    @Override // t3.oxmwwwfdhm
    public dsvhmnatus kcexrzcfyt(int i13, int i14) {
        return this.f15094yggfygwlhe.kcexrzcfyt(i13, i14);
    }
}
