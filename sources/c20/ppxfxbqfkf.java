package c20;

import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final ca2.iobyxmoadg f18581eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final zv.iobyxmoadg f18582gxszxtbevo;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ca2.wkgbmnqykc f18583ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final y10.iobyxmoadg f18584wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final v10.zoijcleaow f18585zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f18586iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f18587ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f18588zoijcleaow;

        public iobyxmoadg(String phone, String token, String code) {
            zdlpuopuiu.btonecajqb(phone, "phone");
            zdlpuopuiu.btonecajqb(token, "token");
            zdlpuopuiu.btonecajqb(code, "code");
            this.f18586iobyxmoadg = phone;
            this.f18588zoijcleaow = token;
            this.f18587ppxfxbqfkf = code;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f18586iobyxmoadg, iobyxmoadgVar.f18586iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f18588zoijcleaow, iobyxmoadgVar.f18588zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f18587ppxfxbqfkf, iobyxmoadgVar.f18587ppxfxbqfkf);
        }

        public int hashCode() {
            return (((this.f18586iobyxmoadg.hashCode() * 31) + this.f18588zoijcleaow.hashCode()) * 31) + this.f18587ppxfxbqfkf.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f18587ppxfxbqfkf;
        }

        public final String ppxfxbqfkf() {
            return this.f18588zoijcleaow;
        }

        public String toString() {
            return "Params(phone=" + this.f18586iobyxmoadg + ", token=" + this.f18588zoijcleaow + ", code=" + this.f18587ppxfxbqfkf + ")";
        }

        public final String zoijcleaow() {
            return this.f18586iobyxmoadg;
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        Object f18589cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        Object f18590esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        Object f18591iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f18592jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        /* synthetic */ Object f18593lereixgezr;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f18595yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f18596zdlpuopuiu;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        int f18597zynmafqrjb;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f18593lereixgezr = obj;
            this.f18597zynmafqrjb |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(v10.zoijcleaow sharedPreferencesRepository, ca2.wkgbmnqykc userSharedPreferences, y10.iobyxmoadg authRemoteSource, ca2.iobyxmoadg deviceUtils, zv.iobyxmoadg notificationsRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(sharedPreferencesRepository, "sharedPreferencesRepository");
        zdlpuopuiu.btonecajqb(userSharedPreferences, "userSharedPreferences");
        zdlpuopuiu.btonecajqb(authRemoteSource, "authRemoteSource");
        zdlpuopuiu.btonecajqb(deviceUtils, "deviceUtils");
        zdlpuopuiu.btonecajqb(notificationsRepository, "notificationsRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f18585zoijcleaow = sharedPreferencesRepository;
        this.f18583ppxfxbqfkf = userSharedPreferences;
        this.f18584wkgbmnqykc = authRemoteSource;
        this.f18581eablkybsjg = deviceUtils;
        this.f18582gxszxtbevo = notificationsRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:29:0x00cb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        ppxfxbqfkf ppxfxbqfkfVar;
        ppxfxbqfkf ppxfxbqfkfVar2;
        y10.iobyxmoadg iobyxmoadgVar2;
        String str;
        String str2;
        String str3;
        String str4;
        ppxfxbqfkf ppxfxbqfkfVar3;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f18597zynmafqrjb;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f18597zynmafqrjb = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        zoijcleaow zoijcleaowVar2 = zoijcleaowVar;
        Object objNufgyqmvbu = zoijcleaowVar2.f18593lereixgezr;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar2.f18597zynmafqrjb;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar = (iobyxmoadg) zoijcleaowVar2.f18595yggfygwlhe;
                ppxfxbqfkfVar = (ppxfxbqfkf) zoijcleaowVar2.f18596zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objNufgyqmvbu);
            } else if (i14 == 2) {
                String str5 = (String) zoijcleaowVar2.f18590esjtqupxsv;
                String str6 = (String) zoijcleaowVar2.f18589cqumvgiudr;
                str3 = (String) zoijcleaowVar2.f18591iwizpuwonk;
                y10.iobyxmoadg iobyxmoadgVar3 = (y10.iobyxmoadg) zoijcleaowVar2.f18592jyumaefscl;
                String str7 = (String) zoijcleaowVar2.f18595yggfygwlhe;
                ppxfxbqfkf ppxfxbqfkfVar4 = (ppxfxbqfkf) zoijcleaowVar2.f18596zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objNufgyqmvbu);
                ppxfxbqfkfVar2 = ppxfxbqfkfVar4;
                str = str5;
                str2 = str7;
                str4 = str6;
                iobyxmoadgVar2 = iobyxmoadgVar3;
                zoijcleaowVar2.f18596zdlpuopuiu = ppxfxbqfkfVar2;
                zoijcleaowVar2.f18595yggfygwlhe = str2;
                zoijcleaowVar2.f18592jyumaefscl = null;
                zoijcleaowVar2.f18591iwizpuwonk = null;
                zoijcleaowVar2.f18589cqumvgiudr = null;
                zoijcleaowVar2.f18590esjtqupxsv = null;
                zoijcleaowVar2.f18597zynmafqrjb = 3;
                objNufgyqmvbu = iobyxmoadgVar2.zoijcleaow(str3, str2, (String) objNufgyqmvbu, str4, str, zoijcleaowVar2);
                if (objNufgyqmvbu == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                ppxfxbqfkfVar3 = ppxfxbqfkfVar2;
            } else {
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (String) zoijcleaowVar2.f18595yggfygwlhe;
                ppxfxbqfkfVar3 = (ppxfxbqfkf) zoijcleaowVar2.f18596zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objNufgyqmvbu);
            }
            t10.eablkybsjg eablkybsjgVar = (t10.eablkybsjg) objNufgyqmvbu;
            ppxfxbqfkfVar3.f18583ppxfxbqfkf.gxszxtbevo(eablkybsjgVar.iobyxmoadg());
            ppxfxbqfkfVar3.f18585zoijcleaow.wkgbmnqykc(false);
            ppxfxbqfkfVar3.f18582gxszxtbevo.gxszxtbevo(str2, true);
            return eablkybsjgVar;
        }
        gg.zdlpuopuiu.zoijcleaow(objNufgyqmvbu);
        zv.iobyxmoadg iobyxmoadgVar4 = this.f18582gxszxtbevo;
        zoijcleaowVar2.f18596zdlpuopuiu = this;
        zoijcleaowVar2.f18595yggfygwlhe = iobyxmoadgVar;
        zoijcleaowVar2.f18597zynmafqrjb = 1;
        objNufgyqmvbu = iobyxmoadgVar4.nufgyqmvbu(zoijcleaowVar2);
        if (objNufgyqmvbu == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        ppxfxbqfkfVar = this;
        String str8 = (String) objNufgyqmvbu;
        y10.iobyxmoadg iobyxmoadgVar5 = ppxfxbqfkfVar.f18584wkgbmnqykc;
        String strZoijcleaow = iobyxmoadgVar.zoijcleaow();
        String strPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
        String strIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
        ca2.iobyxmoadg iobyxmoadgVar6 = ppxfxbqfkfVar.f18581eablkybsjg;
        zoijcleaowVar2.f18596zdlpuopuiu = ppxfxbqfkfVar;
        zoijcleaowVar2.f18595yggfygwlhe = str8;
        zoijcleaowVar2.f18592jyumaefscl = iobyxmoadgVar5;
        zoijcleaowVar2.f18591iwizpuwonk = strZoijcleaow;
        zoijcleaowVar2.f18589cqumvgiudr = strPpxfxbqfkf;
        zoijcleaowVar2.f18590esjtqupxsv = strIobyxmoadg;
        zoijcleaowVar2.f18597zynmafqrjb = 2;
        Object objIobyxmoadg = iobyxmoadgVar6.iobyxmoadg(zoijcleaowVar2);
        if (objIobyxmoadg == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        ppxfxbqfkfVar2 = ppxfxbqfkfVar;
        iobyxmoadgVar2 = iobyxmoadgVar5;
        str = strIobyxmoadg;
        str2 = str8;
        objNufgyqmvbu = objIobyxmoadg;
        str3 = strZoijcleaow;
        str4 = strPpxfxbqfkf;
        zoijcleaowVar2.f18596zdlpuopuiu = ppxfxbqfkfVar2;
        zoijcleaowVar2.f18595yggfygwlhe = str2;
        zoijcleaowVar2.f18592jyumaefscl = null;
        zoijcleaowVar2.f18591iwizpuwonk = null;
        zoijcleaowVar2.f18589cqumvgiudr = null;
        zoijcleaowVar2.f18590esjtqupxsv = null;
        zoijcleaowVar2.f18597zynmafqrjb = 3;
        objNufgyqmvbu = iobyxmoadgVar2.zoijcleaow(str3, str2, (String) objNufgyqmvbu, str4, str, zoijcleaowVar2);
        if (objNufgyqmvbu == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        ppxfxbqfkfVar3 = ppxfxbqfkfVar2;
        t10.eablkybsjg eablkybsjgVar2 = (t10.eablkybsjg) objNufgyqmvbu;
        ppxfxbqfkfVar3.f18583ppxfxbqfkf.gxszxtbevo(eablkybsjgVar2.iobyxmoadg());
        ppxfxbqfkfVar3.f18585zoijcleaow.wkgbmnqykc(false);
        ppxfxbqfkfVar3.f18582gxszxtbevo.gxszxtbevo(str2, true);
        return eablkybsjgVar2;
    }
}
