package r20;

import java.util.Arrays;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.tzroggbefp;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import ru.myspar.user.models.User;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final C1818iobyxmoadg f81474ppxfxbqfkf = new C1818iobyxmoadg(null);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ca2.ppxfxbqfkf f81475zoijcleaow;

    /* JADX INFO: renamed from: r20.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1818iobyxmoadg {
        public /* synthetic */ C1818iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C1818iobyxmoadg() {
        }
    }

    static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f81476iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f81478yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f81479zdlpuopuiu;

        ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f81478yggfygwlhe = obj;
            this.f81476iwizpuwonk |= Integer.MIN_VALUE;
            return iobyxmoadg.this.iobyxmoadg(null, this);
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f81480iobyxmoadg;

        public zoijcleaow(String reference) {
            zdlpuopuiu.btonecajqb(reference, "reference");
            this.f81480iobyxmoadg = reference;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f81480iobyxmoadg, ((zoijcleaow) obj).f81480iobyxmoadg);
        }

        public int hashCode() {
            return this.f81480iobyxmoadg.hashCode();
        }

        public final String iobyxmoadg() {
            return this.f81480iobyxmoadg;
        }

        public String toString() {
            return "Params(reference=" + this.f81480iobyxmoadg + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(ca2.ppxfxbqfkf userRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(userRepository, "userRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f81475zoijcleaow = userRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(zoijcleaow zoijcleaowVar, gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f81476iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f81476iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object objLqeggnwhkg = ppxfxbqfkfVar.f81478yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f81476iwizpuwonk;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
            ca2.ppxfxbqfkf ppxfxbqfkfVar2 = this.f81475zoijcleaow;
            ppxfxbqfkfVar.f81479zdlpuopuiu = zoijcleaowVar;
            ppxfxbqfkfVar.f81476iwizpuwonk = 1;
            objLqeggnwhkg = ppxfxbqfkfVar2.lqeggnwhkg(ppxfxbqfkfVar);
            if (objLqeggnwhkg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zoijcleaowVar = (zoijcleaow) ppxfxbqfkfVar.f81479zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
        }
        User user = (User) objLqeggnwhkg;
        String gameToken = user != null ? user.getGameToken() : null;
        if (gameToken == null) {
            gameToken = "";
        }
        String str = (zoijcleaowVar.iobyxmoadg().length() <= 0 || gameToken.length() <= 0) ? null : "%s?token=%s";
        if (str == null) {
            return null;
        }
        tzroggbefp tzroggbefpVar = tzroggbefp.f60034iobyxmoadg;
        String str2 = String.format(str, Arrays.copyOf(new Object[]{zoijcleaowVar.iobyxmoadg(), gameToken}, 2));
        zdlpuopuiu.dxjokdxxww(str2, "format(...)");
        return str2;
    }
}
