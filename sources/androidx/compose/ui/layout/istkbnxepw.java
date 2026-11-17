package androidx.compose.ui.layout;

import androidx.compose.runtime.b0;
import z.pkzmftpjix;

/* JADX INFO: loaded from: classes.dex */
public final class istkbnxepw {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final int f6505gxszxtbevo = 8;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final tg.rgvfuqvkyq f6506eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final cdpycssgdh f6507iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final tg.rgvfuqvkyq f6508ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final tg.rgvfuqvkyq f6509wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private btonecajqb f6510zoijcleaow;

    static final class eablkybsjg extends kotlin.jvm.internal.jyumaefscl implements tg.rgvfuqvkyq {
        eablkybsjg() {
            super(2);
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            iobyxmoadg((pkzmftpjix) obj, (istkbnxepw) obj2);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(pkzmftpjix pkzmftpjixVar, istkbnxepw istkbnxepwVar) {
            istkbnxepw istkbnxepwVar2 = istkbnxepw.this;
            btonecajqb btonecajqbVarDvvnrvtcbc = pkzmftpjixVar.dvvnrvtcbc();
            if (btonecajqbVarDvvnrvtcbc == null) {
                btonecajqbVarDvvnrvtcbc = new btonecajqb(pkzmftpjixVar, istkbnxepw.this.f6507iobyxmoadg);
                pkzmftpjixVar.i0(btonecajqbVarDvvnrvtcbc);
            }
            istkbnxepwVar2.f6510zoijcleaow = btonecajqbVarDvvnrvtcbc;
            istkbnxepw.this.dxjokdxxww().wwaezpbzkn();
            istkbnxepw.this.dxjokdxxww().tzroggbefp(istkbnxepw.this.f6507iobyxmoadg);
        }
    }

    public interface iobyxmoadg {
        zoijcleaow apply();

        void cancel();

        boolean iobyxmoadg();

        boolean zoijcleaow(b0 b0Var);
    }

    static final class ppxfxbqfkf extends kotlin.jvm.internal.jyumaefscl implements tg.rgvfuqvkyq {
        ppxfxbqfkf() {
            super(2);
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            iobyxmoadg((pkzmftpjix) obj, (androidx.compose.runtime.cqumvgiudr) obj2);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(pkzmftpjix pkzmftpjixVar, androidx.compose.runtime.cqumvgiudr cqumvgiudrVar) {
            istkbnxepw.this.dxjokdxxww().kegysxyocb(cqumvgiudrVar);
        }
    }

    static final class wkgbmnqykc extends kotlin.jvm.internal.jyumaefscl implements tg.rgvfuqvkyq {
        wkgbmnqykc() {
            super(2);
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            iobyxmoadg((pkzmftpjix) obj, (tg.rgvfuqvkyq) obj2);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(pkzmftpjix pkzmftpjixVar, tg.rgvfuqvkyq rgvfuqvkyqVar) {
            pkzmftpjixVar.wflxmlrfwp(istkbnxepw.this.dxjokdxxww().iwizpuwonk(rgvfuqvkyqVar));
        }
    }

    public interface zoijcleaow {
        default void eablkybsjg(int i13, long j13) {
        }

        void iobyxmoadg();

        default long ppxfxbqfkf(int i13) {
            return w0.oxmwwwfdhm.f118270zoijcleaow.iobyxmoadg();
        }

        default void wkgbmnqykc(Object obj, tg.draadjrbmk draadjrbmkVar) {
        }

        default int zoijcleaow() {
            return 0;
        }
    }

    public istkbnxepw(cdpycssgdh cdpycssgdhVar) {
        this.f6507iobyxmoadg = cdpycssgdhVar;
        this.f6508ppxfxbqfkf = new eablkybsjg();
        this.f6509wkgbmnqykc = new ppxfxbqfkf();
        this.f6506eablkybsjg = new wkgbmnqykc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final btonecajqb dxjokdxxww() {
        btonecajqb btonecajqbVar = this.f6510zoijcleaow;
        if (btonecajqbVar != null) {
            return btonecajqbVar;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }

    public final zoijcleaow btonecajqb(Object obj, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        return dxjokdxxww().hkdspvbjdz(obj, rgvfuqvkyqVar);
    }

    public final void eablkybsjg() {
        dxjokdxxww().yadqdtsiqt();
    }

    public final tg.rgvfuqvkyq gxszxtbevo() {
        return this.f6509wkgbmnqykc;
    }

    public final tg.rgvfuqvkyq lqeggnwhkg() {
        return this.f6506eablkybsjg;
    }

    public final tg.rgvfuqvkyq nufgyqmvbu() {
        return this.f6508ppxfxbqfkf;
    }

    public final iobyxmoadg wkgbmnqykc(Object obj, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        return dxjokdxxww().dsvhmnatus(obj, rgvfuqvkyqVar);
    }

    public istkbnxepw() {
        this(wflxmlrfwp.f6548iobyxmoadg);
    }
}
