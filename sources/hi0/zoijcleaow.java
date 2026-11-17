package hi0;

import java.io.File;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import ru.myspar.networkpanel.impl.domain.model.NetworkPayload;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final fi0.iobyxmoadg f40449zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f40450iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final ei0.zoijcleaow f40451zoijcleaow;

        public iobyxmoadg(String networkId, ei0.zoijcleaow type) {
            zdlpuopuiu.btonecajqb(networkId, "networkId");
            zdlpuopuiu.btonecajqb(type, "type");
            this.f40450iobyxmoadg = networkId;
            this.f40451zoijcleaow = type;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            return zdlpuopuiu.eablkybsjg(this.f40450iobyxmoadg, iobyxmoadgVar.f40450iobyxmoadg) && this.f40451zoijcleaow == iobyxmoadgVar.f40451zoijcleaow;
        }

        public int hashCode() {
            return (this.f40450iobyxmoadg.hashCode() * 31) + this.f40451zoijcleaow.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f40450iobyxmoadg;
        }

        public String toString() {
            return "Params(networkId=" + this.f40450iobyxmoadg + ", type=" + this.f40451zoijcleaow + ")";
        }

        public final ei0.zoijcleaow zoijcleaow() {
            return this.f40451zoijcleaow;
        }
    }

    /* JADX INFO: renamed from: hi0.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    static final class C0936zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f40452iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f40454yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f40455zdlpuopuiu;

        C0936zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f40454yggfygwlhe = obj;
            this.f40452iwizpuwonk |= Integer.MIN_VALUE;
            return zoijcleaow.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(fi0.iobyxmoadg networkItemsRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(networkItemsRepository, "networkItemsRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f40449zoijcleaow = networkItemsRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
        C0936zoijcleaow c0936zoijcleaow;
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof C0936zoijcleaow) {
            c0936zoijcleaow = (C0936zoijcleaow) gxszxtbevoVar;
            int i13 = c0936zoijcleaow.f40452iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0936zoijcleaow.f40452iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                c0936zoijcleaow = new C0936zoijcleaow(gxszxtbevoVar);
            }
        } else {
            c0936zoijcleaow = new C0936zoijcleaow(gxszxtbevoVar);
        }
        Object objEablkybsjg = c0936zoijcleaow.f40454yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = c0936zoijcleaow.f40452iwizpuwonk;
        if (i14 != 0) {
            if (i14 == 1) {
                zoijcleaowVar = (zoijcleaow) c0936zoijcleaow.f40455zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
            }
            return (File) objEablkybsjg;
        }
        gg.zdlpuopuiu.zoijcleaow(objEablkybsjg);
        fi0.iobyxmoadg iobyxmoadgVar2 = this.f40449zoijcleaow;
        String strIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
        ei0.zoijcleaow zoijcleaowVarZoijcleaow = iobyxmoadgVar.zoijcleaow();
        c0936zoijcleaow.f40455zdlpuopuiu = this;
        c0936zoijcleaow.f40452iwizpuwonk = 1;
        objEablkybsjg = iobyxmoadgVar2.eablkybsjg(strIobyxmoadg, zoijcleaowVarZoijcleaow, c0936zoijcleaow);
        if (objEablkybsjg == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        zoijcleaowVar = this;
        NetworkPayload networkPayload = (NetworkPayload) objEablkybsjg;
        if (networkPayload == null) {
            return null;
        }
        fi0.iobyxmoadg iobyxmoadgVar3 = zoijcleaowVar.f40449zoijcleaow;
        c0936zoijcleaow.f40455zdlpuopuiu = null;
        c0936zoijcleaow.f40452iwizpuwonk = 2;
        objEablkybsjg = iobyxmoadgVar3.ppxfxbqfkf(networkPayload, c0936zoijcleaow);
        if (objEablkybsjg == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        return (File) objEablkybsjg;
    }
}
