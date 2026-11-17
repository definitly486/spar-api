package if0;

import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import l40.ppxfxbqfkf;
import lk.cdpycssgdh;
import lk.iwizpuwonk;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements iwizpuwonk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f42482iobyxmoadg;

    /* JADX INFO: renamed from: if0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public /* synthetic */ class C1001iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f42483iobyxmoadg;

        static {
            int[] iArr = new int[ppxfxbqfkf.values().length];
            try {
                iArr[ppxfxbqfkf.PROD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ppxfxbqfkf.PREPROD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ppxfxbqfkf.DEV.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ppxfxbqfkf.TEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ppxfxbqfkf.TEAMPROFI.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f42483iobyxmoadg = iArr;
        }
    }

    public iobyxmoadg(p20.iobyxmoadg getCurrentApiEndPointUseCase) {
        String strCrxdokpmqz;
        zdlpuopuiu.btonecajqb(getCurrentApiEndPointUseCase, "getCurrentApiEndPointUseCase");
        int i13 = C1001iobyxmoadg.f42483iobyxmoadg[((ppxfxbqfkf) getCurrentApiEndPointUseCase.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).ordinal()];
        if (i13 == 1) {
            strCrxdokpmqz = xx.iobyxmoadg.f123319iobyxmoadg.crxdokpmqz();
        } else if (i13 == 2) {
            strCrxdokpmqz = xx.iobyxmoadg.f123319iobyxmoadg.sopmlzcsov();
        } else if (i13 == 3) {
            strCrxdokpmqz = xx.iobyxmoadg.f123319iobyxmoadg.ulzqkzuiru();
        } else if (i13 == 4) {
            strCrxdokpmqz = xx.iobyxmoadg.f123319iobyxmoadg.jlmebxxoox();
        } else {
            if (i13 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            strCrxdokpmqz = xx.iobyxmoadg.f123319iobyxmoadg.ntlheqmsrt();
        }
        this.f42482iobyxmoadg = strCrxdokpmqz;
    }

    @Override // lk.iwizpuwonk
    public cdpycssgdh intercept(iwizpuwonk.iobyxmoadg chain) {
        zdlpuopuiu.btonecajqb(chain, "chain");
        return chain.zoijcleaow(chain.dxjokdxxww().nufgyqmvbu().iobyxmoadg("X-Auth-Token", this.f42482iobyxmoadg).zoijcleaow());
    }
}
