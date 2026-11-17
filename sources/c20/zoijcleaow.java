package c20;

import gg.cqumvgiudr;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.core.error_handler.exceptions.ExistingUserException;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final y10.ppxfxbqfkf f18600zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f18601iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f18602zoijcleaow;

        public iobyxmoadg(String phone, String email) {
            zdlpuopuiu.btonecajqb(phone, "phone");
            zdlpuopuiu.btonecajqb(email, "email");
            this.f18601iobyxmoadg = phone;
            this.f18602zoijcleaow = email;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f18601iobyxmoadg, iobyxmoadgVar.f18601iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f18602zoijcleaow, iobyxmoadgVar.f18602zoijcleaow);
        }

        public int hashCode() {
            return (this.f18601iobyxmoadg.hashCode() * 31) + this.f18602zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f18602zoijcleaow;
        }

        public String toString() {
            return "Params(phone=" + this.f18601iobyxmoadg + ", email=" + this.f18602zoijcleaow + ")";
        }

        public final String zoijcleaow() {
            return this.f18601iobyxmoadg;
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f18603iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f18605yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        boolean f18606zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f18605yggfygwlhe = obj;
            this.f18603iwizpuwonk |= Integer.MIN_VALUE;
            return zoijcleaow.this.eablkybsjg(null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: c20.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    static final class C0338zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f18607cqumvgiudr;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        /* synthetic */ Object f18609jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f18610yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f18611zdlpuopuiu;

        C0338zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f18609jyumaefscl = obj;
            this.f18607cqumvgiudr |= Integer.MIN_VALUE;
            return zoijcleaow.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(y10.ppxfxbqfkf registrationRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(registrationRemoteSource, "registrationRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f18600zoijcleaow = registrationRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object eablkybsjg(String str, String str2, boolean z13, lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f18603iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f18603iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = ppxfxbqfkfVar.f18605yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f18603iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            y10.ppxfxbqfkf ppxfxbqfkfVar2 = this.f18600zoijcleaow;
            ppxfxbqfkfVar.f18606zdlpuopuiu = z13;
            ppxfxbqfkfVar.f18603iwizpuwonk = 1;
            objPpxfxbqfkf = ppxfxbqfkfVar2.ppxfxbqfkf(str, str2, ppxfxbqfkfVar);
            if (objPpxfxbqfkf == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z13 = ppxfxbqfkfVar.f18606zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
        }
        return cqumvgiudr.iobyxmoadg(objPpxfxbqfkf, kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(z13));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) throws ExistingUserException {
        C0338zoijcleaow c0338zoijcleaow;
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof C0338zoijcleaow) {
            c0338zoijcleaow = (C0338zoijcleaow) gxszxtbevoVar;
            int i13 = c0338zoijcleaow.f18607cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0338zoijcleaow.f18607cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                c0338zoijcleaow = new C0338zoijcleaow(gxszxtbevoVar);
            }
        } else {
            c0338zoijcleaow = new C0338zoijcleaow(gxszxtbevoVar);
        }
        Object objZoijcleaow = c0338zoijcleaow.f18609jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c0338zoijcleaow.f18607cqumvgiudr;
        if (i14 != 0) {
            if (i14 == 1) {
                iobyxmoadgVar = (iobyxmoadg) c0338zoijcleaow.f18610yggfygwlhe;
                zoijcleaowVar = (zoijcleaow) c0338zoijcleaow.f18611zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
            }
        }
        gg.zdlpuopuiu.zoijcleaow(objZoijcleaow);
        y10.ppxfxbqfkf ppxfxbqfkfVar = this.f18600zoijcleaow;
        String strZoijcleaow = iobyxmoadgVar.zoijcleaow();
        c0338zoijcleaow.f18611zdlpuopuiu = this;
        c0338zoijcleaow.f18610yggfygwlhe = iobyxmoadgVar;
        c0338zoijcleaow.f18607cqumvgiudr = 1;
        objZoijcleaow = ppxfxbqfkfVar.zoijcleaow(strZoijcleaow, c0338zoijcleaow);
        if (objZoijcleaow == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        zoijcleaowVar = this;
        t10.zoijcleaow zoijcleaowVar2 = (t10.zoijcleaow) objZoijcleaow;
        if (zoijcleaowVar2.zoijcleaow()) {
            throw new ExistingUserException();
        }
        String strZoijcleaow2 = iobyxmoadgVar.zoijcleaow();
        String strIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
        boolean zIobyxmoadg = zoijcleaowVar2.iobyxmoadg();
        c0338zoijcleaow.f18611zdlpuopuiu = null;
        c0338zoijcleaow.f18610yggfygwlhe = null;
        c0338zoijcleaow.f18607cqumvgiudr = 2;
        objZoijcleaow = zoijcleaowVar.eablkybsjg(strZoijcleaow2, strIobyxmoadg, zIobyxmoadg, c0338zoijcleaow);
        return objZoijcleaow == objGxszxtbevo ? objGxszxtbevo : objZoijcleaow;
    }
}
